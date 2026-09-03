package r4;

import com.google.firebase.messaging.r;
import g5.n0;
import java.util.ArrayList;
import java.util.List;
public final class k {
    public final n0 f43329a;
    public final r f43330b;
    public final int[] f43331c;
    public final int d;
    public final g5.m e;
    public final long f43332f;
    public final n f43333g;
    public final i[] h;
    public f5.c f43334i;
    public s4.c f43335j;
    public int f43336k;
    public o4.b f43337l;
    public boolean f43338m;

    public k(n0 n0Var, s4.c cVar, r rVar, int i10, int[] iArr, f5.c cVar2, int i11, g5.m mVar, long j10, boolean z4, ArrayList arrayList, n nVar) {
        int i12;
        r3.k iVar;
        int i13;
        q4.d dVar;
        ?? obj = new Object();
        obj.f43329a = n0Var;
        obj.f43335j = cVar;
        obj.f43330b = rVar;
        obj.f43331c = iArr;
        obj.f43334i = cVar2;
        obj.d = i11;
        obj.e = mVar;
        obj.f43336k = i10;
        obj.f43332f = j10;
        obj.f43333g = nVar;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.h = new i[cVar2.p()];
        int i14 = 0;
        int i15 = 0;
        k kVar = obj;
        while (i15 < kVar.h.length) {
            s4.m mVar2 = (s4.m) a2.get(cVar2.f(i15));
            s4.b n10 = rVar.n(mVar2.f44088b);
            i[] iVarArr = kVar.h;
            int i16 = i15;
            n10 = n10 == null ? (s4.b) mVar2.f44088b.get(i14) : n10;
            j3.n0 n0Var2 = mVar2.f44087a;
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
        List list = this.f43335j.b(this.f43336k).f44077c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f43331c) {
            arrayList.addAll(((s4.a) list.get(i10)).f44046c);
        }
        return arrayList;
    }

    public final i b(int i10) {
        i[] iVarArr = this.h;
        i iVar = iVarArr[i10];
        s4.b n10 = this.f43330b.n(iVar.f43326b.f44088b);
        if (n10 != null && !n10.equals(iVar.f43327c)) {
            i iVar2 = new i(iVar.e, iVar.f43326b, n10, iVar.f43325a, iVar.f43328f, iVar.d);
            iVarArr[i10] = iVar2;
            return iVar2;
        }
        return iVar;
    }
}
