package p8;

import ag.j2;
import i7.p6;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m1.j;
import org.telegram.ui.Components.n;
public final class h implements Iterator {
    public String f45663b;
    public final CharSequence f45664c;
    public final a d;
    public int f45666f;
    public final n h;
    public int f45662a = 2;
    public int f45665e = 0;

    public h(n nVar, j2 j2Var, CharSequence charSequence) {
        this.h = nVar;
        this.d = (a) j2Var.f559c;
        this.f45666f = j2Var.f558b;
        this.f45664c = charSequence;
    }

    @Override
    public final boolean hasNext() {
        String str;
        a aVar;
        int i10 = this.f45662a;
        if (i10 != 4) {
            int b10 = j.b(i10);
            if (b10 == 0) {
                return true;
            }
            if (b10 != 2) {
                this.f45662a = 4;
                int i11 = this.f45665e;
                while (true) {
                    int i12 = this.f45665e;
                    if (i12 != -1) {
                        b bVar = (b) this.h.f30787b;
                        CharSequence charSequence = this.f45664c;
                        int length = charSequence.length();
                        p6.c(i12, length);
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
                            this.f45665e = -1;
                        } else {
                            this.f45665e = i12 + 1;
                        }
                        int i13 = this.f45665e;
                        if (i13 == i11) {
                            int i14 = i13 + 1;
                            this.f45665e = i14;
                            if (i14 > charSequence.length()) {
                                this.f45665e = -1;
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
                            int i15 = this.f45666f;
                            if (i15 == 1) {
                                i12 = charSequence.length();
                                this.f45665e = -1;
                                while (i12 > i11 && aVar.a(charSequence.charAt(i12 - 1))) {
                                    i12--;
                                }
                            } else {
                                this.f45666f = i15 - 1;
                            }
                            str = charSequence.subSequence(i11, i12).toString();
                        }
                    } else {
                        this.f45662a = 3;
                        str = null;
                        break;
                    }
                }
                this.f45663b = str;
                if (this.f45662a != 3) {
                    this.f45662a = 1;
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
            this.f45662a = 2;
            String str = this.f45663b;
            this.f45663b = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
