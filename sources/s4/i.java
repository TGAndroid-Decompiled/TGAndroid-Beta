package s4;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;
public final class i extends MediaRouter2$RouteCallback {
    public final int f57014a;
    public final k f57015b;

    public i(k kVar, int i7) {
        this.f57014a = i7;
        this.f57015b = kVar;
    }

    public void onRoutesAdded(List list) {
        switch (this.f57014a) {
            case 0:
                this.f57015b.q();
                return;
            default:
                super.onRoutesAdded(list);
                return;
        }
    }

    public void onRoutesChanged(List list) {
        switch (this.f57014a) {
            case 0:
                this.f57015b.q();
                return;
            default:
                super.onRoutesChanged(list);
                return;
        }
    }

    public void onRoutesRemoved(List list) {
        switch (this.f57014a) {
            case 0:
                this.f57015b.q();
                return;
            default:
                super.onRoutesRemoved(list);
                return;
        }
    }

    public void onRoutesUpdated(List list) {
        switch (this.f57014a) {
            case 1:
                this.f57015b.q();
                return;
            default:
                super.onRoutesUpdated(list);
                return;
        }
    }
}
