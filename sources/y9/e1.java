package y9;

import android.os.Build;
public final class e1 {
    public final boolean f49744a;

    public e1(boolean z10) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str != null) {
            if (str2 != null) {
                this.f49744a = z10;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e1) {
                e1 e1Var = (e1) obj;
                String str = Build.VERSION.RELEASE;
                if (str.equals(str)) {
                    String str2 = Build.VERSION.CODENAME;
                    if (str2.equals(str2) && this.f49744a == e1Var.f49744a) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (((Build.VERSION.RELEASE.hashCode() ^ 1000003) * 1000003) ^ Build.VERSION.CODENAME.hashCode()) * 1000003;
        if (this.f49744a) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return "OsData{osRelease=" + Build.VERSION.RELEASE + ", osCodeName=" + Build.VERSION.CODENAME + ", isRooted=" + this.f49744a + "}";
    }
}
