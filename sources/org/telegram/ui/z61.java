package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class z61 implements org.telegram.messenger.o20, org.telegram.messenger.p20 {
    public final StickersActivity f44036a;

    public z61(StickersActivity stickersActivity) {
        this.f44036a = stickersActivity;
    }

    @Override
    public Boolean a(org.telegram.ui.Components.a51 a51Var, View view, Integer num, Float f7, Float f10) {
        boolean z10;
        StickersActivity stickersActivity = this.f44036a;
        if (stickersActivity.f34054x.isEmpty() && (a51Var.G instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.r0((org.telegram.ui.Cells.k8) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        StickersActivity.Y(this.f44036a, (org.telegram.ui.Components.a51) obj, (View) obj2);
    }
}
