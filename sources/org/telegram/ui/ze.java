package org.telegram.ui;

import android.view.KeyEvent;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ze implements Runnable {
    public final int f43382a;
    public final Object f43383b;
    public final Object f43384c;
    public final Object d;
    public final Object f43385e;
    public final Object f43386f;
    public final Object h;
    public final Object f43387n;

    public ze(KeyEvent.Callback callback, Object obj, Object obj2, String str, Object obj3, TLObject tLObject, Object obj4, int i10) {
        this.f43382a = i10;
        this.f43383b = callback;
        this.d = obj;
        this.f43385e = obj2;
        this.f43384c = str;
        this.f43386f = obj3;
        this.h = tLObject;
        this.f43387n = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ze.run():void");
    }

    public ze(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f43382a = i10;
        this.f43383b = obj;
        this.d = obj2;
        this.f43385e = obj3;
        this.f43386f = obj4;
        this.f43384c = obj5;
        this.h = obj6;
        this.f43387n = obj7;
    }

    public ze(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.f43382a = i10;
        this.f43383b = obj;
        this.d = obj2;
        this.f43384c = str;
        this.f43385e = tLObject;
        this.f43386f = obj3;
        this.h = obj4;
        this.f43387n = obj5;
    }

    public ze(on onVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f43382a = 2;
        this.f43383b = onVar;
        this.d = b2Var;
        this.f43386f = tLObject;
        this.f43384c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.f43385e = messageObject;
        this.f43387n = tL_error;
    }

    public ze(co coVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, mg mgVar, String str, of.e eVar) {
        this.f43382a = 1;
        this.f43383b = coVar;
        this.d = tL_error;
        this.f43385e = tLObject;
        this.f43386f = tLObject2;
        this.h = mgVar;
        this.f43384c = str;
        this.f43387n = eVar;
    }
}
