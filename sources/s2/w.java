package s2;

import a8.ia;
import a8.p0;
import android.net.Uri;
import e2.t0;
import h9.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class w {
    public final v f54673a;
    public final HashMap f54674b;
    public final ArrayList f54675c;
    public String d;

    public w(v vVar, String str, Uri uri, int i7) {
        this.f54673a = vVar;
        HashMap hashMap = new HashMap();
        this.f54674b = hashMap;
        hashMap.put(str, uri);
        this.d = str;
        ArrayList arrayList = new ArrayList();
        this.f54675c = arrayList;
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
            Uri uri = nVar.f54613a;
            try {
                d(nVar.f54613a, null, i7, arrayList, new v(nVar.f54614b, nVar.d, nVar.f54615c), hashMap, hashMap2);
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
            d(oVar.f54616a, oVar.f54621g, i7, arrayList, new v(oVar.f54617b, oVar.h, null), hashMap, hashMap2);
        }
        return i0.q(arrayList);
    }

    public static void d(Uri uri, String str, int i7, ArrayList arrayList, v vVar, HashMap hashMap, HashMap hashMap2) {
        int i10;
        String str2;
        Integer num = (Integer) hashMap.get(vVar);
        boolean z9 = false;
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
                    z9 = true;
                }
                ia.c(intValue, "invalid count: %s", z9);
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
        Uri uri2 = (Uri) wVar2.f54674b.get(str);
        if (uri2 != null && !uri.equals(uri2)) {
            throw t0.b("Different playlist URLs are found for pathway ID " + str + " within the HlsRedundantGroup", null);
        }
        wVar2.f54674b.put(str, uri);
        if (i7 != -1) {
            wVar2.f54675c.add(Integer.valueOf(i7));
        }
    }

    public final Uri c() {
        Uri uri = (Uri) this.f54674b.get(this.d);
        uri.getClass();
        return uri;
    }
}
