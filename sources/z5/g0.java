package z5;

import android.net.Uri;
import java.util.Arrays;
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f50624a;
    public final String f50625b;
    public final boolean f50626c;

    public g0(String str, String str2, boolean z10) {
        l.f(str);
        this.f50624a = str;
        l.f(str2);
        this.f50625b = str2;
        this.f50626c = z10;
    }

    public final android.content.Intent a(android.content.Context r6) {
        throw new UnsupportedOperationException("Method not decompiled: z5.g0.a(android.content.Context):android.content.Intent");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (l.l(this.f50624a, g0Var.f50624a) && l.l(this.f50625b, g0Var.f50625b) && l.l(null, null) && this.f50626c == g0Var.f50626c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50624a, this.f50625b, null, 4225, Boolean.valueOf(this.f50626c)});
    }

    public final String toString() {
        String str = this.f50624a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
