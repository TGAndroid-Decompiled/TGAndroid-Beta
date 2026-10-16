package zh;

import android.content.Context;
import android.view.MotionEvent;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fo;
public final class m implements Runnable {
    public final int f50809a;
    public final Object f50810b;
    public final Object f50811c;

    public m(int i10, Object obj, Object obj2) {
        this.f50809a = i10;
        this.f50810b = obj;
        this.f50811c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        zc a02;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z11;
        TLRPC.TL_messageReactions tL_messageReactions2;
        int i12 = this.f50809a;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        Object obj = this.f50811c;
        Object obj2 = this.f50810b;
        switch (i12) {
            case 0:
                n nVar = (n) obj2;
                TLObject tLObject = (TLObject) obj;
                int i13 = nVar.f50844a;
                ArrayList arrayList2 = nVar.e;
                if (tLObject instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject;
                    MessagesController.getInstance(i13).putUsers(suggestedstarrefbots.users, false);
                    if (nVar.f50846c <= 0) {
                        arrayList2.clear();
                    }
                    nVar.f50846c = suggestedstarrefbots.count;
                    arrayList2.addAll(suggestedstarrefbots.suggested_bots);
                    nVar.f50850j = suggestedstarrefbots.next_offset;
                    if (!suggestedstarrefbots.suggested_bots.isEmpty() && arrayList2.size() < nVar.f50846c) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    nVar.d = z10;
                } else {
                    nVar.f50849i = true;
                    nVar.d = true;
                }
                nVar.h = false;
                NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(nVar.f50845b));
                return;
            case 1:
                r3.V0((r3) obj2, (Long) obj);
                return;
            case 2:
                r3 r3Var = (r3) obj2;
                if (!((n5) obj).e) {
                    sc Q = r3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.f28815t = true;
                    Q.j();
                    return;
                }
                r3Var.f51089k0.setLoading(false);
                r3Var.x1();
                return;
            case 3:
                ((r3) obj2).getBulletinFactory().f0((TLRPC.TL_error) obj, false);
                return;
            case 4:
                MessagesController.getInstance(((r3) obj2).currentAccount).lambda$processUpdates$377((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 5:
                r3 r3Var2 = (r3) obj2;
                r3Var2.getClass();
                ((boolean[]) obj)[0] = true;
                r3Var2.f51089k0.setLoading(false);
                r3Var2.x1();
                return;
            case 6:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                ((r3) obj2).getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 7:
                r3 r3Var3 = (r3) obj2;
                zc.a0((fo) obj).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(r3Var3.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new a1(r3Var3, 8)).k(true);
                return;
            case 8:
                ((r3) obj2).p2((CharSequence) obj);
                return;
            case 9:
                r3.J0((r3) obj2, (TL_stars.TL_payments_uniqueStarGift) obj);
                return;
            case 10:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((org.telegram.ui.ActionBar.a2) obj2).dismiss();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        a02 = zc.a0(U);
                        i10 = R.raw.fire_on;
                        i11 = R.string.UniqueGiftNotFoundBurned;
                    } else {
                        a02 = zc.a0(U);
                        i10 = R.raw.error;
                        i11 = R.string.UniqueGiftNotFound;
                    }
                    org.telegram.messenger.g0.q(i11, a02, i10, 36);
                    return;
                }
                return;
            case 11:
                v3 v3Var = (v3) obj2;
                fo foVar = (fo) obj;
                org.telegram.ui.Cells.a0 a0Var = v3Var.f51238b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    v3Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var2 = v3Var.f51238b;
                    if (a0Var2 instanceof org.telegram.ui.Cells.u1) {
                        messageObject = ((org.telegram.ui.Cells.u1) a0Var2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.messageOwner;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                        } else {
                            return;
                        }
                    } else if ((a0Var2 instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) a0Var2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                    } else {
                        return;
                    }
                    MessageObject messageObject2 = messageObject;
                    ArrayList<TLRPC.MessageReactor> arrayList3 = arrayList;
                    m5 m5Var = n5.y(messageObject2.currentAccount, false).B;
                    if (m5Var != null) {
                        m5Var.b();
                    }
                    TLRPC.ChatFull chatFull = foVar.Z7;
                    Context context = v3Var.getContext();
                    int currentAccount = foVar.getCurrentAccount();
                    long a2 = foVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    h8 h8Var = new h8(context, currentAccount, a2, foVar, messageObject2, arrayList3, z11, false, 0L, foVar.getResourceProvider());
                    messageObject2.getId();
                    org.telegram.ui.Cells.a0 a0Var3 = v3Var.f51238b;
                    h8Var.U = foVar;
                    h8Var.V = a0Var3;
                    h8Var.show();
                    return;
                }
                return;
            case 12:
                TLObject tLObject2 = (TLObject) obj;
                ji.p1 p1Var = (ji.p1) obj2;
                if (tLObject2 instanceof TL_stars.StarGifts) {
                    p1Var.run((TL_stars.StarGifts) tLObject2);
                    return;
                } else {
                    p1Var.run(null);
                    return;
                }
            case 13:
                boolean[] zArr = (boolean[]) obj2;
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            case 14:
                f5 f5Var = (f5) obj2;
                TLObject tLObject3 = (TLObject) obj;
                ArrayList arrayList4 = f5Var.f50510l;
                int i14 = f5Var.f50502a;
                if (tLObject3 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject3;
                    MessagesController.getInstance(i14).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i14).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i15 = 0;
                        while (i15 < arrayList4.size() && ((TL_stars.SavedStarGift) arrayList4.get(i15)).pinned_to_top) {
                            i15++;
                        }
                        arrayList4.add(i15, savedStarGift);
                        NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(f5Var.f50503b), f5Var);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ((MessagesController) obj2).lambda$processUpdates$377((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 16:
                new zc(((org.telegram.ui.ActionBar.e3[]) obj2)[0].topBulletinContainer, (org.telegram.ui.ActionBar.c6) obj).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            default:
                h8 h8Var2 = (h8) obj2;
                h8Var2.S = true;
                h8Var2.q(new k5((m5) obj, 2));
                AndroidUtilities.runOnUIThread(new q7(h8Var2, 1), 240L);
                return;
        }
    }

    public m(TLObject tLObject, ji.p1 p1Var) {
        this.f50809a = 12;
        this.f50811c = tLObject;
        this.f50810b = p1Var;
    }

    public m(n5 n5Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.f50809a = 13;
        this.f50810b = zArr;
        this.f50811c = callback2;
    }
}
