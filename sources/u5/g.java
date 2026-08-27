package u5;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o0.m;
import org.telegram.ui.i6;

public final class g implements Runnable {

    public final int f48408a;

    public final i f48409b;

    public g(i iVar, int i10) {
        this.f48408a = i10;
        this.f48409b = iVar;
    }

    private final void a() {
        i iVar = this.f48409b;
        synchronized (iVar) {
            if (iVar.f48411a == 1) {
                iVar.a("Timed out while binding");
            }
        }
    }

    @Override
    public final void run() {
        switch (this.f48408a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f48409b.a("Service disconnected");
                return;
        }
        while (true) {
            i iVar = this.f48409b;
            synchronized (iVar) {
                try {
                    if (iVar.f48411a != 2) {
                        return;
                    }
                    if (iVar.d.isEmpty()) {
                        iVar.c();
                        return;
                    }
                    j jVar = (j) iVar.d.poll();
                    iVar.f48414e.put(jVar.f48416a, jVar);
                    ((ScheduledExecutorService) iVar.f48415f.f48423c).schedule(new m(8, iVar, jVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(jVar)));
                    }
                    k kVar = iVar.f48415f;
                    Messenger messenger = iVar.f48412b;
                    int i10 = jVar.f48418c;
                    Context context = (Context) kVar.f48422b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i10;
                    messageObtain.arg1 = jVar.f48416a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", jVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", jVar.d);
                    messageObtain.setData(bundle);
                    try {
                        i6 i6Var = iVar.f48413c;
                        Messenger messenger2 = (Messenger) i6Var.f38984b;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            f fVar = (f) i6Var.f38985c;
                            if (fVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = fVar.f48407a;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e9) {
                        iVar.a(e9.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
