package t2;
public final class a {
    public final Integer f47596a;
    public final Object f47597b;
    public final d f47598c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f47596a = num;
        if (obj != null) {
            this.f47597b = obj;
            this.f47598c = dVar;
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
            Integer num = aVar.f47596a;
            Integer num2 = this.f47596a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f47597b.equals(aVar.f47597b) && this.f47598c.equals(aVar.f47598c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        Integer num = this.f47596a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f47597b.hashCode()) * 1000003) ^ this.f47598c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i9 = bVar.hashCode();
        }
        return i9 ^ hashCode2;
    }

    public final String toString() {
        return "Event{code=" + this.f47596a + ", payload=" + this.f47597b + ", priority=" + this.f47598c + ", productData=" + this.d + "}";
    }
}
