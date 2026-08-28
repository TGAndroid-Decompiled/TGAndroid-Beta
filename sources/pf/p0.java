package pf;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.pc0;
public final class p0 implements Runnable {
    public final int f45746a = 0;
    public final w0 f45747b;
    public final pc0 f45748c;
    public final c2 d;

    public p0(w0 w0Var, c2 c2Var, pc0 pc0Var) {
        this.f45747b = w0Var;
        this.d = c2Var;
        this.f45748c = pc0Var;
    }

    @Override
    public final void run() {
        switch (this.f45746a) {
            case 0:
                w0 w0Var = this.f45747b;
                w0Var.getClass();
                this.d.dismiss();
                w0Var.presentFragment(this.f45748c);
                return;
            default:
                w0 w0Var2 = this.f45747b;
                pc0 pc0Var = this.f45748c;
                try {
                    List<Address> fromLocationName = new Geocoder(w0Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(w0Var2.f45812y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = w0Var2.f45812y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        pc0Var.f41471w0 = tL_channelLocation;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                AndroidUtilities.runOnUIThread(new p0(w0Var2, this.d, pc0Var));
                return;
        }
    }

    public p0(w0 w0Var, pc0 pc0Var, c2 c2Var) {
        this.f45747b = w0Var;
        this.f45748c = pc0Var;
        this.d = c2Var;
    }
}
