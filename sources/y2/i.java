package y2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
public final class i extends Handler implements Runnable {
    public final int f49509a;
    public final j f49510b;
    public final long f49511c;
    public h d;
    public IOException f49512e;
    public int f49513f;
    public Thread h;
    public boolean f49514n;
    public volatile boolean f49515r;
    public final m f49516s;

    public i(m mVar, Looper looper, j jVar, h hVar, int i10, long j3) {
        super(looper);
        this.f49516s = mVar;
        this.f49510b = jVar;
        this.d = hVar;
        this.f49509a = i10;
        this.f49511c = j3;
    }

    public final void a(boolean z10) {
        this.f49515r = z10;
        this.f49512e = null;
        if (hasMessages(1)) {
            this.f49514n = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f49514n = true;
                    this.f49510b.W();
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
            this.f49516s.f49520b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            h hVar = this.d;
            hVar.getClass();
            hVar.w(this.f49510b, elapsedRealtime, elapsedRealtime - this.f49511c, true);
            this.d = null;
        }
    }

    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.f49511c;
        h hVar = this.d;
        hVar.getClass();
        hVar.h(this.f49510b, elapsedRealtime, j3, this.f49513f);
        this.f49512e = null;
        m mVar = this.f49516s;
        z2.a aVar = mVar.f49519a;
        i iVar = mVar.f49520b;
        iVar.getClass();
        aVar.execute(iVar);
    }

    @Override
    public final void handleMessage(Message message) {
        boolean z10;
        if (!this.f49515r) {
            int i10 = message.what;
            if (i10 == 1) {
                b();
            } else if (i10 != 4) {
                this.f49516s.f49520b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - this.f49511c;
                h hVar = this.d;
                hVar.getClass();
                if (this.f49514n) {
                    hVar.w(this.f49510b, elapsedRealtime, j3, false);
                    return;
                }
                int i11 = message.what;
                if (i11 != 2) {
                    if (i11 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f49512e = iOException;
                        int i12 = this.f49513f + 1;
                        this.f49513f = i12;
                        k4.d g10 = hVar.g(this.f49510b, elapsedRealtime, j3, iOException, i12);
                        int i13 = g10.f14731a;
                        if (i13 == 3) {
                            this.f49516s.f49521c = this.f49512e;
                            return;
                        } else if (i13 != 2) {
                            if (i13 == 1) {
                                this.f49513f = 1;
                            }
                            long j10 = g10.f14732b;
                            if (j10 == -9223372036854775807L) {
                                j10 = Math.min((this.f49513f - 1) * 1000, 5000);
                            }
                            m mVar = this.f49516s;
                            if (mVar.f49520b == null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            e2.d.g(z10);
                            mVar.f49520b = this;
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
                    hVar.i(this.f49510b, elapsedRealtime, j3);
                } catch (RuntimeException e7) {
                    e2.a.f("LoadTask", "Unexpected exception handling load completed", e7);
                    this.f49516s.f49521c = new l(e7);
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
                z10 = this.f49514n;
                this.h = Thread.currentThread();
            }
            if (!z10) {
                Trace.beginSection("load:".concat(this.f49510b.getClass().getSimpleName()));
                try {
                    this.f49510b.a();
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
            if (!this.f49515r) {
                sendEmptyMessage(2);
            }
        } catch (IOException e7) {
            if (!this.f49515r) {
                obtainMessage(3, e7).sendToTarget();
            }
        } catch (Exception e10) {
            if (!this.f49515r) {
                e2.a.f("LoadTask", "Unexpected exception loading stream", e10);
                obtainMessage(3, new l(e10)).sendToTarget();
            }
        } catch (OutOfMemoryError e11) {
            if (!this.f49515r) {
                e2.a.f("LoadTask", "OutOfMemory error loading stream", e11);
                obtainMessage(3, new l(e11)).sendToTarget();
            }
        } catch (Error e12) {
            if (!this.f49515r) {
                e2.a.f("LoadTask", "Unexpected error loading stream", e12);
                obtainMessage(4, e12).sendToTarget();
            }
            throw e12;
        }
    }
}
