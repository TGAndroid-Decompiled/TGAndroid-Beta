package sa;

import java.util.ArrayList;
public final class a {
    public final String f54891a;
    public final ArrayList f54892b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f54891a = str;
            this.f54892b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f54891a.equals(aVar.f54891a) && this.f54892b.equals(aVar.f54892b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f54891a.hashCode() ^ 1000003) * 1000003) ^ this.f54892b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f54891a + ", usedDates=" + this.f54892b + "}";
    }
}
