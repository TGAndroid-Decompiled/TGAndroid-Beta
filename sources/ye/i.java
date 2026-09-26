package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String e;
    public String f47038f;
    public char f47039g;
    public StringBuilder h;
    public int f47035a = 1;
    public final StringBuilder f47036b = new StringBuilder();
    public final ArrayList f47037c = new ArrayList();
    public boolean f47040i = false;

    public final void a() {
        String str;
        if (!this.f47040i) {
            return;
        }
        String a2 = af.a.a(this.f47038f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = af.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.e;
        ?? pVar = new p();
        pVar.f3541g = str2;
        pVar.h = a2;
        pVar.f3542i = str;
        this.f47037c.add(pVar);
        this.d = null;
        this.f47040i = false;
        this.e = null;
        this.f47038f = null;
        this.h = null;
    }
}
