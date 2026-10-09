package qf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f46151a;
    public final sf.a f46152b;
    public String f46153c;
    public int d;
    public int f46154e = 0;
    public boolean f46155f = false;
    public f0 f46156g;
    public int h;
    public int f46157i;
    public View f46158j;
    public View f46159k;

    public d(Activity activity, sf.a aVar) {
        this.f46151a = activity;
        this.f46152b = aVar;
    }

    public final e a() {
        Activity activity = this.f46151a;
        if (activity instanceof rf.a) {
            return new e(((LaunchActivity) ((rf.a) activity)).m0, this);
        }
        return null;
    }
}
