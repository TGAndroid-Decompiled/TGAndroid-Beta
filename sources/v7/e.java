package v7;
public final class e implements h {
    public final int f48013a;

    public e(int i10) {
        this.f48013a = i10;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f48013a == ((e) ((h) obj)).f48013a) {
                    Object obj2 = g.f48035a;
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
        return (this.f48013a ^ 14552422) + (g.f48035a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f48013a + "intEncoding=" + g.f48035a + ')';
    }
}
