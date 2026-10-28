package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;
public final class zf implements View.OnLongClickListener {
    public final int f46255a;
    public final Object f46256b;
    public final Object f46257c;
    public final Object d;
    public final Object e;

    public zf(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f46255a = i10;
        this.f46256b = obj;
        this.f46257c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f46255a) {
            case 0:
                wn wnVar = (wn) this.f46256b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.f46257c;
                MessageObject messageObject = (MessageObject) this.d;
                ln lnVar = (ln) this.e;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) bg.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (wnVar.getParentActivity() == null) {
                    return false;
                }
                if ((wnVar.f45046a1.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !bg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                wnVar.ma(null, tL_inlineButtonTypeUrl.url, true, null, messageObject);
                try {
                    lnVar.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                return org.telegram.ui.Components.ti.x((org.telegram.ui.Components.ti) this.f46256b, (Context) this.f46257c, (org.telegram.ui.ActionBar.u6) this.d, (org.telegram.ui.ActionBar.r2) this.e, view);
        }
    }
}
