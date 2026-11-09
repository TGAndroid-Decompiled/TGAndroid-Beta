package wh;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.ui.Cells.q1;
public final class i extends View {
    public final HashMap f57922a;
    public final ArrayList f57923b;
    public final ArrayList f57924c;
    public final int d;

    public i(Activity activity) {
        super(activity);
        this.f57922a = new HashMap();
        this.f57923b = new ArrayList();
        this.f57924c = new ArrayList();
        this.d = p10.f24470s0;
    }

    public static String b(q1 q1Var) {
        ij messageObject = q1Var.getMessageObject();
        if (messageObject == null) {
            return null;
        }
        return messageObject.x0() + "_" + messageObject.e1();
    }

    public final boolean a() {
        for (Map.Entry entry : this.f57922a.entrySet()) {
            if (!((h) entry.getValue()).O) {
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
        HashMap hashMap = this.f57922a;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((h) entry.getValue()).d();
        }
        hashMap.clear();
        this.f57923b.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        HashMap hashMap = this.f57922a;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((h) entry.getValue()).draw(canvas);
        }
        ArrayList arrayList = this.f57923b;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                h hVar = (h) hashMap.remove((String) obj);
                if (hVar != null) {
                    hVar.d();
                }
            }
            arrayList.clear();
        }
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        for (Map.Entry entry : this.f57922a.entrySet()) {
            ((h) entry.getValue()).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
