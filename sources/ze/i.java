package ze;

import cf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String f54656e;
    public String f54657f;
    public char f54658g;
    public StringBuilder h;
    public int f54653a = 1;
    public final StringBuilder f54654b = new StringBuilder();
    public final ArrayList f54655c = new ArrayList();
    public boolean f54659i = false;

    public final void a() {
        String str;
        if (!this.f54659i) {
            return;
        }
        String a2 = bf.a.a(this.f54657f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = bf.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f54656e;
        ?? pVar = new p();
        pVar.f4647g = str2;
        pVar.h = a2;
        pVar.f4648i = str;
        this.f54655c.add(pVar);
        this.d = null;
        this.f54659i = false;
        this.f54656e = null;
        this.f54657f = null;
        this.h = null;
    }
}
