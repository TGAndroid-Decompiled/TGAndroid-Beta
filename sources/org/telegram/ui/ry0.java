package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ry0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public int f49595a;
    public TLRPC.TL_channels_sponsoredMessageReportResultChooseOption f49596b;
    public TLRPC.TL_reportResultChooseOption f49597c;
    public TLRPC.TL_reportResultAddComment d;
    public final FrameLayout f49598e;
    public final org.telegram.ui.Components.r41 f49599f;
    public final bi.m5 h;
    public py0 f49600n;
    public FrameLayout f49601r;
    public fi.d f49602s;
    public final sy0 f49603w;

    public ry0(sy0 sy0Var, Context context) {
        super(context);
        this.f49603w = sy0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49598e = frameLayout;
        frameLayout.setPadding(0, org.telegram.messenger.g0.f22561m, 0, 0);
        frameLayout.setClipToPadding(true);
        addView(frameLayout, c8.ha.e(-1, -1, 119));
        int i7 = sy0.f49991v1;
        bi.m5 m5Var = new bi.m5(context, sy0Var.I0);
        TextView textView = (TextView) m5Var.f4327c;
        this.h = m5Var;
        m5Var.f4328e = new oy0(this, 0);
        if (sy0Var.f49993o1) {
            textView.setText(org.telegram.messenger.id.M0(2131746234, null));
        } else if (sy0Var.f49994p1) {
            textView.setText(org.telegram.messenger.id.M0(2131746195, null));
        } else {
            textView.setText(org.telegram.messenger.id.M0(2131746243, null));
        }
        ((org.telegram.ui.ActionBar.y1) m5Var.d).a(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, sy0Var.I0));
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27963h5, m5Var, sy0Var.I0);
        addView(m5Var, c8.ha.e(-1, -2, 55));
        org.telegram.ui.Components.r41 r41Var = new org.telegram.ui.Components.r41(context, sy0Var.f28669a, 0, true, new a5(this, 20), new oi0(this, 14), null, sy0Var.I0);
        this.f49599f = r41Var;
        r41Var.setClipToPadding(false);
        r41Var.f37495e3.k1(true);
        r41Var.setOnScrollListener(new g3(this, 28));
        frameLayout.addView(r41Var, c8.ha.c(-1.0f, -1));
    }

    public final void a(int i7) {
        boolean z9;
        this.f49595a = i7;
        if (i7 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.h.b(z9);
        org.telegram.ui.Components.r41 r41Var = this.f49599f;
        if (r41Var != null) {
            r41Var.f37496f3.O(true);
        }
    }

    public final void b(TLRPC.TL_reportResultAddComment tL_reportResultAddComment) {
        this.f49596b = null;
        this.f49597c = null;
        this.d = tL_reportResultAddComment;
        this.f49599f.f37496f3.O(false);
        if (this.f49600n != null) {
            org.telegram.messenger.g0.i3(new oy0(this, 1), 120L);
        }
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.y1 y1Var;
        try {
            bi.m5 m5Var = this.h;
            if (m5Var != null && (y1Var = (org.telegram.ui.ActionBar.y1) m5Var.d) != null) {
                int i7 = org.telegram.ui.ActionBar.m6.G6;
                sy0 sy0Var = this.f49603w;
                int i10 = sy0.f49991v1;
                y1Var.a(org.telegram.ui.ActionBar.m6.w0(i7, sy0Var.I0));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
