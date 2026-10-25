package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class zo0 extends FrameLayout {
    public long f46339a;
    public TL_stars.starGiftAttributeBackdrop f46340b;
    public TL_stars.starGiftAttributePattern f46341c;
    public final FrameLayout d;
    public final zh.d1 e;
    public final org.telegram.ui.Components.y9 f46342f;
    public final zh.h1 h;
    public TLRPC.Document f46343n;

    public zo0(Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        zh.d1 d1Var = new zh.d1(frameLayout, u6Var, false);
        this.e = d1Var;
        frameLayout.setBackground(d1Var);
        addView(frameLayout, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        org.telegram.ui.Components.gb1.c(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f46342f = y9Var;
        frameLayout.addView(y9Var, org.telegram.ui.Components.gb1.h(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (z10) {
            zh.h1 h1Var = new zh.h1(context);
            this.h = h1Var;
            addView(h1Var, org.telegram.ui.Components.gb1.h(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
            return;
        }
        this.h = null;
    }

    public final void a(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i11;
        int i12;
        this.f46339a = tL_starGiftUnique.f22254id;
        boolean z10 = true;
        if (i10 % 3 != 1) {
            z10 = false;
        }
        if (z10) {
            i11 = AndroidUtilities.dp(4.0f);
        } else {
            i11 = 0;
        }
        if (z10) {
            i12 = AndroidUtilities.dp(4.0f);
        } else {
            i12 = 0;
        }
        setPadding(i11, 0, i12, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.f46340b = (TL_stars.starGiftAttributeBackdrop) bi.ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.f46341c = (TL_stars.starGiftAttributePattern) bi.ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f46340b;
        zh.d1 d1Var = this.e;
        d1Var.d(stargiftattributebackdrop);
        d1Var.e(this.f46341c);
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        this.e.f(z10, z11);
        if (z10) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.y9 y9Var = this.f46342f;
        if (z11) {
            y9Var.animate().scaleX(f7).scaleY(f7).start();
            return;
        }
        y9Var.animate().cancel();
        y9Var.setScaleX(f7);
        y9Var.setScaleY(f7);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.y9 y9Var = this.f46342f;
        if (document == null) {
            y9Var.b();
            this.f46343n = null;
        } else if (this.f46343n == document) {
        } else {
            this.f46343n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            y9Var.l(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.y6.f23297a7, 0.3f), starGift);
        }
    }

    public long getGiftId() {
        return this.f46339a;
    }
}
