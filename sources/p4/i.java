package p4;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;
public final class i extends MediaRouter2$RouteCallback {
    public final int f43046a;
    public final k f43047b;

    public i(k kVar, int i10) {
        this.f43046a = i10;
        this.f43047b = kVar;
    }

    public void onRoutesAdded(List list) {
        switch (this.f43046a) {
            case 0:
                this.f43047b.q();
                return;
            default:
                super.onRoutesAdded(list);
                return;
        }
    }

    public void onRoutesChanged(List list) {
        switch (this.f43046a) {
            case 0:
                this.f43047b.q();
                return;
            default:
                super.onRoutesChanged(list);
                return;
        }
    }

    public void onRoutesRemoved(List list) {
        switch (this.f43046a) {
            case 0:
                this.f43047b.q();
                return;
            default:
                super.onRoutesRemoved(list);
                return;
        }
    }

    public void onRoutesUpdated(List list) {
        switch (this.f43046a) {
            case 1:
                this.f43047b.q();
                return;
            default:
                super.onRoutesUpdated(list);
                return;
        }
    }
}
