package va;

import o1.g;
public final class b {
    public static final int h = 0;
    public final String f56492a;
    public final int f56493b;
    public final String f56494c;
    public final String d;
    public final long f56495e;
    public final long f56496f;
    public final String f56497g;

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
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }

    public b(String str, int i3, String str2, String str3, long j10, long j11, String str4) {
        this.f56492a = str;
        this.f56493b = i3;
        this.f56494c = str2;
        this.d = str3;
        this.f56495e = j10;
        this.f56496f = j11;
        this.f56497g = str4;
    }

    public final a a() {
        ?? obj = new Object();
        obj.f56486a = this.f56492a;
        obj.f56487b = this.f56493b;
        obj.f56488c = this.f56494c;
        obj.d = this.d;
        obj.f56489e = this.f56495e;
        obj.f56490f = this.f56496f;
        obj.f56491g = this.f56497g;
        obj.h = (byte) 3;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                String str = bVar.f56497g;
                String str2 = bVar.d;
                String str3 = bVar.f56494c;
                String str4 = bVar.f56492a;
                String str5 = this.f56492a;
                if (str5 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str5.equals(str4)) {
                    return false;
                }
                if (g.b(this.f56493b, bVar.f56493b)) {
                    String str6 = this.f56494c;
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
                    if (this.f56495e == bVar.f56495e && this.f56496f == bVar.f56496f) {
                        String str8 = this.f56497g;
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
        int i3 = 0;
        String str = this.f56492a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c2 = (((hashCode ^ 1000003) * 1000003) ^ g.c(this.f56493b)) * 1000003;
        String str2 = this.f56494c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (c2 ^ hashCode2) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j10 = this.f56495e;
        long j11 = this.f56496f;
        int i11 = (((((i10 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f56497g;
        if (str4 != null) {
            i3 = str4.hashCode();
        }
        return i3 ^ i11;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f56492a);
        sb2.append(", registrationStatus=");
        int i3 = this.f56493b;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
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
        sb2.append(this.f56494c);
        sb2.append(", refreshToken=");
        sb2.append(this.d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f56495e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f56496f);
        sb2.append(", fisError=");
        return a1.g.s(sb2, this.f56497g, "}");
    }
}
