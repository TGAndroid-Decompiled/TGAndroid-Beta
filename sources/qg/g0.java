package qg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class g0 implements Runnable {
    public final int f44533a;
    public final ArrayList f44534b;

    public g0(ArrayList arrayList, int i10) {
        this.f44533a = i10;
        this.f44534b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f44533a) {
            case 0:
                m0.h = this.f44534b;
                m0.f44567i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                return;
            default:
                ArrayList arrayList = this.f44534b;
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
