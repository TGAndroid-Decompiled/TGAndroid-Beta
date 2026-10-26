package pa;

import java.util.ArrayList;
public final class a {
    public final String f46827a;
    public final ArrayList f46828b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f46827a = str;
            this.f46828b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f46827a.equals(aVar.f46827a) && this.f46828b.equals(aVar.f46828b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f46827a.hashCode() ^ 1000003) * 1000003) ^ this.f46828b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f46827a + ", usedDates=" + this.f46828b + "}";
    }
}
