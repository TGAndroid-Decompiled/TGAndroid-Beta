package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class x21 extends FrameLayout {
    public int f44336a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f44337b;
    public TLRPC.TL_reportResultChooseOption f44338c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout f44339e;
    public final org.telegram.ui.Components.i51 f44340f;
    public final bh.g h;
    public v21 f44341n;
    public FrameLayout f44342r;
    public kh.d f44343s;
    public final y21 v;

    public x21(y21 y21Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        org.telegram.ui.ActionBar.b6 b6Var3;
        int i9;
        org.telegram.ui.ActionBar.b6 b6Var4;
        this.v = y21Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44339e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, g7.e6.e(-1, -1, 119));
        b6Var = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
        bh.g gVar = new bh.g(context, b6Var);
        TextView textView = (TextView) gVar.f2028c;
        this.h = gVar;
        gVar.f2029e = new u21(this, 0);
        if (y21Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (y21Var.f44693e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        b6Var2 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.h2) gVar.d).a(org.telegram.ui.ActionBar.f6.v0(i10, b6Var2));
        int i11 = org.telegram.ui.ActionBar.f6.f23072h5;
        b6Var3 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
        gVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var3));
        addView(gVar, g7.e6.e(-1, -2, 55));
        i9 = ((org.telegram.ui.ActionBar.f3) y21Var).currentAccount;
        a5 a5Var = new a5(this, 19);
        dl0 dl0Var = new dl0(this, 15);
        b6Var4 = ((org.telegram.ui.ActionBar.f3) y21Var).resourcesProvider;
        org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(context, i9, 0, true, a5Var, dl0Var, null, b6Var4);
        this.f44340f = i51Var;
        i51Var.setClipToPadding(false);
        i51Var.T2.k1(true);
        i51Var.setOnScrollListener(new l3(this, 27));
        frameLayout.addView(i51Var, g7.e6.c(-1.0f, -1));
    }

    public final void a(int i9) {
        boolean z10;
        this.f44336a = i9;
        if (i9 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.i51 i51Var = this.f44340f;
        if (i51Var != null) {
            i51Var.U2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f44337b = null;
        this.f44338c = null;
        this.d = tL_reportResultAddComment;
        this.f44340f.U2.N(false);
        if (this.f44341n != null) {
            AndroidUtilities.runOnUIThread(new u21(this, 1), 120L);
        }
    }
}
