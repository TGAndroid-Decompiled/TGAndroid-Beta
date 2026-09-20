package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String e;
    public String f47062f;
    public char f47063g;
    public StringBuilder h;
    public int f47059a = 1;
    public final StringBuilder f47060b = new StringBuilder();
    public final ArrayList f47061c = new ArrayList();
    public boolean f47064i = false;

    public final void a() {
        String str;
        if (!this.f47064i) {
            return;
        }
        String a2 = af.a.a(this.f47062f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = af.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.e;
        ?? pVar = new p();
        pVar.f3549g = str2;
        pVar.h = a2;
        pVar.f3550i = str;
        this.f47061c.add(pVar);
        this.d = null;
        this.f47064i = false;
        this.e = null;
        this.f47062f = null;
        this.h = null;
    }
}
