package pc;

import java.util.Locale;
public abstract class j extends n3.a {
    public String f44330c;
    public String d;
    public String f44331e;
    public final StringBuilder f44332f;
    public String h;
    public boolean f44333n;
    public boolean f44334r;
    public boolean f44335s;
    public oc.b v;

    public j(int i10) {
        super(i10, 1);
        this.f44332f = new StringBuilder();
        this.f44333n = false;
        this.f44334r = false;
        this.f44335s = false;
    }

    public final void i(char c3) {
        String valueOf = String.valueOf(c3);
        String str = this.f44331e;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.f44331e = valueOf;
    }

    public final void j(char c3) {
        this.f44334r = true;
        String str = this.h;
        StringBuilder sb = this.f44332f;
        if (str != null) {
            sb.append(str);
            this.h = null;
        }
        sb.append(c3);
    }

    public final void k(String str) {
        this.f44334r = true;
        String str2 = this.h;
        StringBuilder sb = this.f44332f;
        if (str2 != null) {
            sb.append(str2);
            this.h = null;
        }
        if (sb.length() == 0) {
            this.h = str;
        } else {
            sb.append(str);
        }
    }

    public final void m(int[] iArr) {
        this.f44334r = true;
        String str = this.h;
        StringBuilder sb = this.f44332f;
        if (str != null) {
            sb.append(str);
            this.h = null;
        }
        for (int i10 : iArr) {
            sb.appendCodePoint(i10);
        }
    }

    public final void n(String str) {
        String str2;
        String str3 = this.f44330c;
        if (str3 != null) {
            str = str3.concat(str);
        }
        this.f44330c = str;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ENGLISH);
        } else {
            str2 = "";
        }
        this.d = str2;
    }

    public final String o() {
        String str = this.f44330c;
        if (str != null && str.length() != 0) {
            return this.f44330c;
        }
        throw new IllegalArgumentException("Must be false");
    }

    public final void p() {
        String str;
        if (this.v == null) {
            this.v = new oc.b();
        }
        String str2 = this.f44331e;
        StringBuilder sb = this.f44332f;
        if (str2 != null) {
            String trim = str2.trim();
            this.f44331e = trim;
            if (trim.length() > 0) {
                if (this.f44334r) {
                    if (sb.length() > 0) {
                        str = sb.toString();
                    } else {
                        str = this.h;
                    }
                } else if (this.f44333n) {
                    str = "";
                } else {
                    str = null;
                }
                oc.b bVar = this.v;
                String str3 = this.f44331e;
                int i10 = bVar.i(str3);
                if (i10 != -1) {
                    bVar.f16710c[i10] = str;
                } else {
                    int i11 = bVar.f16708a;
                    int i12 = i11 + 1;
                    if (i12 >= i11) {
                        String[] strArr = bVar.f16709b;
                        int length = strArr.length;
                        if (length < i12) {
                            int i13 = 4;
                            if (length >= 4) {
                                i13 = i11 * 2;
                            }
                            if (i12 <= i13) {
                                i12 = i13;
                            }
                            String[] strArr2 = new String[i12];
                            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i12));
                            bVar.f16709b = strArr2;
                            String[] strArr3 = bVar.f16710c;
                            String[] strArr4 = new String[i12];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i12));
                            bVar.f16710c = strArr4;
                        }
                        String[] strArr5 = bVar.f16709b;
                        int i14 = bVar.f16708a;
                        strArr5[i14] = str3;
                        bVar.f16710c[i14] = str;
                        bVar.f16708a = i14 + 1;
                    } else {
                        throw new IllegalArgumentException("Must be true");
                    }
                }
            }
        }
        this.f44331e = null;
        this.f44333n = false;
        this.f44334r = false;
        n3.a.h(sb);
        this.h = null;
    }

    @Override
    public j g() {
        this.f44330c = null;
        this.d = null;
        this.f44331e = null;
        n3.a.h(this.f44332f);
        this.h = null;
        this.f44333n = false;
        this.f44334r = false;
        this.f44335s = false;
        this.v = null;
        return this;
    }
}
