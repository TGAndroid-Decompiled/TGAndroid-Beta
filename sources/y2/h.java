package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
public final class h extends Handler implements Runnable {
    public final int f46566a;
    public final i f46567b;
    public final long f46568c;
    public g d;
    public IOException e;
    public int f46569f;
    public Thread h;
    public boolean f46570n;
    public volatile boolean f46571r;
    public final l f46572s;

    public h(l lVar, Looper looper, i iVar, g gVar, int i10, long j3) {
        super(looper);
        this.f46572s = lVar;
        this.f46567b = iVar;
        this.d = gVar;
        this.f46566a = i10;
        this.f46568c = j3;
    }

    public final void a(boolean z10) {
        this.f46571r = z10;
        this.e = null;
        if (hasMessages(1)) {
            this.f46570n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f46570n = true;
                    this.f46567b.D();
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
            this.f46572s.f46575b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            g gVar = this.d;
            gVar.getClass();
            gVar.E(this.f46567b, elapsedRealtime, elapsedRealtime - this.f46568c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.f46568c;
        g gVar = this.d;
        gVar.getClass();
        gVar.n(this.f46567b, elapsedRealtime, j3, this.f46569f);
        this.e = null;
        l lVar = this.f46572s;
        z2.a aVar = lVar.f46574a;
        h hVar = lVar.f46575b;
        hVar.getClass();
        aVar.execute(hVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f46571r) {
            int i10 = message.what;
            if (i10 == 1) {
                b();
            } else if (i10 != 4) {
                this.f46572s.f46575b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f46568c;
                g gVar = this.d;
                gVar.getClass();
                if (this.f46570n) {
                    gVar.E(this.f46567b, elapsedRealtime, j3, false);
                    return;
                }
                int i11 = message.what;
                if (i11 != 2) {
                    if (i11 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.e = iOException;
                        int i12 = this.f46569f + 1;
                        this.f46569f = i12;
                        k4.d m10 = gVar.m(this.f46567b, elapsedRealtime, j3, iOException, i12);
                        int i13 = m10.f13420a;
                        if (i13 == 3) {
                            this.f46572s.f46576c = this.e;
                            return;
                        } else if (i13 != 2) {
                            if (i13 == 1) {
                                this.f46569f = 1;
                            }
                            long j10 = m10.f13421b;
                            if (j10 == -9223372036854775807L) {
                                j10 = Math.min((this.f46569f - 1) * 1000, 5000);
                            }
                            l lVar = this.f46572s;
                            if (lVar.f46575b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            e2.d.g(z10);
                            lVar.f46575b = this;
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
                    gVar.o(this.f46567b, elapsedRealtime, j3);
                } catch (RuntimeException e) {
                    e2.a.f("LoadTask", "Unexpected exception handling load completed", e);
                    this.f46572s.f46576c = new k(e);
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
                z10 = this.f46570n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f46567b.getClass().getSimpleName()));
                try {
                    this.f46567b.a();
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
            if (!this.f46571r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e) {
            if (!this.f46571r) {
                obtainMessage(3, e).sendToTarget();
            }
        } catch (Exception e7) {
            if (!this.f46571r) {
                e2.a.f("LoadTask", "Unexpected exception loading stream", e7);
                obtainMessage(3, new k(e7)).sendToTarget();
            }
        } catch (OutOfMemoryError e10) {
            if (!this.f46571r) {
                e2.a.f("LoadTask", "OutOfMemory error loading stream", e10);
                obtainMessage(3, new k(e10)).sendToTarget();
            }
        } catch (Error e11) {
            if (!this.f46571r) {
                e2.a.f("LoadTask", "Unexpected error loading stream", e11);
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        }
    }
}
