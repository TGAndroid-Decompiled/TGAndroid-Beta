package rh;

import android.content.Context;
import android.os.Process;
import android.os.StrictMode;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.jo;
import org.telegram.ui.un;
public final class o implements Runnable {
    public final int f47269a;
    public final Object f47270b;
    public final Object f47271c;

    public o(int i10, Object obj, Object obj2) {
        this.f47269a = i10;
        this.f47270b = obj;
        this.f47271c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        boolean z10;
        String str;
        cc a02;
        int i11;
        String str2;
        boolean z11;
        String a03;
        TLRPC.Chat L0;
        jj messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        boolean z12;
        TLRPC.TL_messageReactions tL_messageReactions2;
        org.telegram.ui.Components.o5[] o5VarArr;
        org.telegram.ui.Components.o5[] o5VarArr2;
        th.s0 s0Var;
        int i12 = this.f47269a;
        int i13 = 2131624011;
        Object obj = this.f47271c;
        Object obj2 = this.f47270b;
        switch (i12) {
            case 0:
                p pVar = (p) obj2;
                TLObject tLObject = (TLObject) obj;
                int i14 = pVar.f47295a;
                ArrayList arrayList2 = pVar.e;
                if (tLObject instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject;
                    vp.r1(i14).V3(suggestedstarrefbots.users, false);
                    if (pVar.f47297c <= 0) {
                        arrayList2.clear();
                    }
                    pVar.f47297c = suggestedstarrefbots.count;
                    arrayList2.addAll(suggestedstarrefbots.suggested_bots);
                    pVar.f47301j = suggestedstarrefbots.next_offset;
                    if (!suggestedstarrefbots.suggested_bots.isEmpty() && arrayList2.size() < pVar.f47297c) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    pVar.d = z10;
                    i10 = 1;
                } else {
                    i10 = 1;
                    pVar.f47300i = true;
                    pVar.d = true;
                }
                pVar.h = false;
                zs f7 = zs.f(i14);
                Object[] objArr = new Object[i10];
                objArr[0] = Long.valueOf(pVar.f47296b);
                f7.k(235, objArr);
                return;
            case 1:
                e4.g1((e4) obj2, (TL_stars.TL_payments_uniqueStarGift) obj);
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((org.telegram.ui.ActionBar.x1) obj2).dismiss();
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    if (tL_error != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        a02 = cc.a0(T);
                        i13 = 2131624020;
                        i11 = 2131743905;
                        str = null;
                    } else {
                        str = null;
                        a02 = cc.a0(T);
                        i11 = 2131743906;
                    }
                    org.telegram.messenger.m5.n(str, i11, a02, i13, 36);
                    return;
                }
                return;
            case 3:
                e4 e4Var = (e4) obj2;
                Long l4 = (Long) obj;
                if (l4.longValue() < 0 && (L0 = vp.r1(e4Var.f21583a).L0(Long.valueOf(-l4.longValue()))) != null) {
                    str2 = L0.title;
                } else {
                    str2 = "";
                }
                cc k10 = e4Var.k();
                if (TextUtils.isEmpty(str2)) {
                    a03 = cd.L0(2131749625, null);
                    z11 = true;
                } else {
                    z11 = true;
                    a03 = cd.a0(null, null, 2131749626, str2);
                }
                wb Q = k10.Q(2131623989, 36, org.telegram.messenger.i0.W2(a03));
                Q.f32145t = z11;
                Q.j();
                return;
            case 4:
                e4 e4Var2 = (e4) obj2;
                if (!((e6) obj).e) {
                    wb Q2 = e4Var2.k().Q(2131624011, 36, cd.a0(null, null, 2131743903, "NO_BALANCE"));
                    Q2.f32145t = true;
                    Q2.j();
                    return;
                }
                e4Var2.f46801c2.setLoading(false);
                e4Var2.t1();
                return;
            case 5:
                vp.r1(((e4) obj2).f21583a).L3((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 6:
                ((e4) obj2).k().f0((TLRPC.TL_error) obj, false);
                return;
            case 7:
                e4 e4Var3 = (e4) obj2;
                cc.a0((un) obj).L(2131624032, cd.L0(2131745114, null), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131745112, org.telegram.messenger.o5.t(e4Var3.P1))), cd.L0(2131745113, null), new w0(e4Var3, 8)).k(true);
                return;
            case 8:
                e4 e4Var4 = (e4) obj2;
                e4Var4.getClass();
                ((boolean[]) obj)[0] = true;
                e4Var4.f46801c2.setLoading(false);
                e4Var4.t1();
                return;
            case 9:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                z20.s(cd.a0(null, null, 2131749627, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num), ((e4) obj2).k(), 2131624050, 36);
                return;
            case 10:
                ((e4) obj2).o2((CharSequence) obj);
                return;
            case 11:
                i4 i4Var = (i4) obj2;
                un unVar = (un) obj;
                org.telegram.ui.Cells.z zVar = i4Var.f47086b;
                if (zVar != null) {
                    try {
                        zVar.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    i4Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.z zVar2 = i4Var.f47086b;
                    if (zVar2 instanceof org.telegram.ui.Cells.q1) {
                        messageObject = ((org.telegram.ui.Cells.q1) zVar2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.f16337k;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                            arrayList = null;
                        } else {
                            return;
                        }
                    } else if ((zVar2 instanceof org.telegram.ui.Cells.s0) && (messageObject = ((org.telegram.ui.Cells.s0) zVar2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.f16337k;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                        arrayList = null;
                    } else {
                        return;
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList3 = arrayList;
                    c6 c6Var = e6.y(messageObject.I1, false).B;
                    if (c6Var != null) {
                        c6Var.b();
                    }
                    TLRPC.ChatFull chatFull = unVar.f42374p8;
                    Context context = i4Var.getContext();
                    int currentAccount = unVar.getCurrentAccount();
                    long a2 = unVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    jj jjVar = messageObject;
                    y8 y8Var = new y8(context, currentAccount, a2, unVar, jjVar, arrayList3, z12, false, 0L, unVar.getResourceProvider());
                    jjVar.f1();
                    org.telegram.ui.Cells.z zVar3 = i4Var.f47086b;
                    y8Var.M1 = unVar;
                    y8Var.N1 = zVar3;
                    y8Var.show();
                    return;
                }
                return;
            case 12:
                TLObject tLObject2 = (TLObject) obj;
                ph.h1 h1Var = (ph.h1) obj2;
                if (tLObject2 instanceof TL_stars.StarGifts) {
                    h1Var.a((TL_stars.StarGifts) tLObject2);
                    return;
                } else {
                    h1Var.a(null);
                    return;
                }
            case 13:
                boolean[] zArr = (boolean[]) obj2;
                j20 j20Var = (j20) obj;
                if (!zArr[0]) {
                    j20Var.a("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            case 14:
                v5 v5Var = (v5) obj2;
                TLObject tLObject3 = (TLObject) obj;
                ArrayList arrayList4 = v5Var.f47582l;
                int i15 = v5Var.f47574a;
                if (tLObject3 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject3;
                    vp.r1(i15).V3(tL_payments_savedStarGifts.users, false);
                    vp.r1(i15).P3(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i16 = 0;
                        while (i16 < arrayList4.size() && ((TL_stars.SavedStarGift) arrayList4.get(i16)).pinned_to_top) {
                            i16++;
                        }
                        arrayList4.add(i16, savedStarGift);
                        zs.f(i15).k(230, Long.valueOf(v5Var.f47575b), v5Var);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ((vp) obj2).L3((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 16:
                new cc(((org.telegram.ui.ActionBar.z2[]) obj2)[0].E, (org.telegram.ui.ActionBar.p6) obj).Q(2131623993, 36, cd.L0(2131744965, null)).k(false);
                return;
            case 17:
                y8 y8Var2 = (y8) obj2;
                y8Var2.K1 = true;
                y8Var2.J0(new a6((c6) obj, 2));
                org.telegram.messenger.i0.h3(new i8(y8Var2, 1), 240L);
                return;
            case 18:
                s9.a aVar = (s9.a) obj2;
                Runnable runnable = (Runnable) obj;
                Process.setThreadPriority(aVar.f48097c);
                StrictMode.ThreadPolicy threadPolicy = aVar.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 19:
                Callable callable = (Callable) obj2;
                s9.i iVar = (s9.i) ((s9.g) obj).f48113a;
                try {
                    iVar.k(callable.call());
                    return;
                } catch (Exception e) {
                    iVar.l(e);
                    return;
                }
            case 20:
                sg.o oVar = (sg.o) obj2;
                org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oVar.h.getText());
                for (org.telegram.ui.Components.o5 o5Var2 : (org.telegram.ui.Components.o5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.o5.class)) {
                    if (o5Var2 == o5Var) {
                        int editTextSelectionEnd = oVar.h.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(o5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(o5Var2);
                        oVar.h.getText().delete(spanStart, spanEnd);
                        int i17 = spanEnd - spanStart;
                        sg.l lVar = oVar.h;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i17;
                        }
                        lVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 21:
                sg.o oVar2 = (sg.o) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (oVar2.V != null && tL_error2.text.equals("BOOSTS_REQUIRED")) {
                    sg.q0.f(-oVar2.R, oVar2.W, oVar2.V);
                    return;
                }
                String str3 = tL_error2.text;
                if (str3.equals("REACTIONS_TOO_MANY")) {
                    str3 = cd.G(oVar2.M, "ReactionMaxCountError", new Object[0]);
                }
                cc.a0(oVar2).t(str3, null).j();
                return;
            case 22:
                org.telegram.ui.Components.o5 o5Var3 = (org.telegram.ui.Components.o5) obj;
                sg.o oVar3 = ((sg.m) obj2).f48390f2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(oVar3.h.getText());
                for (org.telegram.ui.Components.o5 o5Var4 : (org.telegram.ui.Components.o5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.o5.class)) {
                    if (o5Var4 == o5Var3) {
                        int editTextSelectionEnd2 = oVar3.h.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(o5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(o5Var4);
                        oVar3.h.getText().delete(spanStart2, spanEnd2);
                        int i18 = spanEnd2 - spanStart2;
                        sg.l lVar2 = oVar3.h;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i18;
                        }
                        lVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 23:
                sg.b0 b0Var = (sg.b0) obj2;
                mj0 mj0Var = (mj0) obj;
                b0Var.f48283l = true;
                b0Var.f48275a.invalidate();
                mj0Var.f28505c1 = false;
                mj0Var.invalidate();
                b0Var.c(true);
                return;
            case 24:
                sg.d0 d0Var = (sg.d0) obj2;
                sg.b bVar = (sg.b) obj;
                d0Var.getText().delete(d0Var.getText().getSpanStart(bVar), d0Var.getText().getSpanEnd(bVar));
                d0Var.setCursorVisible(true);
                d0Var.setLongClickable(true);
                return;
            case 25:
                sg.p0 p0Var = (sg.p0) obj2;
                sg.m0 m0Var = (sg.m0) obj;
                p0Var.getClass();
                TLRPC.ReactionCount reactionCount = m0Var.f48391a;
                org.telegram.ui.Cells.z zVar4 = p0Var.f48456w;
                if (c3.i0.t(zVar4)) {
                    ((org.telegram.ui.Cells.r4) zVar4).e(reactionCount, true, 0.0f, 0.0f);
                }
                m0Var.X.c(false);
                p0Var.P = null;
                p0Var.Q = false;
                p0Var.R = null;
                return;
            case 26:
                ((th.o7) obj2).V(ProfileActivity.z4(((th.h0) obj).f49008c));
                return;
            case 27:
                th.p1 p1Var = (th.p1) obj2;
                org.telegram.messenger.i0.g(((th.c0) obj).f48819w);
                if (org.telegram.messenger.i0.H3()) {
                    Toast.makeText(p1Var.getContext(), cd.L0(2131744219, null), 0).show();
                    return;
                }
                return;
            case 28:
                th.p1 p1Var2 = (th.p1) obj2;
                th.h0 h0Var = (th.h0) obj;
                long j10 = h0Var.f49008c;
                th.z2 z2Var = p1Var2.f49354i0;
                if (j10 != d20.i(z2Var.f49730l2).e() && ((s0Var = p1Var2.f49353h0.A0) == null || j10 != org.telegram.messenger.o5.o(s0Var.i()))) {
                    if (z2Var.f49778x3 != null) {
                        for (int i19 = 0; i19 < z2Var.f49778x3.peers.size(); i19++) {
                            if (j10 != org.telegram.messenger.o5.o(z2Var.f49778x3.peers.get(i19).peer)) {
                            }
                        }
                    }
                    Context context2 = p1Var2.getContext();
                    long j11 = h0Var.f49008c;
                    jo joVar = new jo(4, p1Var2, h0Var);
                    ro0 ro0Var = new ro0(3);
                    org.telegram.ui.ActionBar.z2 z2Var2 = new org.telegram.ui.ActionBar.z2(1, context2, (org.telegram.ui.ActionBar.p6) ro0Var, false);
                    z2Var2.O();
                    LinearLayout f10 = org.telegram.messenger.m5.f(context2, 1);
                    TextView g10 = org.telegram.messenger.m5.g(context2, 1, 20.0f);
                    org.telegram.ui.ActionBar.a7.V(g10, org.telegram.ui.ActionBar.t6.f21037j5, ro0Var);
                    g10.setTypeface(org.telegram.messenger.i0.o());
                    g10.setText(cd.L0(2131751497, null));
                    f10.addView(g10, w7.b6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context2, ro0Var);
                    p4Var.setText(cd.L0(2131751594, null));
                    f10.addView(p4Var, w7.b6.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(4, 21, context2, ro0Var, true);
                    ep checkBoxRound = c2Var.getCheckBoxRound();
                    int i20 = org.telegram.ui.ActionBar.t6.V6;
                    int i21 = org.telegram.ui.ActionBar.t6.f20986g7;
                    int i22 = org.telegram.ui.ActionBar.t6.f21059k7;
                    checkBoxRound.b(i20, i21, i22);
                    c2Var.e(cd.L0(2131751503, null), null, false, true, false);
                    c2Var.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.c2 c2Var2 = c2Var;
                                    c2Var2.c(!c2Var2.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.c2 c2Var3 = c2Var;
                                    c2Var3.c(!c2Var3.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.c2 c2Var4 = c2Var;
                                    c2Var4.c(!c2Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    int i23 = org.telegram.ui.ActionBar.t6.f21020i6;
                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i23, ro0Var), 2, -1);
                    org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i23);
                    c2Var.setBackground(h02);
                    org.telegram.ui.ActionBar.a7.k(c2Var, h02, null, N, ro0Var);
                    f10.addView(c2Var, w7.b6.o(-1, -2));
                    final org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(4, 21, context2, ro0Var, true);
                    c2Var2.getCheckBoxRound().b(i20, i21, i22);
                    c2Var2.e(cd.a0(null, null, 2131751588, org.telegram.messenger.o5.l(d20.f15147s0, j11)), null, false, true, false);
                    c2Var2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.c2 c2Var22 = c2Var2;
                                    c2Var22.c(!c2Var22.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.c2 c2Var3 = c2Var2;
                                    c2Var3.c(!c2Var3.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.c2 c2Var4 = c2Var2;
                                    c2Var4.c(!c2Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i23, ro0Var), 2, -1);
                    org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i23);
                    c2Var2.setBackground(h03);
                    org.telegram.ui.ActionBar.a7.k(c2Var2, h03, null, N2, ro0Var);
                    f10.addView(c2Var2, w7.b6.o(-1, -2));
                    final org.telegram.ui.Cells.c2 c2Var3 = new org.telegram.ui.Cells.c2(4, 21, context2, ro0Var, true);
                    c2Var3.getCheckBoxRound().b(i20, i21, i22);
                    c2Var3.e(cd.a0(null, null, 2131751569, org.telegram.messenger.o5.l(d20.f15147s0, j11)), null, false, false, false);
                    c2Var3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    org.telegram.ui.Cells.c2 c2Var22 = c2Var3;
                                    c2Var22.c(!c2Var22.b(), true);
                                    return;
                                case 1:
                                    org.telegram.ui.Cells.c2 c2Var32 = c2Var3;
                                    c2Var32.c(!c2Var32.b(), true);
                                    return;
                                default:
                                    org.telegram.ui.Cells.c2 c2Var4 = c2Var3;
                                    c2Var4.c(!c2Var4.b(), true);
                                    return;
                            }
                        }
                    });
                    org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i23, ro0Var), 2, -1);
                    org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i23);
                    c2Var3.setBackground(h04);
                    org.telegram.ui.ActionBar.a7.k(c2Var3, h04, null, N3, ro0Var);
                    f10.addView(c2Var3, w7.b6.o(-1, -2));
                    b9 b9Var = new b9(context2, ro0Var);
                    b9Var.setBackgroundColor(-16777216);
                    b9Var.setFixedSize(12);
                    f10.addView(b9Var, w7.b6.o(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context2);
                    vh.d dVar = new vh.d(context2, ro0Var, true);
                    dVar.i(cd.L0(2131751514, null), false, true);
                    dVar.setOnClickListener(new bi.c(c2Var, c2Var2, c2Var3, joVar, z2Var2, 12));
                    frameLayout.addView(dVar, w7.b6.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    f10.addView(frameLayout, w7.b6.o(-1, -2));
                    z2Var2.N = f10;
                    z2Var2.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = p1Var2.O;
                deletegroupcallmessages.messages.add(Integer.valueOf(h0Var.f49006a));
                ConnectionsManager.getInstance(p1Var2.N).sendRequest(deletegroupcallmessages, null);
                p1Var2.c(h0Var.f49006a);
                return;
            default:
                th.s0 s0Var2 = (th.s0) obj2;
                ArrayList arrayList5 = (ArrayList) obj;
                int size = arrayList5.size();
                int i24 = 0;
                while (i24 < size) {
                    Object obj3 = arrayList5.get(i24);
                    i24++;
                    TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) obj3;
                    zs.f(s0Var2.e).k(177, Long.valueOf(tL_updateGroupCallMessage.call.f19810id), tL_updateGroupCallMessage, Boolean.TRUE);
                }
                return;
        }
    }

    public o(TLObject tLObject, ph.h1 h1Var) {
        this.f47269a = 12;
        this.f47271c = tLObject;
        this.f47270b = h1Var;
    }

    public o(e6 e6Var, boolean[] zArr, j20 j20Var) {
        this.f47269a = 13;
        this.f47270b = zArr;
        this.f47271c = j20Var;
    }
}
