package qa;
public final class a implements d {
    public final int f55497a;

    public a(int i7) {
        this.f55497a = i7;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f55497a == ((a) ((d) obj)).f55497a) {
                    Object obj2 = c.f55498a;
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
        return (14552422 ^ this.f55497a) + (c.f55498a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f55497a + "intEncoding=" + c.f55498a + ')';
    }
}
