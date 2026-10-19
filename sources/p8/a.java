package p8;

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
import n6.l;
import u6.e;
import u6.f;
public final class a {
    public static final long f44262n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f44263o = null;
    public static final Object f44264p = new Object();
    public final Object f44265a;
    public final PowerManager.WakeLock f44266b;
    public int f44267c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f44268f;
    public boolean f44269g;
    public c8.a h;
    public final u6.a f44270i;
    public final String f44271j;
    public final HashMap f44272k;
    public final AtomicInteger f44273l;
    public final ScheduledExecutorService f44274m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f44265a = new Object();
        this.f44267c = 0;
        this.f44268f = new HashSet();
        this.f44269g = true;
        this.f44270i = u6.a.f47594a;
        this.f44272k = new HashMap();
        this.f44273l = new AtomicInteger(0);
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
            this.f44271j = str;
        } else {
            this.f44271j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f44266b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i10 = e.f47601a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = w6.b.a(context).f15923a.getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f44266b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                        Log.wtf("WakeLock", e.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f44263o;
            if (scheduledExecutorService == null) {
                synchronized (f44264p) {
                    try {
                        scheduledExecutorService = f44263o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f44263o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f44274m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j10) {
        this.f44273l.incrementAndGet();
        long j11 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f44262n), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f44265a) {
            try {
                if (!b()) {
                    this.h = c8.a.f5035a;
                    this.f44266b.acquire();
                    this.f44270i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f44267c++;
                if (this.f44269g) {
                    TextUtils.isEmpty(null);
                }
                c cVar = (c) this.f44272k.get(null);
                c cVar2 = cVar;
                if (cVar == null) {
                    Object obj = new Object();
                    this.f44272k.put(null, obj);
                    cVar2 = obj;
                }
                cVar2.f44277a++;
                this.f44270i.getClass();
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
                    this.d = this.f44274m.schedule(new b(this, 0), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f44265a) {
            if (this.f44267c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f44273l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f44271j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f44265a) {
            try {
                if (this.f44269g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f44272k.containsKey(null)) {
                    c cVar = (c) this.f44272k.get(null);
                    if (cVar != null) {
                        int i10 = cVar.f44277a - 1;
                        cVar.f44277a = i10;
                        if (i10 == 0) {
                            this.f44272k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f44271j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f44268f;
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
        synchronized (this.f44265a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f44269g) {
                    int i10 = this.f44267c - 1;
                    this.f44267c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f44267c = 0;
                }
                d();
                for (c cVar : this.f44272k.values()) {
                    cVar.f44277a = 0;
                }
                this.f44272k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.e = 0L;
                }
                if (this.f44266b.isHeld()) {
                    try {
                        this.f44266b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f44271j).concat(" failed to release!"), e);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f44271j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
