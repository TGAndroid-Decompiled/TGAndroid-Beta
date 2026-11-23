package y7;
public final class e implements h {
    public final int f60845a;

    public e(int i7) {
        this.f60845a = i7;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f60845a == ((e) ((h) obj)).f60845a) {
                    Object obj2 = g.f60860a;
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
        return (this.f60845a ^ 14552422) + (g.f60860a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f60845a + "intEncoding=" + g.f60860a + ')';
    }
}
