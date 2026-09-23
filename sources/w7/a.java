package w7;
public final class a implements d {
    public final int f44549a;

    public a(int i10) {
        this.f44549a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f44549a == ((a) ((d) obj)).f44549a) {
                    Object obj2 = c.f44564a;
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
        return (this.f44549a ^ 14552422) + (c.f44564a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f44549a + "intEncoding=" + c.f44564a + ')';
    }
}
