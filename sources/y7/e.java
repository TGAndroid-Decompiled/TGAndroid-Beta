package y7;
public final class e implements h {
    public final int f58915a;

    public e(int i7) {
        this.f58915a = i7;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f58915a == ((e) ((h) obj)).f58915a) {
                    Object obj2 = g.f58938a;
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
        return (this.f58915a ^ 14552422) + (g.f58938a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f58915a + "intEncoding=" + g.f58938a + ')';
    }
}
