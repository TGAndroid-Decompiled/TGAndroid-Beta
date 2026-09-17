package pg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class e0 implements Runnable {
    public final int f40880a;
    public final ArrayList f40881b;

    public e0(ArrayList arrayList, int i10) {
        this.f40880a = i10;
        this.f40881b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f40880a) {
            case 0:
                j0.h = this.f40881b;
                j0.f40908i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                return;
            default:
                ArrayList arrayList = this.f40881b;
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
