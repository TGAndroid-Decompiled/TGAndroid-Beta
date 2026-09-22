package ra;

import m1.j;
public final class b {
    public final String f42178a;
    public final int f42179b;
    public final String f42180c;
    public final String d;
    public final long e;
    public final long f42181f;
    public final String f42182g;

    public b(String str, int i10, String str2, String str3, long j3, long j10, String str4) {
        this.f42178a = str;
        this.f42179b = i10;
        this.f42180c = str2;
        this.d = str3;
        this.e = j3;
        this.f42181f = j10;
        this.f42182g = str4;
    }

    public final a a() {
        a aVar = new a(0);
        aVar.f42175c = this.f42178a;
        aVar.f42174b = this.f42179b;
        aVar.d = this.f42180c;
        aVar.e = this.d;
        aVar.f42177g = Long.valueOf(this.e);
        aVar.h = Long.valueOf(this.f42181f);
        aVar.f42176f = this.f42182g;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                String str = bVar.f42182g;
                String str2 = bVar.d;
                String str3 = bVar.f42180c;
                String str4 = bVar.f42178a;
                String str5 = this.f42178a;
                if (str5 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str5.equals(str4)) {
                    return false;
                }
                if (j.b(this.f42179b, bVar.f42179b)) {
                    String str6 = this.f42180c;
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
                    if (this.e == bVar.e && this.f42181f == bVar.f42181f) {
                        String str8 = this.f42182g;
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
        String str = this.f42178a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c10 = (((hashCode ^ 1000003) * 1000003) ^ j.c(this.f42179b)) * 1000003;
        String str2 = this.f42180c;
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
        long j10 = this.f42181f;
        int i12 = (((((i11 ^ hashCode3) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f42182g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i10 ^ i12;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f42178a);
        sb2.append(", registrationStatus=");
        int i10 = this.f42179b;
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
        sb2.append(this.f42180c);
        sb2.append(", refreshToken=");
        sb2.append(this.d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f42181f);
        sb2.append(", fisError=");
        return a4.a.t(sb2, this.f42182g, "}");
    }
}
