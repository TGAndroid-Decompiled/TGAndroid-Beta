package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class u31 extends FrameLayout {
    public int f38112a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f38113b;
    public TLRPC.TL_reportResultChooseOption f38114c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.t61 f38115f;
    public final v5 h;
    public t31 f38116n;
    public FrameLayout f38117r;
    public ci.d f38118s;
    public final v31 v;

    public u31(v31 v31Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var4;
        this.v = v31Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.y5.e(-1, -1, 119));
        e6Var = ((org.telegram.ui.ActionBar.g3) v31Var).resourcesProvider;
        v5 v5Var = new v5(context, e6Var);
        TextView textView = (TextView) v5Var.d;
        this.h = v5Var;
        v5Var.e = new s31(this, 0);
        if (v31Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (v31Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        e6Var2 = ((org.telegram.ui.ActionBar.g3) v31Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.h2) v5Var.f38448b).a(org.telegram.ui.ActionBar.i6.v0(i11, e6Var2));
        int i12 = org.telegram.ui.ActionBar.i6.f19128h5;
        e6Var3 = ((org.telegram.ui.ActionBar.g3) v31Var).resourcesProvider;
        v5Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i12, e6Var3));
        addView(v5Var, w7.y5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.g3) v31Var).currentAccount;
        d5 d5Var = new d5(this, 19);
        qk0 qk0Var = new qk0(this, 17);
        e6Var4 = ((org.telegram.ui.ActionBar.g3) v31Var).resourcesProvider;
        org.telegram.ui.Components.t61 t61Var = new org.telegram.ui.Components.t61(context, i10, 0, true, d5Var, qk0Var, null, e6Var4);
        this.f38115f = t61Var;
        t61Var.setClipToPadding(false);
        t61Var.X2.k1(true);
        t61Var.setOnScrollListener(new j3(this, 26));
        frameLayout.addView(t61Var, w7.y5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f38112a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.t61 t61Var = this.f38115f;
        if (t61Var != null) {
            t61Var.Y2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f38113b = null;
        this.f38114c = null;
        this.d = tL_reportResultAddComment;
        this.f38115f.Y2.N(false);
        if (this.f38116n != null) {
            AndroidUtilities.runOnUIThread(new s31(this, 1), 120L);
        }
    }
}
