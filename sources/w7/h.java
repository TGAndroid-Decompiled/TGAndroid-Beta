package w7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
public abstract class h {
    public static final Object a(Task task, kd.c cVar) {
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception == null) {
                if (!task.isCanceled()) {
                    return task.getResult();
                }
                throw new CancellationException("Task " + task + " was cancelled normally.");
            }
            throw exception;
        }
        zd.m mVar = new zd.m(1, g.b(cVar));
        mVar.s();
        task.addOnCompleteListener(je.a.f11869a, new je.b(mVar));
        Object r10 = mVar.r();
        jd.a aVar = jd.a.f11861a;
        return r10;
    }
}
