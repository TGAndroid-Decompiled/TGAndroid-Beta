package y7;
public final class y implements b0 {
    public final int f52377a;

    public y(int i10) {
        this.f52377a = i10;
    }

    @Override
    public final Class annotationType() {
        return b0.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b0) {
                if (this.f52377a == ((y) ((b0) obj)).f52377a) {
                    Object obj2 = a0.f52068a;
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
        return (this.f52377a ^ 14552422) + (a0.f52068a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f52377a + "intEncoding=" + a0.f52068a + ')';
    }
}
