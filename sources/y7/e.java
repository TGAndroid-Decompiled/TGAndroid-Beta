package y7;
public final class e implements h {
    public final int f59005a;

    public e(int i7) {
        this.f59005a = i7;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f59005a == ((e) ((h) obj)).f59005a) {
                    Object obj2 = g.f59028a;
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
        return (this.f59005a ^ 14552422) + (g.f59028a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f59005a + "intEncoding=" + g.f59028a + ')';
    }
}
