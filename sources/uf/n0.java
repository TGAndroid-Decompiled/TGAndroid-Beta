package uf;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ad0;
public final class n0 implements Runnable {
    public final int f45394a = 0;
    public final u0 f45395b;
    public final ad0 f45396c;
    public final d2 d;

    public n0(u0 u0Var, d2 d2Var, ad0 ad0Var) {
        this.f45395b = u0Var;
        this.d = d2Var;
        this.f45396c = ad0Var;
    }

    @Override
    public final void run() {
        switch (this.f45394a) {
            case 0:
                u0 u0Var = this.f45395b;
                u0Var.getClass();
                this.d.dismiss();
                u0Var.presentFragment(this.f45396c);
                return;
            default:
                u0 u0Var2 = this.f45395b;
                ad0 ad0Var = this.f45396c;
                try {
                    List<Address> fromLocationName = new Geocoder(u0Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(u0Var2.f45454y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = u0Var2.f45454y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        ad0Var.f32552x0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new n0(u0Var2, this.d, ad0Var));
                return;
        }
    }

    public n0(u0 u0Var, ad0 ad0Var, d2 d2Var) {
        this.f45395b = u0Var;
        this.f45396c = ad0Var;
        this.d = d2Var;
    }
}
