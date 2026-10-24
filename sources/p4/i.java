package p4;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;
public final class i extends MediaRouter2$RouteCallback {
    public final int f44556a;
    public final k f44557b;

    public i(k kVar, int i10) {
        this.f44556a = i10;
        this.f44557b = kVar;
    }

    public void onRoutesAdded(List list) {
        switch (this.f44556a) {
            case 0:
                this.f44557b.q();
                return;
            default:
                super.onRoutesAdded(list);
                return;
        }
    }

    public void onRoutesChanged(List list) {
        switch (this.f44556a) {
            case 0:
                this.f44557b.q();
                return;
            default:
                super.onRoutesChanged(list);
                return;
        }
    }

    public void onRoutesRemoved(List list) {
        switch (this.f44556a) {
            case 0:
                this.f44557b.q();
                return;
            default:
                super.onRoutesRemoved(list);
                return;
        }
    }

    public void onRoutesUpdated(List list) {
        switch (this.f44556a) {
            case 1:
                this.f44557b.q();
                return;
            default:
                super.onRoutesUpdated(list);
                return;
        }
    }
}
