package x7;
public final class e implements h {
    public final int f58268a;

    public e(int i3) {
        this.f58268a = i3;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f58268a == ((e) ((h) obj)).f58268a) {
                    Object obj2 = g.f58296a;
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
        return (this.f58268a ^ 14552422) + (g.f58296a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f58268a + "intEncoding=" + g.f58296a + ')';
    }
}
