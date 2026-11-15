package y7;
public final class e implements h {
    public final int f60234a;

    public e(int i7) {
        this.f60234a = i7;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f60234a == ((e) ((h) obj)).f60234a) {
                    Object obj2 = g.f60249a;
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
        return (this.f60234a ^ 14552422) + (g.f60249a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f60234a + "intEncoding=" + g.f60249a + ')';
    }
}
