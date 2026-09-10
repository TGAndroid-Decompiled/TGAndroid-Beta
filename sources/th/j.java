package th;

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
import org.telegram.ui.Cells.t1;
public final class j extends View {
    public final HashMap f42239a;
    public final ArrayList f42240b;
    public final ArrayList f42241c;
    public final int d;

    public j(Activity activity) {
        super(activity);
        this.f42239a = new HashMap();
        this.f42240b = new ArrayList();
        this.f42241c = new ArrayList();
        this.d = UserConfig.selectedAccount;
    }

    public static String b(t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject == null) {
            return null;
        }
        return messageObject.getChatId() + "_" + messageObject.getId();
    }

    public final boolean a() {
        for (Map.Entry entry : this.f42239a.entrySet()) {
            if (!((i) entry.getValue()).O) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (drawable instanceof i) {
            invalidate();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        HashMap hashMap = this.f42239a;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((i) entry.getValue()).d();
        }
        hashMap.clear();
        this.f42240b.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        HashMap hashMap = this.f42239a;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((i) entry.getValue()).draw(canvas);
        }
        ArrayList arrayList = this.f42240b;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                i iVar = (i) hashMap.remove((String) obj);
                if (iVar != null) {
                    iVar.d();
                }
            }
            arrayList.clear();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        for (Map.Entry entry : this.f42239a.entrySet()) {
            ((i) entry.getValue()).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
