package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String e;
    public String f46788f;
    public char f46789g;
    public StringBuilder h;
    public int f46785a = 1;
    public final StringBuilder f46786b = new StringBuilder();
    public final ArrayList f46787c = new ArrayList();
    public boolean f46790i = false;

    public final void a() {
        String str;
        if (!this.f46790i) {
            return;
        }
        String a2 = af.a.a(this.f46788f);
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
        this.f46787c.add(pVar);
        this.d = null;
        this.f46790i = false;
        this.e = null;
        this.f46788f = null;
        this.h = null;
    }
}
