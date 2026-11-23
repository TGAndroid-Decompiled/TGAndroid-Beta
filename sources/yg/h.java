package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import java.util.Date;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
public final class h extends FrameLayout {
    public final n5 f61366a;
    public long f61367b;

    public h(Context context, i6 i6Var) {
        super(context);
        int i7;
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        n5 n5Var = new n5(context);
        n5Var.setTextSize(16);
        u6.X(n5Var, n6.f29559j5, i6Var);
        if (gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        n5Var.setGravity(i7);
        addView(n5Var);
        n5 n5Var2 = new n5(context);
        this.f61366a = n5Var2;
        n5Var2.setTextSize(16);
        u6.X(n5Var2, n6.L6, i6Var);
        if (gd.f24314a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        n5Var2.setGravity(i10);
        addView(n5Var2);
        n5Var.l(gd.a0("BoostingDateAndTime", null, 2131753536, new Object[0]), false);
        boolean z10 = gd.f24314a0;
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
        n5Var.setLayoutParams(na.d(-1, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        boolean z11 = gd.f24314a0;
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
        n5Var2.setLayoutParams(na.d(-1, -2.0f, i13, f12, 0.0f, f13, 0.0f));
        u6.h(n6.f29524h5, this, i6Var);
    }

    public long getSelectedTime() {
        return this.f61367b;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), 1073741824));
    }

    public void setDate(long j3) {
        this.f61367b = j3;
        Date date = new Date(j3);
        this.f61366a.l(gd.a0("formatDateAtTime", null, 2131742512, gd.E0().q0().format(date), gd.E0().p0().format(date)), false);
    }
}
