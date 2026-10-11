package tg;

import android.content.Context;
import android.content.SharedPreferences;
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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.Components.ui0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.b7;
import org.telegram.ui.zn;
import xh.o2;
import yh.h8;
import yh.m5;
import yh.n5;
import yh.s3;
import yh.w3;
public final class c1 implements Runnable {
    public final int f48407a;
    public final Object f48408b;
    public final Object f48409c;

    public c1(int i10, Object obj, Object obj2) {
        this.f48407a = i10;
        this.f48408b = obj;
        this.f48409c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        boolean z10;
        m2 m2Var;
        boolean z11;
        int i10;
        boolean z12;
        boolean z13;
        ad a02;
        int i11;
        int i12;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z14;
        TLRPC.TL_messageReactions tL_messageReactions2;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        switch (this.f48407a) {
            case 0:
                m1.Q((m1) this.f48408b, (TLObject) this.f48409c);
                return;
            case 1:
                ((e2.h) this.f48408b).accept(this.f48409c);
                return;
            case 2:
                ((u2.t0) this.f48408b).x((c3.b0) this.f48409c);
                return;
            case 3:
                uh.i iVar = (uh.i) this.f48408b;
                iVar.f49134b.add((String) this.f48409c);
                iVar.invalidate();
                return;
            case 4:
                vf.c cVar = (vf.c) this.f48408b;
                TLObject tLObject = (TLObject) this.f48409c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = cVar.f49679e;
                        if (!cVar.f49680f) {
                            cVar.f(false);
                            cVar.f49680f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList3.get(i13);
                            i13++;
                            vf.b bVar = (vf.b) obj;
                            if (bVar.f49672b != null && (document = bVar.f49671a) != null) {
                                hashMap.put(Long.valueOf(document.f20074id), bVar.f49672b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences d = cVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList2.size());
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            TLRPC.Document document3 = arrayList2.get(i14);
                            String str = (String) hashMap.get(Long.valueOf(document3.f20074id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i14, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i14, str);
                            }
                            ?? obj2 = new Object();
                            obj2.f49671a = document3;
                            obj2.f49672b = str;
                            int i15 = cVar.d;
                            cVar.d = i15 + 1;
                            obj2.f49673c = i15;
                            arrayList3.add(obj2);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(cVar.f49678c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        vf.c.f49674g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        vf.c.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    cVar.b();
                    return;
                }
                return;
            case 5:
                vf.c cVar2 = (vf.c) this.f48408b;
                ArrayList arrayList4 = (ArrayList) this.f48409c;
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    vf.b bVar2 = (vf.b) arrayList4.get(i16);
                    if (bVar2 != null && ((TextUtils.isEmpty(bVar2.f49672b) || !new File(bVar2.f49672b).exists()) && (document2 = bVar2.f49671a) != null && ((pathToAttach = FileLoader.getInstance(cVar2.f49678c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new c1(6, cVar2, document2));
                    }
                }
                return;
            case 6:
                TLRPC.Document document4 = (TLRPC.Document) this.f48409c;
                FileLoader.getInstance(((vf.c) this.f48408b).f49678c).loadFile(document4, document4, 0, 0);
                return;
            case 7:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f48409c;
                int i17 = ((vf.d) this.f48408b).f49681a;
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
            case 8:
                ((q1) this.f48408b).run((TLRPC.Chat) this.f48409c);
                return;
            case 9:
                wh.l lVar = (wh.l) this.f48408b;
                g5 g5Var = (g5) this.f48409c;
                int i18 = lVar.f50558k;
                m2 m2Var2 = lVar.f50555g;
                TLRPC.TL_chatInviteImporter importer = g5Var.getImporter();
                lVar.f50565r = importer;
                LongSparseArray longSparseArray = lVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    m2Var2.getMessagesController().putUser(user, false);
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (user.photo != null) {
                        if (z10) {
                            z11 = true;
                            m2Var = m2Var2;
                        } else if (lVar.f50566s == null) {
                            wh.k kVar = new wh.k(lVar, m2Var2.getParentActivity(), (rm0) g5Var.getParent(), m2Var2.getResourceProvider(), lVar.f50550a);
                            lVar.f50566s = kVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = lVar.f50565r;
                            y9 avatarImageView = g5Var.getAvatarImageView();
                            TextView textView = kVar.f50542e;
                            ui0 ui0Var = kVar.h;
                            kVar.f50545r = tL_chatInviteImporter;
                            kVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i18).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i18, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i18, user2, 1);
                            if (MessagesController.getInstance(i18).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i18).loadUserInfo(user2, false, 0);
                            }
                            ui0Var.setParentAvatarImage(avatarImageView);
                            ui0Var.M(tL_chatInviteImporter.user_id, true);
                            ui0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            kVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            if (TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            textView.setVisibility(i10);
                            kVar.f50549y.requestLayout();
                            lVar.f50566s.setOnDismissListener(new ai.g5(lVar, 11));
                            lVar.f50566s.show();
                            return;
                        } else {
                            return;
                        }
                    } else {
                        m2Var = m2Var2;
                        z11 = true;
                    }
                    lVar.f50551b = z11;
                    m2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f20215id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    m2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 10:
                xh.c cVar3 = (xh.c) this.f48408b;
                cVar3.getClass();
                ((View.OnClickListener) this.f48409c).onClick(cVar3);
                return;
            case 11:
                ((xh.d1) this.f48408b).getBulletinFactory().f0((TLRPC.TL_error) this.f48409c, false);
                return;
            case 12:
                xh.j1 j1Var = (xh.j1) this.f48408b;
                j1Var.getClass();
                if (!((TL_stars.SavedStarGift) this.f48409c).unsaved) {
                    j1Var.F.setVisibility(8);
                    return;
                }
                return;
            case 13:
                ss0 ss0Var = (ss0) this.f48408b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f48409c;
                ss0Var.h(tL_starGiftCollection.title, new b7(10, ss0Var, tL_starGiftCollection));
                return;
            case 14:
                AndroidUtilities.addToClipboard((String) this.f48409c);
                ad.a0(((o2) this.f48408b).f51556a.f51632a).k(false).j();
                return;
            case 15:
                yh.l lVar2 = (yh.l) this.f48408b;
                TLObject tLObject2 = (TLObject) this.f48409c;
                int i19 = lVar2.f52924a;
                ArrayList arrayList5 = lVar2.f52927e;
                lVar2.f52930i = 0;
                if (tLObject2 instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject2;
                    MessagesController.getInstance(i19).putUsers(connectedstarrefbots.users, false);
                    if (lVar2.f52926c <= 0) {
                        arrayList5.clear();
                    }
                    lVar2.f52926c = connectedstarrefbots.count;
                    arrayList5.addAll(connectedstarrefbots.connected_bots);
                    if (!connectedstarrefbots.connected_bots.isEmpty() && arrayList5.size() < lVar2.f52926c) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    lVar2.d = z12;
                } else {
                    lVar2.h = true;
                    lVar2.d = true;
                }
                lVar2.f52929g = false;
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(lVar2.f52925b));
                return;
            case 16:
                yh.m mVar = (yh.m) this.f48408b;
                TLObject tLObject3 = (TLObject) this.f48409c;
                int i20 = mVar.f52962a;
                ArrayList arrayList6 = mVar.f52965e;
                if (tLObject3 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject3;
                    MessagesController.getInstance(i20).putUsers(suggestedstarrefbots.users, false);
                    if (mVar.f52964c <= 0) {
                        arrayList6.clear();
                    }
                    mVar.f52964c = suggestedstarrefbots.count;
                    arrayList6.addAll(suggestedstarrefbots.suggested_bots);
                    mVar.f52969j = suggestedstarrefbots.next_offset;
                    if (!suggestedstarrefbots.suggested_bots.isEmpty() && arrayList6.size() < mVar.f52964c) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    mVar.d = z13;
                } else {
                    mVar.f52968i = true;
                    mVar.d = true;
                }
                mVar.h = false;
                NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(mVar.f52963b));
                return;
            case 17:
                s3.V0((s3) this.f48408b, (Long) this.f48409c);
                return;
            case 18:
                s3 s3Var = (s3) this.f48408b;
                if (!((n5) this.f48409c).f53034e) {
                    sc Q = s3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.f30843t = true;
                    Q.j();
                    return;
                }
                s3Var.f53300k0.setLoading(false);
                s3Var.x1();
                return;
            case 19:
                ((s3) this.f48408b).getBulletinFactory().f0((TLRPC.TL_error) this.f48409c, false);
                return;
            case 20:
                MessagesController.getInstance(((s3) this.f48408b).currentAccount).lambda$processUpdates$377((TLRPC.Updates) ((TLObject) this.f48409c), false);
                return;
            case 21:
                s3 s3Var2 = (s3) this.f48408b;
                s3Var2.getClass();
                ((boolean[]) this.f48409c)[0] = true;
                s3Var2.f53300k0.setLoading(false);
                s3Var2.x1();
                return;
            case 22:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f48409c;
                ((s3) this.f48408b).getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 23:
                s3 s3Var3 = (s3) this.f48408b;
                ad.a0((zn) this.f48409c).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(s3Var3.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new yh.a1(s3Var3, 8)).k(true);
                return;
            case 24:
                ((s3) this.f48408b).p2((CharSequence) this.f48409c);
                return;
            case 25:
                s3.J0((s3) this.f48408b, (TL_stars.TL_payments_uniqueStarGift) this.f48409c);
                return;
            case 26:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f48409c;
                ((a2) this.f48408b).dismiss();
                m2 U = LaunchActivity.U();
                if (U != null) {
                    if (tL_error2 != null && "STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error2.text)) {
                        a02 = ad.a0(U);
                        i11 = R.raw.fire_on;
                        i12 = R.string.UniqueGiftNotFoundBurned;
                    } else {
                        a02 = ad.a0(U);
                        i11 = R.raw.error;
                        i12 = R.string.UniqueGiftNotFound;
                    }
                    org.telegram.messenger.q.q(i12, a02, i11, 36);
                    return;
                }
                return;
            case 27:
                w3 w3Var = (w3) this.f48408b;
                zn znVar = (zn) this.f48409c;
                org.telegram.ui.Cells.a0 a0Var = w3Var.f53453b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    w3Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var2 = w3Var.f53453b;
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
                    m5 m5Var = n5.y(messageObject2.currentAccount, false).B;
                    if (m5Var != null) {
                        m5Var.b();
                    }
                    TLRPC.ChatFull chatFull = znVar.Z7;
                    Context context = w3Var.getContext();
                    int currentAccount = znVar.getCurrentAccount();
                    long a2 = znVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    h8 h8Var = new h8(context, currentAccount, a2, znVar, messageObject2, arrayList7, z14, false, 0L, znVar.getResourceProvider());
                    messageObject2.getId();
                    org.telegram.ui.Cells.a0 a0Var3 = w3Var.f53453b;
                    h8Var.U = znVar;
                    h8Var.V = a0Var3;
                    h8Var.show();
                    return;
                }
                return;
            case 28:
                TLObject tLObject4 = (TLObject) this.f48409c;
                q1 q1Var = (q1) this.f48408b;
                if (tLObject4 instanceof TL_stars.StarGifts) {
                    q1Var.run((TL_stars.StarGifts) tLObject4);
                    return;
                } else {
                    q1Var.run(null);
                    return;
                }
            default:
                boolean[] zArr = (boolean[]) this.f48408b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f48409c;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
        }
    }

    public c1(TLObject tLObject, q1 q1Var) {
        this.f48407a = 28;
        this.f48409c = tLObject;
        this.f48408b = q1Var;
    }

    public c1(n5 n5Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.f48407a = 29;
        this.f48408b = zArr;
        this.f48409c = callback2;
    }
}
