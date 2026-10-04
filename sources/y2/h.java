package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
public final class h extends Handler implements Runnable {
    public final int f50389a;
    public final i f50390b;
    public final long f50391c;
    public g d;
    public IOException f50392e;
    public int f50393f;
    public Thread h;
    public boolean f50394n;
    public volatile boolean f50395r;
    public final l f50396s;

    public h(l lVar, Looper looper, i iVar, g gVar, int i10, long j3) {
        super(looper);
        this.f50396s = lVar;
        this.f50390b = iVar;
        this.d = gVar;
        this.f50389a = i10;
        this.f50391c = j3;
    }

    public final void a(boolean z10) {
        this.f50395r = z10;
        this.f50392e = null;
        if (hasMessages(1)) {
            this.f50394n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f50394n = true;
                    this.f50390b.q();
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
            this.f50396s.f50400b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            g gVar = this.d;
            gVar.getClass();
            gVar.x0(this.f50390b, elapsedRealtime, elapsedRealtime - this.f50391c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.f50391c;
        g gVar = this.d;
        gVar.getClass();
        gVar.t(this.f50390b, elapsedRealtime, j3, this.f50393f);
        this.f50392e = null;
        l lVar = this.f50396s;
        z2.a aVar = lVar.f50399a;
        h hVar = lVar.f50400b;
        hVar.getClass();
        aVar.execute(hVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f50395r) {
            int i10 = message.what;
            if (i10 == 1) {
                b();
            } else if (i10 != 4) {
                this.f50396s.f50400b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f50391c;
                g gVar = this.d;
                gVar.getClass();
                if (this.f50394n) {
                    gVar.x0(this.f50390b, elapsedRealtime, j3, false);
                    return;
                }
                int i11 = message.what;
                if (i11 != 2) {
                    if (i11 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f50392e = iOException;
                        int i12 = this.f50393f + 1;
                        this.f50393f = i12;
                        k4.d s10 = gVar.s(this.f50390b, elapsedRealtime, j3, iOException, i12);
                        int i13 = s10.f14589a;
                        if (i13 == 3) {
                            this.f50396s.f50401c = this.f50392e;
                            return;
                        } else if (i13 != 2) {
                            if (i13 == 1) {
                                this.f50393f = 1;
                            }
                            long j10 = s10.f14590b;
                            if (j10 == -9223372036854775807L) {
                                j10 = Math.min((this.f50393f - 1) * 1000, 5000);
                            }
                            l lVar = this.f50396s;
                            if (lVar.f50400b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            e2.d.g(z10);
                            lVar.f50400b = this;
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
                    gVar.v(this.f50390b, elapsedRealtime, j3);
                } catch (RuntimeException e7) {
                    e2.a.f("LoadTask", "Unexpected exception handling load completed", e7);
                    this.f50396s.f50401c = new k(e7);
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
                z10 = this.f50394n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f50390b.getClass().getSimpleName()));
                try {
                    this.f50390b.a();
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
            if (!this.f50395r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e7) {
            if (!this.f50395r) {
                obtainMessage(3, e7).sendToTarget();
            }
        } catch (Exception e10) {
            if (!this.f50395r) {
                e2.a.f("LoadTask", "Unexpected exception loading stream", e10);
                obtainMessage(3, new k(e10)).sendToTarget();
            }
        } catch (OutOfMemoryError e11) {
            if (!this.f50395r) {
                e2.a.f("LoadTask", "OutOfMemory error loading stream", e11);
                obtainMessage(3, new k(e11)).sendToTarget();
            }
        } catch (Error e12) {
            if (!this.f50395r) {
                e2.a.f("LoadTask", "Unexpected error loading stream", e12);
                obtainMessage(4, e12).sendToTarget();
            }
            throw e12;
        }
    }
}
