package x7;
public final class z implements c0 {
    public final int f49633a;

    public z(int i10) {
        this.f49633a = i10;
    }

    @Override
    public final Class annotationType() {
        return c0.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c0) {
                if (this.f49633a == ((z) ((c0) obj)).f49633a) {
                    Object obj2 = b0.f49320a;
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
        return (this.f49633a ^ 14552422) + (b0.f49320a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f49633a + "intEncoding=" + b0.f49320a + ')';
    }
}
