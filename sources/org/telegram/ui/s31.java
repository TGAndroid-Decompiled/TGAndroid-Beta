package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class s31 extends FrameLayout {
    public int f40325a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f40326b;
    public TLRPC.TL_reportResultChooseOption f40327c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout f40328e;
    public final org.telegram.ui.Components.e71 f40329f;
    public final u5 h;
    public r31 f40330n;
    public FrameLayout f40331r;
    public ci.d f40332s;
    public final t31 v;

    public s31(t31 t31Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var4;
        this.v = t31Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40328e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        d6Var = ((org.telegram.ui.ActionBar.f3) t31Var).resourcesProvider;
        u5 u5Var = new u5(context, d6Var);
        TextView textView = (TextView) u5Var.d;
        this.h = u5Var;
        u5Var.f41106e = new q31(this, 0);
        if (t31Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (t31Var.f40702e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        d6Var2 = ((org.telegram.ui.ActionBar.f3) t31Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.g2) u5Var.f41104b).a(org.telegram.ui.ActionBar.i6.v0(i11, d6Var2));
        int i12 = org.telegram.ui.ActionBar.i6.f20899h5;
        d6Var3 = ((org.telegram.ui.ActionBar.f3) t31Var).resourcesProvider;
        u5Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i12, d6Var3));
        addView(u5Var, w7.z5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.f3) t31Var).currentAccount;
        c5 c5Var = new c5(this, 19);
        jl0 jl0Var = new jl0(this, 16);
        d6Var4 = ((org.telegram.ui.ActionBar.f3) t31Var).resourcesProvider;
        org.telegram.ui.Components.e71 e71Var = new org.telegram.ui.Components.e71(context, i10, 0, true, c5Var, jl0Var, null, d6Var4);
        this.f40329f = e71Var;
        e71Var.setClipToPadding(false);
        e71Var.f26033e3.k1(true);
        e71Var.setOnScrollListener(new i3(this, 27));
        frameLayout.addView(e71Var, w7.z5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f40325a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.e71 e71Var = this.f40329f;
        if (e71Var != null) {
            e71Var.f26034f3.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f40326b = null;
        this.f40327c = null;
        this.d = tL_reportResultAddComment;
        this.f40329f.f26034f3.N(false);
        if (this.f40330n != null) {
            AndroidUtilities.runOnUIThread(new q31(this, 1), 120L);
        }
    }
}
