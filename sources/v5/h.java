package v5;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public final class h implements Runnable {
    public final int f49413a;
    public final j f49414b;

    public h(j jVar, int i10) {
        this.f49413a = i10;
        this.f49414b = jVar;
    }

    private final void a() {
        j jVar = this.f49414b;
        synchronized (jVar) {
            if (jVar.f49416a == 1) {
                jVar.a("Timed out while binding");
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f49413a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f49414b.a("Service disconnected");
                return;
        }
        while (true) {
            j jVar = this.f49414b;
            synchronized (jVar) {
                try {
                    if (jVar.f49416a == 2) {
                        if (jVar.d.isEmpty()) {
                            jVar.c();
                            return;
                        }
                        k kVar = (k) jVar.d.poll();
                        jVar.f49419e.put(kVar.f49421a, kVar);
                        ((ScheduledExecutorService) jVar.f49420f.f49428c).schedule(new od.i(jVar, kVar, false, 12), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(kVar)));
                        }
                        l lVar = jVar.f49420f;
                        Messenger messenger = jVar.f49417b;
                        int i10 = kVar.f49423c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = kVar.f49421a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", kVar.a());
                        bundle.putString("pkg", ((Context) lVar.f49427b).getPackageName());
                        bundle.putBundle("data", kVar.d);
                        obtain.setData(bundle);
                        try {
                            oc.i iVar = jVar.f49418c;
                            Messenger messenger2 = (Messenger) iVar.f19483b;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                g gVar = (g) iVar.f19484c;
                                if (gVar != null) {
                                    Messenger messenger3 = gVar.f49412a;
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
