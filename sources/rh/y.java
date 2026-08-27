package rh;

import android.content.Context;
import android.widget.FrameLayout;
import h7.z6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public abstract class y extends FrameLayout implements d4 {

    public a f47594a;

    public final j4.x0 f47595b;

    public int f47596c;
    public int d;

    public int f47597e;

    public int f47598f;
    public int h;

    public y(Context context) {
        super(context);
        j4.x0 x0Var = new j4.x0();
        x0Var.f12710a = Long.MIN_VALUE;
        x0Var.f12711b = -1;
        this.f47595b = x0Var;
    }

    public final void c(a aVar) {
        this.f47595b.a(aVar, new lh.p(this, 20));
    }

    public int e() {
        return 0;
    }

    public void f(int i10) {
        int iDp;
        int iD = z6.d(this.f47594a);
        int iDp2 = 0;
        int iE = (i10 > 0 || iD > 0) ? e() : 0;
        a aVar = this.f47594a;
        if (aVar == null || !aVar.f47038n) {
            iDp = this.f47597e;
        } else {
            int i11 = aVar.f47036l;
            iDp = i11 <= 0 ? 0 : AndroidUtilities.dp(i0.a.e(i11, 1, 16, 10));
        }
        a aVar2 = this.f47594a;
        if (aVar2 == null || !aVar2.f47039o) {
            iDp2 = this.h;
        } else {
            int i12 = aVar2.f47037m;
            if (i12 > 0) {
                iDp2 = AndroidUtilities.dp(i0.a.e(i12, 1, 16, 10));
            }
        }
        int i13 = i10 + iE;
        int i14 = iD + iE;
        int i15 = this.d;
        int i16 = this.f47598f;
        if (LocaleController.isRTL) {
            setPadding(i15 + i14, iDp, i16 + i13, iDp2);
        } else {
            setPadding(i15 + i13, iDp, i16 + i14, iDp2);
        }
    }

    public final void g(int i10, int i11, int i12, int i13) {
        this.d = i10;
        this.f47597e = i11;
        this.f47598f = i12;
        this.h = i13;
        int i14 = this.f47596c;
        if (LocaleController.isRTL) {
            setPadding(i10, i11, i12 + i14, i13);
        } else {
            setPadding(i10 + i14, i11, i12, i13);
        }
    }
}
