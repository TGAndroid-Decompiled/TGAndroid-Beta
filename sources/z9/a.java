package z9;

import java.util.ArrayList;
public final class a {
    public final String f47392a;
    public final ArrayList f47393b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f47392a = str;
            this.f47393b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f47392a.equals(aVar.f47392a) && this.f47393b.equals(aVar.f47393b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f47392a.hashCode() ^ 1000003) * 1000003) ^ this.f47393b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f47392a + ", usedDates=" + this.f47393b + "}";
    }
}
