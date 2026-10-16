package z9;

import java.util.List;
public final class e0 extends j1 {
    public final List f49966a;
    public final String f49967b;

    public e0(String str, List list) {
        this.f49966a = list;
        this.f49967b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            e0 e0Var = (e0) ((j1) obj);
            String str2 = e0Var.f49967b;
            if (this.f49966a.equals(e0Var.f49966a) && ((str = this.f49967b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f49966a.hashCode() ^ 1000003) * 1000003;
        String str = this.f49967b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f49966a);
        sb2.append(", orgId=");
        return a1.g.s(sb2, this.f49967b, "}");
    }
}
