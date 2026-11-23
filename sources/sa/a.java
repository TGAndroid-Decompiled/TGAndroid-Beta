package sa;

import java.util.ArrayList;
public final class a {
    public final String f57170a;
    public final ArrayList f57171b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f57170a = str;
            this.f57171b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f57170a.equals(aVar.f57170a) && this.f57171b.equals(aVar.f57171b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f57170a.hashCode() ^ 1000003) * 1000003) ^ this.f57171b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f57170a + ", usedDates=" + this.f57171b + "}";
    }
}
