package org.telegram.ui;

import android.view.KeyEvent;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ze implements Runnable {
    public final int f40187a;
    public final Object f40188b;
    public final Object f40189c;
    public final Object d;
    public final Object e;
    public final Object f40190f;
    public final Object h;
    public final Object f40191n;

    public ze(KeyEvent.Callback callback, Object obj, Object obj2, String str, Object obj3, TLObject tLObject, Object obj4, int i10) {
        this.f40187a = i10;
        this.f40188b = callback;
        this.d = obj;
        this.e = obj2;
        this.f40189c = str;
        this.f40190f = obj3;
        this.h = tLObject;
        this.f40191n = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ze.run():void");
    }

    public ze(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f40187a = i10;
        this.f40188b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f40190f = obj4;
        this.f40189c = obj5;
        this.h = obj6;
        this.f40191n = obj7;
    }

    public ze(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.f40187a = i10;
        this.f40188b = obj;
        this.d = obj2;
        this.f40189c = str;
        this.e = tLObject;
        this.f40190f = obj3;
        this.h = obj4;
        this.f40191n = obj5;
    }

    public ze(ln lnVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f40187a = 2;
        this.f40188b = lnVar;
        this.d = b2Var;
        this.f40190f = tLObject;
        this.f40189c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.e = messageObject;
        this.f40191n = tL_error;
    }

    public ze(zn znVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, kg kgVar, String str, nf.e eVar) {
        this.f40187a = 1;
        this.f40188b = znVar;
        this.d = tL_error;
        this.e = tLObject;
        this.f40190f = tLObject2;
        this.h = kgVar;
        this.f40189c = str;
        this.f40191n = eVar;
    }
}
