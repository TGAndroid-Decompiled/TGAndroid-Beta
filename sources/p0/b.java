package p0;

import android.text.SpannableStringBuilder;
import b2.p;
public final class b {
    public static final String f45216b;
    public static final String f45217c;
    public static final b d;
    public static final b f45218e;
    public final boolean f45219a;

    static {
        p pVar = f.f45226c;
        f45216b = Character.toString((char) 8206);
        f45217c = Character.toString((char) 8207);
        d = new b(false);
        f45218e = new b(true);
    }

    public b(boolean z10) {
        p pVar = f.f45224a;
        this.f45219a = z10;
    }

    public static int a(java.lang.CharSequence r9) {
        throw new UnsupportedOperationException("Method not decompiled: p0.b.a(java.lang.CharSequence):int");
    }

    public static int b(java.lang.CharSequence r6) {
        throw new UnsupportedOperationException("Method not decompiled: p0.b.b(java.lang.CharSequence):int");
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        p pVar;
        String str;
        p pVar2;
        char c10;
        p pVar3 = f.f45226c;
        if (charSequence == null) {
            return null;
        }
        boolean h = pVar3.h(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (h) {
            pVar = f.f45225b;
        } else {
            pVar = f.f45224a;
        }
        boolean h10 = pVar.h(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = f45217c;
        String str4 = f45216b;
        boolean z10 = this.f45219a;
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
            pVar2 = f.f45225b;
        } else {
            pVar2 = f.f45224a;
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
