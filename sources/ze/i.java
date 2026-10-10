package ze;

import cf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String f54468e;
    public String f54469f;
    public char f54470g;
    public StringBuilder h;
    public int f54465a = 1;
    public final StringBuilder f54466b = new StringBuilder();
    public final ArrayList f54467c = new ArrayList();
    public boolean f54471i = false;

    public final void a() {
        String str;
        if (!this.f54471i) {
            return;
        }
        String a2 = bf.a.a(this.f54469f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = bf.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f54468e;
        ?? pVar = new p();
        pVar.f4649g = str2;
        pVar.h = a2;
        pVar.f4650i = str;
        this.f54467c.add(pVar);
        this.d = null;
        this.f54471i = false;
        this.f54468e = null;
        this.f54469f = null;
        this.h = null;
    }
}
