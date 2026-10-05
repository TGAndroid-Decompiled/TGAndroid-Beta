package ye;

import bf.p;
import java.io.Serializable;
import java.util.ArrayList;
public final class f extends df.a {
    public final int f50898a;
    public final bf.a f50899b;
    public final Serializable f50900c;

    public f() {
        this.f50898a = 1;
        this.f50899b = new p();
        this.f50900c = new ArrayList();
    }

    @Override
    public void a(CharSequence charSequence) {
        switch (this.f50898a) {
            case 1:
                ((ArrayList) this.f50900c).add(charSequence);
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        int i10;
        boolean z10;
        switch (this.f50898a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f50900c;
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
                ((bf.l) this.f50899b).f3827g = sb2.toString();
                return;
            default:
                return;
        }
    }

    @Override
    public final bf.a e() {
        switch (this.f50898a) {
            case 0:
                return (bf.i) this.f50899b;
            default:
                return (bf.l) this.f50899b;
        }
    }

    @Override
    public void g(cf.a aVar) {
        switch (this.f50898a) {
            case 0:
                aVar.a((String) this.f50900c, (bf.i) this.f50899b);
                return;
            default:
                return;
        }
    }

    @Override
    public final q3.h h(d dVar) {
        switch (this.f50898a) {
            case 0:
                return null;
            default:
                if (dVar.f50887g >= 4) {
                    return new q3.h(-1, dVar.f50884c + 4, false);
                }
                if (dVar.h) {
                    return q3.h.a(dVar.f50885e);
                }
                return null;
        }
    }

    public f(int i10, String str) {
        this.f50898a = 0;
        ?? pVar = new p();
        this.f50899b = pVar;
        pVar.f3823g = i10;
        this.f50900c = str;
    }
}
