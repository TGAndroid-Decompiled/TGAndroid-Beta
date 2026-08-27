package w9;

import java.util.ArrayList;

public final class a {

    public final String f49277a;

    public final ArrayList f49278b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f49277a = str;
        this.f49278b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f49277a.equals(aVar.f49277a) && this.f49278b.equals(aVar.f49278b);
    }

    public final int hashCode() {
        return ((this.f49277a.hashCode() ^ 1000003) * 1000003) ^ this.f49278b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f49277a + ", usedDates=" + this.f49278b + "}";
    }
}
