package org.webrtc;

public interface Predicate<T> {
    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    Predicate<T> mo2or(Predicate<? super T> predicate);

    boolean test(T t);

    public final class CC {
        public static Predicate $default$or(final Predicate _this, final Predicate predicate) {
            return new Predicate<T>() {
                @Override
                public Predicate and(Predicate predicate2) {
                    return CC.$default$and(this, predicate2);
                }

                @Override
                public Predicate negate() {
                    return CC.$default$negate(this);
                }

                @Override
                public Predicate mo2or(Predicate predicate2) {
                    return CC.$default$or(this, predicate2);
                }

                @Override
                public boolean test(T t) {
                    return _this.test(t) || predicate.test(t);
                }
            };
        }

        public static Predicate $default$and(final Predicate _this, final Predicate predicate) {
            return new Predicate<T>() {
                @Override
                public Predicate and(Predicate predicate2) {
                    return CC.$default$and(this, predicate2);
                }

                @Override
                public Predicate negate() {
                    return CC.$default$negate(this);
                }

                @Override
                public Predicate mo2or(Predicate predicate2) {
                    return CC.$default$or(this, predicate2);
                }

                @Override
                public boolean test(T t) {
                    return _this.test(t) && predicate.test(t);
                }
            };
        }

        public static Predicate $default$negate(final Predicate _this) {
            return new Predicate<T>() {
                @Override
                public Predicate and(Predicate predicate) {
                    return CC.$default$and(this, predicate);
                }

                @Override
                public Predicate negate() {
                    return CC.$default$negate(this);
                }

                @Override
                public Predicate mo2or(Predicate predicate) {
                    return CC.$default$or(this, predicate);
                }

                @Override
                public boolean test(T t) {
                    return !_this.test(t);
                }
            };
        }
    }
}
