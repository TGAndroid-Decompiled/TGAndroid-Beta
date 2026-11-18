package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ul0 extends FrameLayout {
    public long f52591a;
    public TL_stars.starGiftAttributeBackdrop f52592b;
    public TL_stars.starGiftAttributePattern f52593c;
    public final FrameLayout d;
    public final bi.y2 f52594e;
    public final org.telegram.ui.Components.q9 f52595f;
    public final bi.d3 h;
    public TLRPC.Document f52596n;

    public ul0(Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        bi.y2 y2Var = new bi.y2(frameLayout, i6Var, false);
        this.f52594e = y2Var;
        frameLayout.setBackground(y2Var);
        addView(frameLayout, c8.ma.e(-1, -1, 119));
        c8.ra.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f52595f = q9Var;
        frameLayout.addView(q9Var, c8.ma.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (z10) {
            bi.d3 d3Var = new bi.d3(context);
            this.h = d3Var;
            addView(d3Var, c8.ma.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
            return;
        }
        this.h = null;
    }

    public final void a(int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        int i11;
        this.f52591a = tL_starGiftUnique.f28634id;
        boolean z10 = true;
        if (i7 % 3 != 1) {
            z10 = false;
        }
        if (z10) {
            i10 = org.telegram.messenger.g0.L(4.0f);
        } else {
            i10 = 0;
        }
        if (z10) {
            i11 = org.telegram.messenger.g0.L(4.0f);
        } else {
            i11 = 0;
        }
        setPadding(i10, 0, i11, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.f52592b = (TL_stars.starGiftAttributeBackdrop) di.x8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.f52593c = (TL_stars.starGiftAttributePattern) di.x8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f52592b;
        bi.y2 y2Var = this.f52594e;
        y2Var.d(stargiftattributebackdrop);
        y2Var.e(this.f52593c);
    }

    public final void b(boolean z10, boolean z11) {
        float f10;
        this.f52594e.f(z10, z11);
        if (z10) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.q9 q9Var = this.f52595f;
        if (z11) {
            q9Var.animate().scaleX(f10).scaleY(f10).start();
            return;
        }
        q9Var.animate().cancel();
        q9Var.setScaleX(f10);
        q9Var.setScaleY(f10);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.q9 q9Var = this.f52595f;
        if (document == null) {
            q9Var.b();
            this.f52596n = null;
        } else if (this.f52596n == document) {
        } else {
            this.f52596n = document;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            q9Var.m(org.telegram.messenger.fc.b(document), "100_100", org.telegram.messenger.fc.c(w10, document), "100_100", org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.n6.f29339a7, 0.3f, null), starGift);
        }
    }

    public long getGiftId() {
        return this.f52591a;
    }
}
