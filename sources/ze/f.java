package ze;

import cf.p;
import java.io.Serializable;
import java.util.ArrayList;
public final class f extends ef.a {
    public final int f54483a;
    public final cf.a f54484b;
    public final Serializable f54485c;

    public f() {
        this.f54483a = 1;
        this.f54484b = new p();
        this.f54485c = new ArrayList();
    }

    @Override
    public void a(CharSequence charSequence) {
        switch (this.f54483a) {
            case 1:
                ((ArrayList) this.f54485c).add(charSequence);
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        int i10;
        boolean z10;
        switch (this.f54483a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f54485c;
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
                ((cf.l) this.f54484b).f4647g = sb2.toString();
                return;
            default:
                return;
        }
    }

    @Override
    public final cf.a e() {
        switch (this.f54483a) {
            case 0:
                return (cf.i) this.f54484b;
            default:
                return (cf.l) this.f54484b;
        }
    }

    @Override
    public void g(df.a aVar) {
        switch (this.f54483a) {
            case 0:
                aVar.a((String) this.f54485c, (cf.i) this.f54484b);
                return;
            default:
                return;
        }
    }

    @Override
    public final q3.h h(d dVar) {
        switch (this.f54483a) {
            case 0:
                return null;
            default:
                if (dVar.f54472g >= 4) {
                    return new q3.h(-1, dVar.f54469c + 4, false);
                }
                if (dVar.h) {
                    return q3.h.a(dVar.f54470e);
                }
                return null;
        }
    }

    public f(int i10, String str) {
        this.f54483a = 0;
        ?? pVar = new p();
        this.f54484b = pVar;
        pVar.f4643g = i10;
        this.f54485c = str;
    }
}
