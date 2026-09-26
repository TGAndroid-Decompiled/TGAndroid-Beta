package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class s31 extends FrameLayout {
    public int f37581a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f37582b;
    public TLRPC.TL_reportResultChooseOption f37583c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.r61 f37584f;
    public final t5 h;
    public r31 f37585n;
    public FrameLayout f37586r;
    public ci.d f37587s;
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
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.y5.e(-1, -1, 119));
        d6Var = ((org.telegram.ui.ActionBar.e3) t31Var).resourcesProvider;
        t5 t5Var = new t5(context, d6Var);
        TextView textView = (TextView) t5Var.d;
        this.h = t5Var;
        t5Var.e = new q31(this, 0);
        if (t31Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (t31Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        d6Var2 = ((org.telegram.ui.ActionBar.e3) t31Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.f2) t5Var.f37968b).a(org.telegram.ui.ActionBar.h6.v0(i11, d6Var2));
        int i12 = org.telegram.ui.ActionBar.h6.f19129h5;
        d6Var3 = ((org.telegram.ui.ActionBar.e3) t31Var).resourcesProvider;
        t5Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var3));
        addView(t5Var, w7.y5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.e3) t31Var).currentAccount;
        b5 b5Var = new b5(this, 19);
        ml0 ml0Var = new ml0(this, 15);
        d6Var4 = ((org.telegram.ui.ActionBar.e3) t31Var).resourcesProvider;
        org.telegram.ui.Components.r61 r61Var = new org.telegram.ui.Components.r61(context, i10, 0, true, b5Var, ml0Var, null, d6Var4);
        this.f37584f = r61Var;
        r61Var.setClipToPadding(false);
        r61Var.X2.k1(true);
        r61Var.setOnScrollListener(new i3(this, 26));
        frameLayout.addView(r61Var, w7.y5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f37581a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.r61 r61Var = this.f37584f;
        if (r61Var != null) {
            r61Var.Y2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f37582b = null;
        this.f37583c = null;
        this.d = tL_reportResultAddComment;
        this.f37584f.Y2.N(false);
        if (this.f37585n != null) {
            AndroidUtilities.runOnUIThread(new q31(this, 1), 120L);
        }
    }
}
