package u9;

public final class a implements d {

    public final int f48456a;

    public a(int i10) {
        this.f48456a = i10;
    }

    @Override
    public final Class annotationType() {
        return d.class;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        if (this.f48456a != ((a) ((d) obj)).f48456a) {
            return false;
        }
        Object obj2 = c.f48457a;
        return obj2.equals(obj2);
    }

    @Override
    public final int hashCode() {
        return (14552422 ^ this.f48456a) + (c.f48457a.hashCode() ^ 2041407134);
    }

    @Override
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f48456a + "intEncoding=" + c.f48457a + ')';
    }
}
