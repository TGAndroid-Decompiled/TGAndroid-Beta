package sa;

import java.util.ArrayList;
public final class a {
    public final String f54996a;
    public final ArrayList f54997b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f54996a = str;
            this.f54997b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f54996a.equals(aVar.f54996a) && this.f54997b.equals(aVar.f54997b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f54996a.hashCode() ^ 1000003) * 1000003) ^ this.f54997b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f54996a + ", usedDates=" + this.f54997b + "}";
    }
}
