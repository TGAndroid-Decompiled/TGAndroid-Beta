package r4;

import com.google.firebase.messaging.r;
import g5.n0;
import java.util.ArrayList;
import java.util.List;
public final class k {
    public final n0 f43305a;
    public final r f43306b;
    public final int[] f43307c;
    public final int d;
    public final g5.m e;
    public final long f43308f;
    public final n f43309g;
    public final i[] h;
    public f5.c f43310i;
    public s4.c f43311j;
    public int f43312k;
    public o4.b f43313l;
    public boolean f43314m;

    public k(n0 n0Var, s4.c cVar, r rVar, int i10, int[] iArr, f5.c cVar2, int i11, g5.m mVar, long j10, boolean z4, ArrayList arrayList, n nVar) {
        int i12;
        r3.k iVar;
        int i13;
        q4.d dVar;
        ?? obj = new Object();
        obj.f43305a = n0Var;
        obj.f43311j = cVar;
        obj.f43306b = rVar;
        obj.f43307c = iArr;
        obj.f43310i = cVar2;
        obj.d = i11;
        obj.e = mVar;
        obj.f43312k = i10;
        obj.f43308f = j10;
        obj.f43309g = nVar;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.h = new i[cVar2.p()];
        int i14 = 0;
        int i15 = 0;
        k kVar = obj;
        while (i15 < kVar.h.length) {
            s4.m mVar2 = (s4.m) a2.get(cVar2.f(i15));
            s4.b Q = rVar.Q(mVar2.f44023b);
            i[] iVarArr = kVar.h;
            int i16 = i15;
            Q = Q == null ? (s4.b) mVar2.f44023b.get(i14) : Q;
            j3.n0 n0Var2 = mVar2.f44022a;
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
            iVarArr[i17] = new i(d, mVar2, Q, dVar2, 0L, mVar2.c());
            i15 = i17 + 1;
            kVar = this;
            i14 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.f43311j.b(this.f43312k).f44012c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f43307c) {
            arrayList.addAll(((s4.a) list.get(i10)).f43981c);
        }
        return arrayList;
    }

    public final i b(int i10) {
        i[] iVarArr = this.h;
        i iVar = iVarArr[i10];
        s4.b Q = this.f43306b.Q(iVar.f43302b.f44023b);
        if (Q != null && !Q.equals(iVar.f43303c)) {
            i iVar2 = new i(iVar.e, iVar.f43302b, Q, iVar.f43301a, iVar.f43304f, iVar.d);
            iVarArr[i10] = iVar2;
            return iVar2;
        }
        return iVar;
    }
}
