package xh;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.h10;
import org.telegram.messenger.zi;
import org.telegram.ui.Cells.q1;
public final class j extends View {
    public final HashMap f58865a;
    public final ArrayList f58866b;
    public final ArrayList f58867c;
    public final int d;

    public j(Activity activity) {
        super(activity);
        this.f58865a = new HashMap();
        this.f58866b = new ArrayList();
        this.f58867c = new ArrayList();
        this.d = h10.f22829t0;
    }

    public static String b(q1 q1Var) {
        zi messageObject = q1Var.getMessageObject();
        if (messageObject == null) {
            return null;
        }
        return messageObject.x0() + "_" + messageObject.f1();
    }

    public final boolean a() {
        for (Map.Entry entry : this.f58865a.entrySet()) {
            if (!((h) entry.getValue()).P) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (drawable instanceof h) {
            invalidate();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        HashMap hashMap = this.f58865a;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((h) entry.getValue()).d();
        }
        hashMap.clear();
        this.f58866b.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        HashMap hashMap = this.f58865a;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((h) entry.getValue()).draw(canvas);
        }
        ArrayList arrayList = this.f58866b;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                h hVar = (h) hashMap.remove((String) obj);
                if (hVar != null) {
                    hVar.d();
                }
            }
            arrayList.clear();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        for (Map.Entry entry : this.f58865a.entrySet()) {
            ((h) entry.getValue()).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
