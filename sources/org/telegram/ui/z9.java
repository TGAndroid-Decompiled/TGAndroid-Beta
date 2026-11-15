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
    public final int f53911a;
    public final Object f53912b;
    public final Object f53913c;
    public final Object d;

    public z9(Object obj, Object obj2, Object obj3, int i7) {
        this.f53911a = i7;
        this.f53912b = obj;
        this.f53913c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f53911a;
        mg.b bVar = null;
        int i10 = 0;
        Object obj = this.d;
        Object obj2 = this.f53913c;
        Object obj3 = this.f53912b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new ai.b((la) obj3, (String) obj2, tL_error, tLObject, (TL_account.checkUsername) obj, 22));
                return;
            case 1:
                final la laVar = (la) obj3;
                final org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error == null) {
                    org.telegram.messenger.g0.h3(new o1(laVar, t1Var, (TLRPC.User) tLObject, 8));
                    return;
                } else if ("USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                    org.telegram.messenger.g0.h3(new Runnable() {
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
                    org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.m5(laVar, t1Var, tL_error, updateusername, 4));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new Runnable() {
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
                org.telegram.messenger.g0.h3(new ai.b((ad) obj3, (String) obj2, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) obj, 25));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.m5((an) obj3, (vf.b) obj2, tLObject, (di.i2) obj, 6));
                return;
            case 4:
                an anVar = (an) obj3;
                long[] jArr = (long[]) obj;
                org.telegram.messenger.g0.r((org.telegram.ui.ActionBar.m5) obj2);
                anVar.f45382u5.f23817k.voiceTranscriptionRated = true;
                org.telegram.messenger.vr messagesStorage = anVar.getMessagesStorage();
                messagesStorage.f27220a.c(new org.telegram.messenger.fk(messagesStorage, anVar.f45382u5.e1(), org.telegram.messenger.gj.B0(anVar.f45382u5.f23817k), anVar.f45382u5.f23817k, 6));
                uf ufVar = new uf(anVar, 20);
                long j3 = 0;
                if (jArr[0] > 0) {
                    j3 = Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0]));
                }
                org.telegram.messenger.g0.i3(ufVar, j3);
                return;
            case 5:
                an anVar2 = (an) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                org.telegram.messenger.g0.h3(new xf((org.telegram.ui.ActionBar.t1[]) obj2, 1));
                if (tL_error == null) {
                    anVar2.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new o1(anVar2, tL_error, tL_messages_editMessage, 22));
                    return;
                }
            case 6:
                org.telegram.messenger.g0.h3(new ai.b((ho) obj3, (String) obj2, tL_error, tLObject, (TLRPC.TL_channels_checkUsername) obj, 29));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new hp((ns) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj, 7));
                return;
            case 8:
                org.telegram.messenger.g0.h3(new hp((Object) ((yw) obj3), (Object) tLObject, (Object) ((TLRPC.UserFull) obj2), (Object) ((TL_account.TL_birthday) obj), tL_error, 8));
                return;
            case 9:
                org.telegram.messenger.g0.h3(new fu((yw) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, 1));
                return;
            case 10:
                org.telegram.messenger.g0.h3(new tp((g00) obj3, (org.telegram.ui.ActionBar.t1) obj2, (org.telegram.messenger.so) obj, 9));
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
                                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ma0(c40Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, 9));
                            } else {
                                i11++;
                            }
                        }
                    }
                    org.telegram.messenger.np.s1(c40Var.f45951o1.f22778a).O3(updates, false);
                    return;
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.voip.u(25, c40Var, tL_error));
                return;
            case 12:
                org.telegram.messenger.g0.h3(new hp((Object) ((c40) obj3), (Object) ((org.telegram.ui.ActionBar.t1) obj2), (Object) tLObject, (Object) ((TL_phone.exportGroupCallInvite) obj), tL_error, 9));
                return;
            case 13:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ma0(tLObject, (ArrayList) obj3, (ArrayList) obj2, (hp) obj, 11));
                return;
            case 14:
                k50 k50Var = (k50) obj3;
                String str = (String) obj;
                l50 l50Var = k50Var.f48591r;
                if (Objects.equals(k50Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
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
                        if (!l50Var.O || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList s02 = org.telegram.messenger.si.b0(l50.c0(l50Var)).s0(l50Var.h0());
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
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ma0(k50Var, arrayList, arrayList3, str, 14));
                    return;
                }
                return;
            case 15:
                String str3 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new hp((Object) ((LaunchActivity) obj3), (Object) tLObject, (Object) ((TLRPC.TL_messages_requestUrlAuth) obj), (Object) ((String) obj2), tL_error, 13));
                return;
            case 16:
                String str4 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new hp((Object) ((LaunchActivity) obj3), (Object) ((g50) obj2), (Object) tLObject, (Object) ((TLRPC.TL_wallPaper) obj), tL_error, 11));
                return;
            case 17:
                String str5 = LaunchActivity.C1;
                org.telegram.messenger.g0.h3(new hp((Object) ((LaunchActivity) obj3), (Object) tLObject, (Object) ((org.telegram.ui.ActionBar.t1) obj2), (Object) ((g50) obj), tL_error, 14));
                return;
            case 18:
                org.telegram.messenger.g0.h3(new hp((q90) obj3, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (String) obj2, 15));
                return;
            case 19:
                org.telegram.messenger.g0.h3(new tp((pa0) obj3, (org.telegram.ui.ActionBar.t1[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 24));
                return;
            case 20:
                org.telegram.messenger.g0.h3(new hp((KeyEvent.Callback) ((ob0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TLRPC.TL_auth_resendCode) obj), 17));
                return;
            case 21:
                org.telegram.messenger.g0.h3(new hp((KeyEvent.Callback) ((rc0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TL_account.verifyEmail) obj), 19));
                return;
            case 22:
                org.telegram.messenger.g0.h3(new hp((KeyEvent.Callback) ((rc0) obj3), tLObject, (Object) ((Bundle) obj2), tL_error, (TLObject) ((TL_account.sendVerifyEmailCode) obj), 18));
                return;
            case 23:
                org.telegram.messenger.g0.h3(new hp((Object) ((kd0) obj3), (Object) tLObject, (Object) ((TLRPC.TL_inputInvoicePremiumAuthCode) obj2), (Object) ((TLRPC.TL_inputStorePaymentAuthCode) obj), tL_error, 20));
                return;
            case 24:
                jg0 jg0Var = (jg0) obj3;
                String str6 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = z41.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    org.telegram.messenger.g0.h3(new jd0(6, jg0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                org.telegram.messenger.g0.h3(new hp(jg0Var, tL_error, bVar, str6, tL_loadAsyncGraph, 21));
                return;
            case 25:
                gg0 gg0Var = (gg0) obj3;
                String str7 = (String) obj2;
                y41 y41Var = (y41) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = z41.h0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), gg0Var.f48221r.f48836i, false);
                    } catch (JSONException e11) {
                        e11.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(gg0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.ma0(gg0Var, bVar, str7, y41Var, 26));
                return;
            case 26:
                org.telegram.messenger.g0.h3(new hp((KeyEvent.Callback) ((bh0) obj3), (TLObject) ((TLRPC.TL_contacts_importedContacts) tLObject), (Object) ((TLRPC.TL_inputPhoneContact) obj2), tL_error, (TLObject) ((TLRPC.TL_contacts_importContacts) obj), 22));
                return;
            case 27:
                org.telegram.messenger.g0.h3(new hp((ak0) obj3, tL_error, (Bundle) obj2, tLObject, (TLRPC.TL_auth_resendCode) obj, 24));
                return;
            case 28:
                org.telegram.messenger.g0.h3(new hp((jl0) obj3, tL_error, tLObject, (String) obj2, (TL_account.getPassword) obj, 25));
                return;
            default:
                jl0 jl0Var = (jl0) obj3;
                jd0 jd0Var = (jd0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    org.telegram.messenger.g0.h3(new lc0(jl0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, jd0Var, 18));
                    return;
                } else {
                    org.telegram.messenger.g0.h3(new nk0(jl0Var, tL_error, tLObject2, 2));
                    return;
                }
        }
    }

    public z9(Object obj, TLObject tLObject, String str, int i7) {
        this.f53911a = i7;
        this.f53912b = obj;
        this.d = tLObject;
        this.f53913c = str;
    }
}
