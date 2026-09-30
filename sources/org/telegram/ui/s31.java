package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class s31 extends FrameLayout {
    public int f37677a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f37678b;
    public TLRPC.TL_reportResultChooseOption f37679c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.u61 f37680f;
    public final t5 h;
    public r31 f37681n;
    public FrameLayout f37682r;
    public ci.d f37683s;
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
        ((org.telegram.ui.ActionBar.f2) t5Var.f38076b).a(org.telegram.ui.ActionBar.h6.v0(i11, d6Var2));
        int i12 = org.telegram.ui.ActionBar.h6.f19146h5;
        d6Var3 = ((org.telegram.ui.ActionBar.e3) t31Var).resourcesProvider;
        t5Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var3));
        addView(t5Var, w7.y5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.e3) t31Var).currentAccount;
        b5 b5Var = new b5(this, 19);
        zp0 zp0Var = new zp0(this, 14);
        d6Var4 = ((org.telegram.ui.ActionBar.e3) t31Var).resourcesProvider;
        org.telegram.ui.Components.u61 u61Var = new org.telegram.ui.Components.u61(context, i10, 0, true, b5Var, zp0Var, null, d6Var4);
        this.f37680f = u61Var;
        u61Var.setClipToPadding(false);
        u61Var.f28777e3.k1(true);
        u61Var.setOnScrollListener(new i3(this, 26));
        frameLayout.addView(u61Var, w7.y5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f37677a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.u61 u61Var = this.f37680f;
        if (u61Var != null) {
            u61Var.f28778f3.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f37678b = null;
        this.f37679c = null;
        this.d = tL_reportResultAddComment;
        this.f37680f.f28778f3.N(false);
        if (this.f37681n != null) {
            AndroidUtilities.runOnUIThread(new q31(this, 1), 120L);
        }
    }
}
