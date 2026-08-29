package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;
public final class tf implements View.OnLongClickListener {
    public final int f42686a;
    public final Object f42687b;
    public final Object f42688c;
    public final Object d;
    public final Object f42689e;

    public tf(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f42686a = i10;
        this.f42687b = obj;
        this.f42688c = obj2;
        this.d = obj3;
        this.f42689e = obj4;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f42686a) {
            case 0:
                tn tnVar = (tn) this.f42687b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.f42688c;
                MessageObject messageObject = (MessageObject) this.d;
                eg.r rVar = (eg.r) this.f42689e;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) kf.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (tnVar.getParentActivity() == null) {
                    return false;
                }
                if ((tnVar.K0.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !kf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                tnVar.Z9(null, tL_inlineButtonTypeUrl.url, true, null, messageObject);
                try {
                    rVar.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                return org.telegram.ui.Components.ni.q((org.telegram.ui.Components.ni) this.f42687b, (Context) this.f42688c, (org.telegram.ui.ActionBar.c6) this.d, (org.telegram.ui.ActionBar.o2) this.f42689e, view);
        }
    }
}
