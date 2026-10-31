package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class v8 implements Runnable {
    public final int f42675a;
    public final Object f42676b;
    public final Object f42677c;
    public final Object d;
    public final Object e;
    public final Object f42678f;
    public final Object h;

    public v8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f42675a = i10;
        this.f42676b = obj;
        this.f42677c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f42678f = obj5;
        this.h = obj6;
    }

    private final void a() {
        rh.e6 e6Var = (rh.e6) this.f42676b;
        Runnable runnable = (Runnable) this.f42677c;
        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) this.d;
        TLRPC.InputInvoice inputInvoice = (TLRPC.InputInvoice) this.e;
        TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) this.f42678f;
        org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) this.h;
        if (!e6Var.e) {
            rh.e6.e("NO_BALANCE");
            runnable.run();
            return;
        }
        e6Var.X(jjVar, inputInvoice, tL_payments_paymentFormStars, runnable, q20Var);
    }

    private final void b() {
        char c10;
        org.telegram.ui.ActionBar.k2 T;
        rh.u5 u5Var = (rh.u5) this.f42677c;
        TLObject tLObject = (TLObject) this.f42676b;
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
        rh.v5 v5Var = (rh.v5) this.e;
        org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) this.f42678f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
        long j10 = u5Var.f47546b;
        int i10 = u5Var.f47545a;
        HashMap hashMap = u5Var.h;
        ArrayList arrayList = u5Var.e;
        u5Var.f47552k = false;
        boolean z10 = tLObject instanceof TL_stars.TL_starGiftCollection;
        int i11 = org.telegram.messenger.zs.H3;
        if (z10) {
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject;
            arrayList.remove(tL_starGiftCollection);
            arrayList.add(tL_starGiftCollection2);
            hashMap.remove(-1);
            int i12 = tL_starGiftCollection2.collection_id;
            v5Var.d = i12;
            hashMap.put(Integer.valueOf(i12), v5Var);
            u5Var.j();
            org.telegram.messenger.zs.f(i10).k(i11, Long.valueOf(j10), u5Var);
            q20Var.a(tL_starGiftCollection2);
            return;
        }
        if (tL_error != null && (T = LaunchActivity.T()) != null) {
            c10 = 0;
            org.telegram.ui.Components.cc.a0(T).f0(tL_error, false);
        } else {
            c10 = 0;
        }
        arrayList.remove(tL_starGiftCollection);
        hashMap.remove(-1);
        u5Var.j();
        org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(i10);
        Object[] objArr = new Object[2];
        objArr[c10] = Long.valueOf(j10);
        objArr[1] = u5Var;
        f7.k(i11, objArr);
    }

    private final void c() {
        th.x4 x4Var = (th.x4) this.f42676b;
        ArrayList arrayList = (ArrayList) this.f42677c;
        HashSet hashSet = (HashSet) this.h;
        StringBuilder sb2 = new StringBuilder("StoriesList ");
        sb2.append(x4Var.e);
        sb2.append("{");
        sb2.append(x4Var.d);
        sb2.append("} preloadCache {");
        sb2.append(th.e5.a(arrayList));
        a1.g.z("}", sb2);
        ArrayList arrayList2 = x4Var.f49635g;
        arrayList2.clear();
        arrayList2.addAll((ArrayList) this.d);
        x4Var.f49647t = false;
        int i10 = x4Var.f49633c;
        org.telegram.messenger.vp.r1(i10).V3((ArrayList) this.e, true);
        org.telegram.messenger.vp.r1(i10).P3((ArrayList) this.f42678f, true);
        if (x4Var.v) {
            x4Var.v = false;
            x4Var.f49651y = null;
            x4Var.j();
            return;
        }
        x4Var.f49640m.addAll(hashSet);
        x4Var.f49638k.clear();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            x4Var.t((org.telegram.messenger.jj) arrayList.get(i11), true);
        }
        x4Var.d(false);
        th.w4 w4Var = x4Var.f49651y;
        if (w4Var != null) {
            w4Var.a(0);
            x4Var.f49651y = null;
        }
        org.telegram.messenger.zs.f(i10).k(org.telegram.messenger.zs.f19723x5, x4Var);
    }

    private final void d() {
        TLObject tLObject = (TLObject) this.f42676b;
        org.telegram.messenger.vp vpVar = (org.telegram.messenger.vp) this.d;
        TLRPC.User[] userArr = (TLRPC.User[]) this.e;
        vh.h9 h9Var = (vh.h9) this.f42678f;
        org.telegram.ui.Components.ll llVar = (org.telegram.ui.Components.ll) this.h;
        ((int[]) this.f42677c)[0] = 0;
        if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            vpVar.V3(tL_contacts_resolvedPeer.users, false);
            vpVar.P3(tL_contacts_resolvedPeer.chats, false);
            TLRPC.User Z1 = vpVar.Z1(Long.valueOf(org.telegram.messenger.o5.o(tL_contacts_resolvedPeer.peer)));
            userArr[0] = Z1;
            if (Z1 != null) {
                h9Var.run();
                return;
            }
        }
        llVar.a(null);
    }

    private final void f() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v8.f():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v8.run():void");
    }

    public v8(Object obj, TLObject tLObject, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f42675a = i10;
        this.f42677c = obj;
        this.f42676b = tLObject;
        this.d = obj2;
        this.e = obj3;
        this.f42678f = obj4;
        this.h = obj5;
    }

    public v8(TLObject tLObject, Context context, org.telegram.ui.ActionBar.p6 p6Var, Object obj, Object obj2, Runnable runnable, int i10) {
        this.f42675a = i10;
        this.f42676b = tLObject;
        this.f42677c = context;
        this.h = p6Var;
        this.d = obj;
        this.e = obj2;
        this.f42678f = runnable;
    }

    public v8(org.telegram.ui.ActionBar.k2 k2Var, Object obj, Object obj2, Object obj3, TLObject tLObject, Object obj4, int i10) {
        this.f42675a = i10;
        this.f42677c = k2Var;
        this.d = obj;
        this.e = obj2;
        this.f42678f = obj3;
        this.f42676b = tLObject;
        this.h = obj4;
    }

    public v8(ph.l1 l1Var, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, i2.g1 g1Var, org.telegram.messenger.q20 q20Var, TLRPC.TL_error tL_error) {
        this.f42675a = 17;
        this.f42677c = l1Var;
        this.d = x1Var;
        this.f42676b = tLObject;
        this.e = g1Var;
        this.f42678f = q20Var;
        this.h = tL_error;
    }

    public v8(zf.p0 p0Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, org.telegram.messenger.vp vpVar, org.telegram.messenger.hs hsVar) {
        this.f42675a = 28;
        this.f42677c = p0Var;
        this.d = str;
        this.e = tL_error;
        this.f42676b = tLObject;
        this.f42678f = vpVar;
        this.h = hsVar;
    }
}
