package vh;

import android.content.Context;
import android.widget.FrameLayout;
import k7.i8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import ph.z8;
public abstract class z extends FrameLayout implements g4 {
    public a f46414a;
    public final o4.h0 f46415b;
    public int f46416c;
    public int d;
    public int e;
    public int f46417f;
    public int h;

    public z(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f16329a = Long.MIN_VALUE;
        obj.f16330b = -1;
        this.f46415b = obj;
    }

    public final void c(a aVar) {
        this.f46415b.a(aVar, new z8(this, 11));
    }

    public int d() {
        return 0;
    }

    public void f(int i10) {
        int d;
        int i11;
        int d10 = i8.d(this.f46414a);
        int i12 = 0;
        if (i10 <= 0 && d10 <= 0) {
            d = 0;
        } else {
            d = d();
        }
        a aVar = this.f46414a;
        if (aVar != null && aVar.f45862n) {
            int i13 = aVar.f45860l;
            if (i13 <= 0) {
                i11 = 0;
            } else {
                i11 = AndroidUtilities.dp(e2.c.e(i13, 1, 16, 10));
            }
        } else {
            i11 = this.e;
        }
        a aVar2 = this.f46414a;
        if (aVar2 != null && aVar2.f45863o) {
            int i14 = aVar2.f45861m;
            if (i14 > 0) {
                i12 = AndroidUtilities.dp(e2.c.e(i14, 1, 16, 10));
            }
        } else {
            i12 = this.h;
        }
        int i15 = i10 + d;
        int i16 = d10 + d;
        int i17 = this.d;
        int i18 = this.f46417f;
        if (LocaleController.isRTL) {
            setPadding(i17 + i16, i11, i18 + i15, i12);
        } else {
            setPadding(i17 + i15, i11, i18 + i16, i12);
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.d = i10;
        this.e = i11;
        this.f46417f = i12;
        this.h = i13;
        int i14 = this.f46416c;
        if (LocaleController.isRTL) {
            setPadding(i10, i11, i12 + i14, i13);
        } else {
            setPadding(i10 + i14, i11, i12, i13);
        }
    }
}
