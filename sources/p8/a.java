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
import org.telegram.ui.Cells.l9;
import u6.e;
import u6.f;
public final class a {
    public static final long f39850n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f39851o = null;
    public static final Object f39852p = new Object();
    public final Object f39853a;
    public final PowerManager.WakeLock f39854b;
    public int f39855c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f39856f;
    public boolean f39857g;
    public c8.a h;
    public final u6.a f39858i;
    public final String f39859j;
    public final HashMap f39860k;
    public final AtomicInteger f39861l;
    public final ScheduledExecutorService f39862m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f39853a = new Object();
        this.f39855c = 0;
        this.f39856f = new HashSet();
        this.f39857g = true;
        this.f39858i = u6.a.f42595a;
        this.f39860k = new HashMap();
        this.f39861l = new AtomicInteger(0);
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
            this.f39859j = str;
        } else {
            this.f39859j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f39854b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i10 = e.f42602a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = w6.b.a(context).f11992a.getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f39854b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                        Log.wtf("WakeLock", e.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f39851o;
            if (scheduledExecutorService == null) {
                synchronized (f39852p) {
                    try {
                        scheduledExecutorService = f39851o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f39851o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f39862m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j3) {
        this.f39861l.incrementAndGet();
        long j10 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f39850n), 1L);
        if (j3 > 0) {
            max = Math.min(j3, max);
        }
        synchronized (this.f39853a) {
            try {
                if (!b()) {
                    this.h = c8.a.f4593a;
                    this.f39854b.acquire();
                    this.f39858i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f39855c++;
                if (this.f39857g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f39860k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f39860k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f39863a++;
                this.f39858i.getClass();
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
                    this.d = this.f39862m.schedule(new l9(this, 26), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f39853a) {
            if (this.f39855c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f39861l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f39859j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f39853a) {
            try {
                if (this.f39857g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f39860k.containsKey(null)) {
                    b bVar = (b) this.f39860k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f39863a - 1;
                        bVar.f39863a = i10;
                        if (i10 == 0) {
                            this.f39860k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f39859j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f39856f;
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
        synchronized (this.f39853a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f39857g) {
                    int i10 = this.f39855c - 1;
                    this.f39855c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f39855c = 0;
                }
                d();
                for (b bVar : this.f39860k.values()) {
                    bVar.f39863a = 0;
                }
                this.f39860k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.e = 0L;
                }
                if (this.f39854b.isHeld()) {
                    try {
                        this.f39854b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f39859j).concat(" failed to release!"), e);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f39859j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
