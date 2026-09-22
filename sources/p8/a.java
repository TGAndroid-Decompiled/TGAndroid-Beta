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
import org.telegram.ui.Cells.u6;
import u6.e;
import u6.f;
public final class a {
    public static final long f41040n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f41041o = null;
    public static final Object f41042p = new Object();
    public final Object f41043a;
    public final PowerManager.WakeLock f41044b;
    public int f41045c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f41046f;
    public boolean f41047g;
    public c8.a h;
    public final u6.a f41048i;
    public final String f41049j;
    public final HashMap f41050k;
    public final AtomicInteger f41051l;
    public final ScheduledExecutorService f41052m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f41043a = new Object();
        this.f41045c = 0;
        this.f41046f = new HashSet();
        this.f41047g = true;
        this.f41048i = u6.a.f43947a;
        this.f41050k = new HashMap();
        this.f41051l = new AtomicInteger(0);
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
            this.f41049j = str;
        } else {
            this.f41049j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f41044b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i10 = e.f43954a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = w6.b.a(context).f44133a.getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f41044b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                        Log.wtf("WakeLock", e.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f41041o;
            if (scheduledExecutorService == null) {
                synchronized (f41042p) {
                    try {
                        scheduledExecutorService = f41041o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f41041o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f41052m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j3) {
        this.f41051l.incrementAndGet();
        long j10 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f41040n), 1L);
        if (j3 > 0) {
            max = Math.min(j3, max);
        }
        synchronized (this.f41043a) {
            try {
                if (!b()) {
                    this.h = c8.a.f4178a;
                    this.f41044b.acquire();
                    this.f41048i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f41045c++;
                if (this.f41047g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f41050k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f41050k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f41053a++;
                this.f41048i.getClass();
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
                    this.d = this.f41052m.schedule(new u6(this, 29), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f41043a) {
            if (this.f41045c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f41051l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f41049j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f41043a) {
            try {
                if (this.f41047g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f41050k.containsKey(null)) {
                    b bVar = (b) this.f41050k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f41053a - 1;
                        bVar.f41053a = i10;
                        if (i10 == 0) {
                            this.f41050k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f41049j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f41046f;
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
        synchronized (this.f41043a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f41047g) {
                    int i10 = this.f41045c - 1;
                    this.f41045c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f41045c = 0;
                }
                d();
                for (b bVar : this.f41050k.values()) {
                    bVar.f41053a = 0;
                }
                this.f41050k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.e = 0L;
                }
                if (this.f41044b.isHeld()) {
                    try {
                        this.f41044b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f41049j).concat(" failed to release!"), e);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f41049j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
