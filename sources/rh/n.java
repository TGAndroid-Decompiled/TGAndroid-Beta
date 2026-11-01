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
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.k20;
import org.telegram.messenger.kj;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.jo;
import org.telegram.ui.un;
public final class n implements Runnable {
    public final int f47227a;
    public final Object f47228b;
    public final Object f47229c;

    public n(int i10, Object obj, Object obj2) {
        this.f47227a = i10;
        this.f47229c = obj;
        this.f47228b = obj2;
    }

    @Override
    public final void run() {
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        String str;
        cc a02;
        int i12;
        String str2;
        boolean z12;
        String a03;
        TLRPC.Chat L0;
        kj messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        boolean z13;
        TLRPC.TL_messageReactions tL_messageReactions2;
        org.telegram.ui.Components.o5[] o5VarArr;
        org.telegram.ui.Components.o5[] o5VarArr2;
        th.s0 s0Var;
        int i13 = this.f47227a;
        int i14 = 2131624011;
        Object obj = this.f47228b;
        Object obj2 = this.f47229c;
        switch (i13) {
            case 0:
                o oVar = (o) obj2;
                TLObject tLObject = (TLObject) obj;
                int i15 = oVar.f47280a;
                ArrayList arrayList2 = oVar.e;
                oVar.f47285i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    wp.r1(i15).V3(connectedstarrefbots.users, false);
                    if (oVar.f47282c <= 0) {
                        arrayList2.clear();
                    }
                    oVar.f47282c = connectedstarrefbots.count;
                    arrayList2.addAll(connectedstarrefbots.connected_bots);
                    if (!connectedstarrefbots.connected_bots.isEmpty() && arrayList2.size() < oVar.f47282c) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    oVar.d = z10;
                    i10 = 1;
                } else {
                    i10 = 1;
                    oVar.h = true;
                    oVar.d = true;
                }
                oVar.f47284g = false;
                at f7 = at.f(i15);
                Object[] objArr = new Object[i10];
                objArr[0] = Long.valueOf(oVar.f47281b);
                f7.k(236, objArr);
                return;
            case 1:
                p pVar = (p) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i16 = pVar.f47309a;
                ArrayList arrayList3 = pVar.e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    wp.r1(i16).V3(suggestedstarrefbots.users, false);
                    if (pVar.f47311c <= 0) {
                        arrayList3.clear();
                    }
                    pVar.f47311c = suggestedstarrefbots.count;
                    arrayList3.addAll(suggestedstarrefbots.suggested_bots);
                    pVar.f47315j = suggestedstarrefbots.next_offset;
                    if (!suggestedstarrefbots.suggested_bots.isEmpty() && arrayList3.size() < pVar.f47311c) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    pVar.d = z11;
                    i11 = 1;
                } else {
                    i11 = 1;
                    pVar.f47314i = true;
                    pVar.d = true;
                }
                pVar.h = false;
                at f10 = at.f(i16);
                Object[] objArr2 = new Object[i11];
                objArr2[0] = Long.valueOf(pVar.f47310b);
                f10.k(235, objArr2);
                return;
            case 2:
                e4.g1((e4) obj2, (TL_stars.TL_payments_uniqueStarGift) obj);
                return;
            case 3:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((org.telegram.ui.ActionBar.x1) obj2).dismiss();
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    if (tL_error != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        a02 = cc.a0(T);
                        i14 = 2131624020;
                        i12 = 2131743905;
                        str = null;
                    } else {
                        str = null;
                        a02 = cc.a0(T);
                        i12 = 2131743906;
                    }
                    org.telegram.messenger.m5.n(str, i12, a02, i14, 36);
                    return;
                }
                return;
            case 4:
                e4 e4Var = (e4) obj2;
                Long l4 = (Long) obj;
                if (l4.longValue() < 0 && (L0 = wp.r1(e4Var.f21584a).L0(Long.valueOf(-l4.longValue()))) != null) {
                    str2 = L0.title;
                } else {
                    str2 = "";
                }
                cc k10 = e4Var.k();
                if (TextUtils.isEmpty(str2)) {
                    a03 = dd.L0(2131749625, null);
                    z12 = true;
                } else {
                    z12 = true;
                    a03 = dd.a0(null, null, 2131749626, str2);
                }
                wb Q = k10.Q(2131623989, 36, org.telegram.messenger.i0.W2(a03));
                Q.f32211t = z12;
                Q.j();
                return;
            case 5:
                e4 e4Var2 = (e4) obj2;
                if (!((e6) obj).e) {
                    wb Q2 = e4Var2.k().Q(2131624011, 36, dd.a0(null, null, 2131743903, "NO_BALANCE"));
                    Q2.f32211t = true;
                    Q2.j();
                    return;
                }
                e4Var2.f46815c2.setLoading(false);
                e4Var2.t1();
                return;
            case 6:
                wp.r1(((e4) obj2).f21584a).L3((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 7:
                ((e4) obj2).k().f0((TLRPC.TL_error) obj, false);
                return;
            case 8:
                e4 e4Var3 = (e4) obj2;
                cc.a0((un) obj).L(2131624032, dd.L0(2131745114, null), org.telegram.messenger.i0.W2(dd.a0(null, null, 2131745112, org.telegram.messenger.o5.t(e4Var3.P1))), dd.L0(2131745113, null), new w0(e4Var3, 8)).k(true);
                return;
            case 9:
                e4 e4Var4 = (e4) obj2;
                e4Var4.getClass();
                ((boolean[]) obj)[0] = true;
                e4Var4.f46815c2.setLoading(false);
                e4Var4.t1();
                return;
            case 10:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                a30.s(dd.a0(null, null, 2131749627, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num), ((e4) obj2).k(), 2131624050, 36);
                return;
            case 11:
                ((e4) obj2).o2((CharSequence) obj);
                return;
            case 12:
                i4 i4Var = (i4) obj2;
                un unVar = (un) obj;
                org.telegram.ui.Cells.z zVar = i4Var.f47100b;
                if (zVar != null) {
                    try {
                        zVar.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    i4Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.z zVar2 = i4Var.f47100b;
                    if (zVar2 instanceof org.telegram.ui.Cells.q1) {
                        messageObject = ((org.telegram.ui.Cells.q1) zVar2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.f16690k;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                            arrayList = null;
                        } else {
                            return;
                        }
                    } else if ((zVar2 instanceof org.telegram.ui.Cells.s0) && (messageObject = ((org.telegram.ui.Cells.s0) zVar2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.f16690k;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                        arrayList = null;
                    } else {
                        return;
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList4 = arrayList;
                    c6 c6Var = e6.y(messageObject.I1, false).B;
                    if (c6Var != null) {
                        c6Var.b();
                    }
                    TLRPC.ChatFull chatFull = unVar.f42185p8;
                    Context context = i4Var.getContext();
                    int currentAccount = unVar.getCurrentAccount();
                    long a2 = unVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    kj kjVar = messageObject;
                    y8 y8Var = new y8(context, currentAccount, a2, unVar, kjVar, arrayList4, z13, false, 0L, unVar.getResourceProvider());
                    kjVar.f1();
                    org.telegram.ui.Cells.z zVar3 = i4Var.f47100b;
                    y8Var.M1 = unVar;
                    y8Var.N1 = zVar3;
                    y8Var.show();
                    return;
                }
                return;
            case 13:
                TLObject tLObject3 = (TLObject) obj;
                ph.h1 h1Var = (ph.h1) obj2;
                if (tLObject3 instanceof TL_stars.StarGifts) {
                    h1Var.a((TL_stars.StarGifts) tLObject3);
                    return;
                } else {
                    h1Var.a(null);
                    return;
                }
            case 14:
                boolean[] zArr = (boolean[]) obj2;
                k20 k20Var = (k20) obj;
                if (!zArr[0]) {
                    k20Var.a("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            case 15:
                v5 v5Var = (v5) obj2;
                TLObject tLObject4 = (TLObject) obj;
                ArrayList arrayList5 = v5Var.f47596l;
                int i17 = v5Var.f47588a;
                if (tLObject4 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject4;
                    wp.r1(i17).V3(tL_payments_savedStarGifts.users, false);
                    wp.r1(i17).P3(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i18 = 0;
                        while (i18 < arrayList5.size() && ((TL_stars.SavedStarGift) arrayList5.get(i18)).pinned_to_top) {
                            i18++;
                        }
                        arrayList5.add(i18, savedStarGift);
                        at.f(i17).k(230, Long.valueOf(v5Var.f47589b), v5Var);
                        return;
                    }
                    return;
                }
                return;
            case 16:
                ((wp) obj2).L3((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 17:
                new cc(((org.telegram.ui.ActionBar.z2[]) obj2)[0].E, (org.telegram.ui.ActionBar.p6) obj).Q(2131623993, 36, dd.L0(2131744965, null)).k(false);
                return;
            case 18:
                y8 y8Var2 = (y8) obj2;
                y8Var2.K1 = true;
                y8Var2.J0(new a6((c6) obj, 2));
                org.telegram.messenger.i0.h3(new i8(y8Var2, 1), 240L);
                return;
            case 19:
                s9.a aVar = (s9.a) obj2;
                Runnable runnable = (Runnable) obj;
                Process.setThreadPriority(aVar.f48108c);
                StrictMode.ThreadPolicy threadPolicy = aVar.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 20:
                Callable callable = (Callable) obj2;
                s9.i iVar = (s9.i) ((s9.g) obj).f48124a;
                try {
                    iVar.k(callable.call());
                    return;
                } catch (Exception e) {
                    iVar.l(e);
                    return;
                }
            case 21:
                sg.o oVar2 = (sg.o) obj2;
                org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) obj;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(oVar2.h.getText());
                for (org.telegram.ui.Components.o5 o5Var2 : (org.telegram.ui.Components.o5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), org.telegram.ui.Components.o5.class)) {
                    if (o5Var2 == o5Var) {
                        int editTextSelectionEnd = oVar2.h.getEditTextSelectionEnd();
                        int spanEnd = spannableStringBuilder.getSpanEnd(o5Var2);
                        int spanStart = spannableStringBuilder.getSpanStart(o5Var2);
                        oVar2.h.getText().delete(spanStart, spanEnd);
                        int i19 = spanEnd - spanStart;
                        sg.l lVar = oVar2.h;
                        if (spanEnd <= editTextSelectionEnd) {
                            editTextSelectionEnd -= i19;
                        }
                        lVar.setSelection(editTextSelectionEnd);
                        return;
                    }
                }
                return;
            case 22:
                sg.o oVar3 = (sg.o) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (oVar3.V != null && tL_error2.text.equals("BOOSTS_REQUIRED")) {
                    sg.q0.f(-oVar3.R, oVar3.W, oVar3.V);
                    return;
                }
                String str3 = tL_error2.text;
                if (str3.equals("REACTIONS_TOO_MANY")) {
                    str3 = dd.G(oVar3.M, "ReactionMaxCountError", new Object[0]);
                }
                cc.a0(oVar3).t(str3, null).j();
                return;
            case 23:
                org.telegram.ui.Components.o5 o5Var3 = (org.telegram.ui.Components.o5) obj;
                sg.o oVar4 = ((sg.m) obj2).f48401f2;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(oVar4.h.getText());
                for (org.telegram.ui.Components.o5 o5Var4 : (org.telegram.ui.Components.o5[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), org.telegram.ui.Components.o5.class)) {
                    if (o5Var4 == o5Var3) {
                        int editTextSelectionEnd2 = oVar4.h.getEditTextSelectionEnd();
                        int spanEnd2 = spannableStringBuilder2.getSpanEnd(o5Var4);
                        int spanStart2 = spannableStringBuilder2.getSpanStart(o5Var4);
                        oVar4.h.getText().delete(spanStart2, spanEnd2);
                        int i20 = spanEnd2 - spanStart2;
                        sg.l lVar2 = oVar4.h;
                        if (spanEnd2 <= editTextSelectionEnd2) {
                            editTextSelectionEnd2 -= i20;
                        }
                        lVar2.setSelection(editTextSelectionEnd2);
                        return;
                    }
                }
                return;
            case 24:
                sg.b0 b0Var = (sg.b0) obj2;
                nj0 nj0Var = (nj0) obj;
                b0Var.f48294l = true;
                b0Var.f48286a.invalidate();
                nj0Var.f28866c1 = false;
                nj0Var.invalidate();
                b0Var.c(true);
                return;
            case 25:
                sg.d0 d0Var = (sg.d0) obj2;
                sg.b bVar = (sg.b) obj;
                d0Var.getText().delete(d0Var.getText().getSpanStart(bVar), d0Var.getText().getSpanEnd(bVar));
                d0Var.setCursorVisible(true);
                d0Var.setLongClickable(true);
                return;
            case 26:
                sg.p0 p0Var = (sg.p0) obj2;
                sg.m0 m0Var = (sg.m0) obj;
                p0Var.getClass();
                TLRPC.ReactionCount reactionCount = m0Var.f48402a;
                org.telegram.ui.Cells.z zVar4 = p0Var.f48467w;
                if (c3.i0.t(zVar4)) {
                    ((org.telegram.ui.Cells.r4) zVar4).e(reactionCount, true, 0.0f, 0.0f);
                }
                m0Var.X.c(false);
                p0Var.P = null;
                p0Var.Q = false;
                p0Var.R = null;
                return;
            case 27:
                ((th.o7) obj2).V(ProfileActivity.A4(((th.h0) obj).f49022c));
                return;
            case 28:
                th.p1 p1Var = (th.p1) obj2;
                org.telegram.messenger.i0.g(((th.c0) obj).f48833w);
                if (org.telegram.messenger.i0.H3()) {
                    Toast.makeText(p1Var.getContext(), dd.L0(2131744219, null), 0).show();
                    return;
                }
                return;
            default:
                th.p1 p1Var2 = (th.p1) obj2;
                th.h0 h0Var = (th.h0) obj;
                long j10 = h0Var.f49022c;
                th.z2 z2Var = p1Var2.f49368i0;
                if (j10 != e20.i(z2Var.f49744l2).e() && ((s0Var = p1Var2.f49367h0.A0) == null || j10 != org.telegram.messenger.o5.o(s0Var.i()))) {
                    if (z2Var.f49792x3 != null) {
                        for (int i21 = 0; i21 < z2Var.f49792x3.peers.size(); i21++) {
                            if (j10 != org.telegram.messenger.o5.o(z2Var.f49792x3.peers.get(i21).peer)) {
                            }
                        }
                    }
                    Context context2 = p1Var2.getContext();
                    long j11 = h0Var.f49022c;
                    jo joVar = new jo(4, p1Var2, h0Var);
                    so0 so0Var = new so0(3);
                    org.telegram.ui.ActionBar.z2 z2Var2 = new org.telegram.ui.ActionBar.z2(1, context2, (org.telegram.ui.ActionBar.p6) so0Var, false);
                    z2Var2.O();
                    LinearLayout f11 = org.telegram.messenger.m5.f(context2, 1);
                    TextView g10 = org.telegram.messenger.m5.g(context2, 1, 20.0f);
                    org.telegram.ui.ActionBar.a7.V(g10, org.telegram.ui.ActionBar.t6.f21038j5, so0Var);
                    g10.setTypeface(org.telegram.messenger.i0.o());
                    g10.setText(dd.L0(2131751497, null));
                    f11.addView(g10, w7.b6.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
                    org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context2, so0Var);
                    p4Var.setText(dd.L0(2131751594, null));
                    f11.addView(p4Var, w7.b6.k(0.0f, 0.0f, 0.0f, 4.0f, -1, -2));
                    final org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(4, 21, context2, so0Var, true);
                    ep checkBoxRound = c2Var.getCheckBoxRound();
                    int i22 = org.telegram.ui.ActionBar.t6.V6;
                    int i23 = org.telegram.ui.ActionBar.t6.f20987g7;
                    int i24 = org.telegram.ui.ActionBar.t6.f21060k7;
                    checkBoxRound.b(i22, i23, i24);
                    c2Var.e(dd.L0(2131751503, null), null, false, true, false);
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
                    int i25 = org.telegram.ui.ActionBar.t6.f21021i6;
                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i25, so0Var), 2, -1);
                    org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i25);
                    c2Var.setBackground(h02);
                    org.telegram.ui.ActionBar.a7.k(c2Var, h02, null, N, so0Var);
                    f11.addView(c2Var, w7.b6.o(-1, -2));
                    final org.telegram.ui.Cells.c2 c2Var2 = new org.telegram.ui.Cells.c2(4, 21, context2, so0Var, true);
                    c2Var2.getCheckBoxRound().b(i22, i23, i24);
                    c2Var2.e(dd.a0(null, null, 2131751588, org.telegram.messenger.o5.l(e20.f15506s0, j11)), null, false, true, false);
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
                    org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i25, so0Var), 2, -1);
                    org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i25);
                    c2Var2.setBackground(h03);
                    org.telegram.ui.ActionBar.a7.k(c2Var2, h03, null, N2, so0Var);
                    f11.addView(c2Var2, w7.b6.o(-1, -2));
                    final org.telegram.ui.Cells.c2 c2Var3 = new org.telegram.ui.Cells.c2(4, 21, context2, so0Var, true);
                    c2Var3.getCheckBoxRound().b(i22, i23, i24);
                    c2Var3.e(dd.a0(null, null, 2131751569, org.telegram.messenger.o5.l(e20.f15506s0, j11)), null, false, false, false);
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
                    org.telegram.ui.Cells.y h04 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i25, so0Var), 2, -1);
                    org.telegram.ui.ActionBar.w6 N3 = org.telegram.ui.ActionBar.a7.N(i25);
                    c2Var3.setBackground(h04);
                    org.telegram.ui.ActionBar.a7.k(c2Var3, h04, null, N3, so0Var);
                    f11.addView(c2Var3, w7.b6.o(-1, -2));
                    b9 b9Var = new b9(context2, so0Var);
                    b9Var.setBackgroundColor(-16777216);
                    b9Var.setFixedSize(12);
                    f11.addView(b9Var, w7.b6.o(-1, -2));
                    FrameLayout frameLayout = new FrameLayout(context2);
                    vh.d dVar = new vh.d(context2, so0Var, true);
                    dVar.i(dd.L0(2131751514, null), false, true);
                    dVar.setOnClickListener(new bi.c(c2Var, c2Var2, c2Var3, joVar, z2Var2, 12));
                    frameLayout.addView(dVar, w7.b6.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
                    f11.addView(frameLayout, w7.b6.o(-1, -2));
                    z2Var2.N = f11;
                    z2Var2.show();
                    return;
                }
                TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                deletegroupcallmessages.call = p1Var2.O;
                deletegroupcallmessages.messages.add(Integer.valueOf(h0Var.f49020a));
                ConnectionsManager.getInstance(p1Var2.N).sendRequest(deletegroupcallmessages, null);
                p1Var2.c(h0Var.f49020a);
                return;
        }
    }

    public n(TLObject tLObject, ph.h1 h1Var) {
        this.f47227a = 13;
        this.f47228b = tLObject;
        this.f47229c = h1Var;
    }

    public n(e6 e6Var, boolean[] zArr, k20 k20Var) {
        this.f47227a = 14;
        this.f47229c = zArr;
        this.f47228b = k20Var;
    }
}
