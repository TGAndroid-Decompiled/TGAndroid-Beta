package sa;

import java.util.ArrayList;
public final class a {
    public final String f57166a;
    public final ArrayList f57167b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f57166a = str;
            this.f57167b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f57166a.equals(aVar.f57166a) && this.f57167b.equals(aVar.f57167b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f57166a.hashCode() ^ 1000003) * 1000003) ^ this.f57167b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f57166a + ", usedDates=" + this.f57167b + "}";
    }
}
