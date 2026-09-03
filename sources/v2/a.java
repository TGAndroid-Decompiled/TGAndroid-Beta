package v2;
public final class a {
    public final Integer f48881a;
    public final Object f48882b;
    public final d f48883c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f48881a = num;
        if (obj != null) {
            this.f48882b = obj;
            this.f48883c = dVar;
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
            Integer num = aVar.f48881a;
            Integer num2 = this.f48881a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f48882b.equals(aVar.f48882b) && this.f48883c.equals(aVar.f48883c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Integer num = this.f48881a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f48882b.hashCode()) * 1000003) ^ this.f48883c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i10 ^ hashCode2;
    }

    public final String toString() {
        return "Event{code=" + this.f48881a + ", payload=" + this.f48882b + ", priority=" + this.f48883c + ", productData=" + this.d + "}";
    }
}
