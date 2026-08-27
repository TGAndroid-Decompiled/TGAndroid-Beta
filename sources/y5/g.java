package y5;

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
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import m.t3;

public abstract class g implements com.google.android.gms.common.api.c {
    public static final v5.c[] P = new v5.c[0];
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
    public v5.a K;
    public boolean L;
    public volatile f0 M;
    public final AtomicInteger N;
    public final Set O;

    public int f49630a;

    public long f49631b;

    public long f49632c;
    public int d;

    public long f49633e;

    public volatile String f49634f;
    public androidx.activity.n h;

    public final Context f49635n;

    public final Looper f49636r;

    public final j0 f49637s;
    public final a0 v;

    public final Object f49638w;

    public final Object f49639x;

    public y f49640y;

    public g(Context context, Looper looper, int i10, t3 t3Var, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, int i11) {
        synchronized (j0.f49660g) {
            try {
                if (j0.h == null) {
                    j0.h = new j0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        j0 j0Var = j0.h;
        Object obj = v5.d.f48793c;
        l.h(kVar);
        l.h(lVar);
        m mVar = new m(kVar);
        m mVar2 = new m(lVar);
        String str = (String) t3Var.f17476e;
        Object obj2 = v5.d.f48793c;
        this.f49634f = null;
        this.f49638w = new Object();
        this.f49639x = new Object();
        this.C = new ArrayList();
        this.E = 1;
        this.K = null;
        this.L = false;
        this.M = null;
        this.N = new AtomicInteger(0);
        l.i(context, "Context must not be null");
        this.f49635n = context;
        l.i(looper, "Looper must not be null");
        this.f49636r = looper;
        l.i(j0Var, "Supervisor must not be null");
        this.f49637s = j0Var;
        this.v = new a0(this, looper);
        this.H = i10;
        this.F = mVar;
        this.G = mVar2;
        this.I = str;
        Set set = (Set) t3Var.f17474b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.O = set;
    }

    public static void D(g gVar) {
        int i10;
        int i11;
        synchronized (gVar.f49638w) {
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
        synchronized (gVar.f49638w) {
            try {
                if (gVar.E != i10) {
                    return false;
                }
                gVar.F(i11, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void A(int i10) {
        this.f49630a = i10;
        this.f49631b = System.currentTimeMillis();
    }

    public void B(int i10, IBinder iBinder, Bundle bundle, int i11) {
        d0 d0Var = new d0(this, i10, iBinder, bundle);
        a0 a0Var = this.v;
        a0Var.sendMessage(a0Var.obtainMessage(1, i11, -1, d0Var));
    }

    public boolean C() {
        return this instanceof l5.a;
    }

    public final void F(int i10, IInterface iInterface) {
        androidx.activity.n nVar;
        l.b((i10 == 4) == (iInterface != null));
        synchronized (this.f49638w) {
            try {
                this.E = i10;
                this.B = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    c0 c0Var = this.D;
                    if (c0Var != null) {
                        j0 j0Var = this.f49637s;
                        String str = (String) this.h.f894b;
                        l.h(str);
                        String str2 = (String) this.h.f895c;
                        if (this.I == null) {
                            this.f49635n.getClass();
                        }
                        j0Var.c(str, str2, c0Var, this.h.f893a);
                        this.D = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    c0 c0Var2 = this.D;
                    if (c0Var2 != null && (nVar = this.h) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) nVar.f894b) + " on " + ((String) nVar.f895c));
                        j0 j0Var2 = this.f49637s;
                        String str3 = (String) this.h.f894b;
                        l.h(str3);
                        String str4 = (String) this.h.f895c;
                        if (this.I == null) {
                            this.f49635n.getClass();
                        }
                        j0Var2.c(str3, str4, c0Var2, this.h.f893a);
                        this.N.incrementAndGet();
                    }
                    c0 c0Var3 = new c0(this, this.N.get());
                    this.D = c0Var3;
                    String strX = x();
                    String strW = w();
                    boolean zY = y();
                    androidx.activity.n nVar2 = new androidx.activity.n();
                    nVar2.f895c = strX;
                    nVar2.f894b = strW;
                    nVar2.f893a = zY;
                    this.h = nVar2;
                    if (zY && k() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.h.f894b)));
                    }
                    j0 j0Var3 = this.f49637s;
                    String str5 = (String) this.h.f894b;
                    l.h(str5);
                    String str6 = (String) this.h.f895c;
                    String name = this.I;
                    if (name == null) {
                        name = this.f49635n.getClass().getName();
                    }
                    v5.a aVarB = j0Var3.b(new g0(str5, str6, this.h.f893a), c0Var3, name);
                    if (!aVarB.c()) {
                        androidx.activity.n nVar3 = this.h;
                        Log.w("GmsClient", "unable to connect to service: " + ((String) nVar3.f894b) + " on " + ((String) nVar3.f895c));
                        int i11 = aVarB.f48785b;
                        if (i11 == -1) {
                            i11 = 16;
                        }
                        if (aVarB.f48786c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", aVarB.f48786c);
                        }
                        int i12 = this.N.get();
                        e0 e0Var = new e0(this, i11, bundle);
                        a0 a0Var = this.v;
                        a0Var.sendMessage(a0Var.obtainMessage(7, i12, -1, e0Var));
                    }
                } else if (i10 == 4) {
                    l.h(iInterface);
                    this.f49632c = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public boolean a() {
        return this instanceof k5.e;
    }

    @Override
    public final Set b() {
        return o() ? this.O : Collections.EMPTY_SET;
    }

    @Override
    public final void c(String str) {
        this.f49634f = str;
        disconnect();
    }

    @Override
    public final boolean d() {
        boolean z10;
        synchronized (this.f49638w) {
            int i10 = this.E;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
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
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f49639x) {
            this.f49640y = null;
        }
        F(1, null);
    }

    @Override
    public final void e(String str, PrintWriter printWriter) {
        int i10;
        IInterface iInterface;
        y yVar;
        synchronized (this.f49638w) {
            i10 = this.E;
            iInterface = this.B;
        }
        synchronized (this.f49639x) {
            yVar = this.f49640y;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i10 == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i10 == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i10 == 4) {
            printWriter.print("CONNECTED");
        } else if (i10 != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
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
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(yVar.f49709a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f49632c > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j10 = this.f49632c;
            printWriterAppend.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
        if (this.f49631b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.f49630a;
            if (i11 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i11 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i11 != 3) {
                printWriter.append((CharSequence) String.valueOf(i11));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j11 = this.f49631b;
            printWriterAppend2.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
        if (this.f49633e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) i8.j.a(this.d));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j12 = this.f49633e;
            printWriterAppend3.println(j12 + " " + simpleDateFormat.format(new Date(j12)));
        }
    }

    @Override
    public final String f() {
        androidx.activity.n nVar;
        if (!h() || (nVar = this.h) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return (String) nVar.f895c;
    }

    @Override
    public final void g(k5.i iVar) {
        ((p0) iVar.f14480b).f3330o.f3270x.post(new a8.b(iVar, 14));
    }

    @Override
    public final boolean h() {
        boolean z10;
        synchronized (this.f49638w) {
            z10 = this.E == 4;
        }
        return z10;
    }

    @Override
    public final void i(h hVar, Set set) {
        Bundle bundleT = t();
        String str = Build.VERSION.SDK_INT < 31 ? this.J : this.J;
        int i10 = this.H;
        int i11 = v5.e.f48794a;
        Scope[] scopeArr = f.A;
        Bundle bundle = new Bundle();
        v5.c[] cVarArr = f.B;
        f fVar = new f(6, i10, i11, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        fVar.d = this.f49635n.getPackageName();
        fVar.h = bundleT;
        if (set != null) {
            fVar.f49620f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (o()) {
            fVar.f49621n = new Account("<<default account>>", "com.google");
            if (hVar != null) {
                fVar.f49619e = hVar.asBinder();
            }
        } else if (this instanceof p7.b) {
            fVar.f49621n = null;
        }
        fVar.f49622r = P;
        fVar.f49623s = r();
        if (C()) {
            fVar.f49625x = true;
        }
        try {
            synchronized (this.f49639x) {
                try {
                    y yVar = this.f49640y;
                    if (yVar != null) {
                        yVar.E0(new b0(this, this.N.get()), fVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e9) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e9);
            int i12 = this.N.get();
            a0 a0Var = this.v;
            a0Var.sendMessage(a0Var.obtainMessage(6, i12, 3));
        } catch (RemoteException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            B(8, null, null, this.N.get());
        } catch (SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            e = e12;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            B(8, null, null, this.N.get());
        }
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public abstract int k();

    @Override
    public final v5.c[] l() {
        f0 f0Var = this.M;
        if (f0Var == null) {
            return null;
        }
        return f0Var.f49628b;
    }

    @Override
    public final String m() {
        return this.f49634f;
    }

    @Override
    public Intent n() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @Override
    public boolean o() {
        return false;
    }

    @Override
    public void p(b bVar) {
        l.i(bVar, "Connection progress callbacks cannot be null.");
        this.A = bVar;
        F(2, null);
    }

    public abstract IInterface q(IBinder iBinder);

    public v5.c[] r() {
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
        synchronized (this.f49638w) {
            try {
                if (this.E == 5) {
                    throw new DeadObjectException();
                }
                if (!h()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface2 = this.B;
                l.i(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th) {
                throw th;
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
        return k() >= 211700000;
    }

    public void z(v5.a aVar) {
        this.d = aVar.f48785b;
        this.f49633e = System.currentTimeMillis();
    }
}
