package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_keyboard;
public final class wf implements View.OnLongClickListener {
    public final int f44115a;
    public final Object f44116b;
    public final Object f44117c;
    public final Object d;
    public final Object f44118e;

    public wf(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f44115a = i9;
        this.f44116b = obj;
        this.f44117c = obj2;
        this.d = obj3;
        this.f44118e = obj4;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.f44115a) {
            case 0:
                qn qnVar = (qn) this.f44116b;
                TL_keyboard.KeyboardInlineButton keyboardInlineButton = (TL_keyboard.KeyboardInlineButton) this.f44117c;
                MessageObject messageObject = (MessageObject) this.d;
                bg.t tVar = (bg.t) this.f44118e;
                TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) gf.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrl.class);
                if (qnVar.getParentActivity() == null) {
                    return false;
                }
                if ((qnVar.K0.getVisibility() == 0 && tL_inlineButtonTypeUrl == null && !gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) && !gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class) && !gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeGame.class) && !gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeBuy.class) && !gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) && !gf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) || tL_inlineButtonTypeUrl == null) {
                    return false;
                }
                qnVar.Z9(null, tL_inlineButtonTypeUrl.url, true, null, messageObject);
                try {
                    tVar.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            default:
                return org.telegram.ui.Components.ki.q((org.telegram.ui.Components.ki) this.f44116b, (Context) this.f44117c, (org.telegram.ui.ActionBar.b6) this.d, (org.telegram.ui.ActionBar.o2) this.f44118e, view);
        }
    }
}
