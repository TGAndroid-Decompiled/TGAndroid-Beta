package x9;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
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
import x7.g8;
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
    public static final ca.a f53485r = new ca.a(3);
    public final Context f53486a;
    public final s f53487b;
    public final u9.b f53488c;
    public final p3 d;
    public final xa.n e;
    public final v f53489f;
    public final ca.c f53490g;
    public final a h;
    public final y9.e f53491i;
    public final u9.a f53492j;
    public final v9.a f53493k;
    public final j f53494l;
    public final j2.f f53495m;
    public r f53496n;
    public final TaskCompletionSource f53497o = new TaskCompletionSource();
    public final TaskCompletionSource f53498p = new TaskCompletionSource();
    public final TaskCompletionSource f53499q = new TaskCompletionSource();

    public n(Context context, xa.n nVar, v vVar, s sVar, ca.c cVar, u9.b bVar, a aVar, p3 p3Var, y9.e eVar, j2.f fVar, u9.a aVar2, v9.a aVar3, j jVar) {
        new AtomicBoolean(false);
        this.f53486a = context;
        this.e = nVar;
        this.f53489f = vVar;
        this.f53487b = sVar;
        this.f53490g = cVar;
        this.f53488c = bVar;
        this.h = aVar;
        this.d = p3Var;
        this.f53491i = eVar;
        this.f53492j = aVar2;
        this.f53493k = aVar3;
        this.f53494l = jVar;
        this.f53495m = fVar;
    }

    public static void a(n nVar, String str, Boolean bool) {
        int i10;
        int i11;
        long j10;
        Integer num;
        nVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String h = sc.e.h("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", h, null);
        }
        Locale locale = Locale.US;
        v vVar = nVar.f53489f;
        a aVar = nVar.h;
        String str2 = vVar.f53533c;
        String str3 = aVar.f53456f;
        String str4 = aVar.f53457g;
        String str5 = vVar.b().f53461a;
        if (aVar.d != null) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        c1 c1Var = new c1(str2, str3, str4, str5, sc.e.c(i10), aVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        e1 e1Var = new e1(h.h());
        Context context = nVar.f53486a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        g gVar = g.f53468a;
        String str8 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str8)) {
            i11 = 3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            i11 = 3;
            g gVar2 = (g) g.f53469b.get(str8.toLowerCase(locale));
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
        nVar.f53492j.d(str, currentTimeMillis, new b1(c1Var, e1Var, new d1(ordinal, availableProcessors, d, b10, blockCount, g10)));
        if (bool.booleanValue() && str != null) {
            p3 p3Var = nVar.d;
            synchronized (((String) p3Var.f12521c)) {
                try {
                    p3Var.f12521c = str;
                    Map a2 = ((y9.d) ((AtomicMarkableReference) ((ac.a) p3Var.d).f363b).getReference()).a();
                    List m10 = ((c5.x) p3Var.f12522f).m();
                    if (((String) ((AtomicMarkableReference) p3Var.h).getReference()) != null) {
                        j10 = currentTimeMillis;
                        ((y9.f) p3Var.f12519a).i(str, (String) ((AtomicMarkableReference) p3Var.h).getReference());
                    } else {
                        j10 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((y9.f) p3Var.f12519a).g(str, a2, false);
                    }
                    if (!m10.isEmpty()) {
                        ((y9.f) p3Var.f12519a).h(str, m10);
                    }
                } finally {
                }
            }
        } else {
            j10 = currentTimeMillis;
        }
        y9.e eVar = nVar.f53491i;
        ((y9.c) eVar.f54352b).a();
        eVar.f54352b = y9.e.f54350c;
        if (str != null) {
            eVar.f54352b = new y9.k(((ca.c) eVar.f54351a).b(str, "userlog"));
        }
        nVar.f53494l.b(str);
        j2.f fVar = nVar.f53495m;
        q qVar = (q) fVar.f9348a;
        Charset charset = e2.f55289a;
        ?? obj = new Object();
        obj.f50398a = "18.6.0";
        a aVar2 = qVar.f53518c;
        String str12 = aVar2.f53453a;
        if (str12 != null) {
            obj.f50399b = str12;
            v vVar2 = qVar.f53517b;
            String str13 = vVar2.b().f53461a;
            if (str13 != null) {
                obj.f50400c = str13;
                obj.d = vVar2.b().f53462b;
                String str14 = aVar2.f53456f;
                if (str14 != null) {
                    obj.f50405k = str14;
                    String str15 = aVar2.f53457g;
                    if (str15 != null) {
                        obj.f50401f = str15;
                        obj.f50403i = 4;
                        ?? obj2 = new Object();
                        obj2.f55303f = Boolean.FALSE;
                        obj2.d = Long.valueOf(j10);
                        if (str != null) {
                            obj2.f55301b = str;
                            String str16 = q.f53515g;
                            if (str16 != null) {
                                obj2.f55300a = str16;
                                String str17 = vVar2.f53533c;
                                if (str17 != null) {
                                    String str18 = vVar2.b().f53461a;
                                    u9.b bVar = aVar2.h;
                                    if (((c5.a) bVar.f50209c) == null) {
                                        bVar.f50209c = new c5.a(bVar);
                                    }
                                    c5.a aVar3 = (c5.a) bVar.f50209c;
                                    String str19 = aVar3.f3731b;
                                    if (aVar3 == null) {
                                        bVar.f50209c = new c5.a(bVar);
                                    }
                                    obj2.f55304g = new i0(str17, str14, str15, str18, str19, ((c5.a) bVar.f50209c).f3732c);
                                    ?? obj3 = new Object();
                                    Integer valueOf = Integer.valueOf(i11);
                                    obj3.f53574c = valueOf;
                                    if (str6 != null) {
                                        obj3.f53572a = str6;
                                        if (str7 != null) {
                                            obj3.d = str7;
                                            obj3.f53573b = Boolean.valueOf(h.h());
                                            obj2.f55305i = obj3.n();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i12 = 7;
                                            if (!TextUtils.isEmpty(str8) && (num = (Integer) q.f53514f.get(str8.toLowerCase(locale))) != null) {
                                                i12 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long b11 = h.b(qVar.f53516a);
                                            long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                            boolean g11 = h.g();
                                            int d10 = h.d();
                                            ?? obj4 = new Object();
                                            obj4.f6466a = Integer.valueOf(i12);
                                            if (str9 != null) {
                                                obj4.f6467b = str9;
                                                obj4.f6468c = Integer.valueOf(availableProcessors2);
                                                obj4.d = Long.valueOf(b11);
                                                obj4.e = Long.valueOf(blockCount2);
                                                obj4.f6469f = Boolean.valueOf(g11);
                                                obj4.f6470g = Integer.valueOf(d10);
                                                if (str10 != null) {
                                                    obj4.h = str10;
                                                    if (str11 != null) {
                                                        obj4.f6471i = str11;
                                                        obj2.f55306j = obj4.b();
                                                        obj2.f55308l = valueOf;
                                                        obj.f50402g = obj2.a();
                                                        a0 a10 = obj.a();
                                                        ca.c cVar = ((ca.b) fVar.f9349b).f4081b;
                                                        d2 d2Var = a10.f55238j;
                                                        if (d2Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", i11)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str20 = ((h0) d2Var).f55311b;
                                                        try {
                                                            ca.b.f4078g.getClass();
                                                            ca.b.f(cVar.b(str20, "report"), aa.b.f361a.v(a10));
                                                            File b12 = cVar.b(str20, "start-time");
                                                            long j11 = ((h0) d2Var).d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), ca.b.e);
                                                            outputStreamWriter.write("");
                                                            b12.setLastModified(j11 * 1000);
                                                            outputStreamWriter.close();
                                                            return;
                                                        } catch (IOException e) {
                                                            String h10 = sc.e.h("Could not persist report for session ", str20);
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
        ca.c cVar = nVar.f53490g;
        for (File file : ca.c.e(cVar.f4084b.listFiles(f53485r))) {
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

    public final void c(boolean r29, ea.d r30) {
        throw new UnsupportedOperationException("Method not decompiled: x9.n.c(boolean, ea.d):void");
    }

    public final boolean d(ea.d dVar) {
        if (Boolean.TRUE.equals(((ThreadLocal) this.e.d).get())) {
            r rVar = this.f53496n;
            if (rVar != null && rVar.e.get()) {
                Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
                return false;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
            }
            try {
                c(true, dVar);
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
        NavigableSet c10 = ((ca.b) this.f53495m.f9349b).c();
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
                    ((ac.a) this.d.e).z("com.crashlytics.version-control-info", f7);
                } catch (IllegalArgumentException e) {
                    Context context = this.f53486a;
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
        TaskCompletionSource taskCompletionSource = this.f53497o;
        ca.c cVar = ((ca.b) this.f53495m.f9349b).f4081b;
        if (ca.c.e(cVar.d.listFiles()).isEmpty() && ca.c.e(cVar.e.listFiles()).isEmpty() && ca.c.e(cVar.f4086f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        u9.c cVar2 = u9.c.f50210a;
        cVar2.c("Crash reports are available to be sent.");
        s sVar = this.f53487b;
        if (sVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            task3 = Tasks.forResult(Boolean.TRUE);
        } else {
            cVar2.b("Automatic data collection is disabled.");
            cVar2.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (sVar.f53524c) {
                task2 = sVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new oa.d(26));
            cVar2.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.f53498p.getTask();
            ExecutorService executorService = x.f53537a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            w wVar = new w(1, taskCompletionSource2);
            onSuccessTask.continueWith(wVar);
            task4.continueWith(wVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new g8(2, this, task));
    }
}
