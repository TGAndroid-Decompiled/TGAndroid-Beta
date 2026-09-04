package w7;
public final class a implements d {
    public final int f48045a;

    public a(int i10) {
        this.f48045a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f48045a == ((a) ((d) obj)).f48045a) {
                    Object obj2 = c.f48061a;
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
        return (this.f48045a ^ 14552422) + (c.f48061a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f48045a + "intEncoding=" + c.f48061a + ')';
    }
}
