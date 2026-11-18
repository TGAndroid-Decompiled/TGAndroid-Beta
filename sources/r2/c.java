package r2;

import c8.k1;
import e2.s0;
import e2.t;
import e2.u;
import java.util.ArrayList;
public final class c {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public nb.a f56341a;
    public boolean f56342b;
    public int f56343c;

    public static void a(int i7, ArrayList arrayList) {
        if (k1.d(i7, 0, 7, d) != -1 && !arrayList.contains(Integer.valueOf(i7))) {
            arrayList.add(Integer.valueOf(i7));
        }
    }

    public final u b(u uVar) {
        String str;
        if (this.f56342b && this.f56341a.H(uVar)) {
            t a10 = uVar.a();
            String str2 = uVar.f10758k;
            a10.f10714r = s0.n("application/x-media3-cues");
            a10.P = this.f56341a.O(uVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(uVar.f10766s);
            if (str2 != null) {
                str = " ".concat(str2);
            } else {
                str = "";
            }
            sb2.append(str);
            a10.f10706j = sb2.toString();
            a10.f10718w = Long.MAX_VALUE;
            return new u(a10);
        }
        return uVar;
    }
}
