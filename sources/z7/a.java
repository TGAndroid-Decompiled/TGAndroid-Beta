package z7;
public final class a implements d {
    public final int f59722a;

    public a(int i7) {
        this.f59722a = i7;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f59722a == ((a) ((d) obj)).f59722a) {
                    Object obj2 = c.f59739a;
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
        return (this.f59722a ^ 14552422) + (c.f59739a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f59722a + "intEncoding=" + c.f59739a + ')';
    }
}
