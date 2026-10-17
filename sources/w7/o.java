package w7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
public abstract class o {
    public static final Object a(Task task, md.c cVar) {
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
        be.m mVar = new be.m(1, n.b(cVar));
        mVar.s();
        task.addOnCompleteListener(le.a.f16001a, new le.b(mVar, 0));
        Object r10 = mVar.r();
        ld.a aVar = ld.a.f15993a;
        return r10;
    }
}
