package ye;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.view.View;
import h3.k0;
import org.telegram.ui.LaunchActivity;

public final class c {

    public final Activity f49849a;

    public final af.a f49850b;

    public String f49851c;
    public int d;

    public int f49852e = 0;

    public boolean f49853f = false;

    public k0 f49854g;
    public int h;

    public int f49855i;

    public View f49856j;

    public View f49857k;

    public c(Activity activity, af.a aVar) {
        this.f49849a = activity;
        this.f49850b = aVar;
    }

    public final d a() {
        ComponentCallbacks2 componentCallbacks2 = this.f49849a;
        if (componentCallbacks2 instanceof ze.a) {
            return new d(((LaunchActivity) ((ze.a) componentCallbacks2)).f35515i0, this);
        }
        return null;
    }
}
