package w7;
public final class a implements d {
    public final int f47204a;

    public a(int i10) {
        this.f47204a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f47204a == ((a) ((d) obj)).f47204a) {
                    Object obj2 = c.f47219a;
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
        return (this.f47204a ^ 14552422) + (c.f47219a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f47204a + "intEncoding=" + c.f47219a + ')';
    }
}
