package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import v7.t6;
public final class h extends Handler implements Runnable {
    public final int f54156a;
    public final i f54157b;
    public final long f54158c;
    public g d;
    public IOException e;
    public int f54159f;
    public Thread h;
    public boolean f54160n;
    public volatile boolean f54161r;
    public final l f54162s;

    public h(l lVar, Looper looper, i iVar, g gVar, int i10, long j10) {
        super(looper);
        this.f54162s = lVar;
        this.f54157b = iVar;
        this.d = gVar;
        this.f54156a = i10;
        this.f54158c = j10;
    }

    public final void a(boolean z10) {
        this.f54161r = z10;
        this.e = null;
        if (hasMessages(1)) {
            this.f54160n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f54160n = true;
                    this.f54157b.R1();
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
            this.f54162s.f54165b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            g gVar = this.d;
            gVar.getClass();
            gVar.M(this.f54157b, elapsedRealtime, elapsedRealtime - this.f54158c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f54158c;
        g gVar = this.d;
        gVar.getClass();
        gVar.n(this.f54157b, elapsedRealtime, j10, this.f54159f);
        this.e = null;
        l lVar = this.f54162s;
        z2.a aVar = lVar.f54164a;
        h hVar = lVar.f54165b;
        hVar.getClass();
        aVar.execute(hVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f54161r) {
            int i10 = message.what;
            if (i10 == 1) {
                b();
            } else if (i10 != 4) {
                this.f54162s.f54165b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f54158c;
                g gVar = this.d;
                gVar.getClass();
                if (this.f54160n) {
                    gVar.M(this.f54157b, elapsedRealtime, j10, false);
                    return;
                }
                int i11 = message.what;
                if (i11 != 2) {
                    if (i11 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.e = iOException;
                        int i12 = this.f54159f + 1;
                        this.f54159f = i12;
                        k4.d l4 = gVar.l(this.f54157b, elapsedRealtime, j10, iOException, i12);
                        int i13 = l4.f10859a;
                        if (i13 == 3) {
                            this.f54162s.f54166c = this.e;
                            return;
                        } else if (i13 != 2) {
                            if (i13 == 1) {
                                this.f54159f = 1;
                            }
                            long j11 = l4.f10860b;
                            if (j11 == -9223372036854775807L) {
                                j11 = Math.min((this.f54159f - 1) * 1000, 5000);
                            }
                            l lVar = this.f54162s;
                            if (lVar.f54165b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            t6.p(z10);
                            lVar.f54165b = this;
                            if (j11 > 0) {
                                sendEmptyMessageDelayed(1, j11);
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
                    gVar.o(this.f54157b, elapsedRealtime, j10);
                } catch (RuntimeException e) {
                    e2.a.d("LoadTask", "Unexpected exception handling load completed", e);
                    this.f54162s.f54166c = new k(e);
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
                z10 = this.f54160n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f54157b.getClass().getSimpleName()));
                try {
                    this.f54157b.b();
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
            if (!this.f54161r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f54161r) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Exception e7) {
            if (!this.f54161r) {
                e2.a.d("LoadTask", "Unexpected exception loading stream", e7);
                obtainMessage(3, new k(e7)).sendToTarget();
            }
        } catch (OutOfMemoryError e10) {
            if (!this.f54161r) {
                e2.a.d("LoadTask", "OutOfMemory error loading stream", e10);
                obtainMessage(3, new k(e10)).sendToTarget();
            }
        } catch (Error e11) {
            if (!this.f54161r) {
                e2.a.d("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
