package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import v7.u6;
public final class h extends Handler implements Runnable {
    public final int f48535a;
    public final i f48536b;
    public final long f48537c;
    public g d;
    public IOException e;
    public int f48538f;
    public Thread h;
    public boolean f48539n;
    public volatile boolean f48540r;
    public final l f48541s;

    public h(l lVar, Looper looper, i iVar, g gVar, int i10, long j10) {
        super(looper);
        this.f48541s = lVar;
        this.f48536b = iVar;
        this.d = gVar;
        this.f48535a = i10;
        this.f48537c = j10;
    }

    public final void a(boolean z10) {
        this.f48540r = z10;
        this.e = null;
        if (hasMessages(1)) {
            this.f48539n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f48539n = true;
                    this.f48536b.J();
                    Thread thread = this.h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z10) {
            this.f48541s.f48544b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            g gVar = this.d;
            gVar.getClass();
            gVar.B(this.f48536b, elapsedRealtime, elapsedRealtime - this.f48537c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f48537c;
        g gVar = this.d;
        gVar.getClass();
        gVar.k(this.f48536b, elapsedRealtime, j10, this.f48538f);
        this.e = null;
        l lVar = this.f48541s;
        z2.a aVar = lVar.f48543a;
        h hVar = lVar.f48544b;
        hVar.getClass();
        aVar.execute(hVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f48540r) {
            int i10 = message.what;
            if (i10 == 1) {
                b();
            } else if (i10 != 4) {
                this.f48541s.f48544b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f48537c;
                g gVar = this.d;
                gVar.getClass();
                if (this.f48539n) {
                    gVar.B(this.f48536b, elapsedRealtime, j10, false);
                    return;
                }
                int i11 = message.what;
                if (i11 != 2) {
                    if (i11 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.e = iOException;
                        int i12 = this.f48538f + 1;
                        this.f48538f = i12;
                        k4.d j11 = gVar.j(this.f48536b, elapsedRealtime, j10, iOException, i12);
                        int i13 = j11.f14092a;
                        if (i13 == 3) {
                            this.f48541s.f48545c = this.e;
                            return;
                        } else if (i13 != 2) {
                            if (i13 == 1) {
                                this.f48538f = 1;
                            }
                            long j12 = j11.f14093b;
                            if (j12 == -9223372036854775807L) {
                                j12 = Math.min((this.f48538f - 1) * 1000, 5000);
                            }
                            l lVar = this.f48541s;
                            if (lVar.f48544b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            u6.p(z10);
                            lVar.f48544b = this;
                            if (j12 > 0) {
                                sendEmptyMessageDelayed(1, j12);
                                return;
                            } else {
                                b();
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                }
                try {
                    gVar.l(this.f48536b, elapsedRealtime, j10);
                } catch (RuntimeException e) {
                    e2.a.d("LoadTask", "Unexpected exception handling load completed", e);
                    this.f48541s.f48545c = new k(e);
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    @Override
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = this.f48539n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f48536b.getClass().getSimpleName()));
                try {
                    this.f48536b.a();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.h = null;
                Thread.interrupted();
            }
            if (!this.f48540r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f48540r) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Exception e7) {
            if (!this.f48540r) {
                e2.a.d("LoadTask", "Unexpected exception loading stream", e7);
                obtainMessage(3, new k(e7)).sendToTarget();
            }
        } catch (OutOfMemoryError e10) {
            if (!this.f48540r) {
                e2.a.d("LoadTask", "OutOfMemory error loading stream", e10);
                obtainMessage(3, new k(e10)).sendToTarget();
            }
        } catch (Error e11) {
            if (!this.f48540r) {
                e2.a.d("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
