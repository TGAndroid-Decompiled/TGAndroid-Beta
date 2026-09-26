package z7;
public final class s implements w {
    public final int f48873a;

    public s(int i10) {
        this.f48873a = i10;
    }

    @Override
    public final Class annotationType() {
        return w.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                if (this.f48873a == ((s) ((w) obj)).f48873a) {
                    Object obj2 = v.f48903a;
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
        return (this.f48873a ^ 14552422) + (v.f48903a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f48873a + "intEncoding=" + v.f48903a + ')';
    }
}
