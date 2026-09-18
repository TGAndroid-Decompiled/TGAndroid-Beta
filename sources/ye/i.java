package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String e;
    public String f47015f;
    public char f47016g;
    public StringBuilder h;
    public int f47012a = 1;
    public final StringBuilder f47013b = new StringBuilder();
    public final ArrayList f47014c = new ArrayList();
    public boolean f47017i = false;

    public final void a() {
        String str;
        if (!this.f47017i) {
            return;
        }
        String a2 = af.a.a(this.f47015f);
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
        this.f47014c.add(pVar);
        this.d = null;
        this.f47017i = false;
        this.e = null;
        this.f47015f = null;
        this.h = null;
    }
}
