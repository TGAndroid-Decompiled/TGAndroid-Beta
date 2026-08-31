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
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vt;
import org.telegram.ui.wc0;
import qh.d8;
import qh.g8;
import qh.k7;
import qh.n7;
import qh.q7;
import qh.r7;
import qh.x7;
import sh.d3;
import wh.c4;
import wh.i5;
import wh.l5;
import wh.o3;
import wh.r3;
import wh.y2;
import wh.z5;
public final class m implements org.telegram.ui.ActionBar.c2, kl0, ll0, androidx.car.app.utils.e, Utilities.Callback3Return, wc0, wh.m0, vt, c4 {
    public final int f42632a;
    public final Object f42633b;
    public final Object f42634c;

    public m(int i10, Object obj, Object obj2) {
        this.f42632a = i10;
        this.f42633b = obj;
        this.f42634c = obj2;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public q70 a(wh.e1 e1Var) {
        wh.q qVar = (wh.q) ((q5.g0) this.f42633b).f44558c;
        q70 q70Var = new q70(qVar, (g6) this.f42634c, e1Var, false, false, true);
        qVar.E = q70Var;
        return q70Var;
    }

    @Override
    public void b0() {
        switch (this.f42632a) {
            case 12:
                ((wh.i0) this.f42633b).i();
                ((wh.h0) this.f42634c).W();
                return;
            default:
                i5 i5Var = (i5) this.f42633b;
                l5 l5Var = (l5) this.f42634c;
                TL_iv.pageTableCell pagetablecell = l5Var.f49867b;
                if (pagetablecell != null) {
                    z5.d(pagetablecell, l5Var.f49866a.getText());
                }
                y2 y2Var = i5Var.B;
                if (y2Var != null && i5Var.f50174a != null) {
                    r3.O1(y2Var.f50170a);
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
        x7 x7Var = (x7) this.f42633b;
        Context context = (Context) this.f42634c;
        ArrayList arrayList2 = x7Var.I;
        a0.h hVar = x7Var.f46290b;
        r7 r7Var = x7Var.f46298x;
        ArrayList arrayList3 = x7Var.f46291c;
        HashMap hashMap = x7Var.d;
        d8 d8Var = x7Var.T;
        if (i10 >= 0 && i10 < arrayList2.size()) {
            n7 n7Var = (n7) arrayList2.get(i10);
            int i21 = n7Var.f2505a;
            int i22 = 0;
            if (i21 == 3) {
                if (n7Var.f45786n && d8Var.C) {
                    i20 = ((h3) d8Var).currentAccount;
                    boolean z4 = d8Var.H;
                    TLRPC.InputPeer inputPeer = d8Var.f45223c;
                    q7 q7Var = new q7(x7Var, 0);
                    g6Var9 = ((h3) d8Var).resourcesProvider;
                    new k7(context, i20, z4, inputPeer, q7Var, g6Var9).show();
                    return;
                }
                int i23 = n7Var.f45781i;
                if (i23 == 1) {
                    if (d8Var.K == 1 || d8.J0(d8Var).isEmpty()) {
                        d8Var.J = 1;
                        d8Var.f45222b.D(1);
                    }
                    d8Var.K = 1;
                    x7Var.f(true);
                } else if (i23 == 3) {
                    if (d8Var.K == 3 || (d8Var.f45226n.isEmpty() && d8Var.f45227r.isEmpty())) {
                        d8Var.J = 3;
                        d8Var.f45222b.D(1);
                    }
                    d8Var.K = 3;
                    x7Var.f(true);
                } else if (i23 == 2) {
                    if (d8Var.K == 2) {
                        d8Var.J = 2;
                        d8Var.f45222b.D(1);
                    }
                    d8Var.K = 2;
                    x7Var.f(true);
                } else if (i23 == 4) {
                    if (d8Var.K == 4) {
                        d8Var.J = 4;
                        d8Var.f45222b.D(1);
                    }
                    d8Var.K = 4;
                    x7Var.f(true);
                } else {
                    if (i23 > 0) {
                        arrayList3.clear();
                        hashMap.clear();
                        d8Var.K = n7Var.f45781i;
                        r7Var.f44919c.a();
                    } else {
                        TLRPC.Chat chat = n7Var.h;
                        if (chat != null) {
                            long j10 = chat.f20843id;
                            if (d8.d1(d8Var, chat) > 200) {
                                try {
                                    x7Var.performHapticFeedback(3, 1);
                                } catch (Throwable unused) {
                                }
                                Context context2 = x7Var.getContext();
                                g6Var7 = ((h3) d8Var).resourcesProvider;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, g6Var7);
                                alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.GroupTooLarge);
                                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.GroupTooLargeMessage);
                                l.d.C(R.string.OK, alertDialog$Builder, null);
                            } else if (!hashMap.containsKey(Long.valueOf(j10))) {
                                i17 = ((h3) d8Var).currentAccount;
                                TLRPC.Chat chat2 = MessagesController.getInstance(i17).getChat(Long.valueOf(j10));
                                i18 = ((h3) d8Var).currentAccount;
                                TLRPC.ChatFull chatFull = MessagesController.getInstance(i18).getChatFull(j10);
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && chatFull.participants.participants.size() >= chatFull.participants_count - 1) {
                                    x7Var.d(j10, chatFull.participants);
                                } else {
                                    org.telegram.ui.ActionBar.d2 d2Var = x7Var.D;
                                    if (d2Var != null) {
                                        d2Var.dismiss();
                                        x7Var.D = null;
                                    }
                                    x7Var.E = j10;
                                    Context context3 = x7Var.getContext();
                                    g6Var8 = ((h3) d8Var).resourcesProvider;
                                    org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(context3, 3, g6Var8);
                                    x7Var.D = d2Var2;
                                    d2Var2.q(50L);
                                    i19 = ((h3) d8Var).currentAccount;
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i19);
                                    messagesStorage.getStorageQueue().postRunnable(new di(x7Var, chat2, messagesStorage, j10));
                                }
                                if (!TextUtils.isEmpty(x7Var.F)) {
                                    r7Var.setText("");
                                    x7Var.F = null;
                                    x7Var.g(false);
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
                                x7Var.i(true);
                            }
                        } else {
                            TLRPC.User user = n7Var.f45780g;
                            if (user != null) {
                                if (x7Var.f46289a == 0) {
                                    d8Var.K = 0;
                                }
                                long j11 = user.f20990id;
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
                                    if (!TextUtils.isEmpty(x7Var.F)) {
                                        r7Var.setText("");
                                        x7Var.F = null;
                                        x7Var.g(false);
                                    }
                                    hVar.k(Boolean.TRUE, j11);
                                }
                                arrayList3.clear();
                                arrayList3.addAll(hashSet);
                                x7Var.i(true);
                            }
                        }
                    }
                    x7Var.f(true);
                    x7Var.e(true);
                    r7Var.H = true;
                }
            } else if (i21 == 7) {
                if (view instanceof o8) {
                    o8 o8Var = (o8) view;
                    o8Var.setChecked(!o8Var.b());
                    n7Var.f45783k = o8Var.b();
                    int i24 = n7Var.f45777c;
                    if (i24 == 0) {
                        boolean b10 = o8Var.b();
                        d8Var.f45230x = b10;
                        if (d8Var.K == 4) {
                            i22 = 1;
                        }
                        if (b10) {
                            f3 f3Var = d8Var.container;
                            g6Var6 = ((h3) d8Var).resourcesProvider;
                            qc qcVar = new qc(f3Var, g6Var6);
                            int i25 = R.raw.ic_save_to_gallery;
                            if (i22 != 0) {
                                i16 = R.string.StoryEnabledScreenshotsShare;
                            } else {
                                i16 = R.string.StoryEnabledScreenshots;
                            }
                            ic G = qcVar.G(i25, 4, LocaleController.getString(i16));
                            G.f27745j = 5000;
                            G.k(true);
                            return;
                        }
                        f3 f3Var2 = d8Var.container;
                        g6Var5 = ((h3) d8Var).resourcesProvider;
                        qc qcVar2 = new qc(f3Var2, g6Var5);
                        int i26 = R.raw.passcode_lock_close;
                        if (i22 != 0) {
                            i15 = R.string.StoryDisabledScreenshotsShare;
                        } else {
                            i15 = R.string.StoryDisabledScreenshots;
                        }
                        ic G2 = qcVar2.G(i26, 4, LocaleController.getString(i15));
                        G2.f27745j = 5000;
                        G2.k(true);
                    } else if (i24 == 1) {
                        boolean b11 = o8Var.b();
                        d8Var.f45231y = b11;
                        boolean z10 = d8Var.f45223c instanceof TLRPC.TL_inputPeerChannel;
                        if (b11) {
                            f3 f3Var3 = d8Var.container;
                            g6Var4 = ((h3) d8Var).resourcesProvider;
                            qc qcVar3 = new qc(f3Var3, g6Var4);
                            int i27 = R.raw.msg_story_keep;
                            if (z10) {
                                i14 = R.string.StoryChannelEnableKeep;
                            } else {
                                i14 = R.string.StoryEnableKeep;
                            }
                            ic G3 = qcVar3.G(i27, 4, LocaleController.getString(i14));
                            G3.f27745j = 5000;
                            G3.k(true);
                        } else {
                            f3 f3Var4 = d8Var.container;
                            g6Var3 = ((h3) d8Var).resourcesProvider;
                            qc qcVar4 = new qc(f3Var4, g6Var3);
                            int i28 = R.raw.fire_on;
                            if (z10) {
                                i13 = R.string.StoryChannelDisableKeep;
                            } else {
                                i13 = R.string.StoryDisableKeep;
                            }
                            ic G4 = qcVar4.G(i28, 4, LocaleController.getString(i13));
                            G4.f27745j = 5000;
                            G4.k(true);
                        }
                        x7Var.g(true);
                    } else if (i24 == 2) {
                        d8Var.f45229w = o8Var.b();
                        x7Var.g(true);
                    }
                }
            } else if (i21 == 9) {
                int i29 = n7Var.f45789q;
                if (i29 == 0) {
                    g8 g8Var = d8Var.Z;
                    if (g8Var != null) {
                        g8Var.run();
                    }
                } else if (i29 == 1) {
                    TLRPC.InputPeer inputPeer2 = d8Var.f45223c;
                    if (inputPeer2 == null) {
                        i12 = ((h3) d8Var).currentAccount;
                        clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    } else {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                    }
                    g6Var2 = ((h3) d8Var).resourcesProvider;
                    q70 F = q70.F(x7Var, g6Var2, view);
                    F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new hg.y1(x7Var, clientUserId, 25), false);
                    F.k();
                    q70.f(F, d8Var.i1().B(clientUserId, true), d8Var.v, false, null, new v1(6, x7Var, F));
                    F.Z();
                } else if (i29 == 5) {
                    Context context4 = x7Var.getContext();
                    g6Var = ((h3) d8Var).resourcesProvider;
                    org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(context4, 3, g6Var);
                    d2Var3.q(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer3 = d8Var.f45223c;
                    if (inputPeer3 == null) {
                        inputPeer3 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer3;
                    i11 = ((h3) d8Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new hg.y(x7Var, d2Var3, getgroupcallstreamrtmpurl, 22));
                } else if (i29 == 6) {
                    d8Var.D = false;
                    x7Var.g(true);
                }
            }
        }
    }

    @Override
    public void call() {
        int i10 = CarAppNotificationBroadcastReceiver.f615a;
        ((IStartCarApp) this.f42633b).startCarApp((Intent) this.f42634c);
    }

    @Override
    public void d(org.telegram.tgnet.TLRPC.MessageMedia r1, int r2, boolean r3, int r4, long r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.m.d(org.telegram.tgnet.TLRPC$MessageMedia, int, boolean, int, long):void");
    }

    @Override
    public boolean f(int i10, View view) {
        return d3.B0((d3) this.f42633b, (Context) this.f42634c, view, i10);
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f42632a) {
            case 0:
                p.Y((p) this.f42633b, (HashSet) this.f42634c);
                return;
            case 1:
                a1 a1Var = (a1) this.f42633b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(a1Var.J).getInputUser(a1Var.R);
                ConnectionsManager.getInstance(a1Var.J).sendRequest(allowsendmessage, new hg.y(a1Var, (String[]) this.f42634c, d2Var, 21));
                return;
            case 2:
                boolean[] zArr = (boolean[]) this.f42633b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f42634c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 3:
            case 5:
            default:
                vf.q.Z((vf.q) this.f42633b, (TL_account.TL_businessChatLink) this.f42634c);
                return;
            case 4:
                d3.y0((d3) this.f42633b, (TL_payments.connectedBotStarRef) this.f42634c);
                return;
            case 6:
                uf.u0 u0Var = (uf.u0) this.f42633b;
                u0Var.getClass();
                ((boolean[]) this.f42634c)[0] = true;
                u0Var.Q();
                return;
        }
    }

    @Override
    public void run(long j10) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        ((o3) this.f42633b).a((String) this.f42634c, tL_inlineButtonTypeUserProfile);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        vf.k kVar = (vf.k) this.f42633b;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        kVar.f49080w = false;
        AndroidUtilities.cancelRunOnUIThread(kVar.d);
        vf.i iVar = kVar.f49077n;
        kVar.f49081x = document;
        iVar.setSticker(document);
        ((o8) ((View) this.f42634c)).setValueSticker(document);
        kVar.e0(true);
        return Boolean.TRUE;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
