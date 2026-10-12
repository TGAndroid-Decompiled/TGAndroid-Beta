package w7;
public final class a implements d {
    public final int f50119a;

    public a(int i10) {
        this.f50119a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f50119a == ((a) ((d) obj)).f50119a) {
                    Object obj2 = c.f50138a;
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
        return (this.f50119a ^ 14552422) + (c.f50138a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f50119a + "intEncoding=" + c.f50138a + ')';
    }
}
