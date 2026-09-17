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
    public static final long f40747n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f40748o = null;
    public static final Object f40749p = new Object();
    public final Object f40750a;
    public final PowerManager.WakeLock f40751b;
    public int f40752c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f40753f;
    public boolean f40754g;
    public c8.a h;
    public final u6.a f40755i;
    public final String f40756j;
    public final HashMap f40757k;
    public final AtomicInteger f40758l;
    public final ScheduledExecutorService f40759m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f40750a = new Object();
        this.f40752c = 0;
        this.f40753f = new HashSet();
        this.f40754g = true;
        this.f40755i = u6.a.f43647a;
        this.f40757k = new HashMap();
        this.f40758l = new AtomicInteger(0);
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
            this.f40756j = str;
        } else {
            this.f40756j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f40751b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i10 = e.f43654a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = w6.b.a(context).f43836a.getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f40751b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                        Log.wtf("WakeLock", e.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f40748o;
            if (scheduledExecutorService == null) {
                synchronized (f40749p) {
                    try {
                        scheduledExecutorService = f40748o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f40748o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f40759m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j3) {
        this.f40758l.incrementAndGet();
        long j10 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f40747n), 1L);
        if (j3 > 0) {
            max = Math.min(j3, max);
        }
        synchronized (this.f40750a) {
            try {
                if (!b()) {
                    this.h = c8.a.f4179a;
                    this.f40751b.acquire();
                    this.f40755i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f40752c++;
                if (this.f40754g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f40757k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f40757k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f40760a++;
                this.f40755i.getClass();
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
                    this.d = this.f40759m.schedule(new l7(this, 28), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f40750a) {
            if (this.f40752c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f40758l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f40756j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f40750a) {
            try {
                if (this.f40754g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f40757k.containsKey(null)) {
                    b bVar = (b) this.f40757k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f40760a - 1;
                        bVar.f40760a = i10;
                        if (i10 == 0) {
                            this.f40757k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f40756j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f40753f;
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
        synchronized (this.f40750a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f40754g) {
                    int i10 = this.f40752c - 1;
                    this.f40752c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f40752c = 0;
                }
                d();
                for (b bVar : this.f40757k.values()) {
                    bVar.f40760a = 0;
                }
                this.f40757k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.e = 0L;
                }
                if (this.f40751b.isHeld()) {
                    try {
                        this.f40751b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f40756j).concat(" failed to release!"), e);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f40756j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
