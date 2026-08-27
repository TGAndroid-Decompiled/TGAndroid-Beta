package qf;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.tc0;

public final class p0 implements Runnable {

    public final int f46415a = 0;

    public final w0 f46416b;

    public final tc0 f46417c;
    public final b2 d;

    public p0(w0 w0Var, b2 b2Var, tc0 tc0Var) {
        this.f46416b = w0Var;
        this.d = b2Var;
        this.f46417c = tc0Var;
    }

    @Override
    public final void run() {
        switch (this.f46415a) {
            case 0:
                w0 w0Var = this.f46416b;
                w0Var.getClass();
                this.d.dismiss();
                w0Var.presentFragment(this.f46417c);
                break;
            default:
                w0 w0Var2 = this.f46416b;
                tc0 tc0Var = this.f46417c;
                try {
                    List<Address> fromLocationName = new Geocoder(w0Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(w0Var2.f46480y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = w0Var2.f46480y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        tc0Var.f42885w0 = tL_channelLocation;
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                AndroidUtilities.runOnUIThread(new p0(w0Var2, this.d, tc0Var));
                break;
        }
    }

    public p0(w0 w0Var, tc0 tc0Var, b2 b2Var) {
        this.f46416b = w0Var;
        this.f46417c = tc0Var;
        this.d = b2Var;
    }
}
