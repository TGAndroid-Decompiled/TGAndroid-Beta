package q2;

import android.support.v4.media.session.a0;
import d2.r0;
import d2.s0;
import d2.u;
import d2.v;
import java.util.Map;
import w2.c1;
public final class p extends c1 {
    public final Map J;
    public d2.s K;

    public p(a0 a0Var, p2.m mVar, p2.j jVar, Map map) {
        super(a0Var, mVar, jVar);
        this.J = map;
    }

    @Override
    public final v r(v vVar) {
        d2.s sVar;
        d2.s sVar2 = this.K;
        if (sVar2 == null) {
            sVar2 = vVar.f8492w;
        }
        if (sVar2 != null && (sVar = (d2.s) this.J.get(sVar2.f8365c)) != null) {
            sVar2 = sVar;
        }
        s0 s0Var = vVar.f8482l;
        s0 s0Var2 = null;
        if (s0Var != null) {
            r0[] r0VarArr = s0Var.f8366a;
            int length = r0VarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    r0 r0Var = r0VarArr[i3];
                    if ((r0Var instanceof s3.m) && "com.apple.streaming.transportStreamTimestamp".equals(((s3.m) r0Var).f54632b)) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (i3 != -1) {
                if (length != 1) {
                    r0[] r0VarArr2 = new r0[length - 1];
                    for (int i10 = 0; i10 < length; i10++) {
                        if (i10 != i3) {
                            r0VarArr2[i10 < i3 ? i10 : i10 - 1] = r0VarArr[i10];
                        }
                    }
                    s0Var2 = new s0(r0VarArr2);
                }
            }
            if (sVar2 == vVar.f8492w || s0Var != vVar.f8482l) {
                u a10 = vVar.a();
                a10.v = sVar2;
                a10.f8424k = s0Var;
                vVar = new v(a10);
            }
            return super.r(vVar);
        }
        s0Var = s0Var2;
        if (sVar2 == vVar.f8492w) {
        }
        u a102 = vVar.a();
        a102.v = sVar2;
        a102.f8424k = s0Var;
        vVar = new v(a102);
        return super.r(vVar);
    }
}
