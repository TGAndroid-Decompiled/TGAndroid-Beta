package rf;

import android.app.Activity;
import android.view.View;
import i2.h0;
import org.telegram.ui.LaunchActivity;
public final class c {
    public final Activity f45299a;
    public final tf.a f45300b;
    public String f45301c;
    public int d;
    public int e = 0;
    public boolean f45302f = false;
    public h0 f45303g;
    public int h;
    public int f45304i;
    public View f45305j;
    public View f45306k;

    public c(Activity activity, tf.a aVar) {
        this.f45299a = activity;
        this.f45300b = aVar;
    }

    public final d a() {
        Activity activity = this.f45299a;
        if (activity instanceof sf.a) {
            return new d(((LaunchActivity) ((sf.a) activity)).m0, this);
        }
        return null;
    }
}
