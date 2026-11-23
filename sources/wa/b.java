package wa;

import a8.p0;
import p1.g;
public final class b {
    public static final int h = 0;
    public final String f59653a;
    public final int f59654b;
    public final String f59655c;
    public final String d;
    public final long f59656e;
    public final long f59657f;
    public final String f59658g;

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
        this.f59653a = str;
        this.f59654b = i7;
        this.f59655c = str2;
        this.d = str3;
        this.f59656e = j3;
        this.f59657f = j10;
        this.f59658g = str4;
    }

    public final a a() {
        ?? obj = new Object();
        obj.f59647a = this.f59653a;
        obj.f59648b = this.f59654b;
        obj.f59649c = this.f59655c;
        obj.d = this.d;
        obj.f59650e = this.f59656e;
        obj.f59651f = this.f59657f;
        obj.f59652g = this.f59658g;
        obj.h = (byte) 3;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                String str = bVar.f59658g;
                String str2 = bVar.d;
                String str3 = bVar.f59655c;
                String str4 = bVar.f59653a;
                String str5 = this.f59653a;
                if (str5 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str5.equals(str4)) {
                    return false;
                }
                if (g.b(this.f59654b, bVar.f59654b)) {
                    String str6 = this.f59655c;
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
                    if (this.f59656e == bVar.f59656e && this.f59657f == bVar.f59657f) {
                        String str8 = this.f59658g;
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
        String str = this.f59653a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c10 = (((hashCode ^ 1000003) * 1000003) ^ g.c(this.f59654b)) * 1000003;
        String str2 = this.f59655c;
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
        long j3 = this.f59656e;
        long j10 = this.f59657f;
        int i11 = (((((i10 ^ hashCode3) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f59658g;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i7 ^ i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f59653a);
        sb2.append(", registrationStatus=");
        int i7 = this.f59654b;
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
        sb2.append(this.f59655c);
        sb2.append(", refreshToken=");
        sb2.append(this.d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f59656e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f59657f);
        sb2.append(", fisError=");
        return p0.s(sb2, this.f59658g, "}");
    }
}
