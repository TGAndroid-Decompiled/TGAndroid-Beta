package p2;

import android.app.job.JobParameters;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import androidx.car.app.hardware.common.CarResultStub;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.File;
import java.nio.ByteBuffer;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;
import org.telegram.ui.oj0;
import pg.a1;
import pg.c1;
import pg.q0;
import pg.x0;
import qg.a2;
import qg.m2;
import qg.p0;
import qg.p2;
import rg.h0;
import rg.i0;
import rg.j0;
import rg.z1;
import s4.c0;
import tg.b0;
import tg.n1;
import tg.w;
import u2.u0;
public final class b implements Runnable {
    public final int f40423a;
    public final Object f40424b;
    public final Object f40425c;

    public b(int i10, Object obj, Object obj2) {
        this.f40423a = i10;
        this.f40424b = obj;
        this.f40425c = obj2;
    }

    private final void a() {
        q9.o oVar = (q9.o) this.f40424b;
        pa.b bVar = (pa.b) this.f40425c;
        synchronized (oVar) {
            try {
                if (oVar.f41229b == null) {
                    oVar.f41228a.add(bVar);
                } else {
                    oVar.f41229b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        pa.a aVar;
        int i10;
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        switch (this.f40423a) {
            case 0:
                c cVar = (c) this.f40424b;
                cVar.f40431r = false;
                cVar.d((Uri) this.f40425c);
                return;
            case 1:
                q0 q0Var = (q0) this.f40424b;
                q0Var.v = true;
                RectF f7 = q0Var.f();
                Object obj = q0Var.f40975a.f13385b;
                q0Var.f40993w = new a5.a((ByteBuffer) q0Var.h(q0Var.f(), true, false, false).f15119c, 0, f7);
                q0Var.a(false);
                ((x0) this.f40425c).run();
                return;
            case 2:
                Runnable runnable = (Runnable) this.f40425c;
                a1 a1Var = ((c1) this.f40424b).d;
                if (a1Var != null && a1Var.f40837f) {
                    a1.b(a1Var);
                    runnable.run();
                    return;
                }
                return;
            case 3:
                q9.p pVar = (q9.p) this.f40424b;
                pa.b bVar = (pa.b) this.f40425c;
                if (pVar.f41232b == q9.p.d) {
                    synchronized (pVar) {
                        aVar = pVar.f41231a;
                        pVar.f41231a = null;
                        pVar.f41232b = bVar;
                    }
                    aVar.j(bVar);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 4:
                a();
                return;
            case 5:
                a2 a2Var = (a2) this.f40425c;
                a2Var.m();
                ((p0) this.f40424b).r0(a2Var, true);
                return;
            case 6:
                ((a2) this.f40424b).s((Bitmap) this.f40425c);
                return;
            case 7:
                p2 p2Var = (p2) this.f40424b;
                p2Var.G = false;
                m2[] m2VarArr = (m2[]) ((ArrayList) this.f40425c).toArray(new m2[0]);
                p2Var.H = m2VarArr;
                if (m2VarArr.length > 0) {
                    p2Var.f41584b0.setScaleX(0.3f);
                    p2Var.f41584b0.setScaleY(0.3f);
                    p2Var.f41584b0.setAlpha(0.0f);
                    p2Var.f41584b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(qr.f27383f).start();
                    return;
                }
                return;
            case 8:
                CarResultStub.H0((Map.Entry) this.f40424b, this.f40425c);
                return;
            case 9:
                int i11 = JobInfoSchedulerService.f5951a;
                ((JobInfoSchedulerService) this.f40424b).jobFinished((JobParameters) this.f40425c, false);
                return;
            case 10:
                r9.a aVar2 = (r9.a) this.f40424b;
                Runnable runnable2 = (Runnable) this.f40425c;
                Process.setThreadPriority(aVar2.f42178c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 11:
                Callable callable = (Callable) this.f40424b;
                r9.h hVar = (r9.h) ((k2.u) this.f40425c).f13385b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e) {
                    hVar.l(e);
                    return;
                }
            case 12:
                j0 j0Var = (j0) this.f40424b;
                TLObject tLObject = (TLObject) this.f40425c;
                ArrayList arrayList = j0Var.f42345i0;
                ml0 ml0Var = j0Var.d;
                if (tLObject != null) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_messages_chats) tLObject).chats);
                    j0Var.I0 = false;
                    j0Var.J0.b(j0Var.f42349n0 + 4);
                    int i12 = 0;
                    while (true) {
                        if (i12 < ml0Var.getChildCount()) {
                            if (ml0Var.getChildAt(i12) instanceof i0) {
                                i10 = ml0Var.getChildAt(i12).getTop();
                            } else {
                                i12++;
                            }
                        } else {
                            i10 = 0;
                        }
                    }
                    j0Var.M1();
                    if (j0Var.f42348l0 >= 0 && i10 != 0) {
                        ((c0) ml0Var.getLayoutManager()).h1(j0Var.f42348l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList.size(), j0Var.M0.f2349b);
                j0Var.f42359x0.g(max, false);
                j0Var.f42359x0.setBagePosition(max / j0Var.M0.f2350c);
                h0 h0Var = j0Var.f42359x0;
                h0Var.H = true;
                h0Var.requestLayout();
                return;
            case 13:
                ((j0) this.f40424b).m1((f90) this.f40425c, true);
                return;
            case 14:
                z1 z1Var = (z1) this.f40424b;
                AndroidUtilities.runOnUIThread(new b(15, z1Var, FileLoader.getInstance(z1Var.f42600s).getPathToAttach((TLRPC.Document) this.f40425c)));
                return;
            case 15:
                z1 z1Var2 = (z1) this.f40424b;
                z1Var2.e = (File) this.f40425c;
                z1Var2.a();
                return;
            case 16:
                rf.b bVar2 = (rf.b) this.f40425c;
                if (((AtomicBoolean) ((com.google.android.gms.internal.cast.p) this.f40424b).e).compareAndSet(false, true)) {
                    bVar2.a(true);
                    return;
                }
                return;
            case 17:
                ((tg.x0) this.f40424b).run((ArrayList) this.f40425c);
                return;
            case 18:
                ((w) this.f40424b).run((TLRPC.TL_error) this.f40425c);
                return;
            case 19:
                ((oj0) this.f40424b).run((ArrayList) this.f40425c);
                return;
            case 20:
                Utilities.Callback callback = (Utilities.Callback) this.f40425c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.f40424b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.a2(callback, smallGroupsParticipantsCount, 1));
                    return;
                }
                return;
            case 21:
                oc M = vc.a0((bo) this.f40424b).M(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) ((TL_stars.TL_starsGiveawayOption) this.f40425c).stars)), R.raw.stars_send);
                M.f26705j = 5000;
                M.k(true);
                return;
            case 22:
                b0 b0Var = (b0) this.f40424b;
                b0Var.getClass();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostByChannelCreated, b0Var.f43116b0, Boolean.TRUE, (TL_stories.PrepaidGiveaway) this.f40425c);
                return;
            case 23:
                n1.P((n1) this.f40424b, (TLObject) this.f40425c);
                return;
            case 24:
                ((e2.h) this.f40424b).accept(this.f40425c);
                return;
            case 25:
                ((u0) this.f40424b).A((c3.b0) this.f40425c);
                return;
            case 26:
                uf.c cVar2 = (uf.c) this.f40424b;
                TLObject tLObject2 = (TLObject) this.f40425c;
                if (tLObject2 != null) {
                    if (tLObject2 instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar2.f(true);
                    } else if (tLObject2 instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject2;
                        ArrayList<TLRPC.Document> arrayList2 = tL_savedRingtones.ringtones;
                        ArrayList arrayList3 = cVar2.e;
                        if (!cVar2.f43726f) {
                            cVar2.f(false);
                            cVar2.f43726f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size) {
                            Object obj2 = arrayList3.get(i13);
                            i13++;
                            uf.b bVar3 = (uf.b) obj2;
                            if (bVar3.f43719b != null && (document = bVar3.f43718a) != null) {
                                hashMap.put(Long.valueOf(document.f18127id), bVar3.f43719b);
                            }
                        }
                        arrayList3.clear();
                        SharedPreferences d = cVar2.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList2.size());
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            TLRPC.Document document3 = arrayList2.get(i14);
                            String str = (String) hashMap.get(Long.valueOf(document3.f18127id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i14, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i14, str);
                            }
                            ?? obj3 = new Object();
                            obj3.f43718a = document3;
                            obj3.f43719b = str;
                            int i15 = cVar2.d;
                            cVar2.d = i15 + 1;
                            obj3.f43720c = i15;
                            arrayList3.add(obj3);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(cVar2.f43725c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar2.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        uf.c.f43721g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        uf.c.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    cVar2.b();
                    return;
                }
                return;
            case 27:
                uf.c cVar3 = (uf.c) this.f40424b;
                ArrayList arrayList4 = (ArrayList) this.f40425c;
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    uf.b bVar4 = (uf.b) arrayList4.get(i16);
                    if (bVar4 != null && ((TextUtils.isEmpty(bVar4.f43719b) || !new File(bVar4.f43719b).exists()) && (document2 = bVar4.f43718a) != null && ((pathToAttach = FileLoader.getInstance(cVar3.f43725c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new b(28, cVar3, document2));
                    }
                }
                return;
            case 28:
                TLRPC.Document document4 = (TLRPC.Document) this.f40425c;
                FileLoader.getInstance(((uf.c) this.f40424b).f43725c).loadFile(document4, document4, 0, 0);
                return;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f40425c;
                int i17 = ((uf.d) this.f40424b).f43727a;
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
        }
    }
}
