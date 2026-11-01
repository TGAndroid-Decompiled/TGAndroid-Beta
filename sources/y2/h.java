package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import v7.t6;
public final class h extends Handler implements Runnable {
    public final int f54177a;
    public final i f54178b;
    public final long f54179c;
    public g d;
    public IOException e;
    public int f54180f;
    public Thread h;
    public boolean f54181n;
    public volatile boolean f54182r;
    public final l f54183s;

    public h(l lVar, Looper looper, i iVar, g gVar, int i10, long j10) {
        super(looper);
        this.f54183s = lVar;
        this.f54178b = iVar;
        this.d = gVar;
        this.f54177a = i10;
        this.f54179c = j10;
    }

    public final void a(boolean z10) {
        this.f54182r = z10;
        this.e = null;
        if (hasMessages(1)) {
            this.f54181n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f54181n = true;
                    this.f54178b.R1();
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
            this.f54183s.f54186b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            g gVar = this.d;
            gVar.getClass();
            gVar.M(this.f54178b, elapsedRealtime, elapsedRealtime - this.f54179c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f54179c;
        g gVar = this.d;
        gVar.getClass();
        gVar.n(this.f54178b, elapsedRealtime, j10, this.f54180f);
        this.e = null;
        l lVar = this.f54183s;
        z2.a aVar = lVar.f54185a;
        h hVar = lVar.f54186b;
        hVar.getClass();
        aVar.execute(hVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f54182r) {
            int i10 = message.what;
            if (i10 == 1) {
                b();
            } else if (i10 != 4) {
                this.f54183s.f54186b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f54179c;
                g gVar = this.d;
                gVar.getClass();
                if (this.f54181n) {
                    gVar.M(this.f54178b, elapsedRealtime, j10, false);
                    return;
                }
                int i11 = message.what;
                if (i11 != 2) {
                    if (i11 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.e = iOException;
                        int i12 = this.f54180f + 1;
                        this.f54180f = i12;
                        k4.d l4 = gVar.l(this.f54178b, elapsedRealtime, j10, iOException, i12);
                        int i13 = l4.f10860a;
                        if (i13 == 3) {
                            this.f54183s.f54187c = this.e;
                            return;
                        } else if (i13 != 2) {
                            if (i13 == 1) {
                                this.f54180f = 1;
                            }
                            long j11 = l4.f10861b;
                            if (j11 == -9223372036854775807L) {
                                j11 = Math.min((this.f54180f - 1) * 1000, 5000);
                            }
                            l lVar = this.f54183s;
                            if (lVar.f54186b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            t6.p(z10);
                            lVar.f54186b = this;
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
                    gVar.o(this.f54178b, elapsedRealtime, j10);
                } catch (RuntimeException e) {
                    e2.a.d("LoadTask", "Unexpected exception handling load completed", e);
                    this.f54183s.f54187c = new k(e);
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
                z10 = this.f54181n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f54178b.getClass().getSimpleName()));
                try {
                    this.f54178b.b();
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
            if (!this.f54182r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f54182r) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Exception e7) {
            if (!this.f54182r) {
                e2.a.d("LoadTask", "Unexpected exception loading stream", e7);
                obtainMessage(3, new k(e7)).sendToTarget();
            }
        } catch (OutOfMemoryError e10) {
            if (!this.f54182r) {
                e2.a.d("LoadTask", "OutOfMemory error loading stream", e10);
                obtainMessage(3, new k(e10)).sendToTarget();
            }
        } catch (Error e11) {
            if (!this.f54182r) {
                e2.a.d("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
