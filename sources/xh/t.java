package xh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
public final class t extends ab {
    public q X;
    public final LinearLayout Y;

    public t(Context context) {
        super(context, null, false, false, null);
        this.v = 0.1f;
        fixNavigationBar();
        vl0 vl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i10, 0, i10, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        b7 b7Var = new b7(context, 70, 0);
        frameLayout.addView(b7Var, w7.a6.c(-1.0f, -1));
        rg.f fVar = new rg.f(context, 1, 2);
        rg.a aVar = fVar.f41485b;
        aVar.f41471w = org.telegram.ui.ActionBar.j6.fk;
        aVar.f41472x = org.telegram.ui.ActionBar.j6.gk;
        aVar.b();
        fVar.setStarParticlesView(b7Var);
        frameLayout.addView(fVar, w7.a6.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        fVar.setPaused(false);
        linearLayout.addView(frameLayout, w7.a6.c(150.0f, -1));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.vision.e2.k(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.j6.f18034j5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, this.resourcesProvider));
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.ExplainStarsTitle));
        TextView g10 = com.google.android.gms.internal.vision.e2.g(linearLayout, textView, w7.a6.t(-2, -2, 1, 0, 2, 0, 0), context);
        g10.setTextSize(1, 14.0f);
        g10.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, this.resourcesProvider));
        g10.setGravity(17);
        g10.setText(LocaleController.getString(R.string.ExplainStarsTitle2));
        linearLayout.addView(g10, w7.a6.t(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        bi.d dVar = new bi.d(context, this.resourcesProvider, true);
        dVar.g(LocaleController.getString(R.string.ExplainStarsButton), false, true);
        dVar.setOnClickListener(new org.telegram.ui.web.c(this, 13));
        frameLayout2.addView(dVar, w7.a6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        int i12 = this.backgroundPaddingLeft;
        frameLayout2.setPadding(i12, 0, i12, 0);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false));
        this.containerView.addView(frameLayout2, w7.a6.e(-1, -2, 87));
        this.X.N(false);
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        ?? j61Var = new j61(vl0Var, getContext(), this.currentAccount, 0, true, new gi.a(this, 22), this.resourcesProvider);
        this.X = j61Var;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.ExplainStarsTitle);
    }
}
