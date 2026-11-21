package qa;
public final class a implements d {
    public final int f56112a;

    public a(int i7) {
        this.f56112a = i7;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f56112a == ((a) ((d) obj)).f56112a) {
                    Object obj2 = c.f56113a;
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
        return (14552422 ^ this.f56112a) + (c.f56113a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f56112a + "intEncoding=" + c.f56113a + ')';
    }
}
