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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import w7.x5;
public final class f extends FrameLayout {
    public static final int e = 0;
    public final e f49012a;
    public boolean f49013b;
    public boolean f49014c;
    public Utilities.Callback d;

    public f(Activity activity, e6 e6Var) {
        super(activity);
        int w02;
        int w03;
        e eVar = new e(this, activity);
        this.f49012a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(R.drawable.smiles_tab_clear);
        int i10 = i6.Re;
        if (e6Var != null) {
            w02 = e6Var.G0(i10);
        } else {
            w02 = i6.w0(null, i10, false);
        }
        eVar.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new e2(28));
        addView(eVar, x5.e(36, 36, 17));
        int w04 = i6.w0(null, i6.f18923i6, false);
        int dp = AndroidUtilities.dp(36.0f);
        int i11 = i6.f18834d6;
        if (e6Var != null) {
            w03 = e6Var.G0(i11);
        } else {
            w03 = i6.w0(null, i11, false);
        }
        eVar.setBackground(i6.h0(dp, w03, w04));
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
