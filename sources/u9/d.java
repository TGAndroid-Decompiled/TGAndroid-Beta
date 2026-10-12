package u9;

import androidx.biometric.e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import h8.j;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import t7.u;
public final class d implements w2.d, Continuation {
    public Object f46237a;

    public d(Object obj) {
        this.f46237a = obj;
    }

    public void a(e eVar) {
        j jVar = (j) this.f46237a;
        jVar.f10384a = eVar;
        Iterator it = jVar.f10386c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.f10386c.clear();
        jVar.f10385b = null;
    }

    @Override
    public Object then(Task task) {
        return ((Callable) this.f46237a).call();
    }

    public d(int i10) {
        switch (i10) {
            case 5:
                this.f46237a = new CopyOnWriteArrayList();
                return;
            default:
                this.f46237a = new u(28);
                return;
        }
    }
}
