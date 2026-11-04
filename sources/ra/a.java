package ra;

import java.util.ArrayList;
public final class a {
    public final String f54451a;
    public final ArrayList f54452b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f54451a = str;
            this.f54452b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f54451a.equals(aVar.f54451a) && this.f54452b.equals(aVar.f54452b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f54451a.hashCode() ^ 1000003) * 1000003) ^ this.f54452b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f54451a + ", usedDates=" + this.f54452b + "}";
    }
}
