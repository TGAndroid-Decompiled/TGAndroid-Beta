package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class rl0 extends FrameLayout {
    public long f50970a;
    public TL_stars.starGiftAttributeBackdrop f50971b;
    public TL_stars.starGiftAttributePattern f50972c;
    public final FrameLayout d;
    public final bi.e2 f50973e;
    public final org.telegram.ui.Components.i9 f50974f;
    public final bi.j2 h;
    public TLRPC.Document f50975n;

    public rl0(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        bi.e2 e2Var = new bi.e2(frameLayout, e6Var, false);
        this.f50973e = e2Var;
        frameLayout.setBackground(e2Var);
        addView(frameLayout, c8.ja.e(-1, -1, 119));
        c8.na.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f50974f = i9Var;
        frameLayout.addView(i9Var, c8.ja.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (z10) {
            bi.j2 j2Var = new bi.j2(context);
            this.h = j2Var;
            addView(j2Var, c8.ja.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
            return;
        }
        this.h = null;
    }

    public final void a(int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        int i11;
        this.f50970a = tL_starGiftUnique.f28280id;
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
        this.f50971b = (TL_stars.starGiftAttributeBackdrop) di.v8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.f50972c = (TL_stars.starGiftAttributePattern) di.v8.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f50971b;
        bi.e2 e2Var = this.f50973e;
        e2Var.d(stargiftattributebackdrop);
        e2Var.e(this.f50972c);
    }

    public final void b(boolean z10, boolean z11) {
        float f10;
        this.f50973e.f(z10, z11);
        if (z10) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.i9 i9Var = this.f50974f;
        if (z11) {
            i9Var.animate().scaleX(f10).scaleY(f10).start();
            return;
        }
        i9Var.animate().cancel();
        i9Var.setScaleX(f10);
        i9Var.setScaleY(f10);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.i9 i9Var = this.f50974f;
        if (document == null) {
            i9Var.b();
            this.f50975n = null;
        } else if (this.f50975n == document) {
        } else {
            this.f50975n = document;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            i9Var.m(org.telegram.messenger.gc.b(document), "100_100", org.telegram.messenger.gc.c(w10, document), "100_100", org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.j6.f28792a7, 0.3f, null), starGift);
        }
    }

    public long getGiftId() {
        return this.f50970a;
    }
}
