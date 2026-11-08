package z7;
public final class a implements d {
    public final int f59714a;

    public a(int i7) {
        this.f59714a = i7;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f59714a == ((a) ((d) obj)).f59714a) {
                    Object obj2 = c.f59731a;
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
        return (this.f59714a ^ 14552422) + (c.f59731a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f59714a + "intEncoding=" + c.f59731a + ')';
    }
}
