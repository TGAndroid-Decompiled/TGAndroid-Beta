package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String f50058e;
    public String f50059f;
    public char f50060g;
    public StringBuilder h;
    public int f50055a = 1;
    public final StringBuilder f50056b = new StringBuilder();
    public final ArrayList f50057c = new ArrayList();
    public boolean f50061i = false;

    public final void a() {
        String str;
        if (!this.f50061i) {
            return;
        }
        String a2 = af.a.a(this.f50059f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = af.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f50058e;
        ?? pVar = new p();
        pVar.f2662g = str2;
        pVar.h = a2;
        pVar.f2663i = str;
        this.f50057c.add(pVar);
        this.d = null;
        this.f50061i = false;
        this.f50058e = null;
        this.f50059f = null;
        this.h = null;
    }
}
