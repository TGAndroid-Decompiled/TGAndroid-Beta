package v7;
public final class e implements h {
    public final int f47464a;

    public e(int i10) {
        this.f47464a = i10;
    }

    @Override
    public final Class annotationType() {
        return h.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                if (this.f47464a == ((e) ((h) obj)).f47464a) {
                    Object obj2 = g.f47478a;
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
        return (this.f47464a ^ 14552422) + (g.f47478a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f47464a + "intEncoding=" + g.f47478a + ')';
    }
}
