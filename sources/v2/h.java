package v2;

public final class h extends a {

    public final Integer f48705a;

    public final String f48706b;

    public final String f48707c;
    public final String d;

    public final String f48708e;

    public final String f48709f;

    public final String f48710g;
    public final String h;

    public final String f48711i;

    public final String f48712j;

    public final String f48713k;

    public final String f48714l;

    public h(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f48705a = num;
        this.f48706b = str;
        this.f48707c = str2;
        this.d = str3;
        this.f48708e = str4;
        this.f48709f = str5;
        this.f48710g = str6;
        this.h = str7;
        this.f48711i = str8;
        this.f48712j = str9;
        this.f48713k = str10;
        this.f48714l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.f48705a;
            if (num != null ? num.equals(((h) aVar).f48705a) : ((h) aVar).f48705a == null) {
                String str = this.f48706b;
                if (str != null ? str.equals(((h) aVar).f48706b) : ((h) aVar).f48706b == null) {
                    String str2 = this.f48707c;
                    if (str2 != null ? str2.equals(((h) aVar).f48707c) : ((h) aVar).f48707c == null) {
                        String str3 = this.d;
                        if (str3 != null ? str3.equals(((h) aVar).d) : ((h) aVar).d == null) {
                            String str4 = this.f48708e;
                            if (str4 != null ? str4.equals(((h) aVar).f48708e) : ((h) aVar).f48708e == null) {
                                String str5 = this.f48709f;
                                if (str5 != null ? str5.equals(((h) aVar).f48709f) : ((h) aVar).f48709f == null) {
                                    String str6 = this.f48710g;
                                    if (str6 != null ? str6.equals(((h) aVar).f48710g) : ((h) aVar).f48710g == null) {
                                        String str7 = this.h;
                                        if (str7 != null ? str7.equals(((h) aVar).h) : ((h) aVar).h == null) {
                                            String str8 = this.f48711i;
                                            if (str8 != null ? str8.equals(((h) aVar).f48711i) : ((h) aVar).f48711i == null) {
                                                String str9 = this.f48712j;
                                                if (str9 != null ? str9.equals(((h) aVar).f48712j) : ((h) aVar).f48712j == null) {
                                                    String str10 = this.f48713k;
                                                    if (str10 != null ? str10.equals(((h) aVar).f48713k) : ((h) aVar).f48713k == null) {
                                                        String str11 = this.f48714l;
                                                        if (str11 != null ? str11.equals(((h) aVar).f48714l) : ((h) aVar).f48714l == null) {
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
        Integer num = this.f48705a;
        int iHashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f48706b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f48707c;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f48708e;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f48709f;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f48710g;
        int iHashCode7 = (iHashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.h;
        int iHashCode8 = (iHashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f48711i;
        int iHashCode9 = (iHashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f48712j;
        int iHashCode10 = (iHashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f48713k;
        int iHashCode11 = (iHashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f48714l;
        return (str11 != null ? str11.hashCode() : 0) ^ iHashCode11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f48705a);
        sb2.append(", model=");
        sb2.append(this.f48706b);
        sb2.append(", hardware=");
        sb2.append(this.f48707c);
        sb2.append(", device=");
        sb2.append(this.d);
        sb2.append(", product=");
        sb2.append(this.f48708e);
        sb2.append(", osBuild=");
        sb2.append(this.f48709f);
        sb2.append(", manufacturer=");
        sb2.append(this.f48710g);
        sb2.append(", fingerprint=");
        sb2.append(this.h);
        sb2.append(", locale=");
        sb2.append(this.f48711i);
        sb2.append(", country=");
        sb2.append(this.f48712j);
        sb2.append(", mccMnc=");
        sb2.append(this.f48713k);
        sb2.append(", applicationBuild=");
        return a9.p.p(sb2, this.f48714l, "}");
    }
}
