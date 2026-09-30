package w9;
public final class c {
    public final String f45197a;
    public final String f45198b;

    public c(String str, String str2) {
        if (str != null) {
            this.f45197a = str;
            this.f45198b = str2;
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
            String str2 = cVar.f45198b;
            if (this.f45197a.equals(cVar.f45197a) && ((str = this.f45198b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f45197a.hashCode() ^ 1000003) * 1000003;
        String str = this.f45198b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f45197a);
        sb2.append(", firebaseInstallationId=");
        return a4.a.t(sb2, this.f45198b, "}");
    }
}
