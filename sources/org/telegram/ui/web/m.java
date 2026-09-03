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
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.st;
import org.telegram.ui.xc0;
import ph.e8;
import ph.g8;
import ph.l7;
import ph.o7;
import ph.r7;
import ph.s7;
import ph.y7;
import rh.d3;
import vh.a6;
import vh.d4;
import vh.j5;
import vh.m5;
import vh.p3;
import vh.s3;
import vh.z2;
public final class m implements org.telegram.ui.ActionBar.c2, il0, jl0, Utilities.Callback3Return, xc0, androidx.car.app.utils.e, vh.m0, st, d4 {
    public final int f39523a;
    public final Object f39524b;
    public final Object f39525c;

    public m(int i10, Object obj, Object obj2) {
        this.f39523a = i10;
        this.f39524b = obj;
        this.f39525c = obj2;
    }

    @Override
    public void J() {
        switch (this.f39523a) {
            case 12:
                ((vh.i0) this.f39524b).i();
                ((vh.h0) this.f39525c).h2();
                return;
            default:
                j5 j5Var = (j5) this.f39524b;
                m5 m5Var = (m5) this.f39525c;
                TL_iv.pageTableCell pagetablecell = m5Var.f46104b;
                if (pagetablecell != null) {
                    a6.d(pagetablecell, m5Var.f46103a.getText());
                }
                z2 z2Var = j5Var.B;
                if (z2Var != null && j5Var.f46414a != null) {
                    s3.N1(z2Var.f46422a);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean Z0(View view) {
        return false;
    }

    @Override
    public p70 a(vh.e1 e1Var) {
        vh.q qVar = (vh.q) ((q5.c0) this.f39524b).f42807b;
        p70 p70Var = new p70(qVar, (f6) this.f39525c, e1Var, false, false, true);
        qVar.E = p70Var;
        return p70Var;
    }

    @Override
    public void b(org.telegram.tgnet.TLRPC.MessageMedia r1, int r2, boolean r3, int r4, long r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.m.b(org.telegram.tgnet.TLRPC$MessageMedia, int, boolean, int, long):void");
    }

    @Override
    public void c(float f10, float f11, int i10, View view) {
        f6 f6Var;
        int i11;
        int i12;
        long clientUserId;
        f6 f6Var2;
        f6 f6Var3;
        int i13;
        f6 f6Var4;
        int i14;
        f6 f6Var5;
        int i15;
        f6 f6Var6;
        int i16;
        f6 f6Var7;
        int i17;
        int i18;
        f6 f6Var8;
        int i19;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        int i20;
        f6 f6Var9;
        y7 y7Var = (y7) this.f39524b;
        Context context = (Context) this.f39525c;
        ArrayList arrayList2 = y7Var.I;
        a0.h hVar = y7Var.f42659b;
        s7 s7Var = y7Var.f42666x;
        ArrayList arrayList3 = y7Var.f42660c;
        HashMap hashMap = y7Var.d;
        e8 e8Var = y7Var.T;
        if (i10 >= 0 && i10 < arrayList2.size()) {
            o7 o7Var = (o7) arrayList2.get(i10);
            int i21 = o7Var.f1830a;
            int i22 = 0;
            if (i21 == 3) {
                if (o7Var.f42111n && e8Var.C) {
                    i20 = ((g3) e8Var).currentAccount;
                    boolean z4 = e8Var.H;
                    TLRPC.InputPeer inputPeer = e8Var.f41622c;
                    r7 r7Var = new r7(y7Var, 0);
                    f6Var9 = ((g3) e8Var).resourcesProvider;
                    new l7(context, i20, z4, inputPeer, r7Var, f6Var9).show();
                    return;
                }
                int i23 = o7Var.f42106i;
                if (i23 == 1) {
                    if (e8Var.K == 1 || e8.J0(e8Var).isEmpty()) {
                        e8Var.J = 1;
                        e8Var.f41621b.D(1);
                    }
                    e8Var.K = 1;
                    y7Var.f(true);
                } else if (i23 == 3) {
                    if (e8Var.K == 3 || (e8Var.f41624n.isEmpty() && e8Var.f41625r.isEmpty())) {
                        e8Var.J = 3;
                        e8Var.f41621b.D(1);
                    }
                    e8Var.K = 3;
                    y7Var.f(true);
                } else if (i23 == 2) {
                    if (e8Var.K == 2) {
                        e8Var.J = 2;
                        e8Var.f41621b.D(1);
                    }
                    e8Var.K = 2;
                    y7Var.f(true);
                } else if (i23 == 4) {
                    if (e8Var.K == 4) {
                        e8Var.J = 4;
                        e8Var.f41621b.D(1);
                    }
                    e8Var.K = 4;
                    y7Var.f(true);
                } else {
                    if (i23 > 0) {
                        arrayList3.clear();
                        hashMap.clear();
                        e8Var.K = o7Var.f42106i;
                        s7Var.f41334c.a();
                    } else {
                        TLRPC.Chat chat = o7Var.h;
                        if (chat != null) {
                            long j10 = chat.f19159id;
                            if (e8.d1(e8Var, chat) > 200) {
                                try {
                                    y7Var.performHapticFeedback(3, 1);
                                } catch (Throwable unused) {
                                }
                                Context context2 = y7Var.getContext();
                                f6Var7 = ((g3) e8Var).resourcesProvider;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, f6Var7);
                                alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.GroupTooLarge);
                                alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.GroupTooLargeMessage);
                                kf.k0.C(R.string.OK, alertDialog$Builder, null);
                            } else if (!hashMap.containsKey(Long.valueOf(j10))) {
                                i17 = ((g3) e8Var).currentAccount;
                                TLRPC.Chat chat2 = MessagesController.getInstance(i17).getChat(Long.valueOf(j10));
                                i18 = ((g3) e8Var).currentAccount;
                                TLRPC.ChatFull chatFull = MessagesController.getInstance(i18).getChatFull(j10);
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && chatFull.participants.participants.size() >= chatFull.participants_count - 1) {
                                    y7Var.d(j10, chatFull.participants);
                                } else {
                                    org.telegram.ui.ActionBar.d2 d2Var = y7Var.D;
                                    if (d2Var != null) {
                                        d2Var.dismiss();
                                        y7Var.D = null;
                                    }
                                    y7Var.E = j10;
                                    Context context3 = y7Var.getContext();
                                    f6Var8 = ((g3) e8Var).resourcesProvider;
                                    org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(context3, 3, f6Var8);
                                    y7Var.D = d2Var2;
                                    d2Var2.q(50L);
                                    i19 = ((g3) e8Var).currentAccount;
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i19);
                                    messagesStorage.getStorageQueue().postRunnable(new di(y7Var, chat2, messagesStorage, j10));
                                }
                                if (!TextUtils.isEmpty(y7Var.F)) {
                                    s7Var.setText("");
                                    y7Var.F = null;
                                    y7Var.g(false);
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
                                y7Var.i(true);
                            }
                        } else {
                            TLRPC.User user = o7Var.f42105g;
                            if (user != null) {
                                if (y7Var.f42658a == 0) {
                                    e8Var.K = 0;
                                }
                                long j11 = user.f19306id;
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
                                    if (!TextUtils.isEmpty(y7Var.F)) {
                                        s7Var.setText("");
                                        y7Var.F = null;
                                        y7Var.g(false);
                                    }
                                    hVar.k(Boolean.TRUE, j11);
                                }
                                arrayList3.clear();
                                arrayList3.addAll(hashSet);
                                y7Var.i(true);
                            }
                        }
                    }
                    y7Var.f(true);
                    y7Var.e(true);
                    s7Var.H = true;
                }
            } else if (i21 == 7) {
                if (view instanceof n8) {
                    n8 n8Var = (n8) view;
                    n8Var.setChecked(!n8Var.b());
                    o7Var.f42108k = n8Var.b();
                    int i24 = o7Var.f42103c;
                    if (i24 == 0) {
                        boolean b10 = n8Var.b();
                        e8Var.f41628x = b10;
                        if (e8Var.K == 4) {
                            i22 = 1;
                        }
                        if (b10) {
                            e3 e3Var = e8Var.container;
                            f6Var6 = ((g3) e8Var).resourcesProvider;
                            qc qcVar = new qc(e3Var, f6Var6);
                            int i25 = R.raw.ic_save_to_gallery;
                            if (i22 != 0) {
                                i16 = R.string.StoryEnabledScreenshotsShare;
                            } else {
                                i16 = R.string.StoryEnabledScreenshots;
                            }
                            ic G = qcVar.G(i25, 4, LocaleController.getString(i16));
                            G.f25671j = 5000;
                            G.k(true);
                            return;
                        }
                        e3 e3Var2 = e8Var.container;
                        f6Var5 = ((g3) e8Var).resourcesProvider;
                        qc qcVar2 = new qc(e3Var2, f6Var5);
                        int i26 = R.raw.passcode_lock_close;
                        if (i22 != 0) {
                            i15 = R.string.StoryDisabledScreenshotsShare;
                        } else {
                            i15 = R.string.StoryDisabledScreenshots;
                        }
                        ic G2 = qcVar2.G(i26, 4, LocaleController.getString(i15));
                        G2.f25671j = 5000;
                        G2.k(true);
                    } else if (i24 == 1) {
                        boolean b11 = n8Var.b();
                        e8Var.f41629y = b11;
                        boolean z10 = e8Var.f41622c instanceof TLRPC.TL_inputPeerChannel;
                        if (b11) {
                            e3 e3Var3 = e8Var.container;
                            f6Var4 = ((g3) e8Var).resourcesProvider;
                            qc qcVar3 = new qc(e3Var3, f6Var4);
                            int i27 = R.raw.msg_story_keep;
                            if (z10) {
                                i14 = R.string.StoryChannelEnableKeep;
                            } else {
                                i14 = R.string.StoryEnableKeep;
                            }
                            ic G3 = qcVar3.G(i27, 4, LocaleController.getString(i14));
                            G3.f25671j = 5000;
                            G3.k(true);
                        } else {
                            e3 e3Var4 = e8Var.container;
                            f6Var3 = ((g3) e8Var).resourcesProvider;
                            qc qcVar4 = new qc(e3Var4, f6Var3);
                            int i28 = R.raw.fire_on;
                            if (z10) {
                                i13 = R.string.StoryChannelDisableKeep;
                            } else {
                                i13 = R.string.StoryDisableKeep;
                            }
                            ic G4 = qcVar4.G(i28, 4, LocaleController.getString(i13));
                            G4.f25671j = 5000;
                            G4.k(true);
                        }
                        y7Var.g(true);
                    } else if (i24 == 2) {
                        e8Var.f41627w = n8Var.b();
                        y7Var.g(true);
                    }
                }
            } else if (i21 == 9) {
                int i29 = o7Var.f42114q;
                if (i29 == 0) {
                    g8 g8Var = e8Var.Z;
                    if (g8Var != null) {
                        g8Var.run();
                    }
                } else if (i29 == 1) {
                    TLRPC.InputPeer inputPeer2 = e8Var.f41622c;
                    if (inputPeer2 == null) {
                        i12 = ((g3) e8Var).currentAccount;
                        clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    } else {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                    }
                    f6Var2 = ((g3) e8Var).resourcesProvider;
                    p70 F = p70.F(y7Var, f6Var2, view);
                    F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new gg.y1(y7Var, clientUserId, 25), false);
                    F.k();
                    p70.f(F, e8Var.i1().B(clientUserId, true), e8Var.v, false, null, new ph.s1(4, y7Var, F));
                    F.Z();
                } else if (i29 == 5) {
                    Context context4 = y7Var.getContext();
                    f6Var = ((g3) e8Var).resourcesProvider;
                    org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(context4, 3, f6Var);
                    d2Var3.q(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer3 = e8Var.f41622c;
                    if (inputPeer3 == null) {
                        inputPeer3 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer3;
                    i11 = ((g3) e8Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new gg.y(y7Var, d2Var3, getgroupcallstreamrtmpurl, 21));
                } else if (i29 == 6) {
                    e8Var.D = false;
                    y7Var.g(true);
                }
            }
        }
    }

    @Override
    public void call() {
        int i10 = CarAppNotificationBroadcastReceiver.f575a;
        ((IStartCarApp) this.f39524b).startCarApp((Intent) this.f39525c);
    }

    @Override
    public boolean d(int i10, View view) {
        return d3.B0((d3) this.f39524b, (Context) this.f39525c, view, i10);
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f39523a) {
            case 0:
                p.Y((p) this.f39524b, (HashSet) this.f39525c);
                return;
            case 1:
                c1 c1Var = (c1) this.f39524b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(c1Var.J).getInputUser(c1Var.R);
                ConnectionsManager.getInstance(c1Var.J).sendRequest(allowsendmessage, new gg.y(c1Var, (String[]) this.f39525c, d2Var, 20));
                return;
            case 2:
                boolean[] zArr = (boolean[]) this.f39524b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f39525c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 3:
            case 5:
            default:
                uf.t.d(r6.currentAccount).a((uf.q) this.f39524b, ((TL_account.TL_businessChatLink) this.f39525c).link);
                return;
            case 4:
                d3.y0((d3) this.f39524b, (TL_payments.connectedBotStarRef) this.f39525c);
                return;
            case 6:
                tf.u0 u0Var = (tf.u0) this.f39524b;
                u0Var.getClass();
                ((boolean[]) this.f39525c)[0] = true;
                u0Var.Q();
                return;
        }
    }

    @Override
    public void run(long j10) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        ((p3) this.f39524b).a((String) this.f39525c, tL_inlineButtonTypeUserProfile);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        uf.k kVar = (uf.k) this.f39524b;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        kVar.f45399w = false;
        AndroidUtilities.cancelRunOnUIThread(kVar.d);
        uf.i iVar = kVar.f45396n;
        kVar.f45400x = document;
        iVar.setSticker(document);
        ((n8) ((View) this.f39525c)).setValueSticker(document);
        kVar.e0(true);
        return Boolean.TRUE;
    }

    @Override
    public void n0(View view, float f10, float f11) {
    }
}
