package v7;
public final class e implements h {
    public final int f49161a;

    public e(int i10) {
        this.f49161a = i10;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f49161a == ((e) ((h) obj)).f49161a) {
                    Object obj2 = g.f49193a;
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
        return (this.f49161a ^ 14552422) + (g.f49193a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f49161a + "intEncoding=" + g.f49193a + ')';
    }
}
