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
import bi.d5;
import c8.ic;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import hi.u5;
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
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.rm;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.nd0;
public final class z1 implements OnSuccessListener, jc, w5.b, u9.d, org.telegram.ui.ActionBar.r1, pj0, wh.a, ua.a, d5.a {
    public final int f58196a;
    public final Object f58197b;

    public z1(Object obj, int i7) {
        this.f58196a = i7;
        this.f58197b = obj;
    }

    @Override
    public void b(ua.b bVar) {
        x9.a aVar = (x9.a) this.f58197b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.f60426b.set((x9.a) bVar.get());
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public Object e(r7 r7Var) {
        String str;
        aa.t tVar;
        ba.e eVar;
        int i7;
        int i10;
        int i11;
        Throwable th2;
        String str2;
        w9.b bVar;
        aa.a a10;
        String str3;
        String str4;
        String d;
        w7.s sVar;
        u5 u5Var;
        h9.g1 g1Var;
        String p10;
        ?? obj;
        String str5;
        String str6;
        int i12;
        Task task;
        Task onSuccessTask;
        NetworkInfo activeNetworkInfo;
        ia.b a11;
        switch (this.f58196a) {
            case 7:
                return this.f58197b;
            default:
                CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.f58197b;
                int i13 = CrashlyticsRegistrar.d;
                long currentTimeMillis = System.currentTimeMillis();
                o9.g gVar = (o9.g) r7Var.a(o9.g.class);
                u9.o s5 = r7Var.s(x9.a.class);
                u9.o s9 = r7Var.s(p9.a.class);
                u9.o s10 = r7Var.s(fb.a.class);
                ExecutorService executorService = (ExecutorService) r7Var.e(crashlyticsRegistrar.f7552c);
                gVar.a();
                Context context = gVar.f21760a;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.1.1 for " + packageName, null);
                ba.e eVar2 = new ba.e((ExecutorService) r7Var.e(crashlyticsRegistrar.f7550a), (ExecutorService) r7Var.e(crashlyticsRegistrar.f7551b));
                ga.d dVar = new ga.d(context);
                aa.w wVar = new aa.w(gVar);
                aa.a0 a0Var = new aa.a0(context, packageName, (va.d) r7Var.a(va.d.class), wVar);
                x9.a aVar = new x9.a(s5);
                androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(s9);
                aa.j jVar = new aa.j(wVar, dVar);
                hb.c cVar = hb.c.f14120a;
                hb.d dVar2 = hb.d.f14122a;
                hb.c cVar2 = hb.c.f14120a;
                hb.a a12 = hb.c.a(dVar2);
                if (a12.f14113b != null) {
                    Log.d("FirebaseSessions", "Subscriber " + dVar2 + " already registered.");
                } else {
                    a12.f14113b = jVar;
                    Log.d("FirebaseSessions", "Subscriber " + dVar2 + " registered.");
                    a12.f14112a.countDown();
                }
                aa.t tVar2 = new aa.t(gVar, a0Var, aVar, wVar, new w9.a(fVar), new w9.a(fVar), dVar, jVar, new v4.f0(s10), eVar2);
                ba.e eVar3 = tVar2.f864n;
                gVar.a();
                String str7 = gVar.f21762c.f21773b;
                int e10 = aa.g.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (e10 == 0) {
                    e10 = aa.g.e(context, "com.crashlytics.android.build_id", "string");
                }
                if (e10 != 0) {
                    str = context.getResources().getString(e10);
                } else {
                    str = null;
                }
                ArrayList arrayList = new ArrayList();
                int e11 = aa.g.e(context, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int e12 = aa.g.e(context, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int e13 = aa.g.e(context, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                if (e11 == 0 || e12 == 0 || e13 == 0) {
                    tVar = tVar2;
                    eVar = eVar3;
                    i7 = 1;
                    i10 = 2;
                    i11 = 3;
                    String format = String.format("Could not find resources: %d %d %d", Integer.valueOf(e11), Integer.valueOf(e12), Integer.valueOf(e13));
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        th2 = null;
                        Log.d("FirebaseCrashlytics", format, null);
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
                        tVar = tVar2;
                        eVar = eVar3;
                        String format2 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", format2, null);
                        }
                    } else {
                        int i14 = 0;
                        while (i14 < stringArray3.length) {
                            int i15 = i14;
                            arrayList.add(new aa.d(stringArray[i15], stringArray2[i15], stringArray3[i15]));
                            i14 = i15 + 1;
                            eVar3 = eVar3;
                            tVar2 = tVar2;
                        }
                        tVar = tVar2;
                        eVar = eVar3;
                    }
                    th2 = null;
                    i11 = 3;
                }
                String k10 = p5.c.k("Mapping file ID is: ", str);
                if (Log.isLoggable("FirebaseCrashlytics", i11)) {
                    Log.d("FirebaseCrashlytics", k10, th2);
                }
                int size = arrayList.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj2 = arrayList.get(i16);
                    i16++;
                    aa.d dVar3 = (aa.d) obj2;
                    String str8 = dVar3.f790a;
                    String str9 = dVar3.f791b;
                    String str10 = dVar3.f792c;
                    int i17 = size;
                    StringBuilder n10 = com.google.android.gms.internal.vision.e2.n("Build id for ", str8, " on ", str9, ": ");
                    n10.append(str10);
                    String sb2 = n10.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", sb2, null);
                    }
                    size = i17;
                }
                int i18 = i7;
                try {
                    a10 = aa.a.a(context, a0Var, str7, str, arrayList, new sg.h0(context));
                    String str11 = "Installer package name is: " + a10.d;
                    if (Log.isLoggable("FirebaseCrashlytics", i10)) {
                        Log.v("FirebaseCrashlytics", str11, null);
                    }
                    new qb.a(9);
                    str3 = a10.f771f;
                    str4 = a10.f772g;
                    d = a0Var.d();
                    sVar = new w7.s(i18);
                    u5Var = new u5(sVar, 3);
                    g1Var = new h9.g1(dVar);
                    Locale locale = Locale.US;
                    p10 = a8.p0.p("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str7, "/settings");
                    obj = new Object();
                } catch (PackageManager.NameNotFoundException e14) {
                    str2 = "FirebaseCrashlytics";
                    Log.e(str2, "Error retrieving app package info.", e14);
                    bVar = null;
                }
                if (p10 != null) {
                    obj.f11286a = p10;
                    String str12 = Build.MANUFACTURER;
                    String str13 = aa.a0.h;
                    String E = a8.p0.E(str12.replaceAll(str13, ""), "/", Build.MODEL.replaceAll(str13, ""));
                    String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str13, "");
                    String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str13, "");
                    int e15 = aa.g.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (e15 == 0) {
                        e15 = aa.g.e(context, "com.crashlytics.android.build_id", "string");
                    }
                    if (e15 != 0) {
                        str5 = context.getResources().getString(e15);
                    } else {
                        str5 = null;
                    }
                    String[] strArr = {str5, str7, str4, str3};
                    ArrayList arrayList2 = new ArrayList();
                    int i19 = 0;
                    while (i19 < 4) {
                        String str14 = strArr[i19];
                        String[] strArr2 = strArr;
                        if (str14 != null) {
                            arrayList2.add(str14.replace("-", "").toLowerCase(Locale.US));
                        }
                        i19++;
                        strArr = strArr2;
                    }
                    Collections.sort(arrayList2);
                    StringBuilder sb3 = new StringBuilder();
                    int size2 = arrayList2.size();
                    int i20 = 0;
                    while (i20 < size2) {
                        Object obj3 = arrayList2.get(i20);
                        i20++;
                        sb3.append((String) obj3);
                        arrayList2 = arrayList2;
                    }
                    String sb4 = sb3.toString();
                    if (sb4.length() > 0) {
                        str6 = aa.g.i(sb4);
                    } else {
                        str6 = null;
                    }
                    if (d != null) {
                        i12 = 4;
                    } else {
                        i12 = 1;
                    }
                    ia.e eVar4 = new ia.e(str7, E, replaceAll, replaceAll2, a0Var, str6, str4, str3, a8.p0.d(i12));
                    ?? obj4 = new Object();
                    AtomicReference atomicReference = new AtomicReference();
                    obj4.h = atomicReference;
                    obj4.f16194i = new AtomicReference(new TaskCompletionSource());
                    obj4.f16188a = context;
                    obj4.f16189b = eVar4;
                    obj4.d = sVar;
                    obj4.f16190c = u5Var;
                    obj4.f16191e = g1Var;
                    obj4.f16192f = obj;
                    obj4.f16193g = wVar;
                    atomicReference.set(pb.b.D0(sVar));
                    AtomicReference atomicReference2 = (AtomicReference) obj4.f16194i;
                    AtomicReference atomicReference3 = (AtomicReference) obj4.h;
                    if (((Context) obj4.f16188a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals((String) ((ia.e) obj4.f16189b).f16200f) && (a11 = obj4.a(1)) != null) {
                        atomicReference3.set(a11);
                        ((TaskCompletionSource) atomicReference2.get()).trySetResult(a11);
                        onSuccessTask = Tasks.forResult(null);
                    } else {
                        ia.b a13 = obj4.a(3);
                        if (a13 != null) {
                            atomicReference3.set(a13);
                            ((TaskCompletionSource) atomicReference2.get()).trySetResult(a13);
                        }
                        aa.w wVar2 = (aa.w) obj4.f16193g;
                        Task task2 = wVar2.h.getTask();
                        synchronized (wVar2.f877c) {
                            task = wVar2.d.getTask();
                        }
                        onSuccessTask = ba.a.a(task2, task).onSuccessTask(eVar2.f3088a, new q4.q(27, (Object) obj4, eVar2));
                    }
                    onSuccessTask.addOnFailureListener(executorService, new ug.x(14));
                    aa.t tVar3 = tVar;
                    ga.d dVar4 = tVar3.h;
                    Context context2 = tVar3.f853a;
                    boolean c10 = aa.g.c(context2, "com.google.firebase.crashlytics.RequireBuildId", aa.g.c(context2, "com.crashlytics.RequireBuildId", true));
                    String str15 = a10.f768b;
                    if (!c10) {
                        str2 = "FirebaseCrashlytics";
                        if (Log.isLoggable(str2, 2)) {
                            Log.v(str2, "Configured not to require a build ID.", null);
                        }
                    } else {
                        str2 = "FirebaseCrashlytics";
                        if (TextUtils.isEmpty(str15)) {
                            Log.e(str2, ".");
                            Log.e(str2, ".     |  | ");
                            Log.e(str2, ".     |  |");
                            Log.e(str2, ".     |  |");
                            Log.e(str2, ".   \\ |  | /");
                            Log.e(str2, ".    \\    /");
                            Log.e(str2, ".     \\  /");
                            Log.e(str2, ".      \\/");
                            Log.e(str2, ".");
                            Log.e(str2, "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                            Log.e(str2, ".");
                            Log.e(str2, ".      /\\");
                            Log.e(str2, ".     /  \\");
                            Log.e(str2, ".    /    \\");
                            Log.e(str2, ".   / |  | \\");
                            Log.e(str2, ".     |  |");
                            Log.e(str2, ".     |  |");
                            Log.e(str2, ".     |  |");
                            Log.e(str2, ".");
                            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                        }
                    }
                    String str16 = new aa.e().f798a;
                    try {
                        tVar3.f856e = new wf.b(2, "crash_marker", dVar4);
                        tVar3.d = new wf.b(2, "initialization_marker", dVar4);
                        ba.e eVar5 = eVar;
                        o3 o3Var = new o3(str16, dVar4, eVar5);
                        ca.f fVar2 = new ca.f(dVar4);
                        wf.b bVar2 = new wf.b(new ja.a[]{new nb.a(12)});
                        ((u9.o) tVar3.f863m.f59121a).a(new x2.z0(2));
                        tVar3.f857f = new aa.p(tVar3.f853a, tVar3.f858g, tVar3.f854b, tVar3.h, tVar3.f856e, a10, o3Var, fVar2, aa.e0.d(tVar3.f853a, tVar3.f858g, tVar3.h, a10, fVar2, o3Var, bVar2, obj4, tVar3.f855c, tVar3.f861k, tVar3.f864n), tVar3.f862l, tVar3.f860j, tVar3.f861k, tVar3.f864n);
                        wf.b bVar3 = tVar3.d;
                        ga.d dVar5 = (ga.d) bVar3.f59674c;
                        dVar5.getClass();
                        boolean exists = new File((File) dVar5.d, (String) bVar3.f59673b).exists();
                        try {
                            Boolean.TRUE.equals((Boolean) eVar5.f3088a.f3085a.submit(new aa.s(tVar3, 0)).get(3L, TimeUnit.SECONDS));
                        } catch (Exception unused) {
                        }
                        aa.p pVar = tVar3.f857f;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        pVar.f833e.f3088a.a(new a1.e(2, pVar, str16));
                        aa.v vVar = new aa.v(new ob.c(pVar, 1), obj4, defaultUncaughtExceptionHandler, pVar.f837j);
                        pVar.f841n = vVar;
                        Thread.setDefaultUncaughtExceptionHandler(vVar);
                        if (Build.VERSION.SDK_INT >= 37) {
                            tVar3.f857f.e(str16);
                        }
                        if (exists && (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting()))) {
                            if (Log.isLoggable(str2, 3)) {
                                Log.d(str2, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                            }
                            tVar3.b(obj4);
                        } else {
                            if (Log.isLoggable(str2, 3)) {
                                Log.d(str2, "Successfully configured exception handler.", null);
                            }
                            eVar5.f3088a.a(new aa.q(tVar3, obj4, 0));
                        }
                    } catch (Exception e16) {
                        Log.e(str2, "Crashlytics was not started due to an exception during initialization", e16);
                        tVar3.f857f = null;
                    }
                    bVar = new w9.b(tVar3);
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    if (currentTimeMillis2 > 16) {
                        String j3 = p5.c.j(currentTimeMillis2, "Initializing Crashlytics blocked main for ", " ms");
                        if (Log.isLoggable(str2, 3)) {
                            Log.d(str2, j3, null);
                        }
                    }
                    return bVar;
                }
                throw new IllegalArgumentException("url must not be null.");
        }
    }

    @Override
    public void f(float r18, float r19, int r20, android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: tg.z1.f(float, float, int, android.view.View):void");
    }

    @Override
    public Object g() {
        SQLiteDatabase a10;
        int i7 = this.f58196a;
        Object obj = this.f58197b;
        switch (i7) {
            case 3:
                v5.g gVar = (v5.g) ((v5.c) obj);
                gVar.getClass();
                int i10 = r5.a.f56459e;
                ?? obj2 = new Object();
                obj2.f60621a = null;
                obj2.f60622b = new ArrayList();
                obj2.f60623c = null;
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
            case 4:
                v5.g gVar2 = (v5.g) ((v5.d) obj);
                long r10 = gVar2.f59284b.r() - gVar2.d.d;
                a10 = gVar2.a();
                a10.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(r10)};
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
            case 5:
                v5.g gVar3 = (v5.g) ((v5.c) ((ia.c) obj).f16194i);
                a10 = gVar3.a();
                a10.beginTransaction();
                try {
                    a10.compileStatement("DELETE FROM log_event_dropped").execute();
                    a10.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + gVar3.f59284b.r()).execute();
                    a10.setTransactionSuccessful();
                    return null;
                } finally {
                }
            default:
                ab.c0 c0Var = (ab.c0) obj;
                for (o5.i iVar : (Iterable) ((v5.g) ((v5.d) c0Var.f909c)).c(new ug.x(7))) {
                    ((nd0) c0Var.d).H(iVar, 1, false);
                }
                return null;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f58196a) {
            case 9:
                ((wg.r0) this.f58197b).run();
                return;
            case 10:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.f58197b;
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q != null) {
                    wg.c0.f1(Q, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    return;
                }
                return;
            case 11:
                ((io) this.f58197b).run();
                return;
            default:
                ((wg.r0) this.f58197b).run();
                return;
        }
    }

    @Override
    public void i(WebView webView, xa xaVar, Uri uri, boolean z10, e5.f fVar) {
        e5.f fVar2;
        xi.i iVar = (xi.i) this.f58197b;
        if (webView == iVar.f60644o && z10 && uri != null && iVar.f60636f.equals(uri.toString()) && iVar.j(webView)) {
            int i7 = xaVar.f713b;
            if (i7 == 0) {
                xaVar.f(0);
                String str = (String) xaVar.f714c;
                if (!iVar.f60646q && str != null && str.startsWith("tproxy-base64:")) {
                    synchronized (iVar.f60632a) {
                        if (!iVar.f60650u && iVar.f60647r && iVar.f60645p == fVar) {
                            if (str.length() - 14 > 1398112) {
                                iVar.h();
                                return;
                            } else {
                                iVar.f60640k.execute(new wg.r(11, iVar, str));
                                return;
                            }
                        }
                        return;
                    }
                }
                iVar.i(str, fVar);
            } else if (i7 == 1) {
                synchronized (iVar.f60632a) {
                    if (!iVar.f60650u && (fVar2 = iVar.f60645p) != null && fVar2 == fVar) {
                        xaVar.f(1);
                        byte[] bArr = (byte[]) xaVar.d;
                        Objects.requireNonNull(bArr);
                        iVar.f60640k.execute(new wg.r(12, iVar, bArr));
                    }
                }
            }
        }
    }

    @Override
    public void m(Canvas canvas, int i7) {
        wh.h hVar = (wh.h) this.f58197b;
        hVar.getClass();
        canvas.save();
        RectF rectF = hVar.f59923r;
        canvas.translate(-rectF.left, (-rectF.top) + org.telegram.messenger.g0.L(30.0f));
        hVar.e(canvas, true, i7);
        canvas.restore();
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        mh0 B;
        f2 f2Var = (f2) this.f58197b;
        if (z10 && !z11 && (B = imageReceiver.B()) != null) {
            f2Var.q(B);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        int i7 = this.f58196a;
        Object obj2 = this.f58197b;
        switch (i7) {
            case 0:
                d5 d5Var = (d5) obj2;
                zb.b bVar = (zb.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < bVar.f61801a.size(); i10++) {
                    zb.a aVar = (zb.a) bVar.f61801a.get(i10);
                    ?? obj3 = new Object();
                    obj3.f57781a = aVar.f61797a;
                    obj3.f57782b = aVar.d;
                    obj3.f57783c = aVar.f61800e;
                    obj3.d = aVar.f61798b;
                    obj3.f57784e = aVar.f61799c;
                    arrayList.add(obj3);
                }
                d5Var.a(arrayList);
                return;
            default:
                e2 e2Var = (e2) obj2;
                List list = (List) obj;
                if (list.size() <= 0) {
                    a8.b("objimg: no objects");
                    return;
                }
                int i11 = ((wb.a) list.get(0)).f59658c;
                String str = null;
                if (ic.f4829a == null) {
                    ic.f4829a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                }
                if (i11 >= 0) {
                    String[] strArr = ic.f4829a;
                    if (i11 < strArr.length) {
                        str = strArr[i11];
                    }
                }
                e2Var.f57807d0 = str;
                StringBuilder sb2 = new StringBuilder("objimg: detected #");
                sb2.append(((wb.a) list.get(0)).f59658c);
                sb2.append(" ");
                sb2.append(e2Var.f57807d0);
                sb2.append(" ");
                p5.c.s(((wb.a) list.get(0)).f59656a, sb2);
                j6.g(e2Var.f57807d0);
                return;
        }
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
