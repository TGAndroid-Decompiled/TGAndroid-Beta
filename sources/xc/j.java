package xc;

import java.util.Locale;
public abstract class j extends f2.f {
    public String f53654c;
    public String d;
    public String e;
    public final StringBuilder f53655f;
    public String f53656g;
    public boolean h;
    public boolean f53657i;
    public boolean f53658j;
    public wc.b f53659k;

    public j(int i10) {
        super(i10, 1);
        this.f53655f = new StringBuilder();
        this.h = false;
        this.f53657i = false;
        this.f53658j = false;
    }

    public final void d(char c10) {
        String valueOf = String.valueOf(c10);
        String str = this.e;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.e = valueOf;
    }

    public final void e(char c10) {
        this.f53657i = true;
        String str = this.f53656g;
        StringBuilder sb2 = this.f53655f;
        if (str != null) {
            sb2.append(str);
            this.f53656g = null;
        }
        sb2.append(c10);
    }

    public final void f(String str) {
        this.f53657i = true;
        String str2 = this.f53656g;
        StringBuilder sb2 = this.f53655f;
        if (str2 != null) {
            sb2.append(str2);
            this.f53656g = null;
        }
        if (sb2.length() == 0) {
            this.f53656g = str;
        } else {
            sb2.append(str);
        }
    }

    public final void g(int[] iArr) {
        this.f53657i = true;
        String str = this.f53656g;
        StringBuilder sb2 = this.f53655f;
        if (str != null) {
            sb2.append(str);
            this.f53656g = null;
        }
        for (int i10 : iArr) {
            sb2.appendCodePoint(i10);
        }
    }

    public final void h(String str) {
        String str2;
        String str3 = this.f53654c;
        if (str3 != null) {
            str = str3.concat(str);
        }
        this.f53654c = str;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ENGLISH);
        } else {
            str2 = "";
        }
        this.d = str2;
    }

    public final String i() {
        String str = this.f53654c;
        if (str != null && str.length() != 0) {
            return this.f53654c;
        }
        throw new IllegalArgumentException("Must be false");
    }

    public final void j() {
        String str;
        if (this.f53659k == null) {
            this.f53659k = new wc.b();
        }
        String str2 = this.e;
        StringBuilder sb2 = this.f53655f;
        if (str2 != null) {
            String trim = str2.trim();
            this.e = trim;
            if (trim.length() > 0) {
                if (this.f53657i) {
                    if (sb2.length() > 0) {
                        str = sb2.toString();
                    } else {
                        str = this.f53656g;
                    }
                } else if (this.h) {
                    str = "";
                } else {
                    str = null;
                }
                wc.b bVar = this.f53659k;
                String str3 = this.e;
                int l4 = bVar.l(str3);
                if (l4 != -1) {
                    bVar.f52819c[l4] = str;
                } else {
                    int i10 = bVar.f52817a;
                    int i11 = i10 + 1;
                    if (i11 >= i10) {
                        String[] strArr = bVar.f52818b;
                        int length = strArr.length;
                        if (length < i11) {
                            int i12 = 4;
                            if (length >= 4) {
                                i12 = i10 * 2;
                            }
                            if (i11 <= i12) {
                                i11 = i12;
                            }
                            String[] strArr2 = new String[i11];
                            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i11));
                            bVar.f52818b = strArr2;
                            String[] strArr3 = bVar.f52819c;
                            String[] strArr4 = new String[i11];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
                            bVar.f52819c = strArr4;
                        }
                        String[] strArr5 = bVar.f52818b;
                        int i13 = bVar.f52817a;
                        strArr5[i13] = str3;
                        bVar.f52819c[i13] = str;
                        bVar.f52817a = i13 + 1;
                    } else {
                        throw new IllegalArgumentException("Must be true");
                    }
                }
            }
        }
        this.e = null;
        this.h = false;
        this.f53657i = false;
        f2.f.c(sb2);
        this.f53656g = null;
    }

    @Override
    public j b() {
        this.f53654c = null;
        this.d = null;
        this.e = null;
        f2.f.c(this.f53655f);
        this.f53656g = null;
        this.h = false;
        this.f53657i = false;
        this.f53658j = false;
        this.f53659k = null;
        return this;
    }
}
