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
public final class qt extends org.telegram.ui.Components.ul0 {
    public final ArrayList f36132c;
    public final tt d;

    public qt(tt ttVar, ArrayList arrayList) {
        this.d = ttVar;
        this.f36132c = arrayList;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f36132c.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        st stVar = (st) c1Var.f41610a;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) this.f36132c.get(i10);
        org.telegram.ui.ActionBar.l5 l5Var = stVar.f36751b;
        org.telegram.ui.Components.w9 w9Var = stVar.f36750a;
        stVar.d = stickerSetCovered;
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            l5Var.l(LocaleController.getString(R.string.NewStickerPack), false);
            w9Var.setImageResource(R.drawable.msg_addbot);
            return;
        }
        l5Var.l(stickerSetCovered.set.title, false);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(stickerSetCovered.cover, org.telegram.ui.ActionBar.j6.f17872a7, 1.0f, 1.0f, stVar.f36752c);
            if (svgThumb != null) {
                if (closestPhotoSizeWithSize != null) {
                    w9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
                    return;
                } else {
                    w9Var.i(ImageLocation.getForDocument(stickerSetCovered.cover), null, "webp", svgThumb, stickerSetCovered);
                    return;
                }
            }
            w9Var.i(ImageLocation.getForDocument(closestPhotoSizeWithSize, stickerSetCovered.cover), null, "webp", null, stickerSetCovered);
            return;
        }
        w9Var.l(null, null, null, null, null, 0);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        st stVar = new st(viewGroup.getContext(), this.d.f37018c0);
        stVar.setLayoutParams(new s4.p0(-2, AndroidUtilities.dp(48.0f)));
        return new s4.c1(stVar);
    }
}
