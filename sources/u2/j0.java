package u2;

import ai.g5;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
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
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yh0;
import org.telegram.ui.Components.yr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.pj0;
import org.telegram.ui.zn;
import xh.o2;
import yh.c4;
import yh.l5;
import yh.o8;
import yh.t5;
import yh.u5;
import yh.y3;
public final class j0 implements Runnable {
    public final int f43693a;
    public final Object f43694b;
    public final Object f43695c;

    public j0(int i10, Object obj, Object obj2) {
        this.f43693a = i10;
        this.f43694b = obj;
        this.f43695c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        xc a02;
        int i11;
        int i12;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z13;
        TLRPC.TL_messageReactions tL_messageReactions2;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        switch (this.f43693a) {
            case 0:
                ((e2.h) this.f43694b).accept(this.f43695c);
                return;
            case 1:
                ((v0) this.f43694b).A((c3.b0) this.f43695c);
                return;
            case 2:
                uf.c cVar = (uf.c) this.f43694b;
                TLObject tLObject = (TLObject) this.f43695c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = cVar.e;
                        if (!cVar.f44000f) {
                            cVar.f(false);
                            cVar.f44000f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList3.get(i13);
                            i13++;
                            uf.b bVar = (uf.b) obj;
                            if (bVar.f43993b != null && (document = bVar.f43992a) != null) {
                                hashMap.put(Long.valueOf(document.f18334id), bVar.f43993b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences d = cVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList2.size());
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            TLRPC.Document document3 = arrayList2.get(i14);
                            String str = (String) hashMap.get(Long.valueOf(document3.f18334id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i14, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i14, str);
                            }
                            ?? obj2 = new Object();
                            obj2.f43992a = document3;
                            obj2.f43993b = str;
                            int i15 = cVar.d;
                            cVar.d = i15 + 1;
                            obj2.f43994c = i15;
                            arrayList3.add(obj2);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(cVar.f43999c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        uf.c.f43995g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        uf.c.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    cVar.b();
                    return;
                }
                return;
            case 3:
                uf.c cVar2 = (uf.c) this.f43694b;
                ArrayList arrayList4 = (ArrayList) this.f43695c;
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    uf.b bVar2 = (uf.b) arrayList4.get(i16);
                    if (bVar2 != null && ((TextUtils.isEmpty(bVar2.f43993b) || !new File(bVar2.f43993b).exists()) && (document2 = bVar2.f43992a) != null && ((pathToAttach = FileLoader.getInstance(cVar2.f43999c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new j0(4, cVar2, document2));
                    }
                }
                return;
            case 4:
                TLRPC.Document document4 = (TLRPC.Document) this.f43695c;
                FileLoader.getInstance(((uf.c) this.f43694b).f43999c).loadFile(document4, document4, 0, 0);
                return;
            case 5:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f43695c;
                int i17 = ((uf.d) this.f43694b).f44001a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(i17).ringtoneDurationMax)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(i17).ringtoneSizeMax / 1024)));
                    return;
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat));
                    return;
                }
            case 6:
                uh.i iVar = (uh.i) this.f43694b;
                iVar.f44105b.add((String) this.f43695c);
                iVar.invalidate();
                return;
            case 7:
                ((org.telegram.ui.web.b1) this.f43694b).run((TLRPC.Chat) this.f43695c);
                return;
            case 8:
                wh.n nVar = (wh.n) this.f43694b;
                h5 h5Var = (h5) this.f43695c;
                int i18 = nVar.f45413k;
                n2 n2Var = nVar.f45410g;
                TLRPC.TL_chatInviteImporter importer = h5Var.getImporter();
                nVar.f45420r = importer;
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
                        if (nVar.f45421s == null) {
                            wh.m mVar = new wh.m(nVar, n2Var.getParentActivity(), (vl0) h5Var.getParent(), n2Var.getResourceProvider(), nVar.f45406a);
                            nVar.f45421s = mVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = nVar.f45420r;
                            v9 avatarImageView = h5Var.getAvatarImageView();
                            TextView textView = mVar.e;
                            yh0 yh0Var = mVar.h;
                            mVar.f45401r = tL_chatInviteImporter;
                            mVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i18).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i18, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i18, user2, 1);
                            if (MessagesController.getInstance(i18).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i18).loadUserInfo(user2, false, 0);
                            }
                            yh0Var.setParentAvatarImage(avatarImageView);
                            yh0Var.M(tL_chatInviteImporter.user_id, true);
                            yh0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            mVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            if (TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            textView.setVisibility(i10);
                            mVar.f45405y.requestLayout();
                            nVar.f45421s.setOnDismissListener(new g5(nVar, 11));
                            nVar.f45421s.show();
                            return;
                        }
                        return;
                    }
                    nVar.f45407b = true;
                    n2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f18475id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    n2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 9:
                xh.b bVar3 = (xh.b) this.f43694b;
                bVar3.getClass();
                ((View.OnClickListener) this.f43695c).onClick(bVar3);
                return;
            case 10:
                ((xh.c1) this.f43694b).getBulletinFactory().d0((TLRPC.TL_error) this.f43695c, false);
                return;
            case 11:
                xh.j1 j1Var = (xh.j1) this.f43694b;
                j1Var.getClass();
                if (!((TL_stars.SavedStarGift) this.f43695c).unsaved) {
                    j1Var.F.setVisibility(8);
                    return;
                }
                return;
            case 12:
                yr0 yr0Var = (yr0) this.f43694b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f43695c;
                yr0Var.h(tL_starGiftCollection.title, new pj0(15, yr0Var, tL_starGiftCollection));
                return;
            case 13:
                AndroidUtilities.addToClipboard((String) this.f43695c);
                xc.a0(((o2) this.f43694b).f46347a.f46416a).k(false).j();
                return;
            case 14:
                yh.l lVar = (yh.l) this.f43694b;
                TLObject tLObject2 = (TLObject) this.f43695c;
                int i19 = lVar.f47666a;
                ArrayList arrayList5 = lVar.e;
                lVar.f47671i = 0;
                if (tLObject2 instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject2;
                    MessagesController.getInstance(i19).putUsers(connectedstarrefbots.users, false);
                    if (lVar.f47668c <= 0) {
                        arrayList5.clear();
                    }
                    lVar.f47668c = connectedstarrefbots.count;
                    arrayList5.addAll(connectedstarrefbots.connected_bots);
                    if (!connectedstarrefbots.connected_bots.isEmpty() && arrayList5.size() < lVar.f47668c) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    lVar.d = z11;
                } else {
                    lVar.h = true;
                    lVar.d = true;
                }
                lVar.f47670g = false;
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(lVar.f47667b));
                return;
            case 15:
                yh.m mVar2 = (yh.m) this.f43694b;
                TLObject tLObject3 = (TLObject) this.f43695c;
                int i20 = mVar2.f47727a;
                ArrayList arrayList6 = mVar2.e;
                if (tLObject3 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject3;
                    MessagesController.getInstance(i20).putUsers(suggestedstarrefbots.users, false);
                    if (mVar2.f47729c <= 0) {
                        arrayList6.clear();
                    }
                    mVar2.f47729c = suggestedstarrefbots.count;
                    arrayList6.addAll(suggestedstarrefbots.suggested_bots);
                    mVar2.f47733j = suggestedstarrefbots.next_offset;
                    if (!suggestedstarrefbots.suggested_bots.isEmpty() && arrayList6.size() < mVar2.f47729c) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    mVar2.d = z12;
                } else {
                    mVar2.f47732i = true;
                    mVar2.d = true;
                }
                mVar2.h = false;
                NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(mVar2.f47728b));
                return;
            case 16:
                y3.U0((y3) this.f43694b, (Long) this.f43695c);
                return;
            case 17:
                y3 y3Var = (y3) this.f43694b;
                if (!((u5) this.f43695c).e) {
                    pc Q = y3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.f27262t = true;
                    Q.j();
                    return;
                }
                y3Var.f48317j0.setLoading(false);
                y3Var.w1();
                return;
            case 18:
                ((y3) this.f43694b).getBulletinFactory().d0((TLRPC.TL_error) this.f43695c, false);
                return;
            case 19:
                MessagesController.getInstance(((y3) this.f43694b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.f43695c), false);
                return;
            case 20:
                y3 y3Var2 = (y3) this.f43694b;
                y3Var2.getClass();
                ((boolean[]) this.f43695c)[0] = true;
                y3Var2.f48317j0.setLoading(false);
                y3Var2.w1();
                return;
            case 21:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f43695c;
                xc bulletinFactory = ((y3) this.f43694b).getBulletinFactory();
                int i21 = R.raw.ic_delete;
                int i22 = R.string.GiftRemovedDescription;
                bulletinFactory.Q(i21, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i22, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 22:
                y3 y3Var3 = (y3) this.f43694b;
                xc.a0((zn) this.f43695c).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(y3Var3.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new yh.b1(y3Var3, 8)).k(true);
                return;
            case 23:
                ((y3) this.f43694b).n2((CharSequence) this.f43695c);
                return;
            case 24:
                y3.I0((y3) this.f43694b, (TL_stars.TL_payments_uniqueStarGift) this.f43695c);
                return;
            case 25:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f43695c;
                ((b2) this.f43694b).dismiss();
                n2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error2 != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error2.text)) {
                        a02 = xc.a0(U);
                        i11 = R.raw.fire_on;
                        i12 = R.string.UniqueGiftNotFoundBurned;
                    } else {
                        a02 = xc.a0(U);
                        i11 = R.raw.error;
                        i12 = R.string.UniqueGiftNotFound;
                    }
                    org.telegram.messenger.l0.o(i12, a02, i11, 36);
                    return;
                }
                return;
            case 26:
                c4 c4Var = (c4) this.f43694b;
                zn znVar = (zn) this.f43695c;
                org.telegram.ui.Cells.a0 a0Var = c4Var.f47296b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    c4Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var2 = c4Var.f47296b;
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
                    } else if ((a0Var2 instanceof org.telegram.ui.Cells.w0) && (messageObject = ((org.telegram.ui.Cells.w0) a0Var2).getMessageObject()) != null) {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        if (message2 != null && (tL_messageReactions = message2.reactions) != null) {
                            arrayList = tL_messageReactions.top_reactors;
                        }
                    } else {
                        return;
                    }
                    MessageObject messageObject2 = messageObject;
                    ArrayList<TLRPC.MessageReactor> arrayList7 = arrayList;
                    t5 t5Var = u5.y(messageObject2.currentAccount, false).B;
                    if (t5Var != null) {
                        t5Var.b();
                    }
                    TLRPC.ChatFull chatFull = znVar.Z7;
                    Context context = c4Var.getContext();
                    int currentAccount = znVar.getCurrentAccount();
                    long a2 = znVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    o8 o8Var = new o8(context, currentAccount, a2, znVar, messageObject2, arrayList7, z13, false, 0L, znVar.getResourceProvider());
                    messageObject2.getId();
                    org.telegram.ui.Cells.a0 a0Var3 = c4Var.f47296b;
                    o8Var.T = znVar;
                    o8Var.U = a0Var3;
                    o8Var.show();
                    return;
                }
                return;
            case 27:
                TLObject tLObject4 = (TLObject) this.f43694b;
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f43695c;
                if (tLObject4 instanceof TL_stars.StarGifts) {
                    b1Var.run((TL_stars.StarGifts) tLObject4);
                    return;
                } else {
                    b1Var.run(null);
                    return;
                }
            case 28:
                boolean[] zArr = (boolean[]) this.f43694b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f43695c;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                l5 l5Var = (l5) this.f43694b;
                TLObject tLObject5 = (TLObject) this.f43695c;
                ArrayList arrayList8 = l5Var.f47690l;
                int i23 = l5Var.f47682a;
                if (tLObject5 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject5;
                    MessagesController.getInstance(i23).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i23).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i24 = 0;
                        while (i24 < arrayList8.size() && ((TL_stars.SavedStarGift) arrayList8.get(i24)).pinned_to_top) {
                            i24++;
                        }
                        arrayList8.add(i24, savedStarGift);
                        NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l5Var.f47683b), l5Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public j0(u5 u5Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.f43693a = 28;
        this.f43694b = zArr;
        this.f43695c = callback2;
    }
}
