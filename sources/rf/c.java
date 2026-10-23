package rf;

import android.app.Activity;
import android.view.View;
import i2.h0;
import org.telegram.ui.LaunchActivity;
public final class c {
    public final Activity f45677a;
    public final tf.a f45678b;
    public String f45679c;
    public int d;
    public int e = 0;
    public boolean f45680f = false;
    public h0 f45681g;
    public int h;
    public int f45682i;
    public View f45683j;
    public View f45684k;

    public c(Activity activity, tf.a aVar) {
        this.f45677a = activity;
        this.f45678b = aVar;
    }

    public final d a() {
        Activity activity = this.f45677a;
        if (activity instanceof sf.a) {
            return new d(((LaunchActivity) ((sf.a) activity)).m0, this);
        }
        return null;
    }
}
