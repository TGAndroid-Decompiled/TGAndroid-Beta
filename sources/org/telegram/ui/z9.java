package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
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
    public final int f52331a;
    public final Object f52332b;
    public final Object f52333c;
    public final Object d;

    public z9(Object obj, Object obj2, Object obj3, int i7) {
        this.f52331a = i7;
        this.f52332b = obj;
        this.f52333c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f52331a;
        mg.b bVar = null;
        int i10 = 0;
        Object obj = this.d;
        Object obj2 = this.f52333c;
        Object obj3 = this.f52332b;
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
                org.telegram.messenger.g0.h3(new m6((cn) obj3, (vf.b) obj2, tLObject, (bi.z2) obj, 5));
                return;
            case 4:
                cn cnVar = (cn) obj3;
                long[] jArr = (long[]) obj;
                org.telegram.messenger.g0.r((m6) obj2);
                cnVar.f44669t5.f23266k.voiceTranscriptionRated = true;
                org.telegram.messenger.yr messagesStorage = cnVar.getMessagesStorage();
                messagesStorage.f26723a.c(new org.telegram.messenger.hk(messagesStorage, cnVar.f44669t5.e1(), org.telegram.messenger.ij.B0(cnVar.f44669t5.f23266k), cnVar.f44669t5.f23266k, 6));
                xf xfVar = new xf(cnVar, 19);
                long j3 = 0;
                if (jArr[0] > 0) {
                    j3 = Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0]));
                }
                org.telegram.messenger.g0.i3(xfVar, j3);
                return;
            case 5:
                cn cnVar2 = (cn) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                org.telegram.messenger.g0.h3(new ag((org.telegram.ui.ActionBar.u1[]) obj2, 1));
                if (tL_error == null) {
                    cnVar2.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new o1(cnVar2, tL_error, tL_messages_editMessage, 22));
                    return;
                }
            case 6:
                org.telegram.messenger.g0.h3(new bi.u0((Object) ((io) obj3), (Object) ((String) obj2), tL_error, tLObject, (Object) ((TLRPC.TL_channels_checkUsername) obj), 27));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.n10((ns) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj, 4));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.n10((zw) obj3, tLObject, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, tL_error, 5));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new gu((zw) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, 1));
                return;
            case 10:
                org.telegram.messenger.g0.h3(new tp((h00) obj3, (org.telegram.ui.ActionBar.u1) obj2, (org.telegram.messenger.vo) obj, 9));
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
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0(f40Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, 6));
                            } else {
                                i11++;
                            }
                        }
                    }
                    org.telegram.messenger.qp.s1(f40Var.n1.f21770a).O3(updates, false);
                    return;
                }
                org.telegram.messenger.g0.h3(new f10(0, f40Var, tL_error));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.n10((f40) obj3, (org.telegram.ui.ActionBar.u1) obj2, tLObject, (TL_phone.exportGroupCallInvite) obj, tL_error, 6));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0(tLObject, (ArrayList) obj3, (ArrayList) obj2, (org.telegram.ui.Components.n10) obj, 8));
                return;
            case 14:
                o50 o50Var = (o50) obj3;
                String str = (String) obj;
                p50 p50Var = o50Var.f48434r;
                if (Objects.equals(o50Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
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
                        if (!p50Var.N || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList s02 = org.telegram.messenger.ui.b0(p50.c0(p50Var)).s0(p50Var.h0());
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
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0(o50Var, arrayList, arrayList3, str, 11));
                    return;
                }
                return;
            case 15:
                String str3 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.n10((LaunchActivity) obj3, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj2, tL_error, 10));
                return;
            case 16:
                String str4 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.n10((LaunchActivity) obj3, (f10) obj2, tLObject, (TLRPC.TL_wallPaper) obj, tL_error, 8));
                return;
            case 17:
                String str5 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.n10((LaunchActivity) obj3, tLObject, (org.telegram.ui.ActionBar.u1) obj2, (f10) obj, tL_error, 11));
                return;
            case 18:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.n10((s90) obj3, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (String) obj2, 12));
                return;
            case 19:
                org.telegram.messenger.g0.h3(new tp((sa0) obj3, (org.telegram.ui.ActionBar.u1[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 24));
                return;
            case 20:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.n10((rb0) obj3, tLObject, (Bundle) obj2, tL_error, (TLRPC.TL_auth_resendCode) obj, 14));
                return;
            case 21:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.n10((wc0) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.verifyEmail) obj, 16));
                return;
            case 22:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.n10((wc0) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.sendVerifyEmailCode) obj, 15));
                return;
            case 23:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.n10((od0) obj3, tLObject, (TLRPC.TL_inputInvoicePremiumAuthCode) obj2, (TLRPC.TL_inputStorePaymentAuthCode) obj, tL_error, 17));
                return;
            case 24:
                mg0 mg0Var = (mg0) obj3;
                String str6 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = e51.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    org.telegram.messenger.g0.h3(new tc0(11, mg0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.n10(mg0Var, tL_error, bVar, str6, tL_loadAsyncGraph, 18));
                return;
            case 25:
                jg0 jg0Var = (jg0) obj3;
                String str7 = (String) obj2;
                d51 d51Var = (d51) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = e51.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), jg0Var.f48119r.f48954i, false);
                    } catch (JSONException e11) {
                        e11.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(jg0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.kn0(jg0Var, bVar, str7, d51Var, 23));
                return;
            case 26:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.n10((dh0) obj3, (TLRPC.TL_contacts_importedContacts) tLObject, (TLRPC.TL_inputPhoneContact) obj2, tL_error, (TLRPC.TL_contacts_importContacts) obj, 19));
                return;
            case 27:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.n10((ak0) obj3, tL_error, (Bundle) obj2, tLObject, (TLRPC.TL_auth_resendCode) obj, 21));
                return;
            case 28:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.n10((kl0) obj3, tL_error, tLObject, (String) obj2, (TL_account.getPassword) obj, 22));
                return;
            default:
                kl0 kl0Var = (kl0) obj3;
                tc0 tc0Var = (tc0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    org.telegram.messenger.g0.h3(new pc0(kl0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, tc0Var, 18));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new nk0(kl0Var, tL_error, tLObject2, 2));
                    return;
                }
        }
    }

    public z9(Object obj, TLObject tLObject, String str, int i7) {
        this.f52331a = i7;
        this.f52332b = obj;
        this.d = tLObject;
        this.f52333c = str;
    }
}
