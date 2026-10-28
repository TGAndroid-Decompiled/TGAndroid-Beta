package vi;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bi.cb;
import hi.y2;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import li.e3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.Cells.k5;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.il;
import zh.a1;
import zh.g1;
import zh.m2;
public final class k0 implements Runnable {
    public final int f50511a;
    public final Object f50512b;
    public final Object f50513c;

    public k0(int i10, Object obj, Object obj2) {
        this.f50511a = i10;
        this.f50512b = obj;
        this.f50513c = obj2;
    }

    @Override
    public final void run() {
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        boolean z10;
        int i10 = 8;
        switch (this.f50511a) {
            case 0:
                n0 n0Var = (n0) this.f50513c;
                u0 u0Var = (u0) ((e3) this.f50512b).f17209b;
                u0Var.Q++;
                u0Var.f50654y = true;
                u0Var.f50643m.b("camera switch started: target=" + n0Var);
                o60 o60Var = (o60) u0Var.d.f17209b;
                FrameLayout frameLayout = o60Var.f31197w;
                o60Var.f31193s0++;
                ValueAnimator valueAnimator = o60Var.f31173b0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    o60Var.f31173b0.cancel();
                    o60Var.f31173b0 = null;
                }
                o60Var.f31186n0 = true;
                o60Var.f31187o0 = false;
                o60Var.f31188p0 = false;
                o60Var.f31189q0 = false;
                o60Var.f31191r0 = SystemClock.elapsedRealtime();
                il ilVar = o60Var.f31201y;
                o60Var.y(false);
                Bitmap bitmap = o60Var.f31194t0;
                if (bitmap != null) {
                    ilVar.setImageBitmap(bitmap);
                    o60Var.m0 = true;
                    ilVar.animate().cancel();
                    ilVar.setAlpha(1.0f);
                }
                frameLayout.animate().cancel();
                frameLayout.setRotationY(0.0f);
                frameLayout.setCameraDistance(frameLayout.getMeasuredHeight() * 8.0f);
                int i11 = o60Var.f31193s0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                o60Var.f31173b0 = ofFloat;
                ofFloat.setDuration(580L);
                o60Var.f31173b0.setInterpolator(ds.h);
                o60Var.f31173b0.addUpdateListener(new u2(o60Var, i11, 4));
                o60Var.f31173b0.addListener(new y2(o60Var, i11, 8));
                o60Var.f31173b0.start();
                FileLog.d("RoundVideo camera flip started: facing=" + n0Var + ", minimumDurationMs=580");
                o60Var.B();
                u0Var.o();
                return;
            case 1:
                wh.i iVar = (wh.i) this.f50512b;
                iVar.f51323b.add((String) this.f50513c);
                iVar.invalidate();
                return;
            case 2:
                xf.c cVar = (xf.c) this.f50512b;
                TLObject tLObject = (TLObject) this.f50513c;
                if (tLObject != null) {
                    if (tLObject instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar.f(true);
                    } else if (tLObject instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject;
                        ArrayList<TLRPC.Document> arrayList = tL_savedRingtones.ringtones;
                        ArrayList arrayList2 = cVar.e;
                        if (!cVar.f51805f) {
                            cVar.f(false);
                            cVar.f51805f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj = arrayList2.get(i12);
                            i12++;
                            xf.b bVar = (xf.b) obj;
                            if (bVar.f51798b != null && (document = bVar.f51797a) != null) {
                                hashMap.put(Long.valueOf(document.f22034id), bVar.f51798b);
                            }
                        }
                        arrayList2.clear();
                        SharedPreferences d = cVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList.size());
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            TLRPC.Document document3 = arrayList.get(i13);
                            String str = (String) hashMap.get(Long.valueOf(document3.f22034id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i13, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i13, str);
                            }
                            ?? obj2 = new Object();
                            obj2.f51797a = document3;
                            obj2.f51798b = str;
                            int i14 = cVar.d;
                            cVar.d = i14 + 1;
                            obj2.f51799c = i14;
                            arrayList2.add(obj2);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(cVar.f51804c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar.d().edit();
                        long j10 = tL_savedRingtones.hash;
                        xf.c.f51800g = j10;
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
                xf.c cVar2 = (xf.c) this.f50512b;
                ArrayList arrayList3 = (ArrayList) this.f50513c;
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    xf.b bVar2 = (xf.b) arrayList3.get(i15);
                    if (bVar2 != null && ((TextUtils.isEmpty(bVar2.f51798b) || !new File(bVar2.f51798b).exists()) && (document2 = bVar2.f51797a) != null && ((pathToAttach = FileLoader.getInstance(cVar2.f51804c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new k0(4, cVar2, document2));
                    }
                }
                return;
            case 4:
                TLRPC.Document document4 = (TLRPC.Document) this.f50513c;
                FileLoader.getInstance(((xf.c) this.f50512b).f51804c).loadFile(document4, document4, 0, 0);
                return;
            case 5:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f50513c;
                int i16 = ((xf.d) this.f50512b).f51806a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(i16).ringtoneDurationMax)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(i16).ringtoneSizeMax / 1024)));
                    return;
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat));
                    return;
                }
            case 6:
                ((ig.o) this.f50512b).run((TLRPC.Chat) this.f50513c);
                return;
            case 7:
                yh.k kVar = (yh.k) this.f50512b;
                k5 k5Var = (k5) this.f50513c;
                int i17 = kVar.f52675k;
                r2 r2Var = kVar.f52672g;
                TLRPC.TL_chatInviteImporter importer = k5Var.getImporter();
                kVar.f52682r = importer;
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
                        if (kVar.f52683s == null) {
                            yh.j jVar = new yh.j(kVar, r2Var.getParentActivity(), (nm0) k5Var.getParent(), r2Var.getResourceProvider(), kVar.f52668a);
                            kVar.f52683s = jVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = kVar.f52682r;
                            y9 avatarImageView = k5Var.getAvatarImageView();
                            TextView textView = jVar.e;
                            oi0 oi0Var = jVar.h;
                            jVar.f52663r = tL_chatInviteImporter;
                            jVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i17).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i17, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i17, user2, 1);
                            if (MessagesController.getInstance(i17).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i17).loadUserInfo(user2, false, 0);
                            }
                            oi0Var.setParentAvatarImage(avatarImageView);
                            oi0Var.M(tL_chatInviteImporter.user_id, true);
                            oi0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            jVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            if (!TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i10 = 0;
                            }
                            textView.setVisibility(i10);
                            jVar.f52667y.requestLayout();
                            kVar.f52683s.setOnDismissListener(new cb(kVar, 14));
                            kVar.f52683s.show();
                            return;
                        }
                        return;
                    }
                    kVar.f52669b = true;
                    r2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f22177id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    r2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 8:
                zh.b bVar3 = (zh.b) this.f50512b;
                bVar3.getClass();
                ((View.OnClickListener) this.f50513c).onClick(bVar3);
                return;
            case 9:
                ((a1) this.f50512b).getBulletinFactory().g0((TLRPC.TL_error) this.f50513c, false);
                return;
            case 10:
                g1 g1Var = (g1) this.f50512b;
                g1Var.getClass();
                if (!((TL_stars.SavedStarGift) this.f50513c).unsaved) {
                    g1Var.F.setVisibility(8);
                    return;
                }
                return;
            case 11:
                ws0 ws0Var = (ws0) this.f50512b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f50513c;
                ws0Var.h(tL_starGiftCollection.title, new org.telegram.ui.Wallet.s(19, ws0Var, tL_starGiftCollection));
                return;
            default:
                AndroidUtilities.addToClipboard((String) this.f50513c);
                wc.b0(((m2) this.f50512b).f53201a.f53288a).k(false).j();
                return;
        }
    }
}
