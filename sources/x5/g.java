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
import q5.c0;
public final class g implements Runnable {
    public final int f50452a;
    public final i f50453b;

    public g(i iVar, int i10) {
        this.f50452a = i10;
        this.f50453b = iVar;
    }

    private final void a() {
        i iVar = this.f50453b;
        synchronized (iVar) {
            if (iVar.f50455a == 1) {
                iVar.a("Timed out while binding");
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f50452a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f50453b.a("Service disconnected");
                return;
        }
        while (true) {
            i iVar = this.f50453b;
            synchronized (iVar) {
                try {
                    if (iVar.f50455a == 2) {
                        if (iVar.d.isEmpty()) {
                            iVar.c();
                            return;
                        }
                        j jVar = (j) iVar.d.poll();
                        iVar.f50458e.put(jVar.f50460a, jVar);
                        ((ScheduledExecutorService) iVar.f50459f.f50467c).schedule(new zy(iVar, jVar, false, 12), 30L, TimeUnit.SECONDS);
                        if (Log.isLoggable("MessengerIpcClient", 3)) {
                            Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(jVar)));
                        }
                        k kVar = iVar.f50459f;
                        Messenger messenger = iVar.f50456b;
                        int i10 = jVar.f50462c;
                        Message obtain = Message.obtain();
                        obtain.what = i10;
                        obtain.arg1 = jVar.f50460a;
                        obtain.replyTo = messenger;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("oneWay", jVar.a());
                        bundle.putString("pkg", ((Context) kVar.f50466b).getPackageName());
                        bundle.putBundle("data", jVar.d);
                        obtain.setData(bundle);
                        try {
                            c0 c0Var = iVar.f50457c;
                            Messenger messenger2 = (Messenger) c0Var.f44559c;
                            if (messenger2 != null) {
                                messenger2.send(obtain);
                            } else {
                                f fVar = (f) c0Var.f44558b;
                                if (fVar != null) {
                                    Messenger messenger3 = fVar.f50451a;
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
