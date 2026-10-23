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
public final class r21 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int f40979a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f40980b;
    public TLRPC.TL_reportResultChooseOption f40981c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout e;
    public final org.telegram.ui.Components.j71 f40982f;
    public final ai.o5 h;
    public q21 f40983n;
    public FrameLayout f40984r;
    public ei.d f40985s;
    public final s21 v;

    public r21(s21 s21Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        int i10;
        org.telegram.ui.ActionBar.g6 g6Var4;
        this.v = s21Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setPadding(0, AndroidUtilities.statusBarHeight, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        g6Var = ((org.telegram.ui.ActionBar.h3) s21Var).resourcesProvider;
        ai.o5 o5Var = new ai.o5(context, g6Var);
        TextView textView = (TextView) o5Var.f1936c;
        this.h = o5Var;
        o5Var.e = new p21(this, 0);
        if (s21Var.e) {
            textView.setText(LocaleController.getString(R.string.ReportAd));
        } else if (s21Var.f41294f) {
            textView.setText(LocaleController.getString(R.string.ReportStory));
        } else {
            textView.setText(LocaleController.getString(R.string.Report2));
        }
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        g6Var2 = ((org.telegram.ui.ActionBar.h3) s21Var).resourcesProvider;
        ((org.telegram.ui.ActionBar.h2) o5Var.d).a(org.telegram.ui.ActionBar.k6.w0(i11, g6Var2));
        int i12 = org.telegram.ui.ActionBar.k6.f21254h5;
        g6Var3 = ((org.telegram.ui.ActionBar.h3) s21Var).resourcesProvider;
        org.telegram.ui.ActionBar.r6.i(i12, o5Var, g6Var3);
        addView(o5Var, w7.z5.e(-1, -2, 55));
        i10 = ((org.telegram.ui.ActionBar.h3) s21Var).currentAccount;
        f5 f5Var = new f5(this, 19);
        sp0 sp0Var = new sp0(this, 14);
        g6Var4 = ((org.telegram.ui.ActionBar.h3) s21Var).resourcesProvider;
        org.telegram.ui.Components.j71 j71Var = new org.telegram.ui.Components.j71(context, i10, 0, true, f5Var, sp0Var, null, g6Var4);
        this.f40982f = j71Var;
        j71Var.setClipToPadding(false);
        j71Var.Y2.k1(true);
        j71Var.setOnScrollListener(new j3(this, 26));
        frameLayout.addView(j71Var, w7.z5.c(-1.0f, -1));
    }

    public final void a(int i10) {
        boolean z10;
        this.f40979a = i10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.h.b(z10);
        org.telegram.ui.Components.j71 j71Var = this.f40982f;
        if (j71Var != null) {
            j71Var.Z2.N(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f40980b = null;
        this.f40981c = null;
        this.d = tL_reportResultAddComment;
        this.f40982f.Z2.N(false);
        if (this.f40983n != null) {
            AndroidUtilities.runOnUIThread(new p21(this, 1), 120L);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.h2 h2Var;
        org.telegram.ui.ActionBar.g6 g6Var;
        try {
            ai.o5 o5Var = this.h;
            if (o5Var != null && (h2Var = (org.telegram.ui.ActionBar.h2) o5Var.d) != null) {
                int i10 = org.telegram.ui.ActionBar.k6.G6;
                g6Var = ((org.telegram.ui.ActionBar.h3) this.v).resourcesProvider;
                h2Var.a(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
