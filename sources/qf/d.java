package qf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f46195a;
    public final sf.a f46196b;
    public String f46197c;
    public int d;
    public int f46198e = 0;
    public boolean f46199f = false;
    public f0 f46200g;
    public int h;
    public int f46201i;
    public View f46202j;
    public View f46203k;

    public d(Activity activity, sf.a aVar) {
        this.f46195a = activity;
        this.f46196b = aVar;
    }

    public final e a() {
        Activity activity = this.f46195a;
        if (activity instanceof rf.a) {
            return new e(((LaunchActivity) ((rf.a) activity)).m0, this);
        }
        return null;
    }
}
