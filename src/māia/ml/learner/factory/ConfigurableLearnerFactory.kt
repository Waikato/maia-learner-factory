package māia.ml.learner.factory

/*
 * TODO
 */
import māia.configure.Configurable
import māia.configure.Configuration
import māia.ml.learner.Learner

/**
 * Base class for factories which can instantiate learners from a configuration.
 *
 * @param block
 *          An initialiser block for the factory's configuration.
 * @param L
 *          The type of learner produced by this factory.
 * @param C
 *          The type of configuration of the factory.
 */
abstract class ConfigurableLearnerFactory<L : Learner<*>, out C : Configuration>(
        block : C.() -> Unit = {}
) : Configurable<C>(block) {

    /**
     * Instantiates a new learner from this factory's configuration.
     *
     * @return
     *          The learner instance.
     */
    abstract fun create() : L

}
