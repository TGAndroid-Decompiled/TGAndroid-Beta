package qh;

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
import org.telegram.ui.Components.i50;
import org.telegram.ui.du;
public final class v1 extends t1 {
    public ng.h0 f46180i;
    public ng.h0 f46181j;
    public int f46182k;
    public final org.telegram.ui.Components.z5 f46183l;
    public Timer f46184m;
    public final oh.o8 f46185n;
    public final ArrayList f46186o;
    public final w1 f46187p;

    public v1(w1 w1Var) {
        super(w1Var);
        int i10;
        this.f46187p = w1Var;
        this.f46180i = new ng.h0(w1Var);
        this.f46181j = new ng.h0(w1Var);
        this.f46183l = new org.telegram.ui.Components.z5(w1Var);
        this.f46185n = new oh.o8(w1Var);
        this.f46186o = new ArrayList();
        this.f46108a = 3;
        this.f46109b = AndroidUtilities.dp(44.0f);
        this.f46110c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.h3) w1Var.f46219f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.f46186o.add(ng.q0.c(reactionsList.get(i11)));
        }
        Collections.sort(this.f46186o, new du(16));
        if (!this.f46186o.isEmpty()) {
            this.f46180i.e((ng.q0) this.f46186o.get(this.f46182k));
        }
        this.f46183l.d(1.0f, true);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        float dp = f11 - AndroidUtilities.dp(4.0f);
        float f12 = this.f46109b;
        RectF rectF = this.f46112f;
        rectF.set((int) f10, (int) dp, (int) (f10 + f12), (int) (dp + f12));
        float a2 = this.f46113g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        oh.o8 o8Var = this.f46185n;
        o8Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        o8Var.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float dp2 = AndroidUtilities.dp(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - dp2), (int) (rectF.centerY() - dp2), (int) (rectF.centerX() + dp2), (int) (rectF.centerY() + dp2));
        float d = this.f46183l.d(1.0f, false);
        this.f46181j.c(rect);
        this.f46180i.c(rect);
        if (d == 1.0f) {
            this.f46180i.a(canvas);
        } else {
            canvas.save();
            float f13 = 1.0f - d;
            canvas.scale(f13, f13, rectF.centerX(), rectF.top);
            ng.h0 h0Var = this.f46181j;
            h0Var.h = f13;
            h0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            ng.h0 h0Var2 = this.f46180i;
            h0Var2.h = d;
            h0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z4) {
        this.f46180i.b(z4);
        this.f46181j.b(z4);
        Timer timer = this.f46184m;
        if (timer != null) {
            timer.cancel();
            this.f46184m = null;
        }
        if (z4) {
            Timer timer2 = new Timer();
            this.f46184m = timer2;
            timer2.schedule(new i50(this, 3), 2000L, 2000L);
        }
    }
}
