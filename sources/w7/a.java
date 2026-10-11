package w7;
public final class a implements d {
    public final int f49979a;

    public a(int i10) {
        this.f49979a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f49979a == ((a) ((d) obj)).f49979a) {
                    Object obj2 = c.f49998a;
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
        return (this.f49979a ^ 14552422) + (c.f49998a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f49979a + "intEncoding=" + c.f49998a + ')';
    }
}
