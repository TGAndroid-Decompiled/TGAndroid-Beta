package qf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f44343a;
    public final sf.a f44344b;
    public String f44345c;
    public int d;
    public int f44346e = 0;
    public boolean f44347f = false;
    public f0 f44348g;
    public int h;
    public int f44349i;
    public View f44350j;
    public View f44351k;

    public d(Activity activity, sf.a aVar) {
        this.f44343a = activity;
        this.f44344b = aVar;
    }

    public final e a() {
        Activity activity = this.f44343a;
        if (activity instanceof rf.a) {
            return new e(((LaunchActivity) ((rf.a) activity)).m0, this);
        }
        return null;
    }
}
