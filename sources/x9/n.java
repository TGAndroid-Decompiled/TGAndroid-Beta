package x9;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import c5.c0;
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
import m.t3;
import z9.a0;
import z9.b1;
import z9.c1;
import z9.d1;
import z9.d2;
import z9.e1;
import z9.e2;
import z9.h0;
import z9.i0;
public final class n {
    public static final ca.a f48303r = new ca.a(3);
    public final Context f48304a;
    public final s f48305b;
    public final l f48306c;
    public final t3 d;
    public final com.google.firebase.messaging.s e;
    public final v f48307f;
    public final ca.c f48308g;
    public final a h;
    public final y9.e f48309i;
    public final u9.a f48310j;
    public final v9.a f48311k;
    public final j f48312l;
    public final com.google.firebase.messaging.m f48313m;
    public r f48314n;
    public final TaskCompletionSource f48315o = new TaskCompletionSource();
    public final TaskCompletionSource f48316p = new TaskCompletionSource();
    public final TaskCompletionSource f48317q = new TaskCompletionSource();

    public n(Context context, com.google.firebase.messaging.s sVar, v vVar, s sVar2, ca.c cVar, l lVar, a aVar, t3 t3Var, y9.e eVar, com.google.firebase.messaging.m mVar, u9.a aVar2, v9.a aVar3, j jVar) {
        new AtomicBoolean(false);
        this.f48304a = context;
        this.e = sVar;
        this.f48307f = vVar;
        this.f48305b = sVar2;
        this.f48308g = cVar;
        this.f48306c = lVar;
        this.h = aVar;
        this.d = t3Var;
        this.f48309i = eVar;
        this.f48310j = aVar2;
        this.f48311k = aVar3;
        this.f48312l = jVar;
        this.f48313m = mVar;
    }

    public static void a(n nVar, String str, Boolean bool) {
        int i10;
        int i11;
        long j10;
        Integer num;
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String h = t8.b.h("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", h, null);
        }
        Locale locale = Locale.US;
        v vVar = nVar.f48307f;
        a aVar = nVar.h;
        String str2 = vVar.f48351c;
        String str3 = aVar.f48275f;
        String str4 = aVar.f48276g;
        String str5 = vVar.b().f48280a;
        if (aVar.d != null) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        c1 c1Var = new c1(str2, str3, str4, str5, t8.b.b(i10), aVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        e1 e1Var = new e1(h.h());
        Context context = nVar.f48304a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        g gVar = g.f48287a;
        String str8 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str8)) {
            i11 = 3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            i11 = 3;
            g gVar2 = (g) g.f48288b.get(str8.toLowerCase(locale));
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
        nVar.f48310j.d(str, currentTimeMillis, new b1(c1Var, e1Var, new d1(ordinal, availableProcessors, d, b10, blockCount, g10)));
        if (bool.booleanValue() && str != null) {
            t3 t3Var = nVar.d;
            synchronized (((String) t3Var.f14985c)) {
                try {
                    t3Var.f14985c = str;
                    Map a2 = ((y9.d) ((AtomicMarkableReference) ((c2.b) t3Var.d).f4123b).getReference()).a();
                    List j11 = ((c0) t3Var.f14986f).j();
                    if (((String) ((AtomicMarkableReference) t3Var.h).getReference()) != null) {
                        j10 = currentTimeMillis;
                        ((y9.f) t3Var.f14983a).i(str, (String) ((AtomicMarkableReference) t3Var.h).getReference());
                    } else {
                        j10 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((y9.f) t3Var.f14983a).g(str, a2, false);
                    }
                    if (!j11.isEmpty()) {
                        ((y9.f) t3Var.f14983a).h(str, j11);
                    }
                } finally {
                }
            }
        } else {
            j10 = currentTimeMillis;
        }
        y9.e eVar = nVar.f48309i;
        ((y9.c) eVar.f48708b).a();
        eVar.f48708b = y9.e.f48706c;
        if (str != null) {
            eVar.f48708b = new y9.k(((ca.c) eVar.f48707a).b(str, "userlog"));
        }
        nVar.f48312l.b(str);
        com.google.firebase.messaging.m mVar = nVar.f48313m;
        q qVar = (q) mVar.f6194a;
        Charset charset = e2.f49969a;
        ?? obj = new Object();
        obj.f46606a = "18.6.0";
        a aVar2 = qVar.f48336c;
        String str12 = aVar2.f48272a;
        if (str12 != null) {
            obj.f46607b = str12;
            v vVar2 = qVar.f48335b;
            String str13 = vVar2.b().f48280a;
            if (str13 != null) {
                obj.f46608c = str13;
                obj.d = vVar2.b().f48281b;
                String str14 = aVar2.f48275f;
                if (str14 != null) {
                    obj.f46613k = str14;
                    String str15 = aVar2.f48276g;
                    if (str15 != null) {
                        obj.f46609f = str15;
                        obj.f46611i = 4;
                        ?? obj2 = new Object();
                        obj2.f49983f = Boolean.FALSE;
                        obj2.d = Long.valueOf(j10);
                        if (str != null) {
                            obj2.f49981b = str;
                            String str16 = q.f48333g;
                            if (str16 != null) {
                                obj2.f49980a = str16;
                                String str17 = vVar2.f48351c;
                                if (str17 != null) {
                                    String str18 = vVar2.b().f48280a;
                                    m2.t tVar = aVar2.h;
                                    if (((c5.a) tVar.f15111c) == null) {
                                        tVar.f15111c = new c5.a(tVar);
                                    }
                                    c5.a aVar3 = (c5.a) tVar.f15111c;
                                    String str19 = aVar3.f4326a;
                                    if (aVar3 == null) {
                                        tVar.f15111c = new c5.a(tVar);
                                    }
                                    obj2.f49984g = new i0(str17, str14, str15, str18, str19, ((c5.a) tVar.f15111c).f4327b);
                                    com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(14, false);
                                    Integer valueOf = Integer.valueOf(i11);
                                    sVar.d = valueOf;
                                    if (str6 != null) {
                                        sVar.f6209b = str6;
                                        if (str7 != null) {
                                            sVar.e = str7;
                                            sVar.f6210c = Boolean.valueOf(h.h());
                                            obj2.f49985i = sVar.d();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i12 = 7;
                                            if (!TextUtils.isEmpty(str8) && (num = (Integer) q.f48332f.get(str8.toLowerCase(locale))) != null) {
                                                i12 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long b11 = h.b(qVar.f48334a);
                                            long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                            boolean g11 = h.g();
                                            int d10 = h.d();
                                            ?? obj3 = new Object();
                                            obj3.f8666a = Integer.valueOf(i12);
                                            if (str9 != null) {
                                                obj3.f8667b = str9;
                                                obj3.f8668c = Integer.valueOf(availableProcessors2);
                                                obj3.d = Long.valueOf(b11);
                                                obj3.e = Long.valueOf(blockCount2);
                                                obj3.f8669f = Boolean.valueOf(g11);
                                                obj3.f8670g = Integer.valueOf(d10);
                                                if (str10 != null) {
                                                    obj3.h = str10;
                                                    if (str11 != null) {
                                                        obj3.f8671i = str11;
                                                        obj2.f49986j = obj3.b();
                                                        obj2.f49988l = valueOf;
                                                        obj.f46610g = obj2.a();
                                                        a0 a10 = obj.a();
                                                        ca.c cVar = ((ca.b) mVar.f6195b).f4675b;
                                                        d2 d2Var = a10.f49918j;
                                                        if (d2Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", i11)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str20 = ((h0) d2Var).f49991b;
                                                        try {
                                                            ca.b.f4672g.getClass();
                                                            ca.b.f(cVar.b(str20, "report"), aa.b.f363a.b1(a10));
                                                            File b12 = cVar.b(str20, "start-time");
                                                            long j12 = ((h0) d2Var).d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), ca.b.e);
                                                            outputStreamWriter.write("");
                                                            b12.setLastModified(j12 * 1000);
                                                            outputStreamWriter.close();
                                                            return;
                                                        } catch (IOException e) {
                                                            String h10 = t8.b.h("Could not persist report for session ", str20);
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", h10, e);
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
        ca.c cVar = nVar.f48308g;
        for (File file : ca.c.e(cVar.f4678b.listFiles(f48303r))) {
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
        throw new UnsupportedOperationException("Method not decompiled: x9.n.f():java.lang.String");
    }

    public final void c(boolean r29, ea.b r30) {
        throw new UnsupportedOperationException("Method not decompiled: x9.n.c(boolean, ea.b):void");
    }

    public final boolean d(ea.b bVar) {
        if (Boolean.TRUE.equals(((ThreadLocal) this.e.e).get())) {
            r rVar = this.f48314n;
            if (rVar != null && rVar.e.get()) {
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
        NavigableSet c10 = ((ca.b) this.f48313m.f6195b).c();
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
                    Context context = this.f48304a;
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
        TaskCompletionSource taskCompletionSource = this.f48315o;
        ca.c cVar = ((ca.b) this.f48313m.f6195b).f4675b;
        if (ca.c.e(cVar.d.listFiles()).isEmpty() && ca.c.e(cVar.e.listFiles()).isEmpty() && ca.c.e(cVar.f4680f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        u9.b bVar = u9.b.f46235a;
        bVar.c("Crash reports are available to be sent.");
        s sVar = this.f48305b;
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
            synchronized (sVar.f48342c) {
                task2 = sVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new sb.a(26));
            bVar.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.f48316p.getTask();
            ExecutorService executorService = x.f48355a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            w wVar = new w(1, taskCompletionSource2);
            onSuccessTask.continueWith(wVar);
            task4.continueWith(wVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new n3.b(this, task, false, 26));
    }
}
