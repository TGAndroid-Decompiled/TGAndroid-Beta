package xa;

import p1.g;
public final class a {
    public final String f60474a;
    public final String f60475b;
    public final String f60476c;
    public final b d;
    public final int f60477e;

    public a(String str, String str2, String str3, b bVar, int i7) {
        this.f60474a = str;
        this.f60475b = str2;
        this.f60476c = str3;
        this.d = bVar;
        this.f60477e = i7;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                int i7 = aVar.f60477e;
                b bVar = aVar.d;
                String str = aVar.f60476c;
                String str2 = aVar.f60475b;
                String str3 = aVar.f60474a;
                String str4 = this.f60474a;
                if (str4 == null) {
                    if (str3 != null) {
                        return false;
                    }
                } else if (!str4.equals(str3)) {
                    return false;
                }
                String str5 = this.f60475b;
                if (str5 == null) {
                    if (str2 != null) {
                        return false;
                    }
                } else if (!str5.equals(str2)) {
                    return false;
                }
                String str6 = this.f60476c;
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
                int i10 = this.f60477e;
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
        String str = this.f60474a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f60475b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str3 = this.f60476c;
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
        int i14 = this.f60477e;
        if (i14 != 0) {
            i7 = g.c(i14);
        }
        return i7 ^ i13;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("InstallationResponse{uri=");
        sb2.append(this.f60474a);
        sb2.append(", fid=");
        sb2.append(this.f60475b);
        sb2.append(", refreshToken=");
        sb2.append(this.f60476c);
        sb2.append(", authToken=");
        sb2.append(this.d);
        sb2.append(", responseCode=");
        int i7 = this.f60477e;
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
