package s4;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;
public final class i extends MediaRouter2$RouteCallback {
    public final int f54713a;
    public final k f54714b;

    public i(k kVar, int i7) {
        this.f54713a = i7;
        this.f54714b = kVar;
    }

    public void onRoutesAdded(List list) {
        switch (this.f54713a) {
            case 0:
                this.f54714b.q();
                return;
            default:
                super.onRoutesAdded(list);
                return;
        }
    }

    public void onRoutesChanged(List list) {
        switch (this.f54713a) {
            case 0:
                this.f54714b.q();
                return;
            default:
                super.onRoutesChanged(list);
                return;
        }
    }

    public void onRoutesRemoved(List list) {
        switch (this.f54713a) {
            case 0:
                this.f54714b.q();
                return;
            default:
                super.onRoutesRemoved(list);
                return;
        }
    }

    public void onRoutesUpdated(List list) {
        switch (this.f54713a) {
            case 1:
                this.f54714b.q();
                return;
            default:
                super.onRoutesUpdated(list);
                return;
        }
    }
}
