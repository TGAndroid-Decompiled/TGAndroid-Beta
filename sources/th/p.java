package th;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.tz;
public abstract class p extends FrameLayout {
    public static final HashSet f49347b = new HashSet();
    public static boolean f49348c = false;
    public final boolean f49349a;

    public p(Context context) {
        super(context);
        boolean z10;
        if (tz.o() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49349a = z10;
    }

    public final void a(boolean z10) {
        f49348c = false;
        if (z10) {
            setLayerType(0, null);
        }
        HashSet hashSet = f49347b;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        hashSet.clear();
    }

    @Override
    public final void invalidate() {
        if (f49348c) {
            f49347b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (f49348c) {
            f49347b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
