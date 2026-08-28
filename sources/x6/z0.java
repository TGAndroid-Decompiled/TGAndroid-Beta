package x6;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
public final class z0 extends c1 {
    public final int f49079a;
    public final r f49080b;

    public z0(r rVar) {
        rVar.getClass();
        this.f49080b = rVar;
        d0 p6 = rVar.entrySet().p();
        int i9 = 0;
        while (p6.hasNext()) {
            Map.Entry entry = (Map.Entry) p6.next();
            int a2 = ((c1) entry.getKey()).a();
            i9 = i9 < a2 ? a2 : i9;
            int a3 = ((c1) entry.getValue()).a();
            if (i9 < a3) {
                i9 = a3;
            }
        }
        int i10 = i9 + 1;
        this.f49079a = i10;
        if (i10 <= 8) {
            return;
        }
        throw new IOException("Exceeded cutoff limit for max depth of cbor value");
    }

    @Override
    public final int a() {
        return this.f49079a;
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
        r rVar = ((z0) c1Var).f49080b;
        r rVar2 = this.f49080b;
        if (rVar2.d.size() != rVar.d.size()) {
            return rVar2.d.size() - rVar.d.size();
        }
        d0 p6 = rVar2.entrySet().p();
        d0 p9 = rVar.entrySet().p();
        do {
            if (!p6.hasNext() && !p9.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) p6.next();
            Map.Entry entry2 = (Map.Entry) p9.next();
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
        return this.f49080b.equals(((z0) obj).f49080b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c((byte) -96)), this.f49080b});
    }

    public final String toString() {
        r rVar = this.f49080b;
        if (rVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d0 p6 = rVar.entrySet().p();
        while (p6.hasNext()) {
            Map.Entry entry = (Map.Entry) p6.next();
            linkedHashMap.put(((c1) entry.getKey()).toString().replace("\n", "\n  "), ((c1) entry.getValue()).toString().replace("\n", "\n  "));
        }
        d7.u uVar = new d7.u(26);
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            a.g(sb2, linkedHashMap.entrySet().iterator(), uVar);
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
