package p0;

import android.text.SpannableStringBuilder;
import ba.i;
public final class b {
    public static final String f53047b;
    public static final String f53048c;
    public static final b d;
    public static final b f53049e;
    public final boolean f53050a;

    static {
        i iVar = f.f53057c;
        f53047b = Character.toString((char) 8206);
        f53048c = Character.toString((char) 8207);
        d = new b(false);
        f53049e = new b(true);
    }

    public b(boolean z10) {
        i iVar = f.f53055a;
        this.f53050a = z10;
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
        char c2;
        i iVar3 = f.f53057c;
        if (charSequence == null) {
            return null;
        }
        boolean h = iVar3.h(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (h) {
            iVar = f.f53056b;
        } else {
            iVar = f.f53055a;
        }
        boolean h7 = iVar.h(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = f53048c;
        String str4 = f53047b;
        boolean z10 = this.f53050a;
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
                c2 = 8235;
            } else {
                c2 = 8234;
            }
            spannableStringBuilder.append(c2);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (h) {
            iVar2 = f.f53056b;
        } else {
            iVar2 = f.f53055a;
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
