package rf;

import android.app.Activity;
import android.view.View;
import i2.h0;
import org.telegram.ui.LaunchActivity;
public final class c {
    public final Activity f45253a;
    public final tf.a f45254b;
    public String f45255c;
    public int d;
    public int e = 0;
    public boolean f45256f = false;
    public h0 f45257g;
    public int h;
    public int f45258i;
    public View f45259j;
    public View f45260k;

    public c(Activity activity, tf.a aVar) {
        this.f45253a = activity;
        this.f45254b = aVar;
    }

    public final d a() {
        Activity activity = this.f45253a;
        if (activity instanceof sf.a) {
            return new d(((LaunchActivity) ((sf.a) activity)).m0, this);
        }
        return null;
    }
}
