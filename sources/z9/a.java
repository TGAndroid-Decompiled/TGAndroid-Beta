package z9;

import java.util.ArrayList;
public final class a {
    public final String f51093a;
    public final ArrayList f51094b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f51093a = str;
            this.f51094b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f51093a.equals(aVar.f51093a) && this.f51094b.equals(aVar.f51094b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f51093a.hashCode() ^ 1000003) * 1000003) ^ this.f51094b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f51093a + ", usedDates=" + this.f51094b + "}";
    }
}
