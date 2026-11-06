package z7;
public final class a implements d {
    public final int f59615a;

    public a(int i7) {
        this.f59615a = i7;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f59615a == ((a) ((d) obj)).f59615a) {
                    Object obj2 = c.f59632a;
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
        return (this.f59615a ^ 14552422) + (c.f59632a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f59615a + "intEncoding=" + c.f59632a + ')';
    }
}
