package q4;

import ab.c0;
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
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import gb.h1;
import gb.i1;
import gb.u0;
import h9.g1;
import h9.t1;
import hi.u5;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileWriter;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import l.a0;
import org.json.JSONObject;
import r0.i0;
import r0.l0;
import r0.l1;
import s4.t0;
public final class q implements SuccessContinuation, r0.m, ce.c, OnCompleteListener, ib.b, g9.k, i6.a, j6.n {
    public final int f55835a;
    public Object f55836b;
    public Object f55837c;

    public q(int i7, Object obj, Object obj2) {
        this.f55835a = i7;
        this.f55837c = obj;
        this.f55836b = obj2;
    }

    public static String h(q qVar) {
        Collection<String> collection = (Collection) qVar.f55837c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) qVar.f55836b;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (upperCase.matches("[A-F0-9]+")) {
                sb2.append("/");
                sb2.append(upperCase);
            } else {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
        }
        if (collection != null) {
            if (!collection.isEmpty()) {
                if (str == null) {
                    sb2.append("/");
                }
                sb2.append("/");
                boolean z10 = true;
                for (String str2 : collection) {
                    j6.a.b(str2);
                    if (!z10) {
                        sb2.append(",");
                    }
                    if (!j6.a.f17233a.matcher(str2).matches()) {
                        StringBuilder sb3 = new StringBuilder(str2.length());
                        for (int i7 = 0; i7 < str2.length(); i7++) {
                            char charAt = str2.charAt(i7);
                            if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '_' && charAt != '-' && charAt != '.' && charAt != ':'))) {
                                sb3.append(String.format("%%%04x", Integer.valueOf(charAt)));
                            } else {
                                sb3.append(charAt);
                            }
                        }
                        str2 = sb3.toString();
                    }
                    sb2.append(str2);
                    z10 = false;
                }
            } else {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
        }
        if (str == null && collection == null) {
            sb2.append("/");
        }
        if (collection == null) {
            sb2.append("/");
        }
        sb2.append("//ALLOW_IPV6");
        return sb2.toString();
    }

    @Override
    public l1 P0(View view, l1 l1Var) {
        c5.l lVar = (c5.l) this.f55837c;
        l1 g10 = i0.g(view, l1Var);
        if (g10.f56268a.n()) {
            return g10;
        }
        Rect rect = (Rect) this.f55836b;
        rect.left = g10.b();
        rect.top = g10.d();
        rect.right = g10.c();
        rect.bottom = g10.a();
        int childCount = lVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            l1 b10 = i0.b(lVar.getChildAt(i7), g10);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return g10.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    public f3.o a(Object... objArr) {
        Constructor b10;
        synchronized (((AtomicBoolean) this.f55837c)) {
            if (!((AtomicBoolean) this.f55837c).get()) {
                try {
                    b10 = ((ci.v) this.f55836b).b();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f55837c).set(true);
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            b10 = null;
        }
        if (b10 == null) {
            return null;
        }
        try {
            return (f3.o) b10.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    @Override
    public Object apply(Object obj) {
        return ((g9.k) ((g1) this.f55836b).f13993b).apply(obj);
    }

    public synchronized Map b() {
        try {
            if (((Map) this.f55837c) == null) {
                this.f55837c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f55836b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f55837c;
    }

    public void c(k.a aVar) {
        c0 c0Var = (c0) this.f55836b;
        ((ActionMode.Callback) c0Var.f908b).onDestroyActionMode(c0Var.m(aVar));
        g.s sVar = (g.s) this.f55837c;
        if (sVar.F != null) {
            sVar.f13021f.getDecorView().removeCallbacks(sVar.G);
        }
        if (sVar.E != null) {
            l0 l0Var = sVar.H;
            if (l0Var != null) {
                l0Var.b();
            }
            l0 a10 = i0.a(sVar.E);
            a10.a(0.0f);
            sVar.H = a10;
            a10.d(new g.j(this, 2));
        }
        sVar.f13038y = null;
        ViewGroup viewGroup = sVar.K;
        WeakHashMap weakHashMap = i0.f56254a;
        r0.y.c(viewGroup);
        sVar.y();
    }

    public boolean d(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.s) this.f55837c).K;
        WeakHashMap weakHashMap = i0.f56254a;
        r0.y.c(viewGroup);
        c0 c0Var = (c0) this.f55836b;
        ActionMode.Callback callback = (ActionMode.Callback) c0Var.f908b;
        k.e m10 = c0Var.m(aVar);
        a0.l lVar = (a0.l) c0Var.f910e;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) c0Var.f909c, (l.k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(m10, menu2);
    }

    public void e(android.support.v4.media.session.s sVar, Handler handler) {
        l lVar = (l) this.f55836b;
        synchronized (lVar.d) {
            lVar.f55827l = sVar;
            lVar.f55818a.setCallback((android.support.v4.media.session.r) sVar.f1701e, handler);
            sVar.d0(lVar, handler);
        }
    }

    public void f(w wVar) {
        l lVar = (l) this.f55836b;
        lVar.f55823g = wVar;
        synchronized (lVar.d) {
            for (int beginBroadcast = lVar.f55822f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) lVar.f55822f.getBroadcastItem(beginBroadcast)).T0(wVar);
                } catch (RemoteException | SecurityException e10) {
                    h2.a.d("MediaSessionCompat", "Dead object in setPlaybackState.", e10);
                }
            }
            lVar.f55822f.finishBroadcast();
        }
        MediaSession mediaSession = lVar.f55818a;
        if (wVar.f55857x == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(wVar.f55848a, wVar.f55849b, wVar.d, wVar.f55853n);
            builder.setBufferedPosition(wVar.f55850c);
            builder.setActions(wVar.f55851e);
            builder.setErrorMessage(wVar.h);
            for (v vVar : wVar.f55854r) {
                vVar.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(vVar.f55845a, vVar.f55846b, vVar.f55847c);
                builder2.setExtras(vVar.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(wVar.f55855s);
            builder.setExtras(wVar.f55856w);
            wVar.f55857x = builder.build();
        }
        mediaSession.setPlaybackState(wVar.f55857x);
    }

    @Override
    public void g(String str, long j3, long j10, long j11) {
        j6.n nVar = (j6.n) this.f55836b;
        if (nVar != null) {
            nVar.g(str, j3, j10, j11);
        }
    }

    @Override
    public Object mo24get() {
        return new u0((h1) ((ib.c) this.f55836b).mo24get(), (i1) ((ib.c) this.f55837c).mo24get());
    }

    @Override
    public void j(String str, long j3, int i7, Object obj, long j10, long j11) {
        int i10;
        j6.m mVar = (j6.m) this.f55837c;
        if (((j6.n) this.f55836b) != null) {
            if (i7 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.f17248i)};
                j6.b bVar = mVar.f17270a;
                Log.w(bVar.f17235a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((h6.h) mVar.h.f7873b).f13920i.iterator();
                while (it.hasNext()) {
                    ((h6.g) it.next()).o();
                }
                i10 = 2001;
            } else {
                i10 = i7;
            }
            ((j6.n) this.f55836b).j(str, j3, i10, obj, j10, j11);
        }
    }

    @Override
    public void onComplete(Task task) {
        d9.c cVar = (d9.c) this.f55836b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f55837c;
        synchronized (cVar.f7889f) {
            cVar.f7888e.remove(taskCompletionSource);
        }
    }

    @Override
    public Task then(Object obj) {
        FileWriter fileWriter;
        switch (this.f55835a) {
            case 3:
                Boolean bool = (Boolean) obj;
                aa.p pVar = (aa.p) this.f55837c;
                if (!bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                    }
                    for (File file : ga.d.i(((File) pVar.f835g.d).listFiles(aa.p.f828r))) {
                        file.delete();
                    }
                    ga.d dVar = pVar.f840m.f800b.f13268b;
                    ga.b.b(ga.d.i(((File) dVar.f13275f).listFiles()));
                    ga.b.b(ga.d.i(((File) dVar.h).listFiles()));
                    ga.b.b(ga.d.i(((File) dVar.f13276n).listFiles()));
                    pVar.f844q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue = bool.booleanValue();
                aa.w wVar = pVar.f831b;
                if (booleanValue) {
                    wVar.h.trySetResult(null);
                    return ((Task) this.f55836b).onSuccessTask(pVar.f833e.f3058a, new d6.i(this, 1));
                }
                wVar.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            default:
                Void r10 = (Void) obj;
                ia.c cVar = (ia.c) this.f55837c;
                JSONObject jSONObject = (JSONObject) ((ba.e) this.f55836b).f3060c.f3055a.submit(new aa.s(this, 2)).get();
                FileWriter fileWriter2 = null;
                if (jSONObject != null) {
                    ia.b s5 = ((u5) cVar.f16184c).s(jSONObject);
                    g1 g1Var = (g1) cVar.f16185e;
                    long j3 = s5.f16179c;
                    g1Var.getClass();
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
                    }
                    try {
                        jSONObject.put("expires_at", j3);
                        fileWriter = new FileWriter((File) g1Var.f13993b);
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
                            SharedPreferences.Editor edit = ((Context) cVar.f16182a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                            edit.putString("existing_instance_identifier", (String) ((ia.e) cVar.f16183b).f16194f);
                            edit.apply();
                            ((AtomicReference) cVar.h).set(s5);
                            ((TaskCompletionSource) ((AtomicReference) cVar.f16188i).get()).trySetResult(s5);
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
                    SharedPreferences.Editor edit2 = ((Context) cVar.f16182a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    edit2.putString("existing_instance_identifier", (String) ((ia.e) cVar.f16183b).f16194f);
                    edit2.apply();
                    ((AtomicReference) cVar.h).set(s5);
                    ((TaskCompletionSource) ((AtomicReference) cVar.f16188i).get()).trySetResult(s5);
                }
                return Tasks.forResult(null);
        }
    }

    @Override
    public java.lang.Object v(ce.d r7, kd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: q4.q.v(ce.d, kd.c):java.lang.Object");
    }

    @Override
    public void v0(Bitmap bitmap) {
        wf.b bVar = (wf.b) this.f55836b;
        bVar.f59681c = bitmap;
        i6.f fVar = (i6.f) this.f55837c;
        fVar.f16132l = bVar;
        fVar.b();
    }

    public q(int i7, boolean z10) {
        this.f55835a = i7;
    }

    public q(Context context) {
        this.f55835a = 14;
        this.f55836b = context;
    }

    public q(Object obj, Object obj2, boolean z10, int i7) {
        this.f55835a = i7;
        this.f55836b = obj;
        this.f55837c = obj2;
    }

    public q(int i7) {
        this.f55835a = i7;
        switch (i7) {
            case 15:
                this.f55836b = new ConcurrentHashMap(16, 0.75f, 10);
                this.f55837c = new ReferenceQueue();
                return;
            case 28:
                this.f55836b = new HashMap();
                return;
            default:
                this.f55836b = new AtomicInteger();
                this.f55837c = new AtomicInteger();
                return;
        }
    }

    public q(Animation animation) {
        this.f55835a = 6;
        this.f55836b = animation;
        this.f55837c = null;
    }

    public q(Animator animator) {
        this.f55835a = 6;
        this.f55836b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f55837c = animatorSet;
        animatorSet.play(animator);
    }

    public q(ArrayList arrayList, ArrayList arrayList2) {
        this.f55835a = 23;
        int size = arrayList.size();
        this.f55836b = new int[size];
        this.f55837c = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            ((int[]) this.f55836b)[i7] = ((Integer) arrayList.get(i7)).intValue();
            ((float[]) this.f55837c)[i7] = ((Float) arrayList2.get(i7)).floatValue();
        }
    }

    public q(int i7, int i10) {
        this.f55835a = 23;
        this.f55836b = new int[]{i7, i10};
        this.f55837c = new float[]{0.0f, 1.0f};
    }

    public q(int i7, int i10, int i11) {
        this.f55835a = 23;
        this.f55836b = new int[]{i7, i10, i11};
        this.f55837c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public q(d3.e eVar) {
        this.f55835a = 16;
        this.f55837c = eVar;
    }

    public q(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f55835a = 0;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i7 = t0.f57047b;
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
                this.f55836b = new l(context, str, bundle);
            } else if (i10 >= 28) {
                this.f55836b = new l(context, str, bundle);
            } else {
                this.f55836b = new l(context, str, bundle);
            }
            Looper myLooper = Looper.myLooper();
            e(new android.support.v4.media.session.s(1), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            ((l) this.f55836b).f55818a.setMediaButtonReceiver(pendingIntent);
            p pVar = ((l) this.f55836b).f55820c;
            ?? obj = new Object();
            DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                obj.f55844a = new f(context, pVar);
            } else {
                obj.f55844a = new f(context, pVar);
            }
            this.f55837c = obj;
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    public q(t1 t1Var, int[] iArr) {
        this.f55835a = 25;
        this.f55836b = h9.i0.q(t1Var);
        this.f55837c = iArr;
    }

    public q(c5.l lVar) {
        this.f55835a = 8;
        this.f55837c = lVar;
        this.f55836b = new Rect();
    }

    public q(ci.v vVar) {
        this.f55835a = 18;
        this.f55836b = vVar;
        this.f55837c = new AtomicBoolean(false);
    }
}
