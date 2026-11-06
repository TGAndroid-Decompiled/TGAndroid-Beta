package xa;

import p1.g;
public final class a {
    public final String f58572a;
    public final String f58573b;
    public final String f58574c;
    public final b d;
    public final int f58575e;

    public a(String str, String str2, String str3, b bVar, int i7) {
        this.f58572a = str;
        this.f58573b = str2;
        this.f58574c = str3;
        this.d = bVar;
        this.f58575e = i7;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                int i7 = aVar.f58575e;
                b bVar = aVar.d;
                String str = aVar.f58574c;
                String str2 = aVar.f58573b;
                String str3 = aVar.f58572a;
                String str4 = this.f58572a;
                if (str4 == null) {
                    if (str3 != null) {
                        return false;
                    }
                } else if (!str4.equals(str3)) {
                    return false;
                }
                String str5 = this.f58573b;
                if (str5 == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str5.equals(str2)) {
                    return false;
                }
                String str6 = this.f58574c;
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
                int i10 = this.f58575e;
                if (i10 == 0) {
                    if (i7 == 0) {
                        return true;
                    }
                    return false;
                } else if (g.b(i10, i7)) {
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
        int i7 = 0;
        String str = this.f58572a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f58573b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str3 = this.f58574c;
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
        int i14 = this.f58575e;
        if (i14 != 0) {
            i7 = g.c(i14);
        }
        return i7 ^ i13;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("InstallationResponse{uri=");
        sb2.append(this.f58572a);
        sb2.append(", fid=");
        sb2.append(this.f58573b);
        sb2.append(", refreshToken=");
        sb2.append(this.f58574c);
        sb2.append(", authToken=");
        sb2.append(this.d);
        sb2.append(", responseCode=");
        int i7 = this.f58575e;
        if (i7 != 1) {
            if (i7 != 2) {
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
