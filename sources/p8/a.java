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
import org.telegram.ui.Cells.l7;
import u6.e;
import u6.f;
public final class a {
    public static final long f44020n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f44021o = null;
    public static final Object f44022p = new Object();
    public final Object f44023a;
    public final PowerManager.WakeLock f44024b;
    public int f44025c;
    public ScheduledFuture d;
    public long f44026e;
    public final HashSet f44027f;
    public boolean f44028g;
    public c8.a h;
    public final u6.a f44029i;
    public final String f44030j;
    public final HashMap f44031k;
    public final AtomicInteger f44032l;
    public final ScheduledExecutorService f44033m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f44023a = new Object();
        this.f44025c = 0;
        this.f44027f = new HashSet();
        this.f44028g = true;
        this.f44029i = u6.a.f46980a;
        this.f44031k = new HashMap();
        this.f44032l = new AtomicInteger(0);
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
            this.f44030j = str;
        } else {
            this.f44030j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f44024b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i10 = e.f46988a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = w6.b.a(context).f14849a.getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f44024b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e7) {
                        Log.wtf("WakeLock", e7.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f44021o;
            if (scheduledExecutorService == null) {
                synchronized (f44022p) {
                    try {
                        scheduledExecutorService = f44021o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f44021o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f44033m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j3) {
        this.f44032l.incrementAndGet();
        long j10 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f44020n), 1L);
        if (j3 > 0) {
            max = Math.min(j3, max);
        }
        synchronized (this.f44023a) {
            try {
                if (!b()) {
                    this.h = c8.a.f4731a;
                    this.f44024b.acquire();
                    this.f44029i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f44025c++;
                if (this.f44028g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f44031k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f44031k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f44034a++;
                this.f44029i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j10 = elapsedRealtime + max;
                }
                if (j10 > this.f44026e) {
                    this.f44026e = j10;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.f44033m.schedule(new l7(this, 28), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f44023a) {
            if (this.f44025c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f44032l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f44030j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f44023a) {
            try {
                if (this.f44028g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f44031k.containsKey(null)) {
                    b bVar = (b) this.f44031k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f44034a - 1;
                        bVar.f44034a = i10;
                        if (i10 == 0) {
                            this.f44031k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f44030j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f44027f;
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
        synchronized (this.f44023a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f44028g) {
                    int i10 = this.f44025c - 1;
                    this.f44025c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f44025c = 0;
                }
                d();
                for (b bVar : this.f44031k.values()) {
                    bVar.f44034a = 0;
                }
                this.f44031k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.f44026e = 0L;
                }
                if (this.f44024b.isHeld()) {
                    try {
                        this.f44024b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e7) {
                        if (e7.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f44030j).concat(" failed to release!"), e7);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e7;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f44030j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
