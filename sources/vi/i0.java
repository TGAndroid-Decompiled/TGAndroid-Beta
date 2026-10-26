package vi;

import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import bi.cb;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import li.e3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Cells.k5;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y9;
import org.telegram.ui.ProfileActivity;
import zh.a1;
import zh.g1;
import zh.m2;
public final class i0 implements Runnable {
    public final int f50401a;
    public final Object f50402b;
    public final Object f50403c;

    public i0(int i10, Object obj, Object obj2) {
        this.f50401a = i10;
        this.f50402b = obj;
        this.f50403c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        boolean z10;
        int i10;
        switch (this.f50401a) {
            case 0:
                ((s0) ((e3) this.f50402b).f17210b).h((Exception) this.f50403c);
                return;
            case 1:
                wh.i iVar = (wh.i) this.f50402b;
                iVar.f51265b.add((String) this.f50403c);
                iVar.invalidate();
                return;
            case 2:
                xf.c cVar = (xf.c) this.f50402b;
                TLObject tLObject = (TLObject) this.f50403c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList = tL_savedRingtones.ringtones;
                        ArrayList arrayList2 = cVar.e;
                        if (!cVar.f51747f) {
                            cVar.f(false);
                            cVar.f51747f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList2.get(i11);
                            i11++;
                            xf.b bVar = (xf.b) obj;
                            if (bVar.f51740b != null && (document = bVar.f51739a) != null) {
                                hashMap.put(Long.valueOf(document.f22033id), bVar.f51740b);
                            }
                        }
                        arrayList2.clear();
                        SharedPreferences d = cVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList.size());
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            TLRPC.Document document3 = arrayList.get(i12);
                            String str = (String) hashMap.get(Long.valueOf(document3.f22033id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i12, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i12, str);
                            }
                            ?? obj2 = new Object();
                            obj2.f51739a = document3;
                            obj2.f51740b = str;
                            int i13 = cVar.d;
                            cVar.d = i13 + 1;
                            obj2.f51741c = i13;
                            arrayList2.add(obj2);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(cVar.f51746c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar.d().edit();
                        long j10 = tL_savedRingtones.hash;
                        xf.c.f51742g = j10;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j10);
                        long currentTimeMillis = System.currentTimeMillis();
                        xf.c.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    cVar.b();
                    return;
                }
                return;
            case 3:
                xf.c cVar2 = (xf.c) this.f50402b;
                ArrayList arrayList3 = (ArrayList) this.f50403c;
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    xf.b bVar2 = (xf.b) arrayList3.get(i14);
                    if (bVar2 != null && ((TextUtils.isEmpty(bVar2.f51740b) || !new File(bVar2.f51740b).exists()) && (document2 = bVar2.f51739a) != null && ((pathToAttach = FileLoader.getInstance(cVar2.f51746c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new i0(4, cVar2, document2));
                    }
                }
                return;
            case 4:
                TLRPC.Document document4 = (TLRPC.Document) this.f50403c;
                FileLoader.getInstance(((xf.c) this.f50402b).f51746c).loadFile(document4, document4, 0, 0);
                return;
            case 5:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f50403c;
                int i15 = ((xf.d) this.f50402b).f51748a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(i15).ringtoneDurationMax)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(i15).ringtoneSizeMax / 1024)));
                    return;
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat));
                    return;
                }
            case 6:
                ((ig.o) this.f50402b).run((TLRPC.Chat) this.f50403c);
                return;
            case 7:
                yh.k kVar = (yh.k) this.f50402b;
                k5 k5Var = (k5) this.f50403c;
                int i16 = kVar.f52617k;
                r2 r2Var = kVar.f52614g;
                TLRPC.TL_chatInviteImporter importer = k5Var.getImporter();
                kVar.f52624r = importer;
                LongSparseArray longSparseArray = kVar.d;
                TLRPC.User user = (TLRPC.User) longSparseArray.get(importer.user_id);
                if (user != null) {
                    r2Var.getMessagesController().putUser(user, false);
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (user.photo != null && !z10) {
                        if (kVar.f52625s == null) {
                            yh.j jVar = new yh.j(kVar, r2Var.getParentActivity(), (mm0) k5Var.getParent(), r2Var.getResourceProvider(), kVar.f52610a);
                            kVar.f52625s = jVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.f52624r;
                            y9 avatarImageView = k5Var.getAvatarImageView();
                            TextView textView = jVar.e;
                            ni0 ni0Var = jVar.h;
                            jVar.f52605r = tL_chatInviteImporter;
                            jVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i16).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i16, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i16, user2, 1);
                            if (MessagesController.getInstance(i16).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i16).loadUserInfo(user2, false, 0);
                            }
                            ni0Var.setParentAvatarImage(avatarImageView);
                            ni0Var.M(tL_chatInviteImporter.user_id, true);
                            ni0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            jVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            if (TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i10 = 8;
                            } else {
                                i10 = 0;
                            }
                            textView.setVisibility(i10);
                            jVar.f52609y.requestLayout();
                            kVar.f52625s.setOnDismissListener(new cb(kVar, 14));
                            kVar.f52625s.show();
                            return;
                        }
                        return;
                    }
                    kVar.f52611b = true;
                    r2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f22176id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    r2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 8:
                zh.b bVar3 = (zh.b) this.f50402b;
                bVar3.getClass();
                ((View.OnClickListener) this.f50403c).onClick(bVar3);
                return;
            case 9:
                ((a1) this.f50402b).getBulletinFactory().g0((TLRPC.TL_error) this.f50403c, false);
                return;
            case 10:
                g1 g1Var = (g1) this.f50402b;
                g1Var.getClass();
                if (!((TL_stars.SavedStarGift) this.f50403c).unsaved) {
                    g1Var.F.setVisibility(8);
                    return;
                }
                return;
            case 11:
                vs0 vs0Var = (vs0) this.f50402b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f50403c;
                vs0Var.h(tL_starGiftCollection.title, new org.telegram.ui.Wallet.s(19, vs0Var, tL_starGiftCollection));
                return;
            default:
                AndroidUtilities.addToClipboard((String) this.f50403c);
                wc.b0(((m2) this.f50402b).f53143a.f53230a).k(false).j();
                return;
        }
    }
}
