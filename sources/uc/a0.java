package uc;

import b2.v0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import org.telegram.ui.Wallet.y0;
public final class a0 extends z {
    public final LinkedList f49645b;
    public final o f49646c;
    public boolean d;
    public x e;
    public boolean f49647f;

    public a0(u uVar) {
        super("WritingThread", uVar, 2);
        this.f49645b = new LinkedList();
        this.f49646c = uVar.f49700u;
    }

    @Override
    public final void a() {
        try {
            c();
        } catch (Throwable th2) {
            v vVar = new v(39, "An uncaught throwable was detected in the writing thread: " + th2.getMessage(), th2);
            c2.b bVar = this.f49709a.d;
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
            this.f49647f = true;
            notifyAll();
        }
        d();
    }

    public final void b() {
        try {
            this.f49709a.f49688i.flush();
            synchronized (this) {
            }
        } catch (IOException e) {
            v vVar = new v(27, "Flushing frames to the server failed: " + e.getMessage(), e);
            c2.b bVar = this.f49709a.d;
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
        u uVar = this.f49709a;
        synchronized (uVar.f49687g) {
            uVar.f49695p = true;
            z10 = uVar.f49694o;
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
                        this.f49709a.f49688i.flush();
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
        u uVar = this.f49709a;
        x xVar = this.e;
        synchronized (uVar.f49687g) {
            try {
                uVar.f49697r = true;
                uVar.f49699t = xVar;
                if (!uVar.f49696q) {
                    return;
                }
                uVar.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(uc.x r9) {
        throw new UnsupportedOperationException("Method not decompiled: uc.a0.f(uc.x):void");
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
        o oVar = this.f49646c;
        boolean z10 = true;
        if (oVar != null && (((i10 = xVar.e) == 1 || i10 == 2) && xVar.f49704a && !xVar.f49705b && (bArr = xVar.f49708g) != null && bArr.length != 0)) {
            try {
                bArr2 = oVar.b(bArr);
            } catch (v unused) {
                bArr2 = bArr;
            }
            if (bArr.length > bArr2.length) {
                xVar.c(bArr2);
                xVar.f49705b = true;
            }
        }
        ArrayList arrayList = (ArrayList) this.f49709a.d.n();
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
            ArrayList arrayList2 = (ArrayList) this.f49709a.d.n();
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
            v0 v0Var = this.f49709a.f49684b;
            synchronized (v0Var) {
                int i14 = v0Var.f3511a;
                if (i14 != 4 && i14 != 5) {
                    v0Var.f3511a = 4;
                    if (v0Var.f3512b == 1) {
                        v0Var.f3512b = 3;
                    }
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                this.f49709a.d.e();
            }
        }
        try {
            this.f49709a.f49688i.a(xVar);
            ArrayList arrayList3 = (ArrayList) this.f49709a.d.n();
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
            c2.b bVar = this.f49709a.d;
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
        throw new UnsupportedOperationException("Method not decompiled: uc.a0.i(boolean):void");
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
                if (this.f49645b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                if (this.d) {
                    return 1;
                }
                if (this.f49645b.size() == 0) {
                    return 2;
                }
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
