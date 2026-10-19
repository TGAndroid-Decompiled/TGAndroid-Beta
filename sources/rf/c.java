package rf;

import android.app.Activity;
import android.view.View;
import i2.i0;
import org.telegram.ui.LaunchActivity;
public final class c {
    public final Activity f45251a;
    public final tf.a f45252b;
    public String f45253c;
    public int d;
    public int e = 0;
    public boolean f45254f = false;
    public i0 f45255g;
    public int h;
    public int f45256i;
    public View f45257j;
    public View f45258k;

    public c(Activity activity, tf.a aVar) {
        this.f45251a = activity;
        this.f45252b = aVar;
    }

    public final d a() {
        Activity activity = this.f45251a;
        if (activity instanceof sf.a) {
            return new d(((LaunchActivity) ((sf.a) activity)).m0, this);
        }
        return null;
    }
}
