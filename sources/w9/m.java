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
import m.q3;
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
    public static final ba.a f50365r = new ba.a(3);
    public final Context f50366a;
    public final r f50367b;
    public final n6.k f50368c;
    public final q3 d;
    public final com.google.firebase.messaging.s f50369e;
    public final u f50370f;
    public final ba.c f50371g;
    public final a h;
    public final x9.e f50372i;
    public final t9.a f50373j;
    public final u9.a f50374k;
    public final j f50375l;
    public final com.google.firebase.messaging.n f50376m;
    public q f50377n;
    public final TaskCompletionSource f50378o = new TaskCompletionSource();
    public final TaskCompletionSource f50379p = new TaskCompletionSource();
    public final TaskCompletionSource f50380q = new TaskCompletionSource();

    public m(Context context, com.google.firebase.messaging.s sVar, u uVar, r rVar, ba.c cVar, n6.k kVar, a aVar, q3 q3Var, x9.e eVar, com.google.firebase.messaging.n nVar, t9.a aVar2, u9.a aVar3, j jVar) {
        new AtomicBoolean(false);
        this.f50366a = context;
        this.f50369e = sVar;
        this.f50370f = uVar;
        this.f50367b = rVar;
        this.f50371g = cVar;
        this.f50368c = kVar;
        this.h = aVar;
        this.d = q3Var;
        this.f50372i = eVar;
        this.f50373j = aVar2;
        this.f50374k = aVar3;
        this.f50375l = jVar;
        this.f50376m = nVar;
    }

    public static void a(m mVar, String str, Boolean bool) {
        int i10;
        int i11;
        long j3;
        Integer num;
        mVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String i12 = sc.v.i("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", i12, null);
        }
        Locale locale = Locale.US;
        u uVar = mVar.f50370f;
        a aVar = mVar.h;
        String str2 = uVar.f50418c;
        String str3 = aVar.f50337f;
        String str4 = aVar.f50338g;
        String str5 = uVar.b().f50342a;
        if (aVar.d != null) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        c1 c1Var = new c1(str2, str3, str4, str5, sc.v.c(i10), aVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        e1 e1Var = new e1(h.h());
        Context context = mVar.f50366a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        g gVar = g.f50349a;
        String str8 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str8)) {
            i11 = 3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            i11 = 3;
            g gVar2 = (g) g.f50350b.get(str8.toLowerCase(locale));
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
        mVar.f50373j.d(str, currentTimeMillis, new b1(c1Var, e1Var, new d1(ordinal, availableProcessors, d, b10, blockCount, g10)));
        if (bool.booleanValue() && str != null) {
            q3 q3Var = mVar.d;
            synchronized (((String) q3Var.f15858c)) {
                try {
                    q3Var.f15858c = str;
                    Map a2 = ((x9.d) ((AtomicMarkableReference) ((com.google.firebase.messaging.m) q3Var.d).f7951b).getReference()).a();
                    List k10 = ((b0) q3Var.f15860f).k();
                    if (((String) ((AtomicMarkableReference) q3Var.h).getReference()) != null) {
                        j3 = currentTimeMillis;
                        ((x9.f) q3Var.f15856a).i(str, (String) ((AtomicMarkableReference) q3Var.h).getReference());
                    } else {
                        j3 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((x9.f) q3Var.f15856a).g(str, a2, false);
                    }
                    if (!k10.isEmpty()) {
                        ((x9.f) q3Var.f15856a).h(str, k10);
                    }
                } finally {
                }
            }
        } else {
            j3 = currentTimeMillis;
        }
        x9.e eVar = mVar.f50372i;
        ((x9.c) eVar.f51204b).c();
        eVar.f51204b = x9.e.f51202c;
        if (str != null) {
            eVar.f51204b = new x9.k(((ba.c) eVar.f51203a).b(str, "userlog"));
        }
        mVar.f50375l.b(str);
        com.google.firebase.messaging.n nVar = mVar.f50376m;
        p pVar = (p) nVar.f7953a;
        Charset charset = e2.f52044a;
        ?? obj = new Object();
        obj.f49288a = "18.6.0";
        a aVar2 = pVar.f50400c;
        String str12 = aVar2.f50333a;
        if (str12 != null) {
            obj.f49289b = str12;
            u uVar2 = pVar.f50399b;
            String str13 = uVar2.b().f50342a;
            if (str13 != null) {
                obj.f49290c = str13;
                obj.d = uVar2.b().f50343b;
                String str14 = aVar2.f50337f;
                if (str14 != null) {
                    obj.f49296k = str14;
                    String str15 = aVar2.f50338g;
                    if (str15 != null) {
                        obj.f49292f = str15;
                        obj.f49294i = 4;
                        ?? obj2 = new Object();
                        obj2.f52060f = Boolean.FALSE;
                        obj2.d = Long.valueOf(j3);
                        if (str != null) {
                            obj2.f52057b = str;
                            String str16 = p.f50397g;
                            if (str16 != null) {
                                obj2.f52056a = str16;
                                String str17 = uVar2.f50418c;
                                if (str17 != null) {
                                    String str18 = uVar2.b().f50342a;
                                    n6.k kVar = aVar2.h;
                                    if (((c5.a) kVar.f16766c) == null) {
                                        kVar.f16766c = new c5.a(kVar);
                                    }
                                    c5.a aVar3 = (c5.a) kVar.f16766c;
                                    String str19 = aVar3.f4197a;
                                    if (aVar3 == null) {
                                        kVar.f16766c = new c5.a(kVar);
                                    }
                                    obj2.f52061g = new i0(str17, str14, str15, str18, str19, ((c5.a) kVar.f16766c).f4198b);
                                    ?? obj3 = new Object();
                                    Integer valueOf = Integer.valueOf(i11);
                                    obj3.f45972a = valueOf;
                                    if (str6 != null) {
                                        obj3.f45973b = str6;
                                        if (str7 != null) {
                                            obj3.f45974c = str7;
                                            obj3.d = Boolean.valueOf(h.h());
                                            obj2.f52062i = obj3.g();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i13 = 7;
                                            if (!TextUtils.isEmpty(str8) && (num = (Integer) p.f50396f.get(str8.toLowerCase(locale))) != null) {
                                                i13 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long b11 = h.b(pVar.f50398a);
                                            long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                            boolean g11 = h.g();
                                            int d10 = h.d();
                                            ?? obj4 = new Object();
                                            obj4.f8231a = Integer.valueOf(i13);
                                            if (str9 != null) {
                                                obj4.f8232b = str9;
                                                obj4.f8233c = Integer.valueOf(availableProcessors2);
                                                obj4.d = Long.valueOf(b11);
                                                obj4.f8234e = Long.valueOf(blockCount2);
                                                obj4.f8235f = Boolean.valueOf(g11);
                                                obj4.f8236g = Integer.valueOf(d10);
                                                if (str10 != null) {
                                                    obj4.h = str10;
                                                    if (str11 != null) {
                                                        obj4.f8237i = str11;
                                                        obj2.f52063j = obj4.b();
                                                        obj2.f52065l = valueOf;
                                                        obj.f49293g = obj2.a();
                                                        a0 a10 = obj.a();
                                                        ba.c cVar = ((ba.b) nVar.f7954b).f3797b;
                                                        d2 d2Var = a10.f51988j;
                                                        if (d2Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", i11)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str20 = ((h0) d2Var).f52068b;
                                                        try {
                                                            ba.b.f3794g.getClass();
                                                            ba.b.f(cVar.b(str20, "report"), z9.a.f54304a.T(a10));
                                                            File b12 = cVar.b(str20, "start-time");
                                                            long j10 = ((h0) d2Var).d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), ba.b.f3792e);
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

    public static Task b(m mVar) {
        Task call;
        mVar.getClass();
        ArrayList arrayList = new ArrayList();
        ba.c cVar = mVar.f50371g;
        for (File file : ba.c.e(cVar.f3800b.listFiles(f50365r))) {
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

    public final void c(boolean r29, da.c r30) {
        throw new UnsupportedOperationException("Method not decompiled: w9.m.c(boolean, da.c):void");
    }

    public final boolean d(da.c cVar) {
        if (Boolean.TRUE.equals(((ThreadLocal) this.f50369e.f7972e).get())) {
            q qVar = this.f50377n;
            if (qVar != null && qVar.f50405e.get()) {
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
        NavigableSet c10 = ((ba.b) this.f50376m.f7954b).c();
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
                    ((com.google.firebase.messaging.m) this.d.f15859e).x("com.crashlytics.version-control-info", f7);
                } catch (IllegalArgumentException e7) {
                    Context context = this.f50366a;
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
        TaskCompletionSource taskCompletionSource = this.f50378o;
        ba.c cVar = ((ba.b) this.f50376m.f7954b).f3797b;
        if (ba.c.e(cVar.d.listFiles()).isEmpty() && ba.c.e(cVar.f3802e.listFiles()).isEmpty() && ba.c.e(cVar.f3803f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        t9.b bVar = t9.b.f48369a;
        bVar.c("Crash reports are available to be sent.");
        r rVar = this.f50367b;
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
            synchronized (rVar.f50408c) {
                task2 = rVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new qb.b(25));
            bVar.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.f50379p.getTask();
            ExecutorService executorService = x.f50424a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            w wVar = new w(1, taskCompletionSource2);
            onSuccessTask.continueWith(wVar);
            task4.continueWith(wVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new z0(this, task, false, 22));
    }
}
