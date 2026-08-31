package se;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class d {
    public static final Pattern f47296c = Pattern.compile("[0-9]+");
    public int f47297a;
    public ArrayList f47298b;

    public final String a(String str, String str2, String str3, boolean z4) {
        int i10;
        int length = str.length();
        int i11 = this.f47297a;
        if (length >= i11) {
            int i12 = 0;
            Matcher matcher = f47296c.matcher(str.substring(0, i11));
            if (matcher.find()) {
                i10 = Integer.parseInt(matcher.group(0));
            } else {
                i10 = 0;
            }
            ArrayList arrayList = this.f47298b;
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                c cVar = (c) obj;
                if (i10 >= cVar.f47292a && i10 <= cVar.f47293b && str.length() <= cVar.f47294c) {
                    if (z4) {
                        int i14 = cVar.d;
                        if (((i14 & 3) == 0 && str3 == null && str2 == null) || ((str3 != null && (i14 & 1) != 0) || (str2 != null && (i14 & 2) != 0))) {
                            return cVar.a(str, str2, str3);
                        }
                    } else if ((str3 == null && str2 == null) || ((str3 != null && (cVar.d & 1) != 0) || (str2 != null && (cVar.d & 2) != 0))) {
                        return cVar.a(str, str2, str3);
                    }
                }
            }
            if (!z4) {
                if (str2 != null) {
                    ArrayList arrayList2 = this.f47298b;
                    int size2 = arrayList2.size();
                    while (i12 < size2) {
                        Object obj2 = arrayList2.get(i12);
                        i12++;
                        c cVar2 = (c) obj2;
                        if (i10 >= cVar2.f47292a && i10 <= cVar2.f47293b && str.length() <= cVar2.f47294c && (str3 == null || (cVar2.d & 1) != 0)) {
                            return cVar2.a(str, str2, str3);
                        }
                    }
                    return null;
                } else if (str3 != null) {
                    ArrayList arrayList3 = this.f47298b;
                    int size3 = arrayList3.size();
                    while (i12 < size3) {
                        Object obj3 = arrayList3.get(i12);
                        i12++;
                        c cVar3 = (c) obj3;
                        if (i10 >= cVar3.f47292a && i10 <= cVar3.f47293b && str.length() <= cVar3.f47294c && (str2 == null || (cVar3.d & 2) != 0)) {
                            return cVar3.a(str, str2, str3);
                        }
                    }
                    return null;
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }
}
