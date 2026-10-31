package se;

import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String e;
    public String f48238f;
    public char f48239g;
    public StringBuilder h;
    public int f48235a = 1;
    public final StringBuilder f48236b = new StringBuilder();
    public final ArrayList f48237c = new ArrayList();
    public boolean f48240i = false;

    public final void a() {
        String str;
        if (!this.f48240i) {
            return;
        }
        String a2 = ue.a.a(this.f48238f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = ue.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.e;
        ?? cVar = new df.c();
        cVar.f50808g = str2;
        cVar.h = a2;
        cVar.f50809i = str;
        this.f48237c.add(cVar);
        this.d = null;
        this.f48240i = false;
        this.e = null;
        this.f48238f = null;
        this.h = null;
    }
}
