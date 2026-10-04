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
import org.telegram.ui.Components.fs0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ft;
import org.telegram.ui.yn;
import xh.o2;
import yh.b4;
import yh.k5;
import yh.p8;
import yh.s5;
import yh.t5;
import yh.x3;
public final class i0 implements Runnable {
    public final int f47278a;
    public final Object f47279b;
    public final Object f47280c;

    public i0(int i10, Object obj, Object obj2) {
        this.f47278a = i10;
        this.f47279b = obj;
        this.f47280c = obj2;
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
        switch (this.f47278a) {
            case 0:
                ((e2.h) this.f47279b).accept(this.f47280c);
                return;
            case 1:
                ((v0) this.f47279b).A((c3.b0) this.f47280c);
                return;
            case 2:
                uf.c cVar = (uf.c) this.f47279b;
                TLObject tLObject = (TLObject) this.f47280c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = cVar.f47623e;
                        if (!cVar.f47624f) {
                            cVar.f(false);
                            cVar.f47624f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList3.get(i13);
                            i13++;
                            uf.b bVar = (uf.b) obj;
                            if (bVar.f47616b != null && (document = bVar.f47615a) != null) {
                                hashMap.put(Long.valueOf(document.f20043id), bVar.f47616b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences d = cVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList2.size());
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            TLRPC.Document document3 = arrayList2.get(i14);
                            String str = (String) hashMap.get(Long.valueOf(document3.f20043id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i14, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i14, str);
                            }
                            ?? obj2 = new Object();
                            obj2.f47615a = document3;
                            obj2.f47616b = str;
                            int i15 = cVar.d;
                            cVar.d = i15 + 1;
                            obj2.f47617c = i15;
                            arrayList3.add(obj2);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(cVar.f47622c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        uf.c.f47618g = j3;
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
                uf.c cVar2 = (uf.c) this.f47279b;
                ArrayList arrayList4 = (ArrayList) this.f47280c;
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    uf.b bVar2 = (uf.b) arrayList4.get(i16);
                    if (bVar2 != null && ((TextUtils.isEmpty(bVar2.f47616b) || !new File(bVar2.f47616b).exists()) && (document2 = bVar2.f47615a) != null && ((pathToAttach = FileLoader.getInstance(cVar2.f47622c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new i0(4, cVar2, document2));
                    }
                }
                return;
            case 4:
                TLRPC.Document document4 = (TLRPC.Document) this.f47280c;
                FileLoader.getInstance(((uf.c) this.f47279b).f47622c).loadFile(document4, document4, 0, 0);
                return;
            case 5:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f47280c;
                int i17 = ((uf.d) this.f47279b).f47625a;
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
                uh.i iVar = (uh.i) this.f47279b;
                iVar.f47739b.add((String) this.f47280c);
                iVar.invalidate();
                return;
            case 7:
                ((ii.q1) this.f47279b).run((TLRPC.Chat) this.f47280c);
                return;
            case 8:
                wh.n nVar = (wh.n) this.f47279b;
                g5 g5Var = (g5) this.f47280c;
                int i18 = nVar.f49142k;
                n2 n2Var = nVar.f49139g;
                TLRPC.TL_chatInviteImporter importer = g5Var.getImporter();
                nVar.f49149r = importer;
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
                        if (nVar.f49150s == null) {
                            wh.m mVar = new wh.m(nVar, n2Var.getParentActivity(), (zl0) g5Var.getParent(), n2Var.getResourceProvider(), nVar.f49134a);
                            nVar.f49150s = mVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = nVar.f49149r;
                            w9 avatarImageView = g5Var.getAvatarImageView();
                            TextView textView = mVar.f49126e;
                            bi0 bi0Var = mVar.h;
                            mVar.f49129r = tL_chatInviteImporter;
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
                            mVar.f49133y.requestLayout();
                            nVar.f49150s.setOnDismissListener(new f5(nVar, 11));
                            nVar.f49150s.show();
                            return;
                        }
                        return;
                    }
                    nVar.f49135b = true;
                    n2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f20184id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    n2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 9:
                xh.b bVar3 = (xh.b) this.f47279b;
                bVar3.getClass();
                ((View.OnClickListener) this.f47280c).onClick(bVar3);
                return;
            case 10:
                ((xh.c1) this.f47279b).getBulletinFactory().d0((TLRPC.TL_error) this.f47280c, false);
                return;
            case 11:
                xh.i1 i1Var = (xh.i1) this.f47279b;
                i1Var.getClass();
                if (!((TL_stars.SavedStarGift) this.f47280c).unsaved) {
                    i1Var.F.setVisibility(8);
                    return;
                }
                return;
            case 12:
                fs0 fs0Var = (fs0) this.f47279b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f47280c;
                fs0Var.h(tL_starGiftCollection.title, new ft(24, fs0Var, tL_starGiftCollection));
                return;
            case 13:
                AndroidUtilities.addToClipboard((String) this.f47280c);
                yc.a0(((o2) this.f47279b).f50143a.f50216a).k(false).j();
                return;
            case 14:
                yh.l lVar = (yh.l) this.f47279b;
                TLObject tLObject2 = (TLObject) this.f47280c;
                int i19 = lVar.f51545a;
                ArrayList arrayList5 = lVar.f51548e;
                lVar.f51551i = 0;
                if (tLObject2 instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject2;
                    MessagesController.getInstance(i19).putUsers(connectedstarrefbots.users, false);
                    if (lVar.f51547c <= 0) {
                        arrayList5.clear();
                    }
                    lVar.f51547c = connectedstarrefbots.count;
                    arrayList5.addAll(connectedstarrefbots.connected_bots);
                    if (!connectedstarrefbots.connected_bots.isEmpty() && arrayList5.size() < lVar.f51547c) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    lVar.d = z11;
                } else {
                    lVar.h = true;
                    lVar.d = true;
                }
                lVar.f51550g = false;
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(lVar.f51546b));
                return;
            case 15:
                yh.m mVar2 = (yh.m) this.f47279b;
                TLObject tLObject3 = (TLObject) this.f47280c;
                int i20 = mVar2.f51594a;
                ArrayList arrayList6 = mVar2.f51597e;
                if (tLObject3 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject3;
                    MessagesController.getInstance(i20).putUsers(suggestedstarrefbots.users, false);
                    if (mVar2.f51596c <= 0) {
                        arrayList6.clear();
                    }
                    mVar2.f51596c = suggestedstarrefbots.count;
                    arrayList6.addAll(suggestedstarrefbots.suggested_bots);
                    mVar2.f51601j = suggestedstarrefbots.next_offset;
                    if (!suggestedstarrefbots.suggested_bots.isEmpty() && arrayList6.size() < mVar2.f51596c) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    mVar2.d = z12;
                } else {
                    mVar2.f51600i = true;
                    mVar2.d = true;
                }
                mVar2.h = false;
                NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(mVar2.f51595b));
                return;
            case 16:
                x3.U0((x3) this.f47279b, (Long) this.f47280c);
                return;
            case 17:
                x3 x3Var = (x3) this.f47279b;
                if (!((t5) this.f47280c).f52013e) {
                    rc Q = x3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.f30348t = true;
                    Q.j();
                    return;
                }
                x3Var.f52224j0.setLoading(false);
                x3Var.w1();
                return;
            case 18:
                ((x3) this.f47279b).getBulletinFactory().d0((TLRPC.TL_error) this.f47280c, false);
                return;
            case 19:
                MessagesController.getInstance(((x3) this.f47279b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.f47280c), false);
                return;
            case 20:
                x3 x3Var2 = (x3) this.f47279b;
                x3Var2.getClass();
                ((boolean[]) this.f47280c)[0] = true;
                x3Var2.f52224j0.setLoading(false);
                x3Var2.w1();
                return;
            case 21:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f47280c;
                yc bulletinFactory = ((x3) this.f47279b).getBulletinFactory();
                int i21 = R.raw.ic_delete;
                int i22 = R.string.GiftRemovedDescription;
                bulletinFactory.Q(i21, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i22, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 22:
                x3 x3Var3 = (x3) this.f47279b;
                yc.a0((yn) this.f47280c).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(x3Var3.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new yh.b1(x3Var3, 8)).k(true);
                return;
            case 23:
                ((x3) this.f47279b).n2((CharSequence) this.f47280c);
                return;
            case 24:
                x3.I0((x3) this.f47279b, (TL_stars.TL_payments_uniqueStarGift) this.f47280c);
                return;
            case 25:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f47280c;
                ((b2) this.f47279b).dismiss();
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
                    org.telegram.messenger.f0.p(i12, a02, i11, 36);
                    return;
                }
                return;
            case 26:
                b4 b4Var = (b4) this.f47279b;
                yn ynVar = (yn) this.f47280c;
                org.telegram.ui.Cells.a0 a0Var = b4Var.f51119b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    b4Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var2 = b4Var.f51119b;
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
                    s5 s5Var = t5.y(messageObject2.currentAccount, false).B;
                    if (s5Var != null) {
                        s5Var.b();
                    }
                    TLRPC.ChatFull chatFull = ynVar.X7;
                    Context context = b4Var.getContext();
                    int currentAccount = ynVar.getCurrentAccount();
                    long a2 = ynVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    p8 p8Var = new p8(context, currentAccount, a2, ynVar, messageObject2, arrayList7, z13, false, 0L, ynVar.getResourceProvider());
                    messageObject2.getId();
                    org.telegram.ui.Cells.a0 a0Var3 = b4Var.f51119b;
                    p8Var.T = ynVar;
                    p8Var.U = a0Var3;
                    p8Var.show();
                    return;
                }
                return;
            case 27:
                TLObject tLObject4 = (TLObject) this.f47279b;
                ii.q1 q1Var = (ii.q1) this.f47280c;
                if (tLObject4 instanceof TL_stars.StarGifts) {
                    q1Var.run((TL_stars.StarGifts) tLObject4);
                    return;
                } else {
                    q1Var.run(null);
                    return;
                }
            case 28:
                boolean[] zArr = (boolean[]) this.f47279b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f47280c;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                k5 k5Var = (k5) this.f47279b;
                TLObject tLObject5 = (TLObject) this.f47280c;
                ArrayList arrayList8 = k5Var.f51527l;
                int i23 = k5Var.f51518a;
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
                        NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(k5Var.f51519b), k5Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public i0(t5 t5Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.f47278a = 28;
        this.f47279b = zArr;
        this.f47280c = callback2;
    }
}
