package v7;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
public abstract class x6 {
    public static final Object a(Task task, ed.c cVar) {
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
        td.m mVar = new td.m(1, w6.b(cVar));
        mVar.s();
        task.addOnCompleteListener(de.a.f5872a, new a6.i(mVar, 19));
        Object r10 = mVar.r();
        dd.a aVar = dd.a.f5864a;
        return r10;
    }
}
