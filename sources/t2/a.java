package t2;

public final class a {

    public final Integer f48007a;

    public final Object f48008b;

    public final d f48009c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f48007a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f48008b = obj;
        this.f48009c = dVar;
        this.d = bVar;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b bVar2 = aVar.d;
            Integer num = aVar.f48007a;
            Integer num2 = this.f48007a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f48008b.equals(aVar.f48008b) && this.f48009c.equals(aVar.f48009c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f48007a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f48008b.hashCode()) * 1000003) ^ this.f48009c.hashCode()) * 1000003;
        b bVar = this.d;
        return (bVar != null ? bVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Event{code=" + this.f48007a + ", payload=" + this.f48008b + ", priority=" + this.f48009c + ", productData=" + this.d + "}";
    }
}
