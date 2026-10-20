package z7;
public final class s implements w {
    public final int f51164a;

    public s(int i10) {
        this.f51164a = i10;
    }

    @Override
    public final Class annotationType() {
        return w.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                if (this.f51164a == ((s) ((w) obj)).f51164a) {
                    Object obj2 = v.f51195a;
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
        return (this.f51164a ^ 14552422) + (v.f51195a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f51164a + "intEncoding=" + v.f51195a + ')';
    }
}
