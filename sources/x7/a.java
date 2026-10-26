package x7;
public final class a implements d {
    public final int f51412a;

    public a(int i10) {
        this.f51412a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                if (this.f51412a == ((a) ((d) obj)).f51412a) {
                    Object obj2 = c.f51427a;
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
        return (this.f51412a ^ 14552422) + (c.f51427a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f51412a + "intEncoding=" + c.f51427a + ')';
    }
}
