package uf;

import android.app.Activity;
import android.view.View;
import k2.i0;
import org.telegram.ui.LaunchActivity;
public final class c {
    public final Activity f55838a;
    public final wf.a f55839b;
    public String f55840c;
    public int d;
    public int f55841e = 0;
    public boolean f55842f = false;
    public i0 f55843g;
    public int h;
    public int f55844i;
    public View f55845j;
    public View f55846k;

    public c(Activity activity, wf.a aVar) {
        this.f55838a = activity;
        this.f55839b = aVar;
    }

    public final d a() {
        Activity activity = this.f55838a;
        if (activity instanceof vf.a) {
            return new d(((LaunchActivity) ((vf.a) activity)).f41306n0, this);
        }
        return null;
    }
}
