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
import n6.m;
import org.telegram.ui.Wallet.p5;
import u6.e;
import u6.f;
public final class a {
    public static final long f45548n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f45549o = null;
    public static final Object f45550p = new Object();
    public final Object f45551a;
    public final PowerManager.WakeLock f45552b;
    public int f45553c;
    public ScheduledFuture d;
    public long f45554e;
    public final HashSet f45555f;
    public boolean f45556g;
    public c8.a h;
    public final u6.a f45557i;
    public final String f45558j;
    public final HashMap f45559k;
    public final AtomicInteger f45560l;
    public final ScheduledExecutorService f45561m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f45551a = new Object();
        this.f45553c = 0;
        this.f45555f = new HashSet();
        this.f45556g = true;
        this.f45557i = u6.a.f48939a;
        this.f45559k = new HashMap();
        this.f45560l = new AtomicInteger(0);
        m.g("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            if ("wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
                str = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
            } else {
                str = new String("*gcore*:");
            }
            this.f45558j = str;
        } else {
            this.f45558j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f45552b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i10 = e.f48947a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = w6.b.a(context).f14713a.getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f45552b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e7) {
                        Log.wtf("WakeLock", e7.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f45549o;
            if (scheduledExecutorService == null) {
                synchronized (f45550p) {
                    try {
                        scheduledExecutorService = f45549o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f45549o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f45561m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j3) {
        this.f45560l.incrementAndGet();
        long j10 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f45548n), 1L);
        if (j3 > 0) {
            max = Math.min(j3, max);
        }
        synchronized (this.f45551a) {
            try {
                if (!b()) {
                    this.h = c8.a.f4560a;
                    this.f45552b.acquire();
                    this.f45557i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f45553c++;
                if (this.f45556g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f45559k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f45559k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f45562a++;
                this.f45557i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j10 = elapsedRealtime + max;
                }
                if (j10 > this.f45554e) {
                    this.f45554e = j10;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.f45561m.schedule(new p5(this, 2), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f45551a) {
            if (this.f45553c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f45560l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f45558j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f45551a) {
            try {
                if (this.f45556g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f45559k.containsKey(null)) {
                    b bVar = (b) this.f45559k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f45562a - 1;
                        bVar.f45562a = i10;
                        if (i10 == 0) {
                            this.f45559k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f45558j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f45555f;
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
        synchronized (this.f45551a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f45556g) {
                    int i10 = this.f45553c - 1;
                    this.f45553c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f45553c = 0;
                }
                d();
                for (b bVar : this.f45559k.values()) {
                    bVar.f45562a = 0;
                }
                this.f45559k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.f45554e = 0L;
                }
                if (this.f45552b.isHeld()) {
                    try {
                        this.f45552b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e7) {
                        if (e7.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f45558j).concat(" failed to release!"), e7);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e7;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f45558j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
