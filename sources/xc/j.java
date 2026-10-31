package xc;

import java.util.Locale;
public abstract class j extends f2.f {
    public String f53636c;
    public String d;
    public String e;
    public final StringBuilder f53637f;
    public String f53638g;
    public boolean h;
    public boolean f53639i;
    public boolean f53640j;
    public wc.b f53641k;

    public j(int i10) {
        super(i10, 1);
        this.f53637f = new StringBuilder();
        this.h = false;
        this.f53639i = false;
        this.f53640j = false;
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
        this.f53639i = true;
        String str = this.f53638g;
        StringBuilder sb2 = this.f53637f;
        if (str != null) {
            sb2.append(str);
            this.f53638g = null;
        }
        sb2.append(c10);
    }

    public final void f(String str) {
        this.f53639i = true;
        String str2 = this.f53638g;
        StringBuilder sb2 = this.f53637f;
        if (str2 != null) {
            sb2.append(str2);
            this.f53638g = null;
        }
        if (sb2.length() == 0) {
            this.f53638g = str;
        } else {
            sb2.append(str);
        }
    }

    public final void g(int[] iArr) {
        this.f53639i = true;
        String str = this.f53638g;
        StringBuilder sb2 = this.f53637f;
        if (str != null) {
            sb2.append(str);
            this.f53638g = null;
        }
        for (int i10 : iArr) {
            sb2.appendCodePoint(i10);
        }
    }

    public final void h(String str) {
        String str2;
        String str3 = this.f53636c;
        if (str3 != null) {
            str = str3.concat(str);
        }
        this.f53636c = str;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ENGLISH);
        } else {
            str2 = "";
        }
        this.d = str2;
    }

    public final String i() {
        String str = this.f53636c;
        if (str != null && str.length() != 0) {
            return this.f53636c;
        }
        throw new IllegalArgumentException("Must be false");
    }

    public final void j() {
        String str;
        if (this.f53641k == null) {
            this.f53641k = new wc.b();
        }
        String str2 = this.e;
        StringBuilder sb2 = this.f53637f;
        if (str2 != null) {
            String trim = str2.trim();
            this.e = trim;
            if (trim.length() > 0) {
                if (this.f53639i) {
                    if (sb2.length() > 0) {
                        str = sb2.toString();
                    } else {
                        str = this.f53638g;
                    }
                } else if (this.h) {
                    str = "";
                } else {
                    str = null;
                }
                wc.b bVar = this.f53641k;
                String str3 = this.e;
                int l4 = bVar.l(str3);
                if (l4 != -1) {
                    bVar.f52801c[l4] = str;
                } else {
                    int i10 = bVar.f52799a;
                    int i11 = i10 + 1;
                    if (i11 >= i10) {
                        String[] strArr = bVar.f52800b;
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
                            bVar.f52800b = strArr2;
                            String[] strArr3 = bVar.f52801c;
                            String[] strArr4 = new String[i11];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
                            bVar.f52801c = strArr4;
                        }
                        String[] strArr5 = bVar.f52800b;
                        int i13 = bVar.f52799a;
                        strArr5[i13] = str3;
                        bVar.f52801c[i13] = str;
                        bVar.f52799a = i13 + 1;
                    } else {
                        throw new IllegalArgumentException("Must be true");
                    }
                }
            }
        }
        this.e = null;
        this.h = false;
        this.f53639i = false;
        f2.f.c(sb2);
        this.f53638g = null;
    }

    @Override
    public j b() {
        this.f53636c = null;
        this.d = null;
        this.e = null;
        f2.f.c(this.f53637f);
        this.f53638g = null;
        this.h = false;
        this.f53639i = false;
        this.f53640j = false;
        this.f53641k = null;
        return this;
    }
}
