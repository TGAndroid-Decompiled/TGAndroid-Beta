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
public final class u1 extends s1 {
    public ng.h0 f46156i;
    public ng.h0 f46157j;
    public int f46158k;
    public final org.telegram.ui.Components.z5 f46159l;
    public Timer f46160m;
    public final oh.o8 f46161n;
    public final ArrayList f46162o;
    public final v1 f46163p;

    public u1(v1 v1Var) {
        super(v1Var);
        int i10;
        this.f46163p = v1Var;
        this.f46156i = new ng.h0(v1Var);
        this.f46157j = new ng.h0(v1Var);
        this.f46159l = new org.telegram.ui.Components.z5(v1Var);
        this.f46161n = new oh.o8(v1Var);
        this.f46162o = new ArrayList();
        this.f46088a = 3;
        this.f46089b = AndroidUtilities.dp(44.0f);
        this.f46090c = AndroidUtilities.dp(36.0f);
        i10 = ((org.telegram.ui.ActionBar.h3) v1Var.f46202f).currentAccount;
        List<TLRPC.TL_availableReaction> reactionsList = MediaDataController.getInstance(i10).getReactionsList();
        for (int i11 = 0; i11 < Math.min(reactionsList.size(), 8); i11++) {
            this.f46162o.add(ng.q0.c(reactionsList.get(i11)));
        }
        Collections.sort(this.f46162o, new du(16));
        if (!this.f46162o.isEmpty()) {
            this.f46156i.e((ng.q0) this.f46162o.get(this.f46158k));
        }
        this.f46159l.d(1.0f, true);
    }

    @Override
    public final void a(Canvas canvas, float f10, float f11) {
        float dp = f11 - AndroidUtilities.dp(4.0f);
        float f12 = this.f46089b;
        RectF rectF = this.f46092f;
        rectF.set((int) f10, (int) dp, (int) (f10 + f12), (int) (dp + f12));
        float a2 = this.f46093g.a(0.05f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        oh.o8 o8Var = this.f46161n;
        o8Var.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        o8Var.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float dp2 = AndroidUtilities.dp(30.0f) / 2.0f;
        rect.set((int) (rectF.centerX() - dp2), (int) (rectF.centerY() - dp2), (int) (rectF.centerX() + dp2), (int) (rectF.centerY() + dp2));
        float d = this.f46159l.d(1.0f, false);
        this.f46157j.c(rect);
        this.f46156i.c(rect);
        if (d == 1.0f) {
            this.f46156i.a(canvas);
        } else {
            canvas.save();
            float f13 = 1.0f - d;
            canvas.scale(f13, f13, rectF.centerX(), rectF.top);
            ng.h0 h0Var = this.f46157j;
            h0Var.h = f13;
            h0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d, d, rectF.centerX(), rectF.bottom);
            ng.h0 h0Var2 = this.f46156i;
            h0Var2.h = d;
            h0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override
    public final void b(boolean z4) {
        this.f46156i.b(z4);
        this.f46157j.b(z4);
        Timer timer = this.f46160m;
        if (timer != null) {
            timer.cancel();
            this.f46160m = null;
        }
        if (z4) {
            Timer timer2 = new Timer();
            this.f46160m = timer2;
            timer2.schedule(new i50(this, 3), 2000L, 2000L);
        }
    }
}
