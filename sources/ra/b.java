package ra;

import m1.j;
public final class b {
    public final String f45096a;
    public final int f45097b;
    public final String f45098c;
    public final String d;
    public final long f45099e;
    public final long f45100f;
    public final String f45101g;

    public b(String str, int i10, String str2, String str3, long j3, long j10, String str4) {
        this.f45096a = str;
        this.f45097b = i10;
        this.f45098c = str2;
        this.d = str3;
        this.f45099e = j3;
        this.f45100f = j10;
        this.f45101g = str4;
    }

    public final a a() {
        a aVar = new a(0);
        aVar.f45092c = this.f45096a;
        aVar.f45091b = this.f45097b;
        aVar.d = this.f45098c;
        aVar.f45093e = this.d;
        aVar.f45095g = Long.valueOf(this.f45099e);
        aVar.h = Long.valueOf(this.f45100f);
        aVar.f45094f = this.f45101g;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                String str = bVar.f45101g;
                String str2 = bVar.d;
                String str3 = bVar.f45098c;
                String str4 = bVar.f45096a;
                String str5 = this.f45096a;
                if (str5 == null) {
                    if (str4 != null) {
                        return false;
                    }
                } else if (!str5.equals(str4)) {
                    return false;
                }
                if (j.b(this.f45097b, bVar.f45097b)) {
                    String str6 = this.f45098c;
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
                    if (this.f45099e == bVar.f45099e && this.f45100f == bVar.f45100f) {
                        String str8 = this.f45101g;
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
        String str = this.f45096a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c10 = (((hashCode ^ 1000003) * 1000003) ^ j.c(this.f45097b)) * 1000003;
        String str2 = this.f45098c;
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
        long j3 = this.f45099e;
        long j10 = this.f45100f;
        int i12 = (((((i11 ^ hashCode3) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f45101g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i10 ^ i12;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f45096a);
        sb2.append(", registrationStatus=");
        int i10 = this.f45097b;
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
        sb2.append(this.f45098c);
        sb2.append(", refreshToken=");
        sb2.append(this.d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.f45099e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f45100f);
        sb2.append(", fisError=");
        return a4.a.s(sb2, this.f45101g, "}");
    }
}
