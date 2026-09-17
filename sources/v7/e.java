package v7;
public final class e implements h {
    public final int f47436a;

    public e(int i10) {
        this.f47436a = i10;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f47436a == ((e) ((h) obj)).f47436a) {
                    Object obj2 = g.f47450a;
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
        return (this.f47436a ^ 14552422) + (g.f47450a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f47436a + "intEncoding=" + g.f47450a + ')';
    }
}
