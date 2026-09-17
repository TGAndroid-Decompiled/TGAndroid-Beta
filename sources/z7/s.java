package z7;
public final class s implements w {
    public final int f48625a;

    public s(int i10) {
        this.f48625a = i10;
    }

    @Override
    public final Class annotationType() {
        return w.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                if (this.f48625a == ((s) ((w) obj)).f48625a) {
                    Object obj2 = v.f48655a;
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
        return (this.f48625a ^ 14552422) + (v.f48655a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f48625a + "intEncoding=" + v.f48655a + ')';
    }
}
