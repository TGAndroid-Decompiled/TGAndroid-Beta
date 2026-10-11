package sc;

import b2.q0;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.h7;
import org.telegram.ui.Wallet.z0;
import org.telegram.ui.web.m1;
public final class u {
    public final s f48063a;
    public final q0 f48064b;
    public final h f48065c;
    public final com.google.firebase.messaging.m d;
    public final p f48066e;
    public final p f48067f;
    public m1 h;
    public z f48069i;
    public q f48070j;
    public b0 f48071k;
    public ArrayList f48072l;
    public boolean f48073m;
    public boolean f48075o;
    public boolean f48076p;
    public boolean f48077q;
    public boolean f48078r;
    public y f48079s;
    public y f48080t;
    public o f48081u;
    public final Object f48068g = new Object();
    public final Object f48074n = new Object();

    public u(boolean z10, String str, String str2, String str3, s sVar) {
        String str4;
        this.f48063a = sVar;
        ?? obj = new Object();
        obj.f3534b = 1;
        obj.f3533a = 1;
        this.f48064b = obj;
        ?? obj2 = new Object();
        obj2.f48034a = str;
        obj2.f48035b = str2;
        obj2.f48036c = str3;
        if (z10) {
            str4 = "wss";
        } else {
            str4 = "ws";
        }
        URI.create(str4 + "://" + str2 + str3);
        this.f48065c = obj2;
        ?? obj3 = new Object();
        obj3.f7952c = new ArrayList();
        obj3.f7950a = true;
        obj3.f7951b = this;
        this.d = obj3;
        this.f48066e = new b2.g(this, "PingSender", new ob.a(22));
        this.f48067f = new b2.g(this, "PongSender", new ob.a(22));
    }

    public final void a() {
        synchronized (this.f48074n) {
            try {
                if (this.f48073m) {
                    return;
                }
                this.f48073m = true;
                com.google.firebase.messaging.m mVar = this.d;
                ArrayList arrayList = (ArrayList) mVar.n();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    z0 z0Var = (z0) obj;
                    try {
                        try {
                            AndroidUtilities.runOnUIThread(new h7(z0Var, (u) mVar.f7951b, z0Var.f35799a, z0Var.f35800b, 15));
                        } catch (Throwable unused) {
                            z0Var.getClass();
                        }
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        s sVar;
        synchronized (this.f48064b) {
            q0 q0Var = this.f48064b;
            if (q0Var.f3533a == 1) {
                q0Var.f3533a = 2;
            } else {
                throw new w(1, "The current state of the WebSocket is not CREATED.");
            }
        }
        this.d.e();
        try {
            s sVar2 = this.f48063a;
            try {
                sVar2.a();
                h(sVar2.f48057g);
                ArrayList arrayList = this.f48072l;
                o oVar = null;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i10);
                        i10++;
                        x xVar = (x) obj;
                        if (xVar instanceof o) {
                            oVar = (o) xVar;
                            break;
                        }
                    }
                }
                this.f48081u = oVar;
                this.f48064b.f3533a = 3;
                this.d.e();
                i();
            } catch (w e7) {
                Socket socket = sVar.f48057g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e7;
            }
        } catch (w e10) {
            Socket socket2 = this.f48063a.f48057g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.f48064b.f3533a = 5;
            this.d.e();
            throw e10;
        }
    }

    public final void c() {
        synchronized (this.f48064b) {
            try {
                int c10 = m1.j.c(this.f48064b.f3533a);
                if (c10 != 0) {
                    if (c10 != 2) {
                        return;
                    }
                    q0 q0Var = this.f48064b;
                    q0Var.f3533a = 4;
                    if (q0Var.f3534b == 1) {
                        q0Var.f3534b = 3;
                    }
                    g(y.a(1000, null));
                    this.d.e();
                    j();
                    return;
                }
                b bVar = new b("FinishThread", this, 4, 1);
                com.google.firebase.messaging.m mVar = bVar.f48015a.d;
                if (mVar != null) {
                    ArrayList arrayList = (ArrayList) mVar.n();
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        z0 z0Var = (z0) obj;
                        try {
                            try {
                                z0Var.getClass();
                            } catch (Throwable unused) {
                                z0Var.getClass();
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
                bVar.start();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        boolean z10;
        this.f48066e.stop();
        this.f48067f.stop();
        Socket socket = this.f48063a.f48057g;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.f48064b) {
            this.f48064b.f3533a = 5;
        }
        this.d.e();
        com.google.firebase.messaging.m mVar = this.d;
        y yVar = this.f48079s;
        y yVar2 = this.f48080t;
        int i10 = 0;
        if (this.f48064b.f3534b == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = (ArrayList) mVar.n();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z0 z0Var = (z0) obj;
            try {
                try {
                    z0Var.a((u) mVar.f7951b, yVar, yVar2, z10);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                z0Var.getClass();
            }
        }
    }

    public final void e() {
        boolean z10;
        synchronized (this.f48068g) {
            this.f48075o = true;
            z10 = this.f48076p;
        }
        a();
        if (z10) {
            f();
        }
    }

    public final void f() {
        p pVar = this.f48066e;
        synchronized (pVar) {
        }
        pVar.Z0();
        this.f48067f.a1();
    }

    public final void finalize() {
        boolean z10;
        synchronized (this.f48064b) {
            if (this.f48064b.f3533a == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            d();
        }
        super.finalize();
    }

    public final void g(y yVar) {
        if (yVar != null) {
            synchronized (this.f48064b) {
                try {
                    int i10 = this.f48064b.f3533a;
                    if (i10 != 3 && i10 != 4) {
                        return;
                    }
                    b0 b0Var = this.f48071k;
                    if (b0Var == null) {
                        return;
                    }
                    b0Var.f(yVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final java.util.TreeMap h(java.net.Socket r18) {
        throw new UnsupportedOperationException("Method not decompiled: sc.u.h(java.net.Socket):java.util.TreeMap");
    }

    public final void i() {
        q qVar = new q(this);
        b0 b0Var = new b0(this);
        synchronized (this.f48068g) {
            this.f48070j = qVar;
            this.f48071k = b0Var;
        }
        com.google.firebase.messaging.m mVar = qVar.f48015a.d;
        int i10 = 0;
        if (mVar != null) {
            ArrayList arrayList = (ArrayList) mVar.n();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                z0 z0Var = (z0) obj;
                try {
                    try {
                        z0Var.getClass();
                    } catch (Throwable unused) {
                        z0Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        com.google.firebase.messaging.m mVar2 = b0Var.f48015a.d;
        if (mVar2 != null) {
            ArrayList arrayList2 = (ArrayList) mVar2.n();
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                z0 z0Var2 = (z0) obj2;
                try {
                    try {
                        z0Var2.getClass();
                    } catch (Throwable unused3) {
                        z0Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        qVar.start();
        b0Var.start();
    }

    public final void j() {
        q qVar;
        b0 b0Var;
        synchronized (this.f48068g) {
            qVar = this.f48070j;
            b0Var = this.f48071k;
            this.f48070j = null;
            this.f48071k = null;
        }
        if (qVar != null) {
            qVar.i();
        }
        if (b0Var != null) {
            b0Var.g();
        }
    }
}
