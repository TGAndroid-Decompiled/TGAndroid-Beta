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
public final class y9 implements RequestDelegate {
    public final int f44796a;
    public final Object f44797b;
    public final Object f44798c;
    public final Object d;

    public y9(Object obj, Object obj2, Object obj3, int i9) {
        this.f44796a = i9;
        this.f44797b = obj;
        this.f44798c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.f44796a;
        rf.b bVar = null;
        int i10 = 0;
        Object obj = this.d;
        Object obj2 = this.f44798c;
        Object obj3 = this.f44797b;
        switch (i9) {
            case 0:
                AndroidUtilities.runOnUIThread(new bg.o0((Object) ((ma) obj3), (Object) ((String) obj2), tL_error, tLObject, (Object) ((TL_account.checkUsername) obj), 22));
                return;
            case 1:
                final ma maVar = (ma) obj3;
                final org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new t1(maVar, c2Var, (TLRPC.User) tLObject, 8));
                    return;
                } else if ("USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                                    ma maVar2 = maVar;
                                    maVar2.getClass();
                                    try {
                                        c2Var2.dismiss();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    maVar2.finishFragment();
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.c2 c2Var3 = c2Var;
                                    ma maVar3 = maVar;
                                    maVar3.getClass();
                                    try {
                                        c2Var3.dismiss();
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    maVar3.g0();
                                    return;
                            }
                        }
                    });
                    return;
                } else if (!"USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) && !"USERNAME_INVALID".equals(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new k6(maVar, c2Var, tL_error, updateusername, 3));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                                    ma maVar2 = maVar;
                                    maVar2.getClass();
                                    try {
                                        c2Var2.dismiss();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    maVar2.finishFragment();
                                    return;
                                default:
                                    org.telegram.ui.ActionBar.c2 c2Var3 = c2Var;
                                    ma maVar3 = maVar;
                                    maVar3.getClass();
                                    try {
                                        c2Var3.dismiss();
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    maVar3.g0();
                                    return;
                            }
                        }
                    });
                    return;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new bg.o0((Object) ((id) obj3), (Object) ((String) obj2), tL_error, tLObject, (Object) ((TLRPC.TL_channels_checkUsername) obj), 25));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new k6((qn) obj3, (ve.d) obj2, tLObject, (gh.i2) obj, 5));
                return;
            case 4:
                qn qnVar = (qn) obj3;
                long[] jArr = (long[]) obj;
                AndroidUtilities.cancelRunOnUIThread((k6) obj2);
                qnVar.Z4.messageOwner.voiceTranscriptionRated = true;
                qnVar.getMessagesStorage().updateMessageVoiceTranscriptionOpen(qnVar.Z4.getDialogId(), qnVar.Z4.getId(), qnVar.Z4.messageOwner);
                jg jgVar = new jg(qnVar, 17);
                long j10 = 0;
                if (jArr[0] > 0) {
                    j10 = Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0]));
                }
                AndroidUtilities.runOnUIThread(jgVar, j10);
                return;
            case 5:
                qn qnVar2 = (qn) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new mg((org.telegram.ui.ActionBar.c2[]) obj2, 1));
                if (tL_error == null) {
                    qnVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new t1(qnVar2, tL_error, tL_messages_editMessage, 21));
                    return;
                }
            case 6:
                AndroidUtilities.runOnUIThread(new bg.o0((Object) ((vo) obj3), (Object) ((String) obj2), tL_error, tLObject, (Object) ((TLRPC.TL_channels_checkUsername) obj), 28));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new hr((ht) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new hr((dy) obj3, tLObject, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, tL_error, 6));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new gv((dy) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, 1));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new jq((l10) obj3, (org.telegram.ui.ActionBar.c2) obj2, (MessagesController.DialogFilter) obj, 9));
                return;
            case 11:
                o50 o50Var = (o50) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i11 = 0;
                    while (true) {
                        if (i11 < updates.updates.size()) {
                            TLRPC.Update update = updates.updates.get(i11);
                            if (update instanceof TL_update.TL_updateGroupCall) {
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0(o50Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, 6));
                            } else {
                                i11++;
                            }
                        }
                    }
                    o50Var.d.getMessagesController().processUpdates(updates, false);
                    return;
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.p61(28, o50Var, tL_error));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new hr((o50) obj3, (org.telegram.ui.ActionBar.c2) obj2, tLObject, (TL_phone.exportGroupCallInvite) obj, tL_error, 7));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0(tLObject, (ArrayList) obj3, (ArrayList) obj2, (hr) obj, 8));
                return;
            case 14:
                y60 y60Var = (y60) obj3;
                String str = (String) obj;
                z60 z60Var = y60Var.f44757r;
                if (Objects.equals(y60Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
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
                        if (!z60Var.J || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String trim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(z60.W(z60Var)).getStickerSets(z60Var.b0());
                    int size2 = stickerSets.size();
                    while (i10 < size2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i10);
                        i10++;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = tL_messages_stickerSet2;
                        String str2 = tL_messages_stickerSet3.set.short_name;
                        Locale locale = Locale.ROOT;
                        if (str2.toLowerCase(locale).contains(trim) || tL_messages_stickerSet3.set.title.toLowerCase(locale).contains(trim)) {
                            arrayList3.add(tL_messages_stickerSet3);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0(y60Var, arrayList, arrayList3, str, 11));
                    return;
                }
                return;
            case 15:
                Pattern pattern = LaunchActivity.f35493x1;
                AndroidUtilities.runOnUIThread(new hr((LaunchActivity) obj3, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj2, tL_error, 11));
                return;
            case 16:
                Pattern pattern2 = LaunchActivity.f35493x1;
                AndroidUtilities.runOnUIThread(new hr((LaunchActivity) obj3, (x20) obj2, tLObject, (TLRPC.TL_wallPaper) obj, tL_error, 9));
                return;
            case 17:
                Pattern pattern3 = LaunchActivity.f35493x1;
                AndroidUtilities.runOnUIThread(new hr((LaunchActivity) obj3, tLObject, (org.telegram.ui.ActionBar.c2) obj2, (x20) obj, tL_error, 12));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new hr((kb0) obj3, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (String) obj2, 13));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new jq((pc0) obj3, (org.telegram.ui.ActionBar.c2[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 23));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new hr((pd0) obj3, tLObject, (Bundle) obj2, tL_error, (TLRPC.TL_auth_resendCode) obj, 15));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new hr((ue0) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.verifyEmail) obj, 17));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new hr((ue0) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.sendVerifyEmailCode) obj, 16));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new hr((of0) obj3, tLObject, (TLRPC.TL_inputInvoicePremiumAuthCode) obj2, (TLRPC.TL_inputStorePaymentAuthCode) obj, tL_error, 18));
                return;
            case 24:
                ti0 ti0Var = (ti0) obj3;
                String str3 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = s91.d0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    AndroidUtilities.runOnUIThread(new cf0(6, ti0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                AndroidUtilities.runOnUIThread(new hr(ti0Var, tL_error, bVar, str3, tL_loadAsyncGraph, 19));
                return;
            case 25:
                qi0 qi0Var = (qi0) obj3;
                String str4 = (String) obj2;
                r91 r91Var = (r91) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVar = s91.d0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), qi0Var.f37133r.f37875i, false);
                    } catch (JSONException e11) {
                        e11.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(qi0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.no0(qi0Var, bVar, str4, r91Var, 23));
                return;
            case 26:
                AndroidUtilities.runOnUIThread(new hr((nj0) obj3, (TLRPC.TL_contacts_importedContacts) tLObject, (TLRPC.TL_inputPhoneContact) obj2, tL_error, (TLRPC.TL_contacts_importContacts) obj, 20));
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new hr((sm0) obj3, tL_error, (Bundle) obj2, tLObject, (TLRPC.TL_auth_resendCode) obj, 22));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new hr((co0) obj3, tL_error, tLObject, (String) obj2, (TL_account.getPassword) obj, 23));
                return;
            default:
                co0 co0Var = (co0) obj3;
                cf0 cf0Var = (cf0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    AndroidUtilities.runOnUIThread(new ye0(co0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, cf0Var, 16));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new dn0(co0Var, tL_error, tLObject2, 2));
                    return;
                }
        }
    }

    public y9(Object obj, TLObject tLObject, String str, int i9) {
        this.f44796a = i9;
        this.f44797b = obj;
        this.d = tLObject;
        this.f44798c = str;
    }
}
