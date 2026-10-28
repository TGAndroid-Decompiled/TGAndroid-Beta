package uc;

import b2.v0;
import bi.da;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Wallet.y0;
import org.telegram.ui.web.m1;
public final class u {
    public final s f49718a;
    public final v0 f49719b;
    public final h f49720c;
    public final c2.b d;
    public final p e;
    public final p f49721f;
    public m1 h;
    public y f49723i;
    public q f49724j;
    public a0 f49725k;
    public ArrayList f49726l;
    public boolean f49727m;
    public boolean f49729o;
    public boolean f49730p;
    public boolean f49731q;
    public boolean f49732r;
    public x f49733s;
    public x f49734t;
    public o f49735u;
    public final Object f49722g = new Object();
    public final Object f49728n = new Object();

    public u(boolean z10, String str, String str2, String str3, s sVar) {
        String str4;
        this.f49718a = sVar;
        ?? obj = new Object();
        obj.f3512b = 1;
        obj.f3511a = 1;
        this.f49719b = obj;
        ?? obj2 = new Object();
        obj2.f49693a = str;
        obj2.f49694b = str2;
        obj2.f49695c = str3;
        if (z10) {
            str4 = "wss";
        } else {
            str4 = "ws";
        }
        URI.create(str4 + "://" + str2 + str3);
        this.f49720c = obj2;
        ?? obj3 = new Object();
        obj3.f5931c = new ArrayList();
        obj3.f5929a = true;
        obj3.f5930b = this;
        this.d = obj3;
        this.e = new b2.h(this, "PingSender", new u7.s(23));
        this.f49721f = new b2.h(this, "PongSender", new u7.s(23));
    }

    public final void a() {
        synchronized (this.f49728n) {
            try {
                if (this.f49727m) {
                    return;
                }
                this.f49727m = true;
                c2.b bVar = this.d;
                ArrayList arrayList = (ArrayList) bVar.n();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    y0 y0Var = (y0) obj;
                    try {
                        try {
                            AndroidUtilities.runOnUIThread(new da(y0Var, (u) bVar.f5930b, y0Var.f37514a, y0Var.f37515b, 17));
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
        synchronized (this.f49719b) {
            v0 v0Var = this.f49719b;
            if (v0Var.f3511a == 1) {
                v0Var.f3511a = 2;
            } else {
                throw new v(1, "The current state of the WebSocket is not CREATED.");
            }
        }
        this.d.e();
        try {
            s sVar2 = this.f49718a;
            try {
                sVar2.a();
                h(sVar2.f49713g);
                ArrayList arrayList = this.f49726l;
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
                        w wVar = (w) obj;
                        if (wVar instanceof o) {
                            oVar = (o) wVar;
                            break;
                        }
                    }
                }
                this.f49735u = oVar;
                this.f49719b.f3511a = 3;
                this.d.e();
                i();
            } catch (v e) {
                Socket socket = sVar.f49713g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e;
            }
        } catch (v e10) {
            Socket socket2 = this.f49718a.f49713g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.f49719b.f3511a = 5;
            this.d.e();
            throw e10;
        }
    }

    public final void c() {
        synchronized (this.f49719b) {
            try {
                int c10 = m1.j.c(this.f49719b.f3511a);
                if (c10 != 0) {
                    if (c10 != 2) {
                        return;
                    }
                    v0 v0Var = this.f49719b;
                    v0Var.f3511a = 4;
                    if (v0Var.f3512b == 1) {
                        v0Var.f3512b = 3;
                    }
                    g(x.a(1000, null));
                    this.d.e();
                    j();
                    return;
                }
                b bVar = new b("FinishThread", this, 4, 1);
                c2.b bVar2 = bVar.f49744a.d;
                if (bVar2 != null) {
                    ArrayList arrayList = (ArrayList) bVar2.n();
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
                bVar.start();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        boolean z10;
        this.e.stop();
        this.f49721f.stop();
        Socket socket = this.f49718a.f49713g;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.f49719b) {
            this.f49719b.f3511a = 5;
        }
        this.d.e();
        c2.b bVar = this.d;
        x xVar = this.f49733s;
        x xVar2 = this.f49734t;
        int i10 = 0;
        if (this.f49719b.f3512b == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = (ArrayList) bVar.n();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            y0 y0Var = (y0) obj;
            try {
                try {
                    y0Var.a((u) bVar.f5930b, xVar, xVar2, z10);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                y0Var.getClass();
            }
        }
    }

    public final void e() {
        boolean z10;
        synchronized (this.f49722g) {
            this.f49729o = true;
            z10 = this.f49730p;
        }
        a();
        if (z10) {
            f();
        }
    }

    public final void f() {
        p pVar = this.e;
        synchronized (pVar) {
        }
        pVar.c1();
        this.f49721f.d1();
    }

    public final void finalize() {
        boolean z10;
        synchronized (this.f49719b) {
            if (this.f49719b.f3511a == 1) {
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

    public final void g(x xVar) {
        if (xVar != null) {
            synchronized (this.f49719b) {
                try {
                    int i10 = this.f49719b.f3511a;
                    if (i10 != 3 && i10 != 4) {
                        return;
                    }
                    a0 a0Var = this.f49725k;
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
        throw new UnsupportedOperationException("Method not decompiled: uc.u.h(java.net.Socket):java.util.TreeMap");
    }

    public final void i() {
        q qVar = new q(this);
        a0 a0Var = new a0(this);
        synchronized (this.f49722g) {
            this.f49724j = qVar;
            this.f49725k = a0Var;
        }
        c2.b bVar = qVar.f49744a.d;
        int i10 = 0;
        if (bVar != null) {
            ArrayList arrayList = (ArrayList) bVar.n();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
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
        c2.b bVar2 = a0Var.f49744a.d;
        if (bVar2 != null) {
            ArrayList arrayList2 = (ArrayList) bVar2.n();
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
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
        synchronized (this.f49722g) {
            qVar = this.f49724j;
            a0Var = this.f49725k;
            this.f49724j = null;
            this.f49725k = null;
        }
        if (qVar != null) {
            qVar.i();
        }
        if (a0Var != null) {
            a0Var.g();
        }
    }
}
