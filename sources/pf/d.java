package pf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f40734a;
    public final rf.a f40735b;
    public String f40736c;
    public int d;
    public int e = 0;
    public boolean f40737f = false;
    public f0 f40738g;
    public int h;
    public int f40739i;
    public View f40740j;
    public View f40741k;

    public d(Activity activity, rf.a aVar) {
        this.f40734a = activity;
        this.f40735b = aVar;
    }

    public final e a() {
        Activity activity = this.f40734a;
        if (activity instanceof qf.a) {
            return new e(((LaunchActivity) ((qf.a) activity)).m0, this);
        }
        return null;
    }
}
