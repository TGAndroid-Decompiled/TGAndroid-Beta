package v7;
public final class e implements h {
    public final int f49282a;

    public e(int i10) {
        this.f49282a = i10;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f49282a == ((e) ((h) obj)).f49282a) {
                    Object obj2 = g.f49314a;
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
        return (this.f49282a ^ 14552422) + (g.f49314a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f49282a + "intEncoding=" + g.f49314a + ')';
    }
}
