package r8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import k7.c7;
import m1.j;
import org.telegram.ui.web.e0;
public final class h implements Iterator {
    public String f46774b;
    public final CharSequence f46775c;
    public final a d;
    public int f46777f;
    public final e0 h;
    public int f46773a = 2;
    public int f46776e = 0;

    public h(e0 e0Var, b4.e0 e0Var2, CharSequence charSequence) {
        this.h = e0Var;
        this.d = (a) e0Var2.f1475c;
        this.f46777f = e0Var2.f1474b;
        this.f46775c = charSequence;
    }

    @Override
    public final boolean hasNext() {
        String str;
        a aVar;
        int i10 = this.f46773a;
        if (i10 != 4) {
            int c3 = j.c(i10);
            if (c3 == 0) {
                return true;
            }
            if (c3 != 2) {
                this.f46773a = 4;
                int i11 = this.f46776e;
                while (true) {
                    int i12 = this.f46776e;
                    if (i12 != -1) {
                        b bVar = (b) this.h.f42491b;
                        CharSequence charSequence = this.f46775c;
                        int length = charSequence.length();
                        c7.d(i12, length);
                        while (true) {
                            if (i12 < length) {
                                if (bVar.a(charSequence.charAt(i12))) {
                                    break;
                                }
                                i12++;
                            } else {
                                i12 = -1;
                                break;
                            }
                        }
                        if (i12 == -1) {
                            i12 = charSequence.length();
                            this.f46776e = -1;
                        } else {
                            this.f46776e = i12 + 1;
                        }
                        int i13 = this.f46776e;
                        if (i13 == i11) {
                            int i14 = i13 + 1;
                            this.f46776e = i14;
                            if (i14 > charSequence.length()) {
                                this.f46776e = -1;
                            }
                        } else {
                            while (true) {
                                aVar = this.d;
                                if (i11 >= i12 || !aVar.a(charSequence.charAt(i11))) {
                                    break;
                                }
                                i11++;
                            }
                            while (i12 > i11 && aVar.a(charSequence.charAt(i12 - 1))) {
                                i12--;
                            }
                            int i15 = this.f46777f;
                            if (i15 == 1) {
                                i12 = charSequence.length();
                                this.f46776e = -1;
                                while (i12 > i11 && aVar.a(charSequence.charAt(i12 - 1))) {
                                    i12--;
                                }
                            } else {
                                this.f46777f = i15 - 1;
                            }
                            str = charSequence.subSequence(i11, i12).toString();
                        }
                    } else {
                        this.f46773a = 3;
                        str = null;
                        break;
                    }
                }
                this.f46774b = str;
                if (this.f46773a != 3) {
                    this.f46773a = 1;
                    return true;
                }
                return false;
            }
            return false;
        }
        throw new IllegalStateException();
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.f46773a = 2;
            String str = this.f46774b;
            this.f46774b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
