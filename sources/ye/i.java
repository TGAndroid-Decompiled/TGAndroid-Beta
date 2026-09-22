package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String e;
    public String f46756f;
    public char f46757g;
    public StringBuilder h;
    public int f46753a = 1;
    public final StringBuilder f46754b = new StringBuilder();
    public final ArrayList f46755c = new ArrayList();
    public boolean f46758i = false;

    public final void a() {
        String str;
        if (!this.f46758i) {
            return;
        }
        String a2 = af.a.a(this.f46756f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = af.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.e;
        ?? pVar = new p();
        pVar.f3546g = str2;
        pVar.h = a2;
        pVar.f3547i = str;
        this.f46755c.add(pVar);
        this.d = null;
        this.f46758i = false;
        this.e = null;
        this.f46756f = null;
        this.h = null;
    }
}
