package x6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class u0 extends c1 {
    public final m f49063a;
    public final int f49064b;

    public u0(x xVar) {
        xVar.getClass();
        this.f49063a = xVar;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            m mVar = this.f49063a;
            if (i9 >= mVar.size()) {
                break;
            }
            int a2 = ((c1) mVar.get(i9)).a();
            if (i10 < a2) {
                i10 = a2;
            }
            i9++;
        }
        int i11 = i10 + 1;
        this.f49064b = i11;
        if (i11 <= 8) {
            return;
        }
        throw new IOException("Exceeded cutoff limit for max depth of cbor value");
    }

    @Override
    public final int a() {
        return this.f49064b;
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int zza = c1Var.zza();
        int c10 = c1.c(Byte.MIN_VALUE);
        if (c10 != zza) {
            return c10 - c1Var.zza();
        }
        m mVar = ((u0) c1Var).f49063a;
        m mVar2 = this.f49063a;
        if (mVar2.size() != mVar.size()) {
            return mVar2.size() - mVar.size();
        }
        for (int i9 = 0; i9 < mVar2.size(); i9++) {
            int compareTo = ((c1) mVar2.get(i9)).compareTo((c1) mVar.get(i9));
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
        if (obj == null || u0.class != obj.getClass()) {
            return false;
        }
        return this.f49063a.equals(((u0) obj).f49063a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c(Byte.MIN_VALUE)), this.f49063a});
    }

    public final String toString() {
        m mVar = this.f49063a;
        if (mVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = mVar.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(((c1) mVar.get(i9)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb2 = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb2.append(d7.u.m2(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ",\n  ");
                    sb2.append(d7.u.m2(it.next()));
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
        return c1.c(Byte.MIN_VALUE);
    }
}
