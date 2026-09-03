package org.telegram.ui.web;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JsPromptResult;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.di;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vt;
import org.telegram.ui.wc0;
import qh.c8;
import qh.f8;
import qh.j7;
import qh.m7;
import qh.p7;
import qh.q7;
import qh.w7;
import sh.d3;
import wh.c4;
import wh.i5;
import wh.l5;
import wh.o3;
import wh.r3;
import wh.y2;
import wh.z5;
public final class m implements org.telegram.ui.ActionBar.c2, jl0, kl0, androidx.car.app.utils.e, Utilities.Callback3Return, wc0, wh.m0, vt, c4 {
    public final int f42595a;
    public final Object f42596b;
    public final Object f42597c;

    public m(int i10, Object obj, Object obj2) {
        this.f42595a = i10;
        this.f42596b = obj;
        this.f42597c = obj2;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public q70 a(wh.e1 e1Var) {
        wh.q qVar = (wh.q) ((q5.c0) this.f42596b).f44558b;
        q70 q70Var = new q70(qVar, (g6) this.f42597c, e1Var, false, false, true);
        qVar.E = q70Var;
        return q70Var;
    }

    @Override
    public void b0() {
        switch (this.f42595a) {
            case 12:
                ((wh.i0) this.f42596b).i();
                ((wh.h0) this.f42597c).W();
                return;
            default:
                i5 i5Var = (i5) this.f42596b;
                l5 l5Var = (l5) this.f42597c;
                TL_iv.pageTableCell pagetablecell = l5Var.f49904b;
                if (pagetablecell != null) {
                    z5.d(pagetablecell, l5Var.f49903a.getText());
                }
                y2 y2Var = i5Var.B;
                if (y2Var != null && i5Var.f50211a != null) {
                    r3.N1(y2Var.f50207a);
                    return;
                }
                return;
        }
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        g6 g6Var;
        int i11;
        int i12;
        long clientUserId;
        g6 g6Var2;
        g6 g6Var3;
        int i13;
        g6 g6Var4;
        int i14;
        g6 g6Var5;
        int i15;
        g6 g6Var6;
        int i16;
        g6 g6Var7;
        int i17;
        int i18;
        g6 g6Var8;
        int i19;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i20;
        g6 g6Var9;
        w7 w7Var = (w7) this.f42596b;
        Context context = (Context) this.f42597c;
        ArrayList arrayList2 = w7Var.I;
        a0.h hVar = w7Var.f46263b;
        q7 q7Var = w7Var.f46271x;
        ArrayList arrayList3 = w7Var.f46264c;
        HashMap hashMap = w7Var.d;
        c8 c8Var = w7Var.T;
        if (i10 >= 0 && i10 < arrayList2.size()) {
            m7 m7Var = (m7) arrayList2.get(i10);
            int i21 = m7Var.f2505a;
            int i22 = 0;
            if (i21 == 3) {
                if (m7Var.f45763n && c8Var.C) {
                    i20 = ((h3) c8Var).currentAccount;
                    boolean z4 = c8Var.H;
                    TLRPC.InputPeer inputPeer = c8Var.f45188c;
                    p7 p7Var = new p7(w7Var, 0);
                    g6Var9 = ((h3) c8Var).resourcesProvider;
                    new j7(context, i20, z4, inputPeer, p7Var, g6Var9).show();
                    return;
                }
                int i23 = m7Var.f45758i;
                if (i23 == 1) {
                    if (c8Var.K == 1 || c8.J0(c8Var).isEmpty()) {
                        c8Var.J = 1;
                        c8Var.f45187b.D(1);
                    }
                    c8Var.K = 1;
                    w7Var.f(true);
                } else if (i23 == 3) {
                    if (c8Var.K == 3 || (c8Var.f45191n.isEmpty() && c8Var.f45192r.isEmpty())) {
                        c8Var.J = 3;
                        c8Var.f45187b.D(1);
                    }
                    c8Var.K = 3;
                    w7Var.f(true);
                } else if (i23 == 2) {
                    if (c8Var.K == 2) {
                        c8Var.J = 2;
                        c8Var.f45187b.D(1);
                    }
                    c8Var.K = 2;
                    w7Var.f(true);
                } else if (i23 == 4) {
                    if (c8Var.K == 4) {
                        c8Var.J = 4;
                        c8Var.f45187b.D(1);
                    }
                    c8Var.K = 4;
                    w7Var.f(true);
                } else {
                    if (i23 > 0) {
                        arrayList3.clear();
                        hashMap.clear();
                        c8Var.K = m7Var.f45758i;
                        q7Var.f46414c.a();
                    } else {
                        TLRPC.Chat chat = m7Var.h;
                        if (chat != null) {
                            long j10 = chat.f20845id;
                            if (c8.d1(c8Var, chat) > 200) {
                                try {
                                    w7Var.performHapticFeedback(3, 1);
                                } catch (Throwable unused) {
                                }
                                Context context2 = w7Var.getContext();
                                g6Var7 = ((h3) c8Var).resourcesProvider;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, g6Var7);
                                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.GroupTooLarge);
                                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.GroupTooLargeMessage);
                                l.d.C(R.string.OK, alertDialog$Builder, null);
                            } else if (!hashMap.containsKey(Long.valueOf(j10))) {
                                i17 = ((h3) c8Var).currentAccount;
                                TLRPC.Chat chat2 = MessagesController.getInstance(i17).getChat(Long.valueOf(j10));
                                i18 = ((h3) c8Var).currentAccount;
                                TLRPC.ChatFull chatFull = MessagesController.getInstance(i18).getChatFull(j10);
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && chatFull.participants.participants.size() >= chatFull.participants_count - 1) {
                                    w7Var.d(j10, chatFull.participants);
                                } else {
                                    org.telegram.ui.ActionBar.d2 d2Var = w7Var.D;
                                    if (d2Var != null) {
                                        d2Var.dismiss();
                                        w7Var.D = null;
                                    }
                                    w7Var.E = j10;
                                    Context context3 = w7Var.getContext();
                                    g6Var8 = ((h3) c8Var).resourcesProvider;
                                    org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(context3, 3, g6Var8);
                                    w7Var.D = d2Var2;
                                    d2Var2.q(50L);
                                    i19 = ((h3) c8Var).currentAccount;
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i19);
                                    messagesStorage.getStorageQueue().postRunnable(new di(w7Var, chat2, messagesStorage, j10));
                                }
                                if (!TextUtils.isEmpty(w7Var.F)) {
                                    q7Var.setText("");
                                    w7Var.F = null;
                                    w7Var.g(false);
                                }
                            } else {
                                ArrayList arrayList4 = (ArrayList) hashMap.get(Long.valueOf(j10));
                                if (arrayList4 != null) {
                                    int size = arrayList4.size();
                                    while (i22 < size) {
                                        Object obj = arrayList4.get(i22);
                                        i22++;
                                        hVar.k(Boolean.FALSE, ((Long) obj).longValue());
                                    }
                                }
                                hashMap.remove(Long.valueOf(j10));
                                w7Var.i(true);
                            }
                        } else {
                            TLRPC.User user = m7Var.f45757g;
                            if (user != null) {
                                if (w7Var.f46262a == 0) {
                                    c8Var.K = 0;
                                }
                                long j11 = user.f20992id;
                                HashSet hashSet = new HashSet(arrayList3);
                                if (arrayList3.contains(Long.valueOf(j11))) {
                                    Iterator it = hashMap.entrySet().iterator();
                                    while (it.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it.next();
                                        if (((ArrayList) entry.getValue()).contains(Long.valueOf(j11))) {
                                            it.remove();
                                            hashSet.addAll((Collection) entry.getValue());
                                        }
                                    }
                                    hashSet.remove(Long.valueOf(j11));
                                    hVar.k(Boolean.FALSE, j11);
                                } else {
                                    Iterator it2 = hashMap.entrySet().iterator();
                                    while (it2.hasNext()) {
                                        Map.Entry entry2 = (Map.Entry) it2.next();
                                        if (((ArrayList) entry2.getValue()).contains(Long.valueOf(j11))) {
                                            it2.remove();
                                            hashSet.addAll((Collection) entry2.getValue());
                                        }
                                    }
                                    hashSet.add(Long.valueOf(j11));
                                    if (!TextUtils.isEmpty(w7Var.F)) {
                                        q7Var.setText("");
                                        w7Var.F = null;
                                        w7Var.g(false);
                                    }
                                    hVar.k(Boolean.TRUE, j11);
                                }
                                arrayList3.clear();
                                arrayList3.addAll(hashSet);
                                w7Var.i(true);
                            }
                        }
                    }
                    w7Var.f(true);
                    w7Var.e(true);
                    q7Var.H = true;
                }
            } else if (i21 == 7) {
                if (view instanceof o8) {
                    o8 o8Var = (o8) view;
                    o8Var.setChecked(!o8Var.b());
                    m7Var.f45760k = o8Var.b();
                    int i24 = m7Var.f45754c;
                    if (i24 == 0) {
                        boolean b10 = o8Var.b();
                        c8Var.f45195x = b10;
                        if (c8Var.K == 4) {
                            i22 = 1;
                        }
                        if (b10) {
                            f3 f3Var = c8Var.container;
                            g6Var6 = ((h3) c8Var).resourcesProvider;
                            qc qcVar = new qc(f3Var, g6Var6);
                            int i25 = R.raw.ic_save_to_gallery;
                            if (i22 != 0) {
                                i16 = R.string.StoryEnabledScreenshotsShare;
                            } else {
                                i16 = R.string.StoryEnabledScreenshots;
                            }
                            ic G = qcVar.G(i25, 4, LocaleController.getString(i16));
                            G.f27778j = 5000;
                            G.k(true);
                            return;
                        }
                        f3 f3Var2 = c8Var.container;
                        g6Var5 = ((h3) c8Var).resourcesProvider;
                        qc qcVar2 = new qc(f3Var2, g6Var5);
                        int i26 = R.raw.passcode_lock_close;
                        if (i22 != 0) {
                            i15 = R.string.StoryDisabledScreenshotsShare;
                        } else {
                            i15 = R.string.StoryDisabledScreenshots;
                        }
                        ic G2 = qcVar2.G(i26, 4, LocaleController.getString(i15));
                        G2.f27778j = 5000;
                        G2.k(true);
                    } else if (i24 == 1) {
                        boolean b11 = o8Var.b();
                        c8Var.f45196y = b11;
                        boolean z10 = c8Var.f45188c instanceof TLRPC.TL_inputPeerChannel;
                        if (b11) {
                            f3 f3Var3 = c8Var.container;
                            g6Var4 = ((h3) c8Var).resourcesProvider;
                            qc qcVar3 = new qc(f3Var3, g6Var4);
                            int i27 = R.raw.msg_story_keep;
                            if (z10) {
                                i14 = R.string.StoryChannelEnableKeep;
                            } else {
                                i14 = R.string.StoryEnableKeep;
                            }
                            ic G3 = qcVar3.G(i27, 4, LocaleController.getString(i14));
                            G3.f27778j = 5000;
                            G3.k(true);
                        } else {
                            f3 f3Var4 = c8Var.container;
                            g6Var3 = ((h3) c8Var).resourcesProvider;
                            qc qcVar4 = new qc(f3Var4, g6Var3);
                            int i28 = R.raw.fire_on;
                            if (z10) {
                                i13 = R.string.StoryChannelDisableKeep;
                            } else {
                                i13 = R.string.StoryDisableKeep;
                            }
                            ic G4 = qcVar4.G(i28, 4, LocaleController.getString(i13));
                            G4.f27778j = 5000;
                            G4.k(true);
                        }
                        w7Var.g(true);
                    } else if (i24 == 2) {
                        c8Var.f45194w = o8Var.b();
                        w7Var.g(true);
                    }
                }
            } else if (i21 == 9) {
                int i29 = m7Var.f45766q;
                if (i29 == 0) {
                    f8 f8Var = c8Var.Z;
                    if (f8Var != null) {
                        f8Var.run();
                    }
                } else if (i29 == 1) {
                    TLRPC.InputPeer inputPeer2 = c8Var.f45188c;
                    if (inputPeer2 == null) {
                        i12 = ((h3) c8Var).currentAccount;
                        clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    } else {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                    }
                    g6Var2 = ((h3) c8Var).resourcesProvider;
                    q70 F = q70.F(w7Var, g6Var2, view);
                    F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new hg.y1(w7Var, clientUserId, 25), false);
                    F.k();
                    q70.f(F, c8Var.i1().B(clientUserId, true), c8Var.v, false, null, new a2(5, w7Var, F));
                    F.Z();
                } else if (i29 == 5) {
                    Context context4 = w7Var.getContext();
                    g6Var = ((h3) c8Var).resourcesProvider;
                    org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(context4, 3, g6Var);
                    d2Var3.q(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer3 = c8Var.f45188c;
                    if (inputPeer3 == null) {
                        inputPeer3 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer3;
                    i11 = ((h3) c8Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new hg.y(w7Var, d2Var3, getgroupcallstreamrtmpurl, 22));
                } else if (i29 == 6) {
                    c8Var.D = false;
                    w7Var.g(true);
                }
            }
        }
    }

    @Override
    public void call() {
        int i10 = CarAppNotificationBroadcastReceiver.f615a;
        ((IStartCarApp) this.f42596b).startCarApp((Intent) this.f42597c);
    }

    @Override
    public void d(org.telegram.tgnet.TLRPC.MessageMedia r1, int r2, boolean r3, int r4, long r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.m.d(org.telegram.tgnet.TLRPC$MessageMedia, int, boolean, int, long):void");
    }

    @Override
    public boolean f(int i10, View view) {
        return d3.B0((d3) this.f42596b, (Context) this.f42597c, view, i10);
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f42595a) {
            case 0:
                p.Y((p) this.f42596b, (HashSet) this.f42597c);
                return;
            case 1:
                a1 a1Var = (a1) this.f42596b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(a1Var.J).getInputUser(a1Var.R);
                ConnectionsManager.getInstance(a1Var.J).sendRequest(allowsendmessage, new hg.y(a1Var, (String[]) this.f42597c, d2Var, 21));
                return;
            case 2:
                boolean[] zArr = (boolean[]) this.f42596b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f42597c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 3:
            case 5:
            default:
                vf.t.d(r6.currentAccount).a((vf.q) this.f42596b, ((TL_account.TL_businessChatLink) this.f42597c).link);
                return;
            case 4:
                d3.y0((d3) this.f42596b, (TL_payments.connectedBotStarRef) this.f42597c);
                return;
            case 6:
                uf.u0 u0Var = (uf.u0) this.f42596b;
                u0Var.getClass();
                ((boolean[]) this.f42597c)[0] = true;
                u0Var.Q();
                return;
        }
    }

    @Override
    public void run(long j10) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        ((o3) this.f42596b).a((String) this.f42597c, tL_inlineButtonTypeUserProfile);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        vf.k kVar = (vf.k) this.f42596b;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        kVar.f49117w = false;
        AndroidUtilities.cancelRunOnUIThread(kVar.d);
        vf.i iVar = kVar.f49114n;
        kVar.f49118x = document;
        iVar.setSticker(document);
        ((o8) ((View) this.f42597c)).setValueSticker(document);
        kVar.e0(true);
        return Boolean.TRUE;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
