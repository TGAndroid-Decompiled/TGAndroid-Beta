package pc;

import java.util.Locale;
public abstract class j extends n3.a {
    public String f41165c;
    public String d;
    public String e;
    public final StringBuilder f41166f;
    public String h;
    public boolean f41167n;
    public boolean f41168r;
    public boolean f41169s;
    public oc.b v;

    public j(int i10) {
        super(i10, 1);
        this.f41166f = new StringBuilder();
        this.f41167n = false;
        this.f41168r = false;
        this.f41169s = false;
    }

    public final void j(char c3) {
        String valueOf = String.valueOf(c3);
        String str = this.e;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.e = valueOf;
    }

    public final void k(char c3) {
        this.f41168r = true;
        String str = this.h;
        StringBuilder sb = this.f41166f;
        if (str != null) {
            sb.append(str);
            this.h = null;
        }
        sb.append(c3);
    }

    public final void l(String str) {
        this.f41168r = true;
        String str2 = this.h;
        StringBuilder sb = this.f41166f;
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

    public final void n(int[] iArr) {
        this.f41168r = true;
        String str = this.h;
        StringBuilder sb = this.f41166f;
        if (str != null) {
            sb.append(str);
            this.h = null;
        }
        for (int i10 : iArr) {
            sb.appendCodePoint(i10);
        }
    }

    public final void o(String str) {
        String str2;
        String str3 = this.f41165c;
        if (str3 != null) {
            str = str3.concat(str);
        }
        this.f41165c = str;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ENGLISH);
        } else {
            str2 = "";
        }
        this.d = str2;
    }

    public final String q() {
        String str = this.f41165c;
        if (str != null && str.length() != 0) {
            return this.f41165c;
        }
        throw new IllegalArgumentException("Must be false");
    }

    public final void r() {
        String str;
        if (this.v == null) {
            this.v = new oc.b();
        }
        String str2 = this.e;
        StringBuilder sb = this.f41166f;
        if (str2 != null) {
            String trim = str2.trim();
            this.e = trim;
            if (trim.length() > 0) {
                if (this.f41168r) {
                    if (sb.length() > 0) {
                        str = sb.toString();
                    } else {
                        str = this.h;
                    }
                } else if (this.f41167n) {
                    str = "";
                } else {
                    str = null;
                }
                oc.b bVar = this.v;
                String str3 = this.e;
                int i10 = bVar.i(str3);
                if (i10 != -1) {
                    bVar.f16542c[i10] = str;
                } else {
                    int i11 = bVar.f16540a;
                    int i12 = i11 + 1;
                    if (i12 >= i11) {
                        String[] strArr = bVar.f16541b;
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
                            bVar.f16541b = strArr2;
                            String[] strArr3 = bVar.f16542c;
                            String[] strArr4 = new String[i12];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i12));
                            bVar.f16542c = strArr4;
                        }
                        String[] strArr5 = bVar.f16541b;
                        int i14 = bVar.f16540a;
                        strArr5[i14] = str3;
                        bVar.f16542c[i14] = str;
                        bVar.f16540a = i14 + 1;
                    } else {
                        throw new IllegalArgumentException("Must be true");
                    }
                }
            }
        }
        this.e = null;
        this.f41167n = false;
        this.f41168r = false;
        n3.a.i(sb);
        this.h = null;
    }

    @Override
    public j h() {
        this.f41165c = null;
        this.d = null;
        this.e = null;
        n3.a.i(this.f41166f);
        this.h = null;
        this.f41167n = false;
        this.f41168r = false;
        this.f41169s = false;
        this.v = null;
        return this;
    }
}
