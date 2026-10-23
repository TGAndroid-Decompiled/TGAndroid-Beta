package p4;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;
public final class i extends MediaRouter2$RouteCallback {
    public final int f44142a;
    public final k f44143b;

    public i(k kVar, int i10) {
        this.f44142a = i10;
        this.f44143b = kVar;
    }

    public void onRoutesAdded(List list) {
        switch (this.f44142a) {
            case 0:
                this.f44143b.q();
                return;
            default:
                super.onRoutesAdded(list);
                return;
        }
    }

    public void onRoutesChanged(List list) {
        switch (this.f44142a) {
            case 0:
                this.f44143b.q();
                return;
            default:
                super.onRoutesChanged(list);
                return;
        }
    }

    public void onRoutesRemoved(List list) {
        switch (this.f44142a) {
            case 0:
                this.f44143b.q();
                return;
            default:
                super.onRoutesRemoved(list);
                return;
        }
    }

    public void onRoutesUpdated(List list) {
        switch (this.f44142a) {
            case 1:
                this.f44143b.q();
                return;
            default:
                super.onRoutesUpdated(list);
                return;
        }
    }
}
