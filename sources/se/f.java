package se;

import java.io.Serializable;
import java.util.ArrayList;
public final class f extends xe.a {
    public final int f48212a;
    public final ve.a f48213b;
    public final Serializable f48214c;

    public f() {
        this.f48212a = 1;
        this.f48213b = new df.c();
        this.f48214c = new ArrayList();
    }

    @Override
    public void a(CharSequence charSequence) {
        switch (this.f48212a) {
            case 1:
                ((ArrayList) this.f48214c).add(charSequence);
                return;
            default:
                return;
        }
    }

    @Override
    public void d() {
        int i10;
        boolean z10;
        switch (this.f48212a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f48214c;
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
                ((ve.l) this.f48213b).f50807g = sb2.toString();
                return;
            default:
                return;
        }
    }

    @Override
    public final ve.a e() {
        switch (this.f48212a) {
            case 0:
                return (ve.i) this.f48213b;
            default:
                return (ve.l) this.f48213b;
        }
    }

    @Override
    public void g(we.a aVar) {
        switch (this.f48212a) {
            case 0:
                aVar.a((String) this.f48214c, (ve.i) this.f48213b);
                return;
            default:
                return;
        }
    }

    @Override
    public final q3.h h(d dVar) {
        switch (this.f48212a) {
            case 0:
                return null;
            default:
                if (dVar.f48201g >= 4) {
                    return new q3.h(-1, dVar.f48199c + 4, false);
                }
                if (dVar.h) {
                    return q3.h.a(dVar.e);
                }
                return null;
        }
    }

    public f(int i10, String str) {
        this.f48212a = 0;
        ?? cVar = new df.c();
        this.f48213b = cVar;
        cVar.f50803g = i10;
        this.f48214c = str;
    }
}
