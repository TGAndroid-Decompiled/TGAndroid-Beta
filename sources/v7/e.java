package v7;
public final class e implements h {
    public final int f48451a;

    public e(int i10) {
        this.f48451a = i10;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f48451a == ((e) ((h) obj)).f48451a) {
                    Object obj2 = g.f48473a;
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
        return (this.f48451a ^ 14552422) + (g.f48473a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f48451a + "intEncoding=" + g.f48473a + ')';
    }
}
