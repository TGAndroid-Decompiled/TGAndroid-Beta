package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String e;
    public String f46910f;
    public char f46911g;
    public StringBuilder h;
    public int f46907a = 1;
    public final StringBuilder f46908b = new StringBuilder();
    public final ArrayList f46909c = new ArrayList();
    public boolean f46912i = false;

    public final void a() {
        String str;
        if (!this.f46912i) {
            return;
        }
        String a2 = af.a.a(this.f46910f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = af.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.e;
        ?? pVar = new p();
        pVar.f2242g = str2;
        pVar.h = a2;
        pVar.f2243i = str;
        this.f46909c.add(pVar);
        this.d = null;
        this.f46912i = false;
        this.e = null;
        this.f46910f = null;
        this.h = null;
    }
}
