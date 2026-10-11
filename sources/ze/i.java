package ze;

import cf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String f54545e;
    public String f54546f;
    public char f54547g;
    public StringBuilder h;
    public int f54542a = 1;
    public final StringBuilder f54543b = new StringBuilder();
    public final ArrayList f54544c = new ArrayList();
    public boolean f54548i = false;

    public final void a() {
        String str;
        if (!this.f54548i) {
            return;
        }
        String a2 = bf.a.a(this.f54546f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = bf.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f54545e;
        ?? pVar = new p();
        pVar.f4648g = str2;
        pVar.h = a2;
        pVar.f4649i = str;
        this.f54544c.add(pVar);
        this.d = null;
        this.f54548i = false;
        this.f54545e = null;
        this.f54546f = null;
        this.h = null;
    }
}
