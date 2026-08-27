package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class w21 extends FrameLayout {

    public int f43581a;

    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f43582b;

    public TLRPC.TL_reportResultChooseOption f43583c;
    public TLRPC.TL_reportResultAddComment d;

    public final FrameLayout f43584e;

    public final org.telegram.ui.Components.k51 f43585f;
    public final ag.w h;

    public u21 f43586n;

    public FrameLayout f43587r;

    public lh.d f43588s;
    public final x21 v;

    public w21(x21 x21Var, Context context) {
        super(context);
        this.v = x21Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43584e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, h7.z5.e(-1, -1, 119));
        ag.w wVar = new ag.w(context, ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider);
        TextView textView = (TextView) wVar.d;
        this.h = wVar;
        wVar.f687e = new t21(this, 0);
        if (x21Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (x21Var.f44264e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        ((org.telegram.ui.ActionBar.g2) wVar.f686c).a(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider));
        wVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23124h5, ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider));
        addView(wVar, h7.z5.e(-1, -2, 55));
        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(context, ((org.telegram.ui.ActionBar.e3) x21Var).currentAccount, 0, true, new b5(this, 19), new dl0(this, 15), null, ((org.telegram.ui.ActionBar.e3) x21Var).resourcesProvider);
        this.f43585f = k51Var;
        k51Var.setClipToPadding(false);
        k51Var.T2.k1(true);
        k51Var.setOnScrollListener(new m3(this, 27));
        frameLayout.addView(k51Var, h7.z5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        this.f43581a = i10;
        this.h.b(i10 != 0);
        org.telegram.ui.Components.k51 k51Var = this.f43585f;
        if (k51Var != null) {
            k51Var.U2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f43582b = null;
        this.f43583c = null;
        this.d = tL_reportResultAddComment;
        this.f43585f.U2.N(false);
        if (this.f43586n != null) {
            AndroidUtilities.runOnUIThread(new t21(this, 1), 120L);
        }
    }
}
