package rc;

import e2.r0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import org.telegram.ui.Wallet.z0;
public final class a0 extends z {
    public final LinkedList f54345b;
    public final o f54346c;
    public boolean d;
    public x f54347e;
    public boolean f54348f;

    public a0(u uVar) {
        super("WritingThread", uVar, 2);
        this.f54345b = new LinkedList();
        this.f54346c = uVar.f54410u;
    }

    @Override
    public final void a() {
        try {
            c();
        } catch (Throwable th2) {
            v vVar = new v(39, "An uncaught throwable was detected in the writing thread: " + th2.getMessage(), th2);
            ab.q qVar = this.f54420a.d;
            qVar.d(vVar);
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
                    }
                } catch (Throwable unused2) {
                    z0Var.getClass();
                }
            }
        }
        synchronized (this) {
            this.f54348f = true;
            notifyAll();
        }
        d();
    }

    public final void b() {
        try {
            this.f54420a.f54398i.flush();
            synchronized (this) {
            }
        } catch (IOException e10) {
            v vVar = new v(27, "Flushing frames to the server failed: " + e10.getMessage(), e10);
            ab.q qVar = this.f54420a.d;
            qVar.d(vVar);
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
            throw vVar;
        }
    }

    public final void c() {
        boolean z9;
        u uVar = this.f54420a;
        synchronized (uVar.f54397g) {
            uVar.f54405p = true;
            z9 = uVar.f54404o;
        }
        uVar.a();
        if (z9) {
            uVar.f();
        }
        while (true) {
            int j3 = j();
            if (j3 != 1) {
                if (j3 == 3) {
                    try {
                        this.f54420a.f54398i.flush();
                    } catch (IOException unused) {
                    }
                } else if (j3 == 2) {
                    continue;
                } else {
                    try {
                        i(false);
                    } catch (v unused2) {
                    }
                }
            }
            try {
                i(true);
                return;
            } catch (v unused3) {
                return;
            }
        }
    }

    public final void d() {
        u uVar = this.f54420a;
        x xVar = this.f54347e;
        synchronized (uVar.f54397g) {
            try {
                uVar.f54407r = true;
                uVar.f54409t = xVar;
                if (!uVar.f54406q) {
                    return;
                }
                uVar.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(rc.x r9) {
        throw new UnsupportedOperationException("Method not decompiled: rc.a0.f(rc.x):void");
    }

    public final void g() {
        synchronized (this) {
            this.d = true;
            notifyAll();
        }
    }

    public final void h(x xVar) {
        int i7;
        byte[] bArr;
        byte[] bArr2;
        o oVar = this.f54346c;
        boolean z9 = true;
        if (oVar != null && (((i7 = xVar.f54417e) == 1 || i7 == 2) && xVar.f54414a && !xVar.f54415b && (bArr = xVar.f54419g) != null && bArr.length != 0)) {
            try {
                bArr2 = oVar.b(bArr);
            } catch (v unused) {
                bArr2 = bArr;
            }
            if (bArr.length > bArr2.length) {
                xVar.c(bArr2);
                xVar.f54415b = true;
            }
        }
        ArrayList arrayList = (ArrayList) this.f54420a.d.p();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            z0 z0Var = (z0) obj;
            try {
                try {
                    z0Var.getClass();
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                z0Var.getClass();
            }
        }
        if (this.f54347e != null) {
            ArrayList arrayList2 = (ArrayList) this.f54420a.d.p();
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                z0 z0Var2 = (z0) obj2;
                try {
                    try {
                        z0Var2.getClass();
                    } catch (Throwable unused4) {
                        z0Var2.getClass();
                    }
                } catch (Throwable unused5) {
                }
            }
            return;
        }
        int i12 = xVar.f54417e;
        if (i12 == 8) {
            this.f54347e = xVar;
        }
        if (i12 == 8) {
            r0 r0Var = this.f54420a.f54393b;
            synchronized (r0Var) {
                int i13 = r0Var.f10533a;
                if (i13 != 4 && i13 != 5) {
                    r0Var.f10533a = 4;
                    if (r0Var.f10534b == 1) {
                        r0Var.f10534b = 3;
                    }
                } else {
                    z9 = false;
                }
            }
            if (z9) {
                this.f54420a.d.g();
            }
        }
        try {
            this.f54420a.f54398i.a(xVar);
            ArrayList arrayList3 = (ArrayList) this.f54420a.d.p();
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                z0 z0Var3 = (z0) obj3;
                try {
                    try {
                        z0Var3.getClass();
                    } catch (Throwable unused6) {
                        z0Var3.getClass();
                    }
                } catch (Throwable unused7) {
                }
            }
        } catch (IOException e10) {
            v vVar = new v(26, "An I/O error occurred when a frame was tried to be sent: " + e10.getMessage(), e10);
            ab.q qVar = this.f54420a.d;
            qVar.d(vVar);
            ArrayList arrayList4 = (ArrayList) qVar.p();
            int size4 = arrayList4.size();
            while (i10 < size4) {
                Object obj4 = arrayList4.get(i10);
                i10++;
                z0 z0Var4 = (z0) obj4;
                try {
                    try {
                        z0Var4.getClass();
                    } catch (Throwable unused8) {
                        z0Var4.getClass();
                    }
                } catch (Throwable unused9) {
                }
            }
            throw vVar;
        }
    }

    public final void i(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: rc.a0.i(boolean):void");
    }

    public final int j() {
        synchronized (this) {
            try {
                if (this.d) {
                    return 1;
                }
                if (this.f54347e != null) {
                    return 1;
                }
                if (this.f54345b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                if (this.d) {
                    return 1;
                }
                if (this.f54345b.size() == 0) {
                    return 2;
                }
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
