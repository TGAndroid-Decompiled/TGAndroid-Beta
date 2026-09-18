package uf;

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
import org.telegram.messenger.q;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.a0;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.zh0;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.nj0;
import org.telegram.ui.web.b1;
import org.telegram.ui.zn;
import uh.i;
import wh.m;
import wh.n;
import xh.c1;
import xh.j1;
import xh.o2;
import yh.c4;
import yh.l;
import yh.l5;
import yh.o8;
import yh.s5;
import yh.t5;
import yh.y3;
public final class b implements Runnable {
    public final int f43945a;
    public final Object f43946b;
    public final Object f43947c;

    public b(int i10, Object obj, Object obj2) {
        this.f43945a = i10;
        this.f43946b = obj;
        this.f43947c = obj2;
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
        switch (this.f43945a) {
            case 0:
                d dVar = (d) this.f43946b;
                TLObject tLObject = (TLObject) this.f43947c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        dVar.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = dVar.e;
                        if (!dVar.f43956f) {
                            dVar.f(false);
                            dVar.f43956f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList3.get(i13);
                            i13++;
                            c cVar = (c) obj;
                            if (cVar.f43949b != null && (document = cVar.f43948a) != null) {
                                hashMap.put(Long.valueOf(document.f18302id), cVar.f43949b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences d = dVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList2.size());
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            TLRPC.Document document3 = arrayList2.get(i14);
                            String str = (String) hashMap.get(Long.valueOf(document3.f18302id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i14, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i14, str);
                            }
                            ?? obj2 = new Object();
                            obj2.f43948a = document3;
                            obj2.f43949b = str;
                            int i15 = dVar.d;
                            dVar.d = i15 + 1;
                            obj2.f43950c = i15;
                            arrayList3.add(obj2);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(dVar.f43955c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = dVar.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        d.f43951g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        d.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    dVar.b();
                    return;
                }
                return;
            case 1:
                d dVar2 = (d) this.f43946b;
                ArrayList arrayList4 = (ArrayList) this.f43947c;
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    c cVar2 = (c) arrayList4.get(i16);
                    if (cVar2 != null && ((TextUtils.isEmpty(cVar2.f43949b) || !new File(cVar2.f43949b).exists()) && (document2 = cVar2.f43948a) != null && ((pathToAttach = FileLoader.getInstance(dVar2.f43955c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new b(2, dVar2, document2));
                    }
                }
                return;
            case 2:
                TLRPC.Document document4 = (TLRPC.Document) this.f43947c;
                FileLoader.getInstance(((d) this.f43946b).f43955c).loadFile(document4, document4, 0, 0);
                return;
            case 3:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f43947c;
                int i17 = ((e) this.f43946b).f43957a;
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
            case 4:
                i iVar = (i) this.f43946b;
                iVar.f44061b.add((String) this.f43947c);
                iVar.invalidate();
                return;
            case 5:
                ((b1) this.f43946b).run((TLRPC.Chat) this.f43947c);
                return;
            case 6:
                n nVar = (n) this.f43946b;
                g5 g5Var = (g5) this.f43947c;
                int i18 = nVar.f45369k;
                n2 n2Var = nVar.f45366g;
                TLRPC.TL_chatInviteImporter importer = g5Var.getImporter();
                nVar.f45376r = importer;
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
                        if (nVar.f45377s == null) {
                            m mVar = new m(nVar, n2Var.getParentActivity(), (wl0) g5Var.getParent(), n2Var.getResourceProvider(), nVar.f45362a);
                            nVar.f45377s = mVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = nVar.f45376r;
                            w9 avatarImageView = g5Var.getAvatarImageView();
                            TextView textView = mVar.e;
                            zh0 zh0Var = mVar.h;
                            mVar.f45357r = tL_chatInviteImporter;
                            mVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i18).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i18, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i18, user2, 1);
                            if (MessagesController.getInstance(i18).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i18).loadUserInfo(user2, false, 0);
                            }
                            zh0Var.setParentAvatarImage(avatarImageView);
                            zh0Var.M(tL_chatInviteImporter.user_id, true);
                            zh0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            mVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            if (TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            textView.setVisibility(i10);
                            mVar.f45361y.requestLayout();
                            nVar.f45377s.setOnDismissListener(new ai.g5(nVar, 11));
                            nVar.f45377s.show();
                            return;
                        }
                        return;
                    }
                    nVar.f45363b = true;
                    n2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f18443id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    n2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 7:
                xh.b bVar = (xh.b) this.f43946b;
                bVar.getClass();
                ((View.OnClickListener) this.f43947c).onClick(bVar);
                return;
            case 8:
                ((c1) this.f43946b).getBulletinFactory().d0((TLRPC.TL_error) this.f43947c, false);
                return;
            case 9:
                j1 j1Var = (j1) this.f43946b;
                j1Var.getClass();
                if (!((TL_stars.SavedStarGift) this.f43947c).unsaved) {
                    j1Var.F.setVisibility(8);
                    return;
                }
                return;
            case 10:
                zr0 zr0Var = (zr0) this.f43946b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f43947c;
                zr0Var.h(tL_starGiftCollection.title, new nj0(15, zr0Var, tL_starGiftCollection));
                return;
            case 11:
                AndroidUtilities.addToClipboard((String) this.f43947c);
                xc.a0(((o2) this.f43946b).f46300a.f46369a).k(false).j();
                return;
            case 12:
                l lVar = (l) this.f43946b;
                TLObject tLObject2 = (TLObject) this.f43947c;
                int i19 = lVar.f47626a;
                ArrayList arrayList5 = lVar.e;
                lVar.f47631i = 0;
                if (tLObject2 instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject2;
                    MessagesController.getInstance(i19).putUsers(connectedstarrefbots.users, false);
                    if (lVar.f47628c <= 0) {
                        arrayList5.clear();
                    }
                    lVar.f47628c = connectedstarrefbots.count;
                    arrayList5.addAll(connectedstarrefbots.connected_bots);
                    if (!connectedstarrefbots.connected_bots.isEmpty() && arrayList5.size() < lVar.f47628c) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    lVar.d = z11;
                } else {
                    lVar.h = true;
                    lVar.d = true;
                }
                lVar.f47630g = false;
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(lVar.f47627b));
                return;
            case 13:
                yh.m mVar2 = (yh.m) this.f43946b;
                TLObject tLObject3 = (TLObject) this.f43947c;
                int i20 = mVar2.f47685a;
                ArrayList arrayList6 = mVar2.e;
                if (tLObject3 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject3;
                    MessagesController.getInstance(i20).putUsers(suggestedstarrefbots.users, false);
                    if (mVar2.f47687c <= 0) {
                        arrayList6.clear();
                    }
                    mVar2.f47687c = suggestedstarrefbots.count;
                    arrayList6.addAll(suggestedstarrefbots.suggested_bots);
                    mVar2.f47691j = suggestedstarrefbots.next_offset;
                    if (!suggestedstarrefbots.suggested_bots.isEmpty() && arrayList6.size() < mVar2.f47687c) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    mVar2.d = z12;
                } else {
                    mVar2.f47690i = true;
                    mVar2.d = true;
                }
                mVar2.h = false;
                NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(mVar2.f47686b));
                return;
            case 14:
                y3.U0((y3) this.f43946b, (Long) this.f43947c);
                return;
            case 15:
                y3 y3Var = (y3) this.f43946b;
                if (!((t5) this.f43947c).e) {
                    qc Q = y3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.f27560t = true;
                    Q.j();
                    return;
                }
                y3Var.f48274j0.setLoading(false);
                y3Var.w1();
                return;
            case 16:
                ((y3) this.f43946b).getBulletinFactory().d0((TLRPC.TL_error) this.f43947c, false);
                return;
            case 17:
                MessagesController.getInstance(((y3) this.f43946b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.f43947c), false);
                return;
            case 18:
                y3 y3Var2 = (y3) this.f43946b;
                y3Var2.getClass();
                ((boolean[]) this.f43947c)[0] = true;
                y3Var2.f48274j0.setLoading(false);
                y3Var2.w1();
                return;
            case 19:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f43947c;
                xc bulletinFactory = ((y3) this.f43946b).getBulletinFactory();
                int i21 = R.raw.ic_delete;
                int i22 = R.string.GiftRemovedDescription;
                bulletinFactory.Q(i21, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i22, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 20:
                y3 y3Var3 = (y3) this.f43946b;
                xc.a0((zn) this.f43947c).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(y3Var3.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new yh.b1(y3Var3, 8)).k(true);
                return;
            case 21:
                ((y3) this.f43946b).n2((CharSequence) this.f43947c);
                return;
            case 22:
                y3.I0((y3) this.f43946b, (TL_stars.TL_payments_uniqueStarGift) this.f43947c);
                return;
            case 23:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f43947c;
                ((b2) this.f43946b).dismiss();
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
                    q.q(i12, a02, i11, 36);
                    return;
                }
                return;
            case 24:
                c4 c4Var = (c4) this.f43946b;
                zn znVar = (zn) this.f43947c;
                a0 a0Var = c4Var.f47253b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    c4Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    a0 a0Var2 = c4Var.f47253b;
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
                    MessageObject messageObject2 = messageObject;
                    ArrayList<TLRPC.MessageReactor> arrayList7 = arrayList;
                    s5 s5Var = t5.y(messageObject2.currentAccount, false).B;
                    if (s5Var != null) {
                        s5Var.b();
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
                    a0 a0Var3 = c4Var.f47253b;
                    o8Var.T = znVar;
                    o8Var.U = a0Var3;
                    o8Var.show();
                    return;
                }
                return;
            case 25:
                TLObject tLObject4 = (TLObject) this.f43947c;
                b1 b1Var = (b1) this.f43946b;
                if (tLObject4 instanceof TL_stars.StarGifts) {
                    b1Var.run((TL_stars.StarGifts) tLObject4);
                    return;
                } else {
                    b1Var.run(null);
                    return;
                }
            case 26:
                boolean[] zArr = (boolean[]) this.f43946b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f43947c;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            case 27:
                l5 l5Var = (l5) this.f43946b;
                TLObject tLObject5 = (TLObject) this.f43947c;
                ArrayList arrayList8 = l5Var.f47650l;
                int i23 = l5Var.f47642a;
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
                        NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l5Var.f47643b), l5Var);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                ((MessagesController) this.f43946b).processUpdates((TLRPC.Updates) ((TLObject) this.f43947c), false);
                return;
            default:
                new xc(((f3[]) this.f43946b)[0].topBulletinContainer, (e6) this.f43947c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                return;
        }
    }

    public b(TLObject tLObject, b1 b1Var) {
        this.f43945a = 25;
        this.f43947c = tLObject;
        this.f43946b = b1Var;
    }

    public b(t5 t5Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.f43945a = 26;
        this.f43946b = zArr;
        this.f43947c = callback2;
    }
}
