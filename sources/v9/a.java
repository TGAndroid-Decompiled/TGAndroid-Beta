package v9;

import java.util.ArrayList;
public final class a {
    public final String f48366a;
    public final ArrayList f48367b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f48366a = str;
            this.f48367b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f48366a.equals(aVar.f48366a) && this.f48367b.equals(aVar.f48367b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f48366a.hashCode() ^ 1000003) * 1000003) ^ this.f48367b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f48366a + ", usedDates=" + this.f48367b + "}";
    }
}
