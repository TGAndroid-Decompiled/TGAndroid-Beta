package x5;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.yy;
import q5.g0;
public final class g implements Runnable {
    public final int f46813a;
    public final i f46814b;

    public g(i iVar, int i10) {
        this.f46813a = i10;
        this.f46814b = iVar;
    }

    private final void a() {
        i iVar = this.f46814b;
        synchronized (iVar) {
            if (iVar.f46816a == 1) {
                iVar.a("Timed out while binding");
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f46813a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f46814b.a("Service disconnected");
                return;
        }
        while (true) {
            i iVar = this.f46814b;
            synchronized (iVar) {
                try {
                    if (iVar.f46816a == 2) {
                        if (iVar.d.isEmpty()) {
                            iVar.c();
                            return;
                        }
                        j jVar = (j) iVar.d.poll();
                        iVar.e.put(jVar.f46820a, jVar);
                        ((ScheduledExecutorService) iVar.f46819f.f46825c).schedule(new yy(iVar, jVar, false, 13), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(jVar)));
                        }
                        k kVar = iVar.f46819f;
                        Messenger messenger = iVar.f46817b;
                        int i10 = jVar.f46822c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = jVar.f46820a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", jVar.a());
                        bundle.putString("pkg", ((Context) kVar.f46824b).getPackageName());
                        bundle.putBundle("data", jVar.d);
                        obtain.setData(bundle);
                        try {
                            g0 g0Var = iVar.f46818c;
                            Messenger messenger2 = (Messenger) g0Var.f42806b;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                f fVar = (f) g0Var.f42807c;
                                if (fVar != null) {
                                    Messenger messenger3 = fVar.f46812a;
                                    messenger3.getClass();
                                    messenger3.send(obtain);
                                } else {
                                    throw new IllegalStateException("Both messengers are null");
                                }
                            }
                        } catch (RemoteException e) {
                            iVar.a(e.getMessage());
                        }
                    } else {
                        return;
                    }
                } finally {
                }
            }
        }
    }
}
