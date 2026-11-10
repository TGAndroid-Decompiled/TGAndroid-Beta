package sa;

import java.util.ArrayList;
public final class a {
    public final String f54995a;
    public final ArrayList f54996b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f54995a = str;
            this.f54996b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f54995a.equals(aVar.f54995a) && this.f54996b.equals(aVar.f54996b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f54995a.hashCode() ^ 1000003) * 1000003) ^ this.f54996b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f54995a + ", usedDates=" + this.f54996b + "}";
    }
}
