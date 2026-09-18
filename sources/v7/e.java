package v7;
public final class e implements h {
    public final int f44210a;

    public e(int i10) {
        this.f44210a = i10;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f44210a == ((e) ((h) obj)).f44210a) {
                    Object obj2 = g.f44232a;
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
        return (this.f44210a ^ 14552422) + (g.f44232a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f44210a + "intEncoding=" + g.f44232a + ')';
    }
}
