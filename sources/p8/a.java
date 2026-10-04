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
import org.telegram.ui.Cells.t6;
import u6.e;
import u6.f;
public final class a {
    public static final long f44333n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f44334o = null;
    public static final Object f44335p = new Object();
    public final Object f44336a;
    public final PowerManager.WakeLock f44337b;
    public int f44338c;
    public ScheduledFuture d;
    public long f44339e;
    public final HashSet f44340f;
    public boolean f44341g;
    public c8.a h;
    public final u6.a f44342i;
    public final String f44343j;
    public final HashMap f44344k;
    public final AtomicInteger f44345l;
    public final ScheduledExecutorService f44346m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f44336a = new Object();
        this.f44338c = 0;
        this.f44340f = new HashSet();
        this.f44341g = true;
        this.f44342i = u6.a.f47541a;
        this.f44344k = new HashMap();
        this.f44345l = new AtomicInteger(0);
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
            this.f44343j = str;
        } else {
            this.f44343j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f44337b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i10 = e.f47549a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = w6.b.a(context).f47746a.getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f44337b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e7) {
                        Log.wtf("WakeLock", e7.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f44334o;
            if (scheduledExecutorService == null) {
                synchronized (f44335p) {
                    try {
                        scheduledExecutorService = f44334o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f44334o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f44346m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j3) {
        this.f44345l.incrementAndGet();
        long j10 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f44333n), 1L);
        if (j3 > 0) {
            max = Math.min(j3, max);
        }
        synchronized (this.f44336a) {
            try {
                if (!b()) {
                    this.h = c8.a.f4510a;
                    this.f44337b.acquire();
                    this.f44342i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f44338c++;
                if (this.f44341g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f44344k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f44344k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f44347a++;
                this.f44342i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j10 = elapsedRealtime + max;
                }
                if (j10 > this.f44339e) {
                    this.f44339e = j10;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.f44346m.schedule(new t6(this, 29), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f44336a) {
            if (this.f44338c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f44345l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f44343j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f44336a) {
            try {
                if (this.f44341g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f44344k.containsKey(null)) {
                    b bVar = (b) this.f44344k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f44347a - 1;
                        bVar.f44347a = i10;
                        if (i10 == 0) {
                            this.f44344k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f44343j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f44340f;
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
        synchronized (this.f44336a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f44341g) {
                    int i10 = this.f44338c - 1;
                    this.f44338c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f44338c = 0;
                }
                d();
                for (b bVar : this.f44344k.values()) {
                    bVar.f44347a = 0;
                }
                this.f44344k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.f44339e = 0L;
                }
                if (this.f44337b.isHeld()) {
                    try {
                        this.f44337b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e7) {
                        if (e7.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f44343j).concat(" failed to release!"), e7);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e7;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f44343j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
