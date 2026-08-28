package x5;

import android.net.Uri;
import java.util.Arrays;
public final class g0 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String f48924a;
    public final String f48925b;
    public final boolean f48926c;

    public g0(String str, String str2, boolean z10) {
        l.f(str);
        this.f48924a = str;
        l.f(str2);
        this.f48925b = str2;
        this.f48926c = z10;
    }

    public final android.content.Intent a(android.content.Context r6) {
        throw new UnsupportedOperationException("Method not decompiled: x5.g0.a(android.content.Context):android.content.Intent");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (l.l(this.f48924a, g0Var.f48924a) && l.l(this.f48925b, g0Var.f48925b) && l.l(null, null) && this.f48926c == g0Var.f48926c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48924a, this.f48925b, null, 4225, Boolean.valueOf(this.f48926c)});
    }

    public final String toString() {
        String str = this.f48924a;
        if (str != null) {
            return str;
        }
        l.h(null);
        throw null;
    }
}
