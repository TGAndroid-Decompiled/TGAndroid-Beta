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
    public static final long f40725n = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService f40726o = null;
    public static final Object f40727p = new Object();
    public final Object f40728a;
    public final PowerManager.WakeLock f40729b;
    public int f40730c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f40731f;
    public boolean f40732g;
    public c8.a h;
    public final u6.a f40733i;
    public final String f40734j;
    public final HashMap f40735k;
    public final AtomicInteger f40736l;
    public final ScheduledExecutorService f40737m;

    public a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f40728a = new Object();
        this.f40730c = 0;
        this.f40731f = new HashSet();
        this.f40732g = true;
        this.f40733i = u6.a.f43624a;
        this.f40735k = new HashMap();
        this.f40736l = new AtomicInteger(0);
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
            this.f40734j = str;
        } else {
            this.f40734j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f40729b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (f.b(context)) {
                int i10 = e.f43631a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo applicationInfo = w6.b.a(context).f43813a.getPackageManager().getApplicationInfo(packageName, 0);
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
                        this.f40729b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                        Log.wtf("WakeLock", e.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f40726o;
            if (scheduledExecutorService == null) {
                synchronized (f40727p) {
                    try {
                        scheduledExecutorService = f40726o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f40726o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f40737m = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb2.toString());
    }

    public final void a(long j3) {
        this.f40736l.incrementAndGet();
        long j10 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f40725n), 1L);
        if (j3 > 0) {
            max = Math.min(j3, max);
        }
        synchronized (this.f40728a) {
            try {
                if (!b()) {
                    this.h = c8.a.f4174a;
                    this.f40729b.acquire();
                    this.f40733i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f40730c++;
                if (this.f40732g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f40735k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f40735k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f40738a++;
                this.f40733i.getClass();
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
                    this.d = this.f40737m.schedule(new l7(this, 28), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f40728a) {
            if (this.f40730c > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final void c() {
        if (this.f40736l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f40734j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f40728a) {
            try {
                if (this.f40732g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f40735k.containsKey(null)) {
                    b bVar = (b) this.f40735k.get(null);
                    if (bVar != null) {
                        int i10 = bVar.f40738a - 1;
                        bVar.f40738a = i10;
                        if (i10 == 0) {
                            this.f40735k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f40734j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f40731f;
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
        synchronized (this.f40728a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f40732g) {
                    int i10 = this.f40730c - 1;
                    this.f40730c = i10;
                    if (i10 > 0) {
                        return;
                    }
                } else {
                    this.f40730c = 0;
                }
                d();
                for (b bVar : this.f40735k.values()) {
                    bVar.f40738a = 0;
                }
                this.f40735k.clear();
                ScheduledFuture scheduledFuture = this.d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.d = null;
                    this.e = 0L;
                }
                if (this.f40729b.isHeld()) {
                    try {
                        this.f40729b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f40734j).concat(" failed to release!"), e);
                            if (this.h != null) {
                                this.h = null;
                            }
                        } else {
                            throw e;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f40734j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
