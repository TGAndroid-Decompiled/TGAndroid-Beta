package w7;
public final class a implements d {
    public final int f44622a;

    public a(int i10) {
        this.f44622a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f44622a == ((a) ((d) obj)).f44622a) {
                    Object obj2 = c.f44637a;
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
        return (this.f44622a ^ 14552422) + (c.f44637a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f44622a + "intEncoding=" + c.f44637a + ')';
    }
}
