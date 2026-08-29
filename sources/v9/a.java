package v9;
public final class a implements d {
    public final int f49464a;

    public a(int i10) {
        this.f49464a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f49464a == ((a) ((d) obj)).f49464a) {
                    Object obj2 = c.f49465a;
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
        return (14552422 ^ this.f49464a) + (c.f49465a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f49464a + "intEncoding=" + c.f49465a + ')';
    }
}
