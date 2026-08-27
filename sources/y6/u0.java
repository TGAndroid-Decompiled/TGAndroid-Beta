package y6;

import com.google.android.gms.internal.cast.x4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public final class u0 extends c1 {

    public final m f49780a;

    public final int f49781b;

    public u0(x xVar) throws x4 {
        xVar.getClass();
        this.f49780a = xVar;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            m mVar = this.f49780a;
            if (i10 >= mVar.size()) {
                break;
            }
            int iA = ((c1) mVar.get(i10)).a();
            if (i11 < iA) {
                i11 = iA;
            }
            i10++;
        }
        int i12 = i11 + 1;
        this.f49781b = i12;
        if (i12 > 8) {
            throw new x4("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override
    public final int a() {
        return this.f49781b;
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int iZza = c1Var.zza();
        int iC = c1.c((byte) -128);
        if (iC != iZza) {
            return iC - c1Var.zza();
        }
        m mVar = ((u0) c1Var).f49780a;
        m mVar2 = this.f49780a;
        if (mVar2.size() != mVar.size()) {
            return mVar2.size() - mVar.size();
        }
        for (int i10 = 0; i10 < mVar2.size(); i10++) {
            int iCompareTo = ((c1) mVar2.get(i10)).compareTo((c1) mVar.get(i10));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u0.class == obj.getClass()) {
            return this.f49780a.equals(((u0) obj).f49780a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c((byte) -128)), this.f49780a});
    }

    public final String toString() {
        m mVar = this.f49780a;
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
                sb2.append(za.b.C(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ",\n  ");
                    sb2.append(za.b.C(it.next()));
                }
            }
            sb2.append("\n]");
            return sb2.toString();
        } catch (IOException e9) {
            throw new AssertionError(e9);
        }
    }

    @Override
    public final int zza() {
        return c1.c((byte) -128);
    }
}
