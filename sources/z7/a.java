package z7;
public final class a implements d {
    public final int f61487a;

    public a(int i7) {
        this.f61487a = i7;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f61487a == ((a) ((d) obj)).f61487a) {
                    Object obj2 = c.f61504a;
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
        return (this.f61487a ^ 14552422) + (c.f61504a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f61487a + "intEncoding=" + c.f61504a + ')';
    }
}
