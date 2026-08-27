package q3;

import d5.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public final class c extends b8.a {

    public long f46164b;

    public long[] f46165c;
    public long[] d;

    public static Serializable Q(int i10, z zVar) {
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(zVar.l()));
        }
        if (i10 == 1) {
            return Boolean.valueOf(zVar.r() == 1);
        }
        if (i10 == 2) {
            return S(zVar);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return R(zVar);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(zVar.l()));
                zVar.D(2);
                return date;
            }
            int iU = zVar.u();
            ArrayList arrayList = new ArrayList(iU);
            for (int i11 = 0; i11 < iU; i11++) {
                Serializable serializableQ = Q(zVar.r(), zVar);
                if (serializableQ != null) {
                    arrayList.add(serializableQ);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strS = S(zVar);
            int iR = zVar.r();
            if (iR == 9) {
                return map;
            }
            Serializable serializableQ2 = Q(iR, zVar);
            if (serializableQ2 != null) {
                map.put(strS, serializableQ2);
            }
        }
    }

    public static HashMap R(z zVar) {
        int iU = zVar.u();
        HashMap map = new HashMap(iU);
        for (int i10 = 0; i10 < iU; i10++) {
            String strS = S(zVar);
            Serializable serializableQ = Q(zVar.r(), zVar);
            if (serializableQ != null) {
                map.put(strS, serializableQ);
            }
        }
        return map;
    }

    public static String S(z zVar) {
        int iW = zVar.w();
        int i10 = zVar.f4859b;
        zVar.D(iW);
        return new String(zVar.f4858a, i10, iW);
    }
}
