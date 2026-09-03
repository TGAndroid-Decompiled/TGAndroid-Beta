package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class vo0 extends FrameLayout {
    public long f42186a;
    public TL_stars.starGiftAttributeBackdrop f42187b;
    public TL_stars.starGiftAttributePattern f42188c;
    public final FrameLayout d;
    public final lh.u1 f42189e;
    public final org.telegram.ui.Components.p9 f42190f;
    public final lh.y1 h;
    public TLRPC.Document f42191n;

    public vo0(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        lh.u1 u1Var = new lh.u1(frameLayout, g6Var, false);
        this.f42189e = u1Var;
        frameLayout.setBackground(u1Var);
        addView(frameLayout, k7.c6.e(-1, -1, 119));
        k7.e6.b(frameLayout, 0.025f, 1.25f);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f42190f = p9Var;
        frameLayout.addView(p9Var, k7.c6.d(80, 80.0f, 17, 0.0f, 12.0f, 0.0f, 12.0f));
        if (z4) {
            lh.y1 y1Var = new lh.y1(context);
            this.h = y1Var;
            addView(y1Var, k7.c6.d(-2, -2.0f, 53, 0.0f, 2.0f, 1.0f, 0.0f));
            return;
        }
        this.h = null;
    }

    public final void a(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i11;
        int i12;
        this.f42186a = tL_starGiftUnique.f21072id;
        boolean z4 = true;
        if (i10 % 3 != 1) {
            z4 = false;
        }
        if (z4) {
            i11 = AndroidUtilities.dp(4.0f);
        } else {
            i11 = 0;
        }
        if (z4) {
            i12 = AndroidUtilities.dp(4.0f);
        } else {
            i12 = 0;
        }
        setPadding(i11, 0, i12, 0);
        c(tL_starGiftUnique.getDocument(), tL_starGiftUnique);
        this.f42187b = (TL_stars.starGiftAttributeBackdrop) mh.t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        this.f42188c = (TL_stars.starGiftAttributePattern) mh.t7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = this.f42187b;
        lh.u1 u1Var = this.f42189e;
        u1Var.d(stargiftattributebackdrop);
        u1Var.e(this.f42188c);
    }

    public final void b(boolean z4, boolean z10) {
        float f10;
        this.f42189e.f(z4, z10);
        if (z4) {
            f10 = 0.9f;
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.p9 p9Var = this.f42190f;
        if (z10) {
            p9Var.animate().scaleX(f10).scaleY(f10).start();
            return;
        }
        p9Var.animate().cancel();
        p9Var.setScaleX(f10);
        p9Var.setScaleY(f10);
    }

    public final void c(TLRPC.Document document, TL_stars.StarGift starGift) {
        org.telegram.ui.Components.p9 p9Var = this.f42190f;
        if (document == null) {
            p9Var.b();
            this.f42191n = null;
        } else if (this.f42191n == document) {
        } else {
            this.f42191n = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            p9Var.l(ImageLocation.getForDocument(document), "100_100", ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "100_100", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.k6.f21607a7, 0.3f), starGift);
        }
    }

    public long getGiftId() {
        return this.f42186a;
    }
}
