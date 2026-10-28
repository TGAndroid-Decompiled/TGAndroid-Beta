package sf;

import android.app.Activity;
import android.view.View;
import i2.j0;
import org.telegram.ui.LaunchActivity;
public final class c {
    public final Activity f48156a;
    public final uf.a f48157b;
    public String f48158c;
    public int d;
    public int e = 0;
    public boolean f48159f = false;
    public j0 f48160g;
    public int h;
    public int f48161i;
    public View f48162j;
    public View f48163k;

    public c(Activity activity, uf.a aVar) {
        this.f48156a = activity;
        this.f48157b = aVar;
    }

    public final d a() {
        Activity activity = this.f48156a;
        if (activity instanceof tf.a) {
            return new d(((LaunchActivity) ((tf.a) activity)).m0, this);
        }
        return null;
    }
}
