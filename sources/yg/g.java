package yg;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.d5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import w7.a6;
public final class g extends FrameLayout {
    public static final int e = 0;
    public final f f47000a;
    public boolean f47001b;
    public boolean f47002c;
    public Utilities.Callback d;

    public g(Activity activity, f6 f6Var) {
        super(activity);
        int w02;
        int w03;
        f fVar = new f(this, activity);
        this.f47000a = fVar;
        fVar.setHapticFeedbackEnabled(true);
        fVar.setImageResource(R.drawable.smiles_tab_clear);
        int i10 = j6.Re;
        if (f6Var != null) {
            w02 = f6Var.F0(i10);
        } else {
            w02 = j6.w0(null, i10, false);
        }
        fVar.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        fVar.setScaleType(ImageView.ScaleType.CENTER);
        fVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        fVar.setFocusable(true);
        fVar.setOnClickListener(new d5(27));
        addView(fVar, a6.e(36, 36, 17));
        int w04 = j6.w0(null, j6.f18017i6, false);
        int dp = AndroidUtilities.dp(36.0f);
        int i11 = j6.f17928d6;
        if (f6Var != null) {
            w03 = f6Var.F0(i11);
        } else {
            w03 = j6.w0(null, i11, false);
        }
        fVar.setBackground(j6.h0(dp, w03, w04));
        fVar.setOutlineProvider(new xf.i0(18));
        fVar.setElevation(AndroidUtilities.dp(1.0f));
        fVar.setClipToOutline(true);
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
