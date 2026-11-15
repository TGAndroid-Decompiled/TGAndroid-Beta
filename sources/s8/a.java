package s8;

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
import q6.m;
import s4.s0;
import x6.e;
import x6.f;
public final class a {
    public static final long f56536n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f56537o = null;
    public static final Object f56538p = new Object();
    public final Object f56539a;
    public final PowerManager.WakeLock f56540b;
    public int f56541c;
    public ScheduledFuture d;
    public long f56542e;
    public final HashSet f56543f;
    public boolean f56544g;
    public f8.a h;
    public final x6.a f56545i;
    public final String f56546j;
    public final HashMap f56547k;
    public final AtomicInteger f56548l;
    public final ScheduledExecutorService f56549m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f56539a = new Object();
        this.f56541c = 0;
        this.f56543f = new HashSet();
        this.f56544g = true;
        this.f56545i = x6.a.f59824a;
        this.f56547k = new HashMap();
        this.f56548l = new AtomicInteger(0);
        m.f("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            if ("wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
                str = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
            } else {
                str = new String("*gcore*:");
            }
            this.f56546j = str;
        } else {
            this.f56546j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f56540b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i7 = e.f59832a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = z6.b.a(context).f1964a.getPackageManager().getApplicationInfo(packageName, 0);
                        if (applicationInfo == null) {
                            Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                        } else {
                            int i10 = applicationInfo.uid;
                            workSource = new WorkSource();
                            f.a(workSource, i10, packageName);
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                    }
                }
                if (workSource != null) {
                    try {
                        this.f56540b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
                        Log.wtf("WakeLock", e10.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f56537o;
            if (scheduledExecutorService == null) {
                synchronized (f56538p) {
                    try {
                        scheduledExecutorService = f56537o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f56537o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f56549m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j3) {
        this.f56548l.incrementAndGet();
        long j10 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f56536n), 1L);
        if (j3 > 0) {
            max = Math.min(j3, max);
        }
        synchronized (this.f56539a) {
            try {
                if (!b()) {
                    this.h = f8.a.f11280a;
                    this.f56540b.acquire();
                    this.f56545i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f56541c++;
                if (this.f56544g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f56547k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f56547k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f56550a++;
                this.f56545i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j10 = elapsedRealtime + max;
                }
                if (j10 > this.f56542e) {
                    this.f56542e = j10;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.f56549m.schedule(new s0(this, 1), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f56539a) {
            if (this.f56541c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f56548l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f56546j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f56539a) {
            try {
                if (this.f56544g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f56547k.containsKey(null)) {
                    b bVar = (b) this.f56547k.get(null);
                    if (bVar != null) {
                        int i7 = bVar.f56550a - 1;
                        bVar.f56550a = i7;
                        if (i7 == 0) {
                            this.f56547k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f56546j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f56543f;
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
        synchronized (this.f56539a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f56544g) {
                    int i7 = this.f56541c - 1;
                    this.f56541c = i7;
                    if (i7 > 0) {
                        return;
                    }
                } else {
                    this.f56541c = 0;
                }
                d();
                for (b bVar : this.f56547k.values()) {
                    bVar.f56550a = 0;
                }
                this.f56547k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.f56542e = 0L;
                }
                if (this.f56540b.isHeld()) {
                    try {
                        this.f56540b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e10) {
                        if (e10.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f56546j).concat(" failed to release!"), e10);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e10;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f56546j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
