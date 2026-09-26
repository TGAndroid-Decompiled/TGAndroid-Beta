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
    public static final long f40992n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f40993o = null;
    public static final Object f40994p = new Object();
    public final Object f40995a;
    public final PowerManager.WakeLock f40996b;
    public int f40997c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f40998f;
    public boolean f40999g;
    public c8.a h;
    public final u6.a f41000i;
    public final String f41001j;
    public final HashMap f41002k;
    public final AtomicInteger f41003l;
    public final ScheduledExecutorService f41004m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f40995a = new Object();
        this.f40997c = 0;
        this.f40998f = new HashSet();
        this.f40999g = true;
        this.f41000i = u6.a.f43909a;
        this.f41002k = new HashMap();
        this.f41003l = new AtomicInteger(0);
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
            this.f41001j = str;
        } else {
            this.f41001j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f40996b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i10 = e.f43916a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = w6.b.a(context).f13503a.getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f40996b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                        Log.wtf("WakeLock", e.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f40993o;
            if (scheduledExecutorService == null) {
                synchronized (f40994p) {
                    try {
                        scheduledExecutorService = f40993o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f40993o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f41004m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j3) {
        this.f41003l.incrementAndGet();
        long j10 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f40992n), 1L);
        if (j3 > 0) {
            max = Math.min(j3, max);
        }
        synchronized (this.f40995a) {
            try {
                if (!b()) {
                    this.h = c8.a.f4171a;
                    this.f40996b.acquire();
                    this.f41000i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f40997c++;
                if (this.f40999g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f41002k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f41002k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f41005a++;
                this.f41000i.getClass();
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
                    this.d = this.f41004m.schedule(new t6(this, 29), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f40995a) {
            if (this.f40997c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f41003l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f41001j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f40995a) {
            try {
                if (this.f40999g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f41002k.containsKey(null)) {
                    b bVar = (b) this.f41002k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f41005a - 1;
                        bVar.f41005a = i10;
                        if (i10 == 0) {
                            this.f41002k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f41001j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f40998f;
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
        synchronized (this.f40995a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f40999g) {
                    int i10 = this.f40997c - 1;
                    this.f40997c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f40997c = 0;
                }
                d();
                for (b bVar : this.f41002k.values()) {
                    bVar.f41005a = 0;
                }
                this.f41002k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.e = 0L;
                }
                if (this.f40996b.isHeld()) {
                    try {
                        this.f40996b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f41001j).concat(" failed to release!"), e);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f41001j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
