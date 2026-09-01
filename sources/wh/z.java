package wh;

import android.content.Context;
import android.widget.FrameLayout;
import k7.l8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public abstract class z extends FrameLayout implements f4 {
    public a f50175a;
    public final o4.h0 f50176b;
    public int f50177c;
    public int d;
    public int f50178e;
    public int f50179f;
    public int h;

    public z(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f16494b = Long.MIN_VALUE;
        obj.f16493a = -1;
        this.f50176b = obj;
    }

    public final void c(a aVar) {
        this.f50176b.a(aVar, new sf.g(this, 12));
    }

    public int d() {
        return 0;
    }

    public void f(int i10) {
        int d;
        int i11;
        int d10 = l8.d(this.f50175a);
        int i12 = 0;
        if (i10 <= 0 && d10 <= 0) {
            d = 0;
        } else {
            d = d();
        }
        a aVar = this.f50175a;
        if (aVar != null && aVar.f49627n) {
            int i13 = aVar.f49625l;
            if (i13 <= 0) {
                i11 = 0;
            } else {
                i11 = AndroidUtilities.dp(e2.c.e(i13, 1, 16, 10));
            }
        } else {
            i11 = this.f50178e;
        }
        a aVar2 = this.f50175a;
        if (aVar2 != null && aVar2.f49628o) {
            int i14 = aVar2.f49626m;
            if (i14 > 0) {
                i12 = AndroidUtilities.dp(e2.c.e(i14, 1, 16, 10));
            }
        } else {
            i12 = this.h;
        }
        int i15 = i10 + d;
        int i16 = d10 + d;
        int i17 = this.d;
        int i18 = this.f50179f;
        if (LocaleController.isRTL) {
            setPadding(i17 + i16, i11, i18 + i15, i12);
        } else {
            setPadding(i17 + i15, i11, i18 + i16, i12);
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.d = i10;
        this.f50178e = i11;
        this.f50179f = i12;
        this.h = i13;
        int i14 = this.f50177c;
        if (LocaleController.isRTL) {
            setPadding(i10, i11, i12 + i14, i13);
        } else {
            setPadding(i10 + i14, i11, i12, i13);
        }
    }
}
