package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ze implements Runnable {
    public final int f44559a;
    public final Object f44560b;
    public final Object f44561c;
    public final Object d;
    public final Object f44562e;
    public final Object f44563f;
    public final Object h;
    public final Object f44564n;

    public ze(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f44559a = i10;
        this.f44560b = obj;
        this.d = obj2;
        this.f44562e = obj3;
        this.f44563f = obj4;
        this.f44561c = obj5;
        this.h = obj6;
        this.f44564n = obj7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ze.run():void");
    }

    public ze(Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, Object obj6, int i10) {
        this.f44559a = i10;
        this.f44560b = obj;
        this.d = obj2;
        this.f44562e = obj3;
        this.f44561c = str;
        this.f44563f = obj4;
        this.h = obj5;
        this.f44564n = obj6;
    }

    public ze(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.f44559a = i10;
        this.f44560b = obj;
        this.d = obj2;
        this.f44561c = str;
        this.f44562e = tLObject;
        this.f44563f = obj3;
        this.h = obj4;
        this.f44564n = obj5;
    }

    public ze(ln lnVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f44559a = 2;
        this.f44560b = lnVar;
        this.d = b2Var;
        this.f44563f = tLObject;
        this.f44561c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.f44562e = messageObject;
        this.f44564n = tL_error;
    }

    public ze(zn znVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, df dfVar, String str, of.e eVar) {
        this.f44559a = 1;
        this.f44560b = znVar;
        this.d = tL_error;
        this.f44562e = tLObject;
        this.f44563f = tLObject2;
        this.h = dfVar;
        this.f44561c = str;
        this.f44564n = eVar;
    }
}
