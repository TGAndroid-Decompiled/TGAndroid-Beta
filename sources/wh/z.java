package wh;

import android.content.Context;
import android.widget.FrameLayout;
import k7.l8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public abstract class z extends FrameLayout implements f4 {
    public a f50211a;
    public final o4.h0 f50212b;
    public int f50213c;
    public int d;
    public int f50214e;
    public int f50215f;
    public int h;

    public z(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f16496b = Long.MIN_VALUE;
        obj.f16495a = -1;
        this.f50212b = obj;
    }

    public final void c(a aVar) {
        this.f50212b.a(aVar, new sf.h(this, 12));
    }

    public int d() {
        return 0;
    }

    public void f(int i10) {
        int d;
        int i11;
        int d10 = l8.d(this.f50211a);
        int i12 = 0;
        if (i10 <= 0 && d10 <= 0) {
            d = 0;
        } else {
            d = d();
        }
        a aVar = this.f50211a;
        if (aVar != null && aVar.f49663n) {
            int i13 = aVar.f49661l;
            if (i13 <= 0) {
                i11 = 0;
            } else {
                i11 = AndroidUtilities.dp(e2.c.e(i13, 1, 16, 10));
            }
        } else {
            i11 = this.f50214e;
        }
        a aVar2 = this.f50211a;
        if (aVar2 != null && aVar2.f49664o) {
            int i14 = aVar2.f49662m;
            if (i14 > 0) {
                i12 = AndroidUtilities.dp(e2.c.e(i14, 1, 16, 10));
            }
        } else {
            i12 = this.h;
        }
        int i15 = i10 + d;
        int i16 = d10 + d;
        int i17 = this.d;
        int i18 = this.f50215f;
        if (LocaleController.isRTL) {
            setPadding(i17 + i16, i11, i18 + i15, i12);
        } else {
            setPadding(i17 + i15, i11, i18 + i16, i12);
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.d = i10;
        this.f50214e = i11;
        this.f50215f = i12;
        this.h = i13;
        int i14 = this.f50213c;
        if (LocaleController.isRTL) {
            setPadding(i10, i11, i12 + i14, i13);
        } else {
            setPadding(i10 + i14, i11, i12, i13);
        }
    }
}
