package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ye implements Runnable {
    public final int f44329a;
    public final Object f44330b;
    public final Object f44331c;
    public final Object d;
    public final Object f44332e;
    public final Object f44333f;
    public final Object h;
    public final Object f44334n;

    public ye(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f44329a = i10;
        this.f44330b = obj;
        this.d = obj2;
        this.f44332e = obj3;
        this.f44333f = obj4;
        this.f44331c = obj5;
        this.h = obj6;
        this.f44334n = obj7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ye.run():void");
    }

    public ye(Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, Object obj6, int i10) {
        this.f44329a = i10;
        this.f44330b = obj;
        this.d = obj2;
        this.f44332e = obj3;
        this.f44331c = str;
        this.f44333f = obj4;
        this.h = obj5;
        this.f44334n = obj6;
    }

    public ye(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.f44329a = i10;
        this.f44330b = obj;
        this.d = obj2;
        this.f44331c = str;
        this.f44332e = tLObject;
        this.f44333f = obj3;
        this.h = obj4;
        this.f44334n = obj5;
    }

    public ye(ln lnVar, org.telegram.ui.ActionBar.a2 a2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f44329a = 2;
        this.f44330b = lnVar;
        this.d = a2Var;
        this.f44333f = tLObject;
        this.f44331c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.f44332e = messageObject;
        this.f44334n = tL_error;
    }

    public ye(zn znVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, cf cfVar, String str, of.e eVar) {
        this.f44329a = 1;
        this.f44330b = znVar;
        this.d = tL_error;
        this.f44332e = tLObject;
        this.f44333f = tLObject2;
        this.h = cfVar;
        this.f44331c = str;
        this.f44334n = eVar;
    }
}
