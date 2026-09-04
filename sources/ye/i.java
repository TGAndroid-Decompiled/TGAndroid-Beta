package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String f50029e;
    public String f50030f;
    public char f50031g;
    public StringBuilder h;
    public int f50026a = 1;
    public final StringBuilder f50027b = new StringBuilder();
    public final ArrayList f50028c = new ArrayList();
    public boolean f50032i = false;

    public final void a() {
        String str;
        if (!this.f50032i) {
            return;
        }
        String a2 = af.a.a(this.f50030f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = af.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f50029e;
        ?? pVar = new p();
        pVar.f2635g = str2;
        pVar.h = a2;
        pVar.f2636i = str;
        this.f50028c.add(pVar);
        this.d = null;
        this.f50032i = false;
        this.f50029e = null;
        this.f50030f = null;
        this.h = null;
    }
}
