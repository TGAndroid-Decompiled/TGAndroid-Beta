package pa;
public final class a implements d {
    public final int f53428a;

    public a(int i3) {
        this.f53428a = i3;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f53428a == ((a) ((d) obj)).f53428a) {
                    Object obj2 = c.f53429a;
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
        return (14552422 ^ this.f53428a) + (c.f53429a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f53428a + "intEncoding=" + c.f53429a + ')';
    }
}
