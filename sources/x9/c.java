package x9;
public final class c {
    public final String f48281a;
    public final String f48282b;

    public c(String str, String str2) {
        if (str != null) {
            this.f48281a = str;
            this.f48282b = str2;
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
            String str2 = cVar.f48282b;
            if (this.f48281a.equals(cVar.f48281a) && ((str = this.f48282b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f48281a.hashCode() ^ 1000003) * 1000003;
        String str = this.f48282b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f48281a);
        sb2.append(", firebaseInstallationId=");
        return a1.g.s(sb2, this.f48282b, "}");
    }
}
