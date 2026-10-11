package w7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
public abstract class i {
    public static final Object a(Task task, ld.c cVar) {
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
        ae.m mVar = new ae.m(1, h.b(cVar));
        mVar.s();
        task.addOnCompleteListener(ke.a.f14791a, new pb.c(mVar, 28));
        Object r10 = mVar.r();
        kd.a aVar = kd.a.f14783a;
        return r10;
    }
}
