package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String f50926e;
    public String f50927f;
    public char f50928g;
    public StringBuilder h;
    public int f50923a = 1;
    public final StringBuilder f50924b = new StringBuilder();
    public final ArrayList f50925c = new ArrayList();
    public boolean f50929i = false;

    public final void a() {
        String str;
        if (!this.f50929i) {
            return;
        }
        String a2 = af.a.a(this.f50927f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = af.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f50926e;
        ?? pVar = new p();
        pVar.f3828g = str2;
        pVar.h = a2;
        pVar.f3829i = str;
        this.f50925c.add(pVar);
        this.d = null;
        this.f50929i = false;
        this.f50926e = null;
        this.f50927f = null;
        this.h = null;
    }
}
