package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String e;
    public String f47028f;
    public char f47029g;
    public StringBuilder h;
    public int f47025a = 1;
    public final StringBuilder f47026b = new StringBuilder();
    public final ArrayList f47027c = new ArrayList();
    public boolean f47030i = false;

    public final void a() {
        String str;
        if (!this.f47030i) {
            return;
        }
        String a2 = af.a.a(this.f47028f);
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
        this.f47027c.add(pVar);
        this.d = null;
        this.f47030i = false;
        this.e = null;
        this.f47028f = null;
        this.h = null;
    }
}
