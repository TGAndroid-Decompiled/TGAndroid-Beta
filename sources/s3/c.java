package s3;

import ab.e;
import f5.w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
public final class c extends e {
    public long f47571b;
    public long[] f47572c;
    public long[] d;

    public static Serializable Q(int i10, w wVar) {
        if (i10 != 0) {
            boolean z10 = false;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 8) {
                            if (i10 != 10) {
                                if (i10 != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.longBitsToDouble(wVar.l()));
                                wVar.D(2);
                                return date;
                            }
                            int u10 = wVar.u();
                            ArrayList arrayList = new ArrayList(u10);
                            for (int i11 = 0; i11 < u10; i11++) {
                                Serializable Q = Q(wVar.r(), wVar);
                                if (Q != null) {
                                    arrayList.add(Q);
                                }
                            }
                            return arrayList;
                        }
                        return R(wVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String S = S(wVar);
                        int r6 = wVar.r();
                        if (r6 == 9) {
                            return hashMap;
                        }
                        Serializable Q2 = Q(r6, wVar);
                        if (Q2 != null) {
                            hashMap.put(S, Q2);
                        }
                    }
                } else {
                    return S(wVar);
                }
            } else {
                if (wVar.r() == 1) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(wVar.l()));
        }
    }

    public static HashMap R(w wVar) {
        int u10 = wVar.u();
        HashMap hashMap = new HashMap(u10);
        for (int i10 = 0; i10 < u10; i10++) {
            String S = S(wVar);
            Serializable Q = Q(wVar.r(), wVar);
            if (Q != null) {
                hashMap.put(S, Q);
            }
        }
        return hashMap;
    }

    public static String S(w wVar) {
        int w10 = wVar.w();
        int i10 = wVar.f6641b;
        wVar.D(w10);
        return new String(wVar.f6640a, i10, w10);
    }
}
