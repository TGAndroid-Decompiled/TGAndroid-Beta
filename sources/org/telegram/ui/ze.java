package org.telegram.ui;

import android.view.KeyEvent;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ze implements Runnable {
    public final int f43410a;
    public final Object f43411b;
    public final Object f43412c;
    public final Object d;
    public final Object f43413e;
    public final Object f43414f;
    public final Object h;
    public final Object f43415n;

    public ze(KeyEvent.Callback callback, Object obj, Object obj2, String str, Object obj3, TLObject tLObject, Object obj4, int i10) {
        this.f43410a = i10;
        this.f43411b = callback;
        this.d = obj;
        this.f43413e = obj2;
        this.f43412c = str;
        this.f43414f = obj3;
        this.h = tLObject;
        this.f43415n = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ze.run():void");
    }

    public ze(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f43410a = i10;
        this.f43411b = obj;
        this.d = obj2;
        this.f43413e = obj3;
        this.f43414f = obj4;
        this.f43412c = obj5;
        this.h = obj6;
        this.f43415n = obj7;
    }

    public ze(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.f43410a = i10;
        this.f43411b = obj;
        this.d = obj2;
        this.f43412c = str;
        this.f43413e = tLObject;
        this.f43414f = obj3;
        this.h = obj4;
        this.f43415n = obj5;
    }

    public ze(on onVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f43410a = 2;
        this.f43411b = onVar;
        this.d = b2Var;
        this.f43414f = tLObject;
        this.f43412c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.f43413e = messageObject;
        this.f43415n = tL_error;
    }

    public ze(co coVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, mg mgVar, String str, of.e eVar) {
        this.f43410a = 1;
        this.f43411b = coVar;
        this.d = tL_error;
        this.f43413e = tLObject;
        this.f43414f = tLObject2;
        this.h = mgVar;
        this.f43412c = str;
        this.f43415n = eVar;
    }
}
