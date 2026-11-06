package r2;

import c8.e1;
import e2.s0;
import e2.u;
import java.util.ArrayList;
public final class c {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public w7.s f54193a;
    public boolean f54194b;
    public int f54195c;

    public static void a(int i7, ArrayList arrayList) {
        if (e1.d(i7, 0, 7, d) != -1 && !arrayList.contains(Integer.valueOf(i7))) {
            arrayList.add(Integer.valueOf(i7));
        }
    }

    public final u b(u uVar) {
        String str;
        if (this.f54194b && this.f54193a.w(uVar)) {
            e2.t a10 = uVar.a();
            String str2 = uVar.f10607k;
            a10.f10563r = s0.n("application/x-media3-cues");
            a10.P = this.f54193a.D(uVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(uVar.f10615s);
            if (str2 != null) {
                str = " ".concat(str2);
            } else {
                str = "";
            }
            sb2.append(str);
            a10.f10555j = sb2.toString();
            a10.f10567w = Long.MAX_VALUE;
            return new u(a10);
        }
        return uVar;
    }
}
