package z7;
public final class s implements w {
    public final int f48922a;

    public s(int i10) {
        this.f48922a = i10;
    }

    @Override
    public final Class annotationType() {
        return w.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                if (this.f48922a == ((s) ((w) obj)).f48922a) {
                    Object obj2 = v.f48952a;
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
        return (this.f48922a ^ 14552422) + (v.f48952a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f48922a + "intEncoding=" + v.f48952a + ')';
    }
}
