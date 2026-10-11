package zg;

import ai.e2;
import ai.j6;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import w7.x5;
public final class f extends FrameLayout {
    public static final int f54639e = 0;
    public final e f54640a;
    public boolean f54641b;
    public boolean f54642c;
    public Utilities.Callback d;

    public f(Activity activity, d6 d6Var) {
        super(activity);
        int x02;
        int x03;
        e eVar = new e(this, activity);
        this.f54640a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(R.drawable.smiles_tab_clear);
        int i10 = h6.Re;
        if (d6Var != null) {
            x02 = d6Var.x0(i10);
        } else {
            x02 = h6.x0(null, i10, false);
        }
        eVar.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new e2(28));
        addView(eVar, x5.e(36, 36, 17));
        int x04 = h6.x0(null, h6.f20913i6, false);
        int dp = AndroidUtilities.dp(36.0f);
        int i11 = h6.f20822d6;
        if (d6Var != null) {
            x03 = d6Var.x0(i11);
        } else {
            x03 = h6.x0(null, i11, false);
        }
        eVar.setBackground(h6.i0(dp, x03, x04));
        eVar.setOutlineProvider(new j6(18));
        eVar.setElevation(AndroidUtilities.dp(1.0f));
        eVar.setClipToOutline(true);
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
    }

    public void setOnBackspace(Utilities.Callback<Boolean> callback) {
        this.d = callback;
    }
}
