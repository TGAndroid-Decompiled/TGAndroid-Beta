package sa;

import java.util.ArrayList;
public final class a {
    public final String f57249a;
    public final ArrayList f57250b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f57249a = str;
            this.f57250b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f57249a.equals(aVar.f57249a) && this.f57250b.equals(aVar.f57250b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f57249a.hashCode() ^ 1000003) * 1000003) ^ this.f57250b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f57249a + ", usedDates=" + this.f57250b + "}";
    }
}
