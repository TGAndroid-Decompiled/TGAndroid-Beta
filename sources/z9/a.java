package z9;

import aa.d;
import m1.j;
public final class a {
    public final String f50387a;
    public final int f50388b;
    public final String f50389c;
    public final String d;
    public final long f50390e;
    public final long f50391f;
    public final String f50392g;

    public a(String str, int i9, String str2, String str3, long j10, long j11, String str4) {
        this.f50387a = str;
        this.f50388b = i9;
        this.f50389c = str2;
        this.d = str3;
        this.f50390e = j10;
        this.f50391f = j11;
        this.f50392g = str4;
    }

    public final f2.b a() {
        f2.b bVar = new f2.b(1);
        bVar.f5317c = this.f50387a;
        bVar.f5316b = this.f50388b;
        bVar.d = this.f50389c;
        bVar.f5318e = this.d;
        bVar.f5319f = Long.valueOf(this.f50390e);
        bVar.f5320g = Long.valueOf(this.f50391f);
        bVar.h = this.f50392g;
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                String str = aVar.f50392g;
                String str2 = aVar.d;
                String str3 = aVar.f50389c;
                String str4 = aVar.f50387a;
                String str5 = this.f50387a;
                if (str5 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str5.equals(str4)) {
                    return false;
                }
                if (j.a(this.f50388b, aVar.f50388b)) {
                    String str6 = this.f50389c;
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
                    if (this.f50390e == aVar.f50390e && this.f50391f == aVar.f50391f) {
                        String str8 = this.f50392g;
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
        int i9 = 0;
        String str = this.f50387a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int b10 = (((hashCode ^ 1000003) * 1000003) ^ j.b(this.f50388b)) * 1000003;
        String str2 = this.f50389c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (b10 ^ hashCode2) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j10 = this.f50390e;
        long j11 = this.f50391f;
        int i11 = (((((i10 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f50392g;
        if (str4 != null) {
            i9 = str4.hashCode();
        }
        return i9 ^ i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f50387a);
        sb2.append(", registrationStatus=");
        int i9 = this.f50388b;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
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
        sb2.append(this.f50389c);
        sb2.append(", refreshToken=");
        sb2.append(this.d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f50390e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f50391f);
        sb2.append(", fisError=");
        return d.r(sb2, this.f50392g, "}");
    }
}
