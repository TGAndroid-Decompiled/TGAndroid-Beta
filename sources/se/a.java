package se;

import java.util.ArrayList;
public final class a {
    public String f47312a;
    public ArrayList f47313b;
    public ArrayList f47314c;
    public ArrayList d;

    public final String a(String str) {
        String str2;
        String str3;
        String str4;
        String str5 = null;
        if (str.startsWith(this.f47312a)) {
            str4 = this.f47312a;
            str3 = str.substring(str4.length());
        } else {
            ArrayList arrayList = this.f47313b;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    str2 = (String) obj;
                    if (str.startsWith(str2)) {
                        break;
                    }
                } else {
                    str2 = null;
                    break;
                }
            }
            if (str2 != null) {
                str3 = str.substring(str2.length());
                str4 = null;
                str5 = str2;
            } else {
                str3 = str;
                str4 = null;
            }
        }
        ArrayList arrayList2 = this.d;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            String a2 = ((d) obj2).a(str3, str4, str5, true);
            if (a2 != null) {
                return a2;
            }
        }
        ArrayList arrayList3 = this.d;
        int size3 = arrayList3.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList3.get(i12);
            i12++;
            String a10 = ((d) obj3).a(str3, str4, str5, false);
            if (a10 != null) {
                return a10;
            }
        }
        if (str4 != null && str3.length() != 0) {
            return android.support.v4.media.a.z(str4, " ", str3);
        }
        return str;
    }
}
