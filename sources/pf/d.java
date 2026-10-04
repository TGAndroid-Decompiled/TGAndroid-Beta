package pf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f44406a;
    public final rf.a f44407b;
    public String f44408c;
    public int d;
    public int f44409e = 0;
    public boolean f44410f = false;
    public f0 f44411g;
    public int h;
    public int f44412i;
    public View f44413j;
    public View f44414k;

    public d(Activity activity, rf.a aVar) {
        this.f44406a = activity;
        this.f44407b = aVar;
    }

    public final e a() {
        Activity activity = this.f44406a;
        if (activity instanceof qf.a) {
            return new e(((LaunchActivity) ((qf.a) activity)).m0, this);
        }
        return null;
    }
}
