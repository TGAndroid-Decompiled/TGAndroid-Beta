package z7;
public final class s implements w {
    public final int f49774a;

    public s(int i10) {
        this.f49774a = i10;
    }

    @Override
    public final Class annotationType() {
        return w.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                if (this.f49774a == ((s) ((w) obj)).f49774a) {
                    Object obj2 = v.f49804a;
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
        return (this.f49774a ^ 14552422) + (v.f49804a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f49774a + "intEncoding=" + v.f49804a + ')';
    }
}
