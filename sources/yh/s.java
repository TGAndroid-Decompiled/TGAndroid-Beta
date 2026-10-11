package yh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sm0;
public final class s extends db {
    public p X;
    public final LinearLayout Y;

    public s(Context context) {
        super(context, null, false, false, null);
        this.v = 0.1f;
        fixNavigationBar();
        sm0 sm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        sm0Var.setPadding(i10, 0, i10, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        r6 r6Var = new r6(context, 70, 0);
        frameLayout.addView(r6Var, w7.x5.d(-1.0f, -1));
        sg.n nVar = new sg.n(context, 1, 2);
        sg.g gVar = nVar.f48168b;
        gVar.f48152z = org.telegram.ui.ActionBar.h6.fk;
        gVar.A = org.telegram.ui.ActionBar.h6.gk;
        gVar.b();
        nVar.setStarParticlesView(r6Var);
        frameLayout.addView(nVar, w7.x5.a(170.0f, 0.0f, 32.0f, 0.0f, 24.0f, 170, 17));
        nVar.setPaused(false);
        linearLayout.addView(frameLayout, w7.x5.d(150.0f, -1));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.vision.e2.l(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.h6.f20894j5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, this.resourcesProvider));
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.ExplainStarsTitle));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-2, -2, 1, 0, 2, 0, 0), context);
        h.setTextSize(1, 14.0f);
        h.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, this.resourcesProvider));
        h.setGravity(17);
        h.setText(LocaleController.getString(R.string.ExplainStarsTitle2));
        linearLayout.addView(h, w7.x5.t(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ci.d dVar = new ci.d(context, this.resourcesProvider, true);
        dVar.g(LocaleController.getString(R.string.ExplainStarsButton), false, true);
        dVar.setOnClickListener(new org.telegram.ui.Components.voip.p(this, 18));
        frameLayout2.addView(dVar, w7.x5.a(48.0f, 10.0f, 10.0f, 10.0f, 10.0f, -1, 119));
        int i12 = this.backgroundPaddingLeft;
        frameLayout2.setPadding(i12, 0, i12, 0);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20857h5, false));
        this.containerView.addView(frameLayout2, w7.x5.e(-1, -2, 87));
        this.X.N(false);
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.ExplainStarsTitle);
    }

    @Override
    public final rm0 x(sm0 sm0Var) {
        ?? e71Var = new e71(sm0Var, getContext(), this.currentAccount, 0, true, new hi.a(this, 22), this.resourcesProvider);
        this.X = e71Var;
        return e71Var;
    }
}
