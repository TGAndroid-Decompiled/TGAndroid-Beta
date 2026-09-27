package uf;

import ai.f5;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import ii.q1;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.l0;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.et;
import org.telegram.ui.xn;
import uh.i;
import wh.m;
import wh.n;
import xh.c1;
import xh.j1;
import xh.p2;
import yh.b1;
import yh.b4;
import yh.k5;
import yh.l;
import yh.n8;
import yh.p5;
import yh.r5;
import yh.s5;
import yh.w7;
import yh.x3;
public final class b implements Runnable {
    public final int f44018a;
    public final Object f44019b;
    public final Object f44020c;

    public b(int i10, Object obj, Object obj2) {
        this.f44018a = i10;
        this.f44019b = obj;
        this.f44020c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        File pathToAttach;
        boolean z10;
        boolean z11;
        boolean z12;
        xc a02;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z13;
        TLRPC.TL_messageReactions tL_messageReactions2;
        int i12 = this.f44018a;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        int i13 = 0;
        Object obj = this.f44020c;
        Object obj2 = this.f44019b;
        switch (i12) {
            case 0:
                d dVar = (d) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                while (i13 < arrayList2.size()) {
                    c cVar = (c) arrayList2.get(i13);
                    if (cVar != null && ((TextUtils.isEmpty(cVar.f44022b) || !new File(cVar.f44022b).exists()) && (document = cVar.f44021a) != null && ((pathToAttach = FileLoader.getInstance(dVar.f44028c).getPathToAttach(document)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new b(1, dVar, document));
                    }
                    i13++;
                }
                return;
            case 1:
                TLRPC.Document document2 = (TLRPC.Document) obj;
                FileLoader.getInstance(((d) obj2).f44028c).loadFile(document2, document2, 0, 0);
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                int i14 = ((e) obj2).f44030a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(i14).ringtoneDurationMax)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(i14).ringtoneSizeMax / 1024)));
                    return;
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat));
                    return;
                }
            case 3:
                i iVar = (i) obj2;
                iVar.f44135b.add((String) obj);
                iVar.invalidate();
                return;
            case 4:
                ((q1) obj2).run((TLRPC.Chat) obj);
                return;
            case 5:
                n nVar = (n) obj2;
                g5 g5Var = (g5) obj;
                int i15 = nVar.f45442k;
                o2 o2Var = nVar.f45439g;
                TLRPC.TL_chatInviteImporter importer = g5Var.getImporter();
                nVar.f45449r = importer;
                LongSparseArray longSparseArray = nVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    o2Var.getMessagesController().putUser(user, false);
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (user.photo != null && !z10) {
                        if (nVar.f45450s == null) {
                            m mVar = new m(nVar, o2Var.getParentActivity(), (yl0) g5Var.getParent(), o2Var.getResourceProvider(), nVar.f45435a);
                            nVar.f45450s = mVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = nVar.f45449r;
                            w9 avatarImageView = g5Var.getAvatarImageView();
                            mVar.f45430r = tL_chatInviteImporter;
                            mVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i15).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i15, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i15, user2, 1);
                            if (MessagesController.getInstance(i15).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i15).loadUserInfo(user2, false, 0);
                            }
                            bi0 bi0Var = mVar.h;
                            bi0Var.setParentAvatarImage(avatarImageView);
                            bi0Var.M(tL_chatInviteImporter.user_id, true);
                            bi0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            mVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            String str = tL_chatInviteImporter.about;
                            TextView textView = mVar.e;
                            textView.setText(str);
                            if (TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i13 = 8;
                            }
                            textView.setVisibility(i13);
                            mVar.f45434y.requestLayout();
                            nVar.f45450s.setOnDismissListener(new f5(nVar, 11));
                            nVar.f45450s.show();
                            return;
                        }
                        return;
                    }
                    nVar.f45436b = true;
                    o2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f18476id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    o2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 6:
                xh.b bVar = (xh.b) obj2;
                bVar.getClass();
                ((View.OnClickListener) obj).onClick(bVar);
                return;
            case 7:
                ((c1) obj2).getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                return;
            case 8:
                j1 j1Var = (j1) obj2;
                j1Var.getClass();
                if (!((TL_stars.SavedStarGift) obj).unsaved) {
                    j1Var.F.setVisibility(8);
                    return;
                }
                return;
            case 9:
                bs0 bs0Var = (bs0) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                bs0Var.h(tL_starGiftCollection.title, new et(24, bs0Var, tL_starGiftCollection));
                return;
            case 10:
                AndroidUtilities.addToClipboard((String) obj);
                xc.a0(((p2) obj2).f46405a.f46469a).k(false).j();
                return;
            case 11:
                l lVar = (l) obj2;
                TLObject tLObject = (TLObject) obj;
                int i16 = lVar.f47707a;
                ArrayList arrayList3 = lVar.e;
                lVar.f47712i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(i16).putUsers(connectedstarrefbots.users, false);
                    if (lVar.f47709c <= 0) {
                        arrayList3.clear();
                    }
                    lVar.f47709c = connectedstarrefbots.count;
                    arrayList3.addAll(connectedstarrefbots.connected_bots);
                    if (!connectedstarrefbots.connected_bots.isEmpty() && arrayList3.size() < lVar.f47709c) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    lVar.d = z11;
                } else {
                    lVar.h = true;
                    lVar.d = true;
                }
                lVar.f47711g = false;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(lVar.f47708b));
                return;
            case 12:
                yh.m mVar2 = (yh.m) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i17 = mVar2.f47761a;
                ArrayList arrayList4 = mVar2.e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    MessagesController.getInstance(i17).putUsers(suggestedstarrefbots.users, false);
                    if (mVar2.f47763c <= 0) {
                        arrayList4.clear();
                    }
                    mVar2.f47763c = suggestedstarrefbots.count;
                    arrayList4.addAll(suggestedstarrefbots.suggested_bots);
                    mVar2.f47767j = suggestedstarrefbots.next_offset;
                    if (!suggestedstarrefbots.suggested_bots.isEmpty() && arrayList4.size() < mVar2.f47763c) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    mVar2.d = z12;
                } else {
                    mVar2.f47766i = true;
                    mVar2.d = true;
                }
                mVar2.h = false;
                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(mVar2.f47762b));
                return;
            case 13:
                x3.U0((x3) obj2, (Long) obj);
                return;
            case 14:
                x3 x3Var = (x3) obj2;
                if (!((s5) obj).e) {
                    qc Q = x3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.f27701t = true;
                    Q.j();
                    return;
                }
                x3Var.f48295j0.setLoading(false);
                x3Var.w1();
                return;
            case 15:
                ((x3) obj2).getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                return;
            case 16:
                MessagesController.getInstance(((x3) obj2).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 17:
                x3 x3Var2 = (x3) obj2;
                x3Var2.getClass();
                ((boolean[]) obj)[0] = true;
                x3Var2.f48295j0.setLoading(false);
                x3Var2.w1();
                return;
            case 18:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                xc bulletinFactory = ((x3) obj2).getBulletinFactory();
                int i18 = R.raw.ic_delete;
                int i19 = R.string.GiftRemovedDescription;
                bulletinFactory.Q(i18, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i19, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 19:
                x3 x3Var3 = (x3) obj2;
                xc.a0((xn) obj).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(x3Var3.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new b1(x3Var3, 8)).k(true);
                return;
            case 20:
                ((x3) obj2).n2((CharSequence) obj);
                return;
            case 21:
                x3.I0((x3) obj2, (TL_stars.TL_payments_uniqueStarGift) obj);
                return;
            case 22:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                ((c2) obj2).dismiss();
                o2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error2 != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error2.text)) {
                        a02 = xc.a0(U);
                        i10 = R.raw.fire_on;
                        i11 = R.string.UniqueGiftNotFoundBurned;
                    } else {
                        a02 = xc.a0(U);
                        i10 = R.raw.error;
                        i11 = R.string.UniqueGiftNotFound;
                    }
                    l0.o(i11, a02, i10, 36);
                    return;
                }
                return;
            case 23:
                b4 b4Var = (b4) obj2;
                xn xnVar = (xn) obj;
                a0 a0Var = b4Var.f47277b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    b4Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    a0 a0Var2 = b4Var.f47277b;
                    if (a0Var2 instanceof u1) {
                        messageObject = ((u1) a0Var2).getPrimaryMessageObject();
                        if (messageObject != null) {
                            TLRPC.Message message = messageObject.messageOwner;
                            if (message != null && (tL_messageReactions2 = message.reactions) != null) {
                                arrayList = tL_messageReactions2.top_reactors;
                            }
                        } else {
                            return;
                        }
                    } else if ((a0Var2 instanceof w0) && (messageObject = ((w0) a0Var2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                    } else {
                        return;
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList5 = arrayList;
                    r5 r5Var = s5.y(messageObject.currentAccount, false).B;
                    if (r5Var != null) {
                        r5Var.b();
                    }
                    TLRPC.ChatFull chatFull = xnVar.Z7;
                    Context context = b4Var.getContext();
                    int currentAccount = xnVar.getCurrentAccount();
                    long a2 = xnVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    MessageObject messageObject2 = messageObject;
                    n8 n8Var = new n8(context, currentAccount, a2, xnVar, messageObject2, arrayList5, z13, false, 0L, xnVar.getResourceProvider());
                    messageObject2.getId();
                    a0 a0Var3 = b4Var.f47277b;
                    n8Var.T = xnVar;
                    n8Var.U = a0Var3;
                    n8Var.show();
                    return;
                }
                return;
            case 24:
                TLObject tLObject3 = (TLObject) obj2;
                q1 q1Var = (q1) obj;
                if (tLObject3 instanceof TL_stars.StarGifts) {
                    q1Var.run((TL_stars.StarGifts) tLObject3);
                    return;
                } else {
                    q1Var.run(null);
                    return;
                }
            case 25:
                boolean[] zArr = (boolean[]) obj2;
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            case 26:
                k5 k5Var = (k5) obj2;
                TLObject tLObject4 = (TLObject) obj;
                ArrayList arrayList6 = k5Var.f47666l;
                int i20 = k5Var.f47658a;
                if (tLObject4 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject4;
                    MessagesController.getInstance(i20).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i20).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i21 = 0;
                        while (i21 < arrayList6.size() && ((TL_stars.SavedStarGift) arrayList6.get(i21)).pinned_to_top) {
                            i21++;
                        }
                        arrayList6.add(i21, savedStarGift);
                        NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(k5Var.f47659b), k5Var);
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ((MessagesController) obj2).processUpdates((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 28:
                new xc(((g3[]) obj2)[0].topBulletinContainer, (e6) obj).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
            default:
                n8 n8Var2 = (n8) obj2;
                n8Var2.R = true;
                n8Var2.o(new p5((r5) obj, 2));
                AndroidUtilities.runOnUIThread(new w7(n8Var2, 1), 240L);
                return;
        }
    }

    public b(s5 s5Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.f44018a = 25;
        this.f44019b = zArr;
        this.f44020c = callback2;
    }
}
