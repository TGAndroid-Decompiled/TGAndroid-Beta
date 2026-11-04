package wa;

import o1.g;
public final class a {
    public final String f57428a;
    public final String f57429b;
    public final String f57430c;
    public final b d;
    public final int f57431e;

    public a(String str, String str2, String str3, b bVar, int i3) {
        this.f57428a = str;
        this.f57429b = str2;
        this.f57430c = str3;
        this.d = bVar;
        this.f57431e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                int i3 = aVar.f57431e;
                b bVar = aVar.d;
                String str = aVar.f57430c;
                String str2 = aVar.f57429b;
                String str3 = aVar.f57428a;
                String str4 = this.f57428a;
                if (str4 == null) {
                    if (str3 != null) {
                        return false;
                    }
                } else if (!str4.equals(str3)) {
                    return false;
                }
                String str5 = this.f57429b;
                if (str5 == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str5.equals(str2)) {
                    return false;
                }
                String str6 = this.f57430c;
                if (str6 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str6.equals(str)) {
                    return false;
                }
                b bVar2 = this.d;
                if (bVar2 == null) {
                    if (bVar != null) {
                        return false;
                    }
                } else if (!bVar2.equals(bVar)) {
                    return false;
                }
                int i10 = this.f57431e;
                if (i10 == 0) {
                    if (i3 == 0) {
                        return true;
                    }
                    return false;
                } else if (g.b(i10, i3)) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i3 = 0;
        String str = this.f57428a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f57429b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str3 = this.f57430c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        b bVar = this.d;
        if (bVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bVar.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        int i14 = this.f57431e;
        if (i14 != 0) {
            i3 = g.c(i14);
        }
        return i3 ^ i13;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("InstallationResponse{uri=");
        sb2.append(this.f57428a);
        sb2.append(", fid=");
        sb2.append(this.f57429b);
        sb2.append(", refreshToken=");
        sb2.append(this.f57430c);
        sb2.append(", authToken=");
        sb2.append(this.d);
        sb2.append(", responseCode=");
        int i3 = this.f57431e;
        if (i3 != 1) {
            if (i3 != 2) {
                str = "null";
            } else {
                str = "BAD_CONFIG";
            }
        } else {
            str = "OK";
        }
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
