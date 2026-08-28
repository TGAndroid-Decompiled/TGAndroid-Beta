package p0;

import android.text.SpannableStringBuilder;
import c2.t;
public final class b {
    public static final String f45324b;
    public static final String f45325c;
    public static final b d;
    public static final b f45326e;
    public final boolean f45327a;

    static {
        t tVar = f.f45334c;
        f45324b = Character.toString((char) 8206);
        f45325c = Character.toString((char) 8207);
        d = new b(false);
        f45326e = new b(true);
    }

    public b(boolean z10) {
        t tVar = f.f45332a;
        this.f45327a = z10;
    }

    public static int a(java.lang.CharSequence r9) {
        throw new UnsupportedOperationException("Method not decompiled: p0.b.a(java.lang.CharSequence):int");
    }

    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f45323c = aVar.f45322b;
        int i9 = 0;
        int i10 = 0;
        while (aVar.f45323c > 0) {
            byte a2 = aVar.a();
            if (a2 != 0) {
                if (a2 != 1 && a2 != 2) {
                    if (a2 != 9) {
                        switch (a2) {
                            case 14:
                            case 15:
                                if (i10 == i9) {
                                    return -1;
                                }
                                i9--;
                                break;
                            case 16:
                            case 17:
                                if (i10 == i9) {
                                    return 1;
                                }
                                i9--;
                                break;
                            case 18:
                                i9++;
                                break;
                            default:
                                if (i10 != 0) {
                                    break;
                                } else {
                                    i10 = i9;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else if (i9 == 0) {
                    return 1;
                } else {
                    if (i10 == 0) {
                        i10 = i9;
                    }
                }
            } else if (i9 == 0) {
                return -1;
            } else {
                if (i10 == 0) {
                    i10 = i9;
                }
            }
        }
        return 0;
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        t tVar;
        String str;
        t tVar2;
        char c10;
        t tVar3 = f.f45334c;
        if (charSequence == null) {
            return null;
        }
        boolean g10 = tVar3.g(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (g10) {
            tVar = f.f45333b;
        } else {
            tVar = f.f45332a;
        }
        boolean g11 = tVar.g(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = f45325c;
        String str4 = f45324b;
        boolean z10 = this.f45327a;
        if (!z10 && (g11 || a(charSequence) == 1)) {
            str = str4;
        } else if (!z10 || (g11 && a(charSequence) != -1)) {
            str = "";
        } else {
            str = str3;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (g10 != z10) {
            if (g10) {
                c10 = 8235;
            } else {
                c10 = 8234;
            }
            spannableStringBuilder.append(c10);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (g10) {
            tVar2 = f.f45333b;
        } else {
            tVar2 = f.f45332a;
        }
        boolean g12 = tVar2.g(charSequence.length(), charSequence);
        if (!z10 && (g12 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z10 && (!g12 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
