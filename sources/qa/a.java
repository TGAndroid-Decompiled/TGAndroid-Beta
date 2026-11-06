package qa;
public final class a implements d {
    public final int f53955a;

    public a(int i7) {
        this.f53955a = i7;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f53955a == ((a) ((d) obj)).f53955a) {
                    Object obj2 = c.f53956a;
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
        return (14552422 ^ this.f53955a) + (c.f53956a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f53955a + "intEncoding=" + c.f53956a + ')';
    }
}
