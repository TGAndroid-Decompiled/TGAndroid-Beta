package x9;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class w implements Continuation {
    public final int f53535a;
    public final TaskCompletionSource f53536b;

    public w(int i10, TaskCompletionSource taskCompletionSource) {
        this.f53535a = i10;
        this.f53536b = taskCompletionSource;
    }

    @Override
    public final Object then(Task task) {
        switch (this.f53535a) {
            case 0:
                boolean isSuccessful = task.isSuccessful();
                TaskCompletionSource taskCompletionSource = this.f53536b;
                if (isSuccessful) {
                    taskCompletionSource.trySetResult(task.getResult());
                    return null;
                } else if (task.getException() != null) {
                    taskCompletionSource.trySetException(task.getException());
                    return null;
                } else {
                    return null;
                }
            case 1:
                boolean isSuccessful2 = task.isSuccessful();
                TaskCompletionSource taskCompletionSource2 = this.f53536b;
                if (isSuccessful2) {
                    taskCompletionSource2.trySetResult(task.getResult());
                    return null;
                } else if (task.getException() != null) {
                    taskCompletionSource2.trySetException(task.getException());
                    return null;
                } else {
                    return null;
                }
            default:
                boolean isSuccessful3 = task.isSuccessful();
                TaskCompletionSource taskCompletionSource3 = this.f53536b;
                if (isSuccessful3) {
                    taskCompletionSource3.setResult(task.getResult());
                    return null;
                } else if (task.getException() != null) {
                    taskCompletionSource3.setException(task.getException());
                    return null;
                } else {
                    return null;
                }
        }
    }
}
