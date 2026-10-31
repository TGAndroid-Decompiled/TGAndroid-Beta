package x9;
public final class c {
    public final String f53443a;
    public final String f53444b;

    public c(String str, String str2) {
        if (str != null) {
            this.f53443a = str;
            this.f53444b = str2;
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
            String str2 = cVar.f53444b;
            if (this.f53443a.equals(cVar.f53443a) && ((str = this.f53444b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f53443a.hashCode() ^ 1000003) * 1000003;
        String str = this.f53444b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f53443a);
        sb2.append(", firebaseInstallationId=");
        return a1.g.r(sb2, this.f53444b, "}");
    }
}
