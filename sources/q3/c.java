package q3;

import d5.y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
public final class c extends a8.a {
    public long f46000b;
    public long[] f46001c;
    public long[] d;

    public static Serializable Q(int i9, y yVar) {
        if (i9 != 0) {
            boolean z10 = false;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 != 8) {
                            if (i9 != 10) {
                                if (i9 != 11) {
                                    return null;
                                }
                                Date date = new Date((long) Double.longBitsToDouble(yVar.l()));
                                yVar.D(2);
                                return date;
                            }
                            int u10 = yVar.u();
                            ArrayList arrayList = new ArrayList(u10);
                            for (int i10 = 0; i10 < u10; i10++) {
                                Serializable Q = Q(yVar.r(), yVar);
                                if (Q != null) {
                                    arrayList.add(Q);
                                }
                            }
                            return arrayList;
                        }
                        return R(yVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String S = S(yVar);
                        int r10 = yVar.r();
                        if (r10 == 9) {
                            return hashMap;
                        }
                        Serializable Q2 = Q(r10, yVar);
                        if (Q2 != null) {
                            hashMap.put(S, Q2);
                        }
                    }
                } else {
                    return S(yVar);
                }
            } else {
                if (yVar.r() == 1) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        } else {
            return Double.valueOf(Double.longBitsToDouble(yVar.l()));
        }
    }

    public static HashMap R(y yVar) {
        int u10 = yVar.u();
        HashMap hashMap = new HashMap(u10);
        for (int i9 = 0; i9 < u10; i9++) {
            String S = S(yVar);
            Serializable Q = Q(yVar.r(), yVar);
            if (Q != null) {
                hashMap.put(S, Q);
            }
        }
        return hashMap;
    }

    public static String S(y yVar) {
        int w8 = yVar.w();
        int i9 = yVar.f4411b;
        yVar.D(w8);
        return new String(yVar.f4410a, i9, w8);
    }
}
