package x7;
public final class z implements c0 {
    public final int f51280a;

    public z(int i10) {
        this.f51280a = i10;
    }

    @Override
    public final Class annotationType() {
        return c0.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c0) {
                if (this.f51280a == ((z) ((c0) obj)).f51280a) {
                    Object obj2 = b0.f50941a;
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
        return (this.f51280a ^ 14552422) + (b0.f50941a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f51280a + "intEncoding=" + b0.f50941a + ')';
    }
}
