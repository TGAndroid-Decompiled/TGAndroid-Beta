package rf;

import android.app.Activity;
import android.view.View;
import i2.g0;
import org.telegram.ui.LaunchActivity;
public final class c {
    public final Activity f45279a;
    public final tf.a f45280b;
    public String f45281c;
    public int d;
    public int e = 0;
    public boolean f45282f = false;
    public g0 f45283g;
    public int h;
    public int f45284i;
    public View f45285j;
    public View f45286k;

    public c(Activity activity, tf.a aVar) {
        this.f45279a = activity;
        this.f45280b = aVar;
    }

    public final d a() {
        Activity activity = this.f45279a;
        if (activity instanceof sf.a) {
            return new d(((LaunchActivity) ((sf.a) activity)).m0, this);
        }
        return null;
    }
}
