package ra;

import m1.j;
public final class b {
    public final String f42465a;
    public final int f42466b;
    public final String f42467c;
    public final String d;
    public final long e;
    public final long f42468f;
    public final String f42469g;

    public b(String str, int i10, String str2, String str3, long j3, long j10, String str4) {
        this.f42465a = str;
        this.f42466b = i10;
        this.f42467c = str2;
        this.d = str3;
        this.e = j3;
        this.f42468f = j10;
        this.f42469g = str4;
    }

    public final a a() {
        a aVar = new a(0);
        aVar.f42462c = this.f42465a;
        aVar.f42461b = this.f42466b;
        aVar.d = this.f42467c;
        aVar.e = this.d;
        aVar.f42464g = Long.valueOf(this.e);
        aVar.h = Long.valueOf(this.f42468f);
        aVar.f42463f = this.f42469g;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                String str = bVar.f42469g;
                String str2 = bVar.d;
                String str3 = bVar.f42467c;
                String str4 = bVar.f42465a;
                String str5 = this.f42465a;
                if (str5 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str5.equals(str4)) {
                    return false;
                }
                if (j.b(this.f42466b, bVar.f42466b)) {
                    String str6 = this.f42467c;
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
                    if (this.e == bVar.e && this.f42468f == bVar.f42468f) {
                        String str8 = this.f42469g;
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
        String str = this.f42465a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c10 = (((hashCode ^ 1000003) * 1000003) ^ j.c(this.f42466b)) * 1000003;
        String str2 = this.f42467c;
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
        long j10 = this.f42468f;
        int i12 = (((((i11 ^ hashCode3) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f42469g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i10 ^ i12;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f42465a);
        sb2.append(", registrationStatus=");
        int i10 = this.f42466b;
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
        sb2.append(this.f42467c);
        sb2.append(", refreshToken=");
        sb2.append(this.d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f42468f);
        sb2.append(", fisError=");
        return a4.a.t(sb2, this.f42469g, "}");
    }
}
