package z9;

import java.util.ArrayList;
public final class a {
    public final String f51128a;
    public final ArrayList f51129b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f51128a = str;
            this.f51129b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f51128a.equals(aVar.f51128a) && this.f51129b.equals(aVar.f51129b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f51128a.hashCode() ^ 1000003) * 1000003) ^ this.f51129b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f51128a + ", usedDates=" + this.f51129b + "}";
    }
}
