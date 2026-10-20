package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r4 extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.Components.jm0 f41055a;
    public q4 f41056b;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.AudioRecorderSettings));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 22));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20932a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(context, null);
        this.f41055a = jm0Var;
        jm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f41055a);
        this.f41055a.setLayoutManager(new s4.b0());
        this.f41055a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.jm0 jm0Var2 = this.f41055a;
        q4 q4Var = new q4(context);
        this.f41056b = q4Var;
        jm0Var2.setAdapter(q4Var);
        this.f41055a.setOnItemClickListener(new i(this, 2));
        frameLayout.addView(this.f41055a, w7.z5.c(-1.0f, -1));
        return this.fragmentView;
    }
}
