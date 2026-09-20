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
    public static final long f41019n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f41020o = null;
    public static final Object f41021p = new Object();
    public final Object f41022a;
    public final PowerManager.WakeLock f41023b;
    public int f41024c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f41025f;
    public boolean f41026g;
    public c8.a h;
    public final u6.a f41027i;
    public final String f41028j;
    public final HashMap f41029k;
    public final AtomicInteger f41030l;
    public final ScheduledExecutorService f41031m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f41022a = new Object();
        this.f41024c = 0;
        this.f41025f = new HashSet();
        this.f41026g = true;
        this.f41027i = u6.a.f43926a;
        this.f41029k = new HashMap();
        this.f41030l = new AtomicInteger(0);
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
            this.f41028j = str;
        } else {
            this.f41028j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f41023b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i10 = e.f43933a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = w6.b.a(context).f13517a.getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f41023b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                        Log.wtf("WakeLock", e.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f41020o;
            if (scheduledExecutorService == null) {
                synchronized (f41021p) {
                    try {
                        scheduledExecutorService = f41020o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f41020o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f41031m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j3) {
        this.f41030l.incrementAndGet();
        long j10 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f41019n), 1L);
        if (j3 > 0) {
            max = Math.min(j3, max);
        }
        synchronized (this.f41022a) {
            try {
                if (!b()) {
                    this.h = c8.a.f4180a;
                    this.f41023b.acquire();
                    this.f41027i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f41024c++;
                if (this.f41026g) {
                    TextUtils.isEmpty(null);
                }
                c cVar = (c) this.f41029k.get(null);
                c cVar2 = cVar;
                if (cVar == null) {
                    Object obj = new Object();
                    this.f41029k.put(null, obj);
                    cVar2 = obj;
                }
                cVar2.f41034a++;
                this.f41027i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j10 = elapsedRealtime + max;
                }
                if (j10 > this.e) {
                    this.e = j10;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.f41031m.schedule(new b(this, 0), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f41022a) {
            if (this.f41024c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f41030l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f41028j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f41022a) {
            try {
                if (this.f41026g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f41029k.containsKey(null)) {
                    c cVar = (c) this.f41029k.get(null);
                    if (cVar != null) {
                        int i10 = cVar.f41034a - 1;
                        cVar.f41034a = i10;
                        if (i10 == 0) {
                            this.f41029k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f41028j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f41025f;
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
        synchronized (this.f41022a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f41026g) {
                    int i10 = this.f41024c - 1;
                    this.f41024c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f41024c = 0;
                }
                d();
                for (c cVar : this.f41029k.values()) {
                    cVar.f41034a = 0;
                }
                this.f41029k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.e = 0L;
                }
                if (this.f41023b.isHeld()) {
                    try {
                        this.f41023b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f41028j).concat(" failed to release!"), e);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f41028j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
