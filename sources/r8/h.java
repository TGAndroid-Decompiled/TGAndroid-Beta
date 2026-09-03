package r8;

import b4.e0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import k7.c7;
import m1.j;
public final class h implements Iterator {
    public String f43417b;
    public final CharSequence f43418c;
    public final a d;
    public int f43419f;
    public final o3.c h;
    public int f43416a = 2;
    public int e = 0;

    public h(o3.c cVar, e0 e0Var, CharSequence charSequence) {
        this.h = cVar;
        this.d = (a) e0Var.f1379c;
        this.f43419f = e0Var.f1378b;
        this.f43418c = charSequence;
    }

    @Override
    public final boolean hasNext() {
        String str;
        a aVar;
        int i10 = this.f43416a;
        if (i10 != 4) {
            int c3 = j.c(i10);
            if (c3 == 0) {
                return true;
            }
            if (c3 != 2) {
                this.f43416a = 4;
                int i11 = this.e;
                while (true) {
                    int i12 = this.e;
                    if (i12 != -1) {
                        b bVar = (b) this.h.f16228b;
                        CharSequence charSequence = this.f43418c;
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
                            this.e = -1;
                        } else {
                            this.e = i12 + 1;
                        }
                        int i13 = this.e;
                        if (i13 == i11) {
                            int i14 = i13 + 1;
                            this.e = i14;
                            if (i14 > charSequence.length()) {
                                this.e = -1;
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
                            int i15 = this.f43419f;
                            if (i15 == 1) {
                                i12 = charSequence.length();
                                this.e = -1;
                                while (i12 > i11 && aVar.a(charSequence.charAt(i12 - 1))) {
                                    i12--;
                                }
                            } else {
                                this.f43419f = i15 - 1;
                            }
                            str = charSequence.subSequence(i11, i12).toString();
                        }
                    } else {
                        this.f43416a = 3;
                        str = null;
                        break;
                    }
                }
                this.f43417b = str;
                if (this.f43416a != 3) {
                    this.f43416a = 1;
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
            this.f43416a = 2;
            String str = this.f43417b;
            this.f43417b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
