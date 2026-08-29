package org.telegram.ui;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Toast;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_update;
public final class x9 implements RequestDelegate {
    public final int f44526a;
    public final Object f44527b;
    public final Object f44528c;
    public final Object d;

    public x9(Object obj, Object obj2, Object obj3, int i10) {
        this.f44526a = i10;
        this.f44527b = obj;
        this.f44528c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f44526a;
        uf.b bVar = null;
        int i11 = 0;
        Object obj = this.d;
        Object obj2 = this.f44528c;
        Object obj3 = this.f44527b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new eg.k0((Object) ((la) obj3), (Object) ((String) obj2), tL_error, tLObject, (Object) ((TL_account.checkUsername) obj), 21));
                return;
            case 1:
                final la laVar = (la) obj3;
                final org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new u1(laVar, c2Var, (TLRPC.User) tLObject, 8));
                    return;
                } else if ("USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                                    la laVar2 = laVar;
                                    laVar2.getClass();
                                    try {
                                        c2Var2.dismiss();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    laVar2.finishFragment();
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.c2 c2Var3 = c2Var;
                                    la laVar3 = laVar;
                                    laVar3.getClass();
                                    try {
                                        c2Var3.dismiss();
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    laVar3.h0();
                                    return;
                            }
                        }
                    });
                    return;
                } else if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(laVar, c2Var, tL_error, updateusername, 27));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                                    la laVar2 = laVar;
                                    laVar2.getClass();
                                    try {
                                        c2Var2.dismiss();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    laVar2.finishFragment();
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.c2 c2Var3 = c2Var;
                                    la laVar3 = laVar;
                                    laVar3.getClass();
                                    try {
                                        c2Var3.dismiss();
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    laVar3.h0();
                                    return;
                            }
                        }
                    });
                    return;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new eg.k0((Object) ((hd) obj3), (Object) ((String) obj2), tL_error, tLObject, (Object) ((TLRPC.TL_channels_checkUsername) obj), 24));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((tn) obj3, (ye.c) obj2, tLObject, (jh.g2) obj, 29));
                return;
            case 4:
                tn tnVar = (tn) obj3;
                long[] jArr = (long[]) obj;
                AndroidUtilities.cancelRunOnUIThread((gg) obj2);
                tnVar.Z4.messageOwner.voiceTranscriptionRated = true;
                tnVar.getMessagesStorage().updateMessageVoiceTranscriptionOpen(tnVar.Z4.getDialogId(), tnVar.Z4.getId(), tnVar.Z4.messageOwner);
                ig igVar = new ig(tnVar, 17);
                long j10 = 0;
                if (jArr[0] > 0) {
                    j10 = Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0]));
                }
                AndroidUtilities.runOnUIThread(igVar, j10);
                return;
            case 5:
                tn tnVar2 = (tn) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new lg((org.telegram.ui.ActionBar.c2[]) obj2, 1));
                if (tL_error == null) {
                    tnVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new u1(tnVar2, tL_error, tL_messages_editMessage, 21));
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new eg.k0((Object) ((yo) obj3), (Object) ((String) obj2), tL_error, tLObject, (Object) ((TLRPC.TL_channels_checkUsername) obj), 27));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((ht) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj, 4));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((fy) obj3, tLObject, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, tL_error, 5));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new hv((fy) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, 1));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new lq((n10) obj3, (org.telegram.ui.ActionBar.c2) obj2, (MessagesController.DialogFilter) obj, 9));
                return;
            case 11:
                r50 r50Var = (r50) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i12 = 0;
                    while (true) {
                        if (i12 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i12);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                AndroidUtilities.runOnUIThread(new n20(r50Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, 0));
                            } else {
                                i12++;
                            }
                        }
                    }
                    r50Var.d.getMessagesController().processUpdates(updates, false);
                    return;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.o(25, r50Var, tL_error));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((r50) obj3, (org.telegram.ui.ActionBar.c2) obj2, tLObject, (TL_phone.exportGroupCallInvite) obj, tL_error, 6));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new n20(tLObject, (ArrayList) obj3, (ArrayList) obj2, (org.telegram.ui.Components.u20) obj, 2));
                return;
            case 14:
                b70 b70Var = (b70) obj3;
                String str = (String) obj;
                c70 c70Var = b70Var.f36706r;
                if (Objects.equals(b70Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TLRPC.StickerSetCovered> arrayList2 = ((TLRPC.TL_messages_foundStickerSets) tLObject).sets;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i13);
                        i13++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = new TLRPC.TL_messages_stickerSet();
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        tL_messages_stickerSet.set = stickerSet;
                        tL_messages_stickerSet.documents = stickerSetCovered2.covers;
                        if (!c70Var.J || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(c70.X(c70Var)).getStickerSets(c70Var.c0());
                    int size2 = stickerSets.size();
                    while (i11 < size2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i11);
                        i11++;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = tL_messages_stickerSet2;
                        String str2 = tL_messages_stickerSet3.set.short_name;
                        Locale locale = Locale.ROOT;
                        if (str2.toLowerCase(locale).contains(trim) || tL_messages_stickerSet3.set.title.toLowerCase(locale).contains(trim)) {
                            arrayList3.add(tL_messages_stickerSet3);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new n20(b70Var, arrayList, arrayList3, str, 5));
                    return;
                }
                return;
            case 15:
                Pattern pattern = LaunchActivity.f35560x1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((LaunchActivity) obj3, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj2, tL_error, 10));
                return;
            case 16:
                Pattern pattern2 = LaunchActivity.f35560x1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((LaunchActivity) obj3, (x60) obj2, tLObject, (TLRPC.TL_wallPaper) obj, tL_error, 8));
                return;
            case 17:
                Pattern pattern3 = LaunchActivity.f35560x1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((LaunchActivity) obj3, tLObject, (org.telegram.ui.ActionBar.c2) obj2, (x60) obj, tL_error, 11));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((mb0) obj3, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (String) obj2, 12));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new lq((rc0) obj3, (org.telegram.ui.ActionBar.c2[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 23));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((pd0) obj3, tLObject, (Bundle) obj2, tL_error, (TLRPC.TL_auth_resendCode) obj, 14));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((te0) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.verifyEmail) obj, 16));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((te0) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.sendVerifyEmailCode) obj, 15));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((of0) obj3, tLObject, (TLRPC.TL_inputInvoicePremiumAuthCode) obj2, (TLRPC.TL_inputStorePaymentAuthCode) obj, tL_error, 17));
                return;
            case 24:
                si0 si0Var = (si0) obj3;
                String str3 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = t91.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    AndroidUtilities.runOnUIThread(new lf0(3, si0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20(si0Var, tL_error, bVar, str3, tL_loadAsyncGraph, 18));
                return;
            case 25:
                pi0 pi0Var = (pi0) obj3;
                String str4 = (String) obj2;
                s91 s91Var = (s91) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = t91.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), pi0Var.f37430r.f38075i, false);
                    } catch (JSONException e11) {
                        e11.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(pi0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new n20(pi0Var, bVar, str4, s91Var, 17));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((kj0) obj3, (TLRPC.TL_contacts_importedContacts) tLObject, (TLRPC.TL_inputPhoneContact) obj2, tL_error, (TLRPC.TL_contacts_importContacts) obj, 19));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((rm0) obj3, tL_error, (Bundle) obj2, tLObject, (TLRPC.TL_auth_resendCode) obj, 21));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.u20((bo0) obj3, tL_error, tLObject, (String) obj2, (TL_account.getPassword) obj, 22));
                return;
            default:
                bo0 bo0Var = (bo0) obj3;
                lf0 lf0Var = (lf0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    AndroidUtilities.runOnUIThread(new xe0(bo0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, lf0Var, 16));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new cn0(bo0Var, tL_error, tLObject2, 2));
                    return;
                }
        }
    }

    public x9(Object obj, TLObject tLObject, String str, int i10) {
        this.f44526a = i10;
        this.f44527b = obj;
        this.d = tLObject;
        this.f44528c = str;
    }
}
