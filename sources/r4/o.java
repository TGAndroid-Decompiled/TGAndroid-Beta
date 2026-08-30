package r4;

import android.os.Handler;
import android.os.Message;
import g5.q;
import h5.d0;
import java.util.TreeMap;
import org.telegram.ui.Cells.f1;
public final class o implements Handler.Callback {
    public final q f43325a;
    public final f1 f43326b;
    public s4.c f43328f;
    public boolean h;
    public boolean f43329n;
    public boolean f43330r;
    public final TreeMap e = new TreeMap();
    public final Handler d = d0.l(this);
    public final f4.b f43327c = new f4.b(1);

    public o(s4.c cVar, f1 f1Var, q qVar) {
        this.f43328f = cVar;
        this.f43326b = f1Var;
        this.f43325a = qVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f43330r) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j10 = mVar.f43320a;
            long j11 = mVar.f43321b;
            Long valueOf = Long.valueOf(j11);
            TreeMap treeMap = this.e;
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
