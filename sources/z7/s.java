package z7;
public final class s implements w {
    public final int f48856a;

    public s(int i10) {
        this.f48856a = i10;
    }

    @Override
    public final Class annotationType() {
        return w.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                if (this.f48856a == ((s) ((w) obj)).f48856a) {
                    Object obj2 = v.f48886a;
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
        return (this.f48856a ^ 14552422) + (v.f48886a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f48856a + "intEncoding=" + v.f48886a + ')';
    }
}
