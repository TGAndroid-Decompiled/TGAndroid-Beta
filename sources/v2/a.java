package v2;
public final class a {
    public final Integer f48845a;
    public final Object f48846b;
    public final d f48847c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f48845a = num;
        if (obj != null) {
            this.f48846b = obj;
            this.f48847c = dVar;
            this.d = bVar;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b bVar2 = aVar.d;
            Integer num = aVar.f48845a;
            Integer num2 = this.f48845a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f48846b.equals(aVar.f48846b) && this.f48847c.equals(aVar.f48847c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Integer num = this.f48845a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f48846b.hashCode()) * 1000003) ^ this.f48847c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i10 ^ hashCode2;
    }

    public final String toString() {
        return "Event{code=" + this.f48845a + ", payload=" + this.f48846b + ", priority=" + this.f48847c + ", productData=" + this.d + "}";
    }
}
