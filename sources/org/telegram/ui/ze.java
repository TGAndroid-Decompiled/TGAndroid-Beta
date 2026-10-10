package org.telegram.ui;

import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ze implements Runnable {
    public final int f44603a;
    public final Object f44604b;
    public final Object f44605c;
    public final Object d;
    public final Object f44606e;
    public final Object f44607f;
    public final Object h;
    public final Object f44608n;

    public ze(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f44603a = i10;
        this.f44604b = obj;
        this.d = obj2;
        this.f44606e = obj3;
        this.f44607f = obj4;
        this.f44605c = obj5;
        this.h = obj6;
        this.f44608n = obj7;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ze.run():void");
    }

    public ze(Object obj, Object obj2, Object obj3, String str, Object obj4, Object obj5, Object obj6, int i10) {
        this.f44603a = i10;
        this.f44604b = obj;
        this.d = obj2;
        this.f44606e = obj3;
        this.f44605c = str;
        this.f44607f = obj4;
        this.h = obj5;
        this.f44608n = obj6;
    }

    public ze(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.f44603a = i10;
        this.f44604b = obj;
        this.d = obj2;
        this.f44605c = str;
        this.f44606e = tLObject;
        this.f44607f = obj3;
        this.h = obj4;
        this.f44608n = obj5;
    }

    public ze(ln lnVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f44603a = 2;
        this.f44604b = lnVar;
        this.d = b2Var;
        this.f44607f = tLObject;
        this.f44605c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.f44606e = messageObject;
        this.f44608n = tL_error;
    }

    public ze(zn znVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, df dfVar, String str, of.e eVar) {
        this.f44603a = 1;
        this.f44604b = znVar;
        this.d = tL_error;
        this.f44606e = tLObject;
        this.f44607f = tLObject2;
        this.h = dfVar;
        this.f44605c = str;
        this.f44608n = eVar;
    }
}
