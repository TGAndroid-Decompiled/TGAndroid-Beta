package y9;

import java.util.List;
public final class e0 extends j1 {
    public final List f46501a;
    public final String f46502b;

    public e0(String str, List list) {
        this.f46501a = list;
        this.f46502b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            e0 e0Var = (e0) ((j1) obj);
            String str2 = e0Var.f46502b;
            if (this.f46501a.equals(e0Var.f46501a) && ((str = this.f46502b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f46501a.hashCode() ^ 1000003) * 1000003;
        String str = this.f46502b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f46501a);
        sb2.append(", orgId=");
        return a4.a.t(sb2, this.f46502b, "}");
    }
}
