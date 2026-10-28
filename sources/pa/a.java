package pa;

import java.util.ArrayList;
public final class a {
    public final String f46862a;
    public final ArrayList f46863b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f46862a = str;
            this.f46863b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f46862a.equals(aVar.f46862a) && this.f46863b.equals(aVar.f46863b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f46862a.hashCode() ^ 1000003) * 1000003) ^ this.f46863b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f46862a + ", usedDates=" + this.f46863b + "}";
    }
}
