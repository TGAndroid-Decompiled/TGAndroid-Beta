package y9;
public final class c {
    public final String f52476a;
    public final String f52477b;

    public c(String str, String str2) {
        if (str != null) {
            this.f52476a = str;
            this.f52477b = str2;
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
            String str2 = cVar.f52477b;
            if (this.f52476a.equals(cVar.f52476a) && ((str = this.f52477b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f52476a.hashCode() ^ 1000003) * 1000003;
        String str = this.f52477b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f52476a);
        sb2.append(", firebaseInstallationId=");
        return a1.g.s(sb2, this.f52477b, "}");
    }
}
