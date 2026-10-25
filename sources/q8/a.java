package q8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import o6.l;
import org.telegram.ui.Components.cy0;
import v6.e;
import v6.f;
public final class a {
    public static final long f47011n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f47012o = null;
    public static final Object f47013p = new Object();
    public final Object f47014a;
    public final PowerManager.WakeLock f47015b;
    public int f47016c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f47017f;
    public boolean f47018g;
    public d8.a h;
    public final v6.a f47019i;
    public final String f47020j;
    public final HashMap f47021k;
    public final AtomicInteger f47022l;
    public final ScheduledExecutorService f47023m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f47014a = new Object();
        this.f47016c = 0;
        this.f47017f = new HashSet();
        this.f47018g = true;
        this.f47019i = v6.a.f50070a;
        this.f47021k = new HashMap();
        this.f47022l = new AtomicInteger(0);
        l.g("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            if ("wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
                str = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
            } else {
                str = new String("*gcore*:");
            }
            this.f47020j = str;
        } else {
            this.f47020j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f47015b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i10 = e.f50077a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = ((Context) x6.b.a(context).f48715a).getPackageManager().getApplicationInfo(packageName, 0);
                        if (applicationInfo == null) {
                            Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                        } else {
                            int i11 = applicationInfo.uid;
                            workSource = new WorkSource();
                            f.a(workSource, i11, packageName);
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                    }
                }
                if (workSource != null) {
                    try {
                        this.f47015b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                        Log.wtf("WakeLock", e.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f47012o;
            if (scheduledExecutorService == null) {
                synchronized (f47013p) {
                    try {
                        scheduledExecutorService = f47012o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f47012o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f47023m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j10) {
        this.f47022l.incrementAndGet();
        long j11 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f47011n), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f47014a) {
            try {
                if (!b()) {
                    this.h = d8.a.f8263a;
                    this.f47015b.acquire();
                    this.f47019i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f47016c++;
                if (this.f47018g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f47021k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f47021k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f47024a++;
                this.f47019i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j11 = elapsedRealtime + max;
                }
                if (j11 > this.e) {
                    this.e = j11;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.f47023m.schedule(new cy0(this, 9), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f47014a) {
            if (this.f47016c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f47022l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f47020j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f47014a) {
            try {
                if (this.f47018g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f47021k.containsKey(null)) {
                    b bVar = (b) this.f47021k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f47024a - 1;
                        bVar.f47024a = i10;
                        if (i10 == 0) {
                            this.f47021k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f47020j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f47017f;
        if (!hashSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(hashSet);
            hashSet.clear();
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void e() {
        synchronized (this.f47014a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f47018g) {
                    int i10 = this.f47016c - 1;
                    this.f47016c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f47016c = 0;
                }
                d();
                for (b bVar : this.f47021k.values()) {
                    bVar.f47024a = 0;
                }
                this.f47021k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.e = 0L;
                }
                if (this.f47015b.isHeld()) {
                    try {
                        this.f47015b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f47020j).concat(" failed to release!"), e);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f47020j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
