package t4;

import j3.m0;
import j3.n0;
import java.util.Map;
import o4.k0;
public final class q extends k0 {
    public final Map H;
    public o3.h I;

    public q(g5.q qVar, o3.p pVar, o3.m mVar, Map map) {
        super(qVar, pVar, mVar);
        this.H = map;
    }

    @Override
    public final n0 m(n0 n0Var) {
        o3.h hVar;
        o3.h hVar2 = this.I;
        if (hVar2 == null) {
            hVar2 = n0Var.F;
        }
        if (hVar2 != null && (hVar = (o3.h) this.H.get(hVar2.f16247c)) != null) {
            hVar2 = hVar;
        }
        e4.c cVar = n0Var.f8723s;
        e4.c cVar2 = null;
        if (cVar != null) {
            e4.b[] bVarArr = cVar.f5109a;
            int length = bVarArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    e4.b bVar = bVarArr[i10];
                    if ((bVar instanceof j4.m) && "com.apple.streaming.transportStreamTimestamp".equals(((j4.m) bVar).f8912b)) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 != -1) {
                if (length != 1) {
                    e4.b[] bVarArr2 = new e4.b[length - 1];
                    for (int i11 = 0; i11 < length; i11++) {
                        if (i11 != i10) {
                            bVarArr2[i11 < i10 ? i11 : i11 - 1] = bVarArr[i11];
                        }
                    }
                    cVar2 = new e4.c(bVarArr2);
                }
            }
            if (hVar2 == n0Var.F || cVar != n0Var.f8723s) {
                m0 a2 = n0Var.a();
                a2.f8669r = hVar2;
                a2.f8660i = cVar;
                n0Var = new n0(a2);
            }
            return super.m(n0Var);
        }
        cVar = cVar2;
        if (hVar2 == n0Var.F) {
        }
        m0 a22 = n0Var.a();
        a22.f8669r = hVar2;
        a22.f8660i = cVar;
        n0Var = new n0(a22);
        return super.m(n0Var);
    }
}
