package qg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class e0 implements Runnable {
    public final int f44451a;
    public final ArrayList f44452b;

    public e0(ArrayList arrayList, int i10) {
        this.f44451a = i10;
        this.f44452b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f44451a) {
            case 0:
                j0.h = this.f44452b;
                j0.f44481i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                return;
            default:
                ArrayList arrayList = this.f44452b;
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
