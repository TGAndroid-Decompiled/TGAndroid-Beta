package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import java.util.Date;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public final class h extends FrameLayout {
    public final k5 f59365a;
    public long f59366b;

    public h(Context context, f6 f6Var) {
        super(context);
        int i7;
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        k5 k5Var = new k5(context);
        k5Var.setTextSize(16);
        r6.Y(k5Var, k6.f27957j5, f6Var);
        if (hd.f22878a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        k5Var.setGravity(i7);
        addView(k5Var);
        k5 k5Var2 = new k5(context);
        this.f59365a = k5Var2;
        k5Var2.setTextSize(16);
        r6.Y(k5Var2, k6.L6, f6Var);
        if (hd.f22878a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        k5Var2.setGravity(i10);
        addView(k5Var2);
        k5Var.l(hd.a0("BoostingDateAndTime", null, 2131753539, new Object[0]), false);
        boolean z9 = hd.f22878a0;
        if (z9) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i12 = i11 | 16;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 21.0f;
        }
        if (z9) {
            f11 = 21.0f;
        } else {
            f11 = 0.0f;
        }
        k5Var.setLayoutParams(ha.d(-1, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        boolean z10 = hd.f22878a0;
        int i13 = (z10 ? 3 : 5) | 16;
        if (z10) {
            f12 = 21.0f;
        } else {
            f12 = 0.0f;
        }
        if (z10) {
            f13 = 0.0f;
        } else {
            f13 = 21.0f;
        }
        k5Var2.setLayoutParams(ha.d(-1, -2.0f, i13, f12, 0.0f, f13, 0.0f));
        r6.i(k6.f27922h5, this, f6Var);
    }

    public long getSelectedTime() {
        return this.f59366b;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), 1073741824));
    }

    public void setDate(long j3) {
        this.f59366b = j3;
        Date date = new Date(j3);
        this.f59365a.l(hd.a0("formatDateAtTime", null, 2131742784, hd.E0().q0().format(date), hd.E0().p0().format(date)), false);
    }
}
