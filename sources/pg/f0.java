package pg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class f0 implements Runnable {
    public final int f41119a;
    public final ArrayList f41120b;

    public f0(ArrayList arrayList, int i10) {
        this.f41119a = i10;
        this.f41120b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f41119a) {
            case 0:
                k0.h = this.f41120b;
                k0.f41154i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                return;
            default:
                ArrayList arrayList = this.f41120b;
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
