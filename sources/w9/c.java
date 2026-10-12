package w9;
public final class c {
    public final String f50456a;
    public final String f50457b;

    public c(String str, String str2) {
        if (str != null) {
            this.f50456a = str;
            this.f50457b = str2;
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
            String str2 = cVar.f50457b;
            if (this.f50456a.equals(cVar.f50456a) && ((str = this.f50457b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f50456a.hashCode() ^ 1000003) * 1000003;
        String str = this.f50457b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f50456a);
        sb2.append(", firebaseInstallationId=");
        return a1.g.t(sb2, this.f50457b, "}");
    }
}
