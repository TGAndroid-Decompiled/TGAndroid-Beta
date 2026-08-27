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

public final class z9 implements RequestDelegate {

    public final int f45107a;

    public final Object f45108b;

    public final Object f45109c;
    public final Object d;

    public z9(Object obj, Object obj2, Object obj3, int i10) {
        this.f45107a = i10;
        this.f45108b = obj;
        this.f45109c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f45107a;
        sf.b bVarE0 = null;
        final int i11 = 0;
        final int i12 = 1;
        Object obj = this.d;
        Object obj2 = this.f45109c;
        Object obj3 = this.f45108b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new cg.k0(obj3, obj2, tL_error, tLObject, obj, 21));
                break;
            case 1:
                final na naVar = (na) obj3;
                final org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                TL_account.updateUsername updateusername = (TL_account.updateUsername) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new u1(naVar, b2Var, (TLRPC.User) tLObject, 8));
                } else if ("USERNAME_NOT_MODIFIED".equals(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                                    na naVar2 = naVar;
                                    naVar2.getClass();
                                    try {
                                        b2Var2.dismiss();
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                    }
                                    naVar2.finishFragment();
                                    break;
                                default:
                                    org.telegram.ui.ActionBar.b2 b2Var3 = b2Var;
                                    na naVar3 = naVar;
                                    naVar3.getClass();
                                    try {
                                        b2Var3.dismiss();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    naVar3.h0();
                                    break;
                            }
                        }
                    });
                } else if ("USERNAME_PURCHASE_AVAILABLE".equals(tL_error.text) || "USERNAME_INVALID".equals(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                                    na naVar2 = naVar;
                                    naVar2.getClass();
                                    try {
                                        b2Var2.dismiss();
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                    }
                                    naVar2.finishFragment();
                                    break;
                                default:
                                    org.telegram.ui.ActionBar.b2 b2Var3 = b2Var;
                                    na naVar3 = naVar;
                                    naVar3.getClass();
                                    try {
                                        b2Var3.dismiss();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    naVar3.h0();
                                    break;
                            }
                        }
                    });
                } else {
                    AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(naVar, b2Var, tL_error, updateusername, 29));
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new cg.k0(obj3, obj2, tL_error, tLObject, obj, 24));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new yf((rn) obj3, (we.d) obj2, tLObject, (hh.i2) obj, 1));
                break;
            case 4:
                rn rnVar = (rn) obj3;
                long[] jArr = (long[]) obj;
                AndroidUtilities.cancelRunOnUIThread((yf) obj2);
                rnVar.Z4.messageOwner.voiceTranscriptionRated = true;
                rnVar.getMessagesStorage().updateMessageVoiceTranscriptionOpen(rnVar.Z4.getDialogId(), rnVar.Z4.getId(), rnVar.Z4.messageOwner);
                AndroidUtilities.runOnUIThread(new lg(rnVar, 17), jArr[0] > 0 ? Math.max(0L, 300 - (SystemClock.elapsedRealtime() - jArr[0])) : 0L);
                break;
            case 5:
                rn rnVar2 = (rn) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new og((org.telegram.ui.ActionBar.b2[]) obj2, i12));
                if (tL_error == null) {
                    rnVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                } else {
                    AndroidUtilities.runOnUIThread(new u1(rnVar2, tL_error, tL_messages_editMessage, 21));
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new cg.k0(obj3, obj2, tL_error, tLObject, obj, 27));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((kt) obj3, tL_error, tLObject, (ArrayList) obj2, (TLRPC.TL_messages_getMyStickers) obj, 4));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((gy) obj3, tLObject, (TLRPC.UserFull) obj2, (TL_account.TL_birthday) obj, tL_error, 5));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new jv((gy) obj3, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj, i12));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new lq((o10) obj3, (org.telegram.ui.ActionBar.b2) obj2, (MessagesController.DialogFilter) obj, 9));
                break;
            case 11:
                s50 s50Var = (s50) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    for (int i13 = 0; i13 < updates.updates.size(); i13++) {
                        TLRPC.Update update = updates.updates.get(i13);
                        if (update instanceof TL_update.TL_updateGroupCall) {
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11(s50Var, chat, inputPeer, (TL_update.TL_updateGroupCall) update, 2));
                            s50Var.d.getMessagesController().processUpdates(updates, false);
                        }
                        break;
                    }
                    s50Var.d.getMessagesController().processUpdates(updates, false);
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.r61(28, s50Var, tL_error));
                }
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((s50) obj3, (org.telegram.ui.ActionBar.b2) obj2, tLObject, (TL_phone.exportGroupCallInvite) obj, tL_error, 6));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11(tLObject, (ArrayList) obj3, (ArrayList) obj2, (org.telegram.ui.Components.l20) obj, 4));
                break;
            case 14:
                b70 b70Var = (b70) obj3;
                String str = (String) obj;
                c70 c70Var = b70Var.f36716r;
                if (Objects.equals(b70Var.h, (String) obj2) && (tLObject instanceof TLRPC.TL_messages_foundStickerSets)) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList<TLRPC.StickerSetCovered> arrayList2 = ((TLRPC.TL_messages_foundStickerSets) tLObject).sets;
                    int size = arrayList2.size();
                    int i14 = 0;
                    while (i14 < size) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList2.get(i14);
                        i14++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = new TLRPC.TL_messages_stickerSet();
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        tL_messages_stickerSet.set = stickerSet;
                        tL_messages_stickerSet.documents = stickerSetCovered2.covers;
                        if (!c70Var.J || stickerSet.emojis) {
                            arrayList.add(tL_messages_stickerSet);
                        }
                    }
                    String strTrim = str.toLowerCase(Locale.ROOT).trim();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(((org.telegram.ui.ActionBar.n2) c70Var).currentAccount).getStickerSets(c70Var.c0());
                    int size2 = stickerSets.size();
                    while (i11 < size2) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets.get(i11);
                        i11++;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = tL_messages_stickerSet2;
                        String str2 = tL_messages_stickerSet3.set.short_name;
                        Locale locale = Locale.ROOT;
                        if (str2.toLowerCase(locale).contains(strTrim) || tL_messages_stickerSet3.set.title.toLowerCase(locale).contains(strTrim)) {
                            arrayList3.add(tL_messages_stickerSet3);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11(b70Var, arrayList, arrayList3, str, 7));
                }
                break;
            case 15:
                Pattern pattern = LaunchActivity.f35496x1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((LaunchActivity) obj3, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj, (String) obj2, tL_error, 10));
                break;
            case 16:
                Pattern pattern2 = LaunchActivity.f35496x1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((LaunchActivity) obj3, (a30) obj2, tLObject, (TLRPC.TL_wallPaper) obj, tL_error, 8));
                break;
            case 17:
                Pattern pattern3 = LaunchActivity.f35496x1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((LaunchActivity) obj3, tLObject, (org.telegram.ui.ActionBar.b2) obj2, (a30) obj, tL_error, 11));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((ob0) obj3, tL_error, tLObject, (TLRPC.TL_inputInvoiceSlug) obj, (String) obj2, 12));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new lq((tc0) obj3, (org.telegram.ui.ActionBar.b2[]) obj2, (TLRPC.TL_messageMediaVenue) obj, 23));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((sd0) obj3, tLObject, (Bundle) obj2, tL_error, (TLRPC.TL_auth_resendCode) obj, 14));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((xe0) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.verifyEmail) obj, 16));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((xe0) obj3, tLObject, (Bundle) obj2, tL_error, (TL_account.sendVerifyEmailCode) obj, 15));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((rf0) obj3, tLObject, (TLRPC.TL_inputInvoicePremiumAuthCode) obj2, (TLRPC.TL_inputStorePaymentAuthCode) obj, tL_error, 17));
                break;
            case 24:
                vi0 vi0Var = (vi0) obj3;
                String str3 = (String) obj2;
                TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = (TL_stats.TL_loadAsyncGraph) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVarE0 = q91.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), 1, false);
                    } catch (JSONException e9) {
                        e9.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    AndroidUtilities.runOnUIThread(new ff0(6, vi0Var, (TL_stats.TL_statsGraphError) tLObject));
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20(vi0Var, tL_error, bVarE0, str3, tL_loadAsyncGraph, 18));
                break;
            case 25:
                si0 si0Var = (si0) obj3;
                String str4 = (String) obj2;
                p91 p91Var = (p91) obj;
                if (tLObject instanceof TL_stats.TL_statsGraph) {
                    try {
                        bVarE0 = q91.e0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), si0Var.f36469r.f37027i, false);
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else if (tLObject instanceof TL_stats.TL_statsGraphError) {
                    Toast.makeText(si0Var.getContext(), ((TL_stats.TL_statsGraphError) tLObject).error, 1).show();
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11(si0Var, bVarE0, str4, p91Var, 19));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((oj0) obj3, (TLRPC.TL_contacts_importedContacts) tLObject, (TLRPC.TL_inputPhoneContact) obj2, tL_error, (TLRPC.TL_contacts_importContacts) obj, 19));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((tm0) obj3, tL_error, (Bundle) obj2, tLObject, (TLRPC.TL_auth_resendCode) obj, 21));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l20((do0) obj3, tL_error, tLObject, (String) obj2, (TL_account.getPassword) obj, 22));
                break;
            default:
                do0 do0Var = (do0) obj3;
                ff0 ff0Var = (ff0) obj2;
                TLObject tLObject2 = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_payments_validatedRequestedInfo) {
                    AndroidUtilities.runOnUIThread(new bf0(do0Var, (TLRPC.TL_payments_validatedRequestedInfo) tLObject, ff0Var, 16));
                } else {
                    AndroidUtilities.runOnUIThread(new en0(do0Var, tL_error, tLObject2, 2));
                }
                break;
        }
    }

    public z9(Object obj, TLObject tLObject, String str, int i10) {
        this.f45107a = i10;
        this.f45108b = obj;
        this.d = tLObject;
        this.f45109c = str;
    }
}
