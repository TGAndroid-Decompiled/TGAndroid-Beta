package w9;
public final class c {
    public final String f50221a;
    public final String f50222b;

    public c(String str, String str2) {
        if (str != null) {
            this.f50221a = str;
            this.f50222b = str2;
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
            String str2 = cVar.f50222b;
            if (this.f50221a.equals(cVar.f50221a) && ((str = this.f50222b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f50221a.hashCode() ^ 1000003) * 1000003;
        String str = this.f50222b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f50221a);
        sb2.append(", firebaseInstallationId=");
        return a1.g.t(sb2, this.f50222b, "}");
    }
}
