package org.webrtc;
public interface Predicate<T> {

    class AnonymousClass1 implements Predicate {
        final Predicate val$other;

        public AnonymousClass1(Predicate predicate) {
            this.val$other = predicate;
        }

        @Override
        public final Predicate and(Predicate predicate) {
            return new AnonymousClass2(predicate);
        }

        @Override
        public final Predicate negate() {
            return new AnonymousClass3();
        }

        @Override
        public final Predicate or(Predicate predicate) {
            return new AnonymousClass1(predicate);
        }

        @Override
        public boolean test(Object obj) {
            if (!Predicate.this.test(obj) && !this.val$other.test(obj)) {
                return false;
            }
            return true;
        }
    }

    class AnonymousClass2 implements Predicate {
        final Predicate val$other;

        public AnonymousClass2(Predicate predicate) {
            this.val$other = predicate;
        }

        @Override
        public final Predicate and(Predicate predicate) {
            return new AnonymousClass2(predicate);
        }

        @Override
        public final Predicate negate() {
            return new AnonymousClass3();
        }

        @Override
        public final Predicate or(Predicate predicate) {
            return new AnonymousClass1(predicate);
        }

        @Override
        public boolean test(Object obj) {
            if (Predicate.this.test(obj) && this.val$other.test(obj)) {
                return true;
            }
            return false;
        }
    }

    class AnonymousClass3 implements Predicate {
        public AnonymousClass3() {
        }

        @Override
        public final Predicate and(Predicate predicate) {
            return new AnonymousClass2(predicate);
        }

        @Override
        public final Predicate negate() {
            return new AnonymousClass3();
        }

        @Override
        public final Predicate or(Predicate predicate) {
            return new AnonymousClass1(predicate);
        }

        @Override
        public boolean test(Object obj) {
            return !Predicate.this.test(obj);
        }
    }

    Predicate<T> and(Predicate<? super T> predicate);

    Predicate<T> negate();

    Predicate<T> or(Predicate<? super T> predicate);

    boolean test(T t);
}
