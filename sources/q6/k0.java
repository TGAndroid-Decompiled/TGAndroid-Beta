package q6;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
public final class k0 implements Handler.Callback {
    public final l0 f53918a;

    public k0(l0 l0Var) {
        this.f53918a = l0Var;
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 != 0) {
            if (i7 != 1) {
                return false;
            }
            l0 l0Var = this.f53918a;
            synchronized (l0Var.f53921a) {
                try {
                    i0 i0Var = (i0) message.obj;
                    j0 j0Var = (j0) l0Var.f53921a.get(i0Var);
                    if (j0Var != null && j0Var.f53907b == 3) {
                        String valueOf = String.valueOf(i0Var);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 47);
                        sb2.append("Timeout waiting for ServiceConnection callback ");
                        sb2.append(valueOf);
                        Log.e("GmsClientSupervisor", sb2.toString(), new Exception());
                        ComponentName componentName = j0Var.f53910f;
                        if (componentName == null) {
                            i0Var.getClass();
                            componentName = null;
                        }
                        if (componentName == null) {
                            String str = i0Var.f53901b;
                            m.g(str);
                            componentName = new ComponentName(str, "unknown");
                        }
                        j0Var.onServiceDisconnected(componentName);
                    }
                } finally {
                }
            }
            return true;
        }
        l0 l0Var2 = this.f53918a;
        synchronized (l0Var2.f53921a) {
            try {
                i0 i0Var2 = (i0) message.obj;
                j0 j0Var2 = (j0) l0Var2.f53921a.get(i0Var2);
                if (j0Var2 != null && j0Var2.f53906a.isEmpty()) {
                    if (j0Var2.f53908c) {
                        i0 i0Var3 = j0Var2.f53909e;
                        l0 l0Var3 = j0Var2.h;
                        l0Var3.f53923c.removeMessages(1, i0Var3);
                        l0Var3.d.b(l0Var3.f53922b, j0Var2);
                        j0Var2.f53908c = false;
                        j0Var2.f53907b = 2;
                    }
                    l0Var2.f53921a.remove(i0Var2);
                }
            } finally {
            }
        }
        return true;
    }
}
