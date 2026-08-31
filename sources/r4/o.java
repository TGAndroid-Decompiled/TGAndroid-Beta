package r4;

import android.os.Handler;
import android.os.Message;
import g5.q;
import h5.d0;
import java.util.TreeMap;
import org.telegram.ui.Cells.f1;
public final class o implements Handler.Callback {
    public final q f46670a;
    public final f1 f46671b;
    public s4.c f46674f;
    public boolean h;
    public boolean f46675n;
    public boolean f46676r;
    public final TreeMap f46673e = new TreeMap();
    public final Handler d = d0.l(this);
    public final f4.b f46672c = new f4.b(1);

    public o(s4.c cVar, f1 f1Var, q qVar) {
        this.f46674f = cVar;
        this.f46671b = f1Var;
        this.f46670a = qVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f46676r) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j10 = mVar.f46664a;
            long j11 = mVar.f46665b;
            Long valueOf = Long.valueOf(j11);
            TreeMap treeMap = this.f46673e;
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
