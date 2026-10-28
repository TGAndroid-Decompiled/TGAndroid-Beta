package y9;

import aa.a0;
import aa.b0;
import aa.d1;
import aa.e1;
import aa.f1;
import aa.f2;
import aa.g1;
import aa.g2;
import aa.i0;
import aa.j0;
import aa.m0;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d5.z;
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
import org.telegram.ui.Components.b10;
public final class n {
    public static final da.a f52499r = new da.a(4);
    public final Context f52500a;
    public final s f52501b;
    public final m4.c f52502c;
    public final r3 d;
    public final com.google.firebase.messaging.q e;
    public final v f52503f;
    public final da.c f52504g;
    public final a h;
    public final z9.e f52505i;
    public final v9.a f52506j;
    public final w9.a f52507k;
    public final j f52508l;
    public final m0 f52509m;
    public r f52510n;
    public final TaskCompletionSource f52511o = new TaskCompletionSource();
    public final TaskCompletionSource f52512p = new TaskCompletionSource();
    public final TaskCompletionSource f52513q = new TaskCompletionSource();

    public n(Context context, com.google.firebase.messaging.q qVar, v vVar, s sVar, da.c cVar, m4.c cVar2, a aVar, r3 r3Var, z9.e eVar, m0 m0Var, v9.a aVar2, w9.a aVar3, j jVar) {
        new AtomicBoolean(false);
        this.f52500a = context;
        this.e = qVar;
        this.f52503f = vVar;
        this.f52501b = sVar;
        this.f52504g = cVar;
        this.f52502c = cVar2;
        this.h = aVar;
        this.d = r3Var;
        this.f52505i = eVar;
        this.f52506j = aVar2;
        this.f52507k = aVar3;
        this.f52508l = jVar;
        this.f52509m = m0Var;
    }

    public static void a(n nVar, String str, Boolean bool) {
        int i10;
        long j10;
        Integer num;
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String j11 = b10.j("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", j11, null);
        }
        Locale locale = Locale.US;
        v vVar = nVar.f52503f;
        a aVar = nVar.h;
        String str2 = vVar.f52547c;
        String str3 = aVar.f52471f;
        String str4 = aVar.f52472g;
        String str5 = vVar.b().f52476a;
        if (aVar.d != null) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        e1 e1Var = new e1(str2, str3, str4, str5, b10.d(i10), aVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        g1 g1Var = new g1(h.h());
        Context context = nVar.f52500a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        g gVar = g.f52483a;
        String str8 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str8)) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            g gVar2 = (g) g.f52484b.get(str8.toLowerCase(locale));
            if (gVar2 != null) {
                gVar = gVar2;
            }
        }
        int ordinal = gVar.ordinal();
        String str9 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b10 = h.b(context);
        boolean g7 = h.g();
        int d = h.d();
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        nVar.f52506j.d(str, currentTimeMillis, new d1(e1Var, g1Var, new f1(ordinal, availableProcessors, d, b10, blockCount, g7)));
        if (bool.booleanValue() && str != null) {
            r3 r3Var = nVar.d;
            synchronized (((String) r3Var.f17845c)) {
                try {
                    r3Var.f17845c = str;
                    Map a2 = ((z9.d) ((AtomicMarkableReference) ((c2.b) r3Var.d).f5930b).getReference()).a();
                    List l4 = ((z) r3Var.f17846f).l();
                    if (((String) ((AtomicMarkableReference) r3Var.h).getReference()) != null) {
                        j10 = currentTimeMillis;
                        ((z9.f) r3Var.f17843a).i(str, (String) ((AtomicMarkableReference) r3Var.h).getReference());
                    } else {
                        j10 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((z9.f) r3Var.f17843a).g(str, a2, false);
                    }
                    if (!l4.isEmpty()) {
                        ((z9.f) r3Var.f17843a).h(str, l4);
                    }
                } finally {
                }
            }
        } else {
            j10 = currentTimeMillis;
        }
        z9.e eVar = nVar.f52505i;
        ((z9.c) eVar.f52879b).a();
        eVar.f52879b = z9.e.f52877c;
        if (str != null) {
            eVar.f52879b = new z9.k(((da.c) eVar.f52878a).b(str, "userlog"));
        }
        nVar.f52508l.b(str);
        m0 m0Var = nVar.f52509m;
        q qVar = (q) m0Var.f1150a;
        Charset charset = g2.f1091a;
        ?? obj = new Object();
        obj.f455a = "18.6.0";
        a aVar2 = qVar.f52532c;
        String str12 = aVar2.f52468a;
        if (str12 != null) {
            obj.f456b = str12;
            v vVar2 = qVar.f52531b;
            String str13 = vVar2.b().f52476a;
            if (str13 != null) {
                obj.d = str13;
                obj.e = vVar2.b().f52477b;
                String str14 = aVar2.f52471f;
                if (str14 != null) {
                    obj.f459g = str14;
                    String str15 = aVar2.f52472g;
                    if (str15 != null) {
                        obj.h = str15;
                        obj.f457c = 4;
                        ?? obj2 = new Object();
                        obj2.f1096f = Boolean.FALSE;
                        obj2.d = Long.valueOf(j10);
                        if (str != null) {
                            obj2.f1094b = str;
                            String str16 = q.f52529g;
                            if (str16 != null) {
                                obj2.f1093a = str16;
                                String str17 = vVar2.f52547c;
                                if (str17 != null) {
                                    String str18 = vVar2.b().f52476a;
                                    m4.c cVar = aVar2.h;
                                    if (((m2.t) cVar.f18009c) == null) {
                                        cVar.f18009c = new m2.t(cVar);
                                    }
                                    m2.t tVar = (m2.t) cVar.f18009c;
                                    String str19 = tVar.f17988b;
                                    if (tVar == null) {
                                        cVar.f18009c = new m2.t(cVar);
                                    }
                                    obj2.f1097g = new j0(str17, str14, str15, str18, str19, ((m2.t) cVar.f18009c).f17989c);
                                    ti.e eVar2 = new ti.e(2, false);
                                    eVar2.f49219b = 3;
                                    if (str6 != null) {
                                        eVar2.f49220c = str6;
                                        if (str7 != null) {
                                            eVar2.d = str7;
                                            eVar2.e = Boolean.valueOf(h.h());
                                            obj2.f1098i = eVar2.d();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i11 = 7;
                                            if (!TextUtils.isEmpty(str8) && (num = (Integer) q.f52528f.get(str8.toLowerCase(locale))) != null) {
                                                i11 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long b11 = h.b(qVar.f52530a);
                                            long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                            boolean g10 = h.g();
                                            int d10 = h.d();
                                            ?? obj3 = new Object();
                                            obj3.f1031a = Integer.valueOf(i11);
                                            if (str9 != null) {
                                                obj3.f1032b = str9;
                                                obj3.f1033c = Integer.valueOf(availableProcessors2);
                                                obj3.d = Long.valueOf(b11);
                                                obj3.e = Long.valueOf(blockCount2);
                                                obj3.h = Boolean.valueOf(g10);
                                                obj3.f1034f = Integer.valueOf(d10);
                                                if (str10 != null) {
                                                    obj3.f1035g = str10;
                                                    if (str11 != null) {
                                                        obj3.f1036i = str11;
                                                        obj2.f1099j = obj3.b();
                                                        obj2.f1101l = 3;
                                                        obj.f460i = obj2.a();
                                                        a0 a10 = obj.a();
                                                        da.c cVar2 = ((da.b) m0Var.f1151b).f8271b;
                                                        f2 f2Var = a10.f1020j;
                                                        if (f2Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str20 = ((i0) f2Var).f1110b;
                                                        try {
                                                            da.b.f8268g.getClass();
                                                            da.b.f(cVar2.b(str20, "report"), ba.a.f3719a.c(a10));
                                                            File b12 = cVar2.b(str20, "start-time");
                                                            long j12 = ((i0) f2Var).d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), da.b.e);
                                                            outputStreamWriter.write("");
                                                            b12.setLastModified(j12 * 1000);
                                                            outputStreamWriter.close();
                                                            return;
                                                        } catch (IOException e) {
                                                            String j13 = b10.j("Could not persist report for session ", str20);
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", j13, e);
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
        da.c cVar = nVar.f52504g;
        for (File file : da.c.e(cVar.f8274b.listFiles(f52499r))) {
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
        throw new UnsupportedOperationException("Method not decompiled: y9.n.f():java.lang.String");
    }

    public final void c(boolean r29, aa.b0 r30) {
        throw new UnsupportedOperationException("Method not decompiled: y9.n.c(boolean, aa.b0):void");
    }

    public final boolean d(b0 b0Var) {
        if (Boolean.TRUE.equals(((ThreadLocal) this.e.d).get())) {
            r rVar = this.f52510n;
            if (rVar != null && rVar.e.get()) {
                Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
                return false;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
            }
            try {
                c(true, b0Var);
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
        NavigableSet c10 = ((da.b) this.f52509m.f1151b).c();
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
                    ((c2.b) this.d.e).x("com.crashlytics.version-control-info", f7);
                } catch (IllegalArgumentException e) {
                    Context context = this.f52500a;
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
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e10);
        }
    }

    public final Task h(Task task) {
        Task task2;
        Task task3;
        TaskCompletionSource taskCompletionSource = this.f52511o;
        da.c cVar = ((da.b) this.f52509m.f1151b).f8271b;
        if (da.c.e(cVar.d.listFiles()).isEmpty() && da.c.e(cVar.e.listFiles()).isEmpty() && da.c.e(cVar.f8276f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        v9.b bVar = v9.b.f50135a;
        bVar.c("Crash reports are available to be sent.");
        s sVar = this.f52501b;
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
            synchronized (sVar.f52538c) {
                task2 = sVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new qb.a(27));
            bVar.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.f52512p.getTask();
            ExecutorService executorService = x.f52551a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            w wVar = new w(1, taskCompletionSource2);
            onSuccessTask.continueWith(wVar);
            task4.continueWith(wVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new l(this, task));
    }
}
