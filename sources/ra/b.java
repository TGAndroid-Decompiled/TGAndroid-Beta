package ra;

import m1.j;
public final class b {
    public final String f45068a;
    public final int f45069b;
    public final String f45070c;
    public final String d;
    public final long f45071e;
    public final long f45072f;
    public final String f45073g;

    public b(String str, int i10, String str2, String str3, long j3, long j10, String str4) {
        this.f45068a = str;
        this.f45069b = i10;
        this.f45070c = str2;
        this.d = str3;
        this.f45071e = j3;
        this.f45072f = j10;
        this.f45073g = str4;
    }

    public final a a() {
        a aVar = new a(0);
        aVar.f45064c = this.f45068a;
        aVar.f45063b = this.f45069b;
        aVar.d = this.f45070c;
        aVar.f45065e = this.d;
        aVar.f45067g = Long.valueOf(this.f45071e);
        aVar.h = Long.valueOf(this.f45072f);
        aVar.f45066f = this.f45073g;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                String str = bVar.f45073g;
                String str2 = bVar.d;
                String str3 = bVar.f45070c;
                String str4 = bVar.f45068a;
                String str5 = this.f45068a;
                if (str5 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str5.equals(str4)) {
                    return false;
                }
                if (j.b(this.f45069b, bVar.f45069b)) {
                    String str6 = this.f45070c;
                    if (str6 == null) {
                        if (str3 != null) {
                            return false;
                        }
                    } else if (!str6.equals(str3)) {
                        return false;
                    }
                    String str7 = this.d;
                    if (str7 == null) {
                        if (str2 != null) {
                            return false;
                        }
                    } else if (!str7.equals(str2)) {
                        return false;
                    }
                    if (this.f45071e == bVar.f45071e && this.f45072f == bVar.f45072f) {
                        String str8 = this.f45073g;
                        if (str8 == null) {
                            if (str == null) {
                                return true;
                            }
                            return false;
                        } else if (str8.equals(str)) {
                            return true;
                        } else {
                            return false;
                        }
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
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i10 = 0;
        String str = this.f45068a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c10 = (((hashCode ^ 1000003) * 1000003) ^ j.c(this.f45069b)) * 1000003;
        String str2 = this.f45070c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (c10 ^ hashCode2) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j3 = this.f45071e;
        long j10 = this.f45072f;
        int i12 = (((((i11 ^ hashCode3) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f45073g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i10 ^ i12;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f45068a);
        sb2.append(", registrationStatus=");
        int i10 = this.f45069b;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            str = "null";
                        } else {
                            str = "REGISTER_ERROR";
                        }
                    } else {
                        str = "REGISTERED";
                    }
                } else {
                    str = "UNREGISTERED";
                }
            } else {
                str = "NOT_GENERATED";
            }
        } else {
            str = "ATTEMPT_MIGRATION";
        }
        sb2.append(str);
        sb2.append(", authToken=");
        sb2.append(this.f45070c);
        sb2.append(", refreshToken=");
        sb2.append(this.d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f45071e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f45072f);
        sb2.append(", fisError=");
        return a4.a.s(sb2, this.f45073g, "}");
    }
}
