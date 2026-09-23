package org.telegram.ui;

import android.view.KeyEvent;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ye implements Runnable {
    public final int f39801a;
    public final Object f39802b;
    public final Object f39803c;
    public final Object d;
    public final Object e;
    public final Object f39804f;
    public final Object h;
    public final Object f39805n;

    public ye(KeyEvent.Callback callback, Object obj, Object obj2, String str, Object obj3, TLObject tLObject, Object obj4, int i10) {
        this.f39801a = i10;
        this.f39802b = callback;
        this.d = obj;
        this.e = obj2;
        this.f39803c = str;
        this.f39804f = obj3;
        this.h = tLObject;
        this.f39805n = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ye.run():void");
    }

    public ye(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f39801a = i10;
        this.f39802b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f39804f = obj4;
        this.f39803c = obj5;
        this.h = obj6;
        this.f39805n = obj7;
    }

    public ye(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.f39801a = i10;
        this.f39802b = obj;
        this.d = obj2;
        this.f39803c = str;
        this.e = tLObject;
        this.f39804f = obj3;
        this.h = obj4;
        this.f39805n = obj5;
    }

    public ye(jn jnVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f39801a = 2;
        this.f39802b = jnVar;
        this.d = b2Var;
        this.f39804f = tLObject;
        this.f39803c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.e = messageObject;
        this.f39805n = tL_error;
    }

    public ye(xn xnVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, kg kgVar, String str, nf.e eVar) {
        this.f39801a = 1;
        this.f39802b = xnVar;
        this.d = tL_error;
        this.e = tLObject;
        this.f39804f = tLObject2;
        this.h = kgVar;
        this.f39803c = str;
        this.f39805n = eVar;
    }
}
