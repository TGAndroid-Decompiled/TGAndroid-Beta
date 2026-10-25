package sf;

import android.app.Activity;
import android.view.View;
import i2.j0;
import org.telegram.ui.LaunchActivity;
public final class c {
    public final Activity f48115a;
    public final uf.a f48116b;
    public String f48117c;
    public int d;
    public int e = 0;
    public boolean f48118f = false;
    public j0 f48119g;
    public int h;
    public int f48120i;
    public View f48121j;
    public View f48122k;

    public c(Activity activity, uf.a aVar) {
        this.f48115a = activity;
        this.f48116b = aVar;
    }

    public final d a() {
        Activity activity = this.f48115a;
        if (activity instanceof tf.a) {
            return new d(((LaunchActivity) ((tf.a) activity)).m0, this);
        }
        return null;
    }
}
