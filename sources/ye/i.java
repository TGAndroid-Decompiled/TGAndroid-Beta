package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String f50919e;
    public String f50920f;
    public char f50921g;
    public StringBuilder h;
    public int f50916a = 1;
    public final StringBuilder f50917b = new StringBuilder();
    public final ArrayList f50918c = new ArrayList();
    public boolean f50922i = false;

    public final void a() {
        String str;
        if (!this.f50922i) {
            return;
        }
        String a2 = af.a.a(this.f50920f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = af.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f50919e;
        ?? pVar = new p();
        pVar.f3828g = str2;
        pVar.h = a2;
        pVar.f3829i = str;
        this.f50918c.add(pVar);
        this.d = null;
        this.f50922i = false;
        this.f50919e = null;
        this.f50920f = null;
        this.h = null;
    }
}
