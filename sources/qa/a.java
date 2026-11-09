package qa;
public final class a implements d {
    public final int f54061a;

    public a(int i7) {
        this.f54061a = i7;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f54061a == ((a) ((d) obj)).f54061a) {
                    Object obj2 = c.f54062a;
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
        return (14552422 ^ this.f54061a) + (c.f54062a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f54061a + "intEncoding=" + c.f54062a + ')';
    }
}
