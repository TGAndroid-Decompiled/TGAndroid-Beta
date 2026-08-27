package y5;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

public final class i0 implements Handler.Callback {

    public final j0 f49652a;

    public i0(j0 j0Var) {
        this.f49652a = j0Var;
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f49652a.f49662a) {
                try {
                    g0 g0Var = (g0) message.obj;
                    h0 h0Var = (h0) this.f49652a.f49662a.get(g0Var);
                    if (h0Var != null && h0Var.f49644a.isEmpty()) {
                        if (h0Var.f49646c) {
                            h0Var.h.f49664c.removeMessages(1, h0Var.f49647e);
                            j0 j0Var = h0Var.h;
                            j0Var.d.b(j0Var.f49663b, h0Var);
                            h0Var.f49646c = false;
                            h0Var.f49645b = 2;
                        }
                        this.f49652a.f49662a.remove(g0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (this.f49652a.f49662a) {
            try {
                g0 g0Var2 = (g0) message.obj;
                h0 h0Var2 = (h0) this.f49652a.f49662a.get(g0Var2);
                if (h0Var2 != null && h0Var2.f49645b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(g0Var2)), new Exception());
                    ComponentName componentName = h0Var2.f49648f;
                    if (componentName == null) {
                        g0Var2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = g0Var2.f49642b;
                        l.h(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    h0Var2.onServiceDisconnected(componentName);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
