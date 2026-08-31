package z9;

import java.util.ArrayList;
public final class a {
    public final String f51092a;
    public final ArrayList f51093b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f51092a = str;
            this.f51093b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f51092a.equals(aVar.f51092a) && this.f51093b.equals(aVar.f51093b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f51092a.hashCode() ^ 1000003) * 1000003) ^ this.f51093b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f51092a + ", usedDates=" + this.f51093b + "}";
    }
}
