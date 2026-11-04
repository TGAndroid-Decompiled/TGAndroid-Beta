package r2;

import android.net.Uri;
import b8.zb;
import d2.v0;
import g9.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class w {
    public final v f54231a;
    public final HashMap f54232b;
    public final ArrayList f54233c;
    public String d;

    public w(v vVar, String str, Uri uri, int i3) {
        this.f54231a = vVar;
        HashMap hashMap = new HashMap();
        this.f54232b = hashMap;
        hashMap.put(str, uri);
        this.d = str;
        ArrayList arrayList = new ArrayList();
        this.f54233c = arrayList;
        if (i3 != -1) {
            arrayList.add(Integer.valueOf(i3));
        }
    }

    public static i0 a(List list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (int i3 = 0; i3 < list.size(); i3++) {
            n nVar = (n) list.get(i3);
            Uri uri = nVar.f54171a;
            try {
                d(nVar.f54171a, null, i3, arrayList, new v(nVar.f54172b, nVar.d, nVar.f54173c), hashMap, hashMap2);
            } catch (v0 unused) {
            }
        }
        return i0.q(arrayList);
    }

    public static i0 b(List list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (int i3 = 0; i3 < list.size(); i3++) {
            o oVar = (o) list.get(i3);
            d(oVar.f54174a, oVar.f54179g, i3, arrayList, new v(oVar.f54175b, oVar.h, null), hashMap, hashMap2);
        }
        return i0.q(arrayList);
    }

    public static void d(Uri uri, String str, int i3, ArrayList arrayList, v vVar, HashMap hashMap, HashMap hashMap2) {
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
            w wVar = new w(vVar, str, uri, i3);
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
                zb.c(intValue, "invalid count: %s", z10);
                if (intValue != 0) {
                    str2 = ".";
                } else {
                    str2 = "";
                }
            } else {
                long j10 = 1 * intValue;
                int i12 = (int) j10;
                if (i12 == j10) {
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
                    throw new ArrayIndexOutOfBoundsException(a1.g.p(j10, "Required array size too large: "));
                }
            }
            hashMap2.put(vVar, Integer.valueOf(intValue));
            str = str2;
        }
        w wVar2 = (w) arrayList.get(num.intValue());
        Uri uri2 = (Uri) wVar2.f54232b.get(str);
        if (uri2 != null && !uri.equals(uri2)) {
            throw v0.b("Different playlist URLs are found for pathway ID " + str + " within the HlsRedundantGroup", null);
        }
        wVar2.f54232b.put(str, uri);
        if (i3 != -1) {
            wVar2.f54233c.add(Integer.valueOf(i3));
        }
    }

    public final Uri c() {
        Uri uri = (Uri) this.f54232b.get(this.d);
        uri.getClass();
        return uri;
    }
}
