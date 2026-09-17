package w7;
public final class a implements d {
    public final int f48075a;

    public a(int i10) {
        this.f48075a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f48075a == ((a) ((d) obj)).f48075a) {
                    Object obj2 = c.f48091a;
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
        return (this.f48075a ^ 14552422) + (c.f48091a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f48075a + "intEncoding=" + c.f48091a + ')';
    }
}
