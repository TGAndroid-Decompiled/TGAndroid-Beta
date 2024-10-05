package org.webrtc;

public interface Predicate<T> {

    public abstract class CC {
        public static Predicate $default$and(final Predicate predicate, final Predicate predicate2) {
            return new Predicate() {
                @Override
                public Predicate and(Predicate predicate3) {
                    return CC.$default$and(this, predicate3);
                }

                @Override
                public Predicate negate() {
                    return CC.$default$negate(this);
                }

                @Override
                public Predicate or(Predicate predicate3) {
                    return CC.$default$or(this, predicate3);
                }

                @Override
                public boolean test(Object obj) {
                    return Predicate.this.test(obj) && predicate2.test(obj);
                }
            };
        }

        public static Predicate $default$negate(final Predicate predicate) {
            return new Predicate() {
                @Override
                public Predicate and(Predicate predicate2) {
                    return CC.$default$and(this, predicate2);
                }

                @Override
                public Predicate negate() {
                    return CC.$default$negate(this);
                }

                @Override
                public Predicate or(Predicate predicate2) {
                    return CC.$default$or(this, predicate2);
                }

                @Override
                public boolean test(Object obj) {
                    return !Predicate.this.test(obj);
                }
            };
        }

        public static Predicate $default$or(final Predicate predicate, final Predicate predicate2) {
            return new Predicate() {
                @Override
                public Predicate and(Predicate predicate3) {
                    return CC.$default$and(this, predicate3);
                }

                @Override
                public Predicate negate() {
                    return CC.$default$negate(this);
                }

                @Override
                public Predicate or(Predicate predicate3) {
                    return CC.$default$or(this, predicate3);
                }

                @Override
                public boolean test(Object obj) {
                    return Predicate.this.test(obj) || predicate2.test(obj);
                }
            };
        }
    }

    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    Predicate<T> or(Predicate<? super T> predicate);

    boolean test(T t);
}
