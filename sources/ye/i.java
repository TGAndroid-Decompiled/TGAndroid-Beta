package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String f50910e;
    public String f50911f;
    public char f50912g;
    public StringBuilder h;
    public int f50907a = 1;
    public final StringBuilder f50908b = new StringBuilder();
    public final ArrayList f50909c = new ArrayList();
    public boolean f50913i = false;

    public final void a() {
        String str;
        if (!this.f50913i) {
            return;
        }
        String a2 = af.a.a(this.f50911f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = af.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f50910e;
        ?? pVar = new p();
        pVar.f3828g = str2;
        pVar.h = a2;
        pVar.f3829i = str;
        this.f50909c.add(pVar);
        this.d = null;
        this.f50913i = false;
        this.f50910e = null;
        this.f50911f = null;
        this.h = null;
    }
}
