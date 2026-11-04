package r8;

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
import org.telegram.ui.Components.lt;
import p6.m;
import w6.e;
import w6.f;
public final class a {
    public static final long f54436n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f54437o = null;
    public static final Object f54438p = new Object();
    public final Object f54439a;
    public final PowerManager.WakeLock f54440b;
    public int f54441c;
    public ScheduledFuture d;
    public long f54442e;
    public final HashSet f54443f;
    public boolean f54444g;
    public e8.a h;
    public final w6.a f54445i;
    public final String f54446j;
    public final HashMap f54447k;
    public final AtomicInteger f54448l;
    public final ScheduledExecutorService f54449m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f54439a = new Object();
        this.f54441c = 0;
        this.f54443f = new HashSet();
        this.f54444g = true;
        this.f54445i = w6.a.f57390a;
        this.f54447k = new HashMap();
        this.f54448l = new AtomicInteger(0);
        m.f("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            if ("wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
                str = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
            } else {
                str = new String("*gcore*:");
            }
            this.f54446j = str;
        } else {
            this.f54446j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f54440b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i3 = e.f57398a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = y6.b.a(context).f1741a.getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f54440b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
                        Log.wtf("WakeLock", e10.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f54437o;
            if (scheduledExecutorService == null) {
                synchronized (f54438p) {
                    try {
                        scheduledExecutorService = f54437o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f54437o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f54449m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j10) {
        this.f54448l.incrementAndGet();
        long j11 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f54436n), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f54439a) {
            try {
                if (!b()) {
                    this.h = e8.a.f9909a;
                    this.f54440b.acquire();
                    this.f54445i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f54441c++;
                if (this.f54444g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f54447k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f54447k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f54450a++;
                this.f54445i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j11 = elapsedRealtime + max;
                }
                if (j11 > this.f54442e) {
                    this.f54442e = j11;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.f54449m.schedule(new lt(this, 23), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f54439a) {
            if (this.f54441c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f54448l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f54446j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f54439a) {
            try {
                if (this.f54444g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f54447k.containsKey(null)) {
                    b bVar = (b) this.f54447k.get(null);
                    if (bVar != null) {
                        int i3 = bVar.f54450a - 1;
                        bVar.f54450a = i3;
                        if (i3 == 0) {
                            this.f54447k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f54446j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f54443f;
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
        synchronized (this.f54439a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f54444g) {
                    int i3 = this.f54441c - 1;
                    this.f54441c = i3;
                    if (i3 > 0) {
                        return;
                    }
                } else {
                    this.f54441c = 0;
                }
                d();
                for (b bVar : this.f54447k.values()) {
                    bVar.f54450a = 0;
                }
                this.f54447k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.f54442e = 0L;
                }
                if (this.f54440b.isHeld()) {
                    try {
                        this.f54440b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e10) {
                        if (e10.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f54446j).concat(" failed to release!"), e10);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e10;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f54446j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
