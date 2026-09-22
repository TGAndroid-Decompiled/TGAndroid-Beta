package pg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class f0 implements Runnable {
    public final int f41170a;
    public final ArrayList f41171b;

    public f0(ArrayList arrayList, int i10) {
        this.f41170a = i10;
        this.f41171b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f41170a) {
            case 0:
                k0.h = this.f41171b;
                k0.f41205i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                return;
            default:
                ArrayList arrayList = this.f41171b;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((Bitmap) obj).recycle();
                }
                return;
        }
    }
}
