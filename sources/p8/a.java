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
import org.telegram.ui.Wallet.m4;
import u6.e;
import u6.f;
public final class a {
    public static final long f44689n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f44690o = null;
    public static final Object f44691p = new Object();
    public final Object f44692a;
    public final PowerManager.WakeLock f44693b;
    public int f44694c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f44695f;
    public boolean f44696g;
    public c8.a h;
    public final u6.a f44697i;
    public final String f44698j;
    public final HashMap f44699k;
    public final AtomicInteger f44700l;
    public final ScheduledExecutorService f44701m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f44692a = new Object();
        this.f44694c = 0;
        this.f44695f = new HashSet();
        this.f44696g = true;
        this.f44697i = u6.a.f48046a;
        this.f44699k = new HashMap();
        this.f44700l = new AtomicInteger(0);
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
            this.f44698j = str;
        } else {
            this.f44698j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f44693b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i10 = e.f48053a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = w6.b.a(context).f15986a.getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f44693b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                        Log.wtf("WakeLock", e.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f44690o;
            if (scheduledExecutorService == null) {
                synchronized (f44691p) {
                    try {
                        scheduledExecutorService = f44690o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f44690o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f44701m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j10) {
        this.f44700l.incrementAndGet();
        long j11 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f44689n), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f44692a) {
            try {
                if (!b()) {
                    this.h = c8.a.f5040a;
                    this.f44693b.acquire();
                    this.f44697i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f44694c++;
                if (this.f44696g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f44699k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f44699k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f44702a++;
                this.f44697i.getClass();
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
                    this.d = this.f44701m.schedule(new m4(this, 3), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f44692a) {
            if (this.f44694c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f44700l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f44698j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f44692a) {
            try {
                if (this.f44696g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f44699k.containsKey(null)) {
                    b bVar = (b) this.f44699k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f44702a - 1;
                        bVar.f44702a = i10;
                        if (i10 == 0) {
                            this.f44699k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f44698j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f44695f;
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
        synchronized (this.f44692a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f44696g) {
                    int i10 = this.f44694c - 1;
                    this.f44694c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f44694c = 0;
                }
                d();
                for (b bVar : this.f44699k.values()) {
                    bVar.f44702a = 0;
                }
                this.f44699k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.e = 0L;
                }
                if (this.f44693b.isHeld()) {
                    try {
                        this.f44693b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f44698j).concat(" failed to release!"), e);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f44698j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
