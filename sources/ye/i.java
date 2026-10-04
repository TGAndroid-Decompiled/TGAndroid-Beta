package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String f50911e;
    public String f50912f;
    public char f50913g;
    public StringBuilder h;
    public int f50908a = 1;
    public final StringBuilder f50909b = new StringBuilder();
    public final ArrayList f50910c = new ArrayList();
    public boolean f50914i = false;

    public final void a() {
        String str;
        if (!this.f50914i) {
            return;
        }
        String a2 = af.a.a(this.f50912f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = af.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f50911e;
        ?? pVar = new p();
        pVar.f3828g = str2;
        pVar.h = a2;
        pVar.f3829i = str;
        this.f50910c.add(pVar);
        this.d = null;
        this.f50914i = false;
        this.f50911e = null;
        this.f50912f = null;
        this.h = null;
    }
}
