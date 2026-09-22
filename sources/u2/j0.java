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
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yl0;
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
    public final int f43714a;
    public final Object f43715b;
    public final Object f43716c;

    public j0(int i10, Object obj, Object obj2) {
        this.f43714a = i10;
        this.f43715b = obj;
        this.f43716c = obj2;
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
        switch (this.f43714a) {
            case 0:
                ((e2.h) this.f43715b).accept(this.f43716c);
                return;
            case 1:
                ((v0) this.f43715b).A((c3.b0) this.f43716c);
                return;
            case 2:
                uf.c cVar = (uf.c) this.f43715b;
                TLObject tLObject = (TLObject) this.f43716c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = cVar.e;
                        if (!cVar.f44021f) {
                            cVar.f(false);
                            cVar.f44021f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList3.get(i13);
                            i13++;
                            uf.b bVar = (uf.b) obj;
                            if (bVar.f44014b != null && (document = bVar.f44013a) != null) {
                                hashMap.put(Long.valueOf(document.f18349id), bVar.f44014b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences d = cVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList2.size());
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            TLRPC.Document document3 = arrayList2.get(i14);
                            String str = (String) hashMap.get(Long.valueOf(document3.f18349id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i14, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i14, str);
                            }
                            ?? obj2 = new Object();
                            obj2.f44013a = document3;
                            obj2.f44014b = str;
                            int i15 = cVar.d;
                            cVar.d = i15 + 1;
                            obj2.f44015c = i15;
                            arrayList3.add(obj2);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(cVar.f44020c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        uf.c.f44016g = j3;
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
                uf.c cVar2 = (uf.c) this.f43715b;
                ArrayList arrayList4 = (ArrayList) this.f43716c;
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    uf.b bVar2 = (uf.b) arrayList4.get(i16);
                    if (bVar2 != null && ((TextUtils.isEmpty(bVar2.f44014b) || !new File(bVar2.f44014b).exists()) && (document2 = bVar2.f44013a) != null && ((pathToAttach = FileLoader.getInstance(cVar2.f44020c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new j0(4, cVar2, document2));
                    }
                }
                return;
            case 4:
                TLRPC.Document document4 = (TLRPC.Document) this.f43716c;
                FileLoader.getInstance(((uf.c) this.f43715b).f44020c).loadFile(document4, document4, 0, 0);
                return;
            case 5:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f43716c;
                int i17 = ((uf.d) this.f43715b).f44022a;
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
                uh.i iVar = (uh.i) this.f43715b;
                iVar.f44126b.add((String) this.f43716c);
                iVar.invalidate();
                return;
            case 7:
                ((org.telegram.ui.web.b1) this.f43715b).run((TLRPC.Chat) this.f43716c);
                return;
            case 8:
                wh.n nVar = (wh.n) this.f43715b;
                h5 h5Var = (h5) this.f43716c;
                int i18 = nVar.f45434k;
                n2 n2Var = nVar.f45431g;
                TLRPC.TL_chatInviteImporter importer = h5Var.getImporter();
                nVar.f45441r = importer;
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
                        if (nVar.f45442s == null) {
                            wh.m mVar = new wh.m(nVar, n2Var.getParentActivity(), (yl0) h5Var.getParent(), n2Var.getResourceProvider(), nVar.f45427a);
                            nVar.f45442s = mVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = nVar.f45441r;
                            v9 avatarImageView = h5Var.getAvatarImageView();
                            TextView textView = mVar.e;
                            bi0 bi0Var = mVar.h;
                            mVar.f45422r = tL_chatInviteImporter;
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
                            mVar.f45426y.requestLayout();
                            nVar.f45442s.setOnDismissListener(new g5(nVar, 11));
                            nVar.f45442s.show();
                            return;
                        }
                        return;
                    }
                    nVar.f45428b = true;
                    n2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f18490id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    n2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 9:
                xh.b bVar3 = (xh.b) this.f43715b;
                bVar3.getClass();
                ((View.OnClickListener) this.f43716c).onClick(bVar3);
                return;
            case 10:
                ((xh.c1) this.f43715b).getBulletinFactory().d0((TLRPC.TL_error) this.f43716c, false);
                return;
            case 11:
                xh.j1 j1Var = (xh.j1) this.f43715b;
                j1Var.getClass();
                if (!((TL_stars.SavedStarGift) this.f43716c).unsaved) {
                    j1Var.F.setVisibility(8);
                    return;
                }
                return;
            case 12:
                bs0 bs0Var = (bs0) this.f43715b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f43716c;
                bs0Var.h(tL_starGiftCollection.title, new pj0(15, bs0Var, tL_starGiftCollection));
                return;
            case 13:
                AndroidUtilities.addToClipboard((String) this.f43716c);
                xc.a0(((o2) this.f43715b).f46368a.f46437a).k(false).j();
                return;
            case 14:
                yh.l lVar = (yh.l) this.f43715b;
                TLObject tLObject2 = (TLObject) this.f43716c;
                int i19 = lVar.f47687a;
                ArrayList arrayList5 = lVar.e;
                lVar.f47692i = 0;
                if (tLObject2 instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject2;
                    MessagesController.getInstance(i19).putUsers(connectedstarrefbots.users, false);
                    if (lVar.f47689c <= 0) {
                        arrayList5.clear();
                    }
                    lVar.f47689c = connectedstarrefbots.count;
                    arrayList5.addAll(connectedstarrefbots.connected_bots);
                    if (!connectedstarrefbots.connected_bots.isEmpty() && arrayList5.size() < lVar.f47689c) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    lVar.d = z11;
                } else {
                    lVar.h = true;
                    lVar.d = true;
                }
                lVar.f47691g = false;
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(lVar.f47688b));
                return;
            case 15:
                yh.m mVar2 = (yh.m) this.f43715b;
                TLObject tLObject3 = (TLObject) this.f43716c;
                int i20 = mVar2.f47748a;
                ArrayList arrayList6 = mVar2.e;
                if (tLObject3 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject3;
                    MessagesController.getInstance(i20).putUsers(suggestedstarrefbots.users, false);
                    if (mVar2.f47750c <= 0) {
                        arrayList6.clear();
                    }
                    mVar2.f47750c = suggestedstarrefbots.count;
                    arrayList6.addAll(suggestedstarrefbots.suggested_bots);
                    mVar2.f47754j = suggestedstarrefbots.next_offset;
                    if (!suggestedstarrefbots.suggested_bots.isEmpty() && arrayList6.size() < mVar2.f47750c) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    mVar2.d = z12;
                } else {
                    mVar2.f47753i = true;
                    mVar2.d = true;
                }
                mVar2.h = false;
                NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(mVar2.f47749b));
                return;
            case 16:
                y3.U0((y3) this.f43715b, (Long) this.f43716c);
                return;
            case 17:
                y3 y3Var = (y3) this.f43715b;
                if (!((u5) this.f43716c).e) {
                    pc Q = y3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.f27321t = true;
                    Q.j();
                    return;
                }
                y3Var.f48338j0.setLoading(false);
                y3Var.w1();
                return;
            case 18:
                ((y3) this.f43715b).getBulletinFactory().d0((TLRPC.TL_error) this.f43716c, false);
                return;
            case 19:
                MessagesController.getInstance(((y3) this.f43715b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.f43716c), false);
                return;
            case 20:
                y3 y3Var2 = (y3) this.f43715b;
                y3Var2.getClass();
                ((boolean[]) this.f43716c)[0] = true;
                y3Var2.f48338j0.setLoading(false);
                y3Var2.w1();
                return;
            case 21:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f43716c;
                xc bulletinFactory = ((y3) this.f43715b).getBulletinFactory();
                int i21 = R.raw.ic_delete;
                int i22 = R.string.GiftRemovedDescription;
                bulletinFactory.Q(i21, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i22, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 22:
                y3 y3Var3 = (y3) this.f43715b;
                xc.a0((zn) this.f43716c).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(y3Var3.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new yh.b1(y3Var3, 8)).k(true);
                return;
            case 23:
                ((y3) this.f43715b).n2((CharSequence) this.f43716c);
                return;
            case 24:
                y3.I0((y3) this.f43715b, (TL_stars.TL_payments_uniqueStarGift) this.f43716c);
                return;
            case 25:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f43716c;
                ((b2) this.f43715b).dismiss();
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
                c4 c4Var = (c4) this.f43715b;
                zn znVar = (zn) this.f43716c;
                org.telegram.ui.Cells.a0 a0Var = c4Var.f47317b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    c4Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var2 = c4Var.f47317b;
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
                    org.telegram.ui.Cells.a0 a0Var3 = c4Var.f47317b;
                    o8Var.T = znVar;
                    o8Var.U = a0Var3;
                    o8Var.show();
                    return;
                }
                return;
            case 27:
                TLObject tLObject4 = (TLObject) this.f43715b;
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) this.f43716c;
                if (tLObject4 instanceof TL_stars.StarGifts) {
                    b1Var.run((TL_stars.StarGifts) tLObject4);
                    return;
                } else {
                    b1Var.run(null);
                    return;
                }
            case 28:
                boolean[] zArr = (boolean[]) this.f43715b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f43716c;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            default:
                l5 l5Var = (l5) this.f43715b;
                TLObject tLObject5 = (TLObject) this.f43716c;
                ArrayList arrayList8 = l5Var.f47711l;
                int i23 = l5Var.f47703a;
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
                        NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(l5Var.f47704b), l5Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public j0(u5 u5Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.f43714a = 28;
        this.f43715b = zArr;
        this.f43716c = callback2;
    }
}
