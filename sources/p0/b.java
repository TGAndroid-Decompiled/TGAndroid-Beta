package p0;

import android.text.SpannableStringBuilder;
import ca.i;
public final class b {
    public static final String f55101b;
    public static final String f55102c;
    public static final b d;
    public static final b f55103e;
    public final boolean f55104a;

    static {
        i iVar = f.f55111c;
        f55101b = Character.toString((char) 8206);
        f55102c = Character.toString((char) 8207);
        d = new b(false);
        f55103e = new b(true);
    }

    public b(boolean z10) {
        i iVar = f.f55109a;
        this.f55104a = z10;
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
        i iVar3 = f.f55111c;
        if (charSequence == null) {
            return null;
        }
        boolean h = iVar3.h(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (h) {
            iVar = f.f55110b;
        } else {
            iVar = f.f55109a;
        }
        boolean h7 = iVar.h(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = f55102c;
        String str4 = f55101b;
        boolean z10 = this.f55104a;
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
            iVar2 = f.f55110b;
        } else {
            iVar2 = f.f55109a;
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
