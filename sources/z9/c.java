package z9;
public final class c {
    public final String f60167a;
    public final String f60168b;
    public final String f60169c;

    public c(String str, String str2, String str3) {
        if (str != null) {
            this.f60167a = str;
            this.f60168b = str2;
            this.f60169c = str3;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str3 = cVar.f60169c;
            String str4 = cVar.f60168b;
            if (this.f60167a.equals(cVar.f60167a) && ((str = this.f60168b) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f60169c) != null ? str2.equals(str3) : str3 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f60167a.hashCode() ^ 1000003) * 1000003;
        int i3 = 0;
        String str = this.f60168b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        String str2 = this.f60169c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i10 ^ i3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f60167a);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f60168b);
        sb2.append(", firebaseAuthenticationToken=");
        return a1.g.s(sb2, this.f60169c, "}");
    }
}
