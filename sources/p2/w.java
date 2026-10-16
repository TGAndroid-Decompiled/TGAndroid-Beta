package p2;

import android.net.Uri;
import b2.x0;
import e9.n0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import v7.u6;
public final class w {
    public final v f42684a;
    public final HashMap f42685b;
    public final ArrayList f42686c;
    public String d;

    public w(v vVar, String str, Uri uri, int i10) {
        this.f42684a = vVar;
        HashMap hashMap = new HashMap();
        this.f42685b = hashMap;
        hashMap.put(str, uri);
        this.d = str;
        ArrayList arrayList = new ArrayList();
        this.f42686c = arrayList;
        if (i10 != -1) {
            arrayList.add(Integer.valueOf(i10));
        }
    }

    public static n0 a(List list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            n nVar = (n) list.get(i10);
            Uri uri = nVar.f42627a;
            try {
                d(nVar.f42627a, null, i10, arrayList, new v(nVar.f42628b, nVar.d, nVar.f42629c), hashMap, hashMap2);
            } catch (x0 unused) {
            }
        }
        return n0.u(arrayList);
    }

    public static n0 b(List list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (int i10 = 0; i10 < list.size(); i10++) {
            o oVar = (o) list.get(i10);
            d(oVar.f42630a, oVar.f42634g, i10, arrayList, new v(oVar.f42631b, oVar.h, null), hashMap, hashMap2);
        }
        return n0.u(arrayList);
    }

    public static void d(Uri uri, String str, int i10, ArrayList arrayList, v vVar, HashMap hashMap, HashMap hashMap2) {
        int i11;
        String str2;
        Integer num = (Integer) hashMap.get(vVar);
        boolean z10 = false;
        int i12 = 1;
        if (num == null) {
            hashMap2.put(vVar, 0);
            if (str == null) {
                hashMap2.put(vVar, 1);
                str = ".";
            }
            w wVar = new w(vVar, str, uri, i10);
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
                u6.b(intValue, "invalid count: %s", z10);
                if (intValue != 0) {
                    str2 = ".";
                } else {
                    str2 = "";
                }
            } else {
                long j10 = 1 * intValue;
                int i13 = (int) j10;
                if (i13 == j10) {
                    char[] cArr = new char[i13];
                    ".".getChars(0, 1, cArr, 0);
                    while (true) {
                        i11 = i13 - i12;
                        if (i12 >= i11) {
                            break;
                        }
                        System.arraycopy(cArr, 0, cArr, i12, i12);
                        i12 <<= 1;
                    }
                    System.arraycopy(cArr, 0, cArr, i12, i11);
                    str2 = new String(cArr);
                } else {
                    throw new ArrayIndexOutOfBoundsException(a1.g.o(j10, "Required array size too large: "));
                }
            }
            hashMap2.put(vVar, Integer.valueOf(intValue));
            str = str2;
        }
        w wVar2 = (w) arrayList.get(num.intValue());
        Uri uri2 = (Uri) wVar2.f42685b.get(str);
        if (uri2 != null && !uri.equals(uri2)) {
            throw x0.b("Different playlist URLs are found for pathway ID " + str + " within the HlsRedundantGroup", null);
        }
        wVar2.f42685b.put(str, uri);
        if (i10 != -1) {
            wVar2.f42686c.add(Integer.valueOf(i10));
        }
    }

    public final Uri c() {
        Uri uri = (Uri) this.f42685b.get(this.d);
        uri.getClass();
        return uri;
    }
}
