package z6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public final class u0 extends c1 {
    public final m f50763a;
    public final int f50764b;

    public u0(x xVar) {
        xVar.getClass();
        this.f50763a = xVar;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            m mVar = this.f50763a;
            if (i10 >= mVar.size()) {
                break;
            }
            int a2 = ((c1) mVar.get(i10)).a();
            if (i11 < a2) {
                i11 = a2;
            }
            i10++;
        }
        int i12 = i11 + 1;
        this.f50764b = i12;
        if (i12 <= 8) {
            return;
        }
        throw new IOException("Exceeded cutoff limit for max depth of cbor value");
    }

    @Override
    public final int a() {
        return this.f50764b;
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int zza = c1Var.zza();
        int c3 = c1.c(Byte.MIN_VALUE);
        if (c3 != zza) {
            return c3 - c1Var.zza();
        }
        m mVar = ((u0) c1Var).f50763a;
        m mVar2 = this.f50763a;
        if (mVar2.size() != mVar.size()) {
            return mVar2.size() - mVar.size();
        }
        for (int i10 = 0; i10 < mVar2.size(); i10++) {
            int compareTo = ((c1) mVar2.get(i10)).compareTo((c1) mVar.get(i10));
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
        return this.f50763a.equals(((u0) obj).f50763a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c(Byte.MIN_VALUE)), this.f50763a});
    }

    public final String toString() {
        m mVar = this.f50763a;
        if (mVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = mVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((c1) mVar.get(i10)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb2 = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb2.append(bb.a.H3(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ",\n  ");
                    sb2.append(bb.a.H3(it.next()));
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
