package uh;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Cells.u1;
public final class i extends View {
    public final HashMap f44089a;
    public final ArrayList f44090b;
    public final ArrayList f44091c;
    public final int d;

    public i(Activity activity) {
        super(activity);
        this.f44089a = new HashMap();
        this.f44090b = new ArrayList();
        this.f44091c = new ArrayList();
        this.d = UserConfig.selectedAccount;
    }

    public static String b(u1 u1Var) {
        MessageObject messageObject = u1Var.getMessageObject();
        if (messageObject == null) {
            return null;
        }
        return messageObject.getChatId() + "_" + messageObject.getId();
    }

    public final boolean a() {
        for (Map.Entry entry : this.f44089a.entrySet()) {
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
        HashMap hashMap = this.f44089a;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((h) entry.getValue()).d();
        }
        hashMap.clear();
        this.f44090b.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        HashMap hashMap = this.f44089a;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((h) entry.getValue()).draw(canvas);
        }
        ArrayList arrayList = this.f44090b;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                h hVar = (h) hashMap.remove((String) obj);
                if (hVar != null) {
                    hVar.d();
                }
            }
            arrayList.clear();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        for (Map.Entry entry : this.f44089a.entrySet()) {
            ((h) entry.getValue()).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
