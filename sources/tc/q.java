package tc;

import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.ui.Wallet.z0;
public final class q extends z {
    public boolean f46952b;
    public x f46953c;
    public final ArrayList d;
    public final o e;
    public final Object f46954f;
    public Timer h;
    public e6.r f46955n;
    public long f46956r;
    public boolean f46957s;

    public q(u uVar) {
        super("ReadingThread", uVar, 1);
        this.d = new ArrayList();
        this.f46954f = new Object();
        this.e = uVar.f46985u;
    }

    @Override
    public final void a() {
        try {
            h();
        } catch (Throwable th2) {
            v vVar = new v(38, "An uncaught throwable was detected in the reading thread: " + th2.getMessage(), th2);
            c2.b bVar = this.f46994a.d;
            bVar.d(vVar);
            ArrayList arrayList = (ArrayList) bVar.n();
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
        u uVar = this.f46994a;
        x xVar = this.f46953c;
        synchronized (uVar.f46972g) {
            try {
                uVar.f46981q = true;
                uVar.f46983s = xVar;
                if (uVar.f46982r) {
                    uVar.d();
                }
            } finally {
            }
        }
    }

    public final void b() {
        ArrayList arrayList = (ArrayList) this.f46994a.d.n();
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
    }

    public final void c(byte[] bArr) {
        u uVar = this.f46994a;
        uVar.getClass();
        c2.b bVar = uVar.d;
        int i10 = 0;
        try {
            SecureRandom secureRandom = k.f46947a;
            String str = null;
            if (bArr != null) {
                try {
                    str = new String(bArr, 0, bArr.length, "UTF-8");
                } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                }
            }
            ArrayList arrayList = (ArrayList) bVar.n();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                z0 z0Var = (z0) obj;
                try {
                    try {
                        z0Var.b((u) bVar.f4490b, str);
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    z0Var.getClass();
                }
            }
        } catch (Throwable th2) {
            uVar.d.d(new v(37, "Failed to convert payload data into a string: " + th2.getMessage(), th2));
            ArrayList arrayList2 = (ArrayList) bVar.n();
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
        }
    }

    public final void d() {
        synchronized (this.f46954f) {
            Timer timer = this.h;
            if (timer != null) {
                timer.cancel();
                this.h = null;
            }
            e6.r rVar = this.f46955n;
            if (rVar != null) {
                rVar.cancel();
                this.f46955n = null;
            }
        }
    }

    public final byte[] f(byte[] bArr) {
        try {
            return this.e.c(bArr);
        } catch (v e) {
            u uVar = this.f46994a;
            uVar.d.d(e);
            ArrayList arrayList = (ArrayList) uVar.d.n();
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
            uVar.g(x.a(1003, e.getMessage()));
            return null;
        }
    }

    public final boolean g(tc.x r10) {
        throw new UnsupportedOperationException("Method not decompiled: tc.q.g(tc.x):boolean");
    }

    public final void h() {
        throw new UnsupportedOperationException("Method not decompiled: tc.q.h():void");
    }

    public final void i() {
        synchronized (this) {
            try {
                if (this.f46952b) {
                    return;
                }
                this.f46952b = true;
                interrupt();
                this.f46956r = 10000L;
                j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        synchronized (this.f46954f) {
            Timer timer = this.h;
            if (timer != null) {
                timer.cancel();
                this.h = null;
            }
            e6.r rVar = this.f46955n;
            if (rVar != null) {
                rVar.cancel();
                this.f46955n = null;
            }
            this.f46955n = new e6.r(this, 5);
            Timer timer2 = new Timer("ReadingThreadCloseTimer");
            this.h = timer2;
            timer2.schedule(this.f46955n, this.f46956r);
        }
    }

    public final void k(x xVar) {
        byte[] bArr;
        int i10;
        this.f46994a.getClass();
        boolean z10 = true;
        if ((this.e != null && ((i10 = xVar.e) == 1 || i10 == 2)) || !xVar.f46990b) {
            if (!xVar.f46991c) {
                if (!xVar.d) {
                    int i11 = xVar.e;
                    if (i11 != 0 && i11 != 1 && i11 != 2) {
                        switch (i11) {
                            case 8:
                            case 9:
                            case 10:
                                break;
                            default:
                                throw new v(31, "A frame has an unknown opcode: 0x" + Integer.toHexString(xVar.e));
                        }
                    }
                    if (!xVar.f46992f) {
                        if (8 <= i11 && i11 <= 15) {
                            if (!xVar.f46989a) {
                                throw new v(32, "A control frame is fragmented.");
                            }
                        } else {
                            if (this.d.size() == 0) {
                                z10 = false;
                            }
                            if (xVar.e == 0) {
                                if (!z10) {
                                    throw new v(33, "A continuation frame was detected although a continuation had not started.");
                                }
                            } else if (z10) {
                                throw new v(34, "A non-control frame was detected although the existing continuation had not been closed.");
                            }
                        }
                        int i12 = xVar.e;
                        if (8 > i12 || i12 > 15 || (bArr = xVar.f46993g) == null || 125 >= bArr.length) {
                            return;
                        }
                        throw new v(35, "The payload size of a control frame exceeds the maximum size (125 bytes): " + bArr.length);
                    }
                    throw new v(30, "A frame from the server is masked.");
                }
                throw new v(29, "The RSV3 bit of a frame is set unexpectedly.");
            }
            throw new v(29, "The RSV2 bit of a frame is set unexpectedly.");
        }
        throw new v(29, "The RSV1 bit of a frame is set unexpectedly.");
    }
}
