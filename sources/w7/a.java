package w7;
public final class a implements d {
    public final int f52462a;

    public a(int i10) {
        this.f52462a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f52462a == ((a) ((d) obj)).f52462a) {
                    Object obj2 = c.f52477a;
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
        return (this.f52462a ^ 14552422) + (c.f52477a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f52462a + "intEncoding=" + c.f52477a + ')';
    }
}
