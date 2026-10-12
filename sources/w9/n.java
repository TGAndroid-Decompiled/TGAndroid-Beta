package w9;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import c5.b0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.r3;
import n7.z0;
import y9.a0;
import y9.b1;
import y9.c1;
import y9.d1;
import y9.d2;
import y9.e1;
import y9.e2;
import y9.h0;
import y9.i0;
public final class n {
    public static final ba.a f50480r = new ba.a(3);
    public final Context f50481a;
    public final s f50482b;
    public final n6.k f50483c;
    public final r3 d;
    public final com.google.firebase.messaging.s f50484e;
    public final v f50485f;
    public final ba.c f50486g;
    public final a h;
    public final x9.e f50487i;
    public final t9.a f50488j;
    public final u9.a f50489k;
    public final j f50490l;
    public final com.google.firebase.messaging.n f50491m;
    public r f50492n;
    public final TaskCompletionSource f50493o = new TaskCompletionSource();
    public final TaskCompletionSource f50494p = new TaskCompletionSource();
    public final TaskCompletionSource f50495q = new TaskCompletionSource();

    public n(Context context, com.google.firebase.messaging.s sVar, v vVar, s sVar2, ba.c cVar, n6.k kVar, a aVar, r3 r3Var, x9.e eVar, com.google.firebase.messaging.n nVar, t9.a aVar2, u9.a aVar3, j jVar) {
        new AtomicBoolean(false);
        this.f50481a = context;
        this.f50484e = sVar;
        this.f50485f = vVar;
        this.f50482b = sVar2;
        this.f50486g = cVar;
        this.f50483c = kVar;
        this.h = aVar;
        this.d = r3Var;
        this.f50487i = eVar;
        this.f50488j = aVar2;
        this.f50489k = aVar3;
        this.f50490l = jVar;
        this.f50491m = nVar;
    }

    public static void a(n nVar, String str, Boolean bool) {
        int i10;
        int i11;
        long j3;
        Integer num;
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String i12 = sc.v.i("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", i12, null);
        }
        Locale locale = Locale.US;
        v vVar = nVar.f50485f;
        a aVar = nVar.h;
        String str2 = vVar.f50533c;
        String str3 = aVar.f50451f;
        String str4 = aVar.f50452g;
        String str5 = vVar.b().f50456a;
        if (aVar.d != null) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        c1 c1Var = new c1(str2, str3, str4, str5, sc.v.c(i10), aVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        e1 e1Var = new e1(h.h());
        Context context = nVar.f50481a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        g gVar = g.f50463a;
        String str8 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str8)) {
            i11 = 3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            i11 = 3;
            g gVar2 = (g) g.f50464b.get(str8.toLowerCase(locale));
            if (gVar2 != null) {
                gVar = gVar2;
            }
        }
        int ordinal = gVar.ordinal();
        String str9 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b10 = h.b(context);
        boolean g10 = h.g();
        int d = h.d();
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        nVar.f50488j.d(str, currentTimeMillis, new b1(c1Var, e1Var, new d1(ordinal, availableProcessors, d, b10, blockCount, g10)));
        if (bool.booleanValue() && str != null) {
            r3 r3Var = nVar.d;
            synchronized (((String) r3Var.f15557c)) {
                try {
                    r3Var.f15557c = str;
                    Map a2 = ((x9.d) ((AtomicMarkableReference) ((com.google.firebase.messaging.m) r3Var.d).f7948b).getReference()).a();
                    List n10 = ((b0) r3Var.f15559f).n();
                    if (((String) ((AtomicMarkableReference) r3Var.h).getReference()) != null) {
                        j3 = currentTimeMillis;
                        ((x9.f) r3Var.f15555a).i(str, (String) ((AtomicMarkableReference) r3Var.h).getReference());
                    } else {
                        j3 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((x9.f) r3Var.f15555a).g(str, a2, false);
                    }
                    if (!n10.isEmpty()) {
                        ((x9.f) r3Var.f15555a).h(str, n10);
                    }
                } finally {
                }
            }
        } else {
            j3 = currentTimeMillis;
        }
        x9.e eVar = nVar.f50487i;
        ((x9.c) eVar.f51319b).a();
        eVar.f51319b = x9.e.f51317c;
        if (str != null) {
            eVar.f51319b = new x9.k(((ba.c) eVar.f51318a).b(str, "userlog"));
        }
        nVar.f50490l.b(str);
        com.google.firebase.messaging.n nVar2 = nVar.f50491m;
        q qVar = (q) nVar2.f7950a;
        Charset charset = e2.f52155a;
        ?? obj = new Object();
        obj.f49403a = "18.6.0";
        a aVar2 = qVar.f50515c;
        String str12 = aVar2.f50447a;
        if (str12 != null) {
            obj.f49404b = str12;
            v vVar2 = qVar.f50514b;
            String str13 = vVar2.b().f50456a;
            if (str13 != null) {
                obj.f49405c = str13;
                obj.d = vVar2.b().f50457b;
                String str14 = aVar2.f50451f;
                if (str14 != null) {
                    obj.f49411k = str14;
                    String str15 = aVar2.f50452g;
                    if (str15 != null) {
                        obj.f49407f = str15;
                        obj.f49409i = 4;
                        ?? obj2 = new Object();
                        obj2.f52171f = Boolean.FALSE;
                        obj2.d = Long.valueOf(j3);
                        if (str != null) {
                            obj2.f52168b = str;
                            String str16 = q.f50512g;
                            if (str16 != null) {
                                obj2.f52167a = str16;
                                String str17 = vVar2.f50533c;
                                if (str17 != null) {
                                    String str18 = vVar2.b().f50456a;
                                    n6.k kVar = aVar2.h;
                                    if (((c5.a) kVar.f16434c) == null) {
                                        kVar.f16434c = new c5.a(kVar);
                                    }
                                    c5.a aVar3 = (c5.a) kVar.f16434c;
                                    String str19 = aVar3.f4196a;
                                    if (aVar3 == null) {
                                        kVar.f16434c = new c5.a(kVar);
                                    }
                                    obj2.f52172g = new i0(str17, str14, str15, str18, str19, ((c5.a) kVar.f16434c).f4197b);
                                    ?? obj3 = new Object();
                                    Integer valueOf = Integer.valueOf(i11);
                                    obj3.f16927a = valueOf;
                                    if (str6 != null) {
                                        obj3.f16928b = str6;
                                        if (str7 != null) {
                                            obj3.f16929c = str7;
                                            obj3.d = Boolean.valueOf(h.h());
                                            obj2.f52173i = obj3.g();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i13 = 7;
                                            if (!TextUtils.isEmpty(str8) && (num = (Integer) q.f50511f.get(str8.toLowerCase(locale))) != null) {
                                                i13 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long b11 = h.b(qVar.f50513a);
                                            long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                            boolean g11 = h.g();
                                            int d10 = h.d();
                                            ?? obj4 = new Object();
                                            obj4.f8229a = Integer.valueOf(i13);
                                            if (str9 != null) {
                                                obj4.f8230b = str9;
                                                obj4.f8231c = Integer.valueOf(availableProcessors2);
                                                obj4.d = Long.valueOf(b11);
                                                obj4.f8232e = Long.valueOf(blockCount2);
                                                obj4.f8233f = Boolean.valueOf(g11);
                                                obj4.f8234g = Integer.valueOf(d10);
                                                if (str10 != null) {
                                                    obj4.h = str10;
                                                    if (str11 != null) {
                                                        obj4.f8235i = str11;
                                                        obj2.f52174j = obj4.b();
                                                        obj2.f52176l = valueOf;
                                                        obj.f49408g = obj2.a();
                                                        a0 a10 = obj.a();
                                                        ba.c cVar = ((ba.b) nVar2.f7951b).f3795b;
                                                        d2 d2Var = a10.f52099j;
                                                        if (d2Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", i11)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str20 = ((h0) d2Var).f52179b;
                                                        try {
                                                            ba.b.f3792g.getClass();
                                                            ba.b.f(cVar.b(str20, "report"), z9.a.f54415a.k0(a10));
                                                            File b12 = cVar.b(str20, "start-time");
                                                            long j10 = ((h0) d2Var).d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), ba.b.f3790e);
                                                            outputStreamWriter.write("");
                                                            b12.setLastModified(j10 * 1000);
                                                            outputStreamWriter.close();
                                                            return;
                                                        } catch (IOException e7) {
                                                            String i14 = sc.v.i("Could not persist report for session ", str20);
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", i14, e7);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                    }
                                                    throw new NullPointerException("Null modelClass");
                                                }
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                            throw new NullPointerException("Null model");
                                        }
                                        throw new NullPointerException("Null buildVersion");
                                    }
                                    throw new NullPointerException("Null version");
                                }
                                throw new NullPointerException("Null identifier");
                            }
                            throw new NullPointerException("Null generator");
                        }
                        throw new NullPointerException("Null identifier");
                    }
                    throw new NullPointerException("Null displayVersion");
                }
                throw new NullPointerException("Null buildVersion");
            }
            throw new NullPointerException("Null installationUuid");
        }
        throw new NullPointerException("Null gmpAppId");
    }

    public static Task b(n nVar) {
        Task call;
        nVar.getClass();
        ArrayList arrayList = new ArrayList();
        ba.c cVar = nVar.f50486g;
        for (File file : ba.c.e(cVar.f3798b.listFiles(f50480r))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    call = Tasks.forResult(null);
                } catch (ClassNotFoundException unused) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new m(nVar, parseLong));
                }
                arrayList.add(call);
            } catch (NumberFormatException unused2) {
                Log.w("FirebaseCrashlytics", "Could not parse app exception timestamp from file " + file.getName(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    public static java.lang.String f() {
        throw new UnsupportedOperationException("Method not decompiled: w9.n.f():java.lang.String");
    }

    public final void c(boolean r29, da.c r30) {
        throw new UnsupportedOperationException("Method not decompiled: w9.n.c(boolean, da.c):void");
    }

    public final boolean d(da.c cVar) {
        if (Boolean.TRUE.equals(((ThreadLocal) this.f50484e.f7969e).get())) {
            r rVar = this.f50492n;
            if (rVar != null && rVar.f50520e.get()) {
                Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
                return false;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
            }
            try {
                c(true, cVar);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
                }
                return true;
            } catch (Exception e7) {
                Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e7);
                return false;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final String e() {
        NavigableSet c10 = ((ba.b) this.f50491m.f7951b).c();
        if (!c10.isEmpty()) {
            return (String) c10.first();
        }
        return null;
    }

    public final void g() {
        boolean z10;
        try {
            String f7 = f();
            if (f7 != null) {
                try {
                    ((com.google.firebase.messaging.m) this.d.f15558e).x("com.crashlytics.version-control-info", f7);
                } catch (IllegalArgumentException e7) {
                    Context context = this.f50481a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            throw e7;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e10);
        }
    }

    public final Task h(Task task) {
        Task task2;
        Task task3;
        TaskCompletionSource taskCompletionSource = this.f50493o;
        ba.c cVar = ((ba.b) this.f50491m.f7951b).f3795b;
        if (ba.c.e(cVar.d.listFiles()).isEmpty() && ba.c.e(cVar.f3800e.listFiles()).isEmpty() && ba.c.e(cVar.f3801f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        t9.b bVar = t9.b.f48484a;
        bVar.c("Crash reports are available to be sent.");
        s sVar = this.f50482b;
        if (sVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            bVar.b("Automatic data collection is disabled.");
            bVar.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (sVar.f50523c) {
                task2 = sVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new rb.a(25, false));
            bVar.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.f50494p.getTask();
            ExecutorService executorService = y.f50539a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            x xVar = new x(1, taskCompletionSource2);
            onSuccessTask.continueWith(xVar);
            task4.continueWith(xVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new z0(this, task, false, 22));
    }
}
