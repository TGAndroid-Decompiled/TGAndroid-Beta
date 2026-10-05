package u2;

import ai.f5;
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
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ft;
import org.telegram.ui.yn;
import xh.o2;
import yh.c4;
import yh.l5;
import yh.r8;
import yh.t5;
import yh.u5;
import yh.y3;
public final class i0 implements Runnable {
    public final int f47294a;
    public final Object f47295b;
    public final Object f47296c;

    public i0(int i10, Object obj, Object obj2) {
        this.f47294a = i10;
        this.f47295b = obj;
        this.f47296c = obj2;
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
        yc a02;
        int i11;
        int i12;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z13;
        TLRPC.TL_messageReactions tL_messageReactions2;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        switch (this.f47294a) {
            case 0:
                ((e2.h) this.f47295b).accept(this.f47296c);
                return;
            case 1:
                ((v0) this.f47295b).A((c3.b0) this.f47296c);
                return;
            case 2:
                uf.c cVar = (uf.c) this.f47295b;
                TLObject tLObject = (TLObject) this.f47296c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = cVar.f47639e;
                        if (!cVar.f47640f) {
                            cVar.f(false);
                            cVar.f47640f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList3.get(i13);
                            i13++;
                            uf.b bVar = (uf.b) obj;
                            if (bVar.f47632b != null && (document = bVar.f47631a) != null) {
                                hashMap.put(Long.valueOf(document.f20053id), bVar.f47632b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences d = cVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList2.size());
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            TLRPC.Document document3 = arrayList2.get(i14);
                            String str = (String) hashMap.get(Long.valueOf(document3.f20053id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i14, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i14, str);
                            }
                            ?? obj2 = new Object();
                            obj2.f47631a = document3;
                            obj2.f47632b = str;
                            int i15 = cVar.d;
                            cVar.d = i15 + 1;
                            obj2.f47633c = i15;
                            arrayList3.add(obj2);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(cVar.f47638c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        uf.c.f47634g = j3;
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
                uf.c cVar2 = (uf.c) this.f47295b;
                ArrayList arrayList4 = (ArrayList) this.f47296c;
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    uf.b bVar2 = (uf.b) arrayList4.get(i16);
                    if (bVar2 != null && ((TextUtils.isEmpty(bVar2.f47632b) || !new File(bVar2.f47632b).exists()) && (document2 = bVar2.f47631a) != null && ((pathToAttach = FileLoader.getInstance(cVar2.f47638c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new i0(4, cVar2, document2));
                    }
                }
                return;
            case 4:
                TLRPC.Document document4 = (TLRPC.Document) this.f47296c;
                FileLoader.getInstance(((uf.c) this.f47295b).f47638c).loadFile(document4, document4, 0, 0);
                return;
            case 5:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f47296c;
                int i17 = ((uf.d) this.f47295b).f47641a;
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
                uh.i iVar = (uh.i) this.f47295b;
                iVar.f47755b.add((String) this.f47296c);
                iVar.invalidate();
                return;
            case 7:
                ((ii.q1) this.f47295b).run((TLRPC.Chat) this.f47296c);
                return;
            case 8:
                wh.n nVar = (wh.n) this.f47295b;
                g5 g5Var = (g5) this.f47296c;
                int i18 = nVar.f49158k;
                n2 n2Var = nVar.f49155g;
                TLRPC.TL_chatInviteImporter importer = g5Var.getImporter();
                nVar.f49165r = importer;
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
                        if (nVar.f49166s == null) {
                            wh.m mVar = new wh.m(nVar, n2Var.getParentActivity(), (zl0) g5Var.getParent(), n2Var.getResourceProvider(), nVar.f49150a);
                            nVar.f49166s = mVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = nVar.f49165r;
                            w9 avatarImageView = g5Var.getAvatarImageView();
                            TextView textView = mVar.f49142e;
                            bi0 bi0Var = mVar.h;
                            mVar.f49145r = tL_chatInviteImporter;
                            mVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i18).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i18, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i18, user2, 1);
                            if (MessagesController.getInstance(i18).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i18).loadUserInfo(user2, false, 0);
                            }
                            bi0Var.setParentAvatarImage(avatarImageView);
                            bi0Var.M(tL_chatInviteImporter.user_id, true);
                            bi0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            mVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            if (TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            textView.setVisibility(i10);
                            mVar.f49149y.requestLayout();
                            nVar.f49166s.setOnDismissListener(new f5(nVar, 11));
                            nVar.f49166s.show();
                            return;
                        }
                        return;
                    }
                    nVar.f49151b = true;
                    n2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f20194id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    n2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 9:
                xh.b bVar3 = (xh.b) this.f47295b;
                bVar3.getClass();
                ((View.OnClickListener) this.f47296c).onClick(bVar3);
                return;
            case 10:
                ((xh.c1) this.f47295b).getBulletinFactory().d0((TLRPC.TL_error) this.f47296c, false);
                return;
            case 11:
                xh.i1 i1Var = (xh.i1) this.f47295b;
                i1Var.getClass();
                if (!((TL_stars.SavedStarGift) this.f47296c).unsaved) {
                    i1Var.F.setVisibility(8);
                    return;
                }
                return;
            case 12:
                gs0 gs0Var = (gs0) this.f47295b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f47296c;
                gs0Var.h(tL_starGiftCollection.title, new ft(24, gs0Var, tL_starGiftCollection));
                return;
            case 13:
                AndroidUtilities.addToClipboard((String) this.f47296c);
                yc.a0(((o2) this.f47295b).f50159a.f50232a).k(false).j();
                return;
            case 14:
                yh.m mVar2 = (yh.m) this.f47295b;
                TLObject tLObject2 = (TLObject) this.f47296c;
                int i19 = mVar2.f51618a;
                ArrayList arrayList5 = mVar2.f51621e;
                mVar2.f51624i = 0;
                if (tLObject2 instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject2;
                    MessagesController.getInstance(i19).putUsers(connectedstarrefbots.users, false);
                    if (mVar2.f51620c <= 0) {
                        arrayList5.clear();
                    }
                    mVar2.f51620c = connectedstarrefbots.count;
                    arrayList5.addAll(connectedstarrefbots.connected_bots);
                    if (!connectedstarrefbots.connected_bots.isEmpty() && arrayList5.size() < mVar2.f51620c) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    mVar2.d = z11;
                } else {
                    mVar2.h = true;
                    mVar2.d = true;
                }
                mVar2.f51623g = false;
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(mVar2.f51619b));
                return;
            case 15:
                yh.n nVar2 = (yh.n) this.f47295b;
                TLObject tLObject3 = (TLObject) this.f47296c;
                int i20 = nVar2.f51666a;
                ArrayList arrayList6 = nVar2.f51669e;
                if (tLObject3 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject3;
                    MessagesController.getInstance(i20).putUsers(suggestedstarrefbots.users, false);
                    if (nVar2.f51668c <= 0) {
                        arrayList6.clear();
                    }
                    nVar2.f51668c = suggestedstarrefbots.count;
                    arrayList6.addAll(suggestedstarrefbots.suggested_bots);
                    nVar2.f51673j = suggestedstarrefbots.next_offset;
                    if (!suggestedstarrefbots.suggested_bots.isEmpty() && arrayList6.size() < nVar2.f51668c) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    nVar2.d = z12;
                } else {
                    nVar2.f51672i = true;
                    nVar2.d = true;
                }
                nVar2.h = false;
                NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(nVar2.f51667b));
                return;
            case 16:
                y3.U0((y3) this.f47295b, (Long) this.f47296c);
                return;
            case 17:
                y3 y3Var = (y3) this.f47295b;
                if (!((u5) this.f47296c).f52088e) {
                    rc Q = y3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.f30437t = true;
                    Q.j();
                    return;
                }
                y3Var.f52298j0.setLoading(false);
                y3Var.w1();
                return;
            case 18:
                ((y3) this.f47295b).getBulletinFactory().d0((TLRPC.TL_error) this.f47296c, false);
                return;
            case 19:
                MessagesController.getInstance(((y3) this.f47295b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.f47296c), false);
                return;
            case 20:
                y3 y3Var2 = (y3) this.f47295b;
                y3Var2.getClass();
                ((boolean[]) this.f47296c)[0] = true;
                y3Var2.f52298j0.setLoading(false);
                y3Var2.w1();
                return;
            case 21:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f47296c;
                yc bulletinFactory = ((y3) this.f47295b).getBulletinFactory();
                int i21 = R.raw.ic_delete;
                int i22 = R.string.GiftRemovedDescription;
                bulletinFactory.Q(i21, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i22, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 22:
                y3 y3Var3 = (y3) this.f47295b;
                yc.a0((yn) this.f47296c).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(y3Var3.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new yh.d1(y3Var3, 8)).k(true);
                return;
            case 23:
                ((y3) this.f47295b).n2((CharSequence) this.f47296c);
                return;
            case 24:
                y3.I0((y3) this.f47295b, (TL_stars.TL_payments_uniqueStarGift) this.f47296c);
                return;
            case 25:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f47296c;
                ((b2) this.f47295b).dismiss();
                n2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error2 != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error2.text)) {
                        a02 = yc.a0(U);
                        i11 = R.raw.fire_on;
                        i12 = R.string.UniqueGiftNotFoundBurned;
                    } else {
                        a02 = yc.a0(U);
                        i11 = R.raw.error;
                        i12 = R.string.UniqueGiftNotFound;
                    }
                    org.telegram.messenger.q.p(i12, a02, i11, 36);
                    return;
                }
                return;
            case 26:
                c4 c4Var = (c4) this.f47295b;
                yn ynVar = (yn) this.f47296c;
                org.telegram.ui.Cells.a0 a0Var = c4Var.f51184b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    c4Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var2 = c4Var.f51184b;
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
                    TLRPC.ChatFull chatFull = ynVar.X7;
                    Context context = c4Var.getContext();
                    int currentAccount = ynVar.getCurrentAccount();
                    long a2 = ynVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    r8 r8Var = new r8(context, currentAccount, a2, ynVar, messageObject2, arrayList7, z13, false, 0L, ynVar.getResourceProvider());
                    messageObject2.getId();
                    org.telegram.ui.Cells.a0 a0Var3 = c4Var.f51184b;
                    r8Var.T = ynVar;
                    r8Var.U = a0Var3;
                    r8Var.show();
                    return;
                }
                return;
            case 27:
                TLObject tLObject4 = (TLObject) this.f47295b;
                ii.q1 q1Var = (ii.q1) this.f47296c;
                if (tLObject4 instanceof TL_stars.StarGifts) {
                    q1Var.run((TL_stars.StarGifts) tLObject4);
                    return;
                } else {
                    q1Var.run(null);
                    return;
                }
            case 28:
                boolean[] zArr = (boolean[]) this.f47295b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f47296c;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                l5 l5Var = (l5) this.f47295b;
                TLObject tLObject5 = (TLObject) this.f47296c;
                ArrayList arrayList8 = l5Var.f51590l;
                int i23 = l5Var.f51581a;
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
                        NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l5Var.f51582b), l5Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public i0(u5 u5Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.f47294a = 28;
        this.f47295b = zArr;
        this.f47296c = callback2;
    }
}
