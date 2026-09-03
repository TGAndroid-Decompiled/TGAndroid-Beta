package r4;

import com.google.firebase.messaging.s;
import g5.n0;
import java.util.ArrayList;
import java.util.List;
public final class k {
    public final n0 f46678a;
    public final s f46679b;
    public final int[] f46680c;
    public final int d;
    public final g5.m f46681e;
    public final long f46682f;
    public final n f46683g;
    public final i[] h;
    public f5.c f46684i;
    public s4.c f46685j;
    public int f46686k;
    public o4.b f46687l;
    public boolean f46688m;

    public k(n0 n0Var, s4.c cVar, s sVar, int i10, int[] iArr, f5.c cVar2, int i11, g5.m mVar, long j10, boolean z4, ArrayList arrayList, n nVar) {
        int i12;
        r3.k iVar;
        int i13;
        q4.d dVar;
        ?? obj = new Object();
        obj.f46678a = n0Var;
        obj.f46685j = cVar;
        obj.f46679b = sVar;
        obj.f46680c = iArr;
        obj.f46684i = cVar2;
        obj.d = i11;
        obj.f46681e = mVar;
        obj.f46686k = i10;
        obj.f46682f = j10;
        obj.f46683g = nVar;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.h = new i[cVar2.p()];
        int i14 = 0;
        int i15 = 0;
        k kVar = obj;
        while (i15 < kVar.h.length) {
            s4.m mVar2 = (s4.m) a2.get(cVar2.f(i15));
            s4.b n10 = sVar.n(mVar2.f47020b);
            i[] iVarArr = kVar.h;
            int i16 = i15;
            n10 = n10 == null ? (s4.b) mVar2.f47020b.get(i14) : n10;
            j3.n0 n0Var2 = mVar2.f47019a;
            String str = n0Var2.B;
            if (h5.o.i(str)) {
                i13 = i16;
                dVar = null;
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    i13 = i16;
                    iVar = new x3.d(1);
                } else {
                    if (z4) {
                        i12 = 4;
                    } else {
                        i12 = 0;
                    }
                    i13 = i16;
                    iVar = new z3.i(i12, null, arrayList, nVar);
                }
                dVar = new q4.d(iVar, i11, n0Var2);
            }
            q4.d dVar2 = dVar;
            int i17 = i13;
            iVarArr[i17] = new i(d, mVar2, n10, dVar2, 0L, mVar2.c());
            i15 = i17 + 1;
            kVar = this;
            i14 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.f46685j.b(this.f46686k).f47008c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f46680c) {
            arrayList.addAll(((s4.a) list.get(i10)).f46973c);
        }
        return arrayList;
    }

    public final i b(int i10) {
        i[] iVarArr = this.h;
        i iVar = iVarArr[i10];
        s4.b n10 = this.f46679b.n(iVar.f46674b.f47020b);
        if (n10 != null && !n10.equals(iVar.f46675c)) {
            i iVar2 = new i(iVar.f46676e, iVar.f46674b, n10, iVar.f46673a, iVar.f46677f, iVar.d);
            iVarArr[i10] = iVar2;
            return iVar2;
        }
        return iVar;
    }
}
