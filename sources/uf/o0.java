package uf;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.cd0;
public final class o0 implements Runnable {
    public final int f45468a = 0;
    public final v0 f45469b;
    public final cd0 f45470c;
    public final d2 d;

    public o0(v0 v0Var, d2 d2Var, cd0 cd0Var) {
        this.f45469b = v0Var;
        this.d = d2Var;
        this.f45470c = cd0Var;
    }

    @Override
    public final void run() {
        switch (this.f45468a) {
            case 0:
                v0 v0Var = this.f45469b;
                v0Var.getClass();
                this.d.dismiss();
                v0Var.presentFragment(this.f45470c);
                return;
            default:
                v0 v0Var2 = this.f45469b;
                cd0 cd0Var = this.f45470c;
                try {
                    List<Address> fromLocationName = new Geocoder(v0Var2.getParentActivity(), LocaleController.getInstance().getCurrentLocale()).getFromLocationName(v0Var2.f45532y, 1);
                    if (!fromLocationName.isEmpty()) {
                        Address address = fromLocationName.get(0);
                        TLRPC.TL_channelLocation tL_channelLocation = new TLRPC.TL_channelLocation();
                        tL_channelLocation.address = v0Var2.f45532y;
                        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                        tL_channelLocation.geo_point = tL_geoPoint;
                        tL_geoPoint.lat = address.getLatitude();
                        tL_channelLocation.geo_point._long = address.getLongitude();
                        cd0Var.f33114x0 = tL_channelLocation;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new o0(v0Var2, this.d, cd0Var));
                return;
        }
    }

    public o0(v0 v0Var, cd0 cd0Var, d2 d2Var) {
        this.f45469b = v0Var;
        this.f45470c = cd0Var;
        this.d = d2Var;
    }
}
