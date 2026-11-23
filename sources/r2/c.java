package r2;

import c8.l1;
import e2.s0;
import e2.t;
import e2.u;
import java.util.ArrayList;
public final class c {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public nb.a f56464a;
    public boolean f56465b;
    public int f56466c;

    public static void a(int i7, ArrayList arrayList) {
        if (l1.d(i7, 0, 7, d) != -1 && !arrayList.contains(Integer.valueOf(i7))) {
            arrayList.add(Integer.valueOf(i7));
        }
    }

    public final u b(u uVar) {
        String str;
        if (this.f56465b && this.f56464a.G(uVar)) {
            t a10 = uVar.a();
            String str2 = uVar.f10751k;
            a10.f10707r = s0.n("application/x-media3-cues");
            a10.P = this.f56464a.I(uVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(uVar.f10759s);
            if (str2 != null) {
                str = " ".concat(str2);
            } else {
                str = "";
            }
            sb2.append(str);
            a10.f10699j = sb2.toString();
            a10.f10711w = Long.MAX_VALUE;
            return new u(a10);
        }
        return uVar;
    }
}
