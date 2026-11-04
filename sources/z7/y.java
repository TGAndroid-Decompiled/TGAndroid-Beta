package z7;
public final class y implements b0 {
    public final int f60132a;

    public y(int i3) {
        this.f60132a = i3;
    }

    @Override
    public final Class annotationType() {
        return b0.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b0) {
                if (this.f60132a == ((y) ((b0) obj)).f60132a) {
                    Object obj2 = a0.f59796a;
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
        return (this.f60132a ^ 14552422) + (a0.f59796a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f60132a + "intEncoding=" + a0.f59796a + ')';
    }
}
