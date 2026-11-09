package wa;

import a8.p0;
import p1.g;
public final class b {
    public static final int h = 0;
    public final String f57640a;
    public final int f57641b;
    public final String f57642c;
    public final String d;
    public final long f57643e;
    public final long f57644f;
    public final String f57645g;

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
        this.f57640a = str;
        this.f57641b = i7;
        this.f57642c = str2;
        this.d = str3;
        this.f57643e = j3;
        this.f57644f = j10;
        this.f57645g = str4;
    }

    public final a a() {
        ?? obj = new Object();
        obj.f57634a = this.f57640a;
        obj.f57635b = this.f57641b;
        obj.f57636c = this.f57642c;
        obj.d = this.d;
        obj.f57637e = this.f57643e;
        obj.f57638f = this.f57644f;
        obj.f57639g = this.f57645g;
        obj.h = (byte) 3;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                String str = bVar.f57645g;
                String str2 = bVar.d;
                String str3 = bVar.f57642c;
                String str4 = bVar.f57640a;
                String str5 = this.f57640a;
                if (str5 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str5.equals(str4)) {
                    return false;
                }
                if (g.b(this.f57641b, bVar.f57641b)) {
                    String str6 = this.f57642c;
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
                    if (this.f57643e == bVar.f57643e && this.f57644f == bVar.f57644f) {
                        String str8 = this.f57645g;
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
        String str = this.f57640a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c10 = (((hashCode ^ 1000003) * 1000003) ^ g.c(this.f57641b)) * 1000003;
        String str2 = this.f57642c;
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
        long j3 = this.f57643e;
        long j10 = this.f57644f;
        int i11 = (((((i10 ^ hashCode3) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f57645g;
        if (str4 != null) {
            i7 = str4.hashCode();
        }
        return i7 ^ i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f57640a);
        sb2.append(", registrationStatus=");
        int i7 = this.f57641b;
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
        sb2.append(this.f57642c);
        sb2.append(", refreshToken=");
        sb2.append(this.d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f57643e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f57644f);
        sb2.append(", fisError=");
        return p0.s(sb2, this.f57645g, "}");
    }
}
