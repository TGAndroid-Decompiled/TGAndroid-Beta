package org.telegram.ui.web;

import android.app.job.JobParameters;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
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
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.x51;
public final class g1 implements Runnable {
    public final int f42122a;
    public final Object f42123b;
    public final Object f42124c;

    public g1(int i10, Object obj, Object obj2) {
        this.f42122a = i10;
        this.f42123b = obj;
        this.f42124c = obj2;
    }

    private final void a() {
        q9.o oVar = (q9.o) this.f42123b;
        pa.b bVar = (pa.b) this.f42124c;
        synchronized (oVar) {
            try {
                if (oVar.f44267b == null) {
                    oVar.f44266a.add(bVar);
                } else {
                    oVar.f44267b.add(bVar.get());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        b bVar;
        pa.a aVar;
        int i10;
        TLRPC.Document document;
        TLRPC.Document document2;
        File pathToAttach;
        float f7 = 1.0f;
        boolean z10 = true;
        switch (this.f42122a) {
            case 0:
                i1 i1Var = ((h1) this.f42123b).h;
                ArrayList arrayList = i1Var.f42150f;
                arrayList.clear();
                arrayList.addAll((ArrayList) this.f42124c);
                i1Var.h = false;
                x51 x51Var = i1Var.f32876a;
                if (x51Var != null) {
                    x51Var.Y2.N(true);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f42123b;
                if (((h2) this.f42124c).b() == null) {
                    z10 = false;
                }
                f1Var.setEnabled(z10);
                ViewPropertyAnimator animate = f1Var.animate();
                if (!f1Var.isEnabled()) {
                    f7 = 0.5f;
                }
                animate.alpha(f7);
                return;
            case 2:
                ((org.telegram.ui.k0) this.f42123b).f42311f0.run((Integer) this.f42124c);
                return;
            case 3:
                a2 a2Var = (a2) this.f42123b;
                a2Var.getMessagesController().removeWebBrowserException((String) this.f42124c);
                a2Var.f32876a.Y2.N(true);
                return;
            case 4:
                h2 h2Var = (h2) this.f42123b;
                TLObject tLObject = (TLObject) this.f42124c;
                int i11 = h2Var.f42129a;
                h2Var.f42134g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i11).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i11).putChats(tL_messages_webPage.chats, false);
                    h2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            h2Var.h = tL_webPage;
                        }
                    }
                    h2Var.h = null;
                }
                TLRPC.WebPage webPage = h2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    h2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && h2Var.h != null && (bVar = h2Var.f42138l) != null) {
                    bVar.run();
                }
                h2Var.c();
                return;
            case 5:
                ((h2) this.f42123b).f42139m.remove((g1) this.f42124c);
                return;
            case 6:
                p2.b bVar2 = (p2.b) this.f42123b;
                bVar2.f43674r = false;
                bVar2.d((Uri) this.f42124c);
                return;
            case 7:
                q9.p pVar = (q9.p) this.f42123b;
                pa.b bVar3 = (pa.b) this.f42124c;
                if (pVar.f44270b == q9.p.d) {
                    synchronized (pVar) {
                        aVar = pVar.f44269a;
                        pVar.f44269a = null;
                        pVar.f44270b = bVar3;
                    }
                    aVar.h(bVar3);
                    return;
                }
                throw new IllegalStateException("provide() can be called only once.");
            case 8:
                a();
                return;
            case 9:
                qg.q0 q0Var = (qg.q0) this.f42123b;
                q0Var.v = true;
                RectF f10 = q0Var.f();
                Object obj = q0Var.f44546a.f14247b;
                q0Var.f44565w = new a5.a((ByteBuffer) q0Var.h(q0Var.f(), true, false, false).f16797c, 0, f10);
                q0Var.a(false);
                ((qg.x0) this.f42124c).run();
                return;
            case 10:
                Runnable runnable = (Runnable) this.f42124c;
                qg.a1 a1Var = ((qg.c1) this.f42123b).d;
                if (a1Var != null && a1Var.f44400f) {
                    qg.a1.b(a1Var);
                    runnable.run();
                    return;
                }
                return;
            case 11:
                CarResultStub.H0((Map.Entry) this.f42123b, this.f42124c);
                return;
            case 12:
                int i12 = JobInfoSchedulerService.f4895a;
                ((JobInfoSchedulerService) this.f42123b).jobFinished((JobParameters) this.f42124c, false);
                return;
            case 13:
                r9.a aVar2 = (r9.a) this.f42123b;
                Runnable runnable2 = (Runnable) this.f42124c;
                Process.setThreadPriority(aVar2.f45062c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 14:
                Callable callable = (Callable) this.f42123b;
                r9.h hVar = (r9.h) ((l.d) this.f42124c).f15098b;
                try {
                    hVar.k(callable.call());
                    return;
                } catch (Exception e7) {
                    hVar.l(e7);
                    return;
                }
            case 15:
                rg.z1 z1Var = (rg.z1) this.f42124c;
                z1Var.m();
                ((rg.o0) this.f42123b).r0(z1Var, true);
                return;
            case 16:
                ((rg.z1) this.f42123b).s((Bitmap) this.f42124c);
                return;
            case 17:
                rg.o2 o2Var = (rg.o2) this.f42123b;
                o2Var.G = false;
                rg.l2[] l2VarArr = (rg.l2[]) ((ArrayList) this.f42124c).toArray(new rg.l2[0]);
                o2Var.H = l2VarArr;
                if (l2VarArr.length > 0) {
                    o2Var.f45408b0.setScaleX(0.3f);
                    o2Var.f45408b0.setScaleY(0.3f);
                    o2Var.f45408b0.setAlpha(0.0f);
                    o2Var.f45408b0.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(pr.f29493f).start();
                    return;
                }
                return;
            case 18:
                sg.k0 k0Var = (sg.k0) this.f42123b;
                TLObject tLObject2 = (TLObject) this.f42124c;
                ArrayList arrayList2 = k0Var.f46166i0;
                ll0 ll0Var = k0Var.d;
                if (tLObject2 != null) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_messages_chats) tLObject2).chats);
                    k0Var.I0 = false;
                    k0Var.J0.b(k0Var.f46170n0 + 4);
                    int i13 = 0;
                    while (true) {
                        if (i13 < ll0Var.getChildCount()) {
                            if (ll0Var.getChildAt(i13) instanceof sg.j0) {
                                i10 = ll0Var.getChildAt(i13).getTop();
                            } else {
                                i13++;
                            }
                        } else {
                            i10 = 0;
                        }
                    }
                    k0Var.M1();
                    if (k0Var.f46169l0 >= 0 && i10 != 0) {
                        ((s4.c0) ll0Var.getLayoutManager()).h1(k0Var.f46169l0 + 1, i10);
                    }
                }
                int max = Math.max(arrayList2.size(), k0Var.M0.f1375b);
                k0Var.f46180x0.g(max, false);
                k0Var.f46180x0.setBagePosition(max / k0Var.M0.f1376c);
                sg.i0 i0Var = k0Var.f46180x0;
                i0Var.H = true;
                i0Var.requestLayout();
                return;
            case 19:
                ((sg.k0) this.f42123b).m1((g90) this.f42124c, true);
                return;
            case 20:
                sg.c2 c2Var = (sg.c2) this.f42123b;
                AndroidUtilities.runOnUIThread(new g1(21, c2Var, FileLoader.getInstance(c2Var.f46081s).getPathToAttach((TLRPC.Document) this.f42124c)));
                return;
            case 21:
                sg.c2 c2Var2 = (sg.c2) this.f42123b;
                c2Var2.f46077e = (File) this.f42124c;
                c2Var2.a();
                return;
            case 22:
                sf.b bVar4 = (sf.b) this.f42124c;
                if (((AtomicBoolean) ((com.google.android.gms.internal.cast.p) this.f42123b).f5451e).compareAndSet(false, true)) {
                    bVar4.a(true);
                    return;
                }
                return;
            case 23:
                ((e2.h) this.f42123b).accept(this.f42124c);
                return;
            case 24:
                ((u2.u0) this.f42123b).B((c3.b0) this.f42124c);
                return;
            case 25:
                uf.c cVar = (uf.c) this.f42123b;
                TLObject tLObject3 = (TLObject) this.f42124c;
                if (tLObject3 != null) {
                    if (tLObject3 instanceof TL_account.TL_savedRingtonesNotModified) {
                        cVar.f(true);
                    } else if (tLObject3 instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject3;
                        ArrayList<TLRPC.Document> arrayList3 = tL_savedRingtones.ringtones;
                        ArrayList arrayList4 = cVar.f47061e;
                        if (!cVar.f47062f) {
                            cVar.f(false);
                            cVar.f47062f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size = arrayList4.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj2 = arrayList4.get(i14);
                            i14++;
                            uf.b bVar5 = (uf.b) obj2;
                            if (bVar5.f47054b != null && (document = bVar5.f47053a) != null) {
                                hashMap.put(Long.valueOf(document.f19902id), bVar5.f47054b);
                            }
                        }
                        arrayList4.clear();
                        SharedPreferences d = cVar.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList3.size());
                        for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                            TLRPC.Document document3 = arrayList3.get(i15);
                            String str = (String) hashMap.get(Long.valueOf(document3.f19902id));
                            SerializedData serializedData = new SerializedData(document3.getObjectSize());
                            document3.serializeToStream(serializedData);
                            edit.putString("tone_document" + i15, Utilities.bytesToHex(serializedData.toByteArray()));
                            if (str != null) {
                                edit.putString("tone_local_path" + i15, str);
                            }
                            ?? obj3 = new Object();
                            obj3.f47053a = document3;
                            obj3.f47054b = str;
                            int i16 = cVar.d;
                            cVar.d = i16 + 1;
                            obj3.f47055c = i16;
                            arrayList4.add(obj3);
                        }
                        edit.apply();
                        NotificationCenter.getInstance(cVar.f47060c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.onUserRingtonesUpdated, new Object[0]);
                        SharedPreferences.Editor edit2 = cVar.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        uf.c.f47056g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        uf.c.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    cVar.b();
                    return;
                }
                return;
            case 26:
                uf.c cVar2 = (uf.c) this.f42123b;
                ArrayList arrayList5 = (ArrayList) this.f42124c;
                for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                    uf.b bVar6 = (uf.b) arrayList5.get(i17);
                    if (bVar6 != null && ((TextUtils.isEmpty(bVar6.f47054b) || !new File(bVar6.f47054b).exists()) && (document2 = bVar6.f47053a) != null && ((pathToAttach = FileLoader.getInstance(cVar2.f47060c).getPathToAttach(document2)) == null || !pathToAttach.exists()))) {
                        AndroidUtilities.runOnUIThread(new g1(27, cVar2, document2));
                    }
                }
                return;
            case 27:
                TLRPC.Document document4 = (TLRPC.Document) this.f42124c;
                FileLoader.getInstance(((uf.c) this.f42123b).f47060c).loadFile(document4, document4, 0, 0);
                return;
            case 28:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f42124c;
                int i18 = ((uf.d) this.f42123b).f47063a;
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
                ((ug.x0) this.f42123b).run((ArrayList) this.f42124c);
                return;
        }
    }
}
