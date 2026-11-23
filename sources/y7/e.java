package y7;
public final class e implements h {
    public final int f60810a;

    public e(int i7) {
        this.f60810a = i7;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f60810a == ((e) ((h) obj)).f60810a) {
                    Object obj2 = g.f60825a;
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
        return (this.f60810a ^ 14552422) + (g.f60825a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f60810a + "intEncoding=" + g.f60825a + ')';
    }
}
