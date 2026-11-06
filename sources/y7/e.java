package y7;
public final class e implements h {
    public final int f58910a;

    public e(int i7) {
        this.f58910a = i7;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f58910a == ((e) ((h) obj)).f58910a) {
                    Object obj2 = g.f58933a;
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
        return (this.f58910a ^ 14552422) + (g.f58933a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f58910a + "intEncoding=" + g.f58933a + ')';
    }
}
