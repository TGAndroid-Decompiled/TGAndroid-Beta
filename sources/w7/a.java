package w7;
public final class a implements d {
    public final int f52480a;

    public a(int i10) {
        this.f52480a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f52480a == ((a) ((d) obj)).f52480a) {
                    Object obj2 = c.f52495a;
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
        return (this.f52480a ^ 14552422) + (c.f52495a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f52480a + "intEncoding=" + c.f52495a + ')';
    }
}
