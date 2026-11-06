package sa;

import java.util.ArrayList;
public final class a {
    public final String f54892a;
    public final ArrayList f54893b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f54892a = str;
            this.f54893b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f54892a.equals(aVar.f54892a) && this.f54893b.equals(aVar.f54893b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f54892a.hashCode() ^ 1000003) * 1000003) ^ this.f54893b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f54892a + ", usedDates=" + this.f54893b + "}";
    }
}
