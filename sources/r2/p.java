package r2;

import e2.p0;
import e2.q0;
import e2.u;
import java.util.Map;
import x2.b1;
public final class p extends b1 {
    public final Map J;
    public e2.r K;

    public p(h6.m mVar, q2.m mVar2, q2.j jVar, Map map) {
        super(mVar, mVar2, jVar);
        this.J = map;
    }

    @Override
    public final u r(u uVar) {
        e2.r rVar;
        e2.r rVar2 = this.K;
        if (rVar2 == null) {
            rVar2 = uVar.f10618w;
        }
        if (rVar2 != null && (rVar = (e2.r) this.J.get(rVar2.f10532c)) != null) {
            rVar2 = rVar;
        }
        q0 q0Var = uVar.f10608l;
        q0 q0Var2 = null;
        if (q0Var != null) {
            p0[] p0VarArr = q0Var.f10484a;
            int length = p0VarArr.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    p0 p0Var = p0VarArr[i7];
                    if ((p0Var instanceof t3.m) && "com.apple.streaming.transportStreamTimestamp".equals(((t3.m) p0Var).f55294b)) {
                        break;
                    }
                    i7++;
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 != -1) {
                if (length != 1) {
                    p0[] p0VarArr2 = new p0[length - 1];
                    for (int i10 = 0; i10 < length; i10++) {
                        if (i10 != i7) {
                            p0VarArr2[i10 < i7 ? i10 : i10 - 1] = p0VarArr[i10];
                        }
                    }
                    q0Var2 = new q0(p0VarArr2);
                }
            }
            if (rVar2 == uVar.f10618w || q0Var != uVar.f10608l) {
                e2.t a10 = uVar.a();
                a10.v = rVar2;
                a10.f10556k = q0Var;
                uVar = new u(a10);
            }
            return super.r(uVar);
        }
        q0Var = q0Var2;
        if (rVar2 == uVar.f10618w) {
        }
        e2.t a102 = uVar.a();
        a102.v = rVar2;
        a102.f10556k = q0Var;
        uVar = new u(a102);
        return super.r(uVar);
    }
}
