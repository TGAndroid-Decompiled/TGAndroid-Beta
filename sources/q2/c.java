package q2;

import b8.od;
import d2.u;
import d2.u0;
import d2.v;
import java.util.ArrayList;
public final class c {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public mb.b f53671a;
    public boolean f53672b;
    public int f53673c;

    public static void a(int i3, ArrayList arrayList) {
        if (od.d(i3, 0, 7, d) != -1 && !arrayList.contains(Integer.valueOf(i3))) {
            arrayList.add(Integer.valueOf(i3));
        }
    }

    public final v b(v vVar) {
        String str;
        if (this.f53672b && this.f53671a.l(vVar)) {
            u a10 = vVar.a();
            String str2 = vVar.f8481k;
            a10.f8431r = u0.n("application/x-media3-cues");
            a10.P = this.f53671a.q0(vVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(vVar.f8489s);
            if (str2 != null) {
                str = " ".concat(str2);
            } else {
                str = "";
            }
            sb2.append(str);
            a10.f8423j = sb2.toString();
            a10.f8435w = Long.MAX_VALUE;
            return new v(a10);
        }
        return vVar;
    }
}
