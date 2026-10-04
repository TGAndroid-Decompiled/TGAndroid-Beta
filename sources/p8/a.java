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
    public static final long f44334n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f44335o = null;
    public static final Object f44336p = new Object();
    public final Object f44337a;
    public final PowerManager.WakeLock f44338b;
    public int f44339c;
    public ScheduledFuture d;
    public long f44340e;
    public final HashSet f44341f;
    public boolean f44342g;
    public c8.a h;
    public final u6.a f44343i;
    public final String f44344j;
    public final HashMap f44345k;
    public final AtomicInteger f44346l;
    public final ScheduledExecutorService f44347m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f44337a = new Object();
        this.f44339c = 0;
        this.f44341f = new HashSet();
        this.f44342g = true;
        this.f44343i = u6.a.f47542a;
        this.f44345k = new HashMap();
        this.f44346l = new AtomicInteger(0);
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
            this.f44344j = str;
        } else {
            this.f44344j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f44338b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i10 = e.f47550a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = w6.b.a(context).f47747a.getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f44338b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e7) {
                        Log.wtf("WakeLock", e7.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f44335o;
            if (scheduledExecutorService == null) {
                synchronized (f44336p) {
                    try {
                        scheduledExecutorService = f44335o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f44335o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f44347m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j3) {
        this.f44346l.incrementAndGet();
        long j10 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f44334n), 1L);
        if (j3 > 0) {
            max = Math.min(j3, max);
        }
        synchronized (this.f44337a) {
            try {
                if (!b()) {
                    this.h = c8.a.f4510a;
                    this.f44338b.acquire();
                    this.f44343i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f44339c++;
                if (this.f44342g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f44345k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f44345k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f44348a++;
                this.f44343i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j10 = elapsedRealtime + max;
                }
                if (j10 > this.f44340e) {
                    this.f44340e = j10;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.f44347m.schedule(new t6(this, 29), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f44337a) {
            if (this.f44339c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f44346l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f44344j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f44337a) {
            try {
                if (this.f44342g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f44345k.containsKey(null)) {
                    b bVar = (b) this.f44345k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f44348a - 1;
                        bVar.f44348a = i10;
                        if (i10 == 0) {
                            this.f44345k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f44344j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f44341f;
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
        synchronized (this.f44337a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f44342g) {
                    int i10 = this.f44339c - 1;
                    this.f44339c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f44339c = 0;
                }
                d();
                for (b bVar : this.f44345k.values()) {
                    bVar.f44348a = 0;
                }
                this.f44345k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.f44340e = 0L;
                }
                if (this.f44338b.isHeld()) {
                    try {
                        this.f44338b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e7) {
                        if (e7.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f44344j).concat(" failed to release!"), e7);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e7;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f44344j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
