package w7;
public final class a implements d {
    public final int f47203a;

    public a(int i10) {
        this.f47203a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f47203a == ((a) ((d) obj)).f47203a) {
                    Object obj2 = c.f47218a;
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
        return (this.f47203a ^ 14552422) + (c.f47218a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f47203a + "intEncoding=" + c.f47218a + ')';
    }
}
