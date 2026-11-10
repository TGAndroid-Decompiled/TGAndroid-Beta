package qa;
public final class a implements d {
    public final int f54060a;

    public a(int i7) {
        this.f54060a = i7;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f54060a == ((a) ((d) obj)).f54060a) {
                    Object obj2 = c.f54061a;
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
        return (14552422 ^ this.f54060a) + (c.f54061a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f54060a + "intEncoding=" + c.f54061a + ')';
    }
}
