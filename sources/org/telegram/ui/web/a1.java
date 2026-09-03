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
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.w61;
import org.telegram.ui.qy;
import org.telegram.ui.sg1;
import org.telegram.ui.zn;
import org.telegram.ui.zx;
import ph.a3;
import ph.a9;
import ph.c5;
import ph.c7;
import ph.da;
import ph.h9;
import ph.k5;
import ph.s6;
import ph.t6;
import ph.u7;
import vh.g3;
import vh.j3;
import vh.s3;
import vh.w5;
public final class a1 implements Utilities.Callback {
    public final int f39366a;
    public final Object f39367b;

    public a1(Object obj, int i10) {
        this.f39366a = i10;
        this.f39367b = obj;
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
        switch (this.f39366a) {
            case 0:
                y0 y0Var = ((BotWebViewContainer$WebViewProxy) this.f39367b).f39357b;
                StringBuilder sb = new StringBuilder("window.navigator.__share__receive(");
                if (((Boolean) obj).booleanValue()) {
                    str = "";
                } else {
                    str = "'abort'";
                }
                sb.append(str);
                sb.append(")");
                y0Var.d(sb.toString());
                return;
            case 1:
                g1 g1Var = (g1) this.f39367b;
                g1Var.e = (ArrayList) obj;
                a61 a61Var = g1Var.f23568a;
                if (a61Var.D) {
                    a61Var.V2.N(true);
                    return;
                }
                return;
            case 2:
                y1 y1Var = (y1) this.f39367b;
                y1Var.f39662n = ((ArrayList) obj).size();
                a61 a61Var2 = y1Var.f23568a;
                if (a61Var2 != null && (w51Var = a61Var2.V2) != null && a61Var2.D) {
                    w51Var.N(true);
                    return;
                }
                return;
            case 3:
                ((ph.k) this.f39367b).x(((Integer) obj).intValue());
                return;
            case 4:
                ph.y yVar = (ph.y) this.f39367b;
                yVar.f42621g0.f42562n.P = ((Float) obj).floatValue();
                ph.x xVar = yVar.f42621g0;
                t2 t2Var = xVar.d;
                if (t2Var != null) {
                    t2Var.setVolume(xVar.f42562n.P);
                    return;
                }
                return;
            case 5:
                ph.k0 k0Var = (ph.k0) this.f39367b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = k0Var.f41871c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(k0Var.f41871c);
                    return;
                }
                return;
            case 6:
                ph.d2 d2Var = (ph.d2) this.f39367b;
                d2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new sg1(20, d2Var, (Runnable) obj), 80L);
                return;
            case 7:
                ((a3) this.f39367b).f41293s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.r1.f20518w).start();
                return;
            case 8:
                h9 h9Var = (h9) ((c5) this.f39367b);
                da daVar = h9Var.f41755x2;
                daVar.U0.p((MessageObject) obj);
                t6 t6Var = daVar.H1;
                int i11 = 0;
                if (t6Var != null && daVar.L1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(t6Var.f42447y);
                    boolean z12 = !isEmpty;
                    ((ng0) daVar.f41532g1.f5291c).a(!daVar.U0.k(), false);
                    daVar.f41532g1.setVisibility(0);
                    ViewPropertyAnimator animate = daVar.f41532g1.animate();
                    if (!isEmpty) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    animate.alpha(f10).withEndAction(new kv0(15, h9Var, z12)).start();
                }
                if (daVar.f41585x0.j()) {
                    ArrayList arrayList = daVar.f41585x0.h;
                    int size = arrayList.size();
                    while (true) {
                        if (i11 < size) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
                            t6 t6Var2 = ((ph.x) obj2).f42562n;
                            if (t6Var2 != null && t6Var2.K) {
                                if (!TextUtils.isEmpty(daVar.H1.f42447y)) {
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
                s6 s6Var = (s6) obj;
                w61 w61Var = ((k5) this.f39367b).f41904n;
                if (w61Var != null) {
                    w61Var.setHDRInfo(s6Var);
                    return;
                }
                return;
            case 10:
                c7 c7Var = (c7) this.f39367b;
                dg.f1 f1Var = (dg.f1) obj;
                if (f1Var == null) {
                    c7Var.U();
                    return;
                }
                c7Var.f41436l0 = f1Var.e;
                c7Var.f41435k0 = f1Var.f4514f;
                return;
            case 11:
                ((u7) this.f39367b).f42481n.T.E = ((Integer) obj).intValue();
                return;
            case 12:
                ((a9) this.f39367b).g((Utilities.Callback) obj);
                return;
            case 13:
                rh.r rVar = (rh.r) this.f39367b;
                ArrayList arrayList2 = rVar.f43784b;
                arrayList2.clear();
                arrayList2.addAll((ArrayList) obj);
                g61 g61Var = rVar.f43783a;
                if (g61Var != null && (w51Var2 = g61Var.V2) != null) {
                    w51Var2.N(true);
                    return;
                }
                return;
            case 14:
                sh.g gVar = (sh.g) this.f39367b;
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
                ((tf.k) this.f39367b).L((TLRPC.User) obj);
                return;
            case 16:
                TLRPC.User user2 = (TLRPC.User) obj;
                vn0 vn0Var = (vn0) ((tf.z) this.f39367b);
                zx zxVar = vn0Var.H0;
                if (user2 != null) {
                    qy qyVar = zxVar.G0;
                    if (qyVar != null) {
                        qyVar.K3();
                    }
                    MessagesController.getInstance(zxVar.E0).openApp(user2, 0);
                    vn0Var.R(user2.f19306id, user2);
                    return;
                }
                return;
            case 17:
                uf.k kVar = (uf.k) this.f39367b;
                if (((Integer) obj).intValue() > AndroidUtilities.dp(20.0f)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (kVar.C != z10) {
                    kVar.C = z10;
                    if (!z10) {
                        kVar.f23568a.x0(0);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                Object[] objArr = (Object[]) obj;
                AndroidUtilities.forEachViews((RecyclerView) ((uf.c0) this.f39367b).f45333s, (h5.d) new nh.e(17));
                return;
            case 19:
                uf.l0 l0Var = (uf.l0) this.f39367b;
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
                uf.v vVar = l0Var.v;
                if (vVar != null) {
                    if (tL_connectedBot3 != null) {
                        tL_businessBotRecipients = tL_connectedBot3.recipients;
                    }
                    vVar.i(tL_businessBotRecipients);
                }
                g61 g61Var3 = l0Var.f45429c;
                if (g61Var3 != null && (w51Var3 = g61Var3.V2) != null) {
                    w51Var3.N(true);
                }
                l0Var.Y(true);
                l0Var.Q = true;
                return;
            case 20:
                uf.n0 n0Var = (uf.n0) this.f39367b;
                n0Var.f45460w = n0Var.e[((Integer) obj).intValue()];
                n0Var.V(true);
                return;
            case 21:
                uf.m1 m1Var = (uf.m1) this.f39367b;
                m1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", m1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                zn znVar = new zn(bundle);
                znVar.f40835z9 = true;
                m1Var.presentFragment(znVar);
                return;
            case 22:
                AndroidUtilities.hideKeyboard((uf.g1) this.f39367b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                return;
            case 23:
                j3 j3Var = (j3) this.f39367b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i12 = j3Var.f46029b;
                int i13 = j3Var.f46028a;
                s3 s3Var = j3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList5 = s3Var.f46217i3;
                    ArrayList arrayList6 = s3Var.f46217i3;
                    if (i13 < arrayList5.size() && i12 < arrayList6.size()) {
                        vh.d2 d2Var2 = s3Var.G3;
                        if (d2Var2 != null) {
                            d2Var2.d();
                        }
                        g3 g3Var = s3Var.f46221k3;
                        if (g3Var != null) {
                            g3Var.f(false);
                        }
                        vh.a aVar2 = (vh.a) arrayList6.get(i13);
                        vh.a aVar3 = (vh.a) arrayList6.get(i12);
                        CharSequence charSequence = "";
                        if (!s3.z3(aVar2.f45853b)) {
                            editable = "";
                        } else {
                            editable = s3Var.L4(aVar2);
                        }
                        if (s3.z3(aVar3.f45853b)) {
                            charSequence = s3Var.L4(aVar3);
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(editable.subSequence(0, Math.max(0, Math.min(j3Var.f46030c, editable.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence.subSequence(Math.max(0, Math.min(j3Var.d, charSequence.length())), charSequence.length()));
                        ArrayList arrayList7 = new ArrayList();
                        s3.V2(arrayList7, richMessage.blocks, null);
                        if (arrayList7.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            w5.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList7.add(new vh.a(pageblockparagraph, aVar2.f45854c, aVar2.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                vh.a aVar4 = (vh.a) arrayList7.get(0);
                                if (s3.z3(aVar4.f45853b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) w5.A(aVar4.f45853b));
                                    w5.d(aVar4.f45853b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    w5.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList7.add(0, new vh.a(pageblockparagraph2, aVar2.f45854c, aVar2.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                vh.a aVar5 = (vh.a) kf.k0.i(1, arrayList7);
                                if (s3.z3(aVar5.f45853b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(w5.A(aVar5.f45853b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    w5.d(aVar5.f45853b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    w5.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList7.add(new vh.a(pageblockparagraph3, aVar3.f45854c, aVar3.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = s3Var.f46215h3;
                        if (richMessage2 == null) {
                            s3Var.f46215h3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList8 = richMessage.photos;
                            if (arrayList8 != null) {
                                richMessage2.photos.addAll(arrayList8);
                            }
                            ArrayList<TLRPC.Document> arrayList9 = richMessage.documents;
                            if (arrayList9 != null) {
                                s3Var.f46215h3.documents.addAll(arrayList9);
                            }
                        }
                        for (int i14 = 0; i14 < arrayList7.size(); i14++) {
                            s3Var.u4((vh.a) arrayList7.get(i14));
                        }
                        while (i12 >= i13) {
                            arrayList6.remove(i12);
                            i12--;
                        }
                        arrayList6.addAll(i13, arrayList7);
                        s3Var.r4();
                        s3Var.V2.N(false);
                        vh.d2 d2Var3 = s3Var.G3;
                        if (d2Var3 != null) {
                            d2Var3.h();
                        }
                        s3Var.f46209e3.onContentChanged();
                        if (arrayList7.isEmpty()) {
                            aVar = null;
                        } else {
                            aVar = (vh.a) kf.k0.i(1, arrayList7);
                        }
                        s3Var.post(new uf.d0(11, j3Var, aVar));
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ((vh.l) this.f39367b).f46058a.f46156r.T1((TL_iv.RichMessage) obj);
                return;
            case 25:
                ((vh.y1) this.f39367b).M.T1((TL_iv.RichMessage) obj);
                return;
            default:
                s3 s3Var2 = (s3) this.f39367b;
                String str2 = (String) obj;
                s3Var2.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    s3Var2.Q1(pageblockmath);
                    return;
                }
                return;
        }
    }
}
