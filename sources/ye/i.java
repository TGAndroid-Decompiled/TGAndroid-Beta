package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String e;
    public String f47040f;
    public char f47041g;
    public StringBuilder h;
    public int f47037a = 1;
    public final StringBuilder f47038b = new StringBuilder();
    public final ArrayList f47039c = new ArrayList();
    public boolean f47042i = false;

    public final void a() {
        String str;
        if (!this.f47042i) {
            return;
        }
        String a2 = af.a.a(this.f47040f);
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
        this.f47039c.add(pVar);
        this.d = null;
        this.f47042i = false;
        this.e = null;
        this.f47040f = null;
        this.h = null;
    }
}
