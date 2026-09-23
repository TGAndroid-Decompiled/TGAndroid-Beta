package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String e;
    public String f46714f;
    public char f46715g;
    public StringBuilder h;
    public int f46711a = 1;
    public final StringBuilder f46712b = new StringBuilder();
    public final ArrayList f46713c = new ArrayList();
    public boolean f46716i = false;

    public final void a() {
        String str;
        if (!this.f46716i) {
            return;
        }
        String a2 = af.a.a(this.f46714f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = af.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.e;
        ?? pVar = new p();
        pVar.f3541g = str2;
        pVar.h = a2;
        pVar.f3542i = str;
        this.f46713c.add(pVar);
        this.d = null;
        this.f46716i = false;
        this.e = null;
        this.f46714f = null;
        this.h = null;
    }
}
