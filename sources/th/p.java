package th;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.uz;
public abstract class p extends FrameLayout {
    public static final HashSet f49361b = new HashSet();
    public static boolean f49362c = false;
    public final boolean f49363a;

    public p(Context context) {
        super(context);
        boolean z10;
        if (uz.o() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49363a = z10;
    }

    public final void a(boolean z10) {
        f49362c = false;
        if (z10) {
            setLayerType(0, null);
        }
        HashSet hashSet = f49361b;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        hashSet.clear();
    }

    @Override
    public final void invalidate() {
        if (f49362c) {
            f49361b.add(this);
        } else {
            super.invalidate();
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (f49362c) {
            f49361b.add(this);
        } else {
            super.invalidate(i10, i11, i12, i13);
        }
    }
}
