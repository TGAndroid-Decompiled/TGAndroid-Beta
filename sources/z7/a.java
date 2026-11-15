package z7;
public final class a implements d {
    public final int f60922a;

    public a(int i7) {
        this.f60922a = i7;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f60922a == ((a) ((d) obj)).f60922a) {
                    Object obj2 = c.f60939a;
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
        return (this.f60922a ^ 14552422) + (c.f60939a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f60922a + "intEncoding=" + c.f60939a + ')';
    }
}
