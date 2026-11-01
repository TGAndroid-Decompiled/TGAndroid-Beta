package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
public final class x61 implements org.telegram.messenger.p20, org.telegram.messenger.q20 {
    public final StickersActivity f43274a;

    public x61(StickersActivity stickersActivity) {
        this.f43274a = stickersActivity;
    }

    @Override
    public Boolean a(org.telegram.ui.Components.b51 b51Var, View view, Integer num, Float f7, Float f10) {
        boolean z10;
        StickersActivity stickersActivity = this.f43274a;
        if (stickersActivity.f34061x.isEmpty() && (b51Var.G instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.s0((org.telegram.ui.Cells.k8) view);
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
        StickersActivity.Z(this.f43274a, (org.telegram.ui.Components.b51) obj, (View) obj2);
    }
}
