package z9;

import java.util.ArrayList;
public final class a {
    public final String f47456a;
    public final ArrayList f47457b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f47456a = str;
            this.f47457b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f47456a.equals(aVar.f47456a) && this.f47457b.equals(aVar.f47457b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f47456a.hashCode() ^ 1000003) * 1000003) ^ this.f47457b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f47456a + ", usedDates=" + this.f47457b + "}";
    }
}
