package z7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import e6.e;
import e6.f;
import g6.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.ui.Components.ju0;
import x5.l;
public final class a {
    public static final long f50343n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f50344o = null;
    public static final Object f50345p = new Object();
    public final Object f50346a;
    public final PowerManager.WakeLock f50347b;
    public int f50348c;
    public ScheduledFuture d;
    public long f50349e;
    public final HashSet f50350f;
    public boolean f50351g;
    public m7.a h;
    public final e6.a f50352i;
    public final String f50353j;
    public final HashMap f50354k;
    public final AtomicInteger f50355l;
    public final ScheduledExecutorService f50356m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f50346a = new Object();
        this.f50348c = 0;
        this.f50350f = new HashSet();
        this.f50351g = true;
        this.f50352i = e6.a.f4957a;
        this.f50354k = new HashMap();
        this.f50355l = new AtomicInteger(0);
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
            this.f50353j = str;
        } else {
            this.f50353j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f50347b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i9 = e.f4965a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = c.a(context).f7118a.getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f50347b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
                        Log.wtf("WakeLock", e10.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f50344o;
            if (scheduledExecutorService == null) {
                synchronized (f50345p) {
                    try {
                        scheduledExecutorService = f50344o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f50344o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f50356m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j10) {
        this.f50355l.incrementAndGet();
        long j11 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f50343n), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f50346a) {
            try {
                if (!b()) {
                    this.h = m7.a.f17607a;
                    this.f50347b.acquire();
                    this.f50352i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f50348c++;
                if (this.f50351g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f50354k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f50354k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f50357a++;
                this.f50352i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j11 = elapsedRealtime + max;
                }
                if (j11 > this.f50349e) {
                    this.f50349e = j11;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.f50356m.schedule(new ju0(this, 11), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f50346a) {
            if (this.f50348c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f50355l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f50353j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f50346a) {
            try {
                if (this.f50351g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f50354k.containsKey(null)) {
                    b bVar = (b) this.f50354k.get(null);
                    if (bVar != null) {
                        int i9 = bVar.f50357a - 1;
                        bVar.f50357a = i9;
                        if (i9 == 0) {
                            this.f50354k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f50353j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f50350f;
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
        synchronized (this.f50346a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f50351g) {
                    int i9 = this.f50348c - 1;
                    this.f50348c = i9;
                    if (i9 > 0) {
                        return;
                    }
                } else {
                    this.f50348c = 0;
                }
                d();
                for (b bVar : this.f50354k.values()) {
                    bVar.f50357a = 0;
                }
                this.f50354k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.f50349e = 0L;
                }
                if (this.f50347b.isHeld()) {
                    try {
                        this.f50347b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e10) {
                        if (e10.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f50353j).concat(" failed to release!"), e10);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e10;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f50353j).concat(" should be held!"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
