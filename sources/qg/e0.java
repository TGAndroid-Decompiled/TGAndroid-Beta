package qg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class e0 implements Runnable {
    public final int f44424a;
    public final ArrayList f44425b;

    public e0(ArrayList arrayList, int i10) {
        this.f44424a = i10;
        this.f44425b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f44424a) {
            case 0:
                j0.h = this.f44425b;
                j0.f44454i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                return;
            default:
                ArrayList arrayList = this.f44425b;
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
