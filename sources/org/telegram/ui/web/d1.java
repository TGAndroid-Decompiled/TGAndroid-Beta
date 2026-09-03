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
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wn0;
import org.telegram.ui.Components.x61;
import org.telegram.ui.bh1;
import org.telegram.ui.py;
import org.telegram.ui.xn;
import org.telegram.ui.yx;
import qh.a5;
import qh.a7;
import qh.ba;
import qh.e9;
import qh.i5;
import qh.q6;
import qh.r6;
import qh.s7;
import qh.x8;
import qh.z2;
import wh.f3;
import wh.i3;
import wh.r3;
import wh.v5;
public final class d1 implements Utilities.Callback {
    public final int f42484a;
    public final Object f42485b;

    public d1(Object obj, int i10) {
        this.f42484a = i10;
        this.f42485b = obj;
    }

    @Override
    public final void run(Object obj) {
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
        wh.a aVar;
        switch (this.f42484a) {
            case 0:
                f1 f1Var = (f1) this.f42485b;
                f1Var.f42498e = (ArrayList) obj;
                a61 a61Var = f1Var.f25523a;
                if (a61Var.D) {
                    a61Var.V2.N(true);
                    return;
                }
                return;
            case 1:
                x1 x1Var = (x1) this.f42485b;
                x1Var.f42735n = ((ArrayList) obj).size();
                a61 a61Var2 = x1Var.f25523a;
                if (a61Var2 != null && (w51Var = a61Var2.V2) != null && a61Var2.D) {
                    w51Var.N(true);
                    return;
                }
                return;
            case 2:
                ph.p pVar = (ph.p) this.f42485b;
                String str = (String) obj;
                ArrayList arrayList = pVar.h;
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                    pVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new bh1(15, pVar, str), 120L);
                return;
            case 3:
                ((qh.k) this.f42485b).x(((Integer) obj).intValue());
                return;
            case 4:
                qh.y yVar = (qh.y) this.f42485b;
                yVar.f46333g0.f46295n.P = ((Float) obj).floatValue();
                qh.x xVar = yVar.f46333g0;
                s2 s2Var = xVar.d;
                if (s2Var != null) {
                    s2Var.setVolume(xVar.f46295n.P);
                    return;
                }
                return;
            case 5:
                qh.k0 k0Var = (qh.k0) this.f42485b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = k0Var.f45603c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(k0Var.f45603c);
                    return;
                }
                return;
            case 6:
                qh.c2 c2Var = (qh.c2) this.f42485b;
                c2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new bh1(19, c2Var, (Runnable) obj), 80L);
                return;
            case 7:
                ((z2) this.f42485b).f46399s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.f22251w).start();
                return;
            case 8:
                e9 e9Var = (e9) ((a5) this.f42485b);
                ba baVar = e9Var.f45309x2;
                baVar.U0.p((MessageObject) obj);
                r6 r6Var = baVar.H1;
                int i11 = 0;
                if (r6Var != null && baVar.L1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(r6Var.f46041y);
                    boolean z12 = !isEmpty;
                    ((og0) baVar.f45063g1.f6337c).a(!baVar.U0.k(), false);
                    baVar.f45063g1.setVisibility(0);
                    ViewPropertyAnimator animate = baVar.f45063g1.animate();
                    if (!isEmpty) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).withEndAction(new qv0(15, e9Var, z12)).start();
                }
                if (baVar.f45116x0.j()) {
                    ArrayList arrayList2 = baVar.f45116x0.h;
                    int size = arrayList2.size();
                    while (true) {
                        if (i11 < size) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            r6 r6Var2 = ((qh.x) obj2).f46295n;
                            if (r6Var2 != null && r6Var2.K) {
                                if (!TextUtils.isEmpty(baVar.H1.f46041y)) {
                                    i10 = 2;
                                }
                            }
                        }
                    }
                }
                i10 = -1;
                baVar.l0(i10, true, true);
                return;
            case 9:
                q6 q6Var = (q6) obj;
                x61 x61Var = ((i5) this.f42485b).f45449n;
                if (x61Var != null) {
                    x61Var.setHDRInfo(q6Var);
                    return;
                }
                return;
            case 10:
                a7 a7Var = (a7) this.f42485b;
                eg.d1 d1Var = (eg.d1) obj;
                if (d1Var == null) {
                    a7Var.U();
                    return;
                }
                a7Var.f44993l0 = d1Var.f5154e;
                a7Var.f44992k0 = d1Var.f5155f;
                return;
            case 11:
                ((s7) this.f42485b).f46103n.T.E = ((Integer) obj).intValue();
                return;
            case 12:
                ((x8) this.f42485b).g((Utilities.Callback) obj);
                return;
            case 13:
                sh.r rVar = (sh.r) this.f42485b;
                ArrayList arrayList3 = rVar.f47674b;
                arrayList3.clear();
                arrayList3.addAll((ArrayList) obj);
                h61 h61Var = rVar.f47673a;
                if (h61Var != null && (w51Var2 = h61Var.V2) != null) {
                    w51Var2.N(true);
                    return;
                }
                return;
            case 14:
                th.g gVar = (th.g) this.f42485b;
                ArrayList arrayList4 = (ArrayList) obj;
                ArrayList arrayList5 = gVar.h;
                if (arrayList5 != null && !arrayList5.isEmpty()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                gVar.h = arrayList4;
                h61 h61Var2 = gVar.f48158e;
                if (h61Var2 != null) {
                    h61Var2.V2.N(z4);
                    return;
                }
                return;
            case 15:
                ((uf.k) this.f42485b).L((TLRPC.User) obj);
                return;
            case 16:
                TLRPC.User user2 = (TLRPC.User) obj;
                wn0 wn0Var = (wn0) ((uf.z) this.f42485b);
                yx yxVar = wn0Var.H0;
                if (user2 != null) {
                    py pyVar = yxVar.G0;
                    if (pyVar != null) {
                        pyVar.K3();
                    }
                    MessagesController.getInstance(yxVar.E0).openApp(user2, 0);
                    wn0Var.R(user2.f20992id, user2);
                    return;
                }
                return;
            case 17:
                vf.k kVar = (vf.k) this.f42485b;
                if (((Integer) obj).intValue() > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (kVar.C != z10) {
                    kVar.C = z10;
                    if (!z10) {
                        kVar.f25523a.x0(0);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                Object[] objArr = (Object[]) obj;
                AndroidUtilities.forEachViews((RecyclerView) ((vf.c0) this.f42485b).f49046s, (h5.d) new ag.d(18));
                return;
            case 19:
                vf.l0 l0Var = (vf.l0) this.f42485b;
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
                h61 h61Var3 = l0Var.f49148c;
                if (h61Var3 != null && (w51Var3 = h61Var3.V2) != null) {
                    w51Var3.N(true);
                }
                l0Var.Y(true);
                l0Var.Q = true;
                return;
            case 20:
                vf.n0 n0Var = (vf.n0) this.f42485b;
                n0Var.f49184w = n0Var.f49179e[((Integer) obj).intValue()];
                n0Var.V(true);
                return;
            case 21:
                vf.m1 m1Var = (vf.m1) this.f42485b;
                m1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", m1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                xn xnVar = new xn(bundle);
                xnVar.f43416z9 = true;
                m1Var.presentFragment(xnVar);
                return;
            case 22:
                AndroidUtilities.hideKeyboard((vf.g1) this.f42485b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 23:
                i3 i3Var = (i3) this.f42485b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i12 = i3Var.f49824b;
                int i13 = i3Var.f49823a;
                r3 r3Var = i3Var.f49826e;
                if (richMessage != null) {
                    ArrayList arrayList6 = r3Var.f50024i3;
                    ArrayList arrayList7 = r3Var.f50024i3;
                    if (i13 < arrayList6.size() && i12 < arrayList7.size()) {
                        wh.d2 d2Var = r3Var.G3;
                        if (d2Var != null) {
                            d2Var.d();
                        }
                        f3 f3Var = r3Var.f50028k3;
                        if (f3Var != null) {
                            f3Var.f(false);
                        }
                        wh.a aVar2 = (wh.a) arrayList7.get(i13);
                        wh.a aVar3 = (wh.a) arrayList7.get(i12);
                        CharSequence charSequence = "";
                        if (!r3.z3(aVar2.f49653b)) {
                            editable = "";
                        } else {
                            editable = r3Var.L4(aVar2);
                        }
                        if (r3.z3(aVar3.f49653b)) {
                            charSequence = r3Var.L4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(i3Var.f49825c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(i3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList8 = new ArrayList();
                        r3.V2(arrayList8, richMessage.blocks, null);
                        if (arrayList8.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            v5.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList8.add(new wh.a(pageblockparagraph, aVar2.f49654c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                wh.a aVar4 = (wh.a) arrayList8.get(0);
                                if (r3.z3(aVar4.f49653b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) v5.A(aVar4.f49653b));
                                    v5.d(aVar4.f49653b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    v5.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList8.add(0, new wh.a(pageblockparagraph2, aVar2.f49654c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                wh.a aVar5 = (wh.a) l.d.i(1, arrayList8);
                                if (r3.z3(aVar5.f49653b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(v5.A(aVar5.f49653b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    v5.d(aVar5.f49653b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    v5.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList8.add(new wh.a(pageblockparagraph3, aVar3.f49654c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = r3Var.f50022h3;
                        if (richMessage2 == null) {
                            r3Var.f50022h3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList9 = richMessage.photos;
                            if (arrayList9 != null) {
                                richMessage2.photos.addAll(arrayList9);
                            }
                            ArrayList<TLRPC.Document> arrayList10 = richMessage.documents;
                            if (arrayList10 != null) {
                                r3Var.f50022h3.documents.addAll(arrayList10);
                            }
                        }
                        for (int i14 = 0; i14 < arrayList8.size(); i14++) {
                            r3Var.u4((wh.a) arrayList8.get(i14));
                        }
                        while (i12 >= i13) {
                            arrayList7.remove(i12);
                            i12--;
                        }
                        arrayList7.addAll(i13, arrayList8);
                        r3Var.r4();
                        r3Var.V2.N(false);
                        wh.d2 d2Var2 = r3Var.G3;
                        if (d2Var2 != null) {
                            d2Var2.h();
                        }
                        r3Var.f50016e3.onContentChanged();
                        if (arrayList8.isEmpty()) {
                            aVar = null;
                        } else {
                            aVar = (wh.a) l.d.i(1, arrayList8);
                        }
                        r3Var.post(new vf.k0(10, i3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ((wh.l) this.f42485b).f49882a.f49966r.T1((TL_iv.RichMessage) obj);
                return;
            case 25:
                ((wh.z1) this.f42485b).M.T1((TL_iv.RichMessage) obj);
                return;
            default:
                r3 r3Var2 = (r3) this.f42485b;
                String str2 = (String) obj;
                r3Var2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    r3Var2.Q1(pageblockmath);
                    return;
                }
                return;
        }
    }
}
