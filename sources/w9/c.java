package w9;
public final class c {
    public final String f50219a;
    public final String f50220b;

    public c(String str, String str2) {
        if (str != null) {
            this.f50219a = str;
            this.f50220b = str2;
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
            String str2 = cVar.f50220b;
            if (this.f50219a.equals(cVar.f50219a) && ((str = this.f50220b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f50219a.hashCode() ^ 1000003) * 1000003;
        String str = this.f50220b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f50219a);
        sb2.append(", firebaseInstallationId=");
        return a1.g.t(sb2, this.f50220b, "}");
    }
}
