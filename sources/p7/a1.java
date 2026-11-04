package p7;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
public final class a1 extends d1 {
    public final int f53339a;
    public final s f53340b;

    public a1(s sVar) {
        sVar.getClass();
        this.f53340b = sVar;
        e0 k10 = sVar.entrySet().k();
        int i3 = 0;
        while (k10.hasNext()) {
            Map.Entry entry = (Map.Entry) k10.next();
            int a10 = ((d1) entry.getKey()).a();
            i3 = i3 < a10 ? a10 : i3;
            int a11 = ((d1) entry.getValue()).a();
            if (i3 < a11) {
                i3 = a11;
            }
        }
        int i10 = i3 + 1;
        this.f53339a = i10;
        if (i10 <= 8) {
            return;
        }
        throw new IOException("Exceeded cutoff limit for max depth of cbor value");
    }

    @Override
    public final int a() {
        return this.f53339a;
    }

    @Override
    public final int compareTo(Object obj) {
        int compareTo;
        d1 d1Var = (d1) obj;
        int zza = d1Var.zza();
        int c2 = d1.c((byte) -96);
        if (c2 != zza) {
            return c2 - d1Var.zza();
        }
        s sVar = ((a1) d1Var).f53340b;
        s sVar2 = this.f53340b;
        if (sVar2.d.size() != sVar.d.size()) {
            return sVar2.d.size() - sVar.d.size();
        }
        e0 k10 = sVar2.entrySet().k();
        e0 k11 = sVar.entrySet().k();
        do {
            if (!k10.hasNext() && !k11.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) k10.next();
            Map.Entry entry2 = (Map.Entry) k11.next();
            int compareTo2 = ((d1) entry.getKey()).compareTo((d1) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((d1) entry.getValue()).compareTo((d1) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a1.class != obj.getClass()) {
            return false;
        }
        return this.f53340b.equals(((a1) obj).f53340b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d1.c((byte) -96)), this.f53340b});
    }

    public final String toString() {
        s sVar = this.f53340b;
        if (sVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e0 k10 = sVar.entrySet().k();
        while (k10.hasNext()) {
            Map.Entry entry = (Map.Entry) k10.next();
            linkedHashMap.put(((d1) entry.getKey()).toString().replace("\n", "\n  "), ((d1) entry.getValue()).toString().replace("\n", "\n  "));
        }
        nb.a aVar = new nb.a(21);
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
        return d1.c((byte) -96);
    }
}
