package p0;

import android.text.SpannableStringBuilder;
import ca.i;
public final class b {
    public static final String f55070b;
    public static final String f55071c;
    public static final b d;
    public static final b f55072e;
    public final boolean f55073a;

    static {
        i iVar = f.f55080c;
        f55070b = Character.toString((char) 8206);
        f55071c = Character.toString((char) 8207);
        d = new b(false);
        f55072e = new b(true);
    }

    public b(boolean z10) {
        i iVar = f.f55078a;
        this.f55073a = z10;
    }

    public static int a(java.lang.CharSequence r9) {
        throw new UnsupportedOperationException("Method not decompiled: p0.b.a(java.lang.CharSequence):int");
    }

    public static int b(java.lang.CharSequence r6) {
        throw new UnsupportedOperationException("Method not decompiled: p0.b.b(java.lang.CharSequence):int");
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        i iVar;
        String str;
        i iVar2;
        char c10;
        i iVar3 = f.f55080c;
        if (charSequence == null) {
            return null;
        }
        boolean h = iVar3.h(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (h) {
            iVar = f.f55079b;
        } else {
            iVar = f.f55078a;
        }
        boolean h7 = iVar.h(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = f55071c;
        String str4 = f55070b;
        boolean z10 = this.f55073a;
        if (!z10 && (h7 || a(charSequence) == 1)) {
            str = str4;
        } else if (!z10 || (h7 && a(charSequence) != -1)) {
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
            iVar2 = f.f55079b;
        } else {
            iVar2 = f.f55078a;
        }
        boolean h10 = iVar2.h(charSequence.length(), charSequence);
        if (!z10 && (h10 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z10 && (!h10 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
