package s8;

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
import q6.m;
import s4.s0;
import x6.e;
import x6.f;
public final class a {
    public static final long f57110n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f57111o = null;
    public static final Object f57112p = new Object();
    public final Object f57113a;
    public final PowerManager.WakeLock f57114b;
    public int f57115c;
    public ScheduledFuture d;
    public long f57116e;
    public final HashSet f57117f;
    public boolean f57118g;
    public f8.a h;
    public final x6.a f57119i;
    public final String f57120j;
    public final HashMap f57121k;
    public final AtomicInteger f57122l;
    public final ScheduledExecutorService f57123m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f57113a = new Object();
        this.f57115c = 0;
        this.f57117f = new HashSet();
        this.f57118g = true;
        this.f57119i = x6.a.f60394a;
        this.f57121k = new HashMap();
        this.f57122l = new AtomicInteger(0);
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
            this.f57120j = str;
        } else {
            this.f57120j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f57114b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i7 = e.f60402a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = z6.b.a(context).f1962a.getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f57114b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
                        Log.wtf("WakeLock", e10.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f57111o;
            if (scheduledExecutorService == null) {
                synchronized (f57112p) {
                    try {
                        scheduledExecutorService = f57111o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f57111o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f57123m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j3) {
        this.f57122l.incrementAndGet();
        long j10 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f57110n), 1L);
        if (j3 > 0) {
            max = Math.min(j3, max);
        }
        synchronized (this.f57113a) {
            try {
                if (!b()) {
                    this.h = f8.a.f11600a;
                    this.f57114b.acquire();
                    this.f57119i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f57115c++;
                if (this.f57118g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f57121k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f57121k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f57124a++;
                this.f57119i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j10 = elapsedRealtime + max;
                }
                if (j10 > this.f57116e) {
                    this.f57116e = j10;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.f57123m.schedule(new s0(this, 1), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f57113a) {
            if (this.f57115c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f57122l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f57120j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f57113a) {
            try {
                if (this.f57118g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f57121k.containsKey(null)) {
                    b bVar = (b) this.f57121k.get(null);
                    if (bVar != null) {
                        int i7 = bVar.f57124a - 1;
                        bVar.f57124a = i7;
                        if (i7 == 0) {
                            this.f57121k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f57120j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f57117f;
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
        synchronized (this.f57113a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f57118g) {
                    int i7 = this.f57115c - 1;
                    this.f57115c = i7;
                    if (i7 > 0) {
                        return;
                    }
                } else {
                    this.f57115c = 0;
                }
                d();
                for (b bVar : this.f57121k.values()) {
                    bVar.f57124a = 0;
                }
                this.f57121k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.f57116e = 0L;
                }
                if (this.f57114b.isHeld()) {
                    try {
                        this.f57114b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e10) {
                        if (e10.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f57120j).concat(" failed to release!"), e10);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e10;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f57120j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
