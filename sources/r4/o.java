package r4;

import android.os.Handler;
import android.os.Message;
import g5.q;
import h5.d0;
import java.util.TreeMap;
import org.telegram.ui.Components.zz;
public final class o implements Handler.Callback {
    public final q f43349a;
    public final zz f43350b;
    public s4.c f43352f;
    public boolean h;
    public boolean f43353n;
    public boolean f43354r;
    public final TreeMap e = new TreeMap();
    public final Handler d = d0.l(this);
    public final f4.b f43351c = new f4.b(1);

    public o(s4.c cVar, zz zzVar, q qVar) {
        this.f43352f = cVar;
        this.f43350b = zzVar;
        this.f43349a = qVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.f43354r) {
            if (message.what != 1) {
                return false;
            }
            m mVar = (m) message.obj;
            long j10 = mVar.f43344a;
            long j11 = mVar.f43345b;
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
