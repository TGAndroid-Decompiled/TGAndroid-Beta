package qf;

import android.app.Activity;
import android.view.View;
import i2.f0;
import org.telegram.ui.LaunchActivity;
public final class d {
    public final Activity f46096a;
    public final sf.a f46097b;
    public String f46098c;
    public int d;
    public int f46099e = 0;
    public boolean f46100f = false;
    public f0 f46101g;
    public int h;
    public int f46102i;
    public View f46103j;
    public View f46104k;

    public d(Activity activity, sf.a aVar) {
        this.f46096a = activity;
        this.f46097b = aVar;
    }

    public final e a() {
        Activity activity = this.f46096a;
        if (activity instanceof rf.a) {
            return new e(((LaunchActivity) ((rf.a) activity)).m0, this);
        }
        return null;
    }
}
