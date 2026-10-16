package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
public final class ut extends org.telegram.ui.Components.lm0 {
    public final ArrayList f40476c;
    public final xt d;

    public ut(xt xtVar, ArrayList arrayList) {
        this.d = xtVar;
        this.f40476c = arrayList;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f40476c.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        wt wtVar = (wt) b1Var.f44838a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f40476c.get(i10);
        org.telegram.ui.ActionBar.h5 h5Var = wtVar.f41357b;
        org.telegram.ui.Components.z9 z9Var = wtVar.f41356a;
        wtVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            h5Var.l(LocaleController.getString(R.string.NewStickerPack), false);
            z9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        h5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, org.telegram.ui.ActionBar.g6.f19543a7, 1.0f, 1.0f, wtVar.f41358c);
            if (svgThumb != null) {
                if (closestPhotoSizeWithSize != null) {
                    z9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
                    return;
                } else {
                    z9Var.i(ImageLocation.getForDocument(stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
                    return;
                }
            }
            z9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
            return;
        }
        z9Var.l(null, null, null, null, null, 0);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        wt wtVar = new wt(viewGroup.getContext(), this.d.f41639c0);
        wtVar.setLayoutParams(new s4.o0(-2, AndroidUtilities.dp(48.0f)));
        return new s4.b1(wtVar);
    }
}
