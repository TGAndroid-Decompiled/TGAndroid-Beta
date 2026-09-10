package v7;
public final class e implements h {
    public final int f42978a;

    public e(int i10) {
        this.f42978a = i10;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f42978a == ((e) ((h) obj)).f42978a) {
                    Object obj2 = g.f43000a;
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
        return (this.f42978a ^ 14552422) + (g.f43000a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f42978a + "intEncoding=" + g.f43000a + ')';
    }
}
