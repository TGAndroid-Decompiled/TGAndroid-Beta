package w7;
public final class a implements d {
    public final int f44627a;

    public a(int i10) {
        this.f44627a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f44627a == ((a) ((d) obj)).f44627a) {
                    Object obj2 = c.f44642a;
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
        return (this.f44627a ^ 14552422) + (c.f44642a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f44627a + "intEncoding=" + c.f44642a + ')';
    }
}
