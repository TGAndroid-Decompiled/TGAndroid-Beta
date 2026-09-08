package ug;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import bi.r4;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.w1;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.b2;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.co;
import org.telegram.ui.oj0;
import yh.m2;
import zh.a4;
import zh.j5;
import zh.n8;
import zh.r5;
import zh.s5;
import zh.w3;
public final class r implements Runnable {
    public final int f47225a;
    public final Object f47226b;
    public final Object f47227c;

    public r(int i10, Object obj, Object obj2) {
        this.f47225a = i10;
        this.f47226b = obj;
        this.f47227c = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        yc a02;
        int i10;
        int i11;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z13;
        TLRPC.TL_messageReactions tL_messageReactions2;
        int i12 = this.f47225a;
        int i13 = 8;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        Object obj = this.f47227c;
        Object obj2 = this.f47226b;
        switch (i12) {
            case 0:
                ((w) obj2).run((TLRPC.TL_error) obj);
                return;
            case 1:
                ((oj0) obj2).run((ArrayList) obj);
                return;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) obj;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) obj2).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new b2(callback, smallGroupsParticipantsCount, 1));
                    return;
                }
                return;
            case 3:
                qc M = yc.a0((co) obj2).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) obj).stars)), R.raw.stars_send);
                M.f29706j = 5000;
                M.k(true);
                return;
            case 4:
                b0 b0Var = (b0) obj2;
                b0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, b0Var.f47097b0, Boolean.TRUE, (TL_stories.PrepaidGiveaway) obj);
                return;
            case 5:
                n1.P((n1) obj2, (TLObject) obj);
                return;
            case 6:
                vh.i iVar = (vh.i) obj2;
                iVar.f47923b.add((String) obj);
                iVar.invalidate();
                return;
            case 7:
                ((org.telegram.ui.web.b1) obj2).run((TLRPC.Chat) obj);
                return;
            case 8:
                xh.n nVar = (xh.n) obj2;
                f5 f5Var = (f5) obj;
                int i14 = nVar.f49479k;
                n2 n2Var = nVar.f49476g;
                TLRPC.TL_chatInviteImporter importer = f5Var.getImporter();
                nVar.f49486r = importer;
                LongSparseArray longSparseArray = nVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    n2Var.getMessagesController().putUser(user, false);
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (user.photo != null && !z10) {
                        if (nVar.f49487s == null) {
                            xh.m mVar = new xh.m(nVar, n2Var.getParentActivity(), (ll0) f5Var.getParent(), n2Var.getResourceProvider(), nVar.f49471a);
                            nVar.f49487s = mVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = nVar.f49486r;
                            x9 avatarImageView = f5Var.getAvatarImageView();
                            mVar.f49466r = tL_chatInviteImporter;
                            mVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i14).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i14, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i14, user2, 1);
                            if (MessagesController.getInstance(i14).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i14).loadUserInfo(user2, false, 0);
                            }
                            oh0 oh0Var = mVar.h;
                            oh0Var.setParentAvatarImage(avatarImageView);
                            oh0Var.M(tL_chatInviteImporter.user_id, true);
                            oh0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            mVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            String str = tL_chatInviteImporter.about;
                            TextView textView = mVar.f49463e;
                            textView.setText(str);
                            if (!TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i13 = 0;
                            }
                            textView.setVisibility(i13);
                            mVar.f49470y.requestLayout();
                            nVar.f49487s.setOnDismissListener(new r4(nVar, 11));
                            nVar.f49487s.show();
                            return;
                        }
                        return;
                    }
                    nVar.f49472b = true;
                    n2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f20043id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    n2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 9:
                yh.b bVar = (yh.b) obj2;
                bVar.getClass();
                ((View.OnClickListener) obj).onClick(bVar);
                return;
            case 10:
                ((yh.b1) obj2).getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                return;
            case 11:
                yh.h1 h1Var = (yh.h1) obj2;
                h1Var.getClass();
                if (!((TL_stars.SavedStarGift) obj).unsaved) {
                    h1Var.F.setVisibility(8);
                    return;
                }
                return;
            case 12:
                nr0 nr0Var = (nr0) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                nr0Var.h(tL_starGiftCollection.title, new oj0(15, nr0Var, tL_starGiftCollection));
                return;
            case 13:
                AndroidUtilities.addToClipboard((String) obj);
                yc.a0(((m2) obj2).f50468a.f50544a).k(false).j();
                return;
            case 14:
                zh.l lVar = (zh.l) obj2;
                TLObject tLObject = (TLObject) obj;
                int i15 = lVar.f52204a;
                ArrayList arrayList2 = lVar.f52207e;
                lVar.f52210i = 0;
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(i15).putUsers(connectedstarrefbots.users, false);
                    if (lVar.f52206c <= 0) {
                        arrayList2.clear();
                    }
                    lVar.f52206c = connectedstarrefbots.count;
                    arrayList2.addAll(connectedstarrefbots.connected_bots);
                    if (!connectedstarrefbots.connected_bots.isEmpty() && arrayList2.size() < lVar.f52206c) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    lVar.d = z11;
                } else {
                    lVar.h = true;
                    lVar.d = true;
                }
                lVar.f52209g = false;
                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(lVar.f52205b));
                return;
            case 15:
                zh.m mVar2 = (zh.m) obj2;
                TLObject tLObject2 = (TLObject) obj;
                int i16 = mVar2.f52271a;
                ArrayList arrayList3 = mVar2.f52274e;
                if (tLObject2 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject2;
                    MessagesController.getInstance(i16).putUsers(suggestedstarrefbots.users, false);
                    if (mVar2.f52273c <= 0) {
                        arrayList3.clear();
                    }
                    mVar2.f52273c = suggestedstarrefbots.count;
                    arrayList3.addAll(suggestedstarrefbots.suggested_bots);
                    mVar2.f52278j = suggestedstarrefbots.next_offset;
                    if (!suggestedstarrefbots.suggested_bots.isEmpty() && arrayList3.size() < mVar2.f52273c) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    mVar2.d = z12;
                } else {
                    mVar2.f52277i = true;
                    mVar2.d = true;
                }
                mVar2.h = false;
                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(mVar2.f52272b));
                return;
            case 16:
                w3.U0((w3) obj2, (Long) obj);
                return;
            case 17:
                w3 w3Var = (w3) obj2;
                if (!((s5) obj).f52600e) {
                    qc Q = w3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.f29716t = true;
                    Q.j();
                    return;
                }
                w3Var.f52804j0.setLoading(false);
                w3Var.w1();
                return;
            case 18:
                ((w3) obj2).getBulletinFactory().d0((TLRPC.TL_error) obj, false);
                return;
            case 19:
                MessagesController.getInstance(((w3) obj2).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) obj), false);
                return;
            case 20:
                w3 w3Var2 = (w3) obj2;
                w3Var2.getClass();
                ((boolean[]) obj)[0] = true;
                w3Var2.f52804j0.setLoading(false);
                w3Var2.w1();
                return;
            case 21:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                yc bulletinFactory = ((w3) obj2).getBulletinFactory();
                int i17 = R.raw.ic_delete;
                int i18 = R.string.GiftRemovedDescription;
                bulletinFactory.Q(i17, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i18, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 22:
                w3 w3Var3 = (w3) obj2;
                yc.a0((co) obj).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(w3Var3.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new zh.b1(w3Var3, 8)).k(true);
                return;
            case 23:
                ((w3) obj2).n2((CharSequence) obj);
                return;
            case 24:
                w3.I0((w3) obj2, (TL_stars.TL_payments_uniqueStarGift) obj);
                return;
            case 25:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((org.telegram.ui.ActionBar.b2) obj2).dismiss();
                n2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                        a02 = yc.a0(U);
                        i10 = R.raw.fire_on;
                        i11 = R.string.UniqueGiftNotFoundBurned;
                    } else {
                        a02 = yc.a0(U);
                        i10 = R.raw.error;
                        i11 = R.string.UniqueGiftNotFound;
                    }
                    w1.o(i11, a02, i10, 36);
                    return;
                }
                return;
            case 26:
                a4 a4Var = (a4) obj2;
                co coVar = (co) obj;
                org.telegram.ui.Cells.a0 a0Var = a4Var.f51710b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    a4Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var2 = a4Var.f51710b;
                    if (a0Var2 instanceof t1) {
                        messageObject = ((t1) a0Var2).getPrimaryMessageObject();
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
                    ArrayList<TLRPC.MessageReactor> arrayList4 = arrayList;
                    r5 r5Var = s5.y(messageObject.currentAccount, false).B;
                    if (r5Var != null) {
                        r5Var.b();
                    }
                    TLRPC.ChatFull chatFull = coVar.Z7;
                    Context context = a4Var.getContext();
                    int currentAccount = coVar.getCurrentAccount();
                    long a2 = coVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    MessageObject messageObject2 = messageObject;
                    n8 n8Var = new n8(context, currentAccount, a2, coVar, messageObject2, arrayList4, z13, false, 0L, coVar.getResourceProvider());
                    messageObject2.getId();
                    org.telegram.ui.Cells.a0 a0Var3 = a4Var.f51710b;
                    n8Var.T = coVar;
                    n8Var.U = a0Var3;
                    n8Var.show();
                    return;
                }
                return;
            case 27:
                TLObject tLObject3 = (TLObject) obj2;
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                if (tLObject3 instanceof TL_stars.StarGifts) {
                    b1Var.run((TL_stars.StarGifts) tLObject3);
                    return;
                } else {
                    b1Var.run(null);
                    return;
                }
            case 28:
                boolean[] zArr = (boolean[]) obj2;
                Utilities.Callback2 callback2 = (Utilities.Callback2) obj;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                j5 j5Var = (j5) obj2;
                TLObject tLObject4 = (TLObject) obj;
                ArrayList arrayList5 = j5Var.f52132l;
                int i19 = j5Var.f52123a;
                if (tLObject4 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject4;
                    MessagesController.getInstance(i19).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i19).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i20 = 0;
                        while (i20 < arrayList5.size() && ((TL_stars.SavedStarGift) arrayList5.get(i20)).pinned_to_top) {
                            i20++;
                        }
                        arrayList5.add(i20, savedStarGift);
                        NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(j5Var.f52124b), j5Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public r(s5 s5Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.f47225a = 28;
        this.f47226b = zArr;
        this.f47227c = callback2;
    }
}
