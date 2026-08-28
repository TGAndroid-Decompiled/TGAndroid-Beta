package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class x91 implements Utilities.Callback5, Utilities.Callback5Return {
    public final StickersActivity f44440a;

    public x91(StickersActivity stickersActivity) {
        this.f44440a = stickersActivity;
    }

    @Override
    public void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        StickersActivity.T(this.f44440a, (org.telegram.ui.Components.l41) obj, (View) obj2);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z10;
        org.telegram.ui.Components.l41 l41Var = (org.telegram.ui.Components.l41) obj;
        View view = (View) obj2;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        StickersActivity stickersActivity = this.f44440a;
        if (stickersActivity.f36195x.isEmpty() && (l41Var.G instanceof TLRPC.TL_messages_stickerSet)) {
            stickersActivity.m0((org.telegram.ui.Cells.k8) view);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
