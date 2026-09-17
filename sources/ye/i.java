package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String f50030e;
    public String f50031f;
    public char f50032g;
    public StringBuilder h;
    public int f50027a = 1;
    public final StringBuilder f50028b = new StringBuilder();
    public final ArrayList f50029c = new ArrayList();
    public boolean f50033i = false;

    public final void a() {
        String str;
        if (!this.f50033i) {
            return;
        }
        String a2 = af.a.a(this.f50031f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = af.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f50030e;
        ?? pVar = new p();
        pVar.f2635g = str2;
        pVar.h = a2;
        pVar.f2636i = str;
        this.f50029c.add(pVar);
        this.d = null;
        this.f50033i = false;
        this.f50030e = null;
        this.f50031f = null;
        this.h = null;
    }
}
