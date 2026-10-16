package zh;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
public final class t extends db {
    public q X;
    public final LinearLayout Y;

    public t(Context context) {
        super(context, null, false, false, null);
        this.v = 0.1f;
        fixNavigationBar();
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        this.Y = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        r6 r6Var = new r6(context, 70, 0);
        frameLayout.addView(r6Var, w7.z5.d(-1.0f, -1));
        tg.n nVar = new tg.n(context, 1, 2);
        tg.g gVar = nVar.f45740b;
        gVar.f45724z = org.telegram.ui.ActionBar.g6.fk;
        gVar.A = org.telegram.ui.ActionBar.g6.gk;
        gVar.b();
        nVar.setStarParticlesView(r6Var);
        frameLayout.addView(nVar, w7.z5.a(170.0f, 0.0f, 32.0f, 0.0f, 24.0f, 170, 17));
        nVar.setPaused(false);
        linearLayout.addView(frameLayout, w7.z5.d(150.0f, -1));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.play_billing.k3.m(20.0f, 1, textView);
        int i11 = org.telegram.ui.ActionBar.g6.f19707j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, this.resourcesProvider));
        textView.setGravity(17);
        textView.setText(LocaleController.getString(R.string.ExplainStarsTitle));
        TextView i12 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.t(-2, -2, 1, 0, 2, 0, 0), context);
        i12.setTextSize(1, 14.0f);
        i12.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, this.resourcesProvider));
        i12.setGravity(17);
        i12.setText(LocaleController.getString(R.string.ExplainStarsTitle2));
        linearLayout.addView(i12, w7.z5.t(-1, -2, 1, 16, 9, 16, 18));
        FrameLayout frameLayout2 = new FrameLayout(context);
        di.d dVar = new di.d(context, this.resourcesProvider, true);
        dVar.g(LocaleController.getString(R.string.ExplainStarsButton), false, true);
        dVar.setOnClickListener(new ji.o4(this, 19));
        frameLayout2.addView(dVar, w7.z5.a(48.0f, 10.0f, 10.0f, 10.0f, 10.0f, -1, 119));
        int i13 = this.backgroundPaddingLeft;
        frameLayout2.setPadding(i13, 0, i13, 0);
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false));
        this.containerView.addView(frameLayout2, w7.z5.e(-1, -2, 87));
        this.X.N(false);
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.ExplainStarsTitle);
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        ?? a71Var = new a71(mm0Var, getContext(), this.currentAccount, 0, true, new ii.a(this, 22), this.resourcesProvider);
        this.X = a71Var;
        return a71Var;
    }
}
