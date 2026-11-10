package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class tl0 extends FrameLayout {
    public long f50297a;
    public TL_stars.starGiftAttributeBackdrop f50298b;
    public TL_stars.starGiftAttributePattern f50299c;
    public final FrameLayout d;
    public final zh.v0 f50300e;
    public final org.telegram.ui.Components.k9 f50301f;
    public final zh.z0 h;
    public TLRPC.Document f50302n;

    public tl0(Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        zh.v0 v0Var = new zh.v0(frameLayout, h6Var, false);
        this.f50300e = v0Var;
        frameLayout.setBackground(v0Var);
        addView(frameLayout, c8.ha.e(-1, -1, 119));
        c8.ka.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f50301f = k9Var;
        frameLayout.addView(k9Var, c8.ha.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (z9) {
            zh.z0 z0Var = new zh.z0(context);
            this.h = z0Var;
            addView(z0Var, c8.ha.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
            return;
        }
        this.h = null;
    }

    public final void a(int i7, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i10;
        int i11;
        this.f50297a = tL_starGiftUnique.f27189id;
        boolean z9 = true;
        if (i7 % 3 != 1) {
            z9 = false;
        }
        if (z9) {
            i10 = org.telegram.messenger.g0.L(4.0f);
        } else {
            i10 = 0;
        }
        if (z9) {
            i11 = org.telegram.messenger.g0.L(4.0f);
        } else {
            i11 = 0;
        }
        setPadding(i10, 0, i11, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.f50298b = (TL_stars.starGiftAttributeBackdrop) bi.ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.f50299c = (TL_stars.starGiftAttributePattern) bi.ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f50298b;
        zh.v0 v0Var = this.f50300e;
        v0Var.d(stargiftattributebackdrop);
        v0Var.e(this.f50299c);
    }

    public final void b(boolean z9, boolean z10) {
        float f10;
        this.f50300e.f(z9, z10);
        if (z9) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.k9 k9Var = this.f50301f;
        if (z10) {
            k9Var.animate().scaleX(f10).scaleY(f10).start();
            return;
        }
        k9Var.animate().cancel();
        k9Var.setScaleX(f10);
        k9Var.setScaleY(f10);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.k9 k9Var = this.f50301f;
        if (document == null) {
            k9Var.b();
            this.f50302n = null;
        } else if (this.f50302n == document) {
        } else {
            this.f50302n = document;
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.g0.L(100.0f), false, null, false);
            k9Var.m(org.telegram.messenger.hc.b(document), "100_100", org.telegram.messenger.hc.c(w10, document), "100_100", org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.m6.f27834a7, 0.3f, null), starGift);
        }
    }

    public long getGiftId() {
        return this.f50297a;
    }
}
