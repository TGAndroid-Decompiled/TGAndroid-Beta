package u2;

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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.ui0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.a7;
import org.telegram.ui.zn;
import xh.o2;
import yh.e5;
import yh.h8;
import yh.l5;
import yh.m5;
import yh.s3;
import yh.w3;
public final class p0 implements Runnable {
    public final int f48730a;
    public final Object f48731b;
    public final Object f48732c;

    public p0(int i10, Object obj, Object obj2) {
        this.f48730a = i10;
        this.f48731b = obj;
        this.f48732c = obj2;
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
        ad a02;
        int i11;
        int i12;
        MessageObject messageObject;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z13;
        TLRPC.TL_messageReactions tL_messageReactions2;
        ArrayList<TLRPC.MessageReactor> arrayList = null;
        switch (this.f48730a) {
            case 0:
                ((u0) this.f48731b).x((c3.b0) this.f48732c);
                return;
            case 1:
                uh.i iVar = (uh.i) this.f48731b;
                iVar.f49057b.add((String) this.f48732c);
                iVar.invalidate();
                return;
            case 2:
                vf.c cVar = (vf.c) this.f48731b;
                TLObject tLObject = (TLObject) this.f48732c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = cVar.f49602e;
                        if (!cVar.f49603f) {
                            cVar.f(false);
                            cVar.f49603f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList3.get(i13);
                            i13++;
                            vf.b bVar = (vf.b) obj;
                            if (bVar.f49595b != null && (document = bVar.f49594a) != null) {
                                hashMap.put(Long.valueOf(document.f20048id), bVar.f49595b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences d = cVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList2.size());
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            TLRPC.Document document3 = arrayList2.get(i14);
                            String str = (String) hashMap.get(Long.valueOf(document3.f20048id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i14, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i14, str);
                            }
                            ?? obj2 = new Object();
                            obj2.f49594a = document3;
                            obj2.f49595b = str;
                            int i15 = cVar.d;
                            cVar.d = i15 + 1;
                            obj2.f49596c = i15;
                            arrayList3.add(obj2);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(cVar.f49601c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        vf.c.f49597g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        vf.c.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    cVar.b();
                    return;
                }
                return;
            case 3:
                vf.c cVar2 = (vf.c) this.f48731b;
                ArrayList arrayList4 = (ArrayList) this.f48732c;
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    vf.b bVar2 = (vf.b) arrayList4.get(i16);
                    if (bVar2 != null && ((TextUtils.isEmpty(bVar2.f49595b) || !new File(bVar2.f49595b).exists()) && (document2 = bVar2.f49594a) != null && ((pathToAttach = FileLoader.getInstance(cVar2.f49601c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new p0(4, cVar2, document2));
                    }
                }
                return;
            case 4:
                TLRPC.Document document4 = (TLRPC.Document) this.f48732c;
                FileLoader.getInstance(((vf.c) this.f48731b).f49601c).loadFile(document4, document4, 0, 0);
                return;
            case 5:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f48732c;
                int i17 = ((vf.d) this.f48731b).f49604a;
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
                ((q1) this.f48731b).run((TLRPC.Chat) this.f48732c);
                return;
            case 7:
                wh.l lVar = (wh.l) this.f48731b;
                g5 g5Var = (g5) this.f48732c;
                int i18 = lVar.f50480k;
                n2 n2Var = lVar.f50477g;
                TLRPC.TL_chatInviteImporter importer = g5Var.getImporter();
                lVar.f50487r = importer;
                LongSparseArray longSparseArray = lVar.d;
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
                        if (lVar.f50488s == null) {
                            wh.k kVar = new wh.k(lVar, n2Var.getParentActivity(), (rm0) g5Var.getParent(), n2Var.getResourceProvider(), lVar.f50472a);
                            lVar.f50488s = kVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = lVar.f50487r;
                            y9 avatarImageView = g5Var.getAvatarImageView();
                            TextView textView = kVar.f50464e;
                            ui0 ui0Var = kVar.h;
                            kVar.f50467r = tL_chatInviteImporter;
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
                            kVar.f50471y.requestLayout();
                            lVar.f50488s.setOnDismissListener(new ai.g5(lVar, 11));
                            lVar.f50488s.show();
                            return;
                        }
                        return;
                    }
                    lVar.f50473b = true;
                    n2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f20189id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    n2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 8:
                xh.c cVar3 = (xh.c) this.f48731b;
                cVar3.getClass();
                ((View.OnClickListener) this.f48732c).onClick(cVar3);
                return;
            case 9:
                ((xh.d1) this.f48731b).getBulletinFactory().f0((TLRPC.TL_error) this.f48732c, false);
                return;
            case 10:
                xh.j1 j1Var = (xh.j1) this.f48731b;
                j1Var.getClass();
                if (!((TL_stars.SavedStarGift) this.f48732c).unsaved) {
                    j1Var.F.setVisibility(8);
                    return;
                }
                return;
            case 11:
                ss0 ss0Var = (ss0) this.f48731b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f48732c;
                ss0Var.h(tL_starGiftCollection.title, new a7(10, ss0Var, tL_starGiftCollection));
                return;
            case 12:
                AndroidUtilities.addToClipboard((String) this.f48732c);
                ad.a0(((o2) this.f48731b).f51479a.f51555a).k(false).j();
                return;
            case 13:
                yh.l lVar2 = (yh.l) this.f48731b;
                TLObject tLObject2 = (TLObject) this.f48732c;
                int i19 = lVar2.f52847a;
                ArrayList arrayList5 = lVar2.f52850e;
                lVar2.f52853i = 0;
                if (tLObject2 instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject2;
                    MessagesController.getInstance(i19).putUsers(connectedstarrefbots.users, false);
                    if (lVar2.f52849c <= 0) {
                        arrayList5.clear();
                    }
                    lVar2.f52849c = connectedstarrefbots.count;
                    arrayList5.addAll(connectedstarrefbots.connected_bots);
                    if (!connectedstarrefbots.connected_bots.isEmpty() && arrayList5.size() < lVar2.f52849c) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    lVar2.d = z11;
                } else {
                    lVar2.h = true;
                    lVar2.d = true;
                }
                lVar2.f52852g = false;
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(lVar2.f52848b));
                return;
            case 14:
                yh.m mVar = (yh.m) this.f48731b;
                TLObject tLObject3 = (TLObject) this.f48732c;
                int i20 = mVar.f52897a;
                ArrayList arrayList6 = mVar.f52900e;
                if (tLObject3 instanceof TL_payments.suggestedStarRefBots) {
                    TL_payments.suggestedStarRefBots suggestedstarrefbots = (TL_payments.suggestedStarRefBots) tLObject3;
                    MessagesController.getInstance(i20).putUsers(suggestedstarrefbots.users, false);
                    if (mVar.f52899c <= 0) {
                        arrayList6.clear();
                    }
                    mVar.f52899c = suggestedstarrefbots.count;
                    arrayList6.addAll(suggestedstarrefbots.suggested_bots);
                    mVar.f52904j = suggestedstarrefbots.next_offset;
                    if (!suggestedstarrefbots.suggested_bots.isEmpty() && arrayList6.size() < mVar.f52899c) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    mVar.d = z12;
                } else {
                    mVar.f52903i = true;
                    mVar.d = true;
                }
                mVar.h = false;
                NotificationCenter.getInstance(i20).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelSuggestedBotsUpdate, Long.valueOf(mVar.f52898b));
                return;
            case 15:
                s3.V0((s3) this.f48731b, (Long) this.f48732c);
                return;
            case 16:
                s3 s3Var = (s3) this.f48731b;
                if (!((m5) this.f48732c).f52927e) {
                    tc Q = s3Var.getBulletinFactory().Q(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    Q.f31106t = true;
                    Q.j();
                    return;
                }
                s3Var.f53223k0.setLoading(false);
                s3Var.x1();
                return;
            case 17:
                ((s3) this.f48731b).getBulletinFactory().f0((TLRPC.TL_error) this.f48732c, false);
                return;
            case 18:
                MessagesController.getInstance(((s3) this.f48731b).currentAccount).lambda$processUpdates$377((TLRPC.Updates) ((TLObject) this.f48732c), false);
                return;
            case 19:
                s3 s3Var2 = (s3) this.f48731b;
                s3Var2.getClass();
                ((boolean[]) this.f48732c)[0] = true;
                s3Var2.f53223k0.setLoading(false);
                s3Var2.x1();
                return;
            case 20:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.f48732c;
                ((s3) this.f48731b).getBulletinFactory().Q(R.raw.ic_delete, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftRemovedDescription, tL_starGiftUnique.title + " #" + tL_starGiftUnique.num))).j();
                return;
            case 21:
                s3 s3Var3 = (s3) this.f48731b;
                ad.a0((zn) this.f48732c).K(R.raw.gift, LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(s3Var3.X))), LocaleController.getString(R.string.StarsGiftUpgradeCompletedMoreButton), new yh.a1(s3Var3, 8)).k(true);
                return;
            case 22:
                ((s3) this.f48731b).p2((CharSequence) this.f48732c);
                return;
            case 23:
                s3.J0((s3) this.f48731b, (TL_stars.TL_payments_uniqueStarGift) this.f48732c);
                return;
            case 24:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f48732c;
                ((b2) this.f48731b).dismiss();
                n2 U = LaunchActivity.U();
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
            case 25:
                w3 w3Var = (w3) this.f48731b;
                zn znVar = (zn) this.f48732c;
                org.telegram.ui.Cells.a0 a0Var = w3Var.f53376b;
                if (a0Var != null) {
                    try {
                        a0Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    w3Var.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                    org.telegram.ui.Cells.a0 a0Var2 = w3Var.f53376b;
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
                    l5 l5Var = m5.y(messageObject2.currentAccount, false).B;
                    if (l5Var != null) {
                        l5Var.b();
                    }
                    TLRPC.ChatFull chatFull = znVar.Z7;
                    Context context = w3Var.getContext();
                    int currentAccount = znVar.getCurrentAccount();
                    long a2 = znVar.a();
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    h8 h8Var = new h8(context, currentAccount, a2, znVar, messageObject2, arrayList7, z13, false, 0L, znVar.getResourceProvider());
                    messageObject2.getId();
                    org.telegram.ui.Cells.a0 a0Var3 = w3Var.f53376b;
                    h8Var.U = znVar;
                    h8Var.V = a0Var3;
                    h8Var.show();
                    return;
                }
                return;
            case 26:
                TLObject tLObject4 = (TLObject) this.f48731b;
                q1 q1Var = (q1) this.f48732c;
                if (tLObject4 instanceof TL_stars.StarGifts) {
                    q1Var.run((TL_stars.StarGifts) tLObject4);
                    return;
                } else {
                    q1Var.run(null);
                    return;
                }
            case 27:
                boolean[] zArr = (boolean[]) this.f48731b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f48732c;
                if (!zArr[0]) {
                    callback2.run("cancelled", 0L);
                    zArr[0] = true;
                    return;
                }
                return;
            case 28:
                e5 e5Var = (e5) this.f48731b;
                TLObject tLObject5 = (TLObject) this.f48732c;
                ArrayList arrayList8 = e5Var.f52486l;
                int i21 = e5Var.f52477a;
                if (tLObject5 instanceof TL_stars.TL_payments_savedStarGifts) {
                    TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject5;
                    MessagesController.getInstance(i21).putUsers(tL_payments_savedStarGifts.users, false);
                    MessagesController.getInstance(i21).putChats(tL_payments_savedStarGifts.chats, false);
                    if (tL_payments_savedStarGifts.gifts.size() > 0) {
                        TL_stars.SavedStarGift savedStarGift = tL_payments_savedStarGifts.gifts.get(0);
                        int i22 = 0;
                        while (i22 < arrayList8.size() && ((TL_stars.SavedStarGift) arrayList8.get(i22)).pinned_to_top) {
                            i22++;
                        }
                        arrayList8.add(i22, savedStarGift);
                        NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(e5Var.f52478b), e5Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((MessagesController) this.f48731b).lambda$processUpdates$377((TLRPC.Updates) ((TLObject) this.f48732c), false);
                return;
        }
    }

    public p0(m5 m5Var, boolean[] zArr, Utilities.Callback2 callback2) {
        this.f48730a = 27;
        this.f48731b = zArr;
        this.f48732c = callback2;
    }
}
