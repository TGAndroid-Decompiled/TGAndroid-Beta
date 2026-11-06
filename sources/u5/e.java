package u5;

import a8.p0;
import a8.r7;
import a8.wa;
import aa.b0;
import aa.f0;
import aa.r;
import aa.t;
import aa.u;
import aa.w;
import aa.x;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import bg.p;
import bi.d0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import f5.f;
import f5.l;
import h9.f1;
import j$.util.Objects;
import j2.n;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import m.q3;
import o5.i;
import o9.g;
import org.telegram.messenger.g0;
import org.telegram.messenger.q1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.uy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.hy0;
import q4.q;
import r0.k1;
import r0.m;
import u9.o;
import ug.j;
import w7.s;
import wg.c0;
import wg.r0;
import wh.h;
import zh.h1;
import zh.i0;
public final class e implements w5.b, u9.d, d5.a, r1, cj0, wh.a, ua.a, p, m, q1 {
    public final int f56237a;
    public final Object f56238b;

    public e(Object obj, int i7) {
        this.f56237a = i7;
        this.f56238b = obj;
    }

    @Override
    public k1 S0(View view, k1 k1Var) {
        ((i0) this.f56238b).n1.j(k1Var);
        return k1.f54083b;
    }

    @Override
    public void a(f fVar, List list) {
        int i7;
        h1 h1Var = (h1) this.f56238b;
        ArrayList arrayList = h1Var.f60221e2;
        Iterator it = list.iterator();
        long j3 = 0;
        while (true) {
            i7 = 0;
            if (!it.hasNext()) {
                break;
            }
            l lVar = (l) it.next();
            int size = arrayList.size();
            while (true) {
                if (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    j jVar = (j) obj;
                    if (jVar.h() != null && jVar.h().equals(lVar.f11168c)) {
                        jVar.h = lVar;
                        if (jVar.f() > j3) {
                            j3 = jVar.f();
                        }
                    }
                }
            }
        }
        int size2 = arrayList.size();
        while (i7 < size2) {
            Object obj2 = arrayList.get(i7);
            i7++;
            ((j) obj2).f56526g = j3;
        }
        g0.h3(new wg.p(h1Var, 7));
    }

    @Override
    public void c(ua.b bVar) {
        x9.a aVar = (x9.a) this.f56238b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
        }
        aVar.f58545b.set((x9.a) bVar.get());
    }

    @Override
    public Object e(r7 r7Var) {
        String str;
        u uVar;
        ba.e eVar;
        int i7;
        int i10;
        int i11;
        Throwable th2;
        String str2;
        w9.b bVar;
        String str3;
        String str4;
        int i12;
        Task task;
        Task onSuccessTask;
        NetworkInfo activeNetworkInfo;
        ia.b a10;
        switch (this.f56237a) {
            case 1:
                return this.f56238b;
            default:
                CrashlyticsRegistrar crashlyticsRegistrar = (CrashlyticsRegistrar) this.f56238b;
                int i13 = CrashlyticsRegistrar.d;
                long currentTimeMillis = System.currentTimeMillis();
                g gVar = (g) r7Var.a(g.class);
                o o4 = r7Var.o(x9.a.class);
                o o10 = r7Var.o(p9.a.class);
                o o11 = r7Var.o(fb.a.class);
                ExecutorService executorService = (ExecutorService) r7Var.e(crashlyticsRegistrar.f7882c);
                gVar.a();
                Context context = gVar.f20872a;
                String packageName = context.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.1.1 for " + packageName, null);
                ba.e eVar2 = new ba.e((ExecutorService) r7Var.e(crashlyticsRegistrar.f7880a), (ExecutorService) r7Var.e(crashlyticsRegistrar.f7881b));
                ga.d dVar = new ga.d(context);
                x xVar = new x(gVar);
                b0 b0Var = new b0(context, packageName, (va.d) r7Var.a(va.d.class), xVar);
                x9.a aVar = new x9.a(o4);
                androidx.emoji2.text.f fVar = new androidx.emoji2.text.f(o10);
                aa.j jVar = new aa.j(xVar, dVar);
                hb.c cVar = hb.c.f14449a;
                hb.d dVar2 = hb.d.f14451a;
                hb.c cVar2 = hb.c.f14449a;
                hb.a a11 = hb.c.a(dVar2);
                if (a11.f14442b != null) {
                    Log.d("FirebaseSessions", "Subscriber " + dVar2 + " already registered.");
                } else {
                    a11.f14442b = jVar;
                    Log.d("FirebaseSessions", "Subscriber " + dVar2 + " registered.");
                    a11.f14441a.countDown();
                }
                u uVar2 = new u(gVar, b0Var, aVar, xVar, new w9.a(fVar), new w9.a(fVar), dVar, jVar, new uy(o11, 28), eVar2);
                ba.e eVar3 = uVar2.f868n;
                gVar.a();
                String str5 = gVar.f20874c.f20885b;
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
                    uVar = uVar2;
                    eVar = eVar3;
                    i7 = 1;
                    i10 = 0;
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
                    i10 = 0;
                    if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
                        uVar = uVar2;
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
                            uVar2 = uVar2;
                        }
                        uVar = uVar2;
                        eVar = eVar3;
                    }
                    th2 = null;
                    i11 = 3;
                }
                String i16 = rf.b.i("Mapping file ID is: ", str);
                if (Log.isLoggable("FirebaseCrashlytics", i11)) {
                    Log.d("FirebaseCrashlytics", i16, th2);
                }
                int size = arrayList.size();
                int i17 = i10;
                while (i17 < size) {
                    Object obj = arrayList.get(i17);
                    i17++;
                    aa.d dVar3 = (aa.d) obj;
                    String str6 = dVar3.f788a;
                    String str7 = dVar3.f789b;
                    String str8 = dVar3.f790c;
                    int i18 = size;
                    StringBuilder n10 = com.google.android.recaptcha.internal.a.n("Build id for ", str6, " on ", str7, ": ");
                    n10.append(str8);
                    String sb2 = n10.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", sb2, null);
                    }
                    size = i18;
                }
                int i19 = i7;
                try {
                    aa.a a12 = aa.a.a(context, b0Var, str5, str, arrayList, new sg.i0(context));
                    String str9 = "Installer package name is: " + a12.d;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str9, null);
                    }
                    pb.b bVar2 = new pb.b(9);
                    String str10 = a12.f771f;
                    String str11 = a12.f772g;
                    String d = b0Var.d();
                    s sVar = new s(i19, i10);
                    gf.g gVar2 = new gf.g(sVar, 5);
                    f1 f1Var = new f1(dVar);
                    Locale locale = Locale.US;
                    g9.l lVar = new g9.l(p0.p("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str5, "/settings"), bVar2);
                    String str12 = Build.MANUFACTURER;
                    String str13 = b0.h;
                    String D = p0.D(str12.replaceAll(str13, ""), "/", Build.MODEL.replaceAll(str13, ""));
                    String replaceAll = Build.VERSION.INCREMENTAL.replaceAll(str13, "");
                    String replaceAll2 = Build.VERSION.RELEASE.replaceAll(str13, "");
                    int e14 = aa.g.e(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (e14 == 0) {
                        e14 = aa.g.e(context, "com.crashlytics.android.build_id", "string");
                    }
                    if (e14 != 0) {
                        str3 = context.getResources().getString(e14);
                    } else {
                        str3 = null;
                    }
                    String[] strArr = {str3, str5, str11, str10};
                    ArrayList arrayList2 = new ArrayList();
                    int i20 = 0;
                    while (i20 < 4) {
                        String str14 = strArr[i20];
                        String[] strArr2 = strArr;
                        if (str14 != null) {
                            arrayList2.add(str14.replace("-", "").toLowerCase(Locale.US));
                        }
                        i20++;
                        strArr = strArr2;
                    }
                    Collections.sort(arrayList2);
                    StringBuilder sb3 = new StringBuilder();
                    int size2 = arrayList2.size();
                    int i21 = 0;
                    while (i21 < size2) {
                        Object obj2 = arrayList2.get(i21);
                        i21++;
                        sb3.append((String) obj2);
                        arrayList2 = arrayList2;
                    }
                    String sb4 = sb3.toString();
                    if (sb4.length() > 0) {
                        str4 = aa.g.i(sb4);
                    } else {
                        str4 = null;
                    }
                    if (d != null) {
                        i12 = 4;
                    } else {
                        i12 = 1;
                    }
                    ia.e eVar4 = new ia.e(str5, D, replaceAll, replaceAll2, b0Var, str4, str11, str10, p0.d(i12));
                    ?? obj3 = new Object();
                    AtomicReference atomicReference = new AtomicReference();
                    obj3.h = atomicReference;
                    obj3.f15421i = new AtomicReference(new TaskCompletionSource());
                    obj3.f15415a = context;
                    obj3.f15416b = eVar4;
                    obj3.d = sVar;
                    obj3.f15417c = gVar2;
                    obj3.f15418e = f1Var;
                    obj3.f15419f = lVar;
                    obj3.f15420g = xVar;
                    atomicReference.set(nb.a.W(sVar));
                    AtomicReference atomicReference2 = (AtomicReference) obj3.f15421i;
                    AtomicReference atomicReference3 = (AtomicReference) obj3.h;
                    if (((Context) obj3.f15415a).getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals((String) ((ia.e) obj3.f15416b).f15427f) && (a10 = obj3.a(1)) != null) {
                        atomicReference3.set(a10);
                        ((TaskCompletionSource) atomicReference2.get()).trySetResult(a10);
                        onSuccessTask = Tasks.forResult(null);
                    } else {
                        ia.b a13 = obj3.a(3);
                        if (a13 != null) {
                            atomicReference3.set(a13);
                            ((TaskCompletionSource) atomicReference2.get()).trySetResult(a13);
                        }
                        x xVar2 = (x) obj3.f15420g;
                        Task task2 = xVar2.h.getTask();
                        synchronized (xVar2.f881c) {
                            task = xVar2.d.getTask();
                        }
                        onSuccessTask = ba.a.a(task2, task).onSuccessTask(eVar2.f3135a, new q(29, (Object) obj3, eVar2));
                    }
                    onSuccessTask.addOnFailureListener(executorService, new v0.j(11));
                    u uVar3 = uVar;
                    ga.d dVar4 = uVar3.h;
                    Context context2 = uVar3.f857a;
                    boolean c10 = aa.g.c(context2, "com.google.firebase.crashlytics.RequireBuildId", aa.g.c(context2, "com.crashlytics.RequireBuildId", true));
                    String str15 = a12.f768b;
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
                    String str16 = new aa.e().f797a;
                    try {
                        uVar3.f860e = new wf.b(2, "crash_marker", dVar4);
                        uVar3.d = new wf.b(2, "initialization_marker", dVar4);
                        ba.e eVar5 = eVar;
                        q3 q3Var = new q3(str16, dVar4, eVar5);
                        ca.f fVar2 = new ca.f(dVar4);
                        n nVar = new n(new ja.a[]{new nb.a(12)});
                        ((o) uVar3.f867m.f38766b).a(new v0.j(25));
                        uVar3.f861f = new aa.q(uVar3.f857a, uVar3.f862g, uVar3.f858b, uVar3.h, uVar3.f860e, a12, q3Var, fVar2, f0.d(uVar3.f857a, uVar3.f862g, uVar3.h, a12, fVar2, q3Var, nVar, obj3, uVar3.f859c, uVar3.f865k, uVar3.f868n), uVar3.f866l, uVar3.f864j, uVar3.f865k, uVar3.f868n);
                        wf.b bVar3 = uVar3.d;
                        ga.d dVar5 = (ga.d) bVar3.f57539c;
                        dVar5.getClass();
                        boolean exists = new File((File) dVar5.d, (String) bVar3.f57538b).exists();
                        try {
                            Boolean.TRUE.equals((Boolean) eVar5.f3135a.f3132a.submit(new t(uVar3, 0)).get(3L, TimeUnit.SECONDS));
                        } catch (Exception unused) {
                        }
                        aa.q qVar = uVar3.f861f;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                        qVar.f837e.f3135a.a(new a1.e(2, qVar, str16));
                        w wVar = new w(new aa.n(qVar, 0), obj3, defaultUncaughtExceptionHandler, qVar.f841j);
                        qVar.f845n = wVar;
                        Thread.setDefaultUncaughtExceptionHandler(wVar);
                        if (Build.VERSION.SDK_INT >= 37) {
                            uVar3.f861f.e(str16);
                        }
                        if (exists && (context2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || ((activeNetworkInfo = ((ConnectivityManager) context2.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting()))) {
                            if (Log.isLoggable(str2, 3)) {
                                Log.d(str2, "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                            }
                            uVar3.b(obj3);
                        } else {
                            if (Log.isLoggable(str2, 3)) {
                                Log.d(str2, "Successfully configured exception handler.", null);
                            }
                            eVar5.f3135a.a(new r(uVar3, obj3, 0));
                        }
                    } catch (Exception e15) {
                        Log.e(str2, "Crashlytics was not started due to an exception during initialization", e15);
                        uVar3.f861f = null;
                    }
                    bVar = new w9.b(uVar3);
                } catch (PackageManager.NameNotFoundException e16) {
                    str2 = "FirebaseCrashlytics";
                    Log.e(str2, "Error retrieving app package info.", e16);
                    bVar = null;
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis2 > 16) {
                    String h = rf.b.h(currentTimeMillis2, "Initializing Crashlytics blocked main for ", " ms");
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, h, null);
                    }
                }
                return bVar;
        }
    }

    @Override
    public void f(float r19, float r20, int r21, android.view.View r22) {
        throw new UnsupportedOperationException("Method not decompiled: u5.e.f(float, float, int, android.view.View):void");
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void g(u1 u1Var, int i7) {
        switch (this.f56237a) {
            case 4:
                ((r0) this.f56238b).run();
                return;
            case 5:
                TLRPC.TL_payments_giveawayInfoResults tL_payments_giveawayInfoResults = (TLRPC.TL_payments_giveawayInfoResults) this.f56238b;
                f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    c0.e1(Q, tL_payments_giveawayInfoResults.gift_code_slug, null);
                    return;
                }
                return;
            case 6:
                ((sn) this.f56238b).run();
                return;
            case 7:
                ((r0) this.f56238b).run();
                return;
            default:
                ((d0) this.f56238b).run();
                return;
        }
    }

    @Override
    public Object h() {
        ui.e eVar = (ui.e) this.f56238b;
        for (i iVar : (Iterable) ((v5.g) ((v5.d) eVar.f56815c)).c(new v0.j(4))) {
            ((hy0) eVar.d).J(iVar, 1, false);
        }
        return null;
    }

    @Override
    public void j(long j3) {
        ((zh.e) this.f56238b).a(j3, true);
    }

    @Override
    public void l(WebView webView, wa waVar, Uri uri, boolean z9, e5.f fVar) {
        e5.f fVar2;
        ui.i iVar = (ui.i) this.f56238b;
        if (webView == iVar.f56837o && z9 && uri != null && iVar.f56829f.equals(uri.toString()) && iVar.j(webView)) {
            int i7 = waVar.f700b;
            if (i7 == 0) {
                waVar.f(0);
                String str = (String) waVar.f701c;
                if (!iVar.f56839q && str != null && str.startsWith("tproxy-base64:")) {
                    synchronized (iVar.f56825a) {
                        if (!iVar.f56843u && iVar.f56840r && iVar.f56838p == fVar) {
                            if (str.length() - 14 > 1398112) {
                                iVar.h();
                                return;
                            } else {
                                iVar.f56833k.execute(new ti.p(12, iVar, str));
                                return;
                            }
                        }
                        return;
                    }
                }
                iVar.i(str, fVar);
            } else if (i7 == 1) {
                synchronized (iVar.f56825a) {
                    if (!iVar.f56843u && (fVar2 = iVar.f56838p) != null && fVar2 == fVar) {
                        waVar.f(1);
                        byte[] bArr = (byte[]) waVar.d;
                        Objects.requireNonNull(bArr);
                        iVar.f56833k.execute(new ti.p(13, iVar, bArr));
                    }
                }
            }
        }
    }

    @Override
    public void m(Canvas canvas, int i7) {
        h hVar = (h) this.f56238b;
        hVar.getClass();
        canvas.save();
        RectF rectF = hVar.f57788r;
        canvas.translate(-rectF.left, (-rectF.top) + g0.L(30.0f));
        hVar.e(canvas, true, i7);
        canvas.restore();
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
