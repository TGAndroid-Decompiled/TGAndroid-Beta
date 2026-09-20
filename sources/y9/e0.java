package y9;

import java.util.List;
public final class e0 extends j1 {
    public final List f46807a;
    public final String f46808b;

    public e0(String str, List list) {
        this.f46807a = list;
        this.f46808b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            e0 e0Var = (e0) ((j1) obj);
            String str2 = e0Var.f46808b;
            if (this.f46807a.equals(e0Var.f46807a) && ((str = this.f46808b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f46807a.hashCode() ^ 1000003) * 1000003;
        String str = this.f46808b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f46807a);
        sb2.append(", orgId=");
        return a4.a.s(sb2, this.f46808b, "}");
    }
}
