package qf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f44342a;
    public final sf.a f44343b;
    public String f44344c;
    public int d;
    public int f44345e = 0;
    public boolean f44346f = false;
    public f0 f44347g;
    public int h;
    public int f44348i;
    public View f44349j;
    public View f44350k;

    public d(Activity activity, sf.a aVar) {
        this.f44342a = activity;
        this.f44343b = aVar;
    }

    public final e a() {
        Activity activity = this.f44342a;
        if (activity instanceof rf.a) {
            return new e(((LaunchActivity) ((rf.a) activity)).m0, this);
        }
        return null;
    }
}
