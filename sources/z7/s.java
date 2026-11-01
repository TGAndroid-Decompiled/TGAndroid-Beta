package z7;
public final class s implements w {
    public final int f55096a;

    public s(int i10) {
        this.f55096a = i10;
    }

    @Override
    public final Class annotationType() {
        return w.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                if (this.f55096a == ((s) ((w) obj)).f55096a) {
                    Object obj2 = v.f55125a;
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
        return (this.f55096a ^ 14552422) + (v.f55125a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f55096a + "intEncoding=" + v.f55125a + ')';
    }
}
