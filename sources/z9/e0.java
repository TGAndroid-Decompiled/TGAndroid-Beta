package z9;

import java.util.List;
public final class e0 extends j1 {
    public final List f51356a;
    public final String f51357b;

    public e0(String str, List list) {
        this.f51356a = list;
        this.f51357b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            e0 e0Var = (e0) ((j1) obj);
            String str2 = e0Var.f51357b;
            if (this.f51356a.equals(e0Var.f51356a) && ((str = this.f51357b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f51356a.hashCode() ^ 1000003) * 1000003;
        String str = this.f51357b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f51356a);
        sb2.append(", orgId=");
        return a1.g.s(sb2, this.f51357b, "}");
    }
}
