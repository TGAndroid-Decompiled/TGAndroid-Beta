package v7;
public final class e implements h {
    public final int f46617a;

    public e(int i10) {
        this.f46617a = i10;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f46617a == ((e) ((h) obj)).f46617a) {
                    Object obj2 = g.f46639a;
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
        return (this.f46617a ^ 14552422) + (g.f46639a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f46617a + "intEncoding=" + g.f46639a + ')';
    }
}
