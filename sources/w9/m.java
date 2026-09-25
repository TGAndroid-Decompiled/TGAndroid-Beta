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
import m.p3;
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
public final class m {
    public static final ba.a f45217r = new ba.a(3);
    public final Context f45218a;
    public final r f45219b;
    public final z0 f45220c;
    public final p3 d;
    public final com.google.firebase.messaging.t e;
    public final u f45221f;
    public final ba.c f45222g;
    public final a h;
    public final x9.e f45223i;
    public final t9.a f45224j;
    public final u9.a f45225k;
    public final j f45226l;
    public final com.google.firebase.messaging.n f45227m;
    public q f45228n;
    public final TaskCompletionSource f45229o = new TaskCompletionSource();
    public final TaskCompletionSource f45230p = new TaskCompletionSource();
    public final TaskCompletionSource f45231q = new TaskCompletionSource();

    public m(Context context, com.google.firebase.messaging.t tVar, u uVar, r rVar, ba.c cVar, z0 z0Var, a aVar, p3 p3Var, x9.e eVar, com.google.firebase.messaging.n nVar, t9.a aVar2, u9.a aVar3, j jVar) {
        new AtomicBoolean(false);
        this.f45218a = context;
        this.e = tVar;
        this.f45221f = uVar;
        this.f45219b = rVar;
        this.f45222g = cVar;
        this.f45220c = z0Var;
        this.h = aVar;
        this.d = p3Var;
        this.f45223i = eVar;
        this.f45224j = aVar2;
        this.f45225k = aVar3;
        this.f45226l = jVar;
        this.f45227m = nVar;
    }

    public static void a(m mVar, String str, Boolean bool) {
        int i10;
        int i11;
        long j3;
        Integer num;
        mVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String g10 = v7.j.g("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", g10, null);
        }
        Locale locale = Locale.US;
        u uVar = mVar.f45221f;
        a aVar = mVar.h;
        String str2 = uVar.f45265c;
        String str3 = aVar.f45191f;
        String str4 = aVar.f45192g;
        String str5 = uVar.b().f45196a;
        if (aVar.d != null) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        c1 c1Var = new c1(str2, str3, str4, str5, v7.j.c(i10), aVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        e1 e1Var = new e1(h.h());
        Context context = mVar.f45218a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        g gVar = g.f45203a;
        String str8 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str8)) {
            i11 = 3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            i11 = 3;
            g gVar2 = (g) g.f45204b.get(str8.toLowerCase(locale));
            if (gVar2 != null) {
                gVar = gVar2;
            }
        }
        int ordinal = gVar.ordinal();
        String str9 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b10 = h.b(context);
        boolean g11 = h.g();
        int d = h.d();
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        mVar.f45224j.d(str, currentTimeMillis, new b1(c1Var, e1Var, new d1(ordinal, availableProcessors, d, b10, blockCount, g11)));
        if (bool.booleanValue() && str != null) {
            p3 p3Var = mVar.d;
            synchronized (((String) p3Var.f14525c)) {
                try {
                    p3Var.f14525c = str;
                    Map a2 = ((x9.d) ((AtomicMarkableReference) ((com.google.firebase.messaging.m) p3Var.d).f7310b).getReference()).a();
                    List g12 = ((b0) p3Var.f14526f).g();
                    if (((String) ((AtomicMarkableReference) p3Var.h).getReference()) != null) {
                        j3 = currentTimeMillis;
                        ((x9.f) p3Var.f14523a).i(str, (String) ((AtomicMarkableReference) p3Var.h).getReference());
                    } else {
                        j3 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((x9.f) p3Var.f14523a).g(str, a2, false);
                    }
                    if (!g12.isEmpty()) {
                        ((x9.f) p3Var.f14523a).h(str, g12);
                    }
                } finally {
                }
            }
        } else {
            j3 = currentTimeMillis;
        }
        x9.e eVar = mVar.f45223i;
        ((x9.c) eVar.f45993b).b();
        eVar.f45993b = x9.e.f45991c;
        if (str != null) {
            eVar.f45993b = new x9.k(((ba.c) eVar.f45992a).b(str, "userlog"));
        }
        mVar.f45226l.b(str);
        com.google.firebase.messaging.n nVar = mVar.f45227m;
        p pVar = (p) nVar.f7312a;
        Charset charset = e2.f46788a;
        ?? obj = new Object();
        obj.f44236a = "18.6.0";
        a aVar2 = pVar.f45250c;
        String str12 = aVar2.f45188a;
        if (str12 != null) {
            obj.f44237b = str12;
            u uVar2 = pVar.f45249b;
            String str13 = uVar2.b().f45196a;
            if (str13 != null) {
                obj.f44238c = str13;
                obj.d = uVar2.b().f45197b;
                String str14 = aVar2.f45191f;
                if (str14 != null) {
                    obj.f44243k = str14;
                    String str15 = aVar2.f45192g;
                    if (str15 != null) {
                        obj.f44239f = str15;
                        obj.f44241i = 4;
                        ?? obj2 = new Object();
                        obj2.f46802f = Boolean.FALSE;
                        obj2.d = Long.valueOf(j3);
                        if (str != null) {
                            obj2.f46800b = str;
                            String str16 = p.f45247g;
                            if (str16 != null) {
                                obj2.f46799a = str16;
                                String str17 = uVar2.f45265c;
                                if (str17 != null) {
                                    String str18 = uVar2.b().f45196a;
                                    z0 z0Var = aVar2.h;
                                    if (((c5.a) z0Var.f15411c) == null) {
                                        z0Var.f15411c = new c5.a(z0Var);
                                    }
                                    c5.a aVar3 = (c5.a) z0Var.f15411c;
                                    String str19 = aVar3.f3833a;
                                    if (aVar3 == null) {
                                        z0Var.f15411c = new c5.a(z0Var);
                                    }
                                    obj2.f46803g = new i0(str17, str14, str15, str18, str19, ((c5.a) z0Var.f15411c).f3834b);
                                    ?? obj3 = new Object();
                                    Integer valueOf = Integer.valueOf(i11);
                                    obj3.f15759a = valueOf;
                                    if (str6 != null) {
                                        obj3.f15760b = str6;
                                        if (str7 != null) {
                                            obj3.f15761c = str7;
                                            obj3.d = Boolean.valueOf(h.h());
                                            obj2.f46804i = obj3.g();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i12 = 7;
                                            if (!TextUtils.isEmpty(str8) && (num = (Integer) p.f45246f.get(str8.toLowerCase(locale))) != null) {
                                                i12 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long b11 = h.b(pVar.f45248a);
                                            long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                            boolean g13 = h.g();
                                            int d10 = h.d();
                                            ?? obj4 = new Object();
                                            obj4.f7563a = Integer.valueOf(i12);
                                            if (str9 != null) {
                                                obj4.f7564b = str9;
                                                obj4.f7565c = Integer.valueOf(availableProcessors2);
                                                obj4.d = Long.valueOf(b11);
                                                obj4.e = Long.valueOf(blockCount2);
                                                obj4.f7566f = Boolean.valueOf(g13);
                                                obj4.f7567g = Integer.valueOf(d10);
                                                if (str10 != null) {
                                                    obj4.h = str10;
                                                    if (str11 != null) {
                                                        obj4.f7568i = str11;
                                                        obj2.f46805j = obj4.b();
                                                        obj2.f46807l = valueOf;
                                                        obj.f44240g = obj2.a();
                                                        a0 a10 = obj.a();
                                                        ba.c cVar = ((ba.b) nVar.f7313b).f3441b;
                                                        d2 d2Var = a10.f46737j;
                                                        if (d2Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str20 = ((h0) d2Var).f46810b;
                                                        try {
                                                            ba.b.f3438g.getClass();
                                                            ba.b.f(cVar.b(str20, "report"), z9.a.f49011a.J(a10));
                                                            File b12 = cVar.b(str20, "start-time");
                                                            long j10 = ((h0) d2Var).d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), ba.b.e);
                                                            outputStreamWriter.write("");
                                                            b12.setLastModified(j10 * 1000);
                                                            outputStreamWriter.close();
                                                            return;
                                                        } catch (IOException e) {
                                                            String g14 = v7.j.g("Could not persist report for session ", str20);
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", g14, e);
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

    public static Task b(m mVar) {
        Task call;
        mVar.getClass();
        ArrayList arrayList = new ArrayList();
        ba.c cVar = mVar.f45222g;
        for (File file : ba.c.e(cVar.f3444b.listFiles(f45217r))) {
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
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new l(mVar, parseLong));
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
        throw new UnsupportedOperationException("Method not decompiled: w9.m.f():java.lang.String");
    }

    public final void c(boolean r29, da.b r30) {
        throw new UnsupportedOperationException("Method not decompiled: w9.m.c(boolean, da.b):void");
    }

    public final boolean d(da.b bVar) {
        if (Boolean.TRUE.equals(((ThreadLocal) this.e.e).get())) {
            q qVar = this.f45228n;
            if (qVar != null && qVar.e.get()) {
                Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
                return false;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
            }
            try {
                c(true, bVar);
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
                }
                return true;
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
                return false;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final String e() {
        NavigableSet c10 = ((ba.b) this.f45227m.f7313b).c();
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
                    ((com.google.firebase.messaging.m) this.d.e).u("com.crashlytics.version-control-info", f7);
                } catch (IllegalArgumentException e) {
                    Context context = this.f45218a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            throw e;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e7);
        }
    }

    public final Task h(Task task) {
        Task task2;
        Task task3;
        TaskCompletionSource taskCompletionSource = this.f45229o;
        ba.c cVar = ((ba.b) this.f45227m.f7313b).f3441b;
        if (ba.c.e(cVar.d.listFiles()).isEmpty() && ba.c.e(cVar.e.listFiles()).isEmpty() && ba.c.e(cVar.f3446f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        t9.b bVar = t9.b.f43339a;
        bVar.c("Crash reports are available to be sent.");
        r rVar = this.f45219b;
        if (rVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            bVar.b("Automatic data collection is disabled.");
            bVar.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (rVar.f45256c) {
                task2 = rVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new Object());
            bVar.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.f45230p.getTask();
            ExecutorService executorService = w.f45269a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            v vVar = new v(1, taskCompletionSource2);
            onSuccessTask.continueWith(vVar);
            task4.continueWith(vVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new o0.a(this, task, false, 23));
    }
}
