package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Toast;
import j$.util.Objects;
import java.io.Serializable;
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
    public final int f52488a;
    public final Object f52489b;
    public final Object f52490c;
    public final Object d;

    public z9(Object obj, Object obj2, Object obj3, int i7) {
        this.f52488a = i7;
        this.f52489b = obj;
        this.f52490c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f52488a;
        mg.b bVar = null;
        int i10 = 0;
        Object obj = this.d;
        Object obj2 = this.f52490c;
        Object obj3 = this.f52489b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new bi.u0((Object) ((la) obj3), (Object) ((String) obj2), tL_error, tLObject, (Object) ((TL_account.checkUsername) obj), 20));
                return;
            case 1:
                final la laVar = (la) obj3;
                final org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error == null) {
                    org.telegram.messenger.g0.h3(new o1(laVar, u1Var, (TLRPC.User) tLObject, 8));
                    return;
                } else if ("USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    try {
                                        u1Var.dismiss();
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    laVar.finishFragment();
                                    return;
                                default:
                                    try {
                                        u1Var.dismiss();
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
                    org.telegram.messenger.g0.h3(new m6(laVar, u1Var, tL_error, updateusername, 3));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    try {
                                        u1Var.dismiss();
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    laVar.finishFragment();
                                    return;
                                default:
                                    try {
                                        u1Var.dismiss();
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
                org.telegram.messenger.g0.h3(new bi.u0((Object) ((bd) obj3), (Object) ((String) obj2), tL_error, tLObject, (Object) ((TLRPC.TL_channels_checkUsername) obj), 23));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new m6((an) obj3, (vf.b) obj2, tLObject, (bi.z2) obj, 5));
                return;
            case 4:
                an anVar = (an) obj3;
                long[] jArr = (long[]) obj;
                org.telegram.messenger.g0.r((m6) obj2);
                anVar.f43971t5.f23262k.voiceTranscriptionRated = true;
                org.telegram.messenger.yr messagesStorage = anVar.getMessagesStorage();
                messagesStorage.f26719a.c(new org.telegram.messenger.hk(messagesStorage, anVar.f43971t5.f1(), org.telegram.messenger.ij.B0(anVar.f43971t5.f23262k), anVar.f43971t5.f23262k, 6));
                xf xfVar = new xf(anVar, 15);
                long j3 = 0;
                if (jArr[0] > 0) {
                    j3 = Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0]));
                }
                org.telegram.messenger.g0.i3(xfVar, j3);
                return;
            case 5:
                an anVar2 = (an) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                org.telegram.messenger.g0.h3(new cg((org.telegram.ui.ActionBar.u1[]) obj2, 1));
                if (tL_error == null) {
                    anVar2.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new o1(anVar2, tL_error, tL_messages_editMessage, 22));
                    return;
                }
            case 6:
                org.telegram.messenger.g0.h3(new bi.u0((Object) ((go) obj3), (Object) ((String) obj2), tL_error, tLObject, (Object) ((TLRPC.TL_channels_checkUsername) obj), 26));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((Object) ((ks) obj3), tL_error, (Object) tLObject, (Serializable) ((ArrayList) obj2), (TLObject) ((TLRPC.TL_messages_getMyStickers) obj), 3));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((Object) ((ww) obj3), (Object) ((TLRPC.UserFull) obj2), tL_error, tLObject, (Object) ((TL_account.TL_birthday) obj), 4));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new du((ww) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, 1));
                return;
            case 10:
                org.telegram.messenger.g0.h3(new rp((e00) obj3, (org.telegram.ui.ActionBar.u1) obj2, (org.telegram.messenger.vo) obj, 9));
                return;
            case 11:
                c40 c40Var = (c40) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i11 = 0;
                    while (true) {
                        if (i11 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i11);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0(c40Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, 6));
                            } else {
                                i11++;
                            }
                        }
                    }
                    org.telegram.messenger.qp.s1(c40Var.f44588k1.f21765a).O3(updates, false);
                    return;
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.l51(29, c40Var, tL_error));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((Object) ((c40) obj3), (Object) ((org.telegram.ui.ActionBar.u1) obj2), tLObject, (TLObject) ((TL_phone.exportGroupCallInvite) obj), tL_error, 5));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0(tLObject, (ArrayList) obj3, (ArrayList) obj2, (org.telegram.ui.Components.jv0) obj, 8));
                return;
            case 14:
                l50 l50Var = (l50) obj3;
                String str = (String) obj;
                m50 m50Var = l50Var.f47427r;
                if (Objects.equals(l50Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
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
                        if (!m50Var.N || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList s02 = org.telegram.messenger.ui.b0(m50.c0(m50Var)).s0(m50Var.h0());
                    int size2 = s02.size();
                    while (i10 < size2) {
                        Object obj4 = s02.get(i10);
                        i10++;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj4;
                        String str2 = tL_messages_stickerSet2.set.short_name;
                        Locale locale = Locale.ROOT;
                        if (str2.toLowerCase(locale).contains(trim) || tL_messages_stickerSet2.set.title.toLowerCase(locale).contains(trim)) {
                            arrayList3.add(tL_messages_stickerSet2);
                        }
                    }
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0(l50Var, arrayList, arrayList3, str, 11));
                    return;
                }
                return;
            case 15:
                String str3 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((LaunchActivity) obj3, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj2, tL_error));
                return;
            case 16:
                String str4 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((Object) ((LaunchActivity) obj3), (Object) ((q10) obj2), tLObject, (TLObject) ((TLRPC.TL_wallPaper) obj), tL_error, 7));
                return;
            case 17:
                String str5 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((Object) ((LaunchActivity) obj3), (Object) ((org.telegram.ui.ActionBar.u1) obj2), tL_error, tLObject, (Object) ((q10) obj), 10));
                return;
            case 18:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((Object) ((p90) obj3), (Object) tL_error, (Object) tLObject, (Object) ((TLRPC.TL_inputInvoiceSlug) obj), (String) obj2, 11));
                return;
            case 19:
                org.telegram.messenger.g0.h3(new rp((pa0) obj3, (org.telegram.ui.ActionBar.u1[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 24));
                return;
            case 20:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((org.telegram.ui.Components.wt0) ((ob0) obj3), tLObject, (Bundle) obj2, tL_error, (TLObject) ((TLRPC.TL_auth_resendCode) obj), 13));
                return;
            case 21:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((org.telegram.ui.Components.wt0) ((sc0) obj3), tLObject, (Bundle) obj2, tL_error, (TLObject) ((TL_account.verifyEmail) obj), 15));
                return;
            case 22:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((org.telegram.ui.Components.wt0) ((sc0) obj3), tLObject, (Bundle) obj2, tL_error, (TLObject) ((TL_account.sendVerifyEmailCode) obj), 14));
                return;
            case 23:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((Object) ((ld0) obj3), (Object) ((TLRPC.TL_inputInvoicePremiumAuthCode) obj2), tL_error, tLObject, (Object) ((TLRPC.TL_inputStorePaymentAuthCode) obj), 16));
                return;
            case 24:
                jg0 jg0Var = (jg0) obj3;
                String str6 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = c51.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    org.telegram.messenger.g0.h3(new zc0(10, jg0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((Object) jg0Var, tL_error, (Object) bVar, (Serializable) str6, (TLObject) tL_loadAsyncGraph, 17));
                return;
            case 25:
                gg0 gg0Var = (gg0) obj3;
                String str7 = (String) obj2;
                b51 b51Var = (b51) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = c51.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), gg0Var.f47419r.f48259i, false);
                    } catch (JSONException e11) {
                        e11.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(gg0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0(gg0Var, bVar, str7, b51Var, 23));
                return;
            case 26:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((ah0) obj3, (TLRPC.TL_contacts_importedContacts) tLObject, (TLRPC.TL_inputPhoneContact) obj2, tL_error, (TLRPC.TL_contacts_importContacts) obj));
                return;
            case 27:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((Object) ((xj0) obj3), tL_error, (Object) ((Bundle) obj2), (Object) tLObject, (Object) ((TLRPC.TL_auth_resendCode) obj), 20));
                return;
            case 28:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.jv0((Object) ((hl0) obj3), tL_error, (Object) tLObject, (Serializable) ((String) obj2), (TLObject) ((TL_account.getPassword) obj), 21));
                return;
            default:
                hl0 hl0Var = (hl0) obj3;
                zc0 zc0Var = (zc0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    org.telegram.messenger.g0.h3(new mc0(hl0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, zc0Var, 18));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new kk0(hl0Var, tL_error, tLObject2, 2));
                    return;
                }
        }
    }

    public z9(Object obj, TLObject tLObject, String str, int i7) {
        this.f52488a = i7;
        this.f52489b = obj;
        this.d = tLObject;
        this.f52490c = str;
    }
}
