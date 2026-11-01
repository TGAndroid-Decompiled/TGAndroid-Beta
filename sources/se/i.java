package se;

import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String e;
    public String f48249f;
    public char f48250g;
    public StringBuilder h;
    public int f48246a = 1;
    public final StringBuilder f48247b = new StringBuilder();
    public final ArrayList f48248c = new ArrayList();
    public boolean f48251i = false;

    public final void a() {
        String str;
        if (!this.f48251i) {
            return;
        }
        String a2 = ue.a.a(this.f48249f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = ue.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.e;
        ?? cVar = new df.c();
        cVar.f50822g = str2;
        cVar.h = a2;
        cVar.f50823i = str;
        this.f48248c.add(cVar);
        this.d = null;
        this.f48251i = false;
        this.e = null;
        this.f48249f = null;
        this.h = null;
    }
}
