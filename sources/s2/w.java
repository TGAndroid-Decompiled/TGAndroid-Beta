package s2;

import a8.la;
import a8.p0;
import android.net.Uri;
import e2.t0;
import h9.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class w {
    public final v f56950a;
    public final HashMap f56951b;
    public final ArrayList f56952c;
    public String d;

    public w(v vVar, String str, Uri uri, int i7) {
        this.f56950a = vVar;
        HashMap hashMap = new HashMap();
        this.f56951b = hashMap;
        hashMap.put(str, uri);
        this.d = str;
        ArrayList arrayList = new ArrayList();
        this.f56952c = arrayList;
        if (i7 != -1) {
            arrayList.add(Integer.valueOf(i7));
        }
    }

    public static i0 a(List list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (int i7 = 0; i7 < list.size(); i7++) {
            n nVar = (n) list.get(i7);
            Uri uri = nVar.f56890a;
            try {
                d(nVar.f56890a, null, i7, arrayList, new v(nVar.f56891b, nVar.d, nVar.f56892c), hashMap, hashMap2);
            } catch (t0 unused) {
            }
        }
        return i0.q(arrayList);
    }

    public static i0 b(List list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (int i7 = 0; i7 < list.size(); i7++) {
            o oVar = (o) list.get(i7);
            d(oVar.f56893a, oVar.f56898g, i7, arrayList, new v(oVar.f56894b, oVar.h, null), hashMap, hashMap2);
        }
        return i0.q(arrayList);
    }

    public static void d(Uri uri, String str, int i7, ArrayList arrayList, v vVar, HashMap hashMap, HashMap hashMap2) {
        int i10;
        String str2;
        Integer num = (Integer) hashMap.get(vVar);
        boolean z10 = false;
        int i11 = 1;
        if (num == null) {
            hashMap2.put(vVar, 0);
            if (str == null) {
                hashMap2.put(vVar, 1);
                str = ".";
            }
            w wVar = new w(vVar, str, uri, i7);
            hashMap.put(vVar, Integer.valueOf(arrayList.size()));
            arrayList.add(wVar);
            return;
        }
        if (str == null) {
            Integer num2 = (Integer) hashMap2.get(vVar);
            num2.getClass();
            int intValue = num2.intValue() + 1;
            if (intValue <= 1) {
                if (intValue >= 0) {
                    z10 = true;
                }
                la.c(intValue, "invalid count: %s", z10);
                if (intValue != 0) {
                    str2 = ".";
                } else {
                    str2 = "";
                }
            } else {
                long j3 = 1 * intValue;
                int i12 = (int) j3;
                if (i12 == j3) {
                    char[] cArr = new char[i12];
                    ".".getChars(0, 1, cArr, 0);
                    while (true) {
                        i10 = i12 - i11;
                        if (i11 >= i10) {
                            break;
                        }
                        System.arraycopy(cArr, 0, cArr, i11, i11);
                        i11 <<= 1;
                    }
                    System.arraycopy(cArr, 0, cArr, i11, i10);
                    str2 = new String(cArr);
                } else {
                    throw new ArrayIndexOutOfBoundsException(p0.o(j3, "Required array size too large: "));
                }
            }
            hashMap2.put(vVar, Integer.valueOf(intValue));
            str = str2;
        }
        w wVar2 = (w) arrayList.get(num.intValue());
        Uri uri2 = (Uri) wVar2.f56951b.get(str);
        if (uri2 != null && !uri.equals(uri2)) {
            throw t0.b("Different playlist URLs are found for pathway ID " + str + " within the HlsRedundantGroup", null);
        }
        wVar2.f56951b.put(str, uri);
        if (i7 != -1) {
            wVar2.f56952c.add(Integer.valueOf(i7));
        }
    }

    public final Uri c() {
        Uri uri = (Uri) this.f56951b.get(this.d);
        uri.getClass();
        return uri;
    }
}
