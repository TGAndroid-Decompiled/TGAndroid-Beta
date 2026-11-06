package sa;

import java.util.ArrayList;
public final class a {
    public final String f54867a;
    public final ArrayList f54868b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f54867a = str;
            this.f54868b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f54867a.equals(aVar.f54867a) && this.f54868b.equals(aVar.f54868b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f54867a.hashCode() ^ 1000003) * 1000003) ^ this.f54868b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f54867a + ", usedDates=" + this.f54868b + "}";
    }
}
