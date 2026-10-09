package w7;
public final class a implements d {
    public final int f49890a;

    public a(int i10) {
        this.f49890a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f49890a == ((a) ((d) obj)).f49890a) {
                    Object obj2 = c.f49909a;
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
        return (this.f49890a ^ 14552422) + (c.f49909a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f49890a + "intEncoding=" + c.f49909a + ')';
    }
}
