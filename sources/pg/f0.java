package pg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class f0 implements Runnable {
    public final int f41120a;
    public final ArrayList f41121b;

    public f0(ArrayList arrayList, int i10) {
        this.f41120a = i10;
        this.f41121b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f41120a) {
            case 0:
                k0.h = this.f41121b;
                k0.f41155i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                return;
            default:
                ArrayList arrayList = this.f41121b;
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
