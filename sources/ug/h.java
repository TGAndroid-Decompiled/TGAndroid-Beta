package ug;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l5;
import w7.a6;
public final class h extends FrameLayout {
    public final l5 f42695a;
    public long f42696b;

    public h(Context context, f6 f6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        float f11;
        float f12;
        l5 l5Var = new l5(context);
        l5Var.setTextSize(16);
        l5Var.setTextColor(j6.v0(j6.f18034j5, f6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        l5Var.setGravity(i10);
        addView(l5Var);
        l5 l5Var2 = new l5(context);
        this.f42695a = l5Var2;
        l5Var2.setTextSize(16);
        l5Var2.setTextColor(j6.v0(j6.L6, f6Var));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        l5Var2.setGravity(i11);
        addView(l5Var2);
        l5Var.l(LocaleController.formatString("BoostingDateAndTime", R.string.BoostingDateAndTime, new Object[0]), false);
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
        l5Var.setLayoutParams(a6.d(-1, -2.0f, i13, f7, 0.0f, f10, 0.0f));
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
        l5Var2.setLayoutParams(a6.d(-1, -2.0f, i14, f11, 0.0f, f12, 0.0f));
        setBackgroundColor(j6.v0(j6.f17998h5, f6Var));
    }

    public long getSelectedTime() {
        return this.f42696b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setDate(long j3) {
        this.f42696b = j3;
        Date date = new Date(j3);
        this.f42695a.l(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterDayMonth().format(date), LocaleController.getInstance().getFormatterDay().format(date)), false);
    }
}
