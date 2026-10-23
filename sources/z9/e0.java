package z9;

import java.util.List;
public final class e0 extends j1 {
    public final List f51821a;
    public final String f51822b;

    public e0(String str, List list) {
        this.f51821a = list;
        this.f51822b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            e0 e0Var = (e0) ((j1) obj);
            String str2 = e0Var.f51822b;
            if (this.f51821a.equals(e0Var.f51821a) && ((str = this.f51822b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f51821a.hashCode() ^ 1000003) * 1000003;
        String str = this.f51822b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f51821a);
        sb2.append(", orgId=");
        return a1.g.s(sb2, this.f51822b, "}");
    }
}
