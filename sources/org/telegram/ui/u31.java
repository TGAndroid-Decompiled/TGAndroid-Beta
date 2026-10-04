package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class u31 extends FrameLayout {
    public int f41036a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f41037b;
    public TLRPC.TL_reportResultChooseOption f41038c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout f41039e;
    public final org.telegram.ui.Components.c71 f41040f;
    public final u5 h;
    public t31 f41041n;
    public FrameLayout f41042r;
    public ci.d f41043s;
    public final v31 v;

    public u31(v31 v31Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.d6 d6Var;
        org.telegram.ui.ActionBar.d6 d6Var2;
        org.telegram.ui.ActionBar.d6 d6Var3;
        int i10;
        org.telegram.ui.ActionBar.d6 d6Var4;
        this.v = v31Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f41039e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        d6Var = ((org.telegram.ui.ActionBar.f3) v31Var).resourcesProvider;
        u5 u5Var = new u5(context, d6Var);
        TextView textView = (TextView) u5Var.d;
        this.h = u5Var;
        u5Var.f41051e = new s31(this, 0);
        if (v31Var.d) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (v31Var.f41543e) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        d6Var2 = ((org.telegram.ui.ActionBar.f3) v31Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.g2) u5Var.f41049b).a(org.telegram.ui.ActionBar.i6.v0(i11, d6Var2));
        int i12 = org.telegram.ui.ActionBar.i6.f20889h5;
        d6Var3 = ((org.telegram.ui.ActionBar.f3) v31Var).resourcesProvider;
        u5Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(i12, d6Var3));
        addView(u5Var, w7.z5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.f3) v31Var).currentAccount;
        c5 c5Var = new c5(this, 19);
        jl0 jl0Var = new jl0(this, 16);
        d6Var4 = ((org.telegram.ui.ActionBar.f3) v31Var).resourcesProvider;
        org.telegram.ui.Components.c71 c71Var = new org.telegram.ui.Components.c71(context, i10, 0, true, c5Var, jl0Var, null, d6Var4);
        this.f41040f = c71Var;
        c71Var.setClipToPadding(false);
        c71Var.f25243e3.k1(true);
        c71Var.setOnScrollListener(new i3(this, 27));
        frameLayout.addView(c71Var, w7.z5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f41036a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.c71 c71Var = this.f41040f;
        if (c71Var != null) {
            c71Var.f25244f3.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f41037b = null;
        this.f41038c = null;
        this.d = tL_reportResultAddComment;
        this.f41040f.f25244f3.N(false);
        if (this.f41041n != null) {
            AndroidUtilities.runOnUIThread(new s31(this, 1), 120L);
        }
    }
}
