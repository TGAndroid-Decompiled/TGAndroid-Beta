package t9;
public final class a implements d {
    public final int f47734a;

    public a(int i9) {
        this.f47734a = i9;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f47734a == ((a) ((d) obj)).f47734a) {
                    Object obj2 = c.f47735a;
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
        return (14552422 ^ this.f47734a) + (c.f47735a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f47734a + "intEncoding=" + c.f47735a + ')';
    }
}
