package ze;

import cf.p;
import java.io.Serializable;
import java.util.ArrayList;
public final class f extends ef.a {
    public final int f54620a;
    public final cf.a f54621b;
    public final Serializable f54622c;

    public f() {
        this.f54620a = 1;
        this.f54621b = new p();
        this.f54622c = new ArrayList();
    }

    @Override
    public void a(CharSequence charSequence) {
        switch (this.f54620a) {
            case 1:
                ((ArrayList) this.f54622c).add(charSequence);
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        int i10;
        boolean z10;
        switch (this.f54620a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f54622c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) arrayList.get(size);
                        int length = charSequence.length();
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                char charAt = charSequence.charAt(i11);
                                if (charAt != ' ') {
                                    switch (charAt) {
                                    }
                                }
                                i11++;
                            } else {
                                i11 = -1;
                            }
                        }
                        if (i11 == -1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            size--;
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                for (i10 = 0; i10 < size + 1; i10++) {
                    sb2.append((CharSequence) arrayList.get(i10));
                    sb2.append('\n');
                }
                ((cf.l) this.f54621b).f4646g = sb2.toString();
                return;
            default:
                return;
        }
    }

    @Override
    public final cf.a e() {
        switch (this.f54620a) {
            case 0:
                return (cf.i) this.f54621b;
            default:
                return (cf.l) this.f54621b;
        }
    }

    @Override
    public void g(df.a aVar) {
        switch (this.f54620a) {
            case 0:
                aVar.a((String) this.f54622c, (cf.i) this.f54621b);
                return;
            default:
                return;
        }
    }

    @Override
    public final q3.h h(d dVar) {
        switch (this.f54620a) {
            case 0:
                return null;
            default:
                if (dVar.f54609g >= 4) {
                    return new q3.h(-1, dVar.f54606c + 4, false);
                }
                if (dVar.h) {
                    return q3.h.a(dVar.f54607e);
                }
                return null;
        }
    }

    public f(int i10, String str) {
        this.f54620a = 0;
        ?? pVar = new p();
        this.f54621b = pVar;
        pVar.f4642g = i10;
        this.f54622c = str;
    }
}
