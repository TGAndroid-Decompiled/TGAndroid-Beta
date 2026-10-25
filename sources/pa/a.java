package pa;

import java.util.ArrayList;
public final class a {
    public final String f46824a;
    public final ArrayList f46825b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f46824a = str;
            this.f46825b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f46824a.equals(aVar.f46824a) && this.f46825b.equals(aVar.f46825b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f46824a.hashCode() ^ 1000003) * 1000003) ^ this.f46825b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f46824a + ", usedDates=" + this.f46825b + "}";
    }
}
