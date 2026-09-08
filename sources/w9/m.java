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
import org.telegram.ui.Cells.p6;
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
    public static final ba.a f48430r = new ba.a(3);
    public final Context f48431a;
    public final r f48432b;
    public final o0.a f48433c;
    public final p3 d;
    public final com.google.firebase.messaging.s f48434e;
    public final u f48435f;
    public final ba.c f48436g;
    public final a h;
    public final x9.e f48437i;
    public final t9.a f48438j;
    public final u9.a f48439k;
    public final j f48440l;
    public final com.google.firebase.messaging.n f48441m;
    public q f48442n;
    public final TaskCompletionSource f48443o = new TaskCompletionSource();
    public final TaskCompletionSource f48444p = new TaskCompletionSource();
    public final TaskCompletionSource f48445q = new TaskCompletionSource();

    public m(Context context, com.google.firebase.messaging.s sVar, u uVar, r rVar, ba.c cVar, o0.a aVar, a aVar2, p3 p3Var, x9.e eVar, com.google.firebase.messaging.n nVar, t9.a aVar3, u9.a aVar4, j jVar) {
        new AtomicBoolean(false);
        this.f48431a = context;
        this.f48434e = sVar;
        this.f48435f = uVar;
        this.f48432b = rVar;
        this.f48436g = cVar;
        this.f48433c = aVar;
        this.h = aVar2;
        this.d = p3Var;
        this.f48437i = eVar;
        this.f48438j = aVar3;
        this.f48439k = aVar4;
        this.f48440l = jVar;
        this.f48441m = nVar;
    }

    public static void a(m mVar, String str, Boolean bool) {
        int i10;
        int i11;
        long j3;
        Integer num;
        mVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String i12 = p6.i("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", i12, null);
        }
        Locale locale = Locale.US;
        u uVar = mVar.f48435f;
        a aVar = mVar.h;
        String str2 = uVar.f48483c;
        String str3 = aVar.f48402f;
        String str4 = aVar.f48403g;
        String str5 = uVar.b().f48407a;
        if (aVar.d != null) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        c1 c1Var = new c1(str2, str3, str4, str5, w.f.c(i10), aVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        e1 e1Var = new e1(h.h());
        Context context = mVar.f48431a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        g gVar = g.f48414a;
        String str8 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str8)) {
            i11 = 3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            i11 = 3;
            g gVar2 = (g) g.f48415b.get(str8.toLowerCase(locale));
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
        mVar.f48438j.d(str, currentTimeMillis, new b1(c1Var, e1Var, new d1(ordinal, availableProcessors, d, b10, blockCount, g10)));
        if (bool.booleanValue() && str != null) {
            p3 p3Var = mVar.d;
            synchronized (((String) p3Var.f15663c)) {
                try {
                    p3Var.f15663c = str;
                    Map a2 = ((x9.d) ((AtomicMarkableReference) ((com.google.firebase.messaging.m) p3Var.d).f6399b).getReference()).a();
                    List g11 = ((b0) p3Var.f15665f).g();
                    if (((String) ((AtomicMarkableReference) p3Var.h).getReference()) != null) {
                        j3 = currentTimeMillis;
                        ((x9.f) p3Var.f15661a).i(str, (String) ((AtomicMarkableReference) p3Var.h).getReference());
                    } else {
                        j3 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((x9.f) p3Var.f15661a).g(str, a2, false);
                    }
                    if (!g11.isEmpty()) {
                        ((x9.f) p3Var.f15661a).h(str, g11);
                    }
                } finally {
                }
            }
        } else {
            j3 = currentTimeMillis;
        }
        x9.e eVar = mVar.f48437i;
        ((x9.c) eVar.f49336b).b();
        eVar.f49336b = x9.e.f49334c;
        if (str != null) {
            eVar.f49336b = new x9.k(((ba.c) eVar.f49335a).b(str, "userlog"));
        }
        mVar.f48440l.b(str);
        com.google.firebase.messaging.n nVar = mVar.f48441m;
        p pVar = (p) nVar.f6401a;
        Charset charset = e2.f49774a;
        ?? obj = new Object();
        obj.f47434a = "18.6.0";
        a aVar2 = pVar.f48465c;
        String str12 = aVar2.f48398a;
        if (str12 != null) {
            obj.f47435b = str12;
            u uVar2 = pVar.f48464b;
            String str13 = uVar2.b().f48407a;
            if (str13 != null) {
                obj.f47436c = str13;
                obj.d = uVar2.b().f48408b;
                String str14 = aVar2.f48402f;
                if (str14 != null) {
                    obj.f47442k = str14;
                    String str15 = aVar2.f48403g;
                    if (str15 != null) {
                        obj.f47438f = str15;
                        obj.f47440i = 4;
                        ?? obj2 = new Object();
                        obj2.f49790f = Boolean.FALSE;
                        obj2.d = Long.valueOf(j3);
                        if (str != null) {
                            obj2.f49787b = str;
                            String str16 = p.f48462g;
                            if (str16 != null) {
                                obj2.f49786a = str16;
                                String str17 = uVar2.f48483c;
                                if (str17 != null) {
                                    String str18 = uVar2.b().f48407a;
                                    z0 z0Var = aVar2.h;
                                    if (((c5.a) z0Var.f16731c) == null) {
                                        z0Var.f16731c = new c5.a(z0Var);
                                    }
                                    c5.a aVar3 = (c5.a) z0Var.f16731c;
                                    String str19 = aVar3.f4368a;
                                    if (aVar3 == null) {
                                        z0Var.f16731c = new c5.a(z0Var);
                                    }
                                    obj2.f49791g = new i0(str17, str14, str15, str18, str19, ((c5.a) z0Var.f16731c).f4369b);
                                    ?? obj3 = new Object();
                                    Integer valueOf = Integer.valueOf(i11);
                                    obj3.f9520a = valueOf;
                                    if (str6 != null) {
                                        obj3.f9521b = str6;
                                        if (str7 != null) {
                                            obj3.f9522c = str7;
                                            obj3.d = Boolean.valueOf(h.h());
                                            obj2.f49792i = obj3.h();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i13 = 7;
                                            if (!TextUtils.isEmpty(str8) && (num = (Integer) p.f48461f.get(str8.toLowerCase(locale))) != null) {
                                                i13 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long b11 = h.b(pVar.f48463a);
                                            long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                            boolean g12 = h.g();
                                            int d10 = h.d();
                                            ?? obj4 = new Object();
                                            obj4.f6678a = Integer.valueOf(i13);
                                            if (str9 != null) {
                                                obj4.f6679b = str9;
                                                obj4.f6680c = Integer.valueOf(availableProcessors2);
                                                obj4.d = Long.valueOf(b11);
                                                obj4.f6681e = Long.valueOf(blockCount2);
                                                obj4.f6682f = Boolean.valueOf(g12);
                                                obj4.f6683g = Integer.valueOf(d10);
                                                if (str10 != null) {
                                                    obj4.h = str10;
                                                    if (str11 != null) {
                                                        obj4.f6684i = str11;
                                                        obj2.f49793j = obj4.b();
                                                        obj2.f49795l = valueOf;
                                                        obj.f47439g = obj2.a();
                                                        a0 a10 = obj.a();
                                                        ba.c cVar = ((ba.b) nVar.f6402b).f2551b;
                                                        d2 d2Var = a10.f49718j;
                                                        if (d2Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str20 = ((h0) d2Var).f49798b;
                                                        try {
                                                            ba.b.f2548g.getClass();
                                                            ba.b.f(cVar.b(str20, "report"), z9.b.f51408a.y(a10));
                                                            File b12 = cVar.b(str20, "start-time");
                                                            long j10 = ((h0) d2Var).d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), ba.b.f2546e);
                                                            outputStreamWriter.write("");
                                                            b12.setLastModified(j10 * 1000);
                                                            outputStreamWriter.close();
                                                            return;
                                                        } catch (IOException e7) {
                                                            String i14 = p6.i("Could not persist report for session ", str20);
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
        ba.c cVar = mVar.f48436g;
        for (File file : ba.c.e(cVar.f2554b.listFiles(f48430r))) {
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
        if (Boolean.TRUE.equals(((ThreadLocal) this.f48434e.f6420e).get())) {
            q qVar = this.f48442n;
            if (qVar != null && qVar.f48470e.get()) {
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
        NavigableSet c10 = ((ba.b) this.f48441m.f6402b).c();
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
                    ((com.google.firebase.messaging.m) this.d.f15664e).u("com.crashlytics.version-control-info", f7);
                } catch (IllegalArgumentException e7) {
                    Context context = this.f48431a;
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
        TaskCompletionSource taskCompletionSource = this.f48443o;
        ba.c cVar = ((ba.b) this.f48441m.f6402b).f2551b;
        if (ba.c.e(cVar.d.listFiles()).isEmpty() && ba.c.e(cVar.f2556e.listFiles()).isEmpty() && ba.c.e(cVar.f2557f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        t9.b bVar = t9.b.f46507a;
        bVar.c("Crash reports are available to be sent.");
        r rVar = this.f48432b;
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
            synchronized (rVar.f48473c) {
                task2 = rVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new Object());
            bVar.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.f48444p.getTask();
            ExecutorService executorService = w.f48488a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            v vVar = new v(1, taskCompletionSource2);
            onSuccessTask.continueWith(vVar);
            task4.continueWith(vVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new z0(this, task, false, 23));
    }
}
