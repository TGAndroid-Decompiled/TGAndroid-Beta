package x9;
public final class a implements d {
    public final int f46924a;

    public a(int i10) {
        this.f46924a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f46924a == ((a) ((d) obj)).f46924a) {
                    Object obj2 = c.f46925a;
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
        return (14552422 ^ this.f46924a) + (c.f46925a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f46924a + "intEncoding=" + c.f46925a + ')';
    }
}
