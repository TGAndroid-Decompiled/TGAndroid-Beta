package p0;

import android.text.SpannableStringBuilder;
import b2.p;
public final class b {
    public static final String f39510b;
    public static final String f39511c;
    public static final b d;
    public static final b e;
    public final boolean f39512a;

    static {
        p pVar = f.f39519c;
        f39510b = Character.toString((char) 8206);
        f39511c = Character.toString((char) 8207);
        d = new b(false);
        e = new b(true);
    }

    public b(boolean z10) {
        p pVar = f.f39517a;
        this.f39512a = z10;
    }

    public static int a(java.lang.CharSequence r9) {
        throw new UnsupportedOperationException("Method not decompiled: p0.b.a(java.lang.CharSequence):int");
    }

    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f39509c = aVar.f39508b;
        int i10 = 0;
        int i11 = 0;
        while (aVar.f39509c > 0) {
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
        p pVar;
        String str;
        p pVar2;
        char c10;
        p pVar3 = f.f39519c;
        if (charSequence == null) {
            return null;
        }
        boolean h = pVar3.h(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (h) {
            pVar = f.f39518b;
        } else {
            pVar = f.f39517a;
        }
        boolean h10 = pVar.h(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = f39511c;
        String str4 = f39510b;
        boolean z10 = this.f39512a;
        if (!z10 && (h10 || a(charSequence) == 1)) {
            str = str4;
        } else if (!z10 || (h10 && a(charSequence) != -1)) {
            str = "";
        } else {
            str = str3;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (h != z10) {
            if (h) {
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
        if (h) {
            pVar2 = f.f39518b;
        } else {
            pVar2 = f.f39517a;
        }
        boolean h11 = pVar2.h(charSequence.length(), charSequence);
        if (!z10 && (h11 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z10 && (!h11 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
