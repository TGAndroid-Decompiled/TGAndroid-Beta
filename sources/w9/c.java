package w9;
public final class c {
    public final String f48924a;
    public final String f48925b;

    public c(String str, String str2) {
        if (str != null) {
            this.f48924a = str;
            this.f48925b = str2;
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
            String str2 = cVar.f48925b;
            if (this.f48924a.equals(cVar.f48924a) && ((str = this.f48925b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f48924a.hashCode() ^ 1000003) * 1000003;
        String str = this.f48925b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f48924a);
        sb2.append(", firebaseInstallationId=");
        return a4.a.s(sb2, this.f48925b, "}");
    }
}
