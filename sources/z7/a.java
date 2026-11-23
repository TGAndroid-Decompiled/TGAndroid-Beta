package z7;
public final class a implements d {
    public final int f61532a;

    public a(int i7) {
        this.f61532a = i7;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f61532a == ((a) ((d) obj)).f61532a) {
                    Object obj2 = c.f61549a;
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
        return (this.f61532a ^ 14552422) + (c.f61549a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f61532a + "intEncoding=" + c.f61549a + ')';
    }
}
