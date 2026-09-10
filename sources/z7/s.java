package z7;
public final class s implements w {
    public final int f47718a;

    public s(int i10) {
        this.f47718a = i10;
    }

    @Override
    public final Class annotationType() {
        return w.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                if (this.f47718a == ((s) ((w) obj)).f47718a) {
                    Object obj2 = v.f47748a;
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
        return (this.f47718a ^ 14552422) + (v.f47748a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f47718a + "intEncoding=" + v.f47748a + ')';
    }
}
