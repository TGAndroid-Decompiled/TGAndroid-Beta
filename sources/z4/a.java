package z4;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
public abstract class a {
    public final DataSetObservable f49279a = new DataSetObservable();
    public DataSetObserver f49280b;

    public abstract void a(g gVar, Object obj);

    public abstract int b();

    public int c(Object obj) {
        return -1;
    }

    public CharSequence d(int i10) {
        return null;
    }

    public abstract Object e(g gVar, int i10);

    public abstract boolean f(View view, Object obj);

    public void g() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f49280b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f49279a.notifyChanged();
    }

    public final void i(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f49280b = dataSetObserver;
        }
    }

    public void h(int i10) {
    }
}
