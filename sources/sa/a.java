package sa;

import java.util.ArrayList;
public final class a {
    public final String f54983a;
    public final ArrayList f54984b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f54983a = str;
            this.f54984b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f54983a.equals(aVar.f54983a) && this.f54984b.equals(aVar.f54984b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f54983a.hashCode() ^ 1000003) * 1000003) ^ this.f54984b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f54983a + ", usedDates=" + this.f54984b + "}";
    }
}
