package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
public final class h extends Handler implements Runnable {
    public final int f46567a;
    public final i f46568b;
    public final long f46569c;
    public g d;
    public IOException e;
    public int f46570f;
    public Thread h;
    public boolean f46571n;
    public volatile boolean f46572r;
    public final l f46573s;

    public h(l lVar, Looper looper, i iVar, g gVar, int i10, long j3) {
        super(looper);
        this.f46573s = lVar;
        this.f46568b = iVar;
        this.d = gVar;
        this.f46567a = i10;
        this.f46569c = j3;
    }

    public final void a(boolean z10) {
        this.f46572r = z10;
        this.e = null;
        if (hasMessages(1)) {
            this.f46571n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f46571n = true;
                    this.f46568b.D();
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
            this.f46573s.f46576b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            g gVar = this.d;
            gVar.getClass();
            gVar.E(this.f46568b, elapsedRealtime, elapsedRealtime - this.f46569c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.f46569c;
        g gVar = this.d;
        gVar.getClass();
        gVar.n(this.f46568b, elapsedRealtime, j3, this.f46570f);
        this.e = null;
        l lVar = this.f46573s;
        z2.a aVar = lVar.f46575a;
        h hVar = lVar.f46576b;
        hVar.getClass();
        aVar.execute(hVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f46572r) {
            int i10 = message.what;
            if (i10 == 1) {
                b();
            } else if (i10 != 4) {
                this.f46573s.f46576b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f46569c;
                g gVar = this.d;
                gVar.getClass();
                if (this.f46571n) {
                    gVar.E(this.f46568b, elapsedRealtime, j3, false);
                    return;
                }
                int i11 = message.what;
                if (i11 != 2) {
                    if (i11 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.e = iOException;
                        int i12 = this.f46570f + 1;
                        this.f46570f = i12;
                        k4.d m10 = gVar.m(this.f46568b, elapsedRealtime, j3, iOException, i12);
                        int i13 = m10.f13420a;
                        if (i13 == 3) {
                            this.f46573s.f46577c = this.e;
                            return;
                        } else if (i13 != 2) {
                            if (i13 == 1) {
                                this.f46570f = 1;
                            }
                            long j10 = m10.f13421b;
                            if (j10 == -9223372036854775807L) {
                                j10 = Math.min((this.f46570f - 1) * 1000, 5000);
                            }
                            l lVar = this.f46573s;
                            if (lVar.f46576b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            e2.d.g(z10);
                            lVar.f46576b = this;
                            if (j10 > 0) {
                                sendEmptyMessageDelayed(1, j10);
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
                    gVar.o(this.f46568b, elapsedRealtime, j3);
                } catch (RuntimeException e) {
                    e2.a.f("LoadTask", "Unexpected exception handling load completed", e);
                    this.f46573s.f46577c = new k(e);
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
                z10 = this.f46571n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f46568b.getClass().getSimpleName()));
                try {
                    this.f46568b.a();
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
            if (!this.f46572r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f46572r) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Exception e7) {
            if (!this.f46572r) {
                e2.a.f("LoadTask", "Unexpected exception loading stream", e7);
                obtainMessage(3, new k(e7)).sendToTarget();
            }
        } catch (OutOfMemoryError e10) {
            if (!this.f46572r) {
                e2.a.f("LoadTask", "OutOfMemory error loading stream", e10);
                obtainMessage(3, new k(e10)).sendToTarget();
            }
        } catch (Error e11) {
            if (!this.f46572r) {
                e2.a.f("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
