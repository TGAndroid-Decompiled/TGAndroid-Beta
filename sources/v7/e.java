package v7;
public final class e implements h {
    public final int f50427a;

    public e(int i10) {
        this.f50427a = i10;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f50427a == ((e) ((h) obj)).f50427a) {
                    Object obj2 = g.f50446a;
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
        return (this.f50427a ^ 14552422) + (g.f50446a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f50427a + "intEncoding=" + g.f50446a + ')';
    }
}
