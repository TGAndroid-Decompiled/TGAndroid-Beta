package x9;

import java.util.ArrayList;
public final class a {
    public final String f50104a;
    public final ArrayList f50105b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f50104a = str;
            this.f50105b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f50104a.equals(aVar.f50104a) && this.f50105b.equals(aVar.f50105b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f50104a.hashCode() ^ 1000003) * 1000003) ^ this.f50105b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f50104a + ", usedDates=" + this.f50105b + "}";
    }
}
