package org.telegram.ui;

import android.view.KeyEvent;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ze implements Runnable {
    public final int f43383a;
    public final Object f43384b;
    public final Object f43385c;
    public final Object d;
    public final Object f43386e;
    public final Object f43387f;
    public final Object h;
    public final Object f43388n;

    public ze(KeyEvent.Callback callback, Object obj, Object obj2, String str, Object obj3, TLObject tLObject, Object obj4, int i10) {
        this.f43383a = i10;
        this.f43384b = callback;
        this.d = obj;
        this.f43386e = obj2;
        this.f43385c = str;
        this.f43387f = obj3;
        this.h = tLObject;
        this.f43388n = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ze.run():void");
    }

    public ze(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f43383a = i10;
        this.f43384b = obj;
        this.d = obj2;
        this.f43386e = obj3;
        this.f43387f = obj4;
        this.f43385c = obj5;
        this.h = obj6;
        this.f43388n = obj7;
    }

    public ze(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.f43383a = i10;
        this.f43384b = obj;
        this.d = obj2;
        this.f43385c = str;
        this.f43386e = tLObject;
        this.f43387f = obj3;
        this.h = obj4;
        this.f43388n = obj5;
    }

    public ze(on onVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f43383a = 2;
        this.f43384b = onVar;
        this.d = b2Var;
        this.f43387f = tLObject;
        this.f43385c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.f43386e = messageObject;
        this.f43388n = tL_error;
    }

    public ze(co coVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, mg mgVar, String str, of.e eVar) {
        this.f43383a = 1;
        this.f43384b = coVar;
        this.d = tL_error;
        this.f43386e = tLObject;
        this.f43387f = tLObject2;
        this.h = mgVar;
        this.f43385c = str;
        this.f43388n = eVar;
    }
}
