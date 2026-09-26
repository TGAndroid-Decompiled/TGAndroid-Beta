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
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.ai0;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bt;
import org.telegram.ui.wn;
import xh.o2;
import yh.b4;
import yh.k5;
import yh.o8;
import yh.r5;
import yh.s5;
import yh.x3;
public final class p0 implements Runnable {
    public final int f43746a;
    public final Object f43747b;
    public final Object f43748c;

    public p0(int i10, Object obj, Object obj2) {
        this.f43746a = i10;
        this.f43747b = obj;
        this.f43748c = obj2;
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
        switch (this.f43746a) {
            case 0:
                ((u0) this.f43747b).A((c3.b0) this.f43748c);
                return;
            case 1:
                uf.c cVar = (uf.c) this.f43747b;
                TLObject tLObject = (TLObject) this.f43748c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = cVar.e;
                        if (!cVar.f43982f) {
                            cVar.f(false);
                            cVar.f43982f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList3.get(i13);
                            i13++;
                            uf.b bVar = (uf.b) obj;
                            if (bVar.f43975b != null && (document = bVar.f43974a) != null) {
                                hashMap.put(Long.valueOf(document.f18341id), bVar.f43975b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences d = cVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList2.size());
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            TLRPC.Document document3 = arrayList2.get(i14);
                            String str = (String) hashMap.get(Long.valueOf(document3.f18341id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i14, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i14, str);
                            }
                            ?? obj2 = new Object();
                            obj2.f43974a = document3;
                            obj2.f43975b = str;
                            int i15 = cVar.d;
                            cVar.d = i15 + 1;
                            obj2.f43976c = i15;
                            arrayList3.add(obj2);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(cVar.f43981c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        uf.c.f43977g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        uf.c.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    cVar.b();
                    return;
                }
                return;
            case 2:
                uf.c cVar2 = (uf.c) this.f43747b;
                ArrayList arrayList4 = (ArrayList) this.f43748c;
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    uf.b bVar2 = (uf.b) arrayList4.get(i16);
                    if (bVar2 != null && ((TextUtils.isEmpty(bVar2.f43975b) || !new File(bVar2.f43975b).exists()) && (document2 = bVar2.f43974a) != null && ((pathToAttach = FileLoader.getInstance(cVar2.f43981c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new p0(3, cVar2, document2));
                    }
                }
                return;
            case 3:
                TLRPC.Document document4 = (TLRPC.Document) this.f43748c;
                FileLoader.getInstance(((uf.c) this.f43747b).f43981c).loadFile(document4, document4, 0, 0);
                return;
            case 4:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f43748c;
                int i17 = ((uf.d) this.f43747b).f43983a;
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
            case 5:
                uh.i iVar = (uh.i) this.f43747b;
                iVar.f44088b.add((String) this.f43748c);
                iVar.invalidate();
                return;
            case 6:
                ((ii.q1) this.f43747b).run((TLRPC.Chat) this.f43748c);
                return;
            case 7:
                wh.n nVar = (wh.n) this.f43747b;
                g5 g5Var = (g5) this.f43748c;
                int i18 = nVar.f45395k;
                m2 m2Var = nVar.f45392g;
                TLRPC.TL_chatInviteImporter importer = g5Var.getImporter();
                nVar.f45402r = importer;
                LongSparseArray longSparseArray = nVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    m2Var.getMessagesController().putUser(user, false);
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (user.photo != null && !z10) {
                        if (nVar.f45403s == null) {
                            wh.m mVar = new wh.m(nVar, m2Var.getParentActivity(), (xl0) g5Var.getParent(), m2Var.getResourceProvider(), nVar.f45388a);
                            nVar.f45403s = mVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = nVar.f45402r;
                            w9 avatarImageView = g5Var.getAvatarImageView();
                            TextView textView = mVar.e;
                            ai0 ai0Var = mVar.h;
                            mVar.f45383r = tL_chatInviteImporter;
                            mVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i18).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i18, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i18, user2, 1);
                            if (MessagesController.getInstance(i18).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i18).loadUserInfo(user2, false, 0);
                            }
                            ai0Var.setParentAvatarImage(avatarImageView);
                            ai0Var.M(tL_chatInviteImporter.user_id, true);
                            ai0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            mVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            if (TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            textView.setVisibility(i10);
                            mVar.f45387y.requestLayout();
                            nVar.f45403s.setOnDismissListener(new f5(nVar, 11));
                            nVar.f45403s.show();
                            return;
                        }
                        return;
                    }
                    nVar.f45389b = true;
                    m2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f18482id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    m2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 8:
                xh.b bVar3 = (xh.b) this.f43747b;
                bVar3.getClass();
                ((View.OnClickListener) this.f43748c).onClick(bVar3);
                return;
            case 9:
                ((xh.c1) this.f43747b).getBulletinFactory().d0((TLRPC.TL_error) this.f43748c, false);
                return;
            case 10:
                xh.j1 j1Var = (xh.j1) this.f43747b;
                j1Var.getClass();
                if (!((TL_stars.SavedStarGift) this.f43748c).unsaved) {
                    j1Var.F.setVisibility(8);
                    return;
                }
                return;
            case 11:
                as0 as0Var = (as0) this.f43747b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f43748c;
                as0Var.h(tL_starGiftCollection.title, new bt(24, as0Var, tL_starGiftCollection));
                return;
            case 12:
                AndroidUtilities.addToClipboard((String) this.f43748c);
                xc.a0(((o2) this.f43747b).f46326a.f46395a).k(false).j();
                return;
            case 13:
                yh.l lVar = (yh.l) this.f43747b;
                TLObject tLObject2 = (TLObject) this.f43748c;
                int i19 = lVar.f47629a;
                ArrayList arrayList5 = lVar.e;
                lVar.f47634i = 0;
                if (tLObject2 instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject2;
                    MessagesController.getInstance(i19).putUsers(connectedstarrefbots.users, false);
                    if (lVar.f47631c <= 0) {
                        arrayList5.clear();
                    }
                    lVar.f47631c = connectedstarrefbots.count;
                    arrayList5.addAll(connectedstarrefbots.connected_bots);
                    if (!connectedstarrefbots.connected_bots.isEmpty() && arrayList5.size() < lVar.f47631c) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    lVar.d = z11;
                } else {
                    lVar.h = true;
                    lVar.d = true;
                }
                lVar.f47633g = false;
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(lVar.f47630b));
                return;
            case 14:
                yh.m mVar2 = (yh.m) this.f43747b;
                TLObject tLObject3 = (TLObject) this.f43748c;
                int i20 = mVar2.f47695a;
                ArrayList arrayList6 = mVar2.e;
                if (tLObject3 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject3;
                    MessagesController.getInstance(i20).putUsers(suggestedstarrefbots.users, false);
                    if (mVar2.f47697c <= 0) {
                        arrayList6.clear();
                    }
                    mVar2.f47697c = suggestedstarrefbots.count;
                    arrayList6.addAll(suggestedstarrefbots.suggested_bots);
                    mVar2.f47701j = suggestedstarrefbots.next_offset;
                    if (!suggestedstarrefbots.suggested_bots.isEmpty() && arrayList6.size() < mVar2.f47697c) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    mVar2.d = z12;
                } else {
                    mVar2.f47700i = true;
                    mVar2.d = true;
                }
                mVar2.h = false;
                NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(mVar2.f47696b));
                return;
            case 15:
                x3.U0((x3) this.f43747b, (Long) this.f43748c);
                return;
            case 16:
                x3 x3Var = (x3) this.f43747b;
                if (!((s5) this.f43748c).e) {
                    qc Q = x3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.f27645t = true;
                    Q.j();
                    return;
                }
                x3Var.f48245j0.setLoading(false);
                x3Var.w1();
                return;
            case 17:
                ((x3) this.f43747b).getBulletinFactory().d0((TLRPC.TL_error) this.f43748c, false);
                return;
            case 18:
                MessagesController.getInstance(((x3) this.f43747b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.f43748c), false);
                return;
            case 19:
                x3 x3Var2 = (x3) this.f43747b;
                x3Var2.getClass();
                ((boolean[]) this.f43748c)[0] = true;
                x3Var2.f48245j0.setLoading(false);
                x3Var2.w1();
                return;
            case 20:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f43748c;
                xc bulletinFactory = ((x3) this.f43747b).getBulletinFactory();
                int i21 = R.raw.ic_delete;
                int i22 = R.string.GiftRemovedDescription;
                bulletinFactory.Q(i21, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i22, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 21:
                x3 x3Var3 = (x3) this.f43747b;
                xc.a0((wn) this.f43748c).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(x3Var3.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new yh.b1(x3Var3, 8)).k(true);
                return;
            case 22:
                ((x3) this.f43747b).n2((CharSequence) this.f43748c);
                return;
            case 23:
                x3.I0((x3) this.f43747b, (TL_stars.TL_payments_uniqueStarGift) this.f43748c);
                return;
            case 24:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f43748c;
                ((a2) this.f43747b).dismiss();
                m2 U = LaunchActivity.U();
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
                    org.telegram.messenger.f0.p(i12, a02, i11, 36);
                    return;
                }
                return;
            case 25:
                b4 b4Var = (b4) this.f43747b;
                wn wnVar = (wn) this.f43748c;
                org.telegram.ui.Cells.a0 a0Var = b4Var.f47226b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    b4Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var2 = b4Var.f47226b;
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
                    r5 r5Var = s5.y(messageObject2.currentAccount, false).B;
                    if (r5Var != null) {
                        r5Var.b();
                    }
                    TLRPC.ChatFull chatFull = wnVar.Z7;
                    Context context = b4Var.getContext();
                    int currentAccount = wnVar.getCurrentAccount();
                    long a2 = wnVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    o8 o8Var = new o8(context, currentAccount, a2, wnVar, messageObject2, arrayList7, z13, false, 0L, wnVar.getResourceProvider());
                    messageObject2.getId();
                    org.telegram.ui.Cells.a0 a0Var3 = b4Var.f47226b;
                    o8Var.T = wnVar;
                    o8Var.U = a0Var3;
                    o8Var.show();
                    return;
                }
                return;
            case 26:
                TLObject tLObject4 = (TLObject) this.f43747b;
                ii.q1 q1Var = (ii.q1) this.f43748c;
                if (tLObject4 instanceof TL_stars.StarGifts) {
                    q1Var.run((TL_stars.StarGifts) tLObject4);
                    return;
                } else {
                    q1Var.run(null);
                    return;
                }
            case 27:
                boolean[] zArr = (boolean[]) this.f43747b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f43748c;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            case 28:
                k5 k5Var = (k5) this.f43747b;
                TLObject tLObject5 = (TLObject) this.f43748c;
                ArrayList arrayList8 = k5Var.f47611l;
                int i23 = k5Var.f47603a;
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
                        NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(k5Var.f47604b), k5Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((MessagesController) this.f43747b).processUpdates((TLRPC.Updates) ((TLObject) this.f43748c), false);
                return;
        }
    }

    public p0(s5 s5Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.f43746a = 27;
        this.f43747b = zArr;
        this.f43748c = callback2;
    }
}
