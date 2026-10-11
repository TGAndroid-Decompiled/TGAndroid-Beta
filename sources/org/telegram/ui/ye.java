package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ye implements Runnable {
    public final int f44363a;
    public final Object f44364b;
    public final Object f44365c;
    public final Object d;
    public final Object f44366e;
    public final Object f44367f;
    public final Object h;
    public final Object f44368n;

    public ye(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f44363a = i10;
        this.f44364b = obj;
        this.d = obj2;
        this.f44366e = obj3;
        this.f44367f = obj4;
        this.f44365c = obj5;
        this.h = obj6;
        this.f44368n = obj7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ye.run():void");
    }

    public ye(Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, Object obj6, int i10) {
        this.f44363a = i10;
        this.f44364b = obj;
        this.d = obj2;
        this.f44366e = obj3;
        this.f44365c = str;
        this.f44367f = obj4;
        this.h = obj5;
        this.f44368n = obj6;
    }

    public ye(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.f44363a = i10;
        this.f44364b = obj;
        this.d = obj2;
        this.f44365c = str;
        this.f44366e = tLObject;
        this.f44367f = obj3;
        this.h = obj4;
        this.f44368n = obj5;
    }

    public ye(ln lnVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f44363a = 2;
        this.f44364b = lnVar;
        this.d = a2Var;
        this.f44367f = tLObject;
        this.f44365c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.f44366e = messageObject;
        this.f44368n = tL_error;
    }

    public ye(zn znVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, cf cfVar, String str, of.e eVar) {
        this.f44363a = 1;
        this.f44364b = znVar;
        this.d = tL_error;
        this.f44366e = tLObject;
        this.f44367f = tLObject2;
        this.h = cfVar;
        this.f44365c = str;
        this.f44368n = eVar;
    }
}
