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
public final class n {
    public static final ba.a f48948r = new ba.a(3);
    public final Context f48949a;
    public final s f48950b;
    public final z0 f48951c;
    public final p3 d;
    public final com.google.firebase.messaging.s f48952e;
    public final v f48953f;
    public final ba.c f48954g;
    public final a h;
    public final x9.e f48955i;
    public final t9.a f48956j;
    public final u9.a f48957k;
    public final j f48958l;
    public final com.google.firebase.messaging.n f48959m;
    public r f48960n;
    public final TaskCompletionSource f48961o = new TaskCompletionSource();
    public final TaskCompletionSource f48962p = new TaskCompletionSource();
    public final TaskCompletionSource f48963q = new TaskCompletionSource();

    public n(Context context, com.google.firebase.messaging.s sVar, v vVar, s sVar2, ba.c cVar, z0 z0Var, a aVar, p3 p3Var, x9.e eVar, com.google.firebase.messaging.n nVar, t9.a aVar2, u9.a aVar3, j jVar) {
        new AtomicBoolean(false);
        this.f48949a = context;
        this.f48952e = sVar;
        this.f48953f = vVar;
        this.f48950b = sVar2;
        this.f48954g = cVar;
        this.f48951c = z0Var;
        this.h = aVar;
        this.d = p3Var;
        this.f48955i = eVar;
        this.f48956j = aVar2;
        this.f48957k = aVar3;
        this.f48958l = jVar;
        this.f48959m = nVar;
    }

    public static void a(n nVar, String str, Boolean bool) {
        int i10;
        int i11;
        long j3;
        Integer num;
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String i12 = t8.b.i("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", i12, null);
        }
        Locale locale = Locale.US;
        v vVar = nVar.f48953f;
        a aVar = nVar.h;
        String str2 = vVar.f49001c;
        String str3 = aVar.f48919f;
        String str4 = aVar.f48920g;
        String str5 = vVar.b().f48924a;
        if (aVar.d != null) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        c1 c1Var = new c1(str2, str3, str4, str5, t8.b.c(i10), aVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        e1 e1Var = new e1(h.h());
        Context context = nVar.f48949a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        g gVar = g.f48931a;
        String str8 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str8)) {
            i11 = 3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            i11 = 3;
            g gVar2 = (g) g.f48932b.get(str8.toLowerCase(locale));
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
        nVar.f48956j.d(str, currentTimeMillis, new b1(c1Var, e1Var, new d1(ordinal, availableProcessors, d, b10, blockCount, g10)));
        if (bool.booleanValue() && str != null) {
            p3 p3Var = nVar.d;
            synchronized (((String) p3Var.f15852c)) {
                try {
                    p3Var.f15852c = str;
                    Map a2 = ((x9.d) ((AtomicMarkableReference) ((com.google.firebase.messaging.m) p3Var.d).f7902b).getReference()).a();
                    List g11 = ((b0) p3Var.f15854f).g();
                    if (((String) ((AtomicMarkableReference) p3Var.h).getReference()) != null) {
                        j3 = currentTimeMillis;
                        ((x9.f) p3Var.f15850a).i(str, (String) ((AtomicMarkableReference) p3Var.h).getReference());
                    } else {
                        j3 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((x9.f) p3Var.f15850a).g(str, a2, false);
                    }
                    if (!g11.isEmpty()) {
                        ((x9.f) p3Var.f15850a).h(str, g11);
                    }
                } finally {
                }
            }
        } else {
            j3 = currentTimeMillis;
        }
        x9.e eVar = nVar.f48955i;
        ((x9.c) eVar.f49789b).b();
        eVar.f49789b = x9.e.f49787c;
        if (str != null) {
            eVar.f49789b = new x9.k(((ba.c) eVar.f49788a).b(str, "userlog"));
        }
        nVar.f48958l.b(str);
        com.google.firebase.messaging.n nVar2 = nVar.f48959m;
        q qVar = (q) nVar2.f7904a;
        Charset charset = e2.f50627a;
        ?? obj = new Object();
        obj.f47892a = "18.6.0";
        a aVar2 = qVar.f48983c;
        String str12 = aVar2.f48915a;
        if (str12 != null) {
            obj.f47893b = str12;
            v vVar2 = qVar.f48982b;
            String str13 = vVar2.b().f48924a;
            if (str13 != null) {
                obj.f47894c = str13;
                obj.d = vVar2.b().f48925b;
                String str14 = aVar2.f48919f;
                if (str14 != null) {
                    obj.f47900k = str14;
                    String str15 = aVar2.f48920g;
                    if (str15 != null) {
                        obj.f47896f = str15;
                        obj.f47898i = 4;
                        ?? obj2 = new Object();
                        obj2.f50643f = Boolean.FALSE;
                        obj2.d = Long.valueOf(j3);
                        if (str != null) {
                            obj2.f50640b = str;
                            String str16 = q.f48980g;
                            if (str16 != null) {
                                obj2.f50639a = str16;
                                String str17 = vVar2.f49001c;
                                if (str17 != null) {
                                    String str18 = vVar2.b().f48924a;
                                    z0 z0Var = aVar2.h;
                                    if (((c5.a) z0Var.f16848c) == null) {
                                        z0Var.f16848c = new c5.a(z0Var);
                                    }
                                    c5.a aVar3 = (c5.a) z0Var.f16848c;
                                    String str19 = aVar3.f4147a;
                                    if (aVar3 == null) {
                                        z0Var.f16848c = new c5.a(z0Var);
                                    }
                                    obj2.f50644g = new i0(str17, str14, str15, str18, str19, ((c5.a) z0Var.f16848c).f4148b);
                                    ?? obj3 = new Object();
                                    Integer valueOf = Integer.valueOf(i11);
                                    obj3.f45527a = valueOf;
                                    if (str6 != null) {
                                        obj3.f45528b = str6;
                                        if (str7 != null) {
                                            obj3.f45529c = str7;
                                            obj3.d = Boolean.valueOf(h.h());
                                            obj2.f50645i = obj3.g();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i13 = 7;
                                            if (!TextUtils.isEmpty(str8) && (num = (Integer) q.f48979f.get(str8.toLowerCase(locale))) != null) {
                                                i13 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long b11 = h.b(qVar.f48981a);
                                            long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                            boolean g12 = h.g();
                                            int d10 = h.d();
                                            ?? obj4 = new Object();
                                            obj4.f8179a = Integer.valueOf(i13);
                                            if (str9 != null) {
                                                obj4.f8180b = str9;
                                                obj4.f8181c = Integer.valueOf(availableProcessors2);
                                                obj4.d = Long.valueOf(b11);
                                                obj4.f8182e = Long.valueOf(blockCount2);
                                                obj4.f8183f = Boolean.valueOf(g12);
                                                obj4.f8184g = Integer.valueOf(d10);
                                                if (str10 != null) {
                                                    obj4.h = str10;
                                                    if (str11 != null) {
                                                        obj4.f8185i = str11;
                                                        obj2.f50646j = obj4.b();
                                                        obj2.f50648l = valueOf;
                                                        obj.f47897g = obj2.a();
                                                        a0 a10 = obj.a();
                                                        ba.c cVar = ((ba.b) nVar2.f7905b).f3718b;
                                                        d2 d2Var = a10.f50571j;
                                                        if (d2Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str20 = ((h0) d2Var).f50651b;
                                                        try {
                                                            ba.b.f3715g.getClass();
                                                            ba.b.f(cVar.b(str20, "report"), z9.c.f53050a.c(a10));
                                                            File b12 = cVar.b(str20, "start-time");
                                                            long j10 = ((h0) d2Var).d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), ba.b.f3713e);
                                                            outputStreamWriter.write("");
                                                            b12.setLastModified(j10 * 1000);
                                                            outputStreamWriter.close();
                                                            return;
                                                        } catch (IOException e7) {
                                                            String i14 = t8.b.i("Could not persist report for session ", str20);
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
        ba.c cVar = nVar.f48954g;
        for (File file : ba.c.e(cVar.f3721b.listFiles(f48948r))) {
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

    public final void c(boolean r29, da.b r30) {
        throw new UnsupportedOperationException("Method not decompiled: w9.n.c(boolean, da.b):void");
    }

    public final boolean d(da.b bVar) {
        if (Boolean.TRUE.equals(((ThreadLocal) this.f48952e.f7923e).get())) {
            r rVar = this.f48960n;
            if (rVar != null && rVar.f48988e.get()) {
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
            } catch (Exception e7) {
                Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e7);
                return false;
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final String e() {
        NavigableSet c10 = ((ba.b) this.f48959m.f7905b).c();
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
                    ((com.google.firebase.messaging.m) this.d.f15853e).u("com.crashlytics.version-control-info", f7);
                } catch (IllegalArgumentException e7) {
                    Context context = this.f48949a;
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
        TaskCompletionSource taskCompletionSource = this.f48961o;
        ba.c cVar = ((ba.b) this.f48959m.f7905b).f3718b;
        if (ba.c.e(cVar.d.listFiles()).isEmpty() && ba.c.e(cVar.f3723e.listFiles()).isEmpty() && ba.c.e(cVar.f3724f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        t9.b bVar = t9.b.f46937a;
        bVar.c("Crash reports are available to be sent.");
        s sVar = this.f48950b;
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
            synchronized (sVar.f48991c) {
                task2 = sVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new Object());
            bVar.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.f48962p.getTask();
            ExecutorService executorService = x.f49006a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            w wVar = new w(1, taskCompletionSource2);
            onSuccessTask.continueWith(wVar);
            task4.continueWith(wVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new o0.a(this, task, false, 23));
    }
}
