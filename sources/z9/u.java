package z9;
public final class u {
    public final String f60246a;
    public final String f60247b;

    public u(String str, String str2) {
        this.f60246a = str;
        this.f60247b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (kotlin.jvm.internal.j.a(this.f60246a, uVar.f60246a) && kotlin.jvm.internal.j.a(this.f60247b, uVar.f60247b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i3 = 0;
        String str = this.f60246a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.f60247b;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i10 + i3;
    }

    public final String toString() {
        return "FirebaseInstallationId(fid=" + this.f60246a + ", authToken=" + this.f60247b + ')';
    }
}
