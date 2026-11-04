package z9;

import ai.z3;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import android.os.ProfilingTrigger;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import ca.d0;
import ca.n0;
import ca.o0;
import ca.p1;
import ca.q1;
import ca.r1;
import ca.s1;
import ca.t2;
import ca.u2;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import m.o3;
public final class m {
    public static final fa.a f60193r = new fa.a(3);
    public static final Charset f60194s = Charset.forName("UTF-8");
    public final Context f60195a;
    public final s f60196b;
    public final w9.b f60197c;
    public final o3 d;
    public final aa.g f60198e;
    public final v f60199f;
    public final fa.f f60200g;
    public final a h;
    public final ba.f f60201i;
    public final w9.a f60202j;
    public final x9.a f60203k;
    public final i f60204l;
    public final x f60205m;
    public r f60206n;
    public final TaskCompletionSource f60207o = new TaskCompletionSource();
    public final TaskCompletionSource f60208p = new TaskCompletionSource();
    public final TaskCompletionSource f60209q = new TaskCompletionSource();

    public m(Context context, v vVar, s sVar, fa.f fVar, w9.b bVar, a aVar, o3 o3Var, ba.f fVar2, x xVar, w9.a aVar2, x9.a aVar3, i iVar, aa.g gVar) {
        new AtomicBoolean(false);
        this.f60195a = context;
        this.f60199f = vVar;
        this.f60196b = sVar;
        this.f60200g = fVar;
        this.f60197c = bVar;
        this.h = aVar;
        this.d = o3Var;
        this.f60201i = fVar2;
        this.f60202j = aVar2;
        this.f60203k = aVar3;
        this.f60204l = iVar;
        this.f60205m = xVar;
        this.f60198e = gVar;
    }

    public static void a(m mVar, String str, ProfilingResult profilingResult) {
        String str2;
        int triggerType = profilingResult.getTriggerType();
        if (triggerType == 8) {
            str2 = "trigger-type-anomaly";
        } else if (triggerType == 7) {
            str2 = "trigger-type-oom";
        } else {
            str2 = "trigger-type-unknown";
        }
        try {
            if (!mVar.f60200g.b(str, str2).createNewFile()) {
                String str3 = "Trigger file " + str2 + " exists for session: " + str;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str3, null);
                }
            }
        } catch (IOException unused) {
            Log.e("FirebaseCrashlytics", "Unable to touch trigger file ".concat(str2), null);
        }
    }

    public static Task b(m mVar) {
        Task call;
        mVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : fa.f.i(((File) mVar.f60200g.d).listFiles(f60193r))) {
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

    public final void c(boolean r32, ha.c r33, boolean r34) {
        throw new UnsupportedOperationException("Method not decompiled: z9.m.c(boolean, ha.c, boolean):void");
    }

    public final void d(String str, Boolean bool) {
        int i3;
        String str2;
        String str3;
        String str4;
        String str5;
        int i10;
        Integer num;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String f10 = t4.c.f("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", f10, null);
        }
        Locale locale = Locale.US;
        v vVar = this.f60199f;
        a aVar = this.h;
        String str6 = vVar.f60251c;
        String str7 = aVar.f60162f;
        String str8 = aVar.f60163g;
        String str9 = vVar.c().f60167a;
        if (aVar.d != null) {
            i3 = 4;
        } else {
            i3 = 1;
        }
        q1 q1Var = new q1(str6, str7, str8, str9, t4.c.b(i3), aVar.h);
        String str10 = Build.VERSION.RELEASE;
        String str11 = Build.VERSION.CODENAME;
        s1 s1Var = new s1(g.h());
        Context context = this.f60195a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        f fVar = f.f60176a;
        String str12 = Build.CPU_ABI;
        if (TextUtils.isEmpty(str12)) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
            }
        } else {
            f fVar2 = (f) f.f60177b.get(str12.toLowerCase(locale));
            if (fVar2 != null) {
                fVar = fVar2;
            }
        }
        int ordinal = fVar.ordinal();
        String str13 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long a10 = g.a(context);
        boolean g7 = g.g();
        int d = g.d();
        String str14 = Build.MANUFACTURER;
        String str15 = Build.PRODUCT;
        this.f60202j.d(str, currentTimeMillis, new p1(q1Var, s1Var, new r1(ordinal, availableProcessors, d, a10, blockCount, g7)));
        if (bool.booleanValue() && str != null) {
            o3 o3Var = this.d;
            synchronized (((String) o3Var.f18684c)) {
                o3Var.f18684c = str;
                str4 = str15;
                str5 = str13;
                str2 = str11;
                str3 = str14;
                i10 = 4;
                ((aa.g) o3Var.f18683b).f287b.a(new z3(o3Var, str, ((ba.e) ((AtomicMarkableReference) ((b4.n) o3Var.d).f2378b).getReference()).a(), ((e5.u) o3Var.f18686f).l(), 2));
            }
        } else {
            str2 = str11;
            str3 = str14;
            str4 = str15;
            str5 = str13;
            i10 = 4;
        }
        ba.f fVar3 = this.f60201i;
        ((ba.d) fVar3.f3182b).b();
        fVar3.f3182b = ba.f.f3180c;
        if (str != null) {
            fVar3.f3182b = new ba.o(((fa.f) fVar3.f3181a).b(str, "userlog"));
        }
        this.f60204l.b(str);
        x xVar = this.f60205m;
        q qVar = xVar.f60257a;
        Charset charset = u2.f4561a;
        ?? obj = new Object();
        obj.f4312a = "20.1.1";
        a aVar2 = qVar.f60232c;
        String str16 = aVar2.f60158a;
        if (str16 != null) {
            obj.f4313b = str16;
            v vVar2 = qVar.f60231b;
            String str17 = vVar2.c().f60167a;
            if (str17 != null) {
                obj.d = str17;
                obj.f4315e = vVar2.c().f60168b;
                obj.f4316f = vVar2.c().f60169c;
                String str18 = aVar2.f60162f;
                if (str18 != null) {
                    obj.h = str18;
                    String str19 = aVar2.f60163g;
                    if (str19 != null) {
                        obj.f4318i = str19;
                        obj.f4314c = i10;
                        obj.f4322m = (byte) (obj.f4322m | 1);
                        ?? obj2 = new Object();
                        obj2.f4449f = false;
                        obj2.d = currentTimeMillis;
                        obj2.f4455m = (byte) (((byte) (obj2.f4455m | 2)) | 1);
                        if (str != null) {
                            obj2.f4446b = str;
                            String str20 = q.f60229g;
                            if (str20 != null) {
                                obj2.f4445a = str20;
                                String str21 = vVar2.f60251c;
                                if (str21 != null) {
                                    String str22 = vVar2.c().f60167a;
                                    w9.b bVar = aVar2.h;
                                    if (((e5.a) bVar.f57425c) == null) {
                                        bVar.f57425c = new e5.a(bVar);
                                    }
                                    e5.a aVar3 = (e5.a) bVar.f57425c;
                                    String str23 = aVar3.f9554b;
                                    if (aVar3 == null) {
                                        bVar.f57425c = new e5.a(bVar);
                                    }
                                    obj2.f4450g = new o0(str21, str18, str19, str22, str23, ((e5.a) bVar.f57425c).f9555c);
                                    ?? obj3 = new Object();
                                    obj3.f4456a = 3;
                                    obj3.f4459e = (byte) (obj3.f4459e | 1);
                                    if (str10 != null) {
                                        obj3.f4457b = str10;
                                        if (str2 != null) {
                                            obj3.f4458c = str2;
                                            obj3.d = g.h();
                                            obj3.f4459e = (byte) (obj3.f4459e | 2);
                                            obj2.f4451i = obj3.a();
                                            StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
                                            int i11 = 7;
                                            if (!TextUtils.isEmpty(str12) && (num = (Integer) q.f60228f.get(str12.toLowerCase(locale))) != null) {
                                                i11 = num.intValue();
                                            }
                                            int availableProcessors2 = Runtime.getRuntime().availableProcessors();
                                            long a11 = g.a(qVar.f60230a);
                                            long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
                                            boolean g10 = g.g();
                                            int d10 = g.d();
                                            ?? obj4 = new Object();
                                            obj4.f4500a = i11;
                                            byte b10 = (byte) (obj4.f4507j | 1);
                                            obj4.f4507j = b10;
                                            if (str5 != null) {
                                                obj4.f4501b = str5;
                                                obj4.f4502c = availableProcessors2;
                                                obj4.d = a11;
                                                obj4.f4503e = blockCount2;
                                                obj4.f4504f = g10;
                                                obj4.f4505g = d10;
                                                obj4.f4507j = (byte) (((byte) (((byte) (((byte) (((byte) (b10 | 2)) | 4)) | 8)) | 16)) | 32);
                                                String str24 = str3;
                                                if (str24 != null) {
                                                    obj4.h = str24;
                                                    String str25 = str4;
                                                    if (str25 != null) {
                                                        obj4.f4506i = str25;
                                                        obj2.f4452j = obj4.a();
                                                        obj2.f4454l = 3;
                                                        obj2.f4455m = (byte) (obj2.f4455m | 4);
                                                        obj.f4319j = obj2.a();
                                                        d0 a12 = obj.a();
                                                        fa.f fVar4 = xVar.f60258b.f11535b;
                                                        t2 t2Var = a12.f4345k;
                                                        if (t2Var == null) {
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        String str26 = ((n0) t2Var).f4465b;
                                                        try {
                                                            fa.d.f11532g.getClass();
                                                            fa.d.g(fVar4.b(str26, "report"), da.a.f8594a.d2(a12));
                                                            File b11 = fVar4.b(str26, "start-time");
                                                            long j10 = ((n0) t2Var).d;
                                                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b11), fa.d.f11530e);
                                                            outputStreamWriter.write("");
                                                            b11.setLastModified(j10 * 1000);
                                                            outputStreamWriter.close();
                                                            return;
                                                        } catch (IOException e10) {
                                                            String f11 = t4.c.f("Could not persist report for session ", str26);
                                                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                                                Log.d("FirebaseCrashlytics", f11, e10);
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

    public final void e(String str) {
        ExecutorService executorService = this.f60198e.f287b.f282a;
        ProfilingManager profilingManager = (ProfilingManager) this.f60195a.getSystemService(ProfilingManager.class);
        Object[] objArr = {new ProfilingTrigger.Builder(7).build(), new ProfilingTrigger.Builder(8).build()};
        ArrayList arrayList = new ArrayList(2);
        for (int i3 = 0; i3 < 2; i3++) {
            Object obj = objArr[i3];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        profilingManager.addProfilingTriggers(DesugarCollections.unmodifiableList(arrayList));
        profilingManager.registerForAllProfilingResults(executorService, new bi.d0(1, this, str));
    }

    public final boolean f(ha.c cVar) {
        aa.g.a();
        r rVar = this.f60206n;
        if (rVar != null && rVar.f60237e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            c(true, cVar, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    public final String g() {
        NavigableSet d = this.f60205m.f60258b.d();
        if (!d.isEmpty()) {
            return (String) d.first();
        }
        return null;
    }

    public final String h() {
        String string;
        InputStream resourceAsStream;
        Context context = this.f60195a;
        int e10 = g.e(context, "com.google.firebase.crashlytics.version_control_info", "string");
        if (e10 == 0) {
            string = null;
        } else {
            string = context.getResources().getString(e10);
        }
        if (string != null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Read version control info from string resource", null);
            }
            return Base64.encodeToString(string.getBytes(f60194s), 0);
        }
        ClassLoader classLoader = m.class.getClassLoader();
        if (classLoader == null) {
            Log.w("FirebaseCrashlytics", "Couldn't get Class Loader", null);
            resourceAsStream = null;
        } else {
            resourceAsStream = classLoader.getResourceAsStream("META-INF/version-control-info.textproto");
        }
        if (resourceAsStream != null) {
            try {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Read version control info from file", null);
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = resourceAsStream.read(bArr);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        String encodeToString = Base64.encodeToString(byteArray, 0);
                        resourceAsStream.close();
                        return encodeToString;
                    }
                }
            } catch (Throwable th2) {
                try {
                    resourceAsStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } else {
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            Log.i("FirebaseCrashlytics", "No version control information found", null);
            return null;
        }
    }

    public final void i() {
        boolean z10;
        try {
            String h = h();
            if (h != null) {
                try {
                    ((b4.n) this.d.f18685e).B("com.crashlytics.version-control-info", h);
                } catch (IllegalArgumentException e10) {
                    Context context = this.f60195a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            throw e10;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                }
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e11) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e11);
        }
    }

    public final void j(Task task) {
        Task task2;
        Task a10;
        TaskCompletionSource taskCompletionSource = this.f60207o;
        fa.f fVar = this.f60205m.f60258b.f11535b;
        if (fa.f.i(((File) fVar.f11542f).listFiles()).isEmpty() && fa.f.i(((File) fVar.h).listFiles()).isEmpty() && fa.f.i(((File) fVar.f11543n).listFiles()).isEmpty()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            return;
        }
        w9.c cVar = w9.c.f57426a;
        cVar.c("Crash reports are available to be sent.");
        s sVar = this.f60196b;
        if (sVar.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            taskCompletionSource.trySetResult(Boolean.FALSE);
            a10 = Tasks.forResult(Boolean.TRUE);
        } else {
            cVar.b("Automatic data collection is disabled.");
            cVar.c("Notifying that unsent reports are available.");
            taskCompletionSource.trySetResult(Boolean.TRUE);
            synchronized (sVar.f60240c) {
                task2 = sVar.d.getTask();
            }
            Task onSuccessTask = task2.onSuccessTask(new mb.b(29));
            cVar.b("Waiting for send/deleteUnsentReports to be called.");
            a10 = aa.b.a(onSuccessTask, this.f60208p.getTask());
        }
        a10.onSuccessTask(this.f60198e.f286a, new ua.b(this, task, false, 9));
    }
}
