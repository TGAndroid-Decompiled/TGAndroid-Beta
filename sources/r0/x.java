package r0;

import android.text.TextUtils;
import android.view.View;
public final class x extends p1.c {
    public final int f46957e;

    public x(int i9, Class cls, int i10, int i11, int i12) {
        this.f46957e = i12;
        this.f45335a = i9;
        this.d = cls;
        this.f45337c = i10;
        this.f45336b = i11;
    }

    @Override
    public final Object b(View view) {
        switch (this.f46957e) {
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
        switch (this.f46957e) {
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
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        switch (this.f46957e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                boolean z14 = false;
                if (bool != null && bool.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (bool2 != null && bool2.booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    z14 = true;
                }
                return !z14;
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                boolean z15 = false;
                if (bool3 != null && bool3.booleanValue()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (bool4 != null && bool4.booleanValue()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 == z13) {
                    z15 = true;
                }
                return !z15;
        }
    }
}
