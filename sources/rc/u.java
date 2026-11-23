package rc;

import bi.w3;
import e2.r0;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.ui.Wallet.i1;
import org.telegram.ui.web.d1;
public final class u {
    public final s f56665a;
    public final r0 f56666b;
    public final h f56667c;
    public final ab.q d;
    public final p f56668e;
    public final p f56669f;
    public d1 h;
    public y f56671i;
    public q f56672j;
    public a0 f56673k;
    public ArrayList f56674l;
    public boolean f56675m;
    public boolean f56677o;
    public boolean f56678p;
    public boolean f56679q;
    public boolean f56680r;
    public x f56681s;
    public x f56682t;
    public o f56683u;
    public final Object f56670g = new Object();
    public final Object f56676n = new Object();

    public u(boolean z10, String str, String str2, String str3, s sVar) {
        String str4;
        this.f56665a = sVar;
        ?? obj = new Object();
        obj.f10678b = 1;
        obj.f10677a = 1;
        this.f56666b = obj;
        ?? obj2 = new Object();
        obj2.f56636a = str;
        obj2.f56637b = str2;
        obj2.f56638c = str3;
        if (z10) {
            str4 = "wss";
        } else {
            str4 = "ws";
        }
        URI.create(str4 + "://" + str2 + str3);
        this.f56667c = obj2;
        ?? obj3 = new Object();
        obj3.f989c = new ArrayList();
        obj3.f987a = true;
        obj3.f988b = this;
        this.d = obj3;
        this.f56668e = new com.google.android.gms.common.api.q(this, "PingSender", new pb.b(23));
        this.f56669f = new com.google.android.gms.common.api.q(this, "PongSender", new pb.b(23));
    }

    public final void a() {
        synchronized (this.f56676n) {
            try {
                if (this.f56675m) {
                    return;
                }
                this.f56675m = true;
                ab.q qVar = this.d;
                ArrayList arrayList = (ArrayList) qVar.q();
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    i1 i1Var = (i1) obj;
                    try {
                        try {
                            g0.g3(new w3(i1Var.f44458a, 6, i1Var.f44459b, i1Var, (u) qVar.f988b));
                        } catch (Throwable unused) {
                            i1Var.getClass();
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
        synchronized (this.f56666b) {
            r0 r0Var = this.f56666b;
            if (r0Var.f10677a == 1) {
                r0Var.f10677a = 2;
            } else {
                throw new v(1, "The current state of the WebSocket is not CREATED.");
            }
        }
        this.d.e();
        try {
            s sVar2 = this.f56665a;
            try {
                sVar2.a();
                h(sVar2.f56659g);
                ArrayList arrayList = this.f56674l;
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
                this.f56683u = oVar;
                this.f56666b.f10677a = 3;
                this.d.e();
                i();
            } catch (v e10) {
                Socket socket = sVar.f56659g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e10;
            }
        } catch (v e11) {
            Socket socket2 = this.f56665a.f56659g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.f56666b.f10677a = 5;
            this.d.e();
            throw e11;
        }
    }

    public final void c() {
        synchronized (this.f56666b) {
            try {
                int c10 = p1.g.c(this.f56666b.f10677a);
                if (c10 != 0) {
                    if (c10 != 2) {
                        return;
                    }
                    r0 r0Var = this.f56666b;
                    r0Var.f10677a = 4;
                    if (r0Var.f10678b == 1) {
                        r0Var.f10678b = 3;
                    }
                    g(x.a(1000, null));
                    this.d.e();
                    j();
                    return;
                }
                b bVar = new b("FinishThread", this, 4, 1);
                ab.q qVar = bVar.f56693a.d;
                if (qVar != null) {
                    ArrayList arrayList = (ArrayList) qVar.q();
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        i1 i1Var = (i1) obj;
                        try {
                            try {
                                i1Var.getClass();
                            } catch (Throwable unused) {
                                i1Var.getClass();
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
        this.f56668e.stop();
        this.f56669f.stop();
        Socket socket = this.f56665a.f56659g;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.f56666b) {
            this.f56666b.f10677a = 5;
        }
        this.d.e();
        ab.q qVar = this.d;
        x xVar = this.f56681s;
        x xVar2 = this.f56682t;
        int i7 = 0;
        if (this.f56666b.f10678b == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = (ArrayList) qVar.q();
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            i1 i1Var = (i1) obj;
            try {
                try {
                    i1Var.a((u) qVar.f988b, xVar, xVar2, z10);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                i1Var.getClass();
            }
        }
    }

    public final void e() {
        boolean z10;
        synchronized (this.f56670g) {
            this.f56677o = true;
            z10 = this.f56678p;
        }
        a();
        if (z10) {
            f();
        }
    }

    public final void f() {
        p pVar = this.f56668e;
        synchronized (pVar) {
        }
        pVar.c1();
        this.f56669f.d1();
    }

    public final void finalize() {
        boolean z10;
        synchronized (this.f56666b) {
            if (this.f56666b.f10677a == 1) {
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
            synchronized (this.f56666b) {
                try {
                    int i7 = this.f56666b.f10677a;
                    if (i7 != 3 && i7 != 4) {
                        return;
                    }
                    a0 a0Var = this.f56673k;
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
        synchronized (this.f56670g) {
            this.f56672j = qVar;
            this.f56673k = a0Var;
        }
        ab.q qVar2 = qVar.f56693a.d;
        int i7 = 0;
        if (qVar2 != null) {
            ArrayList arrayList = (ArrayList) qVar2.q();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                i1 i1Var = (i1) obj;
                try {
                    try {
                        i1Var.getClass();
                    } catch (Throwable unused) {
                        i1Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        ab.q qVar3 = a0Var.f56693a.d;
        if (qVar3 != null) {
            ArrayList arrayList2 = (ArrayList) qVar3.q();
            int size2 = arrayList2.size();
            while (i7 < size2) {
                Object obj2 = arrayList2.get(i7);
                i7++;
                i1 i1Var2 = (i1) obj2;
                try {
                    try {
                        i1Var2.getClass();
                    } catch (Throwable unused3) {
                        i1Var2.getClass();
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
        synchronized (this.f56670g) {
            qVar = this.f56672j;
            a0Var = this.f56673k;
            this.f56672j = null;
            this.f56673k = null;
        }
        if (qVar != null) {
            qVar.i();
        }
        if (a0Var != null) {
            a0Var.g();
        }
    }
}
