package qh;

import android.content.Context;
import android.widget.FrameLayout;
import g7.v6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public abstract class y extends FrameLayout implements c4 {
    public a f46834a;
    public final j4.x0 f46835b;
    public int f46836c;
    public int d;
    public int f46837e;
    public int f46838f;
    public int h;

    public y(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f13606a = Long.MIN_VALUE;
        obj.f13607b = -1;
        this.f46835b = obj;
    }

    public final void c(a aVar) {
        this.f46835b.a(aVar, new kh.p(this, 20));
    }

    public int e() {
        return 0;
    }

    public void f(int i9) {
        int e10;
        int i10;
        int d = v6.d(this.f46834a);
        int i11 = 0;
        if (i9 <= 0 && d <= 0) {
            e10 = 0;
        } else {
            e10 = e();
        }
        a aVar = this.f46834a;
        if (aVar != null && aVar.f46279n) {
            int i12 = aVar.f46277l;
            if (i12 <= 0) {
                i10 = 0;
            } else {
                i10 = AndroidUtilities.dp(e2.c.e(i12, 1, 16, 10));
            }
        } else {
            i10 = this.f46837e;
        }
        a aVar2 = this.f46834a;
        if (aVar2 != null && aVar2.f46280o) {
            int i13 = aVar2.f46278m;
            if (i13 > 0) {
                i11 = AndroidUtilities.dp(e2.c.e(i13, 1, 16, 10));
            }
        } else {
            i11 = this.h;
        }
        int i14 = i9 + e10;
        int i15 = d + e10;
        int i16 = this.d;
        int i17 = this.f46838f;
        if (LocaleController.isRTL) {
            setPadding(i16 + i15, i10, i17 + i14, i11);
        } else {
            setPadding(i16 + i14, i10, i17 + i15, i11);
        }
    }

    public final void g(int i9, int i10, int i11, int i12) {
        this.d = i9;
        this.f46837e = i10;
        this.f46838f = i11;
        this.h = i12;
        int i13 = this.f46836c;
        if (LocaleController.isRTL) {
            setPadding(i9, i10, i11 + i13, i12);
        } else {
            setPadding(i9 + i13, i10, i11, i12);
        }
    }
}
