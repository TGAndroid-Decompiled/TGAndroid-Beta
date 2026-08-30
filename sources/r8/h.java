package r8;

import b4.e0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import k7.b7;
import m1.j;
import org.telegram.ui.Components.qk0;
public final class h implements Iterator {
    public String f43393b;
    public final CharSequence f43394c;
    public final a d;
    public int f43395f;
    public final qk0 h;
    public int f43392a = 2;
    public int e = 0;

    public h(qk0 qk0Var, e0 e0Var, CharSequence charSequence) {
        this.h = qk0Var;
        this.d = (a) e0Var.f1368c;
        this.f43395f = e0Var.f1367b;
        this.f43394c = charSequence;
    }

    @Override
    public final boolean hasNext() {
        String str;
        a aVar;
        int i10 = this.f43392a;
        if (i10 != 4) {
            int b10 = j.b(i10);
            if (b10 == 0) {
                return true;
            }
            if (b10 != 2) {
                this.f43392a = 4;
                int i11 = this.e;
                while (true) {
                    int i12 = this.e;
                    if (i12 != -1) {
                        b bVar = (b) this.h.f28149b;
                        CharSequence charSequence = this.f43394c;
                        int length = charSequence.length();
                        b7.d(i12, length);
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
                            int i15 = this.f43395f;
                            if (i15 == 1) {
                                i12 = charSequence.length();
                                this.e = -1;
                                while (i12 > i11 && aVar.a(charSequence.charAt(i12 - 1))) {
                                    i12--;
                                }
                            } else {
                                this.f43395f = i15 - 1;
                            }
                            str = charSequence.subSequence(i11, i12).toString();
                        }
                    } else {
                        this.f43392a = 3;
                        str = null;
                        break;
                    }
                }
                this.f43393b = str;
                if (this.f43392a != 3) {
                    this.f43392a = 1;
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
            this.f43392a = 2;
            String str = this.f43393b;
            this.f43393b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
