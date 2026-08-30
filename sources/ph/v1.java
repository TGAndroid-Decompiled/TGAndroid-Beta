package ph;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g50;
import org.telegram.ui.cu;
public final class v1 extends t1 {
    public mg.h0 f42466i;
    public mg.h0 f42467j;
    public int f42468k;
    public final org.telegram.ui.Components.z5 f42469l;
    public Timer f42470m;
    public final nh.o8 f42471n;
    public final ArrayList f42472o;
    public final w1 f42473p;

    public v1(w1 w1Var) {
        super(w1Var);
        int i10;
        this.f42473p = w1Var;
        this.f42466i = new mg.h0(w1Var);
        this.f42467j = new mg.h0(w1Var);
        this.f42469l = new org.telegram.ui.Components.z5(w1Var);
        this.f42471n = new nh.o8(w1Var);
        this.f42472o = new ArrayList();
        this.f42323a = 3;
        this.f42324b = AndroidUtilities.dp(44.0f);
        this.f42325c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.g3) w1Var.f42499f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.f42472o.add(mg.q0.c(reactionsList.get(i11)));
        }
        Collections.sort(this.f42472o, new cu(16));
        if (!this.f42472o.isEmpty()) {
            this.f42466i.e((mg.q0) this.f42472o.get(this.f42468k));
        }
        this.f42469l.d(1.0f, true);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        float dp = f11 - AndroidUtilities.dp(4.0f);
        float f12 = this.f42324b;
        RectF rectF = this.f42326f;
        rectF.set((int) f10, (int) dp, (int) (f10 + f12), (int) (dp + f12));
        float a2 = this.f42327g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        nh.o8 o8Var = this.f42471n;
        o8Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        o8Var.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float dp2 = AndroidUtilities.dp(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - dp2), (int) (rectF.centerY() - dp2), (int) (rectF.centerX() + dp2), (int) (rectF.centerY() + dp2));
        float d = this.f42469l.d(1.0f, false);
        this.f42467j.c(rect);
        this.f42466i.c(rect);
        if (d == 1.0f) {
            this.f42466i.a(canvas);
        } else {
            canvas.save();
            float f13 = 1.0f - d;
            canvas.scale(f13, f13, rectF.centerX(), rectF.top);
            mg.h0 h0Var = this.f42467j;
            h0Var.h = f13;
            h0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            mg.h0 h0Var2 = this.f42466i;
            h0Var2.h = d;
            h0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z4) {
        this.f42466i.b(z4);
        this.f42467j.b(z4);
        Timer timer = this.f42470m;
        if (timer != null) {
            timer.cancel();
            this.f42470m = null;
        }
        if (z4) {
            Timer timer2 = new Timer();
            this.f42470m = timer2;
            timer2.schedule(new g50(this, 3), 2000L, 2000L);
        }
    }
}
