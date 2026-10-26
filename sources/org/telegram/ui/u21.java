package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class u21 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public int f43984a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f43985b;
    public TLRPC.TL_reportResultChooseOption f43986c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.r71 f43987f;
    public final bi.j5 h;
    public s21 f43988n;
    public FrameLayout f43989r;
    public fi.d f43990s;
    public final v21 v;

    public u21(v21 v21Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var4;
        this.v = v21Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        u6Var = ((org.telegram.ui.ActionBar.k3) v21Var).resourcesProvider;
        bi.j5 j5Var = new bi.j5(context, u6Var);
        TextView textView = (TextView) j5Var.f4872c;
        this.h = j5Var;
        j5Var.e = new r21(this, 0);
        if (v21Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (v21Var.f44580f) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        u6Var2 = ((org.telegram.ui.ActionBar.k3) v21Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.j2) j5Var.d).a(org.telegram.ui.ActionBar.y6.w0(i11, u6Var2));
        int i12 = org.telegram.ui.ActionBar.y6.f23427h5;
        u6Var3 = ((org.telegram.ui.ActionBar.k3) v21Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.i(i12, j5Var, u6Var3);
        addView(j5Var, org.telegram.ui.Components.gb1.i(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.k3) v21Var).currentAccount;
        e5 e5Var = new e5(this, 19);
        hl0 hl0Var = new hl0(this, 16);
        u6Var4 = ((org.telegram.ui.ActionBar.k3) v21Var).resourcesProvider;
        org.telegram.ui.Components.r71 r71Var = new org.telegram.ui.Components.r71(context, i10, 0, true, e5Var, hl0Var, null, u6Var4);
        this.f43987f = r71Var;
        r71Var.setClipToPadding(false);
        r71Var.f32151f3.l1(true);
        r71Var.setOnScrollListener(new i3(this, 27));
        frameLayout.addView(r71Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f43984a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.r71 r71Var = this.f43987f;
        if (r71Var != null) {
            r71Var.f32152g3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f43985b = null;
        this.f43986c = null;
        this.d = tL_reportResultAddComment;
        this.f43987f.f32152g3.O(false);
        if (this.f43988n != null) {
            AndroidUtilities.runOnUIThread(new r21(this, 1), 120L);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.j2 j2Var;
        org.telegram.ui.ActionBar.u6 u6Var;
        try {
            bi.j5 j5Var = this.h;
            if (j5Var != null && (j2Var = (org.telegram.ui.ActionBar.j2) j5Var.d) != null) {
                int i10 = org.telegram.ui.ActionBar.y6.G6;
                u6Var = ((org.telegram.ui.ActionBar.k3) this.v).resourcesProvider;
                j2Var.a(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
