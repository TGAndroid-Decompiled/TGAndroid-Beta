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
import n7.a1;
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
    public static final ba.a f44935r = new ba.a(3);
    public final Context f44936a;
    public final r f44937b;
    public final a1 f44938c;
    public final q3 d;
    public final com.google.firebase.messaging.t e;
    public final u f44939f;
    public final ba.c f44940g;
    public final a h;
    public final x9.e f44941i;
    public final t9.a f44942j;
    public final u9.a f44943k;
    public final j f44944l;
    public final com.google.firebase.messaging.n f44945m;
    public q f44946n;
    public final TaskCompletionSource f44947o = new TaskCompletionSource();
    public final TaskCompletionSource f44948p = new TaskCompletionSource();
    public final TaskCompletionSource f44949q = new TaskCompletionSource();

    public m(Context context, com.google.firebase.messaging.t tVar, u uVar, r rVar, ba.c cVar, a1 a1Var, a aVar, q3 q3Var, x9.e eVar, com.google.firebase.messaging.n nVar, t9.a aVar2, u9.a aVar3, j jVar) {
        new AtomicBoolean(false);
        this.f44936a = context;
        this.e = tVar;
        this.f44939f = uVar;
        this.f44937b = rVar;
        this.f44940g = cVar;
        this.f44938c = a1Var;
        this.h = aVar;
        this.d = q3Var;
        this.f44941i = eVar;
        this.f44942j = aVar2;
        this.f44943k = aVar3;
        this.f44944l = jVar;
        this.f44945m = nVar;
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
        u uVar = mVar.f44939f;
        a aVar = mVar.h;
        String str2 = uVar.f44983c;
        String str3 = aVar.f44909f;
        String str4 = aVar.f44910g;
        String str5 = uVar.b().f44914a;
        if (aVar.d != null) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        c1 c1Var = new c1(str2, str3, str4, str5, w.f.c(i10), aVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        e1 e1Var = new e1(h.h());
        Context context = mVar.f44936a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        g gVar = g.f44921a;
        String str8 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str8)) {
            i11 = 3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            i11 = 3;
            g gVar2 = (g) g.f44922b.get(str8.toLowerCase(locale));
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
        mVar.f44942j.d(str, currentTimeMillis, new b1(c1Var, e1Var, new d1(ordinal, availableProcessors, d, b10, blockCount, g10)));
        if (bool.booleanValue() && str != null) {
            q3 q3Var = mVar.d;
            synchronized (((String) q3Var.f14290c)) {
                try {
                    q3Var.f14290c = str;
                    Map a2 = ((x9.d) ((AtomicMarkableReference) ((com.google.firebase.messaging.m) q3Var.d).f7329b).getReference()).a();
                    List g11 = ((b0) q3Var.f14291f).g();
                    if (((String) ((AtomicMarkableReference) q3Var.h).getReference()) != null) {
                        j3 = currentTimeMillis;
                        ((x9.f) q3Var.f14288a).i(str, (String) ((AtomicMarkableReference) q3Var.h).getReference());
                    } else {
                        j3 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((x9.f) q3Var.f14288a).g(str, a2, false);
                    }
                    if (!g11.isEmpty()) {
                        ((x9.f) q3Var.f14288a).h(str, g11);
                    }
                } finally {
                }
            }
        } else {
            j3 = currentTimeMillis;
        }
        x9.e eVar = mVar.f44941i;
        ((x9.c) eVar.f45714b).b();
        eVar.f45714b = x9.e.f45712c;
        if (str != null) {
            eVar.f45714b = new x9.k(((ba.c) eVar.f45713a).b(str, "userlog"));
        }
        mVar.f44944l.b(str);
        com.google.firebase.messaging.n nVar = mVar.f44945m;
        p pVar = (p) nVar.f7331a;
        Charset charset = e2.f46508a;
        ?? obj = new Object();
        obj.f43945a = "18.6.0";
        a aVar2 = pVar.f44968c;
        String str12 = aVar2.f44906a;
        if (str12 != null) {
            obj.f43946b = str12;
            u uVar2 = pVar.f44967b;
            String str13 = uVar2.b().f44914a;
            if (str13 != null) {
                obj.f43947c = str13;
                obj.d = uVar2.b().f44915b;
                String str14 = aVar2.f44909f;
                if (str14 != null) {
                    obj.f43952k = str14;
                    String str15 = aVar2.f44910g;
                    if (str15 != null) {
                        obj.f43948f = str15;
                        obj.f43950i = 4;
                        ?? obj2 = new Object();
                        obj2.f46522f = Boolean.FALSE;
                        obj2.d = Long.valueOf(j3);
                        if (str != null) {
                            obj2.f46520b = str;
                            String str16 = p.f44965g;
                            if (str16 != null) {
                                obj2.f46519a = str16;
                                String str17 = uVar2.f44983c;
                                if (str17 != null) {
                                    String str18 = uVar2.b().f44914a;
                                    a1 a1Var = aVar2.h;
                                    if (((c5.a) a1Var.f15109c) == null) {
                                        a1Var.f15109c = new c5.a(a1Var);
                                    }
                                    c5.a aVar3 = (c5.a) a1Var.f15109c;
                                    String str19 = aVar3.f3836a;
                                    if (aVar3 == null) {
                                        a1Var.f15109c = new c5.a(a1Var);
                                    }
                                    obj2.f46523g = new i0(str17, str14, str15, str18, str19, ((c5.a) a1Var.f15109c).f3837b);
                                    ?? obj3 = new Object();
                                    Integer valueOf = Integer.valueOf(i11);
                                    obj3.f15257a = valueOf;
                                    if (str6 != null) {
                                        obj3.f15258b = str6;
                                        if (str7 != null) {
                                            obj3.f15259c = str7;
                                            obj3.d = Boolean.valueOf(h.h());
                                            obj2.f46524i = obj3.g();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i13 = 7;
                                            if (!TextUtils.isEmpty(str8) && (num = (Integer) p.f44964f.get(str8.toLowerCase(locale))) != null) {
                                                i13 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long b11 = h.b(pVar.f44966a);
                                            long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                            boolean g12 = h.g();
                                            int d10 = h.d();
                                            ?? obj4 = new Object();
                                            obj4.f7576a = Integer.valueOf(i13);
                                            if (str9 != null) {
                                                obj4.f7577b = str9;
                                                obj4.f7578c = Integer.valueOf(availableProcessors2);
                                                obj4.d = Long.valueOf(b11);
                                                obj4.e = Long.valueOf(blockCount2);
                                                obj4.f7579f = Boolean.valueOf(g12);
                                                obj4.f7580g = Integer.valueOf(d10);
                                                if (str10 != null) {
                                                    obj4.h = str10;
                                                    if (str11 != null) {
                                                        obj4.f7581i = str11;
                                                        obj2.f46525j = obj4.b();
                                                        obj2.f46527l = valueOf;
                                                        obj.f43949g = obj2.a();
                                                        a0 a10 = obj.a();
                                                        ba.c cVar = ((ba.b) nVar.f7332b).f3444b;
                                                        d2 d2Var = a10.f46457j;
                                                        if (d2Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str20 = ((h0) d2Var).f46530b;
                                                        try {
                                                            ba.b.f3441g.getClass();
                                                            ba.b.f(cVar.b(str20, "report"), z9.a.f48739a.e(a10));
                                                            File b12 = cVar.b(str20, "start-time");
                                                            long j10 = ((h0) d2Var).d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), ba.b.e);
                                                            outputStreamWriter.write("");
                                                            b12.setLastModified(j10 * 1000);
                                                            outputStreamWriter.close();
                                                            return;
                                                        } catch (IOException e) {
                                                            String i14 = p6.i("Could not persist report for session ", str20);
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", i14, e);
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
        ba.c cVar = mVar.f44940g;
        for (File file : ba.c.e(cVar.f3447b.listFiles(f44935r))) {
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
            q qVar = this.f44946n;
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
        NavigableSet c10 = ((ba.b) this.f44945m.f7332b).c();
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
                    Context context = this.f44936a;
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
        TaskCompletionSource taskCompletionSource = this.f44947o;
        ba.c cVar = ((ba.b) this.f44945m.f7332b).f3444b;
        if (ba.c.e(cVar.d.listFiles()).isEmpty() && ba.c.e(cVar.e.listFiles()).isEmpty() && ba.c.e(cVar.f3449f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        t9.b bVar = t9.b.f43051a;
        bVar.c("Crash reports are available to be sent.");
        r rVar = this.f44937b;
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
            synchronized (rVar.f44974c) {
                task2 = rVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new Object());
            bVar.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.f44948p.getTask();
            ExecutorService executorService = x.f44990a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            w wVar = new w(1, taskCompletionSource2);
            onSuccessTask.continueWith(wVar);
            task4.continueWith(wVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new o0.a(this, task, false, 23));
    }
}
