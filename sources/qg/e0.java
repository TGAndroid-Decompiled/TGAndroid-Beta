package qg;

import android.graphics.Bitmap;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
public final class e0 implements Runnable {
    public final int f43431a;
    public final ArrayList f43432b;

    public e0(ArrayList arrayList, int i10) {
        this.f43431a = i10;
        this.f43432b = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f43431a) {
            case 0:
                j0.h = this.f43432b;
                j0.f43459i = false;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.customTypefacesLoaded, new Object[0]);
                return;
            default:
                ArrayList arrayList = this.f43432b;
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
