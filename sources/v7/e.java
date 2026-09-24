package v7;
public final class e implements h {
    public final int f44215a;

    public e(int i10) {
        this.f44215a = i10;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f44215a == ((e) ((h) obj)).f44215a) {
                    Object obj2 = g.f44246a;
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
        return (this.f44215a ^ 14552422) + (g.f44246a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f44215a + "intEncoding=" + g.f44246a + ')';
    }
}
