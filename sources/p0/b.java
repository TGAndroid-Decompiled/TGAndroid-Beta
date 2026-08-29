package p0;

import android.text.SpannableStringBuilder;
import c2.u;
public final class b {
    public static final String f45404b;
    public static final String f45405c;
    public static final b d;
    public static final b f45406e;
    public final boolean f45407a;

    static {
        u uVar = f.f45414c;
        f45404b = Character.toString((char) 8206);
        f45405c = Character.toString((char) 8207);
        d = new b(false);
        f45406e = new b(true);
    }

    public b(boolean z10) {
        u uVar = f.f45412a;
        this.f45407a = z10;
    }

    public static int a(java.lang.CharSequence r9) {
        throw new UnsupportedOperationException("Method not decompiled: p0.b.a(java.lang.CharSequence):int");
    }

    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f45403c = aVar.f45402b;
        int i10 = 0;
        int i11 = 0;
        while (aVar.f45403c > 0) {
            byte a2 = aVar.a();
            if (a2 != 0) {
                if (a2 != 1 && a2 != 2) {
                    if (a2 != 9) {
                        switch (a2) {
                            case 14:
                            case 15:
                                if (i11 == i10) {
                                    return -1;
                                }
                                i10--;
                                break;
                            case 16:
                            case 17:
                                if (i11 == i10) {
                                    return 1;
                                }
                                i10--;
                                break;
                            case 18:
                                i10++;
                                break;
                            default:
                                if (i11 != 0) {
                                    break;
                                } else {
                                    i11 = i10;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else if (i10 == 0) {
                    return 1;
                } else {
                    if (i11 == 0) {
                        i11 = i10;
                    }
                }
            } else if (i10 == 0) {
                return -1;
            } else {
                if (i11 == 0) {
                    i11 = i10;
                }
            }
        }
        return 0;
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        u uVar;
        String str;
        u uVar2;
        char c3;
        u uVar3 = f.f45414c;
        if (charSequence == null) {
            return null;
        }
        boolean g10 = uVar3.g(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (g10) {
            uVar = f.f45413b;
        } else {
            uVar = f.f45412a;
        }
        boolean g11 = uVar.g(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = f45405c;
        String str4 = f45404b;
        boolean z10 = this.f45407a;
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
                c3 = 8235;
            } else {
                c3 = 8234;
            }
            spannableStringBuilder.append(c3);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (g10) {
            uVar2 = f.f45413b;
        } else {
            uVar2 = f.f45412a;
        }
        boolean g12 = uVar2.g(charSequence.length(), charSequence);
        if (!z10 && (g12 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z10 && (!g12 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
