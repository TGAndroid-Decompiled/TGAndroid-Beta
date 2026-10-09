package sc;

import ci.n2;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.ui.Wallet.y0;
public final class q extends a0 {
    public boolean f47918b;
    public y f47919c;
    public final ArrayList d;
    public final o f47920e;
    public final Object f47921f;
    public Timer h;
    public n2 f47922n;
    public long f47923r;
    public boolean f47924s;

    public q(u uVar) {
        super("ReadingThread", uVar, 1);
        this.d = new ArrayList();
        this.f47921f = new Object();
        this.f47920e = uVar.f47955u;
    }

    @Override
    public final void a() {
        try {
            h();
        } catch (Throwable th2) {
            w wVar = new w(38, "An uncaught throwable was detected in the reading thread: " + th2.getMessage(), th2);
            com.google.firebase.messaging.m mVar = this.f47889a.d;
            mVar.d(wVar);
            ArrayList arrayList = (ArrayList) mVar.n();
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
        u uVar = this.f47889a;
        y yVar = this.f47919c;
        synchronized (uVar.f47942g) {
            try {
                uVar.f47951q = true;
                uVar.f47953s = yVar;
                if (uVar.f47952r) {
                    uVar.d();
                }
            } finally {
            }
        }
    }

    public final void b() {
        ArrayList arrayList = (ArrayList) this.f47889a.d.n();
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

    public final void c(byte[] bArr) {
        u uVar = this.f47889a;
        uVar.getClass();
        com.google.firebase.messaging.m mVar = uVar.d;
        int i10 = 0;
        try {
            SecureRandom secureRandom = k.f47912a;
            String str = null;
            if (bArr != null) {
                try {
                    str = new String(bArr, 0, bArr.length, "UTF-8");
                } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                }
            }
            ArrayList arrayList = (ArrayList) mVar.n();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                y0 y0Var = (y0) obj;
                try {
                    try {
                        y0Var.b((u) mVar.f7952b, str);
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    y0Var.getClass();
                }
            }
        } catch (Throwable th2) {
            uVar.d.d(new w(37, "Failed to convert payload data into a string: " + th2.getMessage(), th2));
            ArrayList arrayList2 = (ArrayList) mVar.n();
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
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
        }
    }

    public final void e() {
        synchronized (this.f47921f) {
            Timer timer = this.h;
            if (timer != null) {
                timer.cancel();
                this.h = null;
            }
            n2 n2Var = this.f47922n;
            if (n2Var != null) {
                n2Var.cancel();
                this.f47922n = null;
            }
        }
    }

    public final byte[] f(byte[] bArr) {
        try {
            return this.f47920e.c(bArr);
        } catch (w e7) {
            u uVar = this.f47889a;
            uVar.d.d(e7);
            ArrayList arrayList = (ArrayList) uVar.d.n();
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
            uVar.g(y.a(1003, e7.getMessage()));
            return null;
        }
    }

    public final boolean g(sc.y r10) {
        throw new UnsupportedOperationException("Method not decompiled: sc.q.g(sc.y):boolean");
    }

    public final void h() {
        throw new UnsupportedOperationException("Method not decompiled: sc.q.h():void");
    }

    public final void i() {
        synchronized (this) {
            try {
                if (this.f47918b) {
                    return;
                }
                this.f47918b = true;
                interrupt();
                this.f47923r = 10000L;
                j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        synchronized (this.f47921f) {
            Timer timer = this.h;
            if (timer != null) {
                timer.cancel();
                this.h = null;
            }
            n2 n2Var = this.f47922n;
            if (n2Var != null) {
                n2Var.cancel();
                this.f47922n = null;
            }
            this.f47922n = new n2(this, 5);
            Timer timer2 = new Timer("ReadingThreadCloseTimer");
            this.h = timer2;
            timer2.schedule(this.f47922n, this.f47923r);
        }
    }

    public final void k(y yVar) {
        byte[] bArr;
        int i10;
        this.f47889a.getClass();
        boolean z10 = true;
        if ((this.f47920e != null && ((i10 = yVar.f47962e) == 1 || i10 == 2)) || !yVar.f47960b) {
            if (!yVar.f47961c) {
                if (!yVar.d) {
                    int i11 = yVar.f47962e;
                    if (i11 != 0 && i11 != 1 && i11 != 2) {
                        switch (i11) {
                            case 8:
                            case 9:
                            case 10:
                                break;
                            default:
                                throw new w(31, "A frame has an unknown opcode: 0x" + Integer.toHexString(yVar.f47962e));
                        }
                    }
                    if (!yVar.f47963f) {
                        if (8 <= i11 && i11 <= 15) {
                            if (!yVar.f47959a) {
                                throw new w(32, "A control frame is fragmented.");
                            }
                        } else {
                            if (this.d.size() == 0) {
                                z10 = false;
                            }
                            if (yVar.f47962e == 0) {
                                if (!z10) {
                                    throw new w(33, "A continuation frame was detected although a continuation had not started.");
                                }
                            } else if (z10) {
                                throw new w(34, "A non-control frame was detected although the existing continuation had not been closed.");
                            }
                        }
                        int i12 = yVar.f47962e;
                        if (8 > i12 || i12 > 15 || (bArr = yVar.f47964g) == null || 125 >= bArr.length) {
                            return;
                        }
                        throw new w(35, "The payload size of a control frame exceeds the maximum size (125 bytes): " + bArr.length);
                    }
                    throw new w(30, "A frame from the server is masked.");
                }
                throw new w(29, "The RSV3 bit of a frame is set unexpectedly.");
            }
            throw new w(29, "The RSV2 bit of a frame is set unexpectedly.");
        }
        throw new w(29, "The RSV1 bit of a frame is set unexpectedly.");
    }
}
