package org.telegram.ui;

import android.view.KeyEvent;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ze implements Runnable {
    public final int f40090a;
    public final Object f40091b;
    public final Object f40092c;
    public final Object d;
    public final Object e;
    public final Object f40093f;
    public final Object h;
    public final Object f40094n;

    public ze(KeyEvent.Callback callback, Object obj, Object obj2, String str, Object obj3, TLObject tLObject, Object obj4, int i10) {
        this.f40090a = i10;
        this.f40091b = callback;
        this.d = obj;
        this.e = obj2;
        this.f40092c = str;
        this.f40093f = obj3;
        this.h = tLObject;
        this.f40094n = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ze.run():void");
    }

    public ze(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f40090a = i10;
        this.f40091b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f40093f = obj4;
        this.f40092c = obj5;
        this.h = obj6;
        this.f40094n = obj7;
    }

    public ze(Object obj, Object obj2, String str, TLObject tLObject, Object obj3, Object obj4, Object obj5, int i10) {
        this.f40090a = i10;
        this.f40091b = obj;
        this.d = obj2;
        this.f40092c = str;
        this.e = tLObject;
        this.f40093f = obj3;
        this.h = obj4;
        this.f40094n = obj5;
    }

    public ze(ln lnVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, MessageObject messageObject, TLRPC.TL_error tL_error) {
        this.f40090a = 2;
        this.f40091b = lnVar;
        this.d = b2Var;
        this.f40093f = tLObject;
        this.f40092c = hashSet;
        this.h = tL_inputGroupCallInviteMessage;
        this.e = messageObject;
        this.f40094n = tL_error;
    }

    public ze(zn znVar, TLRPC.TL_error tL_error, TLObject tLObject, TLObject tLObject2, kg kgVar, String str, nf.e eVar) {
        this.f40090a = 1;
        this.f40091b = znVar;
        this.d = tL_error;
        this.e = tLObject;
        this.f40093f = tLObject2;
        this.h = kgVar;
        this.f40092c = str;
        this.f40094n = eVar;
    }
}
