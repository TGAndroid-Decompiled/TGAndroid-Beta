package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String e;
    public String f46760f;
    public char f46761g;
    public StringBuilder h;
    public int f46757a = 1;
    public final StringBuilder f46758b = new StringBuilder();
    public final ArrayList f46759c = new ArrayList();
    public boolean f46762i = false;

    public final void a() {
        String str;
        if (!this.f46762i) {
            return;
        }
        String a2 = af.a.a(this.f46760f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = af.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.e;
        ?? pVar = new p();
        pVar.f3544g = str2;
        pVar.h = a2;
        pVar.f3545i = str;
        this.f46759c.add(pVar);
        this.d = null;
        this.f46762i = false;
        this.e = null;
        this.f46760f = null;
        this.h = null;
    }
}
