package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String e;
    public String f47147f;
    public char f47148g;
    public StringBuilder h;
    public int f47144a = 1;
    public final StringBuilder f47145b = new StringBuilder();
    public final ArrayList f47146c = new ArrayList();
    public boolean f47149i = false;

    public final void a() {
        String str;
        if (!this.f47149i) {
            return;
        }
        String a2 = af.a.a(this.f47147f);
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
        this.f47146c.add(pVar);
        this.d = null;
        this.f47149i = false;
        this.e = null;
        this.f47147f = null;
        this.h = null;
    }
}
