package z7;
public final class s implements w {
    public final int f54034a;

    public s(int i10) {
        this.f54034a = i10;
    }

    @Override
    public final Class annotationType() {
        return w.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                if (this.f54034a == ((s) ((w) obj)).f54034a) {
                    Object obj2 = v.f54064a;
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
        return (this.f54034a ^ 14552422) + (v.f54064a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f54034a + "intEncoding=" + v.f54064a + ')';
    }
}
