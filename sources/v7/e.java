package v7;
public final class e implements h {
    public final int f47435a;

    public e(int i10) {
        this.f47435a = i10;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f47435a == ((e) ((h) obj)).f47435a) {
                    Object obj2 = g.f47449a;
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
        return (this.f47435a ^ 14552422) + (g.f47449a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f47435a + "intEncoding=" + g.f47449a + ')';
    }
}
