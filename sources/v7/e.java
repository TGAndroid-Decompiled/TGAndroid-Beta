package v7;
public final class e implements h {
    public final int f50441a;

    public e(int i10) {
        this.f50441a = i10;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f50441a == ((e) ((h) obj)).f50441a) {
                    Object obj2 = g.f50460a;
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
        return (this.f50441a ^ 14552422) + (g.f50460a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f50441a + "intEncoding=" + g.f50460a + ')';
    }
}
