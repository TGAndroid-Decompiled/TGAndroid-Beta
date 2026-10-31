package sg;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import w7.b6;
public final class f extends FrameLayout {
    public static final int e = 0;
    public final e f48324a;
    public boolean f48325b;
    public boolean f48326c;
    public q20 d;

    public f(Activity activity, p6 p6Var) {
        super(activity);
        int x02;
        e eVar = new e(this, activity);
        this.f48324a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(2131232736);
        a7.t(eVar, t6.Gf, p6Var, PorterDuff.Mode.MULTIPLY);
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(cd.L0(2131754920, null));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new bh.c(24));
        addView(eVar, b6.e(36, 36, 17));
        int x03 = t6.x0(null, t6.f21020i6, false);
        int L = org.telegram.messenger.i0.L(36.0f);
        int i10 = t6.f20929d6;
        if (p6Var != null) {
            x02 = p6Var.h(i10);
        } else {
            x02 = t6.x0(null, i10, false);
        }
        org.telegram.ui.Cells.y j02 = t6.j0(L, x02, x03);
        w6 N = a7.N(i10);
        eVar.setBackground(j02);
        a7.k(eVar, j02, N, null, p6Var);
        eVar.setOutlineProvider(new rf.b0(18));
        eVar.setElevation(org.telegram.messenger.i0.L(1.0f));
        eVar.setClipToOutline(true);
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(42.0f), 1073741824));
    }

    public void setOnBackspace(q20 q20Var) {
        this.d = q20Var;
    }
}
