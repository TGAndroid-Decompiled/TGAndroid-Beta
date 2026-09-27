package w9;
public final class c {
    public final String f45240a;
    public final String f45241b;

    public c(String str, String str2) {
        if (str != null) {
            this.f45240a = str;
            this.f45241b = str2;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str2 = cVar.f45241b;
            if (this.f45240a.equals(cVar.f45240a) && ((str = this.f45241b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f45240a.hashCode() ^ 1000003) * 1000003;
        String str = this.f45241b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f45240a);
        sb2.append(", firebaseInstallationId=");
        return a4.a.s(sb2, this.f45241b, "}");
    }
}
