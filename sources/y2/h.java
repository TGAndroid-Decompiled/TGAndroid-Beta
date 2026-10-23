package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import v7.u6;
public final class h extends Handler implements Runnable {
    public final int f49927a;
    public final i f49928b;
    public final long f49929c;
    public g d;
    public IOException e;
    public int f49930f;
    public Thread h;
    public boolean f49931n;
    public volatile boolean f49932r;
    public final l f49933s;

    public h(l lVar, Looper looper, i iVar, g gVar, int i10, long j10) {
        super(looper);
        this.f49933s = lVar;
        this.f49928b = iVar;
        this.d = gVar;
        this.f49927a = i10;
        this.f49929c = j10;
    }

    public final void a(boolean z10) {
        this.f49932r = z10;
        this.e = null;
        if (hasMessages(1)) {
            this.f49931n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f49931n = true;
                    this.f49928b.O();
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
            this.f49933s.f49936b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            g gVar = this.d;
            gVar.getClass();
            gVar.J(this.f49928b, elapsedRealtime, elapsedRealtime - this.f49929c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f49929c;
        g gVar = this.d;
        gVar.getClass();
        gVar.h(this.f49928b, elapsedRealtime, j10, this.f49930f);
        this.e = null;
        l lVar = this.f49933s;
        z2.a aVar = lVar.f49935a;
        h hVar = lVar.f49936b;
        hVar.getClass();
        aVar.execute(hVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f49932r) {
            int i10 = message.what;
            if (i10 == 1) {
                b();
            } else if (i10 != 4) {
                this.f49933s.f49936b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f49929c;
                g gVar = this.d;
                gVar.getClass();
                if (this.f49931n) {
                    gVar.J(this.f49928b, elapsedRealtime, j10, false);
                    return;
                }
                int i11 = message.what;
                if (i11 != 2) {
                    if (i11 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.e = iOException;
                        int i12 = this.f49930f + 1;
                        this.f49930f = i12;
                        k4.d e = gVar.e(this.f49928b, elapsedRealtime, j10, iOException, i12);
                        int i13 = e.f14896a;
                        if (i13 == 3) {
                            this.f49933s.f49937c = this.e;
                            return;
                        } else if (i13 != 2) {
                            if (i13 == 1) {
                                this.f49930f = 1;
                            }
                            long j11 = e.f14897b;
                            if (j11 == -9223372036854775807L) {
                                j11 = Math.min((this.f49930f - 1) * 1000, 5000);
                            }
                            l lVar = this.f49933s;
                            if (lVar.f49936b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            u6.p(z10);
                            lVar.f49936b = this;
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
                    gVar.k(this.f49928b, elapsedRealtime, j10);
                } catch (RuntimeException e7) {
                    e2.a.d("LoadTask", "Unexpected exception handling load completed", e7);
                    this.f49933s.f49937c = new k(e7);
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
                z10 = this.f49931n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f49928b.getClass().getSimpleName()));
                try {
                    this.f49928b.a();
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
            if (!this.f49932r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f49932r) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Exception e7) {
            if (!this.f49932r) {
                e2.a.d("LoadTask", "Unexpected exception loading stream", e7);
                obtainMessage(3, new k(e7)).sendToTarget();
            }
        } catch (OutOfMemoryError e10) {
            if (!this.f49932r) {
                e2.a.d("LoadTask", "OutOfMemory error loading stream", e10);
                obtainMessage(3, new k(e10)).sendToTarget();
            }
        } catch (Error e11) {
            if (!this.f49932r) {
                e2.a.d("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
