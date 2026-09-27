package z7;
public final class s implements w {
    public final int f48917a;

    public s(int i10) {
        this.f48917a = i10;
    }

    @Override
    public final Class annotationType() {
        return w.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                if (this.f48917a == ((s) ((w) obj)).f48917a) {
                    Object obj2 = v.f48947a;
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
        return (this.f48917a ^ 14552422) + (v.f48947a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f48917a + "intEncoding=" + v.f48947a + ')';
    }
}
