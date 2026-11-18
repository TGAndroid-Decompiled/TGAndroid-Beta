package sa;

import java.util.ArrayList;
public final class a {
    public final String f57125a;
    public final ArrayList f57126b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f57125a = str;
            this.f57126b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f57125a.equals(aVar.f57125a) && this.f57126b.equals(aVar.f57126b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f57125a.hashCode() ^ 1000003) * 1000003) ^ this.f57126b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f57125a + ", usedDates=" + this.f57126b + "}";
    }
}
