package x2;
public final class h extends a {
    public final Integer f46673a;
    public final String f46674b;
    public final String f46675c;
    public final String d;
    public final String e;
    public final String f46676f;
    public final String f46677g;
    public final String h;
    public final String f46678i;
    public final String f46679j;
    public final String f46680k;
    public final String f46681l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f46673a = num;
        this.f46674b = str;
        this.f46675c = str2;
        this.d = str3;
        this.e = str4;
        this.f46676f = str5;
        this.f46677g = str6;
        this.h = str7;
        this.f46678i = str8;
        this.f46679j = str9;
        this.f46680k = str10;
        this.f46681l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f46673a;
            if (num != null ? num.equals(((h) aVar).f46673a) : ((h) aVar).f46673a == null) {
                String str = this.f46674b;
                if (str != null ? str.equals(((h) aVar).f46674b) : ((h) aVar).f46674b == null) {
                    String str2 = this.f46675c;
                    if (str2 != null ? str2.equals(((h) aVar).f46675c) : ((h) aVar).f46675c == null) {
                        String str3 = this.d;
                        if (str3 != null ? str3.equals(((h) aVar).d) : ((h) aVar).d == null) {
                            String str4 = this.e;
                            if (str4 != null ? str4.equals(((h) aVar).e) : ((h) aVar).e == null) {
                                String str5 = this.f46676f;
                                if (str5 != null ? str5.equals(((h) aVar).f46676f) : ((h) aVar).f46676f == null) {
                                    String str6 = this.f46677g;
                                    if (str6 != null ? str6.equals(((h) aVar).f46677g) : ((h) aVar).f46677g == null) {
                                        String str7 = this.h;
                                        if (str7 != null ? str7.equals(((h) aVar).h) : ((h) aVar).h == null) {
                                            String str8 = this.f46678i;
                                            if (str8 != null ? str8.equals(((h) aVar).f46678i) : ((h) aVar).f46678i == null) {
                                                String str9 = this.f46679j;
                                                if (str9 != null ? str9.equals(((h) aVar).f46679j) : ((h) aVar).f46679j == null) {
                                                    String str10 = this.f46680k;
                                                    if (str10 != null ? str10.equals(((h) aVar).f46680k) : ((h) aVar).f46680k == null) {
                                                        String str11 = this.f46681l;
                                                        if (str11 != null ? str11.equals(((h) aVar).f46681l) : ((h) aVar).f46681l == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int i10 = 0;
        Integer num = this.f46673a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (hashCode ^ 1000003) * 1000003;
        String str = this.f46674b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        String str2 = this.f46675c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i13 = (i12 ^ hashCode3) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i14 = (i13 ^ hashCode4) * 1000003;
        String str4 = this.e;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i15 = (i14 ^ hashCode5) * 1000003;
        String str5 = this.f46676f;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i16 = (i15 ^ hashCode6) * 1000003;
        String str6 = this.f46677g;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i17 = (i16 ^ hashCode7) * 1000003;
        String str7 = this.h;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i18 = (i17 ^ hashCode8) * 1000003;
        String str8 = this.f46678i;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i19 = (i18 ^ hashCode9) * 1000003;
        String str9 = this.f46679j;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i20 = (i19 ^ hashCode10) * 1000003;
        String str10 = this.f46680k;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i21 = (i20 ^ hashCode11) * 1000003;
        String str11 = this.f46681l;
        if (str11 != null) {
            i10 = str11.hashCode();
        }
        return i10 ^ i21;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f46673a);
        sb.append(", model=");
        sb.append(this.f46674b);
        sb.append(", hardware=");
        sb.append(this.f46675c);
        sb.append(", device=");
        sb.append(this.d);
        sb.append(", product=");
        sb.append(this.e);
        sb.append(", osBuild=");
        sb.append(this.f46676f);
        sb.append(", manufacturer=");
        sb.append(this.f46677g);
        sb.append(", fingerprint=");
        sb.append(this.h);
        sb.append(", locale=");
        sb.append(this.f46678i);
        sb.append(", country=");
        sb.append(this.f46679j);
        sb.append(", mccMnc=");
        sb.append(this.f46680k);
        sb.append(", applicationBuild=");
        return android.support.v4.media.a.r(sb, this.f46681l, "}");
    }
}
