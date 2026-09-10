package ra;

import m1.j;
import qg.m0;
public final class a {
    public final String f41392a;
    public final int f41393b;
    public final String f41394c;
    public final String d;
    public final long e;
    public final long f41395f;
    public final String f41396g;

    public a(String str, int i10, String str2, String str3, long j3, long j10, String str4) {
        this.f41392a = str;
        this.f41393b = i10;
        this.f41394c = str2;
        this.d = str3;
        this.e = j3;
        this.f41395f = j10;
        this.f41396g = str4;
    }

    public final m0 a() {
        m0 m0Var = new m0(1);
        m0Var.f40809c = this.f41392a;
        m0Var.f40808b = this.f41393b;
        m0Var.d = this.f41394c;
        m0Var.e = this.d;
        m0Var.f40810f = Long.valueOf(this.e);
        m0Var.f40811g = Long.valueOf(this.f41395f);
        m0Var.h = this.f41396g;
        return m0Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                String str = aVar.f41396g;
                String str2 = aVar.d;
                String str3 = aVar.f41394c;
                String str4 = aVar.f41392a;
                String str5 = this.f41392a;
                if (str5 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str5.equals(str4)) {
                    return false;
                }
                if (j.b(this.f41393b, aVar.f41393b)) {
                    String str6 = this.f41394c;
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
                    if (this.e == aVar.e && this.f41395f == aVar.f41395f) {
                        String str8 = this.f41396g;
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
        String str = this.f41392a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c10 = (((hashCode ^ 1000003) * 1000003) ^ j.c(this.f41393b)) * 1000003;
        String str2 = this.f41394c;
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
        long j3 = this.e;
        long j10 = this.f41395f;
        int i12 = (((((i11 ^ hashCode3) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f41396g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i10 ^ i12;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f41392a);
        sb2.append(", registrationStatus=");
        int i10 = this.f41393b;
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
        sb2.append(this.f41394c);
        sb2.append(", refreshToken=");
        sb2.append(this.d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f41395f);
        sb2.append(", fisError=");
        return a4.a.s(sb2, this.f41396g, "}");
    }
}
