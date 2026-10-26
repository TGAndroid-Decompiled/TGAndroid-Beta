package sf;

import android.app.Activity;
import android.view.View;
import i2.j0;
import org.telegram.ui.LaunchActivity;
public final class c {
    public final Activity f48118a;
    public final uf.a f48119b;
    public String f48120c;
    public int d;
    public int e = 0;
    public boolean f48121f = false;
    public j0 f48122g;
    public int h;
    public int f48123i;
    public View f48124j;
    public View f48125k;

    public c(Activity activity, uf.a aVar) {
        this.f48118a = activity;
        this.f48119b = aVar;
    }

    public final d a() {
        Activity activity = this.f48118a;
        if (activity instanceof tf.a) {
            return new d(((LaunchActivity) ((tf.a) activity)).m0, this);
        }
        return null;
    }
}
