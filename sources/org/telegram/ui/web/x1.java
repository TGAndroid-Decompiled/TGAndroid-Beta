package org.telegram.ui.web;

import android.app.job.JobParameters;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wr;
import org.telegram.ui.eo;
import org.telegram.ui.nj0;
import org.telegram.ui.r91;
public final class x1 implements Runnable {
    public final int f38146a;
    public final Object f38147b;
    public final Object f38148c;

    public x1(int i10, Object obj, Object obj2) {
        this.f38146a = i10;
        this.f38147b = obj;
        this.f38148c = obj2;
    }

    private final void a() {
        q9.o oVar = (q9.o) this.f38147b;
        pa.b bVar = (pa.b) this.f38148c;
        synchronized (oVar) {
            try {
                if (oVar.f40579b == null) {
                    oVar.f40578a.add(bVar);
                } else {
                    oVar.f40579b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.voip.x xVar;
        pa.a aVar;
        int i10;
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        switch (this.f38146a) {
            case 0:
                b2 b2Var = (b2) this.f38147b;
                b2Var.getMessagesController().removeWebBrowserException((String) this.f38148c);
                b2Var.f25171a.Y2.N(true);
                return;
            case 1:
                i2 i2Var = (i2) this.f38147b;
                TLObject tLObject = (TLObject) this.f38148c;
                int i11 = i2Var.f37962a;
                i2Var.f37966g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i11).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i11).putChats(tL_messages_webPage.chats, false);
                    i2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            i2Var.h = tL_webPage;
                        }
                    }
                    i2Var.h = null;
                }
                TLRPC.WebPage webPage = i2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    i2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && i2Var.h != null && (xVar = i2Var.f37970l) != null) {
                    xVar.run();
                }
                i2Var.c();
                return;
            case 2:
                ((i2) this.f38147b).f37971m.remove((r91) this.f38148c);
                return;
            case 3:
                p2.b bVar = (p2.b) this.f38147b;
                bVar.f39529r = false;
                bVar.d((Uri) this.f38148c);
                return;
            case 4:
                pg.x1 x1Var = (pg.x1) this.f38148c;
                x1Var.m();
                ((pg.m0) this.f38147b).r0(x1Var, true);
                return;
            case 5:
                ((pg.x1) this.f38147b).s((Bitmap) this.f38148c);
                return;
            case 6:
                pg.n2 n2Var = (pg.n2) this.f38147b;
                n2Var.G = false;
                pg.k2[] k2VarArr = (pg.k2[]) ((ArrayList) this.f38148c).toArray(new pg.k2[0]);
                n2Var.H = k2VarArr;
                if (k2VarArr.length > 0) {
                    n2Var.f40178b0.setScaleX(0.3f);
                    n2Var.f40178b0.setScaleY(0.3f);
                    n2Var.f40178b0.setAlpha(0.0f);
                    n2Var.f40178b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(wr.f28819f).start();
                    return;
                }
                return;
            case 7:
                q9.p pVar = (q9.p) this.f38147b;
                pa.b bVar2 = (pa.b) this.f38148c;
                if (pVar.f40582b == q9.p.d) {
                    synchronized (pVar) {
                        aVar = pVar.f40581a;
                        pVar.f40581a = null;
                        pVar.f40582b = bVar2;
                    }
                    aVar.j(bVar2);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 8:
                a();
                return;
            case 9:
                qg.k0 k0Var = (qg.k0) this.f38147b;
                TLObject tLObject2 = (TLObject) this.f38148c;
                ArrayList arrayList = k0Var.f40772i0;
                vl0 vl0Var = k0Var.d;
                if (tLObject2 != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject2).chats);
                    k0Var.I0 = false;
                    k0Var.J0.b(k0Var.f40776n0 + 4);
                    int i12 = 0;
                    while (true) {
                        if (i12 < vl0Var.getChildCount()) {
                            if (vl0Var.getChildAt(i12) instanceof qg.j0) {
                                i10 = vl0Var.getChildAt(i12).getTop();
                            } else {
                                i12++;
                            }
                        } else {
                            i10 = 0;
                        }
                    }
                    k0Var.M1();
                    if (k0Var.f40775l0 >= 0 && i10 != 0) {
                        ((s4.c0) vl0Var.getLayoutManager()).h1(k0Var.f40775l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList.size(), k0Var.M0.f1042b);
                k0Var.f40786x0.g(max, false);
                k0Var.f40786x0.setBagePosition(max / k0Var.M0.f1043c);
                qg.i0 i0Var = k0Var.f40786x0;
                i0Var.H = true;
                i0Var.requestLayout();
                return;
            case 10:
                ((qg.k0) this.f38147b).m1((p90) this.f38148c, true);
                return;
            case 11:
                qg.a2 a2Var = (qg.a2) this.f38147b;
                AndroidUtilities.runOnUIThread(new x1(12, a2Var, FileLoader.getInstance(a2Var.f40675s).getPathToAttach((TLRPC.Document) this.f38148c)));
                return;
            case 12:
                qg.a2 a2Var2 = (qg.a2) this.f38147b;
                a2Var2.e = (File) this.f38148c;
                a2Var2.a();
                return;
            case 13:
                CarResultStub.H0((Map.Entry) this.f38147b, this.f38148c);
                return;
            case 14:
                int i13 = JobInfoSchedulerService.f4725a;
                ((JobInfoSchedulerService) this.f38147b).jobFinished((JobParameters) this.f38148c, false);
                return;
            case 15:
                r9.a aVar2 = (r9.a) this.f38147b;
                Runnable runnable = (Runnable) this.f38148c;
                Process.setThreadPriority(aVar2.f41368c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 16:
                Callable callable = (Callable) this.f38147b;
                r9.h hVar = (r9.h) ((l2.h) this.f38148c).f12721b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e) {
                    hVar.l(e);
                    return;
                }
            case 17:
                rf.b bVar3 = (rf.b) this.f38148c;
                if (((AtomicBoolean) ((com.google.android.gms.internal.cast.p) this.f38147b).e).compareAndSet(false, true)) {
                    bVar3.a(true);
                    return;
                }
                return;
            case 18:
                ((sg.y0) this.f38147b).run((ArrayList) this.f38148c);
                return;
            case 19:
                ((sg.v) this.f38147b).run((TLRPC.TL_error) this.f38148c);
                return;
            case 20:
                ((nj0) this.f38147b).run((ArrayList) this.f38148c);
                return;
            case 21:
                Utilities.Callback callback = (Utilities.Callback) this.f38148c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f38147b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c2(callback, smallGroupsParticipantsCount, 1));
                    return;
                }
                return;
            case 22:
                pc M = wc.a0((eo) this.f38147b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f38148c).stars)), R.raw.stars_send);
                M.f26081j = 5000;
                M.k(true);
                return;
            case 23:
                sg.a0 a0Var = (sg.a0) this.f38147b;
                a0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, a0Var.f41847b0, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.f38148c);
                return;
            case 24:
                sg.p1.P((sg.p1) this.f38147b, (TLObject) this.f38148c);
                return;
            case 25:
                tf.c cVar = (tf.c) this.f38147b;
                TLObject tLObject3 = (TLObject) this.f38148c;
                if (tLObject3 != null) {
                    if (tLObject3 instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar.f(true);
                    } else if (tLObject3 instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject3;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = cVar.e;
                        if (!cVar.f42133f) {
                            cVar.f(false);
                            cVar.f42133f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList3.get(i14);
                            i14++;
                            tf.b bVar4 = (tf.b) obj;
                            if (bVar4.f42126b != null && (document = bVar4.f42125a) != null) {
                                hashMap.put(Long.valueOf(document.f17201id), bVar4.f42126b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences d = cVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList2.size());
                        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                            TLRPC.Document document3 = arrayList2.get(i15);
                            String str = (String) hashMap.get(Long.valueOf(document3.f17201id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i15, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i15, str);
                            }
                            ?? obj2 = new Object();
                            obj2.f42125a = document3;
                            obj2.f42126b = str;
                            int i16 = cVar.d;
                            cVar.d = i16 + 1;
                            obj2.f42127c = i16;
                            arrayList3.add(obj2);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(cVar.f42132c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        tf.c.f42128g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        tf.c.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    cVar.b();
                    return;
                }
                return;
            case 26:
                tf.c cVar2 = (tf.c) this.f38147b;
                ArrayList arrayList4 = (ArrayList) this.f38148c;
                for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                    tf.b bVar5 = (tf.b) arrayList4.get(i17);
                    if (bVar5 != null && ((TextUtils.isEmpty(bVar5.f42126b) || !new File(bVar5.f42126b).exists()) && (document2 = bVar5.f42125a) != null && ((pathToAttach = FileLoader.getInstance(cVar2.f42132c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new x1(27, cVar2, document2));
                    }
                }
                return;
            case 27:
                TLRPC.Document document4 = (TLRPC.Document) this.f38148c;
                FileLoader.getInstance(((tf.c) this.f38147b).f42132c).loadFile(document4, document4, 0, 0);
                return;
            case 28:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f38148c;
                int i18 = ((tf.d) this.f38147b).f42134a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLongError", R.string.TooLongError, new Object[0]), LocaleController.formatString("ErrorRingtoneDurationTooLong", R.string.ErrorRingtoneDurationTooLong, Integer.valueOf(MessagesController.getInstance(i18).ringtoneDurationMax)));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("TooLargeError", R.string.TooLargeError, new Object[0]), LocaleController.formatString("ErrorRingtoneSizeTooBig", R.string.ErrorRingtoneSizeTooBig, Integer.valueOf(MessagesController.getInstance(i18).ringtoneSizeMax / 1024)));
                    return;
                } else {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 4, LocaleController.formatString("InvalidFormatError", R.string.InvalidFormatError, new Object[0]), LocaleController.getString(R.string.ErrorRingtoneInvalidFormat));
                    return;
                }
            default:
                th.j jVar = (th.j) this.f38147b;
                jVar.f42240b.add((String) this.f38148c);
                jVar.invalidate();
                return;
        }
    }
}
