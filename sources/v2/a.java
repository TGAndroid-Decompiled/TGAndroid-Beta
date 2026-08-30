package v2;
public final class a {
    public final Integer f45555a;
    public final Object f45556b;
    public final d f45557c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f45555a = num;
        if (obj != null) {
            this.f45556b = obj;
            this.f45557c = dVar;
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
            Integer num = aVar.f45555a;
            Integer num2 = this.f45555a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f45556b.equals(aVar.f45556b) && this.f45557c.equals(aVar.f45557c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Integer num = this.f45555a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f45556b.hashCode()) * 1000003) ^ this.f45557c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i10 ^ hashCode2;
    }

    public final String toString() {
        return "Event{code=" + this.f45555a + ", payload=" + this.f45556b + ", priority=" + this.f45557c + ", productData=" + this.d + "}";
    }
}
