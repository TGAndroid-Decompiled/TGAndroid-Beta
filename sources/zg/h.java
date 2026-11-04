package zg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import java.util.Date;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public final class h extends FrameLayout {
    public final k5 f60498a;
    public long f60499b;

    public h(Context context, e6 e6Var) {
        super(context);
        int i3;
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        k5 k5Var = new k5(context);
        k5Var.setTextSize(16);
        r6.Y(k5Var, k6.f27988j5, e6Var);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        k5Var.setGravity(i3);
        addView(k5Var);
        k5 k5Var2 = new k5(context);
        this.f60498a = k5Var2;
        k5Var2.setTextSize(16);
        r6.Y(k5Var2, k6.L6, e6Var);
        if (bd.f21784a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        k5Var2.setGravity(i10);
        addView(k5Var2);
        k5Var.l(bd.a0("BoostingDateAndTime", null, 2131753539, new Object[0]), false);
        boolean z10 = bd.f21784a0;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i12 = i11 | 16;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 21.0f;
        }
        if (z10) {
            f11 = 21.0f;
        } else {
            f11 = 0.0f;
        }
        k5Var.setLayoutParams(mf.d(-1, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        boolean z11 = bd.f21784a0;
        int i13 = (z11 ? 3 : 5) | 16;
        if (z11) {
            f12 = 21.0f;
        } else {
            f12 = 0.0f;
        }
        if (z11) {
            f13 = 0.0f;
        } else {
            f13 = 21.0f;
        }
        k5Var2.setLayoutParams(mf.d(-1, -2.0f, i13, f12, 0.0f, f13, 0.0f));
        r6.i(k6.f27954h5, this, e6Var);
    }

    public long getSelectedTime() {
        return this.f60499b;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), 1073741824));
    }

    public void setDate(long j10) {
        this.f60499b = j10;
        Date date = new Date(j10);
        this.f60498a.l(bd.a0("formatDateAtTime", null, 2131742793, bd.E0().q0().format(date), bd.E0().p0().format(date)), false);
    }
}
