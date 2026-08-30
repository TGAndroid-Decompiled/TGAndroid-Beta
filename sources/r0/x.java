package r0;

import android.text.TextUtils;
import android.view.View;
public final class x extends p1.c {
    public final int e;

    public x(int i10, Class cls, int i11, int i12, int i13) {
        this.e = i13;
        this.f40937a = i10;
        this.d = cls;
        this.f40939c = i11;
        this.f40938b = i12;
    }

    @Override
    public final Object b(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(e0.c(view));
            case 1:
                return e0.a(view);
            default:
                return Boolean.valueOf(e0.b(view));
        }
    }

    @Override
    public final void c(View view, Object obj) {
        switch (this.e) {
            case 0:
                e0.f(view, ((Boolean) obj).booleanValue());
                return;
            case 1:
                e0.e(view, (CharSequence) obj);
                return;
            default:
                e0.d(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    @Override
    public final boolean e(Object obj, Object obj2) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                boolean z13 = false;
                if (bool != null && bool.booleanValue()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (bool2 != null && bool2.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z4 == z10) {
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
