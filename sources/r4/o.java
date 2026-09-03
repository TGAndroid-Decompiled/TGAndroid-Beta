package r4;

import android.os.Handler;
import android.os.Message;
import g5.q;
import h5.d0;
import java.util.TreeMap;
import org.telegram.ui.Cells.f1;
public final class o implements Handler.Callback {
    public final q f46701a;
    public final f1 f46702b;
    public s4.c f46705f;
    public boolean h;
    public boolean f46706n;
    public boolean f46707r;
    public final TreeMap f46704e = new TreeMap();
    public final Handler d = d0.l(this);
    public final f4.b f46703c = new f4.b(1);

    public o(s4.c cVar, f1 f1Var, q qVar) {
        this.f46705f = cVar;
        this.f46702b = f1Var;
        this.f46701a = qVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f46707r) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j10 = mVar.f46695a;
            long j11 = mVar.f46696b;
            Long valueOf = Long.valueOf(j11);
            TreeMap treeMap = this.f46704e;
            Long l10 = (Long) treeMap.get(valueOf);
            if (l10 == null) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
                return true;
            } else if (l10.longValue() > j10) {
                treeMap.put(Long.valueOf(j11), Long.valueOf(j10));
            }
        }
        return true;
    }
}
