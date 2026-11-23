package sa;

import java.util.ArrayList;
public final class a {
    public final String f57135a;
    public final ArrayList f57136b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f57135a = str;
            this.f57136b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f57135a.equals(aVar.f57135a) && this.f57136b.equals(aVar.f57136b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f57135a.hashCode() ^ 1000003) * 1000003) ^ this.f57136b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f57135a + ", usedDates=" + this.f57136b + "}";
    }
}
