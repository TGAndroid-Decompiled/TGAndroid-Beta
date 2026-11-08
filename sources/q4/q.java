package q4;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import f6.e0;
import g6.d0;
import h9.f1;
import h9.t1;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileWriter;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import l.a0;
import org.json.JSONObject;
import r0.i0;
import r0.k1;
import r0.l0;
import s4.s0;
import zd.b0;
public final class q implements SuccessContinuation, r0.m, ce.c, OnCompleteListener, lf.b, f5.y, com.google.android.gms.common.api.internal.p, ib.b, g9.k, i6.a {
    public final int f53803a;
    public Object f53804b;
    public Object f53805c;

    public q(int i7, Object obj, Object obj2) {
        this.f53803a = i7;
        this.f53805c = obj;
        this.f53804b = obj2;
    }

    @Override
    public java.lang.Object B(ce.d r7, kd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: q4.q.B(ce.d, kd.c):java.lang.Object");
    }

    @Override
    public k1 S0(View view, k1 k1Var) {
        c5.k kVar = (c5.k) this.f53805c;
        k1 g10 = i0.g(view, k1Var);
        if (g10.f54202a.n()) {
            return g10;
        }
        Rect rect = (Rect) this.f53804b;
        rect.left = g10.b();
        rect.top = g10.d();
        rect.right = g10.c();
        rect.bottom = g10.a();
        int childCount = kVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            k1 b10 = i0.b(kVar.getChildAt(i7), g10);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return g10.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    public f5.d a() {
        if (((f5.l) this.f53804b) != null) {
            return new f5.d(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z9;
        e0 e0Var = (e0) this.f53804b;
        String str = (String) this.f53805c;
        j6.w wVar = (j6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (e0Var.G == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        q6.m.i("Not connected to device", z9);
        j6.f fVar = (j6.f) wVar.n();
        Parcel p12 = fVar.p1();
        p12.writeString(str);
        fVar.u1(p12, 5);
        synchronized (e0Var.f11258t) {
            try {
                if (e0Var.f11255q != null) {
                    taskCompletionSource.setException(q6.m.l(new Status(2001, null, null, null)));
                } else {
                    e0Var.f11255q = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public Object apply(Object obj) {
        return ((g9.k) ((d0) this.f53804b).f13555b).apply(obj);
    }

    @Override
    public lf.a b(wf.b bVar) {
        int i7;
        List list = (List) this.f53805c;
        List list2 = (List) bVar.f57655b;
        if (list2 != null) {
            i7 = list2.size();
        } else {
            i7 = 0;
        }
        if (i7 > 0) {
            ArrayList arrayList = new ArrayList(list.size() + i7);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new ed.i(bVar, (List) this.f53804b, list);
    }

    public void c(k.a aVar) {
        ui.e eVar = (ui.e) this.f53804b;
        ((ActionMode.Callback) eVar.f56931b).onDestroyActionMode(eVar.r(aVar));
        g.s sVar = (g.s) this.f53805c;
        if (sVar.E != null) {
            sVar.f13362f.getDecorView().removeCallbacks(sVar.F);
        }
        if (sVar.D != null) {
            l0 l0Var = sVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            l0 a10 = i0.a(sVar.D);
            a10.a(0.0f);
            sVar.G = a10;
            a10.d(new g.j(this, 2));
        }
        sVar.f13378y = null;
        ViewGroup viewGroup = sVar.J;
        WeakHashMap weakHashMap = i0.f54191a;
        r0.y.c(viewGroup);
        sVar.w();
    }

    public boolean d(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.s) this.f53805c).J;
        WeakHashMap weakHashMap = i0.f54191a;
        r0.y.c(viewGroup);
        ui.e eVar = (ui.e) this.f53804b;
        ActionMode.Callback callback = (ActionMode.Callback) eVar.f56931b;
        k.e r10 = eVar.r(aVar);
        a0.l lVar = (a0.l) eVar.f56933e;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) eVar.f56932c, (l.k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(r10, menu2);
    }

    public void e(android.support.v4.media.session.s sVar, Handler handler) {
        l lVar = (l) this.f53804b;
        synchronized (lVar.d) {
            lVar.f53795l = sVar;
            lVar.f53786a.setCallback((android.support.v4.media.session.r) sVar.f1789e, handler);
            sVar.d0(lVar, handler);
        }
    }

    public void f(w wVar) {
        l lVar = (l) this.f53804b;
        lVar.f53791g = wVar;
        synchronized (lVar.d) {
            for (int beginBroadcast = lVar.f53790f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) lVar.f53790f.getBroadcastItem(beginBroadcast)).S0(wVar);
                } catch (RemoteException | SecurityException e10) {
                    h2.a.d("MediaSessionCompat", "Dead object in setPlaybackState.", e10);
                }
            }
            lVar.f53790f.finishBroadcast();
        }
        MediaSession mediaSession = lVar.f53786a;
        if (wVar.f53825x == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(wVar.f53816a, wVar.f53817b, wVar.d, wVar.f53821n);
            builder.setBufferedPosition(wVar.f53818c);
            builder.setActions(wVar.f53819e);
            builder.setErrorMessage(wVar.h);
            for (v vVar : wVar.f53822r) {
                vVar.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(vVar.f53813a, vVar.f53814b, vVar.f53815c);
                builder2.setExtras(vVar.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(wVar.f53823s);
            builder.setExtras(wVar.f53824w);
            wVar.f53825x = builder.build();
        }
        mediaSession.setPlaybackState(wVar.f53825x);
    }

    public void g(f5.l lVar) {
        this.f53804b = lVar;
        if (lVar.a() != null) {
            lVar.a().getClass();
            String str = lVar.a().d;
            if (str != null) {
                this.f53805c = str;
            }
        }
    }

    @Override
    public Object mo24get() {
        Context appContext = (Context) ((d9.o) this.f53804b).f8253a;
        id.h blockingDispatcher = (id.h) ((ib.c) this.f53805c).mo24get();
        kotlin.jvm.internal.j.e(appContext, "appContext");
        kotlin.jvm.internal.j.e(blockingDispatcher, "blockingDispatcher");
        return gb.r.a(jb.j.f16627a, new f1(new gb.p(0), 15), b0.b(blockingDispatcher), new gb.q(appContext, 0));
    }

    public void h(g3 g3Var) {
        try {
            o(g3Var, (p3) this.f53804b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void i(g3 g3Var, int i7, long j3) {
        try {
            o3 o3Var = (o3) ((p3) this.f53804b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7469b, i7);
            p3 p3Var = (p3) o3Var.a();
            this.f53804b = p3Var;
            if (j3 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.f7469b, j3);
                p3Var = (p3) o3Var2.a();
            }
            o(g3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void j(g3 g3Var, long j3, boolean z9) {
        p3 p3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.f7469b, z9);
            f3Var.c();
            g3.r((g3) f3Var.f7469b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.f53804b;
            } else {
                o3 o3Var = (o3) ((p3) this.f53804b).g();
                o3Var.c();
                p3.r((p3) o3Var.f7469b, j3);
                p3Var = (p3) o3Var.a();
            }
            o(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void k(g3 g3Var, int i7, long j3, boolean z9) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.f53804b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7469b, i7);
            this.f53804b = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.f7469b, z9);
            f3Var.c();
            g3.r((g3) f3Var.f7469b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.f53804b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.f53804b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.f7469b, j3);
                p3Var = (p3) o3Var2.a();
            }
            o(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void l(l3 l3Var) {
        try {
            w3 t6 = x3.t();
            t6.d((p3) this.f53804b);
            t6.c();
            x3.p((x3) t6.f7469b, l3Var);
            ((ca.i) this.f53805c).m((x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void m(a4 a4Var) {
        try {
            w3 t6 = x3.t();
            t6.d((p3) this.f53804b);
            t6.c();
            x3.r((x3) t6.f7469b, a4Var);
            ((ca.i) this.f53805c).m((x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void n(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t6 = x3.t();
            t6.d((p3) this.f53804b);
            t6.c();
            x3.s((x3) t6.f7469b, b4Var);
            ((ca.i) this.f53805c).m((x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void o(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            w3 t6 = x3.t();
            t6.d(p3Var);
            t6.c();
            x3.n((x3) t6.f7469b, g3Var);
            ((ca.i) this.f53805c).m((x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void onComplete(Task task) {
        d9.c cVar = (d9.c) this.f53804b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f53805c;
        synchronized (cVar.f8225f) {
            cVar.f8224e.remove(taskCompletionSource);
        }
    }

    @Override
    public void p(Bitmap bitmap) {
        wf.b bVar = (wf.b) this.f53804b;
        bVar.f57656c = bitmap;
        i6.f fVar = (i6.f) this.f53805c;
        fVar.f15368l = bVar;
        fVar.b();
    }

    public void q(i3 i3Var, p3 p3Var) {
        try {
            w3 t6 = x3.t();
            t6.d(p3Var);
            t6.c();
            x3.o((x3) t6.f7469b, i3Var);
            ((ca.i) this.f53805c).m((x3) t6.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public Task then(Object obj) {
        FileWriter fileWriter;
        switch (this.f53803a) {
            case 3:
                Boolean bool = (Boolean) obj;
                aa.q qVar = (aa.q) this.f53805c;
                if (!bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    for (File file : ga.d.i(((File) qVar.f839g.d).listFiles(aa.q.f832r))) {
                        file.delete();
                    }
                    ga.d dVar = qVar.f844m.f805b.f13612b;
                    ga.b.b(ga.d.i(((File) dVar.f13619f).listFiles()));
                    ga.b.b(ga.d.i(((File) dVar.h).listFiles()));
                    ga.b.b(ga.d.i(((File) dVar.f13620n).listFiles()));
                    qVar.f848q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue = bool.booleanValue();
                aa.x xVar = qVar.f835b;
                if (booleanValue) {
                    xVar.h.trySetResult(null);
                    return ((Task) this.f53804b).onSuccessTask(qVar.f837e.f3135a, new d6.i(this, 2));
                }
                xVar.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            default:
                Void r10 = (Void) obj;
                ia.c cVar = (ia.c) this.f53805c;
                JSONObject jSONObject = (JSONObject) ((ba.e) this.f53804b).f3137c.f3132a.submit(new aa.t(this, 2)).get();
                FileWriter fileWriter2 = null;
                if (jSONObject != null) {
                    ia.b y10 = ((gf.g) cVar.f15420c).y(jSONObject);
                    f1 f1Var = (f1) cVar.f15421e;
                    long j3 = y10.f15415c;
                    f1Var.getClass();
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
                    }
                    try {
                        jSONObject.put("expires_at", j3);
                        fileWriter = new FileWriter((File) f1Var.f14323b);
                        try {
                            try {
                                fileWriter.write(jSONObject.toString());
                                fileWriter.flush();
                            } catch (Throwable th2) {
                                th = th2;
                                fileWriter2 = fileWriter;
                                aa.g.b(fileWriter2, "Failed to close settings writer.");
                                throw th;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                            aa.g.b(fileWriter, "Failed to close settings writer.");
                            ia.c.d("Loaded settings: ", jSONObject);
                            SharedPreferences.Editor edit = ((Context) cVar.f15418a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                            edit.putString("existing_instance_identifier", (String) ((ia.e) cVar.f15419b).f15430f);
                            edit.apply();
                            ((AtomicReference) cVar.h).set(y10);
                            ((TaskCompletionSource) ((AtomicReference) cVar.f15424i).get()).trySetResult(y10);
                            return Tasks.forResult(null);
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fileWriter = null;
                    } catch (Throwable th3) {
                        th = th3;
                        aa.g.b(fileWriter2, "Failed to close settings writer.");
                        throw th;
                    }
                    aa.g.b(fileWriter, "Failed to close settings writer.");
                    ia.c.d("Loaded settings: ", jSONObject);
                    SharedPreferences.Editor edit2 = ((Context) cVar.f15418a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    edit2.putString("existing_instance_identifier", (String) ((ia.e) cVar.f15419b).f15430f);
                    edit2.apply();
                    ((AtomicReference) cVar.h).set(y10);
                    ((TaskCompletionSource) ((AtomicReference) cVar.f15424i).get()).trySetResult(y10);
                }
                return Tasks.forResult(null);
        }
    }

    public q(int i7, boolean z9) {
        this.f53803a = i7;
    }

    public q(Context context) {
        this.f53803a = 14;
        this.f53804b = context;
    }

    public q(Object obj, Object obj2, boolean z9, int i7) {
        this.f53803a = i7;
        this.f53804b = obj;
        this.f53805c = obj2;
    }

    public q(Context context, p3 p3Var) {
        this.f53803a = 21;
        ca.i iVar = new ca.i(2);
        try {
            o5.s.b(context);
            iVar.f6016c = o5.s.a().c(m5.a.f19872e).a("PLAY_BILLING_LIBRARY", new l5.c("proto"), new w7.s(8, false));
        } catch (Throwable unused) {
            iVar.f6015b = true;
        }
        this.f53805c = iVar;
        this.f53804b = p3Var;
    }

    public q(int i7) {
        this.f53803a = i7;
        switch (i7) {
            case 15:
                this.f53804b = new ConcurrentHashMap(16, 0.75f, 10);
                this.f53805c = new ReferenceQueue();
                return;
            default:
                this.f53804b = new AtomicInteger();
                this.f53805c = new AtomicInteger();
                return;
        }
    }

    public q(Animation animation) {
        this.f53803a = 7;
        this.f53804b = animation;
        this.f53805c = null;
    }

    public q(Animator animator) {
        this.f53803a = 7;
        this.f53804b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f53805c = animatorSet;
        animatorSet.play(animator);
    }

    public q(ArrayList arrayList, ArrayList arrayList2) {
        this.f53803a = 25;
        int size = arrayList.size();
        this.f53804b = new int[size];
        this.f53805c = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            ((int[]) this.f53804b)[i7] = ((Integer) arrayList.get(i7)).intValue();
            ((float[]) this.f53805c)[i7] = ((Float) arrayList2.get(i7)).floatValue();
        }
    }

    public q(int i7, int i10) {
        this.f53803a = 25;
        this.f53804b = new int[]{i7, i10};
        this.f53805c = new float[]{0.0f, 1.0f};
    }

    public q(int i7, int i10, int i11) {
        this.f53803a = 25;
        this.f53804b = new int[]{i7, i10, i11};
        this.f53805c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public q(d3.e eVar) {
        this.f53803a = 16;
        this.f53805c = eVar;
    }

    public q(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f53803a = 0;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i7 = s0.f54892b;
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                    componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else {
                    if (queryBroadcastReceivers.size() > 1) {
                        h2.a.l("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                    }
                    componentName = null;
                }
                if (componentName == null) {
                    h2.a.g("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 29) {
                this.f53804b = new l(context, str, bundle);
            } else if (i10 >= 28) {
                this.f53804b = new l(context, str, bundle);
            } else {
                this.f53804b = new l(context, str, bundle);
            }
            Looper myLooper = Looper.myLooper();
            e(new android.support.v4.media.session.s(1), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            ((l) this.f53804b).f53786a.setMediaButtonReceiver(pendingIntent);
            p pVar = ((l) this.f53804b).f53788c;
            ?? obj = new Object();
            DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                obj.f53812a = new f(context, pVar);
            } else {
                obj.f53812a = new f(context, pVar);
            }
            this.f53805c = obj;
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    public q(t1 t1Var, int[] iArr) {
        this.f53803a = 27;
        this.f53804b = h9.i0.q(t1Var);
        this.f53805c = iArr;
    }

    public q(c5.k kVar) {
        this.f53803a = 9;
        this.f53805c = kVar;
        this.f53804b = new Rect();
    }
}
