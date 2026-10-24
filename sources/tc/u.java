package tc;

import ai.c1;
import ai.yb;
import b2.u0;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Wallet.y0;
import org.telegram.ui.web.m1;
public final class u {
    public final s f47411a;
    public final u0 f47412b;
    public final h f47413c;
    public final c2.b d;
    public final p e;
    public final p f47414f;
    public m1 h;
    public y f47416i;
    public q f47417j;
    public a0 f47418k;
    public ArrayList f47419l;
    public boolean f47420m;
    public boolean f47422o;
    public boolean f47423p;
    public boolean f47424q;
    public boolean f47425r;
    public x f47426s;
    public x f47427t;
    public o f47428u;
    public final Object f47415g = new Object();
    public final Object f47421n = new Object();

    public u(boolean z10, String str, String str2, String str3, s sVar) {
        String str4;
        this.f47411a = sVar;
        ?? obj = new Object();
        obj.f4061b = 1;
        obj.f4060a = 1;
        this.f47412b = obj;
        ?? obj2 = new Object();
        obj2.f47386a = str;
        obj2.f47387b = str2;
        obj2.f47388c = str3;
        if (z10) {
            str4 = "wss";
        } else {
            str4 = "ws";
        }
        URI.create(str4 + "://" + str2 + str3);
        this.f47413c = obj2;
        ?? obj3 = new Object();
        obj3.f4495c = new ArrayList();
        obj3.f4493a = true;
        obj3.f4494b = this;
        this.d = obj3;
        this.e = new c1(this, "PingSender", new rb.b(23));
        this.f47414f = new c1(this, "PongSender", new rb.b(23));
    }

    public final void a() {
        synchronized (this.f47421n) {
            try {
                if (this.f47420m) {
                    return;
                }
                this.f47420m = true;
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
                            AndroidUtilities.runOnUIThread(new yb(y0Var, (u) bVar.f4494b, y0Var.f35427a, y0Var.f35428b, 16));
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
        synchronized (this.f47412b) {
            u0 u0Var = this.f47412b;
            if (u0Var.f4060a == 1) {
                u0Var.f4060a = 2;
            } else {
                throw new v(1, "The current state of the WebSocket is not CREATED.");
            }
        }
        this.d.e();
        try {
            s sVar2 = this.f47411a;
            try {
                sVar2.a();
                h(sVar2.f47406g);
                ArrayList arrayList = this.f47419l;
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
                this.f47428u = oVar;
                this.f47412b.f4060a = 3;
                this.d.e();
                i();
            } catch (v e) {
                Socket socket = sVar.f47406g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e;
            }
        } catch (v e7) {
            Socket socket2 = this.f47411a.f47406g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.f47412b.f4060a = 5;
            this.d.e();
            throw e7;
        }
    }

    public final void c() {
        synchronized (this.f47412b) {
            try {
                int c10 = m1.j.c(this.f47412b.f4060a);
                if (c10 != 0) {
                    if (c10 != 2) {
                        return;
                    }
                    u0 u0Var = this.f47412b;
                    u0Var.f4060a = 4;
                    if (u0Var.f4061b == 1) {
                        u0Var.f4061b = 3;
                    }
                    g(x.a(1000, null));
                    this.d.e();
                    j();
                    return;
                }
                b bVar = new b("FinishThread", this, 4, 1);
                c2.b bVar2 = bVar.f47437a.d;
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
        this.f47414f.stop();
        Socket socket = this.f47411a.f47406g;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.f47412b) {
            this.f47412b.f4060a = 5;
        }
        this.d.e();
        c2.b bVar = this.d;
        x xVar = this.f47426s;
        x xVar2 = this.f47427t;
        int i10 = 0;
        if (this.f47412b.f4061b == 2) {
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
                    y0Var.a((u) bVar.f4494b, xVar, xVar2, z10);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                y0Var.getClass();
            }
        }
    }

    public final void e() {
        boolean z10;
        synchronized (this.f47415g) {
            this.f47422o = true;
            z10 = this.f47423p;
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
        this.f47414f.d1();
    }

    public final void finalize() {
        boolean z10;
        synchronized (this.f47412b) {
            if (this.f47412b.f4060a == 1) {
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
            synchronized (this.f47412b) {
                try {
                    int i10 = this.f47412b.f4060a;
                    if (i10 != 3 && i10 != 4) {
                        return;
                    }
                    a0 a0Var = this.f47418k;
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
        throw new UnsupportedOperationException("Method not decompiled: tc.u.h(java.net.Socket):java.util.TreeMap");
    }

    public final void i() {
        q qVar = new q(this);
        a0 a0Var = new a0(this);
        synchronized (this.f47415g) {
            this.f47417j = qVar;
            this.f47418k = a0Var;
        }
        c2.b bVar = qVar.f47437a.d;
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
        c2.b bVar2 = a0Var.f47437a.d;
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
        synchronized (this.f47415g) {
            qVar = this.f47417j;
            a0Var = this.f47418k;
            this.f47417j = null;
            this.f47418k = null;
        }
        if (qVar != null) {
            qVar.i();
        }
        if (a0Var != null) {
            a0Var.g();
        }
    }
}
