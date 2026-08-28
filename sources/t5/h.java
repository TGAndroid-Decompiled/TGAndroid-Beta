package t5;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.Cells.e3;
import org.telegram.ui.fm;
public final class h implements Runnable {
    public final int f47686a;
    public final j f47687b;

    public h(j jVar, int i9) {
        this.f47686a = i9;
        this.f47687b = jVar;
    }

    private final void a() {
        j jVar = this.f47687b;
        synchronized (jVar) {
            if (jVar.f47689a == 1) {
                jVar.a("Timed out while binding");
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f47686a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f47687b.a("Service disconnected");
                return;
        }
        while (true) {
            j jVar = this.f47687b;
            synchronized (jVar) {
                try {
                    if (jVar.f47689a == 2) {
                        if (jVar.d.isEmpty()) {
                            jVar.c();
                            return;
                        }
                        k kVar = (k) jVar.d.poll();
                        jVar.f47692e.put(kVar.f47694a, kVar);
                        ((ScheduledExecutorService) jVar.f47693f.f47701c).schedule(new fm(jVar, kVar, false, 7), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(kVar)));
                        }
                        l lVar = jVar.f47693f;
                        Messenger messenger = jVar.f47690b;
                        int i9 = kVar.f47696c;
                        Message obtain = Message.obtain();
                        obtain.what = i9;
                        obtain.arg1 = kVar.f47694a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", kVar.a());
                        bundle.putString("pkg", ((Context) lVar.f47700b).getPackageName());
                        bundle.putBundle("data", kVar.d);
                        obtain.setData(bundle);
                        try {
                            e3 e3Var = jVar.f47691c;
                            Messenger messenger2 = (Messenger) e3Var.f24286b;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                g gVar = (g) e3Var.f24287c;
                                if (gVar != null) {
                                    Messenger messenger3 = gVar.f47685a;
                                    messenger3.getClass();
                                    messenger3.send(obtain);
                                } else {
                                    throw new IllegalStateException("Both messengers are null");
                                }
                            }
                        } catch (RemoteException e10) {
                            jVar.a(e10.getMessage());
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
