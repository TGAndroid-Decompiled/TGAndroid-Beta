package ze;

import cf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String f54511e;
    public String f54512f;
    public char f54513g;
    public StringBuilder h;
    public int f54508a = 1;
    public final StringBuilder f54509b = new StringBuilder();
    public final ArrayList f54510c = new ArrayList();
    public boolean f54514i = false;

    public final void a() {
        String str;
        if (!this.f54514i) {
            return;
        }
        String a2 = bf.a.a(this.f54512f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = bf.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f54511e;
        ?? pVar = new p();
        pVar.f4648g = str2;
        pVar.h = a2;
        pVar.f4649i = str;
        this.f54510c.add(pVar);
        this.d = null;
        this.f54514i = false;
        this.f54511e = null;
        this.f54512f = null;
        this.h = null;
    }
}
