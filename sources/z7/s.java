package z7;
public final class s implements w {
    public final int f54127a;

    public s(int i10) {
        this.f54127a = i10;
    }

    @Override
    public final Class annotationType() {
        return w.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                if (this.f54127a == ((s) ((w) obj)).f54127a) {
                    Object obj2 = v.f54156a;
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
        return (this.f54127a ^ 14552422) + (v.f54156a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f54127a + "intEncoding=" + v.f54156a + ')';
    }
}
