package s9;

import android.content.SharedPreferences;
import android.graphics.Point;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.TextView;
import bi.t4;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import ji.d4;
import ji.p1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.b2;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.z9;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.y6;
import org.telegram.ui.fo;
import org.telegram.ui.mt;
import s4.b0;
import sg.a2;
import sg.h0;
import sg.i0;
import sg.j0;
import tg.p;
import tg.r;
import u2.w0;
import ug.a0;
import ug.m1;
import ug.v;
import yh.b1;
import yh.h1;
public final class b implements Runnable {
    public final int f45048a;
    public final Object f45049b;
    public final Object f45050c;

    public b(int i10, Object obj, Object obj2) {
        this.f45048a = i10;
        this.f45049b = obj;
        this.f45050c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        boolean z10;
        int i11;
        boolean z11;
        switch (this.f45048a) {
            case 0:
                Callable callable = (Callable) this.f45049b;
                i iVar = (i) ((d4) this.f45050c).f13233b;
                try {
                    iVar.k(callable.call());
                    return;
                } catch (Exception e) {
                    iVar.l(e);
                    return;
                }
            case 1:
                j0 j0Var = (j0) this.f45049b;
                TLObject tLObject = (TLObject) this.f45050c;
                ArrayList arrayList = j0Var.f45211i0;
                mm0 mm0Var = j0Var.d;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    j0Var.I0 = false;
                    j0Var.J0.b(j0Var.f45215n0 + 4);
                    int i12 = 0;
                    while (true) {
                        if (i12 < mm0Var.getChildCount()) {
                            if (mm0Var.getChildAt(i12) instanceof i0) {
                                i10 = mm0Var.getChildAt(i12).getTop();
                            } else {
                                i12++;
                            }
                        } else {
                            i10 = 0;
                        }
                    }
                    j0Var.N1();
                    if (j0Var.f45214l0 >= 0 && i10 != 0) {
                        ((b0) mm0Var.getLayoutManager()).h1(j0Var.f45214l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList.size(), j0Var.M0.f1503b);
                j0Var.f45225x0.g(max, false);
                j0Var.f45225x0.setBagePosition(max / j0Var.M0.f1504c);
                h0 h0Var = j0Var.f45225x0;
                h0Var.H = true;
                h0Var.requestLayout();
                return;
            case 2:
                ((j0) this.f45049b).n1((ga0) this.f45050c, true);
                return;
            case 3:
                a2 a2Var = (a2) this.f45049b;
                AndroidUtilities.runOnUIThread(new b(4, a2Var, FileLoader.getInstance(a2Var.f45134s).getPathToAttach((TLRPC.Document) this.f45050c)));
                return;
            case 4:
                a2 a2Var2 = (a2) this.f45049b;
                a2Var2.e = (File) this.f45050c;
                a2Var2.a();
                return;
            case 5:
                ((tg.f) this.f45049b).c((ArrayList) this.f45050c);
                return;
            case 6:
                p pVar = (p) this.f45049b;
                r rVar = (r) this.f45050c;
                pVar.getClass();
                try {
                    EGLDisplay eGLDisplay = pVar.f45787i;
                    if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
                        EGLSurface eGLSurface = pVar.f45789k;
                        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, pVar.f45788j);
                        EGLSurface eGLSurface2 = rVar.h;
                        if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                            EGL14.eglDestroySurface(pVar.f45787i, eGLSurface2);
                        }
                        rVar.h = EGL14.EGL_NO_SURFACE;
                        if (pVar.f45785f.length == 0) {
                            pVar.b();
                        }
                    }
                    rVar.f45801b.release();
                    return;
                } catch (Throwable th2) {
                    rVar.f45801b.release();
                    throw th2;
                }
            case 7:
                ((e2.j) this.f45049b).accept(this.f45050c);
                return;
            case 8:
                ((w0) this.f45049b).A((c3.b0) this.f45050c);
                return;
            case 9:
                tf.b bVar = (tf.b) this.f45050c;
                if (((AtomicBoolean) ((com.google.android.gms.internal.cast.p) this.f45049b).e).compareAndSet(false, true)) {
                    bVar.a(true);
                    return;
                }
                return;
            case 10:
                ((ug.w0) this.f45049b).run((ArrayList) this.f45050c);
                return;
            case 11:
                ((v) this.f45049b).run((TLRPC.TL_error) this.f45050c);
                return;
            case 12:
                ((mt) this.f45049b).run((ArrayList) this.f45050c);
                return;
            case 13:
                Utilities.Callback callback = (Utilities.Callback) this.f45050c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f45049b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new b2(callback, smallGroupsParticipantsCount, 1));
                    return;
                }
                return;
            case 14:
                sc M = zc.a0((fo) this.f45049b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f45050c).stars)), R.raw.stars_send);
                M.f29102j = 5000;
                M.k(true);
                return;
            case 15:
                a0 a0Var = (a0) this.f45049b;
                a0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, a0Var.f46255b0, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.f45050c);
                return;
            case 16:
                m1.Q((m1) this.f45049b, (TLObject) this.f45050c);
                return;
            case 17:
                vh.i iVar2 = (vh.i) this.f45049b;
                iVar2.f47056b.add((String) this.f45050c);
                iVar2.invalidate();
                return;
            case 18:
                wf.c cVar = (wf.c) this.f45049b;
                TLObject tLObject2 = (TLObject) this.f45050c;
                if (tLObject2 != null) {
                    if (tLObject2 instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar.f(true);
                    } else if (tLObject2 instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject2;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = cVar.e;
                        if (!cVar.f47551f) {
                            cVar.f(false);
                            cVar.f47551f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj = arrayList3.get(i13);
                            i13++;
                            wf.b bVar2 = (wf.b) obj;
                            if (bVar2.f47544b != null && (document = bVar2.f47543a) != null) {
                                hashMap.put(Long.valueOf(document.f19222id), bVar2.f47544b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences d = cVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList2.size());
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            TLRPC.Document document3 = arrayList2.get(i14);
                            String str = (String) hashMap.get(Long.valueOf(document3.f19222id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i14, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i14, str);
                            }
                            ?? obj2 = new Object();
                            obj2.f47543a = document3;
                            obj2.f47544b = str;
                            int i15 = cVar.d;
                            cVar.d = i15 + 1;
                            obj2.f47545c = i15;
                            arrayList3.add(obj2);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(cVar.f47550c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar.d().edit();
                        long j10 = tL_savedRingtones.hash;
                        wf.c.f47546g = j10;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j10);
                        long currentTimeMillis = System.currentTimeMillis();
                        wf.c.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    cVar.b();
                    return;
                }
                return;
            case 19:
                wf.c cVar2 = (wf.c) this.f45049b;
                ArrayList arrayList4 = (ArrayList) this.f45050c;
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    wf.b bVar3 = (wf.b) arrayList4.get(i16);
                    if (bVar3 != null && ((TextUtils.isEmpty(bVar3.f47544b) || !new File(bVar3.f47544b).exists()) && (document2 = bVar3.f47543a) != null && ((pathToAttach = FileLoader.getInstance(cVar2.f47550c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new b(20, cVar2, document2));
                    }
                }
                return;
            case 20:
                TLRPC.Document document4 = (TLRPC.Document) this.f45050c;
                FileLoader.getInstance(((wf.c) this.f45049b).f47550c).loadFile(document4, document4, 0, 0);
                return;
            case 21:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f45050c;
                int i17 = ((wf.d) this.f45049b).f47552a;
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
            case 22:
                ((p1) this.f45049b).run((TLRPC.Chat) this.f45050c);
                return;
            case 23:
                xh.l lVar = (xh.l) this.f45049b;
                g5 g5Var = (g5) this.f45050c;
                int i18 = lVar.f48482k;
                m2 m2Var = lVar.f48479g;
                TLRPC.TL_chatInviteImporter importer = g5Var.getImporter();
                lVar.f48489r = importer;
                LongSparseArray longSparseArray = lVar.d;
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
                        if (lVar.f48490s == null) {
                            xh.k kVar = new xh.k(lVar, m2Var.getParentActivity(), (mm0) g5Var.getParent(), m2Var.getResourceProvider(), lVar.f48475a);
                            lVar.f48490s = kVar;
                            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = lVar.f48489r;
                            z9 avatarImageView = g5Var.getAvatarImageView();
                            TextView textView = kVar.e;
                            pi0 pi0Var = kVar.h;
                            kVar.f48470r = tL_chatInviteImporter;
                            kVar.v = avatarImageView;
                            TLRPC.User user2 = MessagesController.getInstance(i18).getUser(Long.valueOf(tL_chatInviteImporter.user_id));
                            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(i18, user2, 0);
                            ImageLocation forUserOrChat2 = ImageLocation.getForUserOrChat(i18, user2, 1);
                            if (MessagesController.getInstance(i18).getUserFull(tL_chatInviteImporter.user_id) == null) {
                                MessagesController.getInstance(i18).loadUserInfo(user2, false, 0);
                            }
                            pi0Var.setParentAvatarImage(avatarImageView);
                            pi0Var.M(tL_chatInviteImporter.user_id, true);
                            pi0Var.H(null, forUserOrChat, forUserOrChat2, true);
                            kVar.d.setText(UserObject.getUserName((TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id)));
                            textView.setText(tL_chatInviteImporter.about);
                            if (TextUtils.isEmpty(tL_chatInviteImporter.about)) {
                                i11 = 8;
                            } else {
                                i11 = 0;
                            }
                            textView.setVisibility(i11);
                            kVar.f48474y.requestLayout();
                            lVar.f48490s.setOnDismissListener(new t4(lVar, 11));
                            lVar.f48490s.show();
                            return;
                        }
                        return;
                    }
                    lVar.f48476b = true;
                    m2Var.dismissCurrentDialog();
                    Bundle bundle = new Bundle();
                    ProfileActivity profileActivity = new ProfileActivity(bundle, null);
                    bundle.putLong("user_id", user.f19363id);
                    bundle.putBoolean("removeFragmentOnChatOpen", false);
                    m2Var.presentFragment(profileActivity);
                    return;
                }
                return;
            case 24:
                yh.c cVar3 = (yh.c) this.f45049b;
                cVar3.getClass();
                ((View.OnClickListener) this.f45050c).onClick(cVar3);
                return;
            case 25:
                ((b1) this.f45049b).getBulletinFactory().f0((TLRPC.TL_error) this.f45050c, false);
                return;
            case 26:
                h1 h1Var = (h1) this.f45049b;
                h1Var.getClass();
                if (!((TL_stars.SavedStarGift) this.f45050c).unsaved) {
                    h1Var.F.setVisibility(8);
                    return;
                }
                return;
            case 27:
                ns0 ns0Var = (ns0) this.f45049b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.f45050c;
                ns0Var.h(tL_starGiftCollection.title, new y6(10, ns0Var, tL_starGiftCollection));
                return;
            case 28:
                AndroidUtilities.addToClipboard((String) this.f45050c);
                zc.a0(((yh.m2) this.f45049b).f48994a.f49089a).k(false).j();
                return;
            default:
                zh.l lVar2 = (zh.l) this.f45049b;
                TLObject tLObject3 = (TLObject) this.f45050c;
                int i19 = lVar2.f50773a;
                ArrayList arrayList5 = lVar2.e;
                lVar2.f50778i = 0;
                if (tLObject3 instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject3;
                    MessagesController.getInstance(i19).putUsers(connectedstarrefbots.users, false);
                    if (lVar2.f50775c <= 0) {
                        arrayList5.clear();
                    }
                    lVar2.f50775c = connectedstarrefbots.count;
                    arrayList5.addAll(connectedstarrefbots.connected_bots);
                    if (!connectedstarrefbots.connected_bots.isEmpty() && arrayList5.size() < lVar2.f50775c) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    lVar2.d = z11;
                } else {
                    lVar2.h = true;
                    lVar2.d = true;
                }
                lVar2.f50777g = false;
                NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelConnectedBotsUpdate, Long.valueOf(lVar2.f50774b));
                return;
        }
    }
}
