package q6;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
public final class k0 implements Handler.Callback {
    public final l0 f55969a;

    public k0(l0 l0Var) {
        this.f55969a = l0Var;
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 0) {
            if (i7 != 1) {
                return false;
            }
            l0 l0Var = this.f55969a;
            synchronized (l0Var.f55972a) {
                try {
                    i0 i0Var = (i0) message.obj;
                    j0 j0Var = (j0) l0Var.f55972a.get(i0Var);
                    if (j0Var != null && j0Var.f55958b == 3) {
                        String valueOf = String.valueOf(i0Var);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
                        sb2.append("Timeout waiting for ServiceConnection callback ");
                        sb2.append(valueOf);
                        Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                        ComponentName componentName = j0Var.f55961f;
                        if (componentName == null) {
                            i0Var.getClass();
                            componentName = null;
                        }
                        if (componentName == null) {
                            String str = i0Var.f55952b;
                            m.h(str);
                            componentName = new ComponentName(str, "unknown");
                        }
                        j0Var.onServiceDisconnected(componentName);
                    }
                } finally {
                }
            }
            return true;
        }
        l0 l0Var2 = this.f55969a;
        synchronized (l0Var2.f55972a) {
            try {
                i0 i0Var2 = (i0) message.obj;
                j0 j0Var2 = (j0) l0Var2.f55972a.get(i0Var2);
                if (j0Var2 != null && j0Var2.f55957a.isEmpty()) {
                    if (j0Var2.f55959c) {
                        i0 i0Var3 = j0Var2.f55960e;
                        l0 l0Var3 = j0Var2.h;
                        l0Var3.f55974c.removeMessages(1, i0Var3);
                        l0Var3.d.b(l0Var3.f55973b, j0Var2);
                        j0Var2.f55959c = false;
                        j0Var2.f55958b = 2;
                    }
                    l0Var2.f55972a.remove(i0Var2);
                }
            } finally {
            }
        }
        return true;
    }
}
