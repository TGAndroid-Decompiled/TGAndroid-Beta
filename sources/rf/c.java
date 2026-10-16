package rf;

import android.app.Activity;
import android.view.View;
import i2.h0;
import org.telegram.ui.LaunchActivity;
public final class c {
    public final Activity f43923a;
    public final tf.a f43924b;
    public String f43925c;
    public int d;
    public int e = 0;
    public boolean f43926f = false;
    public h0 f43927g;
    public int h;
    public int f43928i;
    public View f43929j;
    public View f43930k;

    public c(Activity activity, tf.a aVar) {
        this.f43923a = activity;
        this.f43924b = aVar;
    }

    public final d a() {
        Activity activity = this.f43923a;
        if (activity instanceof sf.a) {
            return new d(((LaunchActivity) ((sf.a) activity)).m0, this);
        }
        return null;
    }
}
