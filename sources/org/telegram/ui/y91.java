package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class y91 implements Utilities.Callback5, Utilities.Callback5Return {
    public final StickersActivity f44821a;

    public y91(StickersActivity stickersActivity) {
        this.f44821a = stickersActivity;
    }

    @Override
    public void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        StickersActivity.U(this.f44821a, (org.telegram.ui.Components.w41) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        org.telegram.ui.Components.w41 w41Var = (org.telegram.ui.Components.w41) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        StickersActivity stickersActivity = this.f44821a;
        if (stickersActivity.f36260x.isEmpty() && (w41Var.G instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.n0((org.telegram.ui.Cells.i8) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
