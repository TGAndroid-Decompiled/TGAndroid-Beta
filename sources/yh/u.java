package yh;

import android.app.Activity;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yo0;
public final class u implements Runnable {
    public final int f47865a;
    public final Object f47866b;
    public final Object f47867c;
    public final Object d;
    public final Object e;
    public final Object f47868f;

    public u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f47865a = i10;
        this.f47867c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f47868f = obj4;
        this.f47866b = obj5;
    }

    @Override
    public final void run() {
        long j3;
        long j10;
        int i10;
        int i11;
        int i12 = this.f47865a;
        yo0 yo0Var = 0;
        SQLiteCursor sQLiteCursor = null;
        yo0 yo0Var2 = null;
        r5 = null;
        TL_stars.SavedStarGift savedStarGift = null;
        yo0 yo0Var3 = null;
        Object obj = this.f47866b;
        Object obj2 = this.f47868f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.f47867c;
        int i13 = 0;
        switch (i12) {
            case 0:
                a0 a0Var = (a0) obj5;
                nf.e eVar = (nf.e) obj4;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                b1 b1Var = a0Var.f46940q0;
                if (b1Var != null) {
                    b1Var.run();
                }
                eVar.c(false);
                c2Var.dismiss();
                a0Var.dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    if (updates != null) {
                        oc M = vc.a0(U).M(LocaleController.getString(R.string.GiftOfferSentTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferSentText, a0Var.Z, DialogObject.getShortName(a0Var.f46925a0))), R.raw.forward);
                        M.f26715t = true;
                        M.j();
                        return;
                    }
                    vc.a0(U).d0(tL_error, false);
                    return;
                }
                return;
            case 1:
                v5 v5Var = (v5) obj5;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                ai.m0 m0Var = (ai.m0) obj4;
                TLObject tLObject = (TLObject) obj3;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) obj2;
                if (tL_error2 != null) {
                    m0Var.run(Boolean.FALSE, tL_error2.text);
                    return;
                }
                if (tLObject instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                    paymentForm.invoice.recurring = true;
                    MessagesController.getInstance(v5Var.f47923a).putUsers(paymentForm.users, false);
                    yo0Var = new yo0(paymentForm, tL_inputInvoiceStars, null);
                } else if (tLObject instanceof TLRPC.PaymentReceipt) {
                    yo0Var = new yo0((TLRPC.PaymentReceipt) tLObject);
                }
                if (yo0Var != 0) {
                    yo0Var.Z0 = new r5.d(m0Var, 25);
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    if (R != 0) {
                        if (AndroidUtilities.hasDialogOnTop(R)) {
                            ?? obj6 = new Object();
                            obj6.f19398a = true;
                            R.showAsSheet(yo0Var, obj6);
                            return;
                        }
                        R.presentFragment(yo0Var);
                        return;
                    }
                    return;
                }
                m0Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                return;
            case 2:
                v5 v5Var2 = (v5) obj5;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                d80 d80Var = (d80) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars2 = (TLRPC.TL_inputInvoiceStars) obj2;
                if (tL_error3 != null) {
                    d80Var.run(Boolean.FALSE, tL_error3.text);
                    return;
                }
                if (tLObject2 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm2 = (TLRPC.PaymentForm) tLObject2;
                    paymentForm2.invoice.recurring = true;
                    MessagesController.getInstance(v5Var2.f47923a).putUsers(paymentForm2.users, false);
                    yo0Var3 = new yo0(paymentForm2, tL_inputInvoiceStars2, null);
                } else if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    yo0Var3 = new yo0((TLRPC.PaymentReceipt) tLObject2);
                }
                if (yo0Var3 != null) {
                    yo0Var3.Z0 = new r5.d(d80Var, 26);
                    org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                    if (R2 != 0) {
                        if (AndroidUtilities.hasDialogOnTop(R2)) {
                            ?? obj7 = new Object();
                            obj7.f19398a = true;
                            R2.showAsSheet(yo0Var3, obj7);
                            return;
                        }
                        R2.presentFragment(yo0Var3);
                        return;
                    }
                    return;
                }
                d80Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                return;
            case 3:
                ((boolean[]) obj4)[0] = true;
                ((v5) obj5).Z((String) obj3, (TLRPC.ChatInvite) obj2, new hi.a((Utilities.Callback2) obj, 25));
                return;
            case 4:
                MessagesStorage messagesStorage = (MessagesStorage) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                ArrayList<TLRPC.Chat> arrayList2 = (ArrayList) obj3;
                ArrayList<TLRPC.User> arrayList3 = (ArrayList) obj2;
                r5.d dVar = (r5.d) obj;
                try {
                    try {
                        sQLiteCursor = messagesStorage.getDatabase().queryFinalized("SELECT data, hash, time FROM star_gifts2 ORDER BY pos ASC", new Object[0]);
                        int i14 = 0;
                        long j11 = 0;
                        while (sQLiteCursor.next()) {
                            try {
                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                                if (byteBufferValue != null) {
                                    TL_stars.StarGift TLdeserialize = TL_stars.StarGift.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    if (TLdeserialize != null) {
                                        arrayList.add(TLdeserialize);
                                    }
                                    byteBufferValue.reuse();
                                    i14 = (int) sQLiteCursor.longValue(1);
                                    j11 = sQLiteCursor.longValue(2);
                                }
                            } catch (Exception e) {
                                e = e;
                                i13 = i14;
                                j3 = j11;
                                FileLog.e(e);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                j10 = j3;
                                i10 = i13;
                                AndroidUtilities.runOnUIThread(new ei.p3(dVar, arrayList, i10, j10, arrayList3, arrayList2));
                                return;
                            }
                        }
                        ArrayList<Long> arrayList4 = new ArrayList<>();
                        ArrayList arrayList5 = new ArrayList();
                        int size = arrayList.size();
                        while (i13 < size) {
                            Object obj8 = arrayList.get(i13);
                            i13++;
                            TLRPC.Peer peer = ((TL_stars.StarGift) obj8).released_by;
                            if (peer != null) {
                                i11 = size;
                                long peerDialogId = DialogObject.getPeerDialogId(peer);
                                int i15 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
                                if (i15 > 0) {
                                    arrayList4.add(Long.valueOf(peerDialogId));
                                } else if (i15 < 0) {
                                    arrayList5.add(Long.valueOf(-peerDialogId));
                                }
                            } else {
                                i11 = size;
                            }
                            size = i11;
                        }
                        if (!arrayList5.isEmpty()) {
                            messagesStorage.getChatsInternal(TextUtils.join(",", arrayList5), arrayList2);
                        }
                        if (!arrayList4.isEmpty()) {
                            messagesStorage.getUsersInternal(arrayList4, arrayList3);
                        }
                        sQLiteCursor.dispose();
                        j10 = j11;
                        i10 = i14;
                    } catch (Exception e7) {
                        e = e7;
                        j3 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new ei.p3(dVar, arrayList, i10, j10, arrayList3, arrayList2));
                    return;
                } catch (Throwable th2) {
                    if (0 != 0) {
                        yo0Var.dispose();
                    }
                    throw th2;
                }
            case 5:
                TLObject tLObject3 = (TLObject) obj4;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                int i16 = ((v5) obj5).f47923a;
                ((org.telegram.ui.ActionBar.c2) obj3).dismiss();
                if (tLObject3 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject3;
                    MessagesController.getInstance(i16).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i16).putChats(tL_payments_savedStarGifts.chats, false);
                    while (i13 < tL_payments_savedStarGifts.gifts.size()) {
                        TL_stars.SavedStarGift savedStarGift2 = tL_payments_savedStarGifts.gifts.get(i13);
                        if (((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) && ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id == savedStarGift2.msg_id) || ((inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) && ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id == savedStarGift2.saved_id)) {
                            savedStarGift = savedStarGift2;
                        } else {
                            i13++;
                        }
                    }
                }
                callback.run(savedStarGift);
                return;
            case 6:
                v5 v5Var3 = (v5) obj5;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj;
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj4;
                TLObject tLObject4 = (TLObject) obj3;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars3 = (TLRPC.TL_inputInvoiceStars) obj2;
                if (tL_error4 != null) {
                    callback2.run(Boolean.FALSE, tL_error4.text);
                    return;
                }
                if (tLObject4 instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm3 = (TLRPC.PaymentForm) tLObject4;
                    paymentForm3.invoice.recurring = true;
                    MessagesController.getInstance(v5Var3.f47923a).putUsers(paymentForm3.users, false);
                    yo0Var2 = new yo0(paymentForm3, tL_inputInvoiceStars3, null);
                } else if (tLObject4 instanceof TLRPC.PaymentReceipt) {
                    yo0Var2 = new yo0((TLRPC.PaymentReceipt) tLObject4);
                }
                if (yo0Var2 != null) {
                    yo0Var2.Z0 = new r5.d(callback2, 24);
                    org.telegram.ui.ActionBar.o2 R3 = LaunchActivity.R();
                    if (R3 != 0) {
                        if (AndroidUtilities.hasDialogOnTop(R3)) {
                            ?? obj9 = new Object();
                            obj9.f19398a = true;
                            R3.showAsSheet(yo0Var2, obj9);
                            return;
                        }
                        R3.presentFragment(yo0Var2);
                        return;
                    }
                    return;
                }
                callback2.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                return;
            default:
                List list = (List) obj5;
                Utilities.Callback2 callback22 = (Utilities.Callback2) obj4;
                TLRPC.TL_inputStorePaymentStarsTopup tL_inputStorePaymentStarsTopup = (TLRPC.TL_inputStorePaymentStarsTopup) obj3;
                TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) obj2;
                Activity activity = (Activity) obj;
                if (list.isEmpty()) {
                    FileLog.d("StarsController.buy queryProductDetails done: no products");
                    AndroidUtilities.runOnUIThread(new f4(2, callback22));
                    return;
                }
                c5.o oVar = (c5.o) list.get(0);
                c5.k a2 = oVar.a();
                if (a2 == null) {
                    FileLog.d("StarsController.buy queryProductDetails done: no details");
                    AndroidUtilities.runOnUIThread(new f4(3, callback22));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = a2.f3906c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption.currency)) * (a2.f3905b / Math.pow(10.0d, 6.0d)));
                BillingController.getInstance().addResultListener(oVar.f3917c, new ci.e5(callback22, 6));
                BillingController.getInstance().setOnCanceled(new f4(0, callback22));
                FileLog.d("StarsController.buy launchBillingFlow");
                BillingController billingController = BillingController.getInstance();
                AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                of.b bVar = new of.b(7, false);
                bVar.U((c5.o) list.get(0));
                billingController.launchBillingFlow(activity, accountInstance, tL_inputStorePaymentStarsTopup, Collections.singletonList(bVar.C()));
                return;
        }
    }

    public u(v5 v5Var, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, TLObject tLObject, TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars, int i10) {
        this.f47865a = i10;
        this.f47867c = v5Var;
        this.f47866b = tL_error;
        this.d = callback2;
        this.e = tLObject;
        this.f47868f = tL_inputInvoiceStars;
    }

    public u(v5 v5Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        this.f47865a = 5;
        this.f47867c = v5Var;
        this.e = c2Var;
        this.d = tLObject;
        this.f47868f = inputSavedStarGift;
        this.f47866b = callback;
    }
}
