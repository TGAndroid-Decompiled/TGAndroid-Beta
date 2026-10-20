package x9;
public final class c {
    public final String f49673a;
    public final String f49674b;

    public c(String str, String str2) {
        if (str != null) {
            this.f49673a = str;
            this.f49674b = str2;
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
            String str2 = cVar.f49674b;
            if (this.f49673a.equals(cVar.f49673a) && ((str = this.f49674b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f49673a.hashCode() ^ 1000003) * 1000003;
        String str = this.f49674b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f49673a);
        sb2.append(", firebaseInstallationId=");
        return a1.g.s(sb2, this.f49674b, "}");
    }
}
