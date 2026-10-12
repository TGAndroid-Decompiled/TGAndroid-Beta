package rf;

import android.app.Activity;
import android.view.View;
import i2.h0;
import org.telegram.ui.LaunchActivity;
public final class c {
    public final Activity f44164a;
    public final tf.a f44165b;
    public String f44166c;
    public int d;
    public int e = 0;
    public boolean f44167f = false;
    public h0 f44168g;
    public int h;
    public int f44169i;
    public View f44170j;
    public View f44171k;

    public c(Activity activity, tf.a aVar) {
        this.f44164a = activity;
        this.f44165b = aVar;
    }

    public final d a() {
        Activity activity = this.f44164a;
        if (activity instanceof sf.a) {
            return new d(((LaunchActivity) ((sf.a) activity)).m0, this);
        }
        return null;
    }
}
