package wa;

import a8.p0;
import p1.g;
public final class b {
    public static final int h = 0;
    public final String f59646a;
    public final int f59647b;
    public final String f59648c;
    public final String d;
    public final long f59649e;
    public final long f59650f;
    public final String f59651g;

    static {
        byte b10 = (byte) (((byte) (0 | 2)) | 1);
        if (b10 == 3) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" expiresInSecs");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" tokenCreationEpochInSecs");
        }
        throw new IllegalStateException(p0.q("Missing required properties:", sb2));
    }

    public b(String str, int i7, String str2, String str3, long j3, long j10, String str4) {
        this.f59646a = str;
        this.f59647b = i7;
        this.f59648c = str2;
        this.d = str3;
        this.f59649e = j3;
        this.f59650f = j10;
        this.f59651g = str4;
    }

    public final a a() {
        ?? obj = new Object();
        obj.f59640a = this.f59646a;
        obj.f59641b = this.f59647b;
        obj.f59642c = this.f59648c;
        obj.d = this.d;
        obj.f59643e = this.f59649e;
        obj.f59644f = this.f59650f;
        obj.f59645g = this.f59651g;
        obj.h = (byte) 3;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                String str = bVar.f59651g;
                String str2 = bVar.d;
                String str3 = bVar.f59648c;
                String str4 = bVar.f59646a;
                String str5 = this.f59646a;
                if (str5 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str5.equals(str4)) {
                    return false;
                }
                if (g.b(this.f59647b, bVar.f59647b)) {
                    String str6 = this.f59648c;
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
                    if (this.f59649e == bVar.f59649e && this.f59650f == bVar.f59650f) {
                        String str8 = this.f59651g;
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
        int i7 = 0;
        String str = this.f59646a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c10 = (((hashCode ^ 1000003) * 1000003) ^ g.c(this.f59647b)) * 1000003;
        String str2 = this.f59648c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (c10 ^ hashCode2) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j3 = this.f59649e;
        long j10 = this.f59650f;
        int i11 = (((((i10 ^ hashCode3) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f59651g;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i7 ^ i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f59646a);
        sb2.append(", registrationStatus=");
        int i7 = this.f59647b;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
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
        sb2.append(this.f59648c);
        sb2.append(", refreshToken=");
        sb2.append(this.d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f59649e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f59650f);
        sb2.append(", fisError=");
        return p0.s(sb2, this.f59651g, "}");
    }
}
