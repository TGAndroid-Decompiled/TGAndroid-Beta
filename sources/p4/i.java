package p4;

import android.media.MediaRouter2;
import java.util.List;
public final class i extends MediaRouter2.RouteCallback {
    public final int f40589a;
    public final k f40590b;

    public i(k kVar, int i10) {
        this.f40589a = i10;
        this.f40590b = kVar;
    }

    @Override
    public void onRoutesAdded(List list) {
        switch (this.f40589a) {
            case 0:
                this.f40590b.q();
                return;
            default:
                super.onRoutesAdded(list);
                return;
        }
    }

    @Override
    public void onRoutesChanged(List list) {
        switch (this.f40589a) {
            case 0:
                this.f40590b.q();
                return;
            default:
                super.onRoutesChanged(list);
                return;
        }
    }

    @Override
    public void onRoutesRemoved(List list) {
        switch (this.f40589a) {
            case 0:
                this.f40590b.q();
                return;
            default:
                super.onRoutesRemoved(list);
                return;
        }
    }

    public void onRoutesUpdated(List list) {
        switch (this.f40589a) {
            case 1:
                this.f40590b.q();
                return;
            default:
                super.onRoutesUpdated(list);
                return;
        }
    }
}
