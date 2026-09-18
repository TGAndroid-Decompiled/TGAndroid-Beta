package w9;
public final class c {
    public final String f44942a;
    public final String f44943b;

    public c(String str, String str2) {
        if (str != null) {
            this.f44942a = str;
            this.f44943b = str2;
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
            String str2 = cVar.f44943b;
            if (this.f44942a.equals(cVar.f44942a) && ((str = this.f44943b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f44942a.hashCode() ^ 1000003) * 1000003;
        String str = this.f44943b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f44942a);
        sb2.append(", firebaseInstallationId=");
        return a4.a.s(sb2, this.f44943b, "}");
    }
}
