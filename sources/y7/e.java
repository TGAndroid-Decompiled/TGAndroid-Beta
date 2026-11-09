package y7;
public final class e implements h {
    public final int f59014a;

    public e(int i7) {
        this.f59014a = i7;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f59014a == ((e) ((h) obj)).f59014a) {
                    Object obj2 = g.f59037a;
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
        return (this.f59014a ^ 14552422) + (g.f59037a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f59014a + "intEncoding=" + g.f59037a + ')';
    }
}
