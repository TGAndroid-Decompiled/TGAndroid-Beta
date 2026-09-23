package zg;

import ai.e2;
import ai.i6;
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
    public static final int e = 0;
    public final e f48963a;
    public boolean f48964b;
    public boolean f48965c;
    public Utilities.Callback d;

    public f(Activity activity, d6 d6Var) {
        super(activity);
        int w02;
        int w03;
        e eVar = new e(this, activity);
        this.f48963a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(R.drawable.smiles_tab_clear);
        int i10 = h6.Re;
        if (d6Var != null) {
            w02 = d6Var.G0(i10);
        } else {
            w02 = h6.w0(null, i10, false);
        }
        eVar.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new e2(28));
        addView(eVar, x5.e(36, 36, 17));
        int w04 = h6.w0(null, h6.f18878i6, false);
        int dp = AndroidUtilities.dp(36.0f);
        int i11 = h6.f18789d6;
        if (d6Var != null) {
            w03 = d6Var.G0(i11);
        } else {
            w03 = h6.w0(null, i11, false);
        }
        eVar.setBackground(h6.h0(dp, w03, w04));
        eVar.setOutlineProvider(new i6(18));
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
