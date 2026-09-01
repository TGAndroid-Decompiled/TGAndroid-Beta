package x5;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.telegram.ui.zy;
import q5.g0;
public final class g implements Runnable {
    public final int f50416a;
    public final i f50417b;

    public g(i iVar, int i10) {
        this.f50416a = i10;
        this.f50417b = iVar;
    }

    private final void a() {
        i iVar = this.f50417b;
        synchronized (iVar) {
            if (iVar.f50419a == 1) {
                iVar.a("Timed out while binding");
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f50416a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f50417b.a("Service disconnected");
                return;
        }
        while (true) {
            i iVar = this.f50417b;
            synchronized (iVar) {
                try {
                    if (iVar.f50419a == 2) {
                        if (iVar.d.isEmpty()) {
                            iVar.c();
                            return;
                        }
                        j jVar = (j) iVar.d.poll();
                        iVar.f50422e.put(jVar.f50424a, jVar);
                        ((ScheduledExecutorService) iVar.f50423f.f50431c).schedule(new zy(iVar, jVar, false, 12), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(jVar)));
                        }
                        k kVar = iVar.f50423f;
                        Messenger messenger = iVar.f50420b;
                        int i10 = jVar.f50426c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = jVar.f50424a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", jVar.a());
                        bundle.putString("pkg", ((Context) kVar.f50430b).getPackageName());
                        bundle.putBundle("data", jVar.d);
                        obtain.setData(bundle);
                        try {
                            g0 g0Var = iVar.f50421c;
                            Messenger messenger2 = (Messenger) g0Var.f44557b;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                f fVar = (f) g0Var.f44558c;
                                if (fVar != null) {
                                    Messenger messenger3 = fVar.f50415a;
                                    messenger3.getClass();
                                    messenger3.send(obtain);
                                } else {
                                    throw new IllegalStateException("Both messengers are null");
                                }
                            }
                        } catch (RemoteException e6) {
                            iVar.a(e6.getMessage());
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
