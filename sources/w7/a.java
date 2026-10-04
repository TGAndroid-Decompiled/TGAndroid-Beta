package w7;
public final class a implements d {
    public final int f48591a;

    public a(int i10) {
        this.f48591a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f48591a == ((a) ((d) obj)).f48591a) {
                    Object obj2 = c.f48610a;
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
        return (this.f48591a ^ 14552422) + (c.f48610a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f48591a + "intEncoding=" + c.f48610a + ')';
    }
}
