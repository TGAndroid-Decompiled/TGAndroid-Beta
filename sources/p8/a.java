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
import p4.s0;
import u6.e;
import u6.f;
public final class a {
    public static final long f42880n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f42881o = null;
    public static final Object f42882p = new Object();
    public final Object f42883a;
    public final PowerManager.WakeLock f42884b;
    public int f42885c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f42886f;
    public boolean f42887g;
    public c8.a h;
    public final u6.a f42888i;
    public final String f42889j;
    public final HashMap f42890k;
    public final AtomicInteger f42891l;
    public final ScheduledExecutorService f42892m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f42883a = new Object();
        this.f42885c = 0;
        this.f42886f = new HashSet();
        this.f42887g = true;
        this.f42888i = u6.a.f46208a;
        this.f42890k = new HashMap();
        this.f42891l = new AtomicInteger(0);
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
            this.f42889j = str;
        } else {
            this.f42889j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f42884b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i10 = e.f46215a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = w6.b.a(context).f13764a.getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f42884b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                        Log.wtf("WakeLock", e.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f42881o;
            if (scheduledExecutorService == null) {
                synchronized (f42882p) {
                    try {
                        scheduledExecutorService = f42881o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f42881o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f42892m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j10) {
        this.f42891l.incrementAndGet();
        long j11 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f42880n), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f42883a) {
            try {
                if (!b()) {
                    this.h = c8.a.f4667a;
                    this.f42884b.acquire();
                    this.f42888i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f42885c++;
                if (this.f42887g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f42890k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f42890k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f42893a++;
                this.f42888i.getClass();
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
                    this.d = this.f42892m.schedule(new s0(this, 1), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f42883a) {
            if (this.f42885c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f42891l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f42889j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f42883a) {
            try {
                if (this.f42887g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f42890k.containsKey(null)) {
                    b bVar = (b) this.f42890k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f42893a - 1;
                        bVar.f42893a = i10;
                        if (i10 == 0) {
                            this.f42890k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f42889j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f42886f;
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
        synchronized (this.f42883a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f42887g) {
                    int i10 = this.f42885c - 1;
                    this.f42885c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f42885c = 0;
                }
                d();
                for (b bVar : this.f42890k.values()) {
                    bVar.f42893a = 0;
                }
                this.f42890k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.e = 0L;
                }
                if (this.f42884b.isHeld()) {
                    try {
                        this.f42884b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f42889j).concat(" failed to release!"), e);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f42889j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
