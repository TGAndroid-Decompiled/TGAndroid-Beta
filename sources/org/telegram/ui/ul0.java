package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ul0 extends FrameLayout {
    public long f52582a;
    public TL_stars.starGiftAttributeBackdrop f52583b;
    public TL_stars.starGiftAttributePattern f52584c;
    public final FrameLayout d;
    public final bi.e3 f52585e;
    public final org.telegram.ui.Components.q9 f52586f;
    public final bi.j3 h;
    public TLRPC.Document f52587n;

    public ul0(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        bi.e3 e3Var = new bi.e3(frameLayout, h6Var, false);
        this.f52585e = e3Var;
        frameLayout.setBackground(e3Var);
        addView(frameLayout, c8.na.e(-1, -1, 119));
        c8.sa.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f52586f = q9Var;
        frameLayout.addView(q9Var, c8.na.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (z10) {
            bi.j3 j3Var = new bi.j3(context);
            this.h = j3Var;
            addView(j3Var, c8.na.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
            return;
        }
        this.h = null;
    }

    public final void a(int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        int i11;
        this.f52582a = tL_starGiftUnique.f28627id;
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
        this.f52583b = (TL_stars.starGiftAttributeBackdrop) di.y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.f52584c = (TL_stars.starGiftAttributePattern) di.y8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f52583b;
        bi.e3 e3Var = this.f52585e;
        e3Var.d(stargiftattributebackdrop);
        e3Var.e(this.f52584c);
    }

    public final void b(boolean z10, boolean z11) {
        float f10;
        this.f52585e.f(z10, z11);
        if (z10) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.q9 q9Var = this.f52586f;
        if (z11) {
            q9Var.animate().scaleX(f10).scaleY(f10).start();
            return;
        }
        q9Var.animate().cancel();
        q9Var.setScaleX(f10);
        q9Var.setScaleY(f10);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.q9 q9Var = this.f52586f;
        if (document == null) {
            q9Var.b();
            this.f52587n = null;
        } else if (this.f52587n == document) {
        } else {
            this.f52587n = document;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            q9Var.m(org.telegram.messenger.gc.b(document), "100_100", org.telegram.messenger.gc.c(w10, document), "100_100", org.telegram.messenger.u5.f(document, org.telegram.ui.ActionBar.m6.f29290a7, 0.3f, null), starGift);
        }
    }

    public long getGiftId() {
        return this.f52582a;
    }
}
