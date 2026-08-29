package sf;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.rc0;
public final class o0 implements Runnable {
    public final int f47910a = 0;
    public final v0 f47911b;
    public final rc0 f47912c;
    public final c2 d;

    public o0(v0 v0Var, c2 c2Var, rc0 rc0Var) {
        this.f47911b = v0Var;
        this.d = c2Var;
        this.f47912c = rc0Var;
    }

    @Override
    public final void run() {
        switch (this.f47910a) {
            case 0:
                v0 v0Var = this.f47911b;
                v0Var.getClass();
                this.d.dismiss();
                v0Var.presentFragment(this.f47912c);
                return;
            default:
                v0 v0Var2 = this.f47911b;
                rc0 rc0Var = this.f47912c;
                try {
                    List<Address> fromLocationName = new Geocoder(v0Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(v0Var2.f47979y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = v0Var2.f47979y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        rc0Var.f42062w0 = tL_channelLocation;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                AndroidUtilities.runOnUIThread(new o0(v0Var2, this.d, rc0Var));
                return;
        }
    }

    public o0(v0 v0Var, rc0 rc0Var, c2 c2Var) {
        this.f47911b = v0Var;
        this.f47912c = rc0Var;
        this.d = c2Var;
    }
}
