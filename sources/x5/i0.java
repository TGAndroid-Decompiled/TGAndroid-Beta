package x5;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
public final class i0 implements Handler.Callback {
    public final j0 f48935a;

    public i0(j0 j0Var) {
        this.f48935a = j0Var;
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i9 = message.what;
        if (i9 != 0) {
            if (i9 != 1) {
                return false;
            }
            synchronized (this.f48935a.f48945a) {
                try {
                    g0 g0Var = (g0) message.obj;
                    h0 h0Var = (h0) this.f48935a.f48945a.get(g0Var);
                    if (h0Var != null && h0Var.f48928b == 3) {
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(g0Var)), new Exception());
                        ComponentName componentName = h0Var.f48931f;
                        if (componentName == null) {
                            g0Var.getClass();
                            componentName = null;
                        }
                        if (componentName == null) {
                            String str = g0Var.f48925b;
                            l.h(str);
                            componentName = new ComponentName(str, "unknown");
                        }
                        h0Var.onServiceDisconnected(componentName);
                    }
                } finally {
                }
            }
            return true;
        }
        synchronized (this.f48935a.f48945a) {
            try {
                g0 g0Var2 = (g0) message.obj;
                h0 h0Var2 = (h0) this.f48935a.f48945a.get(g0Var2);
                if (h0Var2 != null && h0Var2.f48927a.isEmpty()) {
                    if (h0Var2.f48929c) {
                        h0Var2.h.f48947c.removeMessages(1, h0Var2.f48930e);
                        j0 j0Var = h0Var2.h;
                        j0Var.d.b(j0Var.f48946b, h0Var2);
                        h0Var2.f48929c = false;
                        h0Var2.f48928b = 2;
                    }
                    this.f48935a.f48945a.remove(g0Var2);
                }
            } finally {
            }
        }
        return true;
    }
}
