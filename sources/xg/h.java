package xg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;
public final class h extends FrameLayout {
    public final b6 f51843a;
    public long f51844b;

    public h(Context context, u6 u6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        float f11;
        float f12;
        b6 b6Var = new b6(context);
        b6Var.setTextSize(16);
        f7.Y(b6Var, y6.f23465j5, u6Var);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        b6Var.setGravity(i10);
        addView(b6Var);
        b6 b6Var2 = new b6(context);
        this.f51843a = b6Var2;
        b6Var2.setTextSize(16);
        f7.Y(b6Var2, y6.L6, u6Var);
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        b6Var2.setGravity(i11);
        addView(b6Var2);
        b6Var.l(LocaleController.formatString("BoostingDateAndTime", R.string.BoostingDateAndTime, new Object[0]), false);
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
        b6Var.setLayoutParams(kb1.h(-1, -2.0f, i13, f7, 0.0f, f10, 0.0f));
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
        b6Var2.setLayoutParams(kb1.h(-1, -2.0f, i14, f11, 0.0f, f12, 0.0f));
        f7.i(y6.f23428h5, this, u6Var);
    }

    public long getSelectedTime() {
        return this.f51844b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setDate(long j10) {
        this.f51844b = j10;
        Date date = new Date(j10);
        this.f51843a.l(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterDayMonth().format(date), LocaleController.getInstance().getFormatterDay().format(date)), false);
    }
}
