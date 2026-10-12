package qf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f46088a;
    public final sf.a f46089b;
    public String f46090c;
    public int d;
    public int f46091e = 0;
    public boolean f46092f = false;
    public f0 f46093g;
    public int h;
    public int f46094i;
    public View f46095j;
    public View f46096k;

    public d(Activity activity, sf.a aVar) {
        this.f46088a = activity;
        this.f46089b = aVar;
    }

    public final e a() {
        Activity activity = this.f46088a;
        if (activity instanceof rf.a) {
            return new e(((LaunchActivity) ((rf.a) activity)).m0, this);
        }
        return null;
    }
}
