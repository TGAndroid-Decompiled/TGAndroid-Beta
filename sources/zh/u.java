package zh;

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
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xo0;
public final class u implements Runnable {
    public final int f52673a;
    public final Object f52674b;
    public final Object f52675c;
    public final Object d;
    public final Object f52676e;
    public final Object f52677f;

    public u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f52673a = i10;
        this.f52675c = obj;
        this.d = obj2;
        this.f52676e = obj3;
        this.f52677f = obj4;
        this.f52674b = obj5;
    }

    @Override
    public final void run() {
        long j3;
        long j10;
        int i10;
        int i11;
        int i12 = this.f52673a;
        xo0 xo0Var = 0;
        SQLiteCursor sQLiteCursor = null;
        xo0 xo0Var2 = null;
        r5 = null;
        TL_stars.SavedStarGift savedStarGift = null;
        xo0 xo0Var3 = null;
        Object obj = this.f52674b;
        Object obj2 = this.f52677f;
        Object obj3 = this.f52676e;
        Object obj4 = this.d;
        Object obj5 = this.f52675c;
        int i13 = 0;
        switch (i12) {
            case 0:
                a0 a0Var = (a0) obj5;
                of.e eVar = (of.e) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                b1 b1Var = a0Var.f51661q0;
                if (b1Var != null) {
                    b1Var.run();
                }
                eVar.c(false);
                b2Var.dismiss();
                a0Var.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    if (updates != null) {
                        qc M = yc.a0(U).M(LocaleController.getString(R.string.GiftOfferSentTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferSentText, a0Var.Z, DialogObject.getShortName(a0Var.f51646a0))), R.raw.forward);
                        M.f29689t = true;
                        M.j();
                        return;
                    }
                    yc.a0(U).d0(tL_error, false);
                    return;
                }
                return;
            case 1:
                s5 s5Var = (s5) obj5;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                bi.f0 f0Var = (bi.f0) obj4;
                TLObject tLObject = (TLObject) obj3;
                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = (TLRPC.TL_inputInvoiceStars) obj2;
                if (tL_error2 != null) {
                    f0Var.run(Boolean.FALSE, tL_error2.text);
                    return;
                }
                if (tLObject instanceof TLRPC.PaymentForm) {
                    TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                    paymentForm.invoice.recurring = true;
                    MessagesController.getInstance(s5Var.f52566a).putUsers(paymentForm.users, false);
                    xo0Var = new xo0(paymentForm, tL_inputInvoiceStars, null);
                } else if (tLObject instanceof TLRPC.PaymentReceipt) {
                    xo0Var = new xo0((TLRPC.PaymentReceipt) tLObject);
                }
                if (xo0Var != 0) {
                    xo0Var.Z0 = new rg.p2(f0Var, 25);
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    if (R != 0) {
                        if (AndroidUtilities.hasDialogOnTop(R)) {
                            ?? obj6 = new Object();
                            obj6.f21142a = true;
                            R.showAsSheet(xo0Var, obj6);
                            return;
                        }
                        R.presentFragment(xo0Var);
                        return;
                    }
                    return;
                }
                f0Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                return;
            case 2:
                s5 s5Var2 = (s5) obj5;
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
                    MessagesController.getInstance(s5Var2.f52566a).putUsers(paymentForm2.users, false);
                    xo0Var3 = new xo0(paymentForm2, tL_inputInvoiceStars2, null);
                } else if (tLObject2 instanceof TLRPC.PaymentReceipt) {
                    xo0Var3 = new xo0((TLRPC.PaymentReceipt) tLObject2);
                }
                if (xo0Var3 != null) {
                    xo0Var3.Z0 = new rg.p2(d80Var, 26);
                    org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                    if (R2 != 0) {
                        if (AndroidUtilities.hasDialogOnTop(R2)) {
                            ?? obj7 = new Object();
                            obj7.f21142a = true;
                            R2.showAsSheet(xo0Var3, obj7);
                            return;
                        }
                        R2.presentFragment(xo0Var3);
                        return;
                    }
                    return;
                }
                d80Var.run(Boolean.FALSE, "UNKNOWN_RESPONSE");
                return;
            case 3:
                ((boolean[]) obj4)[0] = true;
                ((s5) obj5).Z((String) obj3, (TLRPC.ChatInvite) obj2, new ii.a((Utilities.Callback2) obj, 25));
                return;
            case 4:
                MessagesStorage messagesStorage = (MessagesStorage) obj5;
                ArrayList arrayList = (ArrayList) obj4;
                ArrayList<TLRPC.Chat> arrayList2 = (ArrayList) obj3;
                ArrayList<TLRPC.User> arrayList3 = (ArrayList) obj2;
                rg.p2 p2Var = (rg.p2) obj;
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
                            } catch (Exception e7) {
                                e = e7;
                                i13 = i14;
                                j3 = j11;
                                FileLog.e(e);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                j10 = j3;
                                i10 = i13;
                                AndroidUtilities.runOnUIThread(new fi.p3(p2Var, arrayList, i10, j10, arrayList3, arrayList2));
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
                    } catch (Exception e10) {
                        e = e10;
                        j3 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new fi.p3(p2Var, arrayList, i10, j10, arrayList3, arrayList2));
                    return;
                } catch (Throwable th2) {
                    if (0 != 0) {
                        xo0Var.dispose();
                    }
                    throw th2;
                }
            case 5:
                TLObject tLObject3 = (TLObject) obj4;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                int i16 = ((s5) obj5).f52566a;
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
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
                s5 s5Var3 = (s5) obj5;
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
                    MessagesController.getInstance(s5Var3.f52566a).putUsers(paymentForm3.users, false);
                    xo0Var2 = new xo0(paymentForm3, tL_inputInvoiceStars3, null);
                } else if (tLObject4 instanceof TLRPC.PaymentReceipt) {
                    xo0Var2 = new xo0((TLRPC.PaymentReceipt) tLObject4);
                }
                if (xo0Var2 != null) {
                    xo0Var2.Z0 = new rg.p2(callback2, 24);
                    org.telegram.ui.ActionBar.n2 R3 = LaunchActivity.R();
                    if (R3 != 0) {
                        if (AndroidUtilities.hasDialogOnTop(R3)) {
                            ?? obj9 = new Object();
                            obj9.f21142a = true;
                            R3.showAsSheet(xo0Var2, obj9);
                            return;
                        }
                        R3.presentFragment(xo0Var2);
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
                    AndroidUtilities.runOnUIThread(new b4(2, callback22));
                    return;
                }
                c5.o oVar = (c5.o) list.get(0);
                c5.k a2 = oVar.a();
                if (a2 == null) {
                    FileLog.d("StarsController.buy queryProductDetails done: no details");
                    AndroidUtilities.runOnUIThread(new b4(3, callback22));
                    return;
                }
                tL_inputStorePaymentStarsTopup.currency = a2.f4410c;
                tL_inputStorePaymentStarsTopup.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_starsTopupOption.currency)) * (a2.f4409b / Math.pow(10.0d, 6.0d)));
                BillingController.getInstance().addResultListener(oVar.f4422c, new di.e5(callback22, 6));
                BillingController.getInstance().setOnCanceled(new b4(0, callback22));
                FileLog.d("StarsController.buy launchBillingFlow");
                BillingController billingController = BillingController.getInstance();
                AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
                pf.b bVar = new pf.b(7, false);
                bVar.h0((c5.o) list.get(0));
                billingController.launchBillingFlow(activity, accountInstance, tL_inputStorePaymentStarsTopup, Collections.singletonList(bVar.w()));
                return;
        }
    }

    public u(s5 s5Var, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, TLObject tLObject, TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars, int i10) {
        this.f52673a = i10;
        this.f52675c = s5Var;
        this.f52674b = tL_error;
        this.d = callback2;
        this.f52676e = tLObject;
        this.f52677f = tL_inputInvoiceStars;
    }

    public u(s5 s5Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.InputSavedStarGift inputSavedStarGift, Utilities.Callback callback) {
        this.f52673a = 5;
        this.f52675c = s5Var;
        this.f52676e = b2Var;
        this.d = tLObject;
        this.f52677f = inputSavedStarGift;
        this.f52674b = callback;
    }
}
