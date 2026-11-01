package sa;

import a1.g;
import kg.s0;
import m1.j;
public final class a {
    public final String f48133a;
    public final int f48134b;
    public final String f48135c;
    public final String d;
    public final long e;
    public final long f48136f;
    public final String f48137g;

    public a(String str, int i10, String str2, String str3, long j10, long j11, String str4) {
        this.f48133a = str;
        this.f48134b = i10;
        this.f48135c = str2;
        this.d = str3;
        this.e = j10;
        this.f48136f = j11;
        this.f48137g = str4;
    }

    public final s0 a() {
        s0 s0Var = new s0(3);
        s0Var.f11265c = this.f48133a;
        s0Var.f11264b = this.f48134b;
        s0Var.d = this.f48135c;
        s0Var.e = this.d;
        s0Var.f11266f = Long.valueOf(this.e);
        s0Var.f11267g = Long.valueOf(this.f48136f);
        s0Var.h = this.f48137g;
        return s0Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                String str = aVar.f48137g;
                String str2 = aVar.d;
                String str3 = aVar.f48135c;
                String str4 = aVar.f48133a;
                String str5 = this.f48133a;
                if (str5 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str5.equals(str4)) {
                    return false;
                }
                if (j.b(this.f48134b, aVar.f48134b)) {
                    String str6 = this.f48135c;
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
                    if (this.e == aVar.e && this.f48136f == aVar.f48136f) {
                        String str8 = this.f48137g;
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
        String str = this.f48133a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c10 = (((hashCode ^ 1000003) * 1000003) ^ j.c(this.f48134b)) * 1000003;
        String str2 = this.f48135c;
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
        long j10 = this.e;
        long j11 = this.f48136f;
        int i12 = (((((i11 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f48137g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i10 ^ i12;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f48133a);
        sb2.append(", registrationStatus=");
        int i10 = this.f48134b;
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
        sb2.append(this.f48135c);
        sb2.append(", refreshToken=");
        sb2.append(this.d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f48136f);
        sb2.append(", fisError=");
        return g.r(sb2, this.f48137g, "}");
    }
}
