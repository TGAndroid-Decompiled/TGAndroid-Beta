package rc;

import bi.b1;
import bi.f9;
import e2.r0;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Wallet.z0;
import org.telegram.ui.web.e1;
public final class u {
    public final s f54392a;
    public final r0 f54393b;
    public final h f54394c;
    public final ab.q d;
    public final p f54395e;
    public final p f54396f;
    public e1 h;
    public y f54398i;
    public q f54399j;
    public a0 f54400k;
    public ArrayList f54401l;
    public boolean f54402m;
    public boolean f54404o;
    public boolean f54405p;
    public boolean f54406q;
    public boolean f54407r;
    public x f54408s;
    public x f54409t;
    public o f54410u;
    public final Object f54397g = new Object();
    public final Object f54403n = new Object();

    public u(boolean z9, String str, String str2, String str3, s sVar) {
        String str4;
        this.f54392a = sVar;
        ?? obj = new Object();
        obj.f10534b = 1;
        obj.f10533a = 1;
        this.f54393b = obj;
        ?? obj2 = new Object();
        obj2.f54363a = str;
        obj2.f54364b = str2;
        obj2.f54365c = str3;
        if (z9) {
            str4 = "wss";
        } else {
            str4 = "ws";
        }
        URI.create(str4 + "://" + str2 + str3);
        this.f54394c = obj2;
        ?? obj3 = new Object();
        obj3.f991c = new ArrayList();
        obj3.f989a = true;
        obj3.f990b = this;
        this.d = obj3;
        this.f54395e = new b1(this, "PingSender", new sa.d(22));
        this.f54396f = new b1(this, "PongSender", new sa.d(22));
    }

    public final void a() {
        synchronized (this.f54403n) {
            try {
                if (this.f54402m) {
                    return;
                }
                this.f54402m = true;
                ab.q qVar = this.d;
                ArrayList arrayList = (ArrayList) qVar.p();
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    z0 z0Var = (z0) obj;
                    try {
                        try {
                            g0.h3(new f9(z0Var.f43407a, 5, z0Var.f43408b, z0Var, (u) qVar.f990b));
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
        synchronized (this.f54393b) {
            r0 r0Var = this.f54393b;
            if (r0Var.f10533a == 1) {
                r0Var.f10533a = 2;
            } else {
                throw new v(1, "The current state of the WebSocket is not CREATED.");
            }
        }
        this.d.g();
        try {
            s sVar2 = this.f54392a;
            try {
                sVar2.a();
                h(sVar2.f54386g);
                ArrayList arrayList = this.f54401l;
                o oVar = null;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i7);
                        i7++;
                        w wVar = (w) obj;
                        if (wVar instanceof o) {
                            oVar = (o) wVar;
                            break;
                        }
                    }
                }
                this.f54410u = oVar;
                this.f54393b.f10533a = 3;
                this.d.g();
                i();
            } catch (v e10) {
                Socket socket = sVar.f54386g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e10;
            }
        } catch (v e11) {
            Socket socket2 = this.f54392a.f54386g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.f54393b.f10533a = 5;
            this.d.g();
            throw e11;
        }
    }

    public final void c() {
        synchronized (this.f54393b) {
            try {
                int c10 = p1.g.c(this.f54393b.f10533a);
                if (c10 != 0) {
                    if (c10 != 2) {
                        return;
                    }
                    r0 r0Var = this.f54393b;
                    r0Var.f10533a = 4;
                    if (r0Var.f10534b == 1) {
                        r0Var.f10534b = 3;
                    }
                    g(x.a(1000, null));
                    this.d.g();
                    j();
                    return;
                }
                b bVar = new b("FinishThread", this, 4, 1);
                ab.q qVar = bVar.f54420a.d;
                if (qVar != null) {
                    ArrayList arrayList = (ArrayList) qVar.p();
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
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
        boolean z9;
        this.f54395e.stop();
        this.f54396f.stop();
        Socket socket = this.f54392a.f54386g;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.f54393b) {
            this.f54393b.f10533a = 5;
        }
        this.d.g();
        ab.q qVar = this.d;
        x xVar = this.f54408s;
        x xVar2 = this.f54409t;
        int i7 = 0;
        if (this.f54393b.f10534b == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        ArrayList arrayList = (ArrayList) qVar.p();
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            z0 z0Var = (z0) obj;
            try {
                try {
                    z0Var.a((u) qVar.f990b, xVar, xVar2, z9);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                z0Var.getClass();
            }
        }
    }

    public final void e() {
        boolean z9;
        synchronized (this.f54397g) {
            this.f54404o = true;
            z9 = this.f54405p;
        }
        a();
        if (z9) {
            f();
        }
    }

    public final void f() {
        p pVar = this.f54395e;
        synchronized (pVar) {
        }
        pVar.c1();
        this.f54396f.d1();
    }

    public final void finalize() {
        boolean z9;
        synchronized (this.f54393b) {
            if (this.f54393b.f10533a == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        if (z9) {
            d();
        }
        super.finalize();
    }

    public final void g(x xVar) {
        if (xVar != null) {
            synchronized (this.f54393b) {
                try {
                    int i7 = this.f54393b.f10533a;
                    if (i7 != 3 && i7 != 4) {
                        return;
                    }
                    a0 a0Var = this.f54400k;
                    if (a0Var == null) {
                        return;
                    }
                    a0Var.f(xVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final java.util.TreeMap h(java.net.Socket r18) {
        throw new UnsupportedOperationException("Method not decompiled: rc.u.h(java.net.Socket):java.util.TreeMap");
    }

    public final void i() {
        q qVar = new q(this);
        a0 a0Var = new a0(this);
        synchronized (this.f54397g) {
            this.f54399j = qVar;
            this.f54400k = a0Var;
        }
        ab.q qVar2 = qVar.f54420a.d;
        int i7 = 0;
        if (qVar2 != null) {
            ArrayList arrayList = (ArrayList) qVar2.p();
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
        ab.q qVar3 = a0Var.f54420a.d;
        if (qVar3 != null) {
            ArrayList arrayList2 = (ArrayList) qVar3.p();
            int size2 = arrayList2.size();
            while (i7 < size2) {
                Object obj2 = arrayList2.get(i7);
                i7++;
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
        a0Var.start();
    }

    public final void j() {
        q qVar;
        a0 a0Var;
        synchronized (this.f54397g) {
            qVar = this.f54399j;
            a0Var = this.f54400k;
            this.f54399j = null;
            this.f54400k = null;
        }
        if (qVar != null) {
            qVar.i();
        }
        if (a0Var != null) {
            a0Var.g();
        }
    }
}
