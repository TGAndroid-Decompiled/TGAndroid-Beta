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
public final class w21 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public int f44499a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f44500b;
    public TLRPC.TL_reportResultChooseOption f44501c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.s71 f44502f;
    public final bi.j5 h;
    public u21 f44503n;
    public FrameLayout f44504r;
    public fi.d f44505s;
    public final x21 v;

    public w21(x21 x21Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        int i10;
        org.telegram.ui.ActionBar.u6 u6Var4;
        this.v = x21Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        u6Var = ((org.telegram.ui.ActionBar.k3) x21Var).resourcesProvider;
        bi.j5 j5Var = new bi.j5(context, u6Var);
        TextView textView = (TextView) j5Var.f4872c;
        this.h = j5Var;
        j5Var.e = new t21(this, 0);
        if (x21Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (x21Var.f45464f) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        u6Var2 = ((org.telegram.ui.ActionBar.k3) x21Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.j2) j5Var.d).a(org.telegram.ui.ActionBar.y6.w0(i11, u6Var2));
        int i12 = org.telegram.ui.ActionBar.y6.f23428h5;
        u6Var3 = ((org.telegram.ui.ActionBar.k3) x21Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.i(i12, j5Var, u6Var3);
        addView(j5Var, org.telegram.ui.Components.kb1.i(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.k3) x21Var).currentAccount;
        e5 e5Var = new e5(this, 19);
        jl0 jl0Var = new jl0(this, 16);
        u6Var4 = ((org.telegram.ui.ActionBar.k3) x21Var).resourcesProvider;
        org.telegram.ui.Components.s71 s71Var = new org.telegram.ui.Components.s71(context, i10, 0, true, e5Var, jl0Var, null, u6Var4);
        this.f44502f = s71Var;
        s71Var.setClipToPadding(false);
        s71Var.f32503f3.l1(true);
        s71Var.setOnScrollListener(new i3(this, 27));
        frameLayout.addView(s71Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f44499a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.s71 s71Var = this.f44502f;
        if (s71Var != null) {
            s71Var.f32504g3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f44500b = null;
        this.f44501c = null;
        this.d = tL_reportResultAddComment;
        this.f44502f.f32504g3.O(false);
        if (this.f44503n != null) {
            AndroidUtilities.runOnUIThread(new t21(this, 1), 120L);
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
