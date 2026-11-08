package r0;

import android.text.TextUtils;
import android.view.View;
public final class v extends x {
    public final int f54229e;

    public v(int i7, Class cls, int i10, int i11, int i12) {
        this.f54229e = i12;
        this.f54236a = i7;
        this.d = cls;
        this.f54238c = i10;
        this.f54237b = i11;
    }

    @Override
    public final Object b(View view) {
        switch (this.f54229e) {
            case 0:
                return Boolean.valueOf(d0.c(view));
            case 1:
                return d0.a(view);
            default:
                return Boolean.valueOf(d0.b(view));
        }
    }

    @Override
    public final void c(View view, Object obj) {
        switch (this.f54229e) {
            case 0:
                d0.f(view, ((Boolean) obj).booleanValue());
                return;
            case 1:
                d0.e(view, (CharSequence) obj);
                return;
            default:
                d0.d(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    @Override
    public final boolean e(Object obj, Object obj2) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f54229e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                boolean z13 = false;
                if (bool != null && bool.booleanValue()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (bool2 != null && bool2.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z9 == z10) {
                    z13 = true;
                }
                return !z13;
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                boolean z14 = false;
                if (bool3 != null && bool3.booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (bool4 != null && bool4.booleanValue()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11 == z12) {
                    z14 = true;
                }
                return !z14;
        }
    }
}
