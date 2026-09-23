package vg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i5;
import w7.x5;
public final class h extends FrameLayout {
    public final i5 f44277a;
    public long f44278b;

    public h(Context context, d6 d6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        float f11;
        float f12;
        i5 i5Var = new i5(context);
        i5Var.setTextSize(16);
        i5Var.setTextColor(h6.v0(h6.f18895j5, d6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        i5Var.setGravity(i10);
        addView(i5Var);
        i5 i5Var2 = new i5(context);
        this.f44277a = i5Var2;
        i5Var2.setTextSize(16);
        i5Var2.setTextColor(h6.v0(h6.L6, d6Var));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        i5Var2.setGravity(i11);
        addView(i5Var2);
        i5Var.l(LocaleController.formatString("BoostingDateAndTime", R.string.BoostingDateAndTime, new Object[0]), false);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i13 = i12 | 16;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 21.0f;
        }
        if (z10) {
            f10 = 21.0f;
        } else {
            f10 = 0.0f;
        }
        i5Var.setLayoutParams(x5.d(-1, -2.0f, i13, f7, 0.0f, f10, 0.0f));
        boolean z11 = LocaleController.isRTL;
        int i14 = (z11 ? 3 : 5) | 16;
        if (z11) {
            f11 = 21.0f;
        } else {
            f11 = 0.0f;
        }
        if (z11) {
            f12 = 0.0f;
        } else {
            f12 = 21.0f;
        }
        i5Var2.setLayoutParams(x5.d(-1, -2.0f, i14, f11, 0.0f, f12, 0.0f));
        setBackgroundColor(h6.v0(h6.f18859h5, d6Var));
    }

    public long getSelectedTime() {
        return this.f44278b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setDate(long j3) {
        this.f44278b = j3;
        Date date = new Date(j3);
        this.f44277a.l(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterDayMonth().format(date), LocaleController.getInstance().getFormatterDay().format(date)), false);
    }
}
