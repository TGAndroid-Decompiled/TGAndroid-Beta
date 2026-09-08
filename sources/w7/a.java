package w7;
public final class a implements d {
    public final int f48074a;

    public a(int i10) {
        this.f48074a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f48074a == ((a) ((d) obj)).f48074a) {
                    Object obj2 = c.f48090a;
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
        return (this.f48074a ^ 14552422) + (c.f48090a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f48074a + "intEncoding=" + c.f48090a + ')';
    }
}
