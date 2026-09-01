package org.telegram.ui.web;

import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import fg.s2;
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
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.Components.y61;
import org.telegram.ui.mg1;
import org.telegram.ui.py;
import org.telegram.ui.xn;
import org.telegram.ui.yx;
import qh.a3;
import qh.b5;
import qh.b7;
import qh.ca;
import qh.f9;
import qh.j5;
import qh.r6;
import qh.s6;
import qh.t7;
import qh.y8;
import wh.f3;
import wh.i3;
import wh.r3;
import wh.v5;
public final class d1 implements Utilities.Callback {
    public final int f42521a;
    public final Object f42522b;

    public d1(Object obj, int i10) {
        this.f42521a = i10;
        this.f42522b = obj;
    }

    @Override
    public final void run(Object obj) {
        x51 x51Var;
        int i10;
        float f10;
        x51 x51Var2;
        boolean z4;
        boolean z10;
        TL_account.TL_connectedBot tL_connectedBot;
        TLRPC.User user;
        TL_account.TL_businessBotRights makeDefault;
        boolean z11;
        x51 x51Var3;
        Editable editable;
        wh.a aVar;
        switch (this.f42521a) {
            case 0:
                f1 f1Var = (f1) this.f42522b;
                f1Var.f42535e = (ArrayList) obj;
                b61 b61Var = f1Var.f25815a;
                if (b61Var.D) {
                    b61Var.V2.N(true);
                    return;
                }
                return;
            case 1:
                y1 y1Var = (y1) this.f42522b;
                y1Var.f42781n = ((ArrayList) obj).size();
                b61 b61Var2 = y1Var.f25815a;
                if (b61Var2 != null && (x51Var = b61Var2.V2) != null && b61Var2.D) {
                    x51Var.N(true);
                    return;
                }
                return;
            case 2:
                ph.p pVar = (ph.p) this.f42522b;
                String str = (String) obj;
                ArrayList arrayList = pVar.h;
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                    pVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new mg1(16, pVar, str), 120L);
                return;
            case 3:
                ((qh.k) this.f42522b).x(((Integer) obj).intValue());
                return;
            case 4:
                qh.y yVar = (qh.y) this.f42522b;
                yVar.f46323g0.f46255n.P = ((Float) obj).floatValue();
                qh.x xVar = yVar.f46323g0;
                s2 s2Var = xVar.d;
                if (s2Var != null) {
                    s2Var.setVolume(xVar.f46255n.P);
                    return;
                }
                return;
            case 5:
                qh.k0 k0Var = (qh.k0) this.f42522b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = k0Var.f45546c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(k0Var.f45546c);
                    return;
                }
                return;
            case 6:
                qh.d2 d2Var = (qh.d2) this.f42522b;
                d2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new mg1(20, d2Var, (Runnable) obj), 80L);
                return;
            case 7:
                ((a3) this.f42522b).f44904s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.f22249w).start();
                return;
            case 8:
                f9 f9Var = (f9) ((b5) this.f42522b);
                ca caVar = f9Var.f45335x2;
                caVar.U0.p((MessageObject) obj);
                s6 s6Var = caVar.H1;
                int i11 = 0;
                if (s6Var != null && caVar.L1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(s6Var.f46090y);
                    boolean z12 = !isEmpty;
                    ((og0) caVar.f45097g1.f6337c).a(!caVar.U0.k(), false);
                    caVar.f45097g1.setVisibility(0);
                    ViewPropertyAnimator animate = caVar.f45097g1.animate();
                    if (!isEmpty) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).withEndAction(new rv0(15, f9Var, z12)).start();
                }
                if (caVar.f45150x0.j()) {
                    ArrayList arrayList2 = caVar.f45150x0.h;
                    int size = arrayList2.size();
                    while (true) {
                        if (i11 < size) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            s6 s6Var2 = ((qh.x) obj2).f46255n;
                            if (s6Var2 != null && s6Var2.K) {
                                if (!TextUtils.isEmpty(caVar.H1.f46090y)) {
                                    i10 = 2;
                                }
                            }
                        }
                    }
                }
                i10 = -1;
                caVar.l0(i10, true, true);
                return;
            case 9:
                r6 r6Var = (r6) obj;
                y61 y61Var = ((j5) this.f42522b).f45479n;
                if (y61Var != null) {
                    y61Var.setHDRInfo(r6Var);
                    return;
                }
                return;
            case 10:
                b7 b7Var = (b7) this.f42522b;
                eg.d1 d1Var = (eg.d1) obj;
                if (d1Var == null) {
                    b7Var.U();
                    return;
                }
                b7Var.f45016l0 = d1Var.f5154e;
                b7Var.f45015k0 = d1Var.f5155f;
                return;
            case 11:
                ((t7) this.f42522b).f46123n.T.E = ((Integer) obj).intValue();
                return;
            case 12:
                ((y8) this.f42522b).g((Utilities.Callback) obj);
                return;
            case 13:
                sh.r rVar = (sh.r) this.f42522b;
                ArrayList arrayList3 = rVar.f47638b;
                arrayList3.clear();
                arrayList3.addAll((ArrayList) obj);
                i61 i61Var = rVar.f47637a;
                if (i61Var != null && (x51Var2 = i61Var.V2) != null) {
                    x51Var2.N(true);
                    return;
                }
                return;
            case 14:
                th.g gVar = (th.g) this.f42522b;
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = gVar.h;
                if (arrayList5 != null && !arrayList5.isEmpty()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                gVar.h = arrayList4;
                i61 i61Var2 = gVar.f48122e;
                if (i61Var2 != null) {
                    i61Var2.V2.N(z4);
                    return;
                }
                return;
            case 15:
                ((uf.k) this.f42522b).L((TLRPC.User) obj);
                return;
            case 16:
                TLRPC.User user2 = (TLRPC.User) obj;
                xn0 xn0Var = (xn0) ((uf.z) this.f42522b);
                yx yxVar = xn0Var.H0;
                if (user2 != null) {
                    py pyVar = yxVar.G0;
                    if (pyVar != null) {
                        pyVar.K3();
                    }
                    MessagesController.getInstance(yxVar.E0).openApp(user2, 0);
                    xn0Var.R(user2.f20990id, user2);
                    return;
                }
                return;
            case 17:
                vf.k kVar = (vf.k) this.f42522b;
                if (((Integer) obj).intValue() > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (kVar.C != z10) {
                    kVar.C = z10;
                    if (!z10) {
                        kVar.f25815a.x0(0);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                Object[] objArr = (Object[]) obj;
                AndroidUtilities.forEachViews((RecyclerView) ((vf.c0) this.f42522b).f49010s, (h5.d) new ag.d(18));
                return;
            case 19:
                vf.l0 l0Var = (vf.l0) this.f42522b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                l0Var.D = connectedbots;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = null;
                if (connectedbots != null && !connectedbots.connected_bots.isEmpty()) {
                    tL_connectedBot = l0Var.D.connected_bots.get(0);
                } else {
                    tL_connectedBot = null;
                }
                l0Var.E = tL_connectedBot;
                if (tL_connectedBot == null) {
                    user = null;
                } else {
                    user = l0Var.getMessagesController().getUser(Long.valueOf(l0Var.E.bot_id));
                }
                l0Var.J = user;
                TL_account.TL_connectedBot tL_connectedBot2 = l0Var.E;
                if (tL_connectedBot2 != null) {
                    makeDefault = TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights);
                } else {
                    makeDefault = TL_account.TL_businessBotRights.makeDefault();
                }
                l0Var.G = makeDefault;
                TL_account.TL_connectedBot tL_connectedBot3 = l0Var.E;
                if (tL_connectedBot3 != null) {
                    z11 = tL_connectedBot3.recipients.exclude_selected;
                } else {
                    z11 = true;
                }
                l0Var.F = z11;
                vf.v vVar = l0Var.v;
                if (vVar != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    vVar.i(tL_businessBotRecipients);
                }
                i61 i61Var3 = l0Var.f49112c;
                if (i61Var3 != null && (x51Var3 = i61Var3.V2) != null) {
                    x51Var3.N(true);
                }
                l0Var.Y(true);
                l0Var.Q = true;
                return;
            case 20:
                vf.n0 n0Var = (vf.n0) this.f42522b;
                n0Var.f49148w = n0Var.f49143e[((Integer) obj).intValue()];
                n0Var.V(true);
                return;
            case 21:
                vf.m1 m1Var = (vf.m1) this.f42522b;
                m1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", m1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                xn xnVar = new xn(bundle);
                xnVar.f43438z9 = true;
                m1Var.presentFragment(xnVar);
                return;
            case 22:
                AndroidUtilities.hideKeyboard((vf.g1) this.f42522b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 23:
                i3 i3Var = (i3) this.f42522b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i12 = i3Var.f49788b;
                int i13 = i3Var.f49787a;
                r3 r3Var = i3Var.f49790e;
                if (richMessage != null) {
                    ArrayList arrayList6 = r3Var.f49988i3;
                    ArrayList arrayList7 = r3Var.f49988i3;
                    if (i13 < arrayList6.size() && i12 < arrayList7.size()) {
                        wh.d2 d2Var2 = r3Var.G3;
                        if (d2Var2 != null) {
                            d2Var2.d();
                        }
                        f3 f3Var = r3Var.f49992k3;
                        if (f3Var != null) {
                            f3Var.f(false);
                        }
                        wh.a aVar2 = (wh.a) arrayList7.get(i13);
                        wh.a aVar3 = (wh.a) arrayList7.get(i12);
                        CharSequence charSequence = "";
                        if (!r3.A3(aVar2.f49617b)) {
                            editable = "";
                        } else {
                            editable = r3Var.M4(aVar2);
                        }
                        if (r3.A3(aVar3.f49617b)) {
                            charSequence = r3Var.M4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(i3Var.f49789c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(i3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList8 = new ArrayList();
                        r3.W2(arrayList8, richMessage.blocks, null);
                        if (arrayList8.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            v5.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList8.add(new wh.a(pageblockparagraph, aVar2.f49618c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                wh.a aVar4 = (wh.a) arrayList8.get(0);
                                if (r3.A3(aVar4.f49617b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) v5.A(aVar4.f49617b));
                                    v5.d(aVar4.f49617b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    v5.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList8.add(0, new wh.a(pageblockparagraph2, aVar2.f49618c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                wh.a aVar5 = (wh.a) l.d.i(1, arrayList8);
                                if (r3.A3(aVar5.f49617b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(v5.A(aVar5.f49617b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    v5.d(aVar5.f49617b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    v5.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList8.add(new wh.a(pageblockparagraph3, aVar3.f49618c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = r3Var.f49986h3;
                        if (richMessage2 == null) {
                            r3Var.f49986h3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList9 = richMessage.photos;
                            if (arrayList9 != null) {
                                richMessage2.photos.addAll(arrayList9);
                            }
                            ArrayList<TLRPC.Document> arrayList10 = richMessage.documents;
                            if (arrayList10 != null) {
                                r3Var.f49986h3.documents.addAll(arrayList10);
                            }
                        }
                        for (int i14 = 0; i14 < arrayList8.size(); i14++) {
                            r3Var.v4((wh.a) arrayList8.get(i14));
                        }
                        while (i12 >= i13) {
                            arrayList7.remove(i12);
                            i12--;
                        }
                        arrayList7.addAll(i13, arrayList8);
                        r3Var.s4();
                        r3Var.V2.N(false);
                        wh.d2 d2Var3 = r3Var.G3;
                        if (d2Var3 != null) {
                            d2Var3.h();
                        }
                        r3Var.f49980e3.onContentChanged();
                        if (arrayList8.isEmpty()) {
                            aVar = null;
                        } else {
                            aVar = (wh.a) l.d.i(1, arrayList8);
                        }
                        r3Var.post(new vf.d0(11, i3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ((wh.l) this.f42522b).f49846a.f49930r.U1((TL_iv.RichMessage) obj);
                return;
            case 25:
                ((wh.z1) this.f42522b).M.U1((TL_iv.RichMessage) obj);
                return;
            default:
                r3 r3Var2 = (r3) this.f42522b;
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
