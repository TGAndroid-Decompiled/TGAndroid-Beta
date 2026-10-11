package sc;

import b2.q0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import org.telegram.ui.Wallet.z0;
public final class b0 extends a0 {
    public final LinkedList f48017b;
    public final o f48018c;
    public boolean d;
    public y f48019e;
    public boolean f48020f;

    public b0(u uVar) {
        super("WritingThread", uVar, 2);
        this.f48017b = new LinkedList();
        this.f48018c = uVar.f48081u;
    }

    @Override
    public final void a() {
        try {
            c();
        } catch (Throwable th2) {
            w wVar = new w(39, "An uncaught throwable was detected in the writing thread: " + th2.getMessage(), th2);
            com.google.firebase.messaging.m mVar = this.f48015a.d;
            mVar.d(wVar);
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
                    }
                } catch (Throwable unused2) {
                    z0Var.getClass();
                }
            }
        }
        synchronized (this) {
            this.f48020f = true;
            notifyAll();
        }
        e();
    }

    public final void b() {
        try {
            this.f48015a.f48069i.flush();
            synchronized (this) {
            }
        } catch (IOException e7) {
            w wVar = new w(27, "Flushing frames to the server failed: " + e7.getMessage(), e7);
            com.google.firebase.messaging.m mVar = this.f48015a.d;
            mVar.d(wVar);
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
            throw wVar;
        }
    }

    public final void c() {
        boolean z10;
        u uVar = this.f48015a;
        synchronized (uVar.f48068g) {
            uVar.f48076p = true;
            z10 = uVar.f48075o;
        }
        uVar.a();
        if (z10) {
            uVar.f();
        }
        while (true) {
            int j3 = j();
            if (j3 != 1) {
                if (j3 == 3) {
                    try {
                        this.f48015a.f48069i.flush();
                    } catch (IOException unused) {
                    }
                } else if (j3 == 2) {
                    continue;
                } else {
                    try {
                        i(false);
                    } catch (w unused2) {
                    }
                }
            }
            try {
                i(true);
                return;
            } catch (w unused3) {
                return;
            }
        }
    }

    public final void e() {
        u uVar = this.f48015a;
        y yVar = this.f48019e;
        synchronized (uVar.f48068g) {
            try {
                uVar.f48078r = true;
                uVar.f48080t = yVar;
                if (!uVar.f48077q) {
                    return;
                }
                uVar.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(sc.y r9) {
        throw new UnsupportedOperationException("Method not decompiled: sc.b0.f(sc.y):void");
    }

    public final void g() {
        synchronized (this) {
            this.d = true;
            notifyAll();
        }
    }

    public final void h(y yVar) {
        int i10;
        byte[] bArr;
        byte[] bArr2;
        o oVar = this.f48018c;
        boolean z10 = true;
        if (oVar != null && (((i10 = yVar.f48088e) == 1 || i10 == 2) && yVar.f48085a && !yVar.f48086b && (bArr = yVar.f48090g) != null && bArr.length != 0)) {
            try {
                bArr2 = oVar.b(bArr);
            } catch (w unused) {
                bArr2 = bArr;
            }
            if (bArr.length > bArr2.length) {
                yVar.c(bArr2);
                yVar.f48086b = true;
            }
        }
        ArrayList arrayList = (ArrayList) this.f48015a.d.n();
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
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
        if (this.f48019e != null) {
            ArrayList arrayList2 = (ArrayList) this.f48015a.d.n();
            int size2 = arrayList2.size();
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
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
        int i13 = yVar.f48088e;
        if (i13 == 8) {
            this.f48019e = yVar;
        }
        if (i13 == 8) {
            q0 q0Var = this.f48015a.f48064b;
            synchronized (q0Var) {
                int i14 = q0Var.f3533a;
                if (i14 != 4 && i14 != 5) {
                    q0Var.f3533a = 4;
                    if (q0Var.f3534b == 1) {
                        q0Var.f3534b = 3;
                    }
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                this.f48015a.d.e();
            }
        }
        try {
            this.f48015a.f48069i.a(yVar);
            ArrayList arrayList3 = (ArrayList) this.f48015a.d.n();
            int size3 = arrayList3.size();
            while (i11 < size3) {
                Object obj3 = arrayList3.get(i11);
                i11++;
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
        } catch (IOException e7) {
            w wVar = new w(26, "An I/O error occurred when a frame was tried to be sent: " + e7.getMessage(), e7);
            com.google.firebase.messaging.m mVar = this.f48015a.d;
            mVar.d(wVar);
            ArrayList arrayList4 = (ArrayList) mVar.n();
            int size4 = arrayList4.size();
            while (i11 < size4) {
                Object obj4 = arrayList4.get(i11);
                i11++;
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
            throw wVar;
        }
    }

    public final void i(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: sc.b0.i(boolean):void");
    }

    public final int j() {
        synchronized (this) {
            try {
                if (this.d) {
                    return 1;
                }
                if (this.f48019e != null) {
                    return 1;
                }
                if (this.f48017b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                if (this.d) {
                    return 1;
                }
                if (this.f48017b.size() == 0) {
                    return 2;
                }
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
