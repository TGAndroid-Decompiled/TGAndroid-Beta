package ra;

import m1.j;
public final class b {
    public final String f42480a;
    public final int f42481b;
    public final String f42482c;
    public final String d;
    public final long e;
    public final long f42483f;
    public final String f42484g;

    public b(String str, int i10, String str2, String str3, long j3, long j10, String str4) {
        this.f42480a = str;
        this.f42481b = i10;
        this.f42482c = str2;
        this.d = str3;
        this.e = j3;
        this.f42483f = j10;
        this.f42484g = str4;
    }

    public final a a() {
        a aVar = new a(0);
        aVar.f42477c = this.f42480a;
        aVar.f42476b = this.f42481b;
        aVar.d = this.f42482c;
        aVar.e = this.d;
        aVar.f42479g = Long.valueOf(this.e);
        aVar.h = Long.valueOf(this.f42483f);
        aVar.f42478f = this.f42484g;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                String str = bVar.f42484g;
                String str2 = bVar.d;
                String str3 = bVar.f42482c;
                String str4 = bVar.f42480a;
                String str5 = this.f42480a;
                if (str5 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str5.equals(str4)) {
                    return false;
                }
                if (j.b(this.f42481b, bVar.f42481b)) {
                    String str6 = this.f42482c;
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
                    if (this.e == bVar.e && this.f42483f == bVar.f42483f) {
                        String str8 = this.f42484g;
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
        String str = this.f42480a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c10 = (((hashCode ^ 1000003) * 1000003) ^ j.c(this.f42481b)) * 1000003;
        String str2 = this.f42482c;
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
        long j10 = this.f42483f;
        int i12 = (((((i11 ^ hashCode3) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f42484g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i10 ^ i12;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f42480a);
        sb2.append(", registrationStatus=");
        int i10 = this.f42481b;
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
        sb2.append(this.f42482c);
        sb2.append(", refreshToken=");
        sb2.append(this.d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f42483f);
        sb2.append(", fisError=");
        return a4.a.s(sb2, this.f42484g, "}");
    }
}
