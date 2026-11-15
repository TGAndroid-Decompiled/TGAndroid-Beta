package sa;

import java.util.ArrayList;
public final class a {
    public final String f56551a;
    public final ArrayList f56552b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f56551a = str;
            this.f56552b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f56551a.equals(aVar.f56551a) && this.f56552b.equals(aVar.f56552b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f56551a.hashCode() ^ 1000003) * 1000003) ^ this.f56552b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f56551a + ", usedDates=" + this.f56552b + "}";
    }
}
