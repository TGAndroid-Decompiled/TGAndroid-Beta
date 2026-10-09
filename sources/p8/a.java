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
import org.telegram.ui.Wallet.n5;
import u6.e;
import u6.f;
public final class a {
    public static final long f45514n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f45515o = null;
    public static final Object f45516p = new Object();
    public final Object f45517a;
    public final PowerManager.WakeLock f45518b;
    public int f45519c;
    public ScheduledFuture d;
    public long f45520e;
    public final HashSet f45521f;
    public boolean f45522g;
    public c8.a h;
    public final u6.a f45523i;
    public final String f45524j;
    public final HashMap f45525k;
    public final AtomicInteger f45526l;
    public final ScheduledExecutorService f45527m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f45517a = new Object();
        this.f45519c = 0;
        this.f45521f = new HashSet();
        this.f45522g = true;
        this.f45523i = u6.a.f48852a;
        this.f45525k = new HashMap();
        this.f45526l = new AtomicInteger(0);
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
            this.f45524j = str;
        } else {
            this.f45524j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f45518b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i10 = e.f48860a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = w6.b.a(context).f14714a.getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f45518b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e7) {
                        Log.wtf("WakeLock", e7.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f45515o;
            if (scheduledExecutorService == null) {
                synchronized (f45516p) {
                    try {
                        scheduledExecutorService = f45515o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f45515o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f45527m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j3) {
        this.f45526l.incrementAndGet();
        long j10 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f45514n), 1L);
        if (j3 > 0) {
            max = Math.min(j3, max);
        }
        synchronized (this.f45517a) {
            try {
                if (!b()) {
                    this.h = c8.a.f4561a;
                    this.f45518b.acquire();
                    this.f45523i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f45519c++;
                if (this.f45522g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f45525k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f45525k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f45528a++;
                this.f45523i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j10 = elapsedRealtime + max;
                }
                if (j10 > this.f45520e) {
                    this.f45520e = j10;
                    ScheduledFuture scheduledFuture = this.d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.d = this.f45527m.schedule(new n5(this, 2), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f45517a) {
            if (this.f45519c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f45526l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f45524j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f45517a) {
            try {
                if (this.f45522g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f45525k.containsKey(null)) {
                    b bVar = (b) this.f45525k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f45528a - 1;
                        bVar.f45528a = i10;
                        if (i10 == 0) {
                            this.f45525k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f45524j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f45521f;
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
        synchronized (this.f45517a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f45522g) {
                    int i10 = this.f45519c - 1;
                    this.f45519c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f45519c = 0;
                }
                d();
                for (b bVar : this.f45525k.values()) {
                    bVar.f45528a = 0;
                }
                this.f45525k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.f45520e = 0L;
                }
                if (this.f45518b.isHeld()) {
                    try {
                        this.f45518b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e7) {
                        if (e7.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f45524j).concat(" failed to release!"), e7);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e7;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f45524j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
