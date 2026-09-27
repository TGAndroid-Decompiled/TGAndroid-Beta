package w7;
public final class a implements d {
    public final int f44925a;

    public a(int i10) {
        this.f44925a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f44925a == ((a) ((d) obj)).f44925a) {
                    Object obj2 = c.f44943a;
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
        return (this.f44925a ^ 14552422) + (c.f44943a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f44925a + "intEncoding=" + c.f44943a + ')';
    }
}
