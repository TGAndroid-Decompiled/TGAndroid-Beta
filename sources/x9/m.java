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
import m.s3;
import z9.a0;
import z9.b1;
import z9.c1;
import z9.d1;
import z9.d2;
import z9.e1;
import z9.e2;
import z9.h0;
import z9.i0;
public final class m {
    public static final ca.a f49697r = new ca.a(3);
    public final Context f49698a;
    public final r f49699b;
    public final mi.q f49700c;
    public final s3 d;
    public final com.google.firebase.messaging.r e;
    public final u f49701f;
    public final ca.c f49702g;
    public final a h;
    public final y9.e f49703i;
    public final u9.a f49704j;
    public final v9.a f49705k;
    public final j f49706l;
    public final com.google.firebase.messaging.l f49707m;
    public q f49708n;
    public final TaskCompletionSource f49709o = new TaskCompletionSource();
    public final TaskCompletionSource f49710p = new TaskCompletionSource();
    public final TaskCompletionSource f49711q = new TaskCompletionSource();

    public m(Context context, com.google.firebase.messaging.r rVar, u uVar, r rVar2, ca.c cVar, mi.q qVar, a aVar, s3 s3Var, y9.e eVar, com.google.firebase.messaging.l lVar, u9.a aVar2, v9.a aVar3, j jVar) {
        new AtomicBoolean(false);
        this.f49698a = context;
        this.e = rVar;
        this.f49701f = uVar;
        this.f49699b = rVar2;
        this.f49702g = cVar;
        this.f49700c = qVar;
        this.h = aVar;
        this.d = s3Var;
        this.f49703i = eVar;
        this.f49704j = aVar2;
        this.f49705k = aVar3;
        this.f49706l = jVar;
        this.f49707m = lVar;
    }

    public static void a(m mVar, String str, Boolean bool) {
        int i10;
        int i11;
        long j10;
        Integer num;
        mVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String h = r4.c.h("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", h, null);
        }
        Locale locale = Locale.US;
        u uVar = mVar.f49701f;
        a aVar = mVar.h;
        String str2 = uVar.f49745c;
        String str3 = aVar.f49671f;
        String str4 = aVar.f49672g;
        String str5 = uVar.b().f49676a;
        if (aVar.d != null) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        c1 c1Var = new c1(str2, str3, str4, str5, r4.c.b(i10), aVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        e1 e1Var = new e1(h.h());
        Context context = mVar.f49698a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        g gVar = g.f49683a;
        String str8 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str8)) {
            i11 = 3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            i11 = 3;
            g gVar2 = (g) g.f49684b.get(str8.toLowerCase(locale));
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
        mVar.f49704j.d(str, currentTimeMillis, new b1(c1Var, e1Var, new d1(ordinal, availableProcessors, d, b10, blockCount, g10)));
        if (bool.booleanValue() && str != null) {
            s3 s3Var = mVar.d;
            synchronized (((String) s3Var.f16336c)) {
                try {
                    s3Var.f16336c = str;
                    Map a2 = ((y9.d) ((AtomicMarkableReference) ((c2.b) s3Var.d).f4490b).getReference()).a();
                    List p5 = ((c0) s3Var.f16337f).p();
                    if (((String) ((AtomicMarkableReference) s3Var.h).getReference()) != null) {
                        j10 = currentTimeMillis;
                        ((y9.f) s3Var.f16334a).i(str, (String) ((AtomicMarkableReference) s3Var.h).getReference());
                    } else {
                        j10 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((y9.f) s3Var.f16334a).g(str, a2, false);
                    }
                    if (!p5.isEmpty()) {
                        ((y9.f) s3Var.f16334a).h(str, p5);
                    }
                } finally {
                }
            }
        } else {
            j10 = currentTimeMillis;
        }
        y9.e eVar = mVar.f49703i;
        ((y9.c) eVar.f50100b).a();
        eVar.f50100b = y9.e.f50098c;
        if (str != null) {
            eVar.f50100b = new y9.k(((ca.c) eVar.f50099a).b(str, "userlog"));
        }
        mVar.f49706l.b(str);
        com.google.firebase.messaging.l lVar = mVar.f49707m;
        p pVar = (p) lVar.f7645a;
        Charset charset = e2.f51362a;
        ?? obj = new Object();
        obj.f48001a = "18.6.0";
        a aVar2 = pVar.f49730c;
        String str12 = aVar2.f49668a;
        if (str12 != null) {
            obj.f48002b = str12;
            u uVar2 = pVar.f49729b;
            String str13 = uVar2.b().f49676a;
            if (str13 != null) {
                obj.f48003c = str13;
                obj.d = uVar2.b().f49677b;
                String str14 = aVar2.f49671f;
                if (str14 != null) {
                    obj.f48008k = str14;
                    String str15 = aVar2.f49672g;
                    if (str15 != null) {
                        obj.f48004f = str15;
                        obj.f48006i = 4;
                        ?? obj2 = new Object();
                        obj2.f51376f = Boolean.FALSE;
                        obj2.d = Long.valueOf(j10);
                        if (str != null) {
                            obj2.f51374b = str;
                            String str16 = p.f49727g;
                            if (str16 != null) {
                                obj2.f51373a = str16;
                                String str17 = uVar2.f49745c;
                                if (str17 != null) {
                                    String str18 = uVar2.b().f49676a;
                                    mi.q qVar = aVar2.h;
                                    if (((m2.t) qVar.f16974c) == null) {
                                        qVar.f16974c = new m2.t(qVar);
                                    }
                                    m2.t tVar = (m2.t) qVar.f16974c;
                                    String str19 = tVar.f16469b;
                                    if (tVar == null) {
                                        qVar.f16974c = new m2.t(qVar);
                                    }
                                    obj2.f51377g = new i0(str17, str14, str15, str18, str19, ((m2.t) qVar.f16974c).f16470c);
                                    com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r(14, false);
                                    Integer valueOf = Integer.valueOf(i11);
                                    rVar.d = valueOf;
                                    if (str6 != null) {
                                        rVar.f7660b = str6;
                                        if (str7 != null) {
                                            rVar.e = str7;
                                            rVar.f7661c = Boolean.valueOf(h.h());
                                            obj2.f51378i = rVar.d();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i12 = 7;
                                            if (!TextUtils.isEmpty(str8) && (num = (Integer) p.f49726f.get(str8.toLowerCase(locale))) != null) {
                                                i12 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long b11 = h.b(pVar.f49728a);
                                            long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                            boolean g11 = h.g();
                                            int d10 = h.d();
                                            ?? obj3 = new Object();
                                            obj3.f8545a = Integer.valueOf(i12);
                                            if (str9 != null) {
                                                obj3.f8546b = str9;
                                                obj3.f8547c = Integer.valueOf(availableProcessors2);
                                                obj3.d = Long.valueOf(b11);
                                                obj3.e = Long.valueOf(blockCount2);
                                                obj3.f8548f = Boolean.valueOf(g11);
                                                obj3.f8549g = Integer.valueOf(d10);
                                                if (str10 != null) {
                                                    obj3.h = str10;
                                                    if (str11 != null) {
                                                        obj3.f8550i = str11;
                                                        obj2.f51379j = obj3.b();
                                                        obj2.f51381l = valueOf;
                                                        obj.f48005g = obj2.a();
                                                        a0 a10 = obj.a();
                                                        ca.c cVar = ((ca.b) lVar.f7646b).f5043b;
                                                        d2 d2Var = a10.f51311j;
                                                        if (d2Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", i11)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str20 = ((h0) d2Var).f51384b;
                                                        try {
                                                            ca.b.f5040g.getClass();
                                                            ca.b.f(cVar.b(str20, "report"), aa.b.f361a.M(a10));
                                                            File b12 = cVar.b(str20, "start-time");
                                                            long j11 = ((h0) d2Var).d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), ca.b.e);
                                                            outputStreamWriter.write("");
                                                            b12.setLastModified(j11 * 1000);
                                                            outputStreamWriter.close();
                                                            return;
                                                        } catch (IOException e) {
                                                            String h10 = r4.c.h("Could not persist report for session ", str20);
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

    public static Task b(m mVar) {
        Task call;
        mVar.getClass();
        ArrayList arrayList = new ArrayList();
        ca.c cVar = mVar.f49702g;
        for (File file : ca.c.e(cVar.f5046b.listFiles(f49697r))) {
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
        throw new UnsupportedOperationException("Method not decompiled: x9.m.f():java.lang.String");
    }

    public final void c(boolean r29, ea.b r30) {
        throw new UnsupportedOperationException("Method not decompiled: x9.m.c(boolean, ea.b):void");
    }

    public final boolean d(ea.b bVar) {
        if (Boolean.TRUE.equals(((ThreadLocal) this.e.e).get())) {
            q qVar = this.f49708n;
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
        NavigableSet c10 = ((ca.b) this.f49707m.f7646b).c();
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
                    Context context = this.f49698a;
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
        TaskCompletionSource taskCompletionSource = this.f49709o;
        ca.c cVar = ((ca.b) this.f49707m.f7646b).f5043b;
        if (ca.c.e(cVar.d.listFiles()).isEmpty() && ca.c.e(cVar.e.listFiles()).isEmpty() && ca.c.e(cVar.f5048f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        u9.b bVar = u9.b.f47632a;
        bVar.c("Crash reports are available to be sent.");
        r rVar = this.f49699b;
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
            synchronized (rVar.f49736c) {
                task2 = rVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new sb.a(26));
            bVar.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.f49710p.getTask();
            ExecutorService executorService = w.f49749a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            v vVar = new v(1, taskCompletionSource2);
            onSuccessTask.continueWith(vVar);
            task4.continueWith(vVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new n2.e(this, task, false, 27));
    }
}
