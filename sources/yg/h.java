package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import java.util.Date;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
public final class h extends FrameLayout {
    public final l5 f59467a;
    public long f59468b;

    public h(Context context, g6 g6Var) {
        super(context);
        int i7;
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        l5 l5Var = new l5(context);
        l5Var.setTextSize(16);
        s6.X(l5Var, l6.f27973j5, g6Var);
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        l5Var.setGravity(i7);
        addView(l5Var);
        l5 l5Var2 = new l5(context);
        this.f59467a = l5Var2;
        l5Var2.setTextSize(16);
        s6.X(l5Var2, l6.L6, g6Var);
        if (id.f23157a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        l5Var2.setGravity(i10);
        addView(l5Var2);
        l5Var.l(id.a0("BoostingDateAndTime", null, 2131753539, new Object[0]), false);
        boolean z9 = id.f23157a0;
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
        l5Var.setLayoutParams(ha.d(-1, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        boolean z10 = id.f23157a0;
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
        l5Var2.setLayoutParams(ha.d(-1, -2.0f, i13, f12, 0.0f, f13, 0.0f));
        s6.h(l6.f27938h5, this, g6Var);
    }

    public long getSelectedTime() {
        return this.f59468b;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), 1073741824));
    }

    public void setDate(long j3) {
        this.f59468b = j3;
        Date date = new Date(j3);
        this.f59467a.l(id.a0("formatDateAtTime", null, 2131742783, id.E0().q0().format(date), id.E0().p0().format(date)), false);
    }
}
