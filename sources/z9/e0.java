package z9;

import java.util.List;
public final class e0 extends j1 {
    public final List f55268a;
    public final String f55269b;

    public e0(String str, List list) {
        this.f55268a = list;
        this.f55269b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            e0 e0Var = (e0) ((j1) obj);
            String str2 = e0Var.f55269b;
            if (this.f55268a.equals(e0Var.f55268a) && ((str = this.f55269b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f55268a.hashCode() ^ 1000003) * 1000003;
        String str = this.f55269b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f55268a);
        sb2.append(", orgId=");
        return a1.g.r(sb2, this.f55269b, "}");
    }
}
