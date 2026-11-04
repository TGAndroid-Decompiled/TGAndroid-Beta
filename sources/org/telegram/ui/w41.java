package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class w41 implements org.telegram.messenger.s10, org.telegram.messenger.t10 {
    public final StickersActivity f50707a;

    public w41(StickersActivity stickersActivity) {
        this.f50707a = stickersActivity;
    }

    @Override
    public Boolean a(org.telegram.ui.Components.r31 r31Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        StickersActivity stickersActivity = this.f50707a;
        if (stickersActivity.f42006x.isEmpty() && (r31Var.G instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.s0((org.telegram.ui.Cells.f8) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        StickersActivity.Z(this.f50707a, (org.telegram.ui.Components.r31) obj, (View) obj2);
    }
}
