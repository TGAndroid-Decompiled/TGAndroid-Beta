package qg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class e0 implements Runnable {
    public final int f43173a;
    public final ArrayList f43174b;

    public e0(ArrayList arrayList, int i10) {
        this.f43173a = i10;
        this.f43174b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f43173a) {
            case 0:
                j0.h = this.f43174b;
                j0.f43201i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                return;
            default:
                ArrayList arrayList = this.f43174b;
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
