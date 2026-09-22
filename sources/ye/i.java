package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String e;
    public String f47083f;
    public char f47084g;
    public StringBuilder h;
    public int f47080a = 1;
    public final StringBuilder f47081b = new StringBuilder();
    public final ArrayList f47082c = new ArrayList();
    public boolean f47085i = false;

    public final void a() {
        String str;
        if (!this.f47085i) {
            return;
        }
        String a2 = af.a.a(this.f47083f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = af.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.e;
        ?? pVar = new p();
        pVar.f3548g = str2;
        pVar.h = a2;
        pVar.f3549i = str;
        this.f47082c.add(pVar);
        this.d = null;
        this.f47085i = false;
        this.e = null;
        this.f47083f = null;
        this.h = null;
    }
}
