package z9;

import java.util.List;
public final class e0 extends j1 {
    public final List f51371a;
    public final String f51372b;

    public e0(String str, List list) {
        this.f51371a = list;
        this.f51372b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            e0 e0Var = (e0) ((j1) obj);
            String str2 = e0Var.f51372b;
            if (this.f51371a.equals(e0Var.f51371a) && ((str = this.f51372b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f51371a.hashCode() ^ 1000003) * 1000003;
        String str = this.f51372b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f51371a);
        sb2.append(", orgId=");
        return a1.g.s(sb2, this.f51372b, "}");
    }
}
