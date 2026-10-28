package w7;
public final class e implements h {
    public final int f50901a;

    public e(int i10) {
        this.f50901a = i10;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f50901a == ((e) ((h) obj)).f50901a) {
                    Object obj2 = g.f50913a;
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
        return (this.f50901a ^ 14552422) + (g.f50913a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f50901a + "intEncoding=" + g.f50913a + ')';
    }
}
