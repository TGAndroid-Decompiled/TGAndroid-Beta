package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String e;
    public String f47084f;
    public char f47085g;
    public StringBuilder h;
    public int f47081a = 1;
    public final StringBuilder f47082b = new StringBuilder();
    public final ArrayList f47083c = new ArrayList();
    public boolean f47086i = false;

    public final void a() {
        String str;
        if (!this.f47086i) {
            return;
        }
        String a2 = af.a.a(this.f47084f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = af.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.e;
        ?? pVar = new p();
        pVar.f3543g = str2;
        pVar.h = a2;
        pVar.f3544i = str;
        this.f47083c.add(pVar);
        this.d = null;
        this.f47086i = false;
        this.e = null;
        this.f47084f = null;
        this.h = null;
    }
}
