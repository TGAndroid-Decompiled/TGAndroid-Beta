package x7;
public final class a implements d {
    public final int f51470a;

    public a(int i10) {
        this.f51470a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f51470a == ((a) ((d) obj)).f51470a) {
                    Object obj2 = c.f51485a;
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
        return (this.f51470a ^ 14552422) + (c.f51485a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f51470a + "intEncoding=" + c.f51485a + ')';
    }
}
