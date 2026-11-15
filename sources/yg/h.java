package yg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import java.util.Date;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
public final class h extends FrameLayout {
    public final j5 f60669a;
    public long f60670b;

    public h(Context context, e6 e6Var) {
        super(context);
        int i7;
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        j5 j5Var = new j5(context);
        j5Var.setTextSize(16);
        q6.X(j5Var, j6.f28957j5, e6Var);
        if (hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        j5Var.setGravity(i7);
        addView(j5Var);
        j5 j5Var2 = new j5(context);
        this.f60669a = j5Var2;
        j5Var2.setTextSize(16);
        q6.X(j5Var2, j6.L6, e6Var);
        if (hd.f24104a0) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        j5Var2.setGravity(i10);
        addView(j5Var2);
        j5Var.l(hd.a0("BoostingDateAndTime", null, 2131753539, new Object[0]), false);
        boolean z10 = hd.f24104a0;
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
        j5Var.setLayoutParams(ja.d(-1, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        boolean z11 = hd.f24104a0;
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
        j5Var2.setLayoutParams(ja.d(-1, -2.0f, i13, f12, 0.0f, f13, 0.0f));
        q6.h(j6.f28922h5, this, e6Var);
    }

    public long getSelectedTime() {
        return this.f60670b;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(g0.L(50.0f), 1073741824));
    }

    public void setDate(long j3) {
        this.f60670b = j3;
        Date date = new Date(j3);
        this.f60669a.l(hd.a0("formatDateAtTime", null, 2131742783, hd.E0().q0().format(date), hd.E0().p0().format(date)), false);
    }
}
