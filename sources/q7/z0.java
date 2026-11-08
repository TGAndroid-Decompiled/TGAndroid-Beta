package q7;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
public final class z0 extends c1 {
    public final int f54043a;
    public final r f54044b;

    public z0(r rVar) {
        rVar.getClass();
        this.f54044b = rVar;
        d0 k10 = rVar.entrySet().k();
        int i7 = 0;
        while (k10.hasNext()) {
            Map.Entry entry = (Map.Entry) k10.next();
            int a10 = ((c1) entry.getKey()).a();
            i7 = i7 < a10 ? a10 : i7;
            int a11 = ((c1) entry.getValue()).a();
            if (i7 < a11) {
                i7 = a11;
            }
        }
        int i10 = i7 + 1;
        this.f54043a = i10;
        if (i10 <= 8) {
            return;
        }
        throw new IOException("Exceeded cutoff limit for max depth of cbor value");
    }

    @Override
    public final int a() {
        return this.f54043a;
    }

    @Override
    public final int compareTo(Object obj) {
        int compareTo;
        c1 c1Var = (c1) obj;
        int zza = c1Var.zza();
        int c10 = c1.c((byte) -96);
        if (c10 != zza) {
            return c10 - c1Var.zza();
        }
        r rVar = ((z0) c1Var).f54044b;
        r rVar2 = this.f54044b;
        if (rVar2.d.size() != rVar.d.size()) {
            return rVar2.d.size() - rVar.d.size();
        }
        d0 k10 = rVar2.entrySet().k();
        d0 k11 = rVar.entrySet().k();
        do {
            if (!k10.hasNext() && !k11.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) k10.next();
            Map.Entry entry2 = (Map.Entry) k11.next();
            int compareTo2 = ((c1) entry.getKey()).compareTo((c1) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((c1) entry.getValue()).compareTo((c1) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z0.class != obj.getClass()) {
            return false;
        }
        return this.f54044b.equals(((z0) obj).f54044b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c((byte) -96)), this.f54044b});
    }

    public final String toString() {
        r rVar = this.f54044b;
        if (rVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d0 k10 = rVar.entrySet().k();
        while (k10.hasNext()) {
            Map.Entry entry = (Map.Entry) k10.next();
            linkedHashMap.put(((c1) entry.getKey()).toString().replace("\n", "\n  "), ((c1) entry.getValue()).toString().replace("\n", "\n  "));
        }
        nb.a aVar = new nb.a(22);
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            a.g(sb2, linkedHashMap.entrySet().iterator(), aVar);
            sb2.append("\n}");
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override
    public final int zza() {
        return c1.c((byte) -96);
    }
}
