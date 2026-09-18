package w7;
public final class a implements d {
    public final int f44853a;

    public a(int i10) {
        this.f44853a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f44853a == ((a) ((d) obj)).f44853a) {
                    Object obj2 = c.f44871a;
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
        return (this.f44853a ^ 14552422) + (c.f44871a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f44853a + "intEncoding=" + c.f44871a + ')';
    }
}
