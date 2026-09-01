package vf;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.bd0;
public final class o0 implements Runnable {
    public final int f49157a = 0;
    public final v0 f49158b;
    public final bd0 f49159c;
    public final d2 d;

    public o0(v0 v0Var, d2 d2Var, bd0 bd0Var) {
        this.f49158b = v0Var;
        this.d = d2Var;
        this.f49159c = bd0Var;
    }

    @Override
    public final void run() {
        switch (this.f49157a) {
            case 0:
                v0 v0Var = this.f49158b;
                v0Var.getClass();
                this.d.dismiss();
                v0Var.presentFragment(this.f49159c);
                return;
            default:
                v0 v0Var2 = this.f49158b;
                bd0 bd0Var = this.f49159c;
                try {
                    List<Address> fromLocationName = new Geocoder(v0Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(v0Var2.f49229y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = v0Var2.f49229y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        bd0Var.f35484x0 = tL_channelLocation;
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                AndroidUtilities.runOnUIThread(new o0(v0Var2, this.d, bd0Var));
                return;
        }
    }

    public o0(v0 v0Var, bd0 bd0Var, d2 d2Var) {
        this.f49158b = v0Var;
        this.f49159c = bd0Var;
        this.d = d2Var;
    }
}
