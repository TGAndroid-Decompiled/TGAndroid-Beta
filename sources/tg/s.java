package tg;

import a8.r7;
import a8.xa;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import bi.j5;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import j$.util.Objects;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import m.o3;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.j6;
import org.telegram.messenger.jc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.rm;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.kn0;
public final class s implements org.telegram.ui.ActionBar.q1, OnSuccessListener, jc, w5.b, u9.d, rj0, wh.a, ua.a, d5.a {
    public final int f58215a;
    public final Object f58216b;

    public s(Object obj, int i7) {
        this.f58215a = i7;
        this.f58216b = obj;
    }

    @Override
    public boolean U0(View view) {
        return false;
    }

    @Override
    public void b(ua.b bVar) {
        x9.a aVar = (x9.a) this.f58216b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.f60554b.set((x9.a) bVar.get());
    }

    @Override
    public Object c(r7 r7Var) {
        ba.e eVar;
        String str;
        String str2;
        String str3;
        aa.t tVar;
        ba.e eVar2;
        int i7;
        int i10;
        int i11;
        Throwable th2;
        String str4;
        w9.b bVar;
        String str5;
        String str6;
        int i12;
        Task task;
        Task onSuccessTask;
        NetworkInfo activeNetworkInfo;
        ia.b a10;
        String replaceAll;
        switch (this.f58215a) {
            case 10:
                return this.f58216b;
            default:
                CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.f58216b;
                int i13 = CrashlyticsRegistrar.d;
                long currentTimeMillis = System.currentTimeMillis();
                o9.g gVar = (o9.g) r7Var.a(o9.g.class);
                va.d dVar = (va.d) r7Var.a(va.d.class);
                u9.o v = r7Var.v(x9.a.class);
                u9.o v10 = r7Var.v(p9.a.class);
                u9.o v11 = r7Var.v(fb.a.class);
                ExecutorService executorService = (ExecutorService) r7Var.e(crashlyticsRegistrar.f7546c);
                gVar.a();
                Context context = gVar.f21854a;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.1.1 for " + packageName, null);
                ba.e eVar3 = new ba.e((ExecutorService) r7Var.e(crashlyticsRegistrar.f7544a), (ExecutorService) r7Var.e(crashlyticsRegistrar.f7545b));
                ?? obj = new Object();
                String str7 = ((da.e1) x9.c.f60556a.b(context)).f8000a;
                obj.f13270a = str7;
                File filesDir = context.getFilesDir();
                obj.f13271b = filesDir;
                if (!str7.isEmpty()) {
                    eVar = eVar3;
                    StringBuilder sb2 = new StringBuilder(".crashlytics.v3");
                    sb2.append(File.separator);
                    str = "FirebaseCrashlytics";
                    if (str7.length() > 40) {
                        replaceAll = aa.g.i(str7);
                    } else {
                        replaceAll = str7.replaceAll("[^a-zA-Z0-9.]", "_");
                    }
                    sb2.append(replaceAll);
                    str2 = sb2.toString();
                } else {
                    eVar = eVar3;
                    str = "FirebaseCrashlytics";
                    str2 = ".com.google.firebase.crashlytics.files.v1";
                }
                File file = new File(filesDir, str2);
                ga.d.c(file);
                obj.f13272c = file;
                File file2 = new File(file, "open-sessions");
                ga.d.c(file2);
                obj.d = file2;
                File file3 = new File(file, "reports");
                ga.d.c(file3);
                obj.f13273e = file3;
                File file4 = new File(file, "priority-reports");
                ga.d.c(file4);
                obj.f13274f = file4;
                File file5 = new File(file, "native-reports");
                ga.d.c(file5);
                obj.h = file5;
                aa.w wVar = new aa.w(gVar);
                aa.a0 a0Var = new aa.a0(context, packageName, dVar, wVar);
                x9.a aVar = new x9.a(v);
                androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(v10);
                aa.j jVar = new aa.j(wVar, obj);
                hb.c cVar = hb.c.f14115a;
                hb.d dVar2 = hb.d.f14117a;
                hb.c cVar2 = hb.c.f14115a;
                hb.a a11 = hb.c.a(dVar2);
                if (a11.f14108b != null) {
                    Log.d("FirebaseSessions", "Subscriber " + dVar2 + " already registered.");
                } else {
                    a11.f14108b = jVar;
                    Log.d("FirebaseSessions", "Subscriber " + dVar2 + " registered.");
                    a11.f14107a.countDown();
                }
                String str8 = str;
                aa.t tVar2 = new aa.t(gVar, a0Var, aVar, wVar, new w9.a(fVar), new w9.a(fVar), obj, jVar, new nd0(v11, 26), eVar);
                ba.e eVar4 = eVar;
                aa.t tVar3 = tVar2;
                ba.e eVar5 = tVar3.f864n;
                gVar.a();
                String str9 = gVar.f21856c.f21867b;
                int e10 = aa.g.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (e10 == 0) {
                    e10 = aa.g.e(context, "com.crashlytics.android.build_id", "string");
                }
                if (e10 != 0) {
                    str3 = context.getResources().getString(e10);
                } else {
                    str3 = null;
                }
                ArrayList arrayList = new ArrayList();
                int e11 = aa.g.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int e12 = aa.g.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int e13 = aa.g.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (e11 == 0 || e12 == 0 || e13 == 0) {
                    tVar = tVar3;
                    eVar2 = eVar5;
                    i7 = 1;
                    i10 = 2;
                    Integer valueOf = Integer.valueOf(e11);
                    Integer valueOf2 = Integer.valueOf(e12);
                    Integer valueOf3 = Integer.valueOf(e13);
                    i11 = 3;
                    String format = String.format("Could not find resources: %d %d %d", valueOf, valueOf2, valueOf3);
                    if (Log.isLoggable(str8, 3)) {
                        th2 = null;
                        Log.d(str8, format, null);
                    } else {
                        th2 = null;
                    }
                } else {
                    i7 = 1;
                    String[] stringArray = context.getResources().getStringArray(e11);
                    String[] stringArray2 = context.getResources().getStringArray(e12);
                    String[] stringArray3 = context.getResources().getStringArray(e13);
                    i10 = 2;
                    if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
                        tVar = tVar3;
                        eVar2 = eVar5;
                        String format2 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        if (Log.isLoggable(str8, 3)) {
                            Log.d(str8, format2, null);
                        }
                    } else {
                        int i14 = 0;
                        while (i14 < stringArray3.length) {
                            int i15 = i14;
                            arrayList.add(new aa.d(stringArray[i15], stringArray2[i15], stringArray3[i15]));
                            i14 = i15 + 1;
                            eVar5 = eVar5;
                            tVar3 = tVar3;
                        }
                        tVar = tVar3;
                        eVar2 = eVar5;
                    }
                    th2 = null;
                    i11 = 3;
                }
                String k10 = p5.c.k("Mapping file ID is: ", str3);
                if (Log.isLoggable(str8, i11)) {
                    Log.d(str8, k10, th2);
                }
                int size = arrayList.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj2 = arrayList.get(i16);
                    i16++;
                    aa.d dVar3 = (aa.d) obj2;
                    String str10 = dVar3.f790a;
                    String str11 = dVar3.f791b;
                    String str12 = dVar3.f792c;
                    int i17 = size;
                    StringBuilder n10 = com.google.android.gms.internal.vision.e2.n("Build id for ", str10, " on ", str11, ": ");
                    n10.append(str12);
                    String sb3 = n10.toString();
                    if (Log.isLoggable(str8, 3)) {
                        Log.d(str8, sb3, null);
                    }
                    size = i17;
                }
                int i18 = i7;
                try {
                    aa.a a12 = aa.a.a(context, a0Var, str9, str3, arrayList, new s2.e(context));
                    String str13 = "Installer package name is: " + a12.d;
                    if (Log.isLoggable(str8, i10)) {
                        Log.v(str8, str13, null);
                    }
                    qb.a aVar2 = new qb.a(9);
                    String str14 = a12.f771f;
                    String str15 = a12.f772g;
                    String d = a0Var.d();
                    w7.s sVar = new w7.s(i18);
                    hi.u0 u0Var = new hi.u0(sVar, 5);
                    ?? obj3 = new Object();
                    obj3.f62043a = new File((File) obj.f13272c, "com.crashlytics.settings.json");
                    Locale locale = Locale.US;
                    ee.t tVar4 = new ee.t(a8.p0.p("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str9, "/settings"), aVar2);
                    String str16 = Build.MANUFACTURER;
                    String str17 = aa.a0.h;
                    String E = a8.p0.E(str16.replaceAll(str17, ""), "/", Build.MODEL.replaceAll(str17, ""));
                    String replaceAll2 = Build.VERSION.INCREMENTAL.replaceAll(str17, "");
                    String replaceAll3 = Build.VERSION.RELEASE.replaceAll(str17, "");
                    int e14 = aa.g.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (e14 == 0) {
                        e14 = aa.g.e(context, "com.crashlytics.android.build_id", "string");
                    }
                    if (e14 != 0) {
                        str5 = context.getResources().getString(e14);
                    } else {
                        str5 = null;
                    }
                    String[] strArr = {str5, str9, str15, str14};
                    ArrayList arrayList2 = new ArrayList();
                    int i19 = 0;
                    while (i19 < 4) {
                        String str18 = strArr[i19];
                        String[] strArr2 = strArr;
                        if (str18 != null) {
                            arrayList2.add(str18.replace("-", "").toLowerCase(Locale.US));
                        }
                        i19++;
                        strArr = strArr2;
                    }
                    Collections.sort(arrayList2);
                    StringBuilder sb4 = new StringBuilder();
                    int size2 = arrayList2.size();
                    int i20 = 0;
                    while (i20 < size2) {
                        Object obj4 = arrayList2.get(i20);
                        i20++;
                        sb4.append((String) obj4);
                        arrayList2 = arrayList2;
                    }
                    String sb5 = sb4.toString();
                    if (sb5.length() > 0) {
                        str6 = aa.g.i(sb5);
                    } else {
                        str6 = null;
                    }
                    if (d != null) {
                        i12 = 4;
                    } else {
                        i12 = 1;
                    }
                    ia.e eVar6 = new ia.e(str9, E, replaceAll2, replaceAll3, a0Var, str6, str15, str14, a8.p0.d(i12));
                    ?? obj5 = new Object();
                    AtomicReference atomicReference = new AtomicReference();
                    obj5.h = atomicReference;
                    obj5.f16285i = new AtomicReference(new TaskCompletionSource());
                    obj5.f16279a = context;
                    obj5.f16280b = eVar6;
                    obj5.d = sVar;
                    obj5.f16281c = u0Var;
                    obj5.f16282e = obj3;
                    obj5.f16283f = tVar4;
                    obj5.f16284g = wVar;
                    atomicReference.set(pb.b.u0(sVar));
                    AtomicReference atomicReference2 = (AtomicReference) obj5.f16285i;
                    AtomicReference atomicReference3 = (AtomicReference) obj5.h;
                    if (((Context) obj5.f16279a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals((String) ((ia.e) obj5.f16280b).f16291f) && (a10 = obj5.a(1)) != null) {
                        atomicReference3.set(a10);
                        ((TaskCompletionSource) atomicReference2.get()).trySetResult(a10);
                        onSuccessTask = Tasks.forResult(null);
                    } else {
                        ia.b a13 = obj5.a(3);
                        if (a13 != null) {
                            atomicReference3.set(a13);
                            ((TaskCompletionSource) atomicReference2.get()).trySetResult(a13);
                        }
                        aa.w wVar2 = (aa.w) obj5.f16284g;
                        Task task2 = wVar2.h.getTask();
                        synchronized (wVar2.f877c) {
                            task = wVar2.d.getTask();
                        }
                        onSuccessTask = ba.a.a(task2, task).onSuccessTask(eVar4.f3058a, new q4.q(28, (Object) obj5, eVar4));
                    }
                    onSuccessTask.addOnFailureListener(executorService, new ug.x(14));
                    aa.t tVar5 = tVar;
                    ga.d dVar4 = tVar5.h;
                    Context context2 = tVar5.f853a;
                    boolean c10 = aa.g.c(context2, "com.google.firebase.crashlytics.RequireBuildId", aa.g.c(context2, "com.crashlytics.RequireBuildId", true));
                    String str19 = a12.f768b;
                    if (!c10) {
                        str4 = str8;
                        if (Log.isLoggable(str4, 2)) {
                            Log.v(str4, "Configured not to require a build ID.", null);
                        }
                    } else {
                        str4 = str8;
                        if (TextUtils.isEmpty(str19)) {
                            Log.e(str4, ".");
                            Log.e(str4, ".     |  | ");
                            Log.e(str4, ".     |  |");
                            Log.e(str4, ".     |  |");
                            Log.e(str4, ".   \\ |  | /");
                            Log.e(str4, ".    \\    /");
                            Log.e(str4, ".     \\  /");
                            Log.e(str4, ".      \\/");
                            Log.e(str4, ".");
                            Log.e(str4, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                            Log.e(str4, ".");
                            Log.e(str4, ".      /\\");
                            Log.e(str4, ".     /  \\");
                            Log.e(str4, ".    /    \\");
                            Log.e(str4, ".   / |  | \\");
                            Log.e(str4, ".     |  |");
                            Log.e(str4, ".     |  |");
                            Log.e(str4, ".     |  |");
                            Log.e(str4, ".");
                            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                        }
                    }
                    String str20 = new aa.e().f798a;
                    try {
                        tVar5.f856e = new wf.b(2, "crash_marker", dVar4);
                        tVar5.d = new wf.b(2, "initialization_marker", dVar4);
                        ba.e eVar7 = eVar2;
                        o3 o3Var = new o3(str20, dVar4, eVar7);
                        ca.f fVar2 = new ca.f(dVar4);
                        wf.b bVar2 = new wf.b(new ja.a[]{new nb.a(12)});
                        ((u9.o) tVar5.f863m.f37766b).a(new x2.z0(2));
                        tVar5.f857f = new aa.p(tVar5.f853a, tVar5.f858g, tVar5.f854b, tVar5.h, tVar5.f856e, a12, o3Var, fVar2, aa.e0.d(tVar5.f853a, tVar5.f858g, tVar5.h, a12, fVar2, o3Var, bVar2, obj5, tVar5.f855c, tVar5.f861k, tVar5.f864n), tVar5.f862l, tVar5.f860j, tVar5.f861k, tVar5.f864n);
                        wf.b bVar3 = tVar5.d;
                        ga.d dVar5 = (ga.d) bVar3.f59801c;
                        dVar5.getClass();
                        boolean exists = new File((File) dVar5.f13272c, (String) bVar3.f59800b).exists();
                        try {
                            Boolean.TRUE.equals((Boolean) eVar7.f3058a.f3055a.submit(new aa.s(tVar5, 0)).get(3L, TimeUnit.SECONDS));
                        } catch (Exception unused) {
                        }
                        aa.p pVar = tVar5.f857f;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        pVar.f833e.f3058a.a(new a1.e(2, pVar, str20));
                        aa.v vVar = new aa.v(new ob.c(pVar, 1), obj5, defaultUncaughtExceptionHandler, pVar.f837j);
                        pVar.f841n = vVar;
                        Thread.setDefaultUncaughtExceptionHandler(vVar);
                        if (Build.VERSION.SDK_INT >= 37) {
                            tVar5.f857f.e(str20);
                        }
                        if (exists && (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting()))) {
                            if (Log.isLoggable(str4, 3)) {
                                Log.d(str4, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                            }
                            tVar5.b(obj5);
                        } else {
                            if (Log.isLoggable(str4, 3)) {
                                Log.d(str4, "Successfully configured exception handler.", null);
                            }
                            eVar7.f3058a.a(new aa.q(tVar5, obj5, 0));
                        }
                    } catch (Exception e15) {
                        Log.e(str4, "Crashlytics was not started due to an exception during initialization", e15);
                        tVar5.f857f = null;
                    }
                    bVar = new w9.b(tVar5);
                } catch (PackageManager.NameNotFoundException e16) {
                    str4 = str8;
                    Log.e(str4, "Error retrieving app package info.", e16);
                    bVar = null;
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis2 > 16) {
                    String j3 = p5.c.j(currentTimeMillis2, "Initializing Crashlytics blocked main for ", " ms");
                    if (Log.isLoggable(str4, 3)) {
                        Log.d(str4, j3, null);
                    }
                }
                return bVar;
        }
    }

    @Override
    public void f(WebView webView, xa xaVar, Uri uri, boolean z10, e5.f fVar) {
        e5.f fVar2;
        xi.i iVar = (xi.i) this.f58216b;
        if (webView == iVar.f60772o && z10 && uri != null && iVar.f60764f.equals(uri.toString()) && iVar.j(webView)) {
            int i7 = xaVar.f713b;
            if (i7 == 0) {
                xaVar.e(0);
                String str = (String) xaVar.f714c;
                if (!iVar.f60774q && str != null && str.startsWith("tproxy-base64:")) {
                    synchronized (iVar.f60760a) {
                        if (!iVar.f60778u && iVar.f60775r && iVar.f60773p == fVar) {
                            if (str.length() - 14 > 1398112) {
                                iVar.h();
                                return;
                            } else {
                                iVar.f60768k.execute(new v9.b(17, iVar, str));
                                return;
                            }
                        }
                        return;
                    }
                }
                iVar.i(str, fVar);
            } else if (i7 == 1) {
                synchronized (iVar.f60760a) {
                    if (!iVar.f60778u && (fVar2 = iVar.f60773p) != null && fVar2 == fVar) {
                        xaVar.e(1);
                        byte[] bArr = (byte[]) xaVar.d;
                        Objects.requireNonNull(bArr);
                        iVar.f60768k.execute(new v9.b(18, iVar, bArr));
                    }
                }
            }
        }
    }

    @Override
    public void g(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: tg.s.g(float, float, int, android.view.View):void");
    }

    @Override
    public Object h() {
        SQLiteDatabase a10;
        int i7 = this.f58215a;
        Object obj = this.f58216b;
        switch (i7) {
            case 6:
                v5.g gVar = (v5.g) ((v5.c) obj);
                gVar.getClass();
                int i10 = r5.a.f56582e;
                ?? obj2 = new Object();
                obj2.f60749a = null;
                obj2.f60750b = new ArrayList();
                obj2.f60751c = null;
                obj2.d = "";
                HashMap hashMap = new HashMap();
                a10 = gVar.a();
                a10.beginTransaction();
                try {
                    r5.a aVar = (r5.a) v5.g.h(a10.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new rm(gVar, hashMap, (Object) obj2, 16));
                    a10.setTransactionSuccessful();
                    return aVar;
                } finally {
                }
            case 7:
                v5.g gVar2 = (v5.g) ((v5.d) obj);
                long o4 = gVar2.f59408b.o() - gVar2.d.d;
                a10 = gVar2.a();
                a10.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(o4)};
                    Cursor rawQuery = a10.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        int i11 = rawQuery.getInt(0);
                        gVar2.e(i11, r5.c.MESSAGE_TOO_OLD, rawQuery.getString(1));
                    }
                    rawQuery.close();
                    int delete = a10.delete("events", "timestamp_ms < ?", strArr);
                    a10.setTransactionSuccessful();
                    a10.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            case 8:
                v5.g gVar3 = (v5.g) ((v5.c) ((ia.c) obj).f16285i);
                a10 = gVar3.a();
                a10.beginTransaction();
                try {
                    a10.compileStatement("DELETE FROM log_event_dropped").execute();
                    a10.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.f59408b.o()).execute();
                    a10.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                ab.c0 c0Var = (ab.c0) obj;
                for (o5.i iVar : (Iterable) ((v5.g) ((v5.d) c0Var.f909c)).c(new ug.x(7))) {
                    ((i61) c0Var.d).N(iVar, 1, false);
                }
                return null;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f58215a) {
            case 0:
                ((kn0) this.f58216b).run();
                return;
            case 1:
                ((f0) this.f58216b).f57895a.T1.r();
                return;
            case 12:
                ((wg.q0) this.f58216b).run();
                return;
            case 13:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.f58216b;
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    wg.b0.f1(Q, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    return;
                }
                return;
            case 14:
                ((ho) this.f58216b).run();
                return;
            default:
                ((wg.q0) this.f58216b).run();
                return;
        }
    }

    @Override
    public void j(Canvas canvas, int i7) {
        wh.h hVar = (wh.h) this.f58216b;
        hVar.getClass();
        canvas.save();
        RectF rectF = hVar.f60051r;
        canvas.translate(-rectF.left, (-rectF.top) + org.telegram.messenger.g0.L(30.0f));
        hVar.e(canvas, true, i7);
        canvas.restore();
    }

    @Override
    public void onSuccess(Object obj) {
        int i7 = this.f58215a;
        Object obj2 = this.f58216b;
        switch (i7) {
            case 2:
                s1 s1Var = (s1) obj2;
                zb.b bVar = (zb.b) obj;
                s1Var.E0 = true;
                s1Var.D0 = false;
                return;
            case 3:
                j5 j5Var = (j5) obj2;
                zb.b bVar2 = (zb.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < bVar2.f61930a.size(); i10++) {
                    zb.a aVar = (zb.a) bVar2.f61930a.get(i10);
                    ?? obj3 = new Object();
                    obj3.f57947a = aVar.f61926a;
                    obj3.f57948b = aVar.d;
                    obj3.f57949c = aVar.f61929e;
                    obj3.d = aVar.f61927b;
                    obj3.f57950e = aVar.f61928c;
                    arrayList.add(obj3);
                }
                j5Var.a(arrayList);
                return;
            default:
                i2 i2Var = (i2) obj2;
                List list = (List) obj;
                if (list.size() <= 0) {
                    a8.b("objimg: no objects");
                    return;
                }
                int i11 = ((wb.a) list.get(0)).f59785c;
                String str = null;
                if (c8.jc.f4841a == null) {
                    c8.jc.f4841a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i11 >= 0) {
                    String[] strArr = c8.jc.f4841a;
                    if (i11 < strArr.length) {
                        str = strArr[i11];
                    }
                }
                i2Var.f57964d0 = str;
                StringBuilder sb2 = new StringBuilder("objimg: detected #");
                sb2.append(((wb.a) list.get(0)).f59785c);
                sb2.append(" ");
                sb2.append(i2Var.f57964d0);
                sb2.append(" ");
                p5.c.s(((wb.a) list.get(0)).f59783a, sb2);
                j6.g(i2Var.f57964d0);
                return;
        }
    }

    @Override
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        nh0 C;
        j2 j2Var = (j2) this.f58216b;
        if (z10 && !z11 && (C = imageReceiver.C()) != null) {
            j2Var.q(C);
        }
    }

    @Override
    public void r(ImageReceiver imageReceiver) {
    }

    @Override
    public void J(int i7, Drawable drawable) {
    }

    @Override
    public void f0(View view, float f10, float f11) {
    }
}
