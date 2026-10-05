package z7;
public final class s implements w {
    public final int f52928a;

    public s(int i10) {
        this.f52928a = i10;
    }

    @Override
    public final Class annotationType() {
        return w.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w) {
                if (this.f52928a == ((s) ((w) obj)).f52928a) {
                    Object obj2 = v.f52958a;
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
        return (this.f52928a ^ 14552422) + (v.f52958a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f52928a + "intEncoding=" + v.f52958a + ')';
    }
}
