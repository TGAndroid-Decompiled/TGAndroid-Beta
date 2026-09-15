package org.telegram.ui;

import android.view.KeyEvent;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ye implements Runnable {
    public final int f39851a;
    public final Object f39852b;
    public final Object f39853c;
    public final Object d;
    public final Object e;
    public final Object f39854f;
    public final Object h;
    public final Object f39855n;

    public ye(KeyEvent.Callback callback, Object obj, Object obj2, String str, Object obj3, TLObject tLObject, Object obj4, int i10) {
        this.f39851a = i10;
        this.f39852b = callback;
        this.d = obj;
        this.e = obj2;
        this.f39853c = str;
        this.f39854f = obj3;
        this.h = tLObject;
        this.f39855n = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ye.run():void");
    }

    public ye(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f39851a = i10;
        this.f39852b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f39854f = obj4;
        this.f39853c = obj5;
        this.h = obj6;
        this.f39855n = obj7;
    }

    public ye(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.f39851a = i10;
        this.f39852b = obj;
        this.d = obj2;
        this.f39853c = str;
        this.e = tLObject;
        this.f39854f = obj3;
        this.h = obj4;
        this.f39855n = obj5;
    }

    public ye(nn nnVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f39851a = 2;
        this.f39852b = nnVar;
        this.d = b2Var;
        this.f39854f = tLObject;
        this.f39853c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.e = messageObject;
        this.f39855n = tL_error;
    }

    public ye(bo boVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, mg mgVar, String str, nf.e eVar) {
        this.f39851a = 1;
        this.f39852b = boVar;
        this.d = tL_error;
        this.e = tLObject;
        this.f39854f = tLObject2;
        this.h = mgVar;
        this.f39853c = str;
        this.f39855n = eVar;
    }
}
