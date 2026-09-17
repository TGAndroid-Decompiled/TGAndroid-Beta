package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String e;
    public String f46783f;
    public char f46784g;
    public StringBuilder h;
    public int f46780a = 1;
    public final StringBuilder f46781b = new StringBuilder();
    public final ArrayList f46782c = new ArrayList();
    public boolean f46785i = false;

    public final void a() {
        String str;
        if (!this.f46785i) {
            return;
        }
        String a2 = af.a.a(this.f46783f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = af.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.e;
        ?? pVar = new p();
        pVar.f3549g = str2;
        pVar.h = a2;
        pVar.f3550i = str;
        this.f46782c.add(pVar);
        this.d = null;
        this.f46785i = false;
        this.e = null;
        this.f46783f = null;
        this.h = null;
    }
}
