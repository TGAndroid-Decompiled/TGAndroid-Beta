package y6;

import com.google.android.gms.internal.cast.x4;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public final class z0 extends c1 {

    public final int f49796a;

    public final r f49797b;

    public z0(r rVar) throws x4 {
        rVar.getClass();
        this.f49797b = rVar;
        d0 d0VarP = rVar.entrySet().p();
        int i10 = 0;
        while (d0VarP.hasNext()) {
            Map.Entry entry = (Map.Entry) d0VarP.next();
            int iA = ((c1) entry.getKey()).a();
            i10 = i10 < iA ? iA : i10;
            int iA2 = ((c1) entry.getValue()).a();
            if (i10 < iA2) {
                i10 = iA2;
            }
        }
        int i11 = i10 + 1;
        this.f49796a = i11;
        if (i11 > 8) {
            throw new x4("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override
    public final int a() {
        return this.f49796a;
    }

    @Override
    public final int compareTo(Object obj) {
        int iCompareTo;
        c1 c1Var = (c1) obj;
        int iZza = c1Var.zza();
        int iC = c1.c((byte) -96);
        if (iC != iZza) {
            return iC - c1Var.zza();
        }
        r rVar = ((z0) c1Var).f49797b;
        r rVar2 = this.f49797b;
        if (rVar2.d.size() != rVar.d.size()) {
            return rVar2.d.size() - rVar.d.size();
        }
        d0 d0VarP = rVar2.entrySet().p();
        d0 d0VarP2 = rVar.entrySet().p();
        do {
            if (!d0VarP.hasNext() && !d0VarP2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) d0VarP.next();
            Map.Entry entry2 = (Map.Entry) d0VarP2.next();
            int iCompareTo2 = ((c1) entry.getKey()).compareTo((c1) entry2.getKey());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            iCompareTo = ((c1) entry.getValue()).compareTo((c1) entry2.getValue());
        } while (iCompareTo == 0);
        return iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z0.class == obj.getClass()) {
            return this.f49797b.equals(((z0) obj).f49797b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c((byte) -96)), this.f49797b});
    }

    public final String toString() {
        r rVar = this.f49797b;
        if (rVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d0 d0VarP = rVar.entrySet().p();
        while (d0VarP.hasNext()) {
            Map.Entry entry = (Map.Entry) d0VarP.next();
            linkedHashMap.put(((c1) entry.getKey()).toString().replace("\n", "\n  "), ((c1) entry.getValue()).toString().replace("\n", "\n  "));
        }
        za.b bVar = new za.b(26);
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            a.g(sb2, linkedHashMap.entrySet().iterator(), bVar);
            sb2.append("\n}");
            return sb2.toString();
        } catch (IOException e9) {
            throw new AssertionError(e9);
        }
    }

    @Override
    public final int zza() {
        return c1.c((byte) -96);
    }
}
