package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vf implements View.OnClickListener {
    public final int f42718a;
    public final int f42719b;
    public final Object f42720c;
    public final Object d;
    public final Object e;
    public final Object f42721f;
    public final Object h;

    public vf(int i10, org.telegram.ui.ActionBar.z2 z2Var, org.telegram.ui.ActionBar.p6 p6Var, LinearLayout linearLayout, long[] jArr, i2.g1 g1Var) {
        this.f42718a = 5;
        this.f42719b = i10;
        this.f42720c = z2Var;
        this.e = p6Var;
        this.d = linearLayout;
        this.f42721f = jArr;
        this.h = g1Var;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        boolean z10;
        int i10 = this.f42718a;
        int i11 = this.f42719b;
        Object obj = this.h;
        Object obj2 = this.f42721f;
        Object obj3 = this.d;
        Object obj4 = this.e;
        Object obj5 = this.f42720c;
        switch (i10) {
            case 0:
                z4.g gVar = (z4.g) obj5;
                LinearLayout linearLayout = (LinearLayout) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj4;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                org.telegram.ui.Components.wi0 wi0Var = (org.telegram.ui.Components.wi0) obj;
                int currentItem = gVar.getCurrentItem();
                if (i11 != currentItem) {
                    org.telegram.ui.Components.wi0 wi0Var2 = (org.telegram.ui.Components.wi0) linearLayout.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    gVar.x(i11, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = wi0Var.getX() - ((horizontalScrollView.getWidth() - wi0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(org.telegram.ui.Components.gr.f26495f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, wi0Var2, wi0Var));
                    duration.start();
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Components.ac0 ac0Var = (org.telegram.ui.Components.ac0) obj4;
                l2.f fVar = (l2.f) obj2;
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((org.telegram.ui.Components.ac0) obj5).getValue();
                tL_birthday.month = ((org.telegram.ui.Components.ac0) obj3).getValue() + 1;
                if (ac0Var.getValue() != i11) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = ac0Var.getValue();
                }
                ((org.telegram.ui.ActionBar.z2) fVar.f11587b).f21621x0.run();
                q20Var.a(tL_birthday);
                return;
            case 2:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj3, (th.b) obj4);
                String L0 = org.telegram.messenger.cd.L0(2131748808, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.cd.L0(2131748809, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746041, null), new mg.i0((org.telegram.ui.Components.cr) obj5, (vh.d) obj2, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.f42719b, 3));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                return;
            case 3:
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj3;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                Context context = (Context) obj;
                org.telegram.ui.Components.z60 F = org.telegram.ui.Components.z60.F(((org.telegram.ui.Wallet.z2[]) obj5)[0].f21589c, p6Var, (ImageView) obj4);
                if (!TextUtils.isEmpty(wallettransactionArr[0].tx_hash)) {
                    F.c(2131232353, org.telegram.messenger.cd.L0(2131742989, null), new org.telegram.ui.Wallet.x0(context, i11, wallettransactionArr, 2), false);
                }
                F.c(2131232817, org.telegram.messenger.cd.L0(2131742987, null), new org.telegram.ui.Components.cs(1, context, p6Var), false);
                F.a0(0.0f, -org.telegram.messenger.i0.L(48.0f));
                F.Z();
                return;
            case 4:
                vh.d dVar = (vh.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj3;
                ?? r11 = (org.telegram.ui.ActionBar.z2[]) obj4;
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.f20022id;
                    int i12 = this.f42719b;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_changeStarsSubscription, new q8(dVar, (Serializable) r11, i12, tLObject, str, 12));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj5;
                org.telegram.ui.ActionBar.p6 p6Var2 = (org.telegram.ui.ActionBar.p6) obj4;
                LinearLayout linearLayout2 = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                i2.g1 g1Var = (i2.g1) obj;
                rh.r g10 = rh.r.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f47389j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f47391l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, org.telegram.messenger.d20.i(i11).f());
                org.telegram.ui.Components.z60 F2 = org.telegram.ui.Components.z60.F(z2Var.f21586b, p6Var2, linearLayout2);
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj6 = arrayList.get(i13);
                    i13++;
                    TLObject tLObject2 = (TLObject) obj6;
                    if (tLObject2 instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject2).f19942id;
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (org.telegram.messenger.w3.V(chat)) {
                            j10 = -chat.f19793id;
                        }
                    }
                    long j11 = j10;
                    if (j11 == jArr[0]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F2.g(tLObject2, z10, new th.p5(jArr, j11, g1Var, 4));
                }
                F2.f32942t = false;
                F2.f32941s = 0;
                F2.V(5);
                F2.a0(org.telegram.messenger.i0.L(24.0f), 0.0f);
                F2.Z();
                return;
        }
    }

    public vf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10, int i11) {
        this.f42718a = i11;
        this.f42720c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f42721f = obj4;
        this.h = obj5;
        this.f42719b = i10;
    }

    public vf(org.telegram.ui.Components.ac0 ac0Var, org.telegram.ui.Components.ac0 ac0Var2, org.telegram.ui.Components.ac0 ac0Var3, int i10, l2.f fVar, org.telegram.messenger.q20 q20Var) {
        this.f42718a = 1;
        this.f42720c = ac0Var;
        this.d = ac0Var2;
        this.e = ac0Var3;
        this.f42719b = i10;
        this.f42721f = fVar;
        this.h = q20Var;
    }

    public vf(vh.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.z2[] z2VarArr, TLObject tLObject, String str) {
        this.f42718a = 4;
        this.f42720c = dVar;
        this.d = starsSubscription;
        this.f42719b = i10;
        this.e = z2VarArr;
        this.f42721f = tLObject;
        this.h = str;
    }

    public vf(z4.g gVar, int i10, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, org.telegram.ui.Components.wi0 wi0Var) {
        this.f42718a = 0;
        this.f42720c = gVar;
        this.f42719b = i10;
        this.d = linearLayout;
        this.e = atomicBoolean;
        this.f42721f = horizontalScrollView;
        this.h = wi0Var;
    }
}
