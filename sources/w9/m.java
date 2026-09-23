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
import n7.a1;
import org.telegram.ui.Cells.q3;
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
    public static final ba.a f44885r = new ba.a(3);
    public final Context f44886a;
    public final r f44887b;
    public final a1 f44888c;
    public final p3 d;
    public final com.google.firebase.messaging.t e;
    public final u f44889f;
    public final ba.c f44890g;
    public final a h;
    public final x9.e f44891i;
    public final t9.a f44892j;
    public final u9.a f44893k;
    public final j f44894l;
    public final com.google.firebase.messaging.n f44895m;
    public q f44896n;
    public final TaskCompletionSource f44897o = new TaskCompletionSource();
    public final TaskCompletionSource f44898p = new TaskCompletionSource();
    public final TaskCompletionSource f44899q = new TaskCompletionSource();

    public m(Context context, com.google.firebase.messaging.t tVar, u uVar, r rVar, ba.c cVar, a1 a1Var, a aVar, p3 p3Var, x9.e eVar, com.google.firebase.messaging.n nVar, t9.a aVar2, u9.a aVar3, j jVar) {
        new AtomicBoolean(false);
        this.f44886a = context;
        this.e = tVar;
        this.f44889f = uVar;
        this.f44887b = rVar;
        this.f44890g = cVar;
        this.f44888c = a1Var;
        this.h = aVar;
        this.d = p3Var;
        this.f44891i = eVar;
        this.f44892j = aVar2;
        this.f44893k = aVar3;
        this.f44894l = jVar;
        this.f44895m = nVar;
    }

    public static void a(m mVar, String str, Boolean bool) {
        int i10;
        int i11;
        long j3;
        Integer num;
        mVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String i12 = q3.i("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", i12, null);
        }
        Locale locale = Locale.US;
        u uVar = mVar.f44889f;
        a aVar = mVar.h;
        String str2 = uVar.f44933c;
        String str3 = aVar.f44859f;
        String str4 = aVar.f44860g;
        String str5 = uVar.b().f44864a;
        if (aVar.d != null) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        c1 c1Var = new c1(str2, str3, str4, str5, w.c.c(i10), aVar.h);
        String str6 = Build.VERSION.RELEASE;
        String str7 = Build.VERSION.CODENAME;
        e1 e1Var = new e1(h.h());
        Context context = mVar.f44886a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        g gVar = g.f44871a;
        String str8 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str8)) {
            i11 = 3;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            i11 = 3;
            g gVar2 = (g) g.f44872b.get(str8.toLowerCase(locale));
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
        mVar.f44892j.d(str, currentTimeMillis, new b1(c1Var, e1Var, new d1(ordinal, availableProcessors, d, b10, blockCount, g10)));
        if (bool.booleanValue() && str != null) {
            p3 p3Var = mVar.d;
            synchronized (((String) p3Var.f14272c)) {
                try {
                    p3Var.f14272c = str;
                    Map a2 = ((x9.d) ((AtomicMarkableReference) ((com.google.firebase.messaging.m) p3Var.d).f7317b).getReference()).a();
                    List g11 = ((b0) p3Var.f14273f).g();
                    if (((String) ((AtomicMarkableReference) p3Var.h).getReference()) != null) {
                        j3 = currentTimeMillis;
                        ((x9.f) p3Var.f14270a).i(str, (String) ((AtomicMarkableReference) p3Var.h).getReference());
                    } else {
                        j3 = currentTimeMillis;
                    }
                    if (!a2.isEmpty()) {
                        ((x9.f) p3Var.f14270a).g(str, a2, false);
                    }
                    if (!g11.isEmpty()) {
                        ((x9.f) p3Var.f14270a).h(str, g11);
                    }
                } finally {
                }
            }
        } else {
            j3 = currentTimeMillis;
        }
        x9.e eVar = mVar.f44891i;
        ((x9.c) eVar.f45664b).b();
        eVar.f45664b = x9.e.f45662c;
        if (str != null) {
            eVar.f45664b = new x9.k(((ba.c) eVar.f45663a).b(str, "userlog"));
        }
        mVar.f44894l.b(str);
        com.google.firebase.messaging.n nVar = mVar.f44895m;
        p pVar = (p) nVar.f7319a;
        Charset charset = e2.f46462a;
        ?? obj = new Object();
        obj.f43895a = "18.6.0";
        a aVar2 = pVar.f44918c;
        String str12 = aVar2.f44856a;
        if (str12 != null) {
            obj.f43896b = str12;
            u uVar2 = pVar.f44917b;
            String str13 = uVar2.b().f44864a;
            if (str13 != null) {
                obj.f43897c = str13;
                obj.d = uVar2.b().f44865b;
                String str14 = aVar2.f44859f;
                if (str14 != null) {
                    obj.f43902k = str14;
                    String str15 = aVar2.f44860g;
                    if (str15 != null) {
                        obj.f43898f = str15;
                        obj.f43900i = 4;
                        ?? obj2 = new Object();
                        obj2.f46476f = Boolean.FALSE;
                        obj2.d = Long.valueOf(j3);
                        if (str != null) {
                            obj2.f46474b = str;
                            String str16 = p.f44915g;
                            if (str16 != null) {
                                obj2.f46473a = str16;
                                String str17 = uVar2.f44933c;
                                if (str17 != null) {
                                    String str18 = uVar2.b().f44864a;
                                    a1 a1Var = aVar2.h;
                                    if (((c5.a) a1Var.f15084c) == null) {
                                        a1Var.f15084c = new c5.a(a1Var);
                                    }
                                    c5.a aVar3 = (c5.a) a1Var.f15084c;
                                    String str19 = aVar3.f3833a;
                                    if (aVar3 == null) {
                                        a1Var.f15084c = new c5.a(a1Var);
                                    }
                                    obj2.f46477g = new i0(str17, str14, str15, str18, str19, ((c5.a) a1Var.f15084c).f3834b);
                                    ?? obj3 = new Object();
                                    Integer valueOf = Integer.valueOf(i11);
                                    obj3.f15232a = valueOf;
                                    if (str6 != null) {
                                        obj3.f15233b = str6;
                                        if (str7 != null) {
                                            obj3.f15234c = str7;
                                            obj3.d = Boolean.valueOf(h.h());
                                            obj2.f46478i = obj3.g();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i13 = 7;
                                            if (!TextUtils.isEmpty(str8) && (num = (Integer) p.f44914f.get(str8.toLowerCase(locale))) != null) {
                                                i13 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long b11 = h.b(pVar.f44916a);
                                            long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                            boolean g12 = h.g();
                                            int d10 = h.d();
                                            ?? obj4 = new Object();
                                            obj4.f7564a = Integer.valueOf(i13);
                                            if (str9 != null) {
                                                obj4.f7565b = str9;
                                                obj4.f7566c = Integer.valueOf(availableProcessors2);
                                                obj4.d = Long.valueOf(b11);
                                                obj4.e = Long.valueOf(blockCount2);
                                                obj4.f7567f = Boolean.valueOf(g12);
                                                obj4.f7568g = Integer.valueOf(d10);
                                                if (str10 != null) {
                                                    obj4.h = str10;
                                                    if (str11 != null) {
                                                        obj4.f7569i = str11;
                                                        obj2.f46479j = obj4.b();
                                                        obj2.f46481l = valueOf;
                                                        obj.f43899g = obj2.a();
                                                        a0 a10 = obj.a();
                                                        ba.c cVar = ((ba.b) nVar.f7320b).f3441b;
                                                        d2 d2Var = a10.f46411j;
                                                        if (d2Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str20 = ((h0) d2Var).f46484b;
                                                        try {
                                                            ba.b.f3438g.getClass();
                                                            ba.b.f(cVar.b(str20, "report"), z9.a.f48682a.e(a10));
                                                            File b12 = cVar.b(str20, "start-time");
                                                            long j10 = ((h0) d2Var).d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), ba.b.e);
                                                            outputStreamWriter.write("");
                                                            b12.setLastModified(j10 * 1000);
                                                            outputStreamWriter.close();
                                                            return;
                                                        } catch (IOException e) {
                                                            String i14 = q3.i("Could not persist report for session ", str20);
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
        ba.c cVar = mVar.f44890g;
        for (File file : ba.c.e(cVar.f3444b.listFiles(f44885r))) {
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
            q qVar = this.f44896n;
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
        NavigableSet c10 = ((ba.b) this.f44895m.f7320b).c();
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
                    Context context = this.f44886a;
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
        TaskCompletionSource taskCompletionSource = this.f44897o;
        ba.c cVar = ((ba.b) this.f44895m.f7320b).f3441b;
        if (ba.c.e(cVar.d.listFiles()).isEmpty() && ba.c.e(cVar.e.listFiles()).isEmpty() && ba.c.e(cVar.f3446f.listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        t9.b bVar = t9.b.f43002a;
        bVar.c("Crash reports are available to be sent.");
        r rVar = this.f44887b;
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
            synchronized (rVar.f44924c) {
                task2 = rVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new Object());
            bVar.b("Waiting for send/deleteUnsentReports to be called.");
            Task task4 = this.f44898p.getTask();
            ExecutorService executorService = x.f44940a;
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            w wVar = new w(1, taskCompletionSource2);
            onSuccessTask.continueWith(wVar);
            task4.continueWith(wVar);
            task3 = taskCompletionSource2.getTask();
        }
        return task3.onSuccessTask(new o0.a(this, task, false, 23));
    }
}
