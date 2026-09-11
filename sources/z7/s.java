package z7;
public final class s implements w {
    public final int f51229a;

    public s(int i10) {
        this.f51229a = i10;
    }

    @Override
    public final Class annotationType() {
        return w.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                if (this.f51229a == ((s) ((w) obj)).f51229a) {
                    Object obj2 = v.f51259a;
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
        return (this.f51229a ^ 14552422) + (v.f51259a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f51229a + "intEncoding=" + v.f51259a + ')';
    }
}
