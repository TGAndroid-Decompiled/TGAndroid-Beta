package z5;

import ag.o1;
import ag.q1;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.p0;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import m.s3;
public abstract class g implements com.google.android.gms.common.api.c {
    public static final w5.c[] P = new w5.c[0];
    public b A;
    public IInterface B;
    public final ArrayList C;
    public c0 D;
    public int E;
    public final m F;
    public final m G;
    public final int H;
    public final String I;
    public volatile String J;
    public w5.a K;
    public boolean L;
    public volatile f0 M;
    public final AtomicInteger N;
    public final Set O;
    public int f50613a;
    public long f50614b;
    public long f50615c;
    public int d;
    public long f50616e;
    public volatile String f50617f;
    public androidx.activity.n h;
    public final Context f50618n;
    public final Looper f50619r;
    public final j0 f50620s;
    public final a0 v;
    public final Object f50621w;
    public final Object f50622x;
    public y f50623y;

    public g(Context context, Looper looper, int i10, s3 s3Var, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, int i11) {
        synchronized (j0.f50643g) {
            try {
                if (j0.h == null) {
                    j0.h = new j0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        j0 j0Var = j0.h;
        Object obj = w5.d.f49767c;
        l.h(kVar);
        l.h(lVar);
        m mVar = new m(kVar);
        m mVar2 = new m(lVar);
        Object obj2 = w5.d.f49767c;
        this.f50617f = null;
        this.f50621w = new Object();
        this.f50622x = new Object();
        this.C = new ArrayList();
        this.E = 1;
        this.K = null;
        this.L = false;
        this.M = null;
        this.N = new AtomicInteger(0);
        l.i(context, "Context must not be null");
        this.f50618n = context;
        l.i(looper, "Looper must not be null");
        this.f50619r = looper;
        l.i(j0Var, "Supervisor must not be null");
        this.f50620s = j0Var;
        this.v = new a0(this, looper);
        this.H = i10;
        this.F = mVar;
        this.G = mVar2;
        this.I = (String) s3Var.f16691e;
        Set<Scope> set = (Set) s3Var.f16689b;
        for (Scope scope : set) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.O = set;
    }

    public static void D(g gVar) {
        int i10;
        int i11;
        synchronized (gVar.f50621w) {
            i10 = gVar.E;
        }
        if (i10 == 3) {
            gVar.L = true;
            i11 = 5;
        } else {
            i11 = 4;
        }
        a0 a0Var = gVar.v;
        a0Var.sendMessage(a0Var.obtainMessage(i11, gVar.N.get(), 16));
    }

    public static boolean E(g gVar, int i10, int i11, IInterface iInterface) {
        synchronized (gVar.f50621w) {
            try {
                if (gVar.E != i10) {
                    return false;
                }
                gVar.F(i11, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void A(int i10) {
        this.f50613a = i10;
        this.f50614b = System.currentTimeMillis();
    }

    public void B(int i10, IBinder iBinder, Bundle bundle, int i11) {
        d0 d0Var = new d0(this, i10, iBinder, bundle);
        a0 a0Var = this.v;
        a0Var.sendMessage(a0Var.obtainMessage(1, i11, -1, d0Var));
    }

    public boolean C() {
        return this instanceof n5.a;
    }

    public final void F(int i10, IInterface iInterface) {
        boolean z10;
        boolean z11;
        androidx.activity.n nVar;
        boolean z12 = false;
        if (i10 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (iInterface == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 == z11) {
            z12 = true;
        }
        l.b(z12);
        synchronized (this.f50621w) {
            try {
                this.E = i10;
                this.B = iInterface;
                Bundle bundle = null;
                if (i10 != 1) {
                    if (i10 != 2 && i10 != 3) {
                        if (i10 == 4) {
                            l.h(iInterface);
                            IInterface iInterface2 = iInterface;
                            this.f50615c = System.currentTimeMillis();
                        }
                    } else {
                        c0 c0Var = this.D;
                        if (c0Var != null && (nVar = this.h) != null) {
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) nVar.f881b) + " on " + ((String) nVar.f882c));
                            j0 j0Var = this.f50620s;
                            String str = (String) this.h.f881b;
                            l.h(str);
                            String str2 = (String) this.h.f882c;
                            if (this.I == null) {
                                this.f50618n.getClass();
                            }
                            j0Var.c(str, str2, c0Var, this.h.f880a);
                            this.N.incrementAndGet();
                        }
                        c0 c0Var2 = new c0(this, this.N.get());
                        this.D = c0Var2;
                        String x4 = x();
                        String w10 = w();
                        boolean y8 = y();
                        ?? obj = new Object();
                        obj.f882c = x4;
                        obj.f881b = w10;
                        obj.f880a = y8;
                        this.h = obj;
                        if (y8 && k() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.h.f881b)));
                        }
                        j0 j0Var2 = this.f50620s;
                        String str3 = (String) this.h.f881b;
                        l.h(str3);
                        String str4 = (String) this.h.f882c;
                        String str5 = this.I;
                        if (str5 == null) {
                            str5 = this.f50618n.getClass().getName();
                        }
                        w5.a b10 = j0Var2.b(new g0(str3, str4, this.h.f880a), c0Var2, str5);
                        if (!b10.c()) {
                            androidx.activity.n nVar2 = this.h;
                            Log.w("GmsClient", "unable to connect to service: " + ((String) nVar2.f881b) + " on " + ((String) nVar2.f882c));
                            int i11 = b10.f49759b;
                            if (i11 == -1) {
                                i11 = 16;
                            }
                            if (b10.f49760c != null) {
                                bundle = new Bundle();
                                bundle.putParcelable("pendingIntent", b10.f49760c);
                            }
                            int i12 = this.N.get();
                            e0 e0Var = new e0(this, i11, bundle);
                            a0 a0Var = this.v;
                            a0Var.sendMessage(a0Var.obtainMessage(7, i12, -1, e0Var));
                        }
                    }
                } else {
                    c0 c0Var3 = this.D;
                    if (c0Var3 != null) {
                        j0 j0Var3 = this.f50620s;
                        String str6 = (String) this.h.f881b;
                        l.h(str6);
                        String str7 = (String) this.h.f882c;
                        if (this.I == null) {
                            this.f50618n.getClass();
                        }
                        j0Var3.c(str6, str7, c0Var3, this.h.f880a);
                        this.D = null;
                    }
                }
            } finally {
            }
        }
    }

    @Override
    public boolean a() {
        return this instanceof m5.e;
    }

    @Override
    public final Set b() {
        if (p()) {
            return this.O;
        }
        return Collections.EMPTY_SET;
    }

    @Override
    public final void c(String str) {
        this.f50617f = str;
        disconnect();
    }

    @Override
    public void d(b bVar) {
        l.i(bVar, "Connection progress callbacks cannot be null.");
        this.A = bVar;
        F(2, null);
    }

    @Override
    public void disconnect() {
        this.N.incrementAndGet();
        synchronized (this.C) {
            try {
                int size = this.C.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((w) this.C.get(i10)).c();
                }
                this.C.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f50622x) {
            this.f50623y = null;
        }
        F(1, null);
    }

    @Override
    public final boolean e() {
        boolean z10;
        synchronized (this.f50621w) {
            int i10 = this.E;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override
    public final void f(String str, PrintWriter printWriter) {
        int i10;
        IInterface iInterface;
        y yVar;
        synchronized (this.f50621w) {
            i10 = this.E;
            iInterface = this.B;
        }
        synchronized (this.f50622x) {
            yVar = this.f50623y;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            printWriter.print("UNKNOWN");
                        } else {
                            printWriter.print("DISCONNECTING");
                        }
                    } else {
                        printWriter.print("CONNECTED");
                    }
                } else {
                    printWriter.print("LOCAL_CONNECTING");
                }
            } else {
                printWriter.print("REMOTE_CONNECTING");
            }
        } else {
            printWriter.print("DISCONNECTED");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) v()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (yVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(yVar.f50692a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f50615c > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.f50615c;
            String format = simpleDateFormat.format(new Date(j10));
            append.println(j10 + " " + format);
        }
        if (this.f50614b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.f50613a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        printWriter.append((CharSequence) String.valueOf(i11));
                    } else {
                        printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                    }
                } else {
                    printWriter.append("CAUSE_NETWORK_LOST");
                }
            } else {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.f50614b;
            String format2 = simpleDateFormat.format(new Date(j11));
            append2.println(j11 + " " + format2);
        }
        if (this.f50616e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) j8.j.a(this.d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j12 = this.f50616e;
            String format3 = simpleDateFormat.format(new Date(j12));
            append3.println(j12 + " " + format3);
        }
    }

    @Override
    public final String g() {
        androidx.activity.n nVar;
        if (h() && (nVar = this.h) != null) {
            return (String) nVar.f882c;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    @Override
    public final boolean h() {
        boolean z10;
        synchronized (this.f50621w) {
            if (this.E == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override
    public final void i(o1 o1Var) {
        ((p0) o1Var.f624b).f3899o.f3839x.post(new q1(o1Var, 16));
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public abstract int k();

    @Override
    public final w5.c[] l() {
        f0 f0Var = this.M;
        if (f0Var == null) {
            return null;
        }
        return f0Var.f50611b;
    }

    @Override
    public final void m(h hVar, Set set) {
        String str;
        Bundle t10 = t();
        if (Build.VERSION.SDK_INT < 31) {
            str = this.J;
        } else {
            str = this.J;
        }
        String str2 = str;
        int i10 = this.H;
        int i11 = w5.e.f49768a;
        Scope[] scopeArr = f.A;
        Bundle bundle = new Bundle();
        w5.c[] cVarArr = f.B;
        f fVar = new f(6, i10, i11, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str2);
        fVar.d = this.f50618n.getPackageName();
        fVar.h = t10;
        if (set != null) {
            fVar.f50603f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (p()) {
            fVar.f50604n = new Account("<<default account>>", "com.google");
            if (hVar != null) {
                fVar.f50602e = hVar.asBinder();
            }
        } else if (this instanceof q7.b) {
            fVar.f50604n = null;
        }
        fVar.f50605r = P;
        fVar.f50606s = r();
        if (C()) {
            fVar.f50608x = true;
        }
        try {
            synchronized (this.f50622x) {
                try {
                    y yVar = this.f50623y;
                    if (yVar != null) {
                        yVar.E0(new b0(this, this.N.get()), fVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            int i12 = this.N.get();
            a0 a0Var = this.v;
            a0Var.sendMessage(a0Var.obtainMessage(6, i12, 3));
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            B(8, null, null, this.N.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            B(8, null, null, this.N.get());
        }
    }

    @Override
    public final String n() {
        return this.f50617f;
    }

    @Override
    public Intent o() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @Override
    public boolean p() {
        return false;
    }

    public abstract IInterface q(IBinder iBinder);

    public w5.c[] r() {
        return P;
    }

    public Bundle s() {
        return null;
    }

    public Bundle t() {
        return new Bundle();
    }

    public final IInterface u() {
        IInterface iInterface;
        synchronized (this.f50621w) {
            try {
                if (this.E != 5) {
                    if (h()) {
                        IInterface iInterface2 = this.B;
                        l.i(iInterface2, "Client is connected but service is null");
                        iInterface = iInterface2;
                    } else {
                        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                    }
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    public abstract String v();

    public abstract String w();

    public String x() {
        return "com.google.android.gms";
    }

    public boolean y() {
        if (k() >= 211700000) {
            return true;
        }
        return false;
    }

    public void z(w5.a aVar) {
        this.d = aVar.f49759b;
        this.f50616e = System.currentTimeMillis();
    }
}
