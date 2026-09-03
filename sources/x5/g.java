package x5;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.az;
import q5.c0;
public final class g implements Runnable {
    public final int f46880a;
    public final i f46881b;

    public g(i iVar, int i10) {
        this.f46880a = i10;
        this.f46881b = iVar;
    }

    private final void a() {
        i iVar = this.f46881b;
        synchronized (iVar) {
            if (iVar.f46883a == 1) {
                iVar.a("Timed out while binding");
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f46880a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f46881b.a("Service disconnected");
                return;
        }
        while (true) {
            i iVar = this.f46881b;
            synchronized (iVar) {
                try {
                    if (iVar.f46883a == 2) {
                        if (iVar.d.isEmpty()) {
                            iVar.c();
                            return;
                        }
                        j jVar = (j) iVar.d.poll();
                        iVar.e.put(jVar.f46887a, jVar);
                        ((ScheduledExecutorService) iVar.f46886f.f46892c).schedule(new az(iVar, jVar, false, 13), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(jVar)));
                        }
                        k kVar = iVar.f46886f;
                        Messenger messenger = iVar.f46884b;
                        int i10 = jVar.f46889c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = jVar.f46887a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", jVar.a());
                        bundle.putString("pkg", ((Context) kVar.f46891b).getPackageName());
                        bundle.putBundle("data", jVar.d);
                        obtain.setData(bundle);
                        try {
                            c0 c0Var = iVar.f46885c;
                            Messenger messenger2 = (Messenger) c0Var.f42808c;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                f fVar = (f) c0Var.f42807b;
                                if (fVar != null) {
                                    Messenger messenger3 = fVar.f46879a;
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
