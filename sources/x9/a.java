package x9;
public final class a implements d {
    public final int f50463a;

    public a(int i10) {
        this.f50463a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f50463a == ((a) ((d) obj)).f50463a) {
                    Object obj2 = c.f50464a;
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
        return (14552422 ^ this.f50463a) + (c.f50464a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f50463a + "intEncoding=" + c.f50464a + ')';
    }
}
