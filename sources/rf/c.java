package rf;

import android.app.Activity;
import android.view.View;
import i2.h0;
import org.telegram.ui.LaunchActivity;
public final class c {
    public final Activity f45676a;
    public final tf.a f45677b;
    public String f45678c;
    public int d;
    public int e = 0;
    public boolean f45679f = false;
    public h0 f45680g;
    public int h;
    public int f45681i;
    public View f45682j;
    public View f45683k;

    public c(Activity activity, tf.a aVar) {
        this.f45676a = activity;
        this.f45677b = aVar;
    }

    public final d a() {
        Activity activity = this.f45676a;
        if (activity instanceof sf.a) {
            return new d(((LaunchActivity) ((sf.a) activity)).m0, this);
        }
        return null;
    }
}
