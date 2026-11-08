package rc;

import bi.b1;
import bi.f9;
import e2.r0;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Wallet.y0;
import org.telegram.ui.web.e1;
public final class u {
    public final s f54484a;
    public final r0 f54485b;
    public final h f54486c;
    public final ab.q d;
    public final p f54487e;
    public final p f54488f;
    public e1 h;
    public y f54490i;
    public q f54491j;
    public a0 f54492k;
    public ArrayList f54493l;
    public boolean f54494m;
    public boolean f54496o;
    public boolean f54497p;
    public boolean f54498q;
    public boolean f54499r;
    public x f54500s;
    public x f54501t;
    public o f54502u;
    public final Object f54489g = new Object();
    public final Object f54495n = new Object();

    public u(boolean z9, String str, String str2, String str3, s sVar) {
        String str4;
        this.f54484a = sVar;
        ?? obj = new Object();
        obj.f10534b = 1;
        obj.f10533a = 1;
        this.f54485b = obj;
        ?? obj2 = new Object();
        obj2.f54455a = str;
        obj2.f54456b = str2;
        obj2.f54457c = str3;
        if (z9) {
            str4 = "wss";
        } else {
            str4 = "ws";
        }
        URI.create(str4 + "://" + str2 + str3);
        this.f54486c = obj2;
        ?? obj3 = new Object();
        obj3.f991c = new ArrayList();
        obj3.f989a = true;
        obj3.f990b = this;
        this.d = obj3;
        this.f54487e = new b1(this, "PingSender", new sa.d(22));
        this.f54488f = new b1(this, "PongSender", new sa.d(22));
    }

    public final void a() {
        synchronized (this.f54495n) {
            try {
                if (this.f54494m) {
                    return;
                }
                this.f54494m = true;
                ab.q qVar = this.d;
                ArrayList arrayList = (ArrayList) qVar.p();
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    y0 y0Var = (y0) obj;
                    try {
                        try {
                            g0.h3(new f9(y0Var.f43379a, 5, y0Var.f43380b, y0Var, (u) qVar.f990b));
                        } catch (Throwable unused) {
                            y0Var.getClass();
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
        synchronized (this.f54485b) {
            r0 r0Var = this.f54485b;
            if (r0Var.f10533a == 1) {
                r0Var.f10533a = 2;
            } else {
                throw new v(1, "The current state of the WebSocket is not CREATED.");
            }
        }
        this.d.g();
        try {
            s sVar2 = this.f54484a;
            try {
                sVar2.a();
                h(sVar2.f54478g);
                ArrayList arrayList = this.f54493l;
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
                this.f54502u = oVar;
                this.f54485b.f10533a = 3;
                this.d.g();
                i();
            } catch (v e10) {
                Socket socket = sVar.f54478g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e10;
            }
        } catch (v e11) {
            Socket socket2 = this.f54484a.f54478g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.f54485b.f10533a = 5;
            this.d.g();
            throw e11;
        }
    }

    public final void c() {
        synchronized (this.f54485b) {
            try {
                int c10 = p1.g.c(this.f54485b.f10533a);
                if (c10 != 0) {
                    if (c10 != 2) {
                        return;
                    }
                    r0 r0Var = this.f54485b;
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
                ab.q qVar = bVar.f54512a.d;
                if (qVar != null) {
                    ArrayList arrayList = (ArrayList) qVar.p();
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        y0 y0Var = (y0) obj;
                        try {
                            try {
                                y0Var.getClass();
                            } catch (Throwable unused) {
                                y0Var.getClass();
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
        this.f54487e.stop();
        this.f54488f.stop();
        Socket socket = this.f54484a.f54478g;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.f54485b) {
            this.f54485b.f10533a = 5;
        }
        this.d.g();
        ab.q qVar = this.d;
        x xVar = this.f54500s;
        x xVar2 = this.f54501t;
        int i7 = 0;
        if (this.f54485b.f10534b == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        ArrayList arrayList = (ArrayList) qVar.p();
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            y0 y0Var = (y0) obj;
            try {
                try {
                    y0Var.a((u) qVar.f990b, xVar, xVar2, z9);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                y0Var.getClass();
            }
        }
    }

    public final void e() {
        boolean z9;
        synchronized (this.f54489g) {
            this.f54496o = true;
            z9 = this.f54497p;
        }
        a();
        if (z9) {
            f();
        }
    }

    public final void f() {
        p pVar = this.f54487e;
        synchronized (pVar) {
        }
        pVar.c1();
        this.f54488f.d1();
    }

    public final void finalize() {
        boolean z9;
        synchronized (this.f54485b) {
            if (this.f54485b.f10533a == 1) {
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
            synchronized (this.f54485b) {
                try {
                    int i7 = this.f54485b.f10533a;
                    if (i7 != 3 && i7 != 4) {
                        return;
                    }
                    a0 a0Var = this.f54492k;
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
        synchronized (this.f54489g) {
            this.f54491j = qVar;
            this.f54492k = a0Var;
        }
        ab.q qVar2 = qVar.f54512a.d;
        int i7 = 0;
        if (qVar2 != null) {
            ArrayList arrayList = (ArrayList) qVar2.p();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                y0 y0Var = (y0) obj;
                try {
                    try {
                        y0Var.getClass();
                    } catch (Throwable unused) {
                        y0Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        ab.q qVar3 = a0Var.f54512a.d;
        if (qVar3 != null) {
            ArrayList arrayList2 = (ArrayList) qVar3.p();
            int size2 = arrayList2.size();
            while (i7 < size2) {
                Object obj2 = arrayList2.get(i7);
                i7++;
                y0 y0Var2 = (y0) obj2;
                try {
                    try {
                        y0Var2.getClass();
                    } catch (Throwable unused3) {
                        y0Var2.getClass();
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
        synchronized (this.f54489g) {
            qVar = this.f54491j;
            a0Var = this.f54492k;
            this.f54491j = null;
            this.f54492k = null;
        }
        if (qVar != null) {
            qVar.i();
        }
        if (a0Var != null) {
            a0Var.g();
        }
    }
}
