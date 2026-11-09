package rc;

import bi.b1;
import bi.f9;
import e2.r0;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Wallet.x0;
import org.telegram.ui.web.e1;
public final class u {
    public final s f54497a;
    public final r0 f54498b;
    public final h f54499c;
    public final ab.q d;
    public final p f54500e;
    public final p f54501f;
    public e1 h;
    public y f54503i;
    public q f54504j;
    public a0 f54505k;
    public ArrayList f54506l;
    public boolean f54507m;
    public boolean f54509o;
    public boolean f54510p;
    public boolean f54511q;
    public boolean f54512r;
    public x f54513s;
    public x f54514t;
    public o f54515u;
    public final Object f54502g = new Object();
    public final Object f54508n = new Object();

    public u(boolean z9, String str, String str2, String str3, s sVar) {
        String str4;
        this.f54497a = sVar;
        ?? obj = new Object();
        obj.f10534b = 1;
        obj.f10533a = 1;
        this.f54498b = obj;
        ?? obj2 = new Object();
        obj2.f54468a = str;
        obj2.f54469b = str2;
        obj2.f54470c = str3;
        if (z9) {
            str4 = "wss";
        } else {
            str4 = "ws";
        }
        URI.create(str4 + "://" + str2 + str3);
        this.f54499c = obj2;
        ?? obj3 = new Object();
        obj3.f991c = new ArrayList();
        obj3.f989a = true;
        obj3.f990b = this;
        this.d = obj3;
        this.f54500e = new b1(this, "PingSender", new sa.d(22));
        this.f54501f = new b1(this, "PongSender", new sa.d(22));
    }

    public final void a() {
        synchronized (this.f54508n) {
            try {
                if (this.f54507m) {
                    return;
                }
                this.f54507m = true;
                ab.q qVar = this.d;
                ArrayList arrayList = (ArrayList) qVar.p();
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    x0 x0Var = (x0) obj;
                    try {
                        try {
                            g0.h3(new f9(x0Var.f43297a, 5, x0Var.f43298b, x0Var, (u) qVar.f990b));
                        } catch (Throwable unused) {
                            x0Var.getClass();
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
        synchronized (this.f54498b) {
            r0 r0Var = this.f54498b;
            if (r0Var.f10533a == 1) {
                r0Var.f10533a = 2;
            } else {
                throw new v(1, "The current state of the WebSocket is not CREATED.");
            }
        }
        this.d.g();
        try {
            s sVar2 = this.f54497a;
            try {
                sVar2.a();
                h(sVar2.f54491g);
                ArrayList arrayList = this.f54506l;
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
                this.f54515u = oVar;
                this.f54498b.f10533a = 3;
                this.d.g();
                i();
            } catch (v e10) {
                Socket socket = sVar.f54491g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e10;
            }
        } catch (v e11) {
            Socket socket2 = this.f54497a.f54491g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.f54498b.f10533a = 5;
            this.d.g();
            throw e11;
        }
    }

    public final void c() {
        synchronized (this.f54498b) {
            try {
                int c10 = p1.g.c(this.f54498b.f10533a);
                if (c10 != 0) {
                    if (c10 != 2) {
                        return;
                    }
                    r0 r0Var = this.f54498b;
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
                ab.q qVar = bVar.f54525a.d;
                if (qVar != null) {
                    ArrayList arrayList = (ArrayList) qVar.p();
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        x0 x0Var = (x0) obj;
                        try {
                            try {
                                x0Var.getClass();
                            } catch (Throwable unused) {
                                x0Var.getClass();
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
        this.f54500e.stop();
        this.f54501f.stop();
        Socket socket = this.f54497a.f54491g;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.f54498b) {
            this.f54498b.f10533a = 5;
        }
        this.d.g();
        ab.q qVar = this.d;
        x xVar = this.f54513s;
        x xVar2 = this.f54514t;
        int i7 = 0;
        if (this.f54498b.f10534b == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        ArrayList arrayList = (ArrayList) qVar.p();
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            x0 x0Var = (x0) obj;
            try {
                try {
                    x0Var.a((u) qVar.f990b, xVar, xVar2, z9);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                x0Var.getClass();
            }
        }
    }

    public final void e() {
        boolean z9;
        synchronized (this.f54502g) {
            this.f54509o = true;
            z9 = this.f54510p;
        }
        a();
        if (z9) {
            f();
        }
    }

    public final void f() {
        p pVar = this.f54500e;
        synchronized (pVar) {
        }
        pVar.c1();
        this.f54501f.d1();
    }

    public final void finalize() {
        boolean z9;
        synchronized (this.f54498b) {
            if (this.f54498b.f10533a == 1) {
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
            synchronized (this.f54498b) {
                try {
                    int i7 = this.f54498b.f10533a;
                    if (i7 != 3 && i7 != 4) {
                        return;
                    }
                    a0 a0Var = this.f54505k;
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
        synchronized (this.f54502g) {
            this.f54504j = qVar;
            this.f54505k = a0Var;
        }
        ab.q qVar2 = qVar.f54525a.d;
        int i7 = 0;
        if (qVar2 != null) {
            ArrayList arrayList = (ArrayList) qVar2.p();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                x0 x0Var = (x0) obj;
                try {
                    try {
                        x0Var.getClass();
                    } catch (Throwable unused) {
                        x0Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        ab.q qVar3 = a0Var.f54525a.d;
        if (qVar3 != null) {
            ArrayList arrayList2 = (ArrayList) qVar3.p();
            int size2 = arrayList2.size();
            while (i7 < size2) {
                Object obj2 = arrayList2.get(i7);
                i7++;
                x0 x0Var2 = (x0) obj2;
                try {
                    try {
                        x0Var2.getClass();
                    } catch (Throwable unused3) {
                        x0Var2.getClass();
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
        synchronized (this.f54502g) {
            qVar = this.f54504j;
            a0Var = this.f54505k;
            this.f54504j = null;
            this.f54505k = null;
        }
        if (qVar != null) {
            qVar.i();
        }
        if (a0Var != null) {
            a0Var.g();
        }
    }
}
