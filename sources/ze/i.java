package ze;

import cf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String f54424e;
    public String f54425f;
    public char f54426g;
    public StringBuilder h;
    public int f54421a = 1;
    public final StringBuilder f54422b = new StringBuilder();
    public final ArrayList f54423c = new ArrayList();
    public boolean f54427i = false;

    public final void a() {
        String str;
        if (!this.f54427i) {
            return;
        }
        String a2 = bf.a.a(this.f54425f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = bf.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f54424e;
        ?? pVar = new p();
        pVar.f4649g = str2;
        pVar.h = a2;
        pVar.f4650i = str;
        this.f54423c.add(pVar);
        this.d = null;
        this.f54427i = false;
        this.f54424e = null;
        this.f54425f = null;
        this.h = null;
    }
}
