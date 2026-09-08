package w9;
public final class c {
    public final String f48407a;
    public final String f48408b;

    public c(String str, String str2) {
        if (str != null) {
            this.f48407a = str;
            this.f48408b = str2;
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
            String str2 = cVar.f48408b;
            if (this.f48407a.equals(cVar.f48407a) && ((str = this.f48408b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f48407a.hashCode() ^ 1000003) * 1000003;
        String str = this.f48408b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f48407a);
        sb2.append(", firebaseInstallationId=");
        return a4.a.s(sb2, this.f48408b, "}");
    }
}
