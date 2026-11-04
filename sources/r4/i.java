package r4;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;
public final class i extends MediaRouter2$RouteCallback {
    public final int f54296a;
    public final k f54297b;

    public i(k kVar, int i3) {
        this.f54296a = i3;
        this.f54297b = kVar;
    }

    public void onRoutesAdded(List list) {
        switch (this.f54296a) {
            case 0:
                this.f54297b.q();
                return;
            default:
                super.onRoutesAdded(list);
                return;
        }
    }

    public void onRoutesChanged(List list) {
        switch (this.f54296a) {
            case 0:
                this.f54297b.q();
                return;
            default:
                super.onRoutesChanged(list);
                return;
        }
    }

    public void onRoutesRemoved(List list) {
        switch (this.f54296a) {
            case 0:
                this.f54297b.q();
                return;
            default:
                super.onRoutesRemoved(list);
                return;
        }
    }

    public void onRoutesUpdated(List list) {
        switch (this.f54296a) {
            case 1:
                this.f54297b.q();
                return;
            default:
                super.onRoutesUpdated(list);
                return;
        }
    }
}
