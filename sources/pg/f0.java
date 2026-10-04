package pg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class f0 implements Runnable {
    public final int f44475a;
    public final ArrayList f44476b;

    public f0(ArrayList arrayList, int i10) {
        this.f44475a = i10;
        this.f44476b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f44475a) {
            case 0:
                k0.h = this.f44476b;
                k0.f44513i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                return;
            default:
                ArrayList arrayList = this.f44476b;
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
