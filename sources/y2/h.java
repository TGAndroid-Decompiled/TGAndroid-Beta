package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import v7.u6;
public final class h extends Handler implements Runnable {
    public final int f50367a;
    public final i f50368b;
    public final long f50369c;
    public g d;
    public IOException e;
    public int f50370f;
    public Thread h;
    public boolean f50371n;
    public volatile boolean f50372r;
    public final l f50373s;

    public h(l lVar, Looper looper, i iVar, g gVar, int i10, long j10) {
        super(looper);
        this.f50373s = lVar;
        this.f50368b = iVar;
        this.d = gVar;
        this.f50367a = i10;
        this.f50369c = j10;
    }

    public final void a(boolean z10) {
        this.f50372r = z10;
        this.e = null;
        if (hasMessages(1)) {
            this.f50371n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f50371n = true;
                    this.f50368b.O();
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
            this.f50373s.f50376b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            g gVar = this.d;
            gVar.getClass();
            gVar.z(this.f50368b, elapsedRealtime, elapsedRealtime - this.f50369c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.f50369c;
        g gVar = this.d;
        gVar.getClass();
        gVar.j(this.f50368b, elapsedRealtime, j10, this.f50370f);
        this.e = null;
        l lVar = this.f50373s;
        z2.a aVar = lVar.f50375a;
        h hVar = lVar.f50376b;
        hVar.getClass();
        aVar.execute(hVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f50372r) {
            int i10 = message.what;
            if (i10 == 1) {
                b();
            } else if (i10 != 4) {
                this.f50373s.f50376b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = elapsedRealtime - this.f50369c;
                g gVar = this.d;
                gVar.getClass();
                if (this.f50371n) {
                    gVar.z(this.f50368b, elapsedRealtime, j10, false);
                    return;
                }
                int i11 = message.what;
                if (i11 != 2) {
                    if (i11 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.e = iOException;
                        int i12 = this.f50370f + 1;
                        this.f50370f = i12;
                        k4.d e = gVar.e(this.f50368b, elapsedRealtime, j10, iOException, i12);
                        int i13 = e.f14942a;
                        if (i13 == 3) {
                            this.f50373s.f50377c = this.e;
                            return;
                        } else if (i13 != 2) {
                            if (i13 == 1) {
                                this.f50370f = 1;
                            }
                            long j11 = e.f14943b;
                            if (j11 == -9223372036854775807L) {
                                j11 = Math.min((this.f50370f - 1) * 1000, 5000);
                            }
                            l lVar = this.f50373s;
                            if (lVar.f50376b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            u6.p(z10);
                            lVar.f50376b = this;
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
                    gVar.k(this.f50368b, elapsedRealtime, j10);
                } catch (RuntimeException e7) {
                    e2.a.d("LoadTask", "Unexpected exception handling load completed", e7);
                    this.f50373s.f50377c = new k(e7);
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
                z10 = this.f50371n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f50368b.getClass().getSimpleName()));
                try {
                    this.f50368b.a();
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
            if (!this.f50372r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f50372r) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Exception e7) {
            if (!this.f50372r) {
                e2.a.d("LoadTask", "Unexpected exception loading stream", e7);
                obtainMessage(3, new k(e7)).sendToTarget();
            }
        } catch (OutOfMemoryError e10) {
            if (!this.f50372r) {
                e2.a.d("LoadTask", "OutOfMemory error loading stream", e10);
                obtainMessage(3, new k(e10)).sendToTarget();
            }
        } catch (Error e11) {
            if (!this.f50372r) {
                e2.a.d("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
