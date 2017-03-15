package weather.model.queries;

/**
 *
 */

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
