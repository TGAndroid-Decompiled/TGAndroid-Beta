package x7;
public final class z implements c0 {
    public final int f51041a;

    public z(int i10) {
        this.f51041a = i10;
    }

    @Override
    public final Class annotationType() {
        return c0.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c0) {
                if (this.f51041a == ((z) ((c0) obj)).f51041a) {
                    Object obj2 = b0.f50702a;
                    if (obj2.equals(obj2)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return (this.f51041a ^ 14552422) + (b0.f50702a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f51041a + "intEncoding=" + b0.f50702a + ')';
    }
}
