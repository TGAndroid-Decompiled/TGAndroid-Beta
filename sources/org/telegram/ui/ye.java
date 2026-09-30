package org.telegram.ui;

import android.view.KeyEvent;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ye implements Runnable {
    public final int f40237a;
    public final Object f40238b;
    public final Object f40239c;
    public final Object d;
    public final Object e;
    public final Object f40240f;
    public final Object h;
    public final Object f40241n;

    public ye(KeyEvent.Callback callback, Object obj, Object obj2, String str, Object obj3, TLObject tLObject, Object obj4, int i10) {
        this.f40237a = i10;
        this.f40238b = callback;
        this.d = obj;
        this.e = obj2;
        this.f40239c = str;
        this.f40240f = obj3;
        this.h = tLObject;
        this.f40241n = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ye.run():void");
    }

    public ye(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f40237a = i10;
        this.f40238b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f40240f = obj4;
        this.f40239c = obj5;
        this.h = obj6;
        this.f40241n = obj7;
    }

    public ye(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.f40237a = i10;
        this.f40238b = obj;
        this.d = obj2;
        this.f40239c = str;
        this.e = tLObject;
        this.f40240f = obj3;
        this.h = obj4;
        this.f40241n = obj5;
    }

    public ye(in inVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f40237a = 2;
        this.f40238b = inVar;
        this.d = a2Var;
        this.f40240f = tLObject;
        this.f40239c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.e = messageObject;
        this.f40241n = tL_error;
    }

    public ye(wn wnVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, hg hgVar, String str, nf.e eVar) {
        this.f40237a = 1;
        this.f40238b = wnVar;
        this.d = tL_error;
        this.e = tLObject;
        this.f40240f = tLObject2;
        this.h = hgVar;
        this.f40239c = str;
        this.f40241n = eVar;
    }
}
