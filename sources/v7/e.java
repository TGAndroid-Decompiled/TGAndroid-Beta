package v7;
public final class e implements h {
    public final int f43984a;

    public e(int i10) {
        this.f43984a = i10;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f43984a == ((e) ((h) obj)).f43984a) {
                    Object obj2 = g.f44006a;
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
        return (this.f43984a ^ 14552422) + (g.f44006a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f43984a + "intEncoding=" + g.f44006a + ')';
    }
}
