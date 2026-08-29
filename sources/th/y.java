package th;

import android.content.Context;
import android.widget.FrameLayout;
import i7.x7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public abstract class y extends FrameLayout implements d4 {
    public a f48892a;
    public final l4.y0 f48893b;
    public int f48894c;
    public int d;
    public int f48895e;
    public int f48896f;
    public int h;

    public y(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f14471a = Long.MIN_VALUE;
        obj.f14472b = -1;
        this.f48893b = obj;
    }

    public final void c(a aVar) {
        this.f48893b.a(aVar, new sf.f1(this, 3));
    }

    public int d() {
        return 0;
    }

    public void f(int i10) {
        int d;
        int i11;
        int d10 = x7.d(this.f48892a);
        int i12 = 0;
        if (i10 <= 0 && d10 <= 0) {
            d = 0;
        } else {
            d = d();
        }
        a aVar = this.f48892a;
        if (aVar != null && aVar.f48338n) {
            int i13 = aVar.f48336l;
            if (i13 <= 0) {
                i11 = 0;
            } else {
                i11 = AndroidUtilities.dp(com.google.android.recaptcha.internal.a.f(i13, 1, 16, 10));
            }
        } else {
            i11 = this.f48895e;
        }
        a aVar2 = this.f48892a;
        if (aVar2 != null && aVar2.f48339o) {
            int i14 = aVar2.f48337m;
            if (i14 > 0) {
                i12 = AndroidUtilities.dp(com.google.android.recaptcha.internal.a.f(i14, 1, 16, 10));
            }
        } else {
            i12 = this.h;
        }
        int i15 = i10 + d;
        int i16 = d10 + d;
        int i17 = this.d;
        int i18 = this.f48896f;
        if (LocaleController.isRTL) {
            setPadding(i17 + i16, i11, i18 + i15, i12);
        } else {
            setPadding(i17 + i15, i11, i18 + i16, i12);
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.d = i10;
        this.f48895e = i11;
        this.f48896f = i12;
        this.h = i13;
        int i14 = this.f48894c;
        if (LocaleController.isRTL) {
            setPadding(i10, i11, i12 + i14, i13);
        } else {
            setPadding(i10 + i14, i11, i12, i13);
        }
    }
}
