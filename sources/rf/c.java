package rf;

import android.app.Activity;
import android.view.View;
import i2.i0;
import org.telegram.ui.LaunchActivity;
public final class c {
    public final Activity f45264a;
    public final tf.a f45265b;
    public String f45266c;
    public int d;
    public int e = 0;
    public boolean f45267f = false;
    public i0 f45268g;
    public int h;
    public int f45269i;
    public View f45270j;
    public View f45271k;

    public c(Activity activity, tf.a aVar) {
        this.f45264a = activity;
        this.f45265b = aVar;
    }

    public final d a() {
        Activity activity = this.f45264a;
        if (activity instanceof sf.a) {
            return new d(((LaunchActivity) ((sf.a) activity)).m0, this);
        }
        return null;
    }
}
