package p7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class v0 extends d1 {
    public final n f53410a;
    public final int f53411b;

    public v0(y yVar) {
        yVar.getClass();
        this.f53410a = yVar;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            n nVar = this.f53410a;
            if (i3 >= nVar.size()) {
                break;
            }
            int a10 = ((d1) nVar.get(i3)).a();
            if (i10 < a10) {
                i10 = a10;
            }
            i3++;
        }
        int i11 = i10 + 1;
        this.f53411b = i11;
        if (i11 <= 8) {
            return;
        }
        throw new IOException("Exceeded cutoff limit for max depth of cbor value");
    }

    @Override
    public final int a() {
        return this.f53411b;
    }

    @Override
    public final int compareTo(Object obj) {
        d1 d1Var = (d1) obj;
        int zza = d1Var.zza();
        int c2 = d1.c(Byte.MIN_VALUE);
        if (c2 != zza) {
            return c2 - d1Var.zza();
        }
        n nVar = ((v0) d1Var).f53410a;
        n nVar2 = this.f53410a;
        if (nVar2.size() != nVar.size()) {
            return nVar2.size() - nVar.size();
        }
        for (int i3 = 0; i3 < nVar2.size(); i3++) {
            int compareTo = ((d1) nVar2.get(i3)).compareTo((d1) nVar.get(i3));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v0.class != obj.getClass()) {
            return false;
        }
        return this.f53410a.equals(((v0) obj).f53410a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d1.c(Byte.MIN_VALUE)), this.f53410a});
    }

    public final String toString() {
        n nVar = this.f53410a;
        if (nVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = nVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((d1) nVar.get(i3)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb2 = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb2.append(nb.a.D(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ",\n  ");
                    sb2.append(nb.a.D(it.next()));
                }
            }
            sb2.append("\n]");
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override
    public final int zza() {
        return d1.c(Byte.MIN_VALUE);
    }
}
