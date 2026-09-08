package p4;

import android.media.MediaRouter2;
import java.util.List;
public final class i extends MediaRouter2.RouteCallback {
    public final int f43874a;
    public final k f43875b;

    public i(k kVar, int i10) {
        this.f43874a = i10;
        this.f43875b = kVar;
    }

    @Override
    public void onRoutesAdded(List list) {
        switch (this.f43874a) {
            case 0:
                this.f43875b.q();
                return;
            default:
                super.onRoutesAdded(list);
                return;
        }
    }

    @Override
    public void onRoutesChanged(List list) {
        switch (this.f43874a) {
            case 0:
                this.f43875b.q();
                return;
            default:
                super.onRoutesChanged(list);
                return;
        }
    }

    @Override
    public void onRoutesRemoved(List list) {
        switch (this.f43874a) {
            case 0:
                this.f43875b.q();
                return;
            default:
                super.onRoutesRemoved(list);
                return;
        }
    }

    public void onRoutesUpdated(List list) {
        switch (this.f43874a) {
            case 1:
                this.f43875b.q();
                return;
            default:
                super.onRoutesUpdated(list);
                return;
        }
    }
}
