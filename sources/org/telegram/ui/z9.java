package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.widget.Toast;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;
public final class z9 implements RequestDelegate {
    public final int f54463a;
    public final Object f54464b;
    public final Object f54465c;
    public final Object d;

    public z9(Object obj, Object obj2, Object obj3, int i7) {
        this.f54463a = i7;
        this.f54464b = obj;
        this.f54465c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f54463a;
        mg.b bVar = null;
        int i10 = 0;
        Object obj = this.d;
        Object obj2 = this.f54465c;
        Object obj3 = this.f54464b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.g3(new bi.s1((org.telegram.ui.ActionBar.g2) ((la) obj3), (String) obj2, tL_error, tLObject, (TLObject) ((TL_account.checkUsername) obj), 22));
                return;
            case 1:
                final la laVar = (la) obj3;
                final org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error == null) {
                    org.telegram.messenger.g0.g3(new o1(laVar, t1Var, (TLRPC.User) tLObject, 8));
                    return;
                } else if ("USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                    org.telegram.messenger.g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    try {
                                        t1Var.dismiss();
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    laVar.finishFragment();
                                    return;
                                default:
                                    try {
                                        t1Var.dismiss();
                                    } catch (Exception e11) {
                                        org.telegram.messenger.a8.g(e11, true);
                                    }
                                    laVar.m0();
                                    return;
                            }
                        }
                    });
                    return;
                } else if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                    org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i(laVar, t1Var, tL_error, updateusername, 8));
                    return;
                } else {
                    org.telegram.messenger.g0.g3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    try {
                                        t1Var.dismiss();
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    laVar.finishFragment();
                                    return;
                                default:
                                    try {
                                        t1Var.dismiss();
                                    } catch (Exception e11) {
                                        org.telegram.messenger.a8.g(e11, true);
                                    }
                                    laVar.m0();
                                    return;
                            }
                        }
                    });
                    return;
                }
            case 2:
                org.telegram.messenger.g0.g3(new bi.s1((org.telegram.ui.ActionBar.g2) ((ad) obj3), (String) obj2, tL_error, tLObject, (TLObject) ((TLRPC.TL_channels_checkUsername) obj), 25));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i((bn) obj3, (vf.b) obj2, tLObject, (di.m2) obj, 10));
                return;
            case 4:
                bn bnVar = (bn) obj3;
                long[] jArr = (long[]) obj;
                org.telegram.messenger.g0.r((org.telegram.messenger.camera.i) obj2);
                bnVar.f46181v5.f24177k.voiceTranscriptionRated = true;
                org.telegram.messenger.ur messagesStorage = bnVar.getMessagesStorage();
                messagesStorage.f27214a.c(new org.telegram.messenger.fk(messagesStorage, bnVar.f46181v5.e1(), org.telegram.messenger.gj.B0(bnVar.f46181v5.f24177k), bnVar.f46181v5.f24177k, 6));
                vf vfVar = new vf(bnVar, 19);
                long j3 = 0;
                if (jArr[0] > 0) {
                    j3 = Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0]));
                }
                org.telegram.messenger.g0.h3(vfVar, j3);
                return;
            case 5:
                bn bnVar2 = (bn) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                org.telegram.messenger.g0.g3(new zf((org.telegram.ui.ActionBar.t1[]) obj2, 1));
                if (tL_error == null) {
                    bnVar2.getMessagesController().V3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    org.telegram.messenger.g0.g3(new o1(bnVar2, tL_error, tL_messages_editMessage, 22));
                    return;
                }
            case 6:
                org.telegram.messenger.g0.g3(new bi.s1((org.telegram.ui.ActionBar.g2) ((io) obj3), (String) obj2, tL_error, tLObject, (TLObject) ((TLRPC.TL_channels_checkUsername) obj), 29));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new ip((ns) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj, 7));
                return;
            case 8:
                org.telegram.messenger.g0.g3(new ip((Object) ((cx) obj3), (Object) tLObject, (Object) ((TLRPC.UserFull) obj2), (Object) ((TL_account.TL_birthday) obj), tL_error, 8));
                return;
            case 9:
                org.telegram.messenger.g0.g3(new vu((cx) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, 0));
                return;
            case 10:
                org.telegram.messenger.g0.g3(new up((j00) obj3, (org.telegram.ui.ActionBar.t1) obj2, (org.telegram.messenger.so) obj, 9));
                return;
            case 11:
                f40 f40Var = (f40) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i11 = 0;
                    while (true) {
                        if (i11 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i11);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.q20(f40Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, 13));
                            } else {
                                i11++;
                            }
                        }
                    }
                    org.telegram.messenger.np.u1(f40Var.f47488o1.f23166a).V3(updates, false);
                    return;
                }
                org.telegram.messenger.g0.g3(new vs(20, f40Var, tL_error));
                return;
            case 12:
                org.telegram.messenger.g0.g3(new ip((Object) ((f40) obj3), (Object) ((org.telegram.ui.ActionBar.t1) obj2), (Object) tLObject, (Object) ((TL_phone.exportGroupCallInvite) obj), tL_error, 9));
                return;
            case 13:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.q20(tLObject, (ArrayList) obj3, (ArrayList) obj2, (ip) obj));
                return;
            case 14:
                m50 m50Var = (m50) obj3;
                String str = (String) obj;
                n50 n50Var = m50Var.f49739r;
                if (Objects.equals(m50Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TLRPC.StickerSetCovered> arrayList2 = ((TLRPC.TL_messages_foundStickerSets) tLObject).sets;
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i12);
                        i12++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = new TLRPC.TL_messages_stickerSet();
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        tL_messages_stickerSet.set = stickerSet;
                        tL_messages_stickerSet.documents = stickerSetCovered2.covers;
                        if (!n50Var.O || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList u02 = org.telegram.messenger.si.d0(n50.c0(n50Var)).u0(n50Var.h0());
                    int size2 = u02.size();
                    while (i10 < size2) {
                        Object obj4 = u02.get(i10);
                        i10++;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj4;
                        String str2 = tL_messages_stickerSet2.set.short_name;
                        Locale locale = Locale.ROOT;
                        if (str2.toLowerCase(locale).contains(trim) || tL_messages_stickerSet2.set.title.toLowerCase(locale).contains(trim)) {
                            arrayList3.add(tL_messages_stickerSet2);
                        }
                    }
                    org.telegram.messenger.g0.g3(new org.telegram.ui.Components.q20(m50Var, arrayList, arrayList3, str, 18));
                    return;
                }
                return;
            case 15:
                String str3 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new ip((Object) ((LaunchActivity) obj3), (Object) tLObject, (Object) ((TLRPC.TL_messages_requestUrlAuth) obj), (Object) ((String) obj2), tL_error, 13));
                return;
            case 16:
                String str4 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new ip((Object) ((LaunchActivity) obj3), (Object) ((o60) obj2), (Object) tLObject, (Object) ((TLRPC.TL_wallPaper) obj), tL_error, 11));
                return;
            case 17:
                String str5 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new ip((Object) ((LaunchActivity) obj3), (Object) tLObject, (Object) ((org.telegram.ui.ActionBar.t1) obj2), (Object) ((o60) obj), tL_error, 14));
                return;
            case 18:
                org.telegram.messenger.g0.g3(new ip((s90) obj3, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (String) obj2, 15));
                return;
            case 19:
                org.telegram.messenger.g0.g3(new up((qa0) obj3, (org.telegram.ui.ActionBar.t1[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 25));
                return;
            case 20:
                org.telegram.messenger.g0.g3(new ip((KeyEvent.Callback) ((pb0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TLRPC.TL_auth_resendCode) obj), 17));
                return;
            case 21:
                org.telegram.messenger.g0.g3(new ip((KeyEvent.Callback) ((sc0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TL_account.verifyEmail) obj), 19));
                return;
            case 22:
                org.telegram.messenger.g0.g3(new ip((KeyEvent.Callback) ((sc0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TL_account.sendVerifyEmailCode) obj), 18));
                return;
            case 23:
                org.telegram.messenger.g0.g3(new ip((Object) ((ld0) obj3), (Object) tLObject, (Object) ((TLRPC.TL_inputInvoicePremiumAuthCode) obj2), (Object) ((TLRPC.TL_inputStorePaymentAuthCode) obj), tL_error, 20));
                return;
            case 24:
                og0 og0Var = (og0) obj3;
                String str6 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = c51.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    org.telegram.messenger.g0.g3(new ve0(1, og0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                org.telegram.messenger.g0.g3(new ip(og0Var, tL_error, bVar, str6, tL_loadAsyncGraph, 21));
                return;
            case 25:
                lg0 lg0Var = (lg0) obj3;
                String str7 = (String) obj2;
                b51 b51Var = (b51) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = c51.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), lg0Var.f49733r.f50467i, false);
                    } catch (JSONException e11) {
                        e11.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(lg0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.g0.g3(new kg0(lg0Var, bVar, str7, b51Var, 0));
                return;
            case 26:
                org.telegram.messenger.g0.g3(new ip((KeyEvent.Callback) ((fh0) obj3), (TLObject) ((TLRPC.TL_contacts_importedContacts) tLObject), (Object) ((TLRPC.TL_inputPhoneContact) obj2), tL_error, (TLObject) ((TLRPC.TL_contacts_importContacts) obj), 22));
                return;
            case 27:
                org.telegram.messenger.g0.g3(new ip((dk0) obj3, tL_error, (Bundle) obj2, tLObject, (TLRPC.TL_auth_resendCode) obj, 24));
                return;
            case 28:
                org.telegram.messenger.g0.g3(new ip((ml0) obj3, tL_error, tLObject, (String) obj2, (TL_account.getPassword) obj, 25));
                return;
            default:
                ml0 ml0Var = (ml0) obj3;
                ve0 ve0Var = (ve0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    org.telegram.messenger.g0.g3(new mc0(ml0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, ve0Var, 18));
                    return;
                } else {
                    org.telegram.messenger.g0.g3(new qk0(ml0Var, tL_error, tLObject2, 2));
                    return;
                }
        }
    }

    public z9(Object obj, TLObject tLObject, String str, int i7) {
        this.f54463a = i7;
        this.f54464b = obj;
        this.d = tLObject;
        this.f54465c = str;
    }
}
