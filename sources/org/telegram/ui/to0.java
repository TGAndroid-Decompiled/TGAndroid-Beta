package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class to0 extends FrameLayout {
    public long f42051a;
    public TL_stars.starGiftAttributeBackdrop f42052b;
    public TL_stars.starGiftAttributePattern f42053c;
    public final FrameLayout d;
    public final yh.d1 e;
    public final org.telegram.ui.Components.w9 f42054f;
    public final yh.h1 h;
    public TLRPC.Document f42055n;

    public to0(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        yh.d1 d1Var = new yh.d1(frameLayout, g6Var, false);
        this.e = d1Var;
        frameLayout.setBackground(d1Var);
        addView(frameLayout, w7.z5.e(-1, -1, 119));
        w7.b6.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.f42054f = w9Var;
        frameLayout.addView(w9Var, w7.z5.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (z10) {
            yh.h1 h1Var = new yh.h1(context);
            this.h = h1Var;
            addView(h1Var, w7.z5.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
            return;
        }
        this.h = null;
    }

    public final void a(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i11;
        int i12;
        this.f42051a = tL_starGiftUnique.f20567id;
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
        this.f42052b = (TL_stars.starGiftAttributeBackdrop) ai.ha.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.f42053c = (TL_stars.starGiftAttributePattern) ai.ha.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f42052b;
        yh.d1 d1Var = this.e;
        d1Var.d(stargiftattributebackdrop);
        d1Var.e(this.f42053c);
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        this.e.f(z10, z11);
        if (z10) {
            f7 = 0.9f;
        } else {
            f7 = 1.0f;
        }
        org.telegram.ui.Components.w9 w9Var = this.f42054f;
        if (z11) {
            w9Var.animate().scaleX(f7).scaleY(f7).start();
            return;
        }
        w9Var.animate().cancel();
        w9Var.setScaleX(f7);
        w9Var.setScaleY(f7);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.w9 w9Var = this.f42054f;
        if (document == null) {
            w9Var.b();
            this.f42055n = null;
        } else if (this.f42055n == document) {
        } else {
            this.f42055n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            w9Var.l(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.k6.f21125a7, 0.3f), starGift);
        }
    }

    public long getGiftId() {
        return this.f42051a;
    }
}
