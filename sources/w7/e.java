package w7;
public final class e implements h {
    public final int f50843a;

    public e(int i10) {
        this.f50843a = i10;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f50843a == ((e) ((h) obj)).f50843a) {
                    Object obj2 = g.f50855a;
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
        return (this.f50843a ^ 14552422) + (g.f50855a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f50843a + "intEncoding=" + g.f50855a + ')';
    }
}
