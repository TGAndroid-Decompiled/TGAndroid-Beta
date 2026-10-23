package qg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class g0 implements Runnable {
    public final int f44534a;
    public final ArrayList f44535b;

    public g0(ArrayList arrayList, int i10) {
        this.f44534a = i10;
        this.f44535b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f44534a) {
            case 0:
                m0.h = this.f44535b;
                m0.f44568i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                return;
            default:
                ArrayList arrayList = this.f44535b;
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
