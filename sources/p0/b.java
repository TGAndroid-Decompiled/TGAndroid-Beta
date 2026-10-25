package p0;

import android.text.SpannableStringBuilder;
import b2.u;
public final class b {
    public static final String f46470b;
    public static final String f46471c;
    public static final b d;
    public static final b e;
    public final boolean f46472a;

    static {
        u uVar = f.f46479c;
        f46470b = Character.toString((char) 8206);
        f46471c = Character.toString((char) 8207);
        d = new b(false);
        e = new b(true);
    }

    public b(boolean z10) {
        u uVar = f.f46477a;
        this.f46472a = z10;
    }

    public static int a(java.lang.CharSequence r9) {
        throw new UnsupportedOperationException("Method not decompiled: p0.b.a(java.lang.CharSequence):int");
    }

    public static int b(java.lang.CharSequence r6) {
        throw new UnsupportedOperationException("Method not decompiled: p0.b.b(java.lang.CharSequence):int");
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        u uVar;
        String str;
        u uVar2;
        char c10;
        u uVar3 = f.f46479c;
        if (charSequence == null) {
            return null;
        }
        boolean h = uVar3.h(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (h) {
            uVar = f.f46478b;
        } else {
            uVar = f.f46477a;
        }
        boolean h10 = uVar.h(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = f46471c;
        String str4 = f46470b;
        boolean z10 = this.f46472a;
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
            uVar2 = f.f46478b;
        } else {
            uVar2 = f.f46477a;
        }
        boolean h11 = uVar2.h(charSequence.length(), charSequence);
        if (!z10 && (h11 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z10 && (!h11 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
