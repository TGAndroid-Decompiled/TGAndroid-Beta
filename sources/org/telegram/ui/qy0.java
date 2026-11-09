package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class qy0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public int f49216a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f49217b;
    public TLRPC.TL_reportResultChooseOption f49218c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout f49219e;
    public final org.telegram.ui.Components.r41 f49220f;
    public final bi.m5 h;
    public oy0 f49221n;
    public FrameLayout f49222r;
    public fi.d f49223s;
    public final ry0 f49224w;

    public qy0(ry0 ry0Var, Context context) {
        super(context);
        this.f49224w = ry0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49219e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.g0.f22557m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, c8.ha.e(-1, -1, 119));
        int i7 = ry0.f49634s1;
        bi.m5 m5Var = new bi.m5(context, ry0Var.I0);
        TextView textView = (TextView) m5Var.f4327c;
        this.h = m5Var;
        m5Var.f4328e = new ny0(this, 0);
        if (ry0Var.l1) {
            textView.setText(org.telegram.messenger.id.M0(2131746234, null));
        } else if (ry0Var.f49638m1) {
            textView.setText(org.telegram.messenger.id.M0(2131746195, null));
        } else {
            textView.setText(org.telegram.messenger.id.M0(2131746243, null));
        }
        ((org.telegram.ui.ActionBar.y1) m5Var.d).a(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.G6, ry0Var.I0));
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27938h5, m5Var, ry0Var.I0);
        addView(m5Var, c8.ha.e(-1, -2, 55));
        org.telegram.ui.Components.r41 r41Var = new org.telegram.ui.Components.r41(context, ry0Var.f28621a, 0, true, new a5(this, 20), new ni0(this, 14), null, ry0Var.I0);
        this.f49220f = r41Var;
        r41Var.setClipToPadding(false);
        r41Var.f37555e3.k1(true);
        r41Var.setOnScrollListener(new g3(this, 28));
        frameLayout.addView(r41Var, c8.ha.c(-1.0f, -1));
    }

    public final void a(int i7) {
        boolean z9;
        this.f49216a = i7;
        if (i7 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.h.b(z9);
        org.telegram.ui.Components.r41 r41Var = this.f49220f;
        if (r41Var != null) {
            r41Var.f37556f3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f49217b = null;
        this.f49218c = null;
        this.d = tL_reportResultAddComment;
        this.f49220f.f37556f3.O(false);
        if (this.f49221n != null) {
            org.telegram.messenger.g0.i3(new ny0(this, 1), 120L);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.y1 y1Var;
        try {
            bi.m5 m5Var = this.h;
            if (m5Var != null && (y1Var = (org.telegram.ui.ActionBar.y1) m5Var.d) != null) {
                int i7 = org.telegram.ui.ActionBar.l6.G6;
                ry0 ry0Var = this.f49224w;
                int i10 = ry0.f49634s1;
                y1Var.a(org.telegram.ui.ActionBar.l6.w0(i7, ry0Var.I0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
