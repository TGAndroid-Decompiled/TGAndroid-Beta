package pf;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class d {
    public static final Pattern f53595c = Pattern.compile("[0-9]+");
    public int f53596a;
    public ArrayList f53597b;

    public final String a(String str, String str2, String str3, boolean z9) {
        int i7;
        int length = str.length();
        int i10 = this.f53596a;
        if (length >= i10) {
            int i11 = 0;
            Matcher matcher = f53595c.matcher(str.substring(0, i10));
            if (matcher.find()) {
                i7 = Integer.parseInt(matcher.group(0));
            } else {
                i7 = 0;
            }
            ArrayList arrayList = this.f53597b;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                c cVar = (c) obj;
                if (i7 >= cVar.f53591a && i7 <= cVar.f53592b && str.length() <= cVar.f53593c) {
                    if (z9) {
                        int i13 = cVar.d;
                        if (((i13 & 3) == 0 && str3 == null && str2 == null) || ((str3 != null && (i13 & 1) != 0) || (str2 != null && (i13 & 2) != 0))) {
                            return cVar.a(str, str2, str3);
                        }
                    } else if ((str3 == null && str2 == null) || ((str3 != null && (cVar.d & 1) != 0) || (str2 != null && (cVar.d & 2) != 0))) {
                        return cVar.a(str, str2, str3);
                    }
                }
            }
            if (!z9) {
                if (str2 != null) {
                    ArrayList arrayList2 = this.f53597b;
                    int size2 = arrayList2.size();
                    while (i11 < size2) {
                        Object obj2 = arrayList2.get(i11);
                        i11++;
                        c cVar2 = (c) obj2;
                        if (i7 >= cVar2.f53591a && i7 <= cVar2.f53592b && str.length() <= cVar2.f53593c && (str3 == null || (cVar2.d & 1) != 0)) {
                            return cVar2.a(str, str2, str3);
                        }
                    }
                    return null;
                } else if (str3 != null) {
                    ArrayList arrayList3 = this.f53597b;
                    int size3 = arrayList3.size();
                    while (i11 < size3) {
                        Object obj3 = arrayList3.get(i11);
                        i11++;
                        c cVar3 = (c) obj3;
                        if (i7 >= cVar3.f53591a && i7 <= cVar3.f53592b && str.length() <= cVar3.f53593c && (str2 == null || (cVar3.d & 2) != 0)) {
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
