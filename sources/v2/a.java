package v2;
public final class a {
    public final Integer f49323a;
    public final Object f49324b;
    public final d f49325c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.f49323a = num;
        if (obj != null) {
            this.f49324b = obj;
            this.f49325c = dVar;
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
            Integer num = aVar.f49323a;
            Integer num2 = this.f49323a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f49324b.equals(aVar.f49324b) && this.f49325c.equals(aVar.f49325c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Integer num = this.f49323a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.f49324b.hashCode()) * 1000003) ^ this.f49325c.hashCode()) * 1000003;
        b bVar = this.d;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i10 ^ hashCode2;
    }

    public final String toString() {
        return "Event{code=" + this.f49323a + ", payload=" + this.f49324b + ", priority=" + this.f49325c + ", productData=" + this.d + "}";
    }
}
