package x9;
public final class a implements d {
    public final int f46856a;

    public a(int i10) {
        this.f46856a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f46856a == ((a) ((d) obj)).f46856a) {
                    Object obj2 = c.f46857a;
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
        return (14552422 ^ this.f46856a) + (c.f46857a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f46856a + "intEncoding=" + c.f46857a + ')';
    }
}
