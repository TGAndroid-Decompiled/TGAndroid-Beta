package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import java.util.Date;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
public final class h extends FrameLayout {
    public final m5 f61278a;
    public long f61279b;

    public h(Context context, h6 h6Var) {
        super(context);
        int i7;
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        m5 m5Var = new m5(context);
        m5Var.setTextSize(16);
        t6.X(m5Var, m6.f29486j5, h6Var);
        if (gd.f24241a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        m5Var.setGravity(i7);
        addView(m5Var);
        m5 m5Var2 = new m5(context);
        this.f61278a = m5Var2;
        m5Var2.setTextSize(16);
        t6.X(m5Var2, m6.L6, h6Var);
        if (gd.f24241a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        m5Var2.setGravity(i10);
        addView(m5Var2);
        m5Var.l(gd.a0("BoostingDateAndTime", null, 2131753536, new Object[0]), false);
        boolean z10 = gd.f24241a0;
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
        m5Var.setLayoutParams(ma.d(-1, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        boolean z11 = gd.f24241a0;
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
        m5Var2.setLayoutParams(ma.d(-1, -2.0f, i13, f12, 0.0f, f13, 0.0f));
        t6.h(m6.f29451h5, this, h6Var);
    }

    public long getSelectedTime() {
        return this.f61279b;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), 1073741824));
    }

    public void setDate(long j3) {
        this.f61279b = j3;
        Date date = new Date(j3);
        this.f61278a.l(gd.a0("formatDateAtTime", null, 2131742519, gd.E0().q0().format(date), gd.E0().p0().format(date)), false);
    }
}
