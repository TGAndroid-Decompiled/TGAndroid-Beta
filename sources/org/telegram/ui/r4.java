package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class r4 extends org.telegram.ui.ActionBar.n2 {
    public org.telegram.ui.Components.im0 f41057a;
    public q4 f41058b;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.AudioRecorderSettings));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 22));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20931a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(context, null);
        this.f41057a = im0Var;
        im0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f41057a);
        this.f41057a.setLayoutManager(new s4.b0());
        this.f41057a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.im0 im0Var2 = this.f41057a;
        q4 q4Var = new q4(context);
        this.f41058b = q4Var;
        im0Var2.setAdapter(q4Var);
        this.f41057a.setOnItemClickListener(new i(this, 2));
        frameLayout.addView(this.f41057a, w7.z5.c(-1.0f, -1));
        return this.fragmentView;
    }
}
