package p0;

import android.text.SpannableStringBuilder;
import b2.t;
public final class b {
    public static final String f43907b;
    public static final String f43908c;
    public static final b d;
    public static final b e;
    public final boolean f43909a;

    static {
        t tVar = f.f43916c;
        f43907b = Character.toString((char) 8206);
        f43908c = Character.toString((char) 8207);
        d = new b(false);
        e = new b(true);
    }

    public b(boolean z10) {
        t tVar = f.f43914a;
        this.f43909a = z10;
    }

    public static int a(java.lang.CharSequence r9) {
        throw new UnsupportedOperationException("Method not decompiled: p0.b.a(java.lang.CharSequence):int");
    }

    public static int b(java.lang.CharSequence r6) {
        throw new UnsupportedOperationException("Method not decompiled: p0.b.b(java.lang.CharSequence):int");
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        t tVar;
        String str;
        t tVar2;
        char c10;
        t tVar3 = f.f43916c;
        if (charSequence == null) {
            return null;
        }
        boolean h = tVar3.h(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (h) {
            tVar = f.f43915b;
        } else {
            tVar = f.f43914a;
        }
        boolean h10 = tVar.h(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = f43908c;
        String str4 = f43907b;
        boolean z10 = this.f43909a;
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
            tVar2 = f.f43915b;
        } else {
            tVar2 = f.f43914a;
        }
        boolean h11 = tVar2.h(charSequence.length(), charSequence);
        if (!z10 && (h11 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z10 && (!h11 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
