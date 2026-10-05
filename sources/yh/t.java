package yh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
public final class t extends cb {
    public q X;
    public final LinearLayout Y;

    public t(Context context) {
        super(context, null, false, false, null);
        this.v = 0.1f;
        fixNavigationBar();
        zl0 zl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i10, 0, i10, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        c7 c7Var = new c7(context, 70, 0);
        frameLayout.addView(c7Var, w7.z5.c(-1.0f, -1));
        sg.e eVar = new sg.e(context, 1, 2);
        sg.a aVar = eVar.f46827b;
        aVar.f46815w = org.telegram.ui.ActionBar.i6.fk;
        aVar.f46816x = org.telegram.ui.ActionBar.i6.gk;
        aVar.b();
        eVar.setStarParticlesView(c7Var);
        frameLayout.addView(eVar, w7.z5.d(170, 170.0f, 17, 0.0f, 32.0f, 0.0f, 24.0f));
        eVar.setPaused(false);
        linearLayout.addView(frameLayout, w7.z5.c(150.0f, -1));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.i6.f20935j5;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, this.resourcesProvider));
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.ExplainStarsTitle));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.z5.t(-2, -2, 1, 0, 2, 0, 0), context);
        h.setTextSize(1, 14.0f);
        h.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, this.resourcesProvider));
        h.setGravity(17);
        h.setText(LocaleController.getString(R.string.ExplainStarsTitle2));
        linearLayout.addView(h, w7.z5.t(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ci.d dVar = new ci.d(context, this.resourcesProvider, true);
        dVar.g(LocaleController.getString(R.string.ExplainStarsButton), false, true);
        dVar.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 18));
        frameLayout2.addView(dVar, w7.z5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        int i12 = this.backgroundPaddingLeft;
        frameLayout2.setPadding(i12, 0, i12, 0);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20899h5, false));
        this.containerView.addView(frameLayout2, w7.z5.e(-1, -2, 87));
        this.X.N(false);
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        ?? w61Var = new w61(zl0Var, getContext(), this.currentAccount, 0, true, new hi.a(this, 23), this.resourcesProvider);
        this.X = w61Var;
        return w61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.ExplainStarsTitle);
    }
}
