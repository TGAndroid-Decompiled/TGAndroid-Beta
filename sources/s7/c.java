package s7;

import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
public abstract class c {
    public abstract void onLocationResult(LocationResult locationResult);

    public void onLocationAvailability(LocationAvailability locationAvailability) {
    }
}
