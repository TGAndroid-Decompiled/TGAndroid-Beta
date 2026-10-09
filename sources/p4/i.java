package p4;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;
public final class i extends MediaRouter2$RouteCallback {
    public final int f45367a;
    public final k f45368b;

    public i(k kVar, int i10) {
        this.f45367a = i10;
        this.f45368b = kVar;
    }

    public void onRoutesAdded(List list) {
        switch (this.f45367a) {
            case 0:
                this.f45368b.q();
                return;
            default:
                super.onRoutesAdded(list);
                return;
        }
    }

    public void onRoutesChanged(List list) {
        switch (this.f45367a) {
            case 0:
                this.f45368b.q();
                return;
            default:
                super.onRoutesChanged(list);
                return;
        }
    }

    public void onRoutesRemoved(List list) {
        switch (this.f45367a) {
            case 0:
                this.f45368b.q();
                return;
            default:
                super.onRoutesRemoved(list);
                return;
        }
    }

    public void onRoutesUpdated(List list) {
        switch (this.f45367a) {
            case 1:
                this.f45368b.q();
                return;
            default:
                super.onRoutesUpdated(list);
                return;
        }
    }
}
