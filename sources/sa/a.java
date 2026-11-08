package sa;

import java.util.ArrayList;
public final class a {
    public final String f54984a;
    public final ArrayList f54985b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f54984a = str;
            this.f54985b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f54984a.equals(aVar.f54984a) && this.f54985b.equals(aVar.f54985b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f54984a.hashCode() ^ 1000003) * 1000003) ^ this.f54985b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f54984a + ", usedDates=" + this.f54985b + "}";
    }
}
