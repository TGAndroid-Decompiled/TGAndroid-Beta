package ze;

import cf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String f54648e;
    public String f54649f;
    public char f54650g;
    public StringBuilder h;
    public int f54645a = 1;
    public final StringBuilder f54646b = new StringBuilder();
    public final ArrayList f54647c = new ArrayList();
    public boolean f54651i = false;

    public final void a() {
        String str;
        if (!this.f54651i) {
            return;
        }
        String a2 = bf.a.a(this.f54649f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = bf.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f54648e;
        ?? pVar = new p();
        pVar.f4647g = str2;
        pVar.h = a2;
        pVar.f4648i = str;
        this.f54647c.add(pVar);
        this.d = null;
        this.f54651i = false;
        this.f54648e = null;
        this.f54649f = null;
        this.h = null;
    }
}
