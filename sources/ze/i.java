package ze;

import cf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String f54422e;
    public String f54423f;
    public char f54424g;
    public StringBuilder h;
    public int f54419a = 1;
    public final StringBuilder f54420b = new StringBuilder();
    public final ArrayList f54421c = new ArrayList();
    public boolean f54425i = false;

    public final void a() {
        String str;
        if (!this.f54425i) {
            return;
        }
        String a2 = bf.a.a(this.f54423f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = bf.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f54422e;
        ?? pVar = new p();
        pVar.f4649g = str2;
        pVar.h = a2;
        pVar.f4650i = str;
        this.f54421c.add(pVar);
        this.d = null;
        this.f54425i = false;
        this.f54422e = null;
        this.f54423f = null;
        this.h = null;
    }
}
