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
import org.telegram.messenger.ci;
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
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.tt;
import org.telegram.ui.vc0;
import ph.f8;
import ph.h8;
import ph.m7;
import ph.p7;
import ph.s7;
import ph.t7;
import ph.z7;
import vh.c4;
import vh.i5;
import vh.l5;
import vh.o3;
import vh.r3;
import vh.y2;
import vh.z5;
public final class m implements org.telegram.ui.ActionBar.c2, jl0, kl0, Utilities.Callback3Return, vc0, androidx.car.app.utils.e, vh.l0, tt, c4 {
    public final int f39576a;
    public final Object f39577b;
    public final Object f39578c;

    public m(int i10, Object obj, Object obj2) {
        this.f39576a = i10;
        this.f39577b = obj;
        this.f39578c = obj2;
    }

    @Override
    public o70 a(vh.d1 d1Var) {
        vh.p pVar = (vh.p) ((q5.g0) this.f39577b).f42807c;
        o70 o70Var = new o70(pVar, (f6) this.f39578c, d1Var, false, false, true);
        pVar.E = o70Var;
        return o70Var;
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
        z7 z7Var = (z7) this.f39577b;
        Context context = (Context) this.f39578c;
        ArrayList arrayList2 = z7Var.I;
        a0.h hVar = z7Var.f42661b;
        t7 t7Var = z7Var.f42668x;
        ArrayList arrayList3 = z7Var.f42662c;
        HashMap hashMap = z7Var.d;
        f8 f8Var = z7Var.T;
        if (i10 >= 0 && i10 < arrayList2.size()) {
            p7 p7Var = (p7) arrayList2.get(i10);
            int i21 = p7Var.f1808a;
            int i22 = 0;
            if (i21 == 3) {
                if (p7Var.f42177n && f8Var.C) {
                    i20 = ((g3) f8Var).currentAccount;
                    boolean z4 = f8Var.H;
                    TLRPC.InputPeer inputPeer = f8Var.f41658c;
                    s7 s7Var = new s7(z7Var, 0);
                    f6Var9 = ((g3) f8Var).resourcesProvider;
                    new m7(context, i20, z4, inputPeer, s7Var, f6Var9).show();
                    return;
                }
                int i23 = p7Var.f42172i;
                if (i23 == 1) {
                    if (f8Var.K == 1 || f8.J0(f8Var).isEmpty()) {
                        f8Var.J = 1;
                        f8Var.f41657b.D(1);
                    }
                    f8Var.K = 1;
                    z7Var.f(true);
                } else if (i23 == 3) {
                    if (f8Var.K == 3 || (f8Var.f41660n.isEmpty() && f8Var.f41661r.isEmpty())) {
                        f8Var.J = 3;
                        f8Var.f41657b.D(1);
                    }
                    f8Var.K = 3;
                    z7Var.f(true);
                } else if (i23 == 2) {
                    if (f8Var.K == 2) {
                        f8Var.J = 2;
                        f8Var.f41657b.D(1);
                    }
                    f8Var.K = 2;
                    z7Var.f(true);
                } else if (i23 == 4) {
                    if (f8Var.K == 4) {
                        f8Var.J = 4;
                        f8Var.f41657b.D(1);
                    }
                    f8Var.K = 4;
                    z7Var.f(true);
                } else {
                    if (i23 > 0) {
                        arrayList3.clear();
                        hashMap.clear();
                        f8Var.K = p7Var.f42172i;
                        t7Var.f41383c.a();
                    } else {
                        TLRPC.Chat chat = p7Var.h;
                        if (chat != null) {
                            long j10 = chat.f19184id;
                            if (f8.d1(f8Var, chat) > 200) {
                                try {
                                    z7Var.performHapticFeedback(3, 1);
                                } catch (Throwable unused) {
                                }
                                Context context2 = z7Var.getContext();
                                f6Var7 = ((g3) f8Var).resourcesProvider;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context2, 0, f6Var7);
                                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.GroupTooLarge);
                                alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.GroupTooLargeMessage);
                                kh.a2.C(R.string.OK, alertDialog$Builder, null);
                            } else if (!hashMap.containsKey(Long.valueOf(j10))) {
                                i17 = ((g3) f8Var).currentAccount;
                                TLRPC.Chat chat2 = MessagesController.getInstance(i17).getChat(Long.valueOf(j10));
                                i18 = ((g3) f8Var).currentAccount;
                                TLRPC.ChatFull chatFull = MessagesController.getInstance(i18).getChatFull(j10);
                                if (chatFull != null && (chatParticipants = chatFull.participants) != null && (arrayList = chatParticipants.participants) != null && !arrayList.isEmpty() && chatFull.participants.participants.size() >= chatFull.participants_count - 1) {
                                    z7Var.d(j10, chatFull.participants);
                                } else {
                                    org.telegram.ui.ActionBar.d2 d2Var = z7Var.D;
                                    if (d2Var != null) {
                                        d2Var.dismiss();
                                        z7Var.D = null;
                                    }
                                    z7Var.E = j10;
                                    Context context3 = z7Var.getContext();
                                    f6Var8 = ((g3) f8Var).resourcesProvider;
                                    org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(context3, 3, f6Var8);
                                    z7Var.D = d2Var2;
                                    d2Var2.q(50L);
                                    i19 = ((g3) f8Var).currentAccount;
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i19);
                                    messagesStorage.getStorageQueue().postRunnable(new ci(z7Var, chat2, messagesStorage, j10));
                                }
                                if (!TextUtils.isEmpty(z7Var.F)) {
                                    t7Var.setText("");
                                    z7Var.F = null;
                                    z7Var.g(false);
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
                                z7Var.i(true);
                            }
                        } else {
                            TLRPC.User user = p7Var.f42171g;
                            if (user != null) {
                                if (z7Var.f42660a == 0) {
                                    f8Var.K = 0;
                                }
                                long j11 = user.f19331id;
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
                                    if (!TextUtils.isEmpty(z7Var.F)) {
                                        t7Var.setText("");
                                        z7Var.F = null;
                                        z7Var.g(false);
                                    }
                                    hVar.k(Boolean.TRUE, j11);
                                }
                                arrayList3.clear();
                                arrayList3.addAll(hashSet);
                                z7Var.i(true);
                            }
                        }
                    }
                    z7Var.f(true);
                    z7Var.e(true);
                    t7Var.H = true;
                }
            } else if (i21 == 7) {
                if (view instanceof o8) {
                    o8 o8Var = (o8) view;
                    o8Var.setChecked(!o8Var.b());
                    p7Var.f42174k = o8Var.b();
                    int i24 = p7Var.f42169c;
                    if (i24 == 0) {
                        boolean b10 = o8Var.b();
                        f8Var.f41664x = b10;
                        if (f8Var.K == 4) {
                            i22 = 1;
                        }
                        if (b10) {
                            e3 e3Var = f8Var.container;
                            f6Var6 = ((g3) f8Var).resourcesProvider;
                            qc qcVar = new qc(e3Var, f6Var6);
                            int i25 = R.raw.ic_save_to_gallery;
                            if (i22 != 0) {
                                i16 = R.string.StoryEnabledScreenshotsShare;
                            } else {
                                i16 = R.string.StoryEnabledScreenshots;
                            }
                            ic G = qcVar.G(i25, 4, LocaleController.getString(i16));
                            G.f25672j = 5000;
                            G.k(true);
                            return;
                        }
                        e3 e3Var2 = f8Var.container;
                        f6Var5 = ((g3) f8Var).resourcesProvider;
                        qc qcVar2 = new qc(e3Var2, f6Var5);
                        int i26 = R.raw.passcode_lock_close;
                        if (i22 != 0) {
                            i15 = R.string.StoryDisabledScreenshotsShare;
                        } else {
                            i15 = R.string.StoryDisabledScreenshots;
                        }
                        ic G2 = qcVar2.G(i26, 4, LocaleController.getString(i15));
                        G2.f25672j = 5000;
                        G2.k(true);
                    } else if (i24 == 1) {
                        boolean b11 = o8Var.b();
                        f8Var.f41665y = b11;
                        boolean z10 = f8Var.f41658c instanceof TLRPC.TL_inputPeerChannel;
                        if (b11) {
                            e3 e3Var3 = f8Var.container;
                            f6Var4 = ((g3) f8Var).resourcesProvider;
                            qc qcVar3 = new qc(e3Var3, f6Var4);
                            int i27 = R.raw.msg_story_keep;
                            if (z10) {
                                i14 = R.string.StoryChannelEnableKeep;
                            } else {
                                i14 = R.string.StoryEnableKeep;
                            }
                            ic G3 = qcVar3.G(i27, 4, LocaleController.getString(i14));
                            G3.f25672j = 5000;
                            G3.k(true);
                        } else {
                            e3 e3Var4 = f8Var.container;
                            f6Var3 = ((g3) f8Var).resourcesProvider;
                            qc qcVar4 = new qc(e3Var4, f6Var3);
                            int i28 = R.raw.fire_on;
                            if (z10) {
                                i13 = R.string.StoryChannelDisableKeep;
                            } else {
                                i13 = R.string.StoryDisableKeep;
                            }
                            ic G4 = qcVar4.G(i28, 4, LocaleController.getString(i13));
                            G4.f25672j = 5000;
                            G4.k(true);
                        }
                        z7Var.g(true);
                    } else if (i24 == 2) {
                        f8Var.f41663w = o8Var.b();
                        z7Var.g(true);
                    }
                }
            } else if (i21 == 9) {
                int i29 = p7Var.f42180q;
                if (i29 == 0) {
                    h8 h8Var = f8Var.Z;
                    if (h8Var != null) {
                        h8Var.run();
                    }
                } else if (i29 == 1) {
                    TLRPC.InputPeer inputPeer2 = f8Var.f41658c;
                    if (inputPeer2 == null) {
                        i12 = ((g3) f8Var).currentAccount;
                        clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    } else {
                        clientUserId = DialogObject.getPeerDialogId(inputPeer2);
                    }
                    f6Var2 = ((g3) f8Var).resourcesProvider;
                    o70 F = o70.F(z7Var, f6Var2, view);
                    F.c(R.drawable.msg_addfolder, LocaleController.getString(R.string.StoriesAlbumNewAlbum), new gg.y1(z7Var, clientUserId, 26), false);
                    F.k();
                    o70.f(F, f8Var.i1().B(clientUserId, true), f8Var.v, false, null, new u1(6, z7Var, F));
                    F.Z();
                } else if (i29 == 5) {
                    Context context4 = z7Var.getContext();
                    f6Var = ((g3) f8Var).resourcesProvider;
                    org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(context4, 3, f6Var);
                    d2Var3.q(500L);
                    TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = new TL_phone.getGroupCallStreamRtmpUrl();
                    getgroupcallstreamrtmpurl.live_story = true;
                    TLRPC.InputPeer inputPeer3 = f8Var.f41658c;
                    if (inputPeer3 == null) {
                        inputPeer3 = new TLRPC.TL_inputPeerSelf();
                    }
                    getgroupcallstreamrtmpurl.peer = inputPeer3;
                    i11 = ((g3) f8Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(getgroupcallstreamrtmpurl, new gg.y(z7Var, d2Var3, getgroupcallstreamrtmpurl, 22));
                } else if (i29 == 6) {
                    f8Var.D = false;
                    z7Var.g(true);
                }
            }
        }
    }

    @Override
    public void call() {
        int i10 = CarAppNotificationBroadcastReceiver.f563a;
        ((IStartCarApp) this.f39577b).startCarApp((Intent) this.f39578c);
    }

    @Override
    public void d(org.telegram.tgnet.TLRPC.MessageMedia r1, int r2, boolean r3, int r4, long r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.web.m.d(org.telegram.tgnet.TLRPC$MessageMedia, int, boolean, int, long):void");
    }

    @Override
    public boolean e1(View view) {
        return false;
    }

    @Override
    public boolean f(int i10, View view) {
        return rh.e3.B0((rh.e3) this.f39577b, (Context) this.f39578c, view, i10);
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f39576a) {
            case 0:
                p.Y((p) this.f39577b, (HashSet) this.f39578c);
                return;
            case 1:
                a1 a1Var = (a1) this.f39577b;
                TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
                allowsendmessage.bot = MessagesController.getInstance(a1Var.J).getInputUser(a1Var.R);
                ConnectionsManager.getInstance(a1Var.J).sendRequest(allowsendmessage, new gg.y(a1Var, (String[]) this.f39578c, d2Var, 21));
                return;
            case 2:
                boolean[] zArr = (boolean[]) this.f39577b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f39578c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    jsPromptResult.cancel();
                    return;
                }
                return;
            case 3:
            case 5:
            default:
                uf.t.d(r6.currentAccount).a((uf.q) this.f39577b, ((TL_account.TL_businessChatLink) this.f39578c).link);
                return;
            case 4:
                rh.e3.y0((rh.e3) this.f39577b, (TL_payments.connectedBotStarRef) this.f39578c);
                return;
            case 6:
                tf.u0 u0Var = (tf.u0) this.f39577b;
                u0Var.getClass();
                ((boolean[]) this.f39578c)[0] = true;
                u0Var.Q();
                return;
        }
    }

    @Override
    public void j0() {
        switch (this.f39576a) {
            case 12:
                ((vh.h0) this.f39577b).i();
                ((vh.g0) this.f39578c).a0();
                return;
            default:
                i5 i5Var = (i5) this.f39577b;
                l5 l5Var = (l5) this.f39578c;
                TL_iv.pageTableCell pagetablecell = l5Var.f46007b;
                if (pagetablecell != null) {
                    z5.d(pagetablecell, l5Var.f46006a.getText());
                }
                y2 y2Var = i5Var.B;
                if (y2Var != null && i5Var.f46283a != null) {
                    r3.O1(y2Var.f46324a);
                    return;
                }
                return;
        }
    }

    @Override
    public void run(long j10) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j10;
        ((o3) this.f39577b).a((String) this.f39578c, tL_inlineButtonTypeUserProfile);
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        uf.k kVar = (uf.k) this.f39577b;
        TLRPC.Document document = (TLRPC.Document) obj2;
        Boolean bool = (Boolean) obj3;
        kVar.f45335w = false;
        AndroidUtilities.cancelRunOnUIThread(kVar.d);
        uf.i iVar = kVar.f45332n;
        kVar.f45336x = document;
        iVar.setSticker(document);
        ((o8) ((View) this.f39578c)).setValueSticker(document);
        kVar.e0(true);
        return Boolean.TRUE;
    }

    @Override
    public void o0(View view, float f10, float f11) {
    }
}
