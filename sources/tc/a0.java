package tc;

import b2.u0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import org.telegram.ui.Wallet.y0;
public final class a0 extends z {
    public final LinkedList f47374b;
    public final o f47375c;
    public boolean d;
    public x e;
    public boolean f47376f;

    public a0(u uVar) {
        super("WritingThread", uVar, 2);
        this.f47374b = new LinkedList();
        this.f47375c = uVar.f47429u;
    }

    @Override
    public final void a() {
        try {
            c();
        } catch (Throwable th2) {
            v vVar = new v(39, "An uncaught throwable was detected in the writing thread: " + th2.getMessage(), th2);
            c2.b bVar = this.f47438a.d;
            bVar.d(vVar);
            ArrayList arrayList = (ArrayList) bVar.n();
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
                    }
                } catch (Throwable unused2) {
                    y0Var.getClass();
                }
            }
        }
        synchronized (this) {
            this.f47376f = true;
            notifyAll();
        }
        d();
    }

    public final void b() {
        try {
            this.f47438a.f47417i.flush();
            synchronized (this) {
            }
        } catch (IOException e) {
            v vVar = new v(27, "Flushing frames to the server failed: " + e.getMessage(), e);
            c2.b bVar = this.f47438a.d;
            bVar.d(vVar);
            ArrayList arrayList = (ArrayList) bVar.n();
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
            throw vVar;
        }
    }

    public final void c() {
        boolean z10;
        u uVar = this.f47438a;
        synchronized (uVar.f47416g) {
            uVar.f47424p = true;
            z10 = uVar.f47423o;
        }
        uVar.a();
        if (z10) {
            uVar.f();
        }
        while (true) {
            int j10 = j();
            if (j10 != 1) {
                if (j10 == 3) {
                    try {
                        this.f47438a.f47417i.flush();
                    } catch (IOException unused) {
                    }
                } else if (j10 == 2) {
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
        u uVar = this.f47438a;
        x xVar = this.e;
        synchronized (uVar.f47416g) {
            try {
                uVar.f47426r = true;
                uVar.f47428t = xVar;
                if (!uVar.f47425q) {
                    return;
                }
                uVar.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(tc.x r9) {
        throw new UnsupportedOperationException("Method not decompiled: tc.a0.f(tc.x):void");
    }

    public final void g() {
        synchronized (this) {
            this.d = true;
            notifyAll();
        }
    }

    public final void h(x xVar) {
        int i10;
        byte[] bArr;
        byte[] bArr2;
        o oVar = this.f47375c;
        boolean z10 = true;
        if (oVar != null && (((i10 = xVar.e) == 1 || i10 == 2) && xVar.f47433a && !xVar.f47434b && (bArr = xVar.f47437g) != null && bArr.length != 0)) {
            try {
                bArr2 = oVar.b(bArr);
            } catch (v unused) {
                bArr2 = bArr;
            }
            if (bArr.length > bArr2.length) {
                xVar.c(bArr2);
                xVar.f47434b = true;
            }
        }
        ArrayList arrayList = (ArrayList) this.f47438a.d.n();
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            y0 y0Var = (y0) obj;
            try {
                try {
                    y0Var.getClass();
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                y0Var.getClass();
            }
        }
        if (this.e != null) {
            ArrayList arrayList2 = (ArrayList) this.f47438a.d.n();
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                y0 y0Var2 = (y0) obj2;
                try {
                    try {
                        y0Var2.getClass();
                    } catch (Throwable unused4) {
                        y0Var2.getClass();
                    }
                } catch (Throwable unused5) {
                }
            }
            return;
        }
        int i13 = xVar.e;
        if (i13 == 8) {
            this.e = xVar;
        }
        if (i13 == 8) {
            u0 u0Var = this.f47438a.f47413b;
            synchronized (u0Var) {
                int i14 = u0Var.f4060a;
                if (i14 != 4 && i14 != 5) {
                    u0Var.f4060a = 4;
                    if (u0Var.f4061b == 1) {
                        u0Var.f4061b = 3;
                    }
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                this.f47438a.d.e();
            }
        }
        try {
            this.f47438a.f47417i.a(xVar);
            ArrayList arrayList3 = (ArrayList) this.f47438a.d.n();
            int size3 = arrayList3.size();
            while (i11 < size3) {
                Object obj3 = arrayList3.get(i11);
                i11++;
                y0 y0Var3 = (y0) obj3;
                try {
                    try {
                        y0Var3.getClass();
                    } catch (Throwable unused6) {
                        y0Var3.getClass();
                    }
                } catch (Throwable unused7) {
                }
            }
        } catch (IOException e) {
            v vVar = new v(26, "An I/O error occurred when a frame was tried to be sent: " + e.getMessage(), e);
            c2.b bVar = this.f47438a.d;
            bVar.d(vVar);
            ArrayList arrayList4 = (ArrayList) bVar.n();
            int size4 = arrayList4.size();
            while (i11 < size4) {
                Object obj4 = arrayList4.get(i11);
                i11++;
                y0 y0Var4 = (y0) obj4;
                try {
                    try {
                        y0Var4.getClass();
                    } catch (Throwable unused8) {
                        y0Var4.getClass();
                    }
                } catch (Throwable unused9) {
                }
            }
            throw vVar;
        }
    }

    public final void i(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: tc.a0.i(boolean):void");
    }

    public final int j() {
        synchronized (this) {
            try {
                if (this.d) {
                    return 1;
                }
                if (this.e != null) {
                    return 1;
                }
                if (this.f47374b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                if (this.d) {
                    return 1;
                }
                if (this.f47374b.size() == 0) {
                    return 2;
                }
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
