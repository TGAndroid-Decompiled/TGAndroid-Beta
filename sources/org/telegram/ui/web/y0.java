package org.telegram.ui.web;

import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import eg.t2;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.kg1;
import org.telegram.ui.oy;
import org.telegram.ui.xn;
import org.telegram.ui.xx;
import ph.a3;
import ph.a9;
import ph.c5;
import ph.d7;
import ph.da;
import ph.h9;
import ph.l5;
import ph.t6;
import ph.u6;
import ph.v7;
import vh.f3;
import vh.i3;
import vh.r3;
import vh.v5;
public final class y0 implements Utilities.Callback {
    public final int f39707a;
    public final Object f39708b;

    public y0(Object obj, int i10) {
        this.f39707a = i10;
        this.f39708b = obj;
    }

    @Override
    public final void run(Object obj) {
        String str;
        w51 w51Var;
        int i10;
        float f10;
        w51 w51Var2;
        boolean z4;
        boolean z10;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User user;
        TL_account.TL_businessBotRights makeDefault;
        boolean z11;
        w51 w51Var3;
        Editable editable;
        vh.a aVar;
        switch (this.f39707a) {
            case 0:
                w0 w0Var = ((BotWebViewContainer$WebViewProxy) this.f39708b).f39412b;
                StringBuilder sb = new StringBuilder("window.navigator.__share__receive(");
                if (((Boolean) obj).booleanValue()) {
                    str = "";
                } else {
                    str = "'abort'";
                }
                sb.append(str);
                sb.append(")");
                w0Var.d(sb.toString());
                return;
            case 1:
                e1 e1Var = (e1) this.f39708b;
                e1Var.e = (ArrayList) obj;
                a61 a61Var = e1Var.f23580a;
                if (a61Var.D) {
                    a61Var.V2.N(true);
                    return;
                }
                return;
            case 2:
                x1 x1Var = (x1) this.f39708b;
                x1Var.f39703n = ((ArrayList) obj).size();
                a61 a61Var2 = x1Var.f23580a;
                if (a61Var2 != null && (w51Var = a61Var2.V2) != null && a61Var2.D) {
                    w51Var.N(true);
                    return;
                }
                return;
            case 3:
                ((ph.k) this.f39708b).x(((Integer) obj).intValue());
                return;
            case 4:
                ph.y yVar = (ph.y) this.f39708b;
                yVar.f42584g0.f42528n.P = ((Float) obj).floatValue();
                ph.x xVar = yVar.f42584g0;
                t2 t2Var = xVar.d;
                if (t2Var != null) {
                    t2Var.setVolume(xVar.f42528n.P);
                    return;
                }
                return;
            case 5:
                ph.k0 k0Var = (ph.k0) this.f39708b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = k0Var.f41838c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(k0Var.f41838c);
                    return;
                }
                return;
            case 6:
                ph.d2 d2Var = (ph.d2) this.f39708b;
                d2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new kg1(20, d2Var, (Runnable) obj), 80L);
                return;
            case 7:
                ((a3) this.f39708b).f41266s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.f20543w).start();
                return;
            case 8:
                h9 h9Var = (h9) ((c5) this.f39708b);
                da daVar = h9Var.f41720x2;
                daVar.U0.p((MessageObject) obj);
                u6 u6Var = daVar.H1;
                int i11 = 0;
                if (u6Var != null && daVar.L1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(u6Var.f42446y);
                    boolean z12 = !isEmpty;
                    ((mg0) daVar.f41494g1.f5302c).a(!daVar.U0.k(), false);
                    daVar.f41494g1.setVisibility(0);
                    ViewPropertyAnimator animate = daVar.f41494g1.animate();
                    if (!isEmpty) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).withEndAction(new kv0(15, h9Var, z12)).start();
                }
                if (daVar.f41547x0.j()) {
                    ArrayList arrayList = daVar.f41547x0.h;
                    int size = arrayList.size();
                    while (true) {
                        if (i11 < size) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
                            u6 u6Var2 = ((ph.x) obj2).f42528n;
                            if (u6Var2 != null && u6Var2.K) {
                                if (!TextUtils.isEmpty(daVar.H1.f42446y)) {
                                    i10 = 2;
                                }
                            }
                        }
                    }
                }
                i10 = -1;
                daVar.l0(i10, true, true);
                return;
            case 9:
                t6 t6Var = (t6) obj;
                w61 w61Var = ((l5) this.f39708b).f41894n;
                if (w61Var != null) {
                    w61Var.setHDRInfo(t6Var);
                    return;
                }
                return;
            case 10:
                d7 d7Var = (d7) this.f39708b;
                dg.f1 f1Var = (dg.f1) obj;
                if (f1Var == null) {
                    d7Var.U();
                    return;
                }
                d7Var.f41465l0 = f1Var.e;
                d7Var.f41464k0 = f1Var.f4508f;
                return;
            case 11:
                ((v7) this.f39708b).f42483n.T.E = ((Integer) obj).intValue();
                return;
            case 12:
                ((a9) this.f39708b).g((Utilities.Callback) obj);
                return;
            case 13:
                rh.s sVar = (rh.s) this.f39708b;
                ArrayList arrayList2 = sVar.f43732b;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) obj);
                g61 g61Var = sVar.f43731a;
                if (g61Var != null && (w51Var2 = g61Var.V2) != null) {
                    w51Var2.N(true);
                    return;
                }
                return;
            case 14:
                sh.g gVar = (sh.g) this.f39708b;
                ArrayList arrayList3 = (ArrayList) obj;
                ArrayList arrayList4 = gVar.h;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                gVar.h = arrayList3;
                g61 g61Var2 = gVar.e;
                if (g61Var2 != null) {
                    g61Var2.V2.N(z4);
                    return;
                }
                return;
            case 15:
                ((tf.k) this.f39708b).L((TLRPC.User) obj);
                return;
            case 16:
                TLRPC.User user2 = (TLRPC.User) obj;
                wn0 wn0Var = (wn0) ((tf.z) this.f39708b);
                xx xxVar = wn0Var.H0;
                if (user2 != null) {
                    oy oyVar = xxVar.G0;
                    if (oyVar != null) {
                        oyVar.K3();
                    }
                    MessagesController.getInstance(xxVar.E0).openApp(user2, 0);
                    wn0Var.R(user2.f19331id, user2);
                    return;
                }
                return;
            case 17:
                uf.k kVar = (uf.k) this.f39708b;
                if (((Integer) obj).intValue() > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (kVar.C != z10) {
                    kVar.C = z10;
                    if (!z10) {
                        kVar.f23580a.x0(0);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                Object[] objArr = (Object[]) obj;
                AndroidUtilities.forEachViews((RecyclerView) ((uf.c0) this.f39708b).f45269s, (h5.d) new nh.e(17));
                return;
            case 19:
                uf.k0 k0Var2 = (uf.k0) this.f39708b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                k0Var2.D = connectedbots;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
                if (connectedbots != null && !connectedbots.connected_bots.isEmpty()) {
                    tL_connectedBot = k0Var2.D.connected_bots.get(0);
                } else {
                    tL_connectedBot = null;
                }
                k0Var2.E = tL_connectedBot;
                if (tL_connectedBot == null) {
                    user = null;
                } else {
                    user = k0Var2.getMessagesController().getUser(Long.valueOf(k0Var2.E.bot_id));
                }
                k0Var2.J = user;
                TL_account.TL_connectedBot tL_connectedBot2 = k0Var2.E;
                if (tL_connectedBot2 != null) {
                    makeDefault = TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights);
                } else {
                    makeDefault = TL_account.TL_businessBotRights.makeDefault();
                }
                k0Var2.G = makeDefault;
                TL_account.TL_connectedBot tL_connectedBot3 = k0Var2.E;
                if (tL_connectedBot3 != null) {
                    z11 = tL_connectedBot3.recipients.exclude_selected;
                } else {
                    z11 = true;
                }
                k0Var2.F = z11;
                uf.v vVar = k0Var2.v;
                if (vVar != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    vVar.i(tL_businessBotRecipients);
                }
                g61 g61Var3 = k0Var2.f45352c;
                if (g61Var3 != null && (w51Var3 = g61Var3.V2) != null) {
                    w51Var3.N(true);
                }
                k0Var2.Y(true);
                k0Var2.Q = true;
                return;
            case 20:
                uf.m0 m0Var = (uf.m0) this.f39708b;
                m0Var.f45387w = m0Var.e[((Integer) obj).intValue()];
                m0Var.V(true);
                return;
            case 21:
                uf.m1 m1Var = (uf.m1) this.f39708b;
                m1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", m1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                xn xnVar = new xn(bundle);
                xnVar.f40269z9 = true;
                m1Var.presentFragment(xnVar);
                return;
            case 22:
                AndroidUtilities.hideKeyboard((uf.g1) this.f39708b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 23:
                i3 i3Var = (i3) this.f39708b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i12 = i3Var.f45932b;
                int i13 = i3Var.f45931a;
                r3 r3Var = i3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList5 = r3Var.f46120i3;
                    ArrayList arrayList6 = r3Var.f46120i3;
                    if (i13 < arrayList5.size() && i12 < arrayList6.size()) {
                        vh.c2 c2Var = r3Var.G3;
                        if (c2Var != null) {
                            c2Var.d();
                        }
                        f3 f3Var = r3Var.f46124k3;
                        if (f3Var != null) {
                            f3Var.f(false);
                        }
                        vh.a aVar2 = (vh.a) arrayList6.get(i13);
                        vh.a aVar3 = (vh.a) arrayList6.get(i12);
                        CharSequence charSequence = "";
                        if (!r3.A3(aVar2.f45775b)) {
                            editable = "";
                        } else {
                            editable = r3Var.M4(aVar2);
                        }
                        if (r3.A3(aVar3.f45775b)) {
                            charSequence = r3Var.M4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(i3Var.f45933c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(i3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList7 = new ArrayList();
                        r3.W2(arrayList7, richMessage.blocks, null);
                        if (arrayList7.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            v5.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList7.add(new vh.a(pageblockparagraph, aVar2.f45776c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                vh.a aVar4 = (vh.a) arrayList7.get(0);
                                if (r3.A3(aVar4.f45775b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) v5.A(aVar4.f45775b));
                                    v5.d(aVar4.f45775b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    v5.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList7.add(0, new vh.a(pageblockparagraph2, aVar2.f45776c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                vh.a aVar5 = (vh.a) kh.a2.i(1, arrayList7);
                                if (r3.A3(aVar5.f45775b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(v5.A(aVar5.f45775b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    v5.d(aVar5.f45775b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    v5.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList7.add(new vh.a(pageblockparagraph3, aVar3.f45776c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = r3Var.f46118h3;
                        if (richMessage2 == null) {
                            r3Var.f46118h3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList8 = richMessage.photos;
                            if (arrayList8 != null) {
                                richMessage2.photos.addAll(arrayList8);
                            }
                            ArrayList<TLRPC.Document> arrayList9 = richMessage.documents;
                            if (arrayList9 != null) {
                                r3Var.f46118h3.documents.addAll(arrayList9);
                            }
                        }
                        for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                            r3Var.v4((vh.a) arrayList7.get(i14));
                        }
                        while (i12 >= i13) {
                            arrayList6.remove(i12);
                            i12--;
                        }
                        arrayList6.addAll(i13, arrayList7);
                        r3Var.s4();
                        r3Var.V2.N(false);
                        vh.c2 c2Var2 = r3Var.G3;
                        if (c2Var2 != null) {
                            c2Var2.h();
                        }
                        r3Var.f46112e3.onContentChanged();
                        if (arrayList7.isEmpty()) {
                            aVar = null;
                        } else {
                            aVar = (vh.a) kh.a2.i(1, arrayList7);
                        }
                        r3Var.post(new uf.v0(9, i3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ((vh.k) this.f39708b).f45961a.f46059r.U1((TL_iv.RichMessage) obj);
                return;
            case 25:
                ((vh.y1) this.f39708b).M.U1((TL_iv.RichMessage) obj);
                return;
            default:
                r3 r3Var2 = (r3) this.f39708b;
                String str2 = (String) obj;
                r3Var2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    r3Var2.R1(pageblockmath);
                    return;
                }
                return;
        }
    }
}
