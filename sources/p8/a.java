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
import org.telegram.ui.Wallet.m5;
import u6.e;
import u6.f;
public final class a {
    public static final long f43179n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f43180o = null;
    public static final Object f43181p = new Object();
    public final Object f43182a;
    public final PowerManager.WakeLock f43183b;
    public int f43184c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f43185f;
    public boolean f43186g;
    public c8.a h;
    public final u6.a f43187i;
    public final String f43188j;
    public final HashMap f43189k;
    public final AtomicInteger f43190l;
    public final ScheduledExecutorService f43191m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f43182a = new Object();
        this.f43184c = 0;
        this.f43185f = new HashSet();
        this.f43186g = true;
        this.f43187i = u6.a.f46208a;
        this.f43189k = new HashMap();
        this.f43190l = new AtomicInteger(0);
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
            this.f43188j = str;
        } else {
            this.f43188j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f43183b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i10 = e.f46215a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = w6.b.a(context).f13761a.getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f43183b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                        Log.wtf("WakeLock", e.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f43180o;
            if (scheduledExecutorService == null) {
                synchronized (f43181p) {
                    try {
                        scheduledExecutorService = f43180o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f43180o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f43191m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j10) {
        this.f43190l.incrementAndGet();
        long j11 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f43179n), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f43182a) {
            try {
                if (!b()) {
                    this.h = c8.a.f4664a;
                    this.f43183b.acquire();
                    this.f43187i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f43184c++;
                if (this.f43186g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f43189k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f43189k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f43192a++;
                this.f43187i.getClass();
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
                    this.d = this.f43191m.schedule(new m5(this, 2), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f43182a) {
            if (this.f43184c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f43190l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f43188j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f43182a) {
            try {
                if (this.f43186g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f43189k.containsKey(null)) {
                    b bVar = (b) this.f43189k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f43192a - 1;
                        bVar.f43192a = i10;
                        if (i10 == 0) {
                            this.f43189k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f43188j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f43185f;
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
        synchronized (this.f43182a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f43186g) {
                    int i10 = this.f43184c - 1;
                    this.f43184c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f43184c = 0;
                }
                d();
                for (b bVar : this.f43189k.values()) {
                    bVar.f43192a = 0;
                }
                this.f43189k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.e = 0L;
                }
                if (this.f43183b.isHeld()) {
                    try {
                        this.f43183b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f43188j).concat(" failed to release!"), e);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f43188j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
