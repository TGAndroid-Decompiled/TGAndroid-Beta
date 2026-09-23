package yh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
public final class s extends bb {
    public p X;
    public final LinearLayout Y;

    public s(Context context) {
        super(context, null, false, false, null);
        this.v = 0.1f;
        fixNavigationBar();
        ml0 ml0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ml0Var.setPadding(i10, 0, i10, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        y6 y6Var = new y6(context, 70, 0);
        frameLayout.addView(y6Var, w7.x5.c(-1.0f, -1));
        sg.e eVar = new sg.e(context, 1, 2);
        sg.a aVar = eVar.f42889b;
        aVar.f42877w = org.telegram.ui.ActionBar.h6.fk;
        aVar.f42878x = org.telegram.ui.ActionBar.h6.gk;
        aVar.b();
        eVar.setStarParticlesView(y6Var);
        frameLayout.addView(eVar, w7.x5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        eVar.setPaused(false);
        linearLayout.addView(frameLayout, w7.x5.c(150.0f, -1));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.h6.f18895j5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, this.resourcesProvider));
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.ExplainStarsTitle));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-2, -2, 1, 0, 2, 0, 0), context);
        h.setTextSize(1, 14.0f);
        h.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, this.resourcesProvider));
        h.setGravity(17);
        h.setText(LocaleController.getString(R.string.ExplainStarsTitle2));
        linearLayout.addView(h, w7.x5.t(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ci.d dVar = new ci.d(context, this.resourcesProvider, true);
        dVar.g(LocaleController.getString(R.string.ExplainStarsButton), false, true);
        dVar.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 18));
        frameLayout2.addView(dVar, w7.x5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        int i12 = this.backgroundPaddingLeft;
        frameLayout2.setPadding(i12, 0, i12, 0);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18859h5, false));
        this.containerView.addView(frameLayout2, w7.x5.e(-1, -2, 87));
        this.X.N(false);
    }

    @Override
    public final ll0 v(ml0 ml0Var) {
        ?? v51Var = new v51(ml0Var, getContext(), this.currentAccount, 0, true, new hi.a(this, 22), this.resourcesProvider);
        this.X = v51Var;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.ExplainStarsTitle);
    }
}
