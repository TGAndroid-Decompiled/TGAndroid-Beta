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
    public static final long f40676n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f40677o = null;
    public static final Object f40678p = new Object();
    public final Object f40679a;
    public final PowerManager.WakeLock f40680b;
    public int f40681c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f40682f;
    public boolean f40683g;
    public c8.a h;
    public final u6.a f40684i;
    public final String f40685j;
    public final HashMap f40686k;
    public final AtomicInteger f40687l;
    public final ScheduledExecutorService f40688m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f40679a = new Object();
        this.f40681c = 0;
        this.f40682f = new HashSet();
        this.f40683g = true;
        this.f40684i = u6.a.f43572a;
        this.f40686k = new HashMap();
        this.f40687l = new AtomicInteger(0);
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
            this.f40685j = str;
        } else {
            this.f40685j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f40680b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i10 = e.f43579a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = w6.b.a(context).f43762a.getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f40680b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                        Log.wtf("WakeLock", e.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f40677o;
            if (scheduledExecutorService == null) {
                synchronized (f40678p) {
                    try {
                        scheduledExecutorService = f40677o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f40677o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f40688m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j3) {
        this.f40687l.incrementAndGet();
        long j10 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f40676n), 1L);
        if (j3 > 0) {
            max = Math.min(j3, max);
        }
        synchronized (this.f40679a) {
            try {
                if (!b()) {
                    this.h = c8.a.f4171a;
                    this.f40680b.acquire();
                    this.f40684i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f40681c++;
                if (this.f40683g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f40686k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f40686k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f40689a++;
                this.f40684i.getClass();
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
                    this.d = this.f40688m.schedule(new l7(this, 28), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f40679a) {
            if (this.f40681c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f40687l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f40685j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f40679a) {
            try {
                if (this.f40683g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f40686k.containsKey(null)) {
                    b bVar = (b) this.f40686k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f40689a - 1;
                        bVar.f40689a = i10;
                        if (i10 == 0) {
                            this.f40686k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f40685j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f40682f;
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
        synchronized (this.f40679a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f40683g) {
                    int i10 = this.f40681c - 1;
                    this.f40681c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f40681c = 0;
                }
                d();
                for (b bVar : this.f40686k.values()) {
                    bVar.f40689a = 0;
                }
                this.f40686k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.e = 0L;
                }
                if (this.f40680b.isHeld()) {
                    try {
                        this.f40680b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f40685j).concat(" failed to release!"), e);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f40685j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
