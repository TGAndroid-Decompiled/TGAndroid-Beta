package z7;
public final class s implements w {
    public final int f54264a;

    public s(int i10) {
        this.f54264a = i10;
    }

    @Override
    public final Class annotationType() {
        return w.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                if (this.f54264a == ((s) ((w) obj)).f54264a) {
                    Object obj2 = v.f54293a;
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
        return (this.f54264a ^ 14552422) + (v.f54293a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f54264a + "intEncoding=" + v.f54293a + ')';
    }
}
