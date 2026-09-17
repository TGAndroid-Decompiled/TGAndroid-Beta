package v7;
public final class e implements h {
    public final int f43979a;

    public e(int i10) {
        this.f43979a = i10;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f43979a == ((e) ((h) obj)).f43979a) {
                    Object obj2 = g.f44001a;
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
        return (this.f43979a ^ 14552422) + (g.f44001a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f43979a + "intEncoding=" + g.f44001a + ')';
    }
}
