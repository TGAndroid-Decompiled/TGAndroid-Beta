package ye;

import bf.p;
import java.util.ArrayList;
public final class i {
    public StringBuilder d;
    public String f50059e;
    public String f50060f;
    public char f50061g;
    public StringBuilder h;
    public int f50056a = 1;
    public final StringBuilder f50057b = new StringBuilder();
    public final ArrayList f50058c = new ArrayList();
    public boolean f50062i = false;

    public final void a() {
        String str;
        if (!this.f50062i) {
            return;
        }
        String a2 = af.a.a(this.f50060f);
        StringBuilder sb2 = this.h;
        if (sb2 != null) {
            str = af.a.a(sb2.toString());
        } else {
            str = null;
        }
        String str2 = this.f50059e;
        ?? pVar = new p();
        pVar.f2662g = str2;
        pVar.h = a2;
        pVar.f2663i = str;
        this.f50058c.add(pVar);
        this.d = null;
        this.f50062i = false;
        this.f50059e = null;
        this.f50060f = null;
        this.h = null;
    }
}
