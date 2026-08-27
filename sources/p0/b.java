package p0;

import android.text.SpannableStringBuilder;
import c2.t;

public final class b {

    public static final String f45330b;

    public static final String f45331c;
    public static final b d;

    public static final b f45332e;

    public final boolean f45333a;

    static {
        t tVar = f.f45340c;
        f45330b = Character.toString((char) 8206);
        f45331c = Character.toString((char) 8207);
        d = new b(false);
        f45332e = new b(true);
    }

    public b(boolean z10) {
        t tVar = f.f45338a;
        this.f45333a = z10;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        a aVar = new a(charSequence);
        aVar.f45329c = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = aVar.f45329c;
            if (i13 < aVar.f45328b && i10 == 0) {
                CharSequence charSequence2 = aVar.f45327a;
                char cCharAt = charSequence2.charAt(i13);
                aVar.d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, aVar.f45329c);
                    aVar.f45329c = Character.charCount(iCodePointAt) + aVar.f45329c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    aVar.f45329c++;
                    char c10 = aVar.d;
                    directionality = c10 < 1792 ? a.f45326e[c10] : Character.getDirectionality(c10);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
        }
        if (i10 != 0) {
            if (i11 == 0) {
                while (aVar.f45329c > 0) {
                    switch (aVar.a()) {
                        case 14:
                        case 15:
                            if (i10 == i12) {
                                return -1;
                            }
                            i12--;
                            break;
                        case 16:
                        case 17:
                            if (i10 == i12) {
                                return 1;
                            }
                            i12--;
                            break;
                        case 18:
                            i12++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i11;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        a aVar = new a(charSequence);
        aVar.f45329c = aVar.f45328b;
        int i10 = 0;
        int i11 = 0;
        while (aVar.f45329c > 0) {
            byte bA = aVar.a();
            if (bA == 0) {
                if (i10 == 0) {
                    return -1;
                }
                if (i11 == 0) {
                    i11 = i10;
                }
            } else if (bA == 1 || bA == 2) {
                if (i10 == 0) {
                    return 1;
                }
                if (i11 == 0) {
                    i11 = i10;
                }
            } else if (bA != 9) {
                switch (bA) {
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
                        if (i11 == 0) {
                            i11 = i10;
                        }
                        break;
                }
            } else {
                continue;
            }
        }
        return 0;
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        String str;
        t tVar = f.f45340c;
        if (charSequence == null) {
            return null;
        }
        boolean zG = tVar.g(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zG2 = (zG ? f.f45339b : f.f45338a).g(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = f45331c;
        String str4 = f45330b;
        boolean z10 = this.f45333a;
        if (z10 || !(zG2 || a(charSequence) == 1)) {
            str = (!z10 || (zG2 && a(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zG != z10) {
            spannableStringBuilder.append(zG ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zG3 = (zG ? f.f45339b : f.f45338a).g(charSequence.length(), charSequence);
        if (!z10 && (zG3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z10 && (!zG3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
