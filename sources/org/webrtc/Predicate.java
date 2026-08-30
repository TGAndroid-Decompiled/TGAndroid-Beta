package org.webrtc;
public interface Predicate<T> {

    public abstract class CC {
        public static Predicate a(final Predicate predicate, final Predicate predicate2) {
            return new Predicate() {
                @Override
                public final Predicate and(Predicate predicate3) {
                    return CC.a(this, predicate3);
                }

                @Override
                public final Predicate negate() {
                    return CC.b(this);
                }

                @Override
                public final Predicate or(Predicate predicate3) {
                    return CC.c(this, predicate3);
                }

                @Override
                public boolean test(Object obj) {
                    if (Predicate.this.test(obj) && predicate2.test(obj)) {
                        return true;
                    }
                    return false;
                }
            };
        }

        public static Predicate b(final Predicate predicate) {
            return new Predicate() {
                @Override
                public final Predicate and(Predicate predicate2) {
                    return CC.a(this, predicate2);
                }

                @Override
                public final Predicate negate() {
                    return CC.b(this);
                }

                @Override
                public final Predicate or(Predicate predicate2) {
                    return CC.c(this, predicate2);
                }

                @Override
                public boolean test(Object obj) {
                    return !Predicate.this.test(obj);
                }
            };
        }

        public static Predicate c(final Predicate predicate, final Predicate predicate2) {
            return new Predicate() {
                @Override
                public final Predicate and(Predicate predicate3) {
                    return CC.a(this, predicate3);
                }

                @Override
                public final Predicate negate() {
                    return CC.b(this);
                }

                @Override
                public final Predicate or(Predicate predicate3) {
                    return CC.c(this, predicate3);
                }

                @Override
                public boolean test(Object obj) {
                    if (!Predicate.this.test(obj) && !predicate2.test(obj)) {
                        return false;
                    }
                    return true;
                }
            };
        }
    }

    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    Predicate<T> or(Predicate<? super T> predicate);

    boolean test(T t6);
}
