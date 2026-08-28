package pg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import g7.n;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.ij;
public final class d extends View implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public static final RectF D = new RectF();
    public ViewTreeObserver A;
    public boolean B;
    public TextPaint C;
    public final boolean f45856a;
    public final RectF f45857b;
    public final RectF f45858c;
    public long d;
    public int f45859e;
    public ViewGroup f45860f;
    public ViewGroup h;
    public long f45861n;
    public b f45862r;
    public long f45863s;
    public final ArrayList v;
    public final LongSparseArray f45864w;
    public final LongSparseArray f45865x;
    public final b f45866y;

    public d(Context context) {
        super(context);
        this.f45857b = new RectF();
        this.f45858c = new RectF();
        this.v = new ArrayList();
        this.f45864w = new LongSparseArray();
        this.f45865x = new LongSparseArray();
        this.f45866y = new b(this, 1);
        this.f45856a = SharedConfig.debugViewMetrics;
    }

    public final void a() {
        b bVar = this.f45862r;
        if (bVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar);
            this.f45862r = null;
        }
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_reportReadMetrics tL_messages_reportReadMetrics = new TLRPC.TL_messages_reportReadMetrics();
            tL_messages_reportReadMetrics.peer = MessagesController.getInstance(this.f45859e).getInputPeer(this.d);
            tL_messages_reportReadMetrics.metrics = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(this.f45859e).sendRequestTyped(tL_messages_reportReadMetrics, null, new qr(2));
            arrayList.clear();
        }
    }

    public final void b(int i9, long j10, ViewGroup viewGroup, ij ijVar) {
        this.d = j10;
        this.f45859e = i9;
        this.f45860f = viewGroup;
        this.h = ijVar;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: pg.d.c():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45863s = 0L;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.A = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
        this.A.addOnGlobalLayoutListener(this);
        this.A.addOnScrollChangedListener(this);
        AndroidUtilities.runOnUIThread(this.f45866y, 400L);
        if (BuildVars.LOGS_ENABLED) {
            d5.a.n("ViewMetrics", "attach");
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.A;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.A.removeOnPreDrawListener(this);
            this.A.removeOnGlobalLayoutListener(this);
            this.A.removeOnScrollChangedListener(this);
        }
        this.A = null;
        this.f45863s = 0L;
        AndroidUtilities.cancelRunOnUIThread(this.f45866y);
        if (BuildVars.LOGS_ENABLED) {
            d5.a.n("ViewMetrics", "detach");
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int round;
        if (this.f45856a) {
            if (this.C == null) {
                TextPaint textPaint = new TextPaint(1);
                this.C = textPaint;
                textPaint.setColor(-16776961);
                this.C.setTextSize(AndroidUtilities.dp(10.0f));
            }
            super.onDraw(canvas);
            Paint paint = f6.Ll;
            RectF rectF = this.f45858c;
            canvas.drawRect(rectF, paint);
            LongSparseArray longSparseArray = this.f45864w;
            int size = longSparseArray.size();
            for (int i9 = 0; i9 < size; i9++) {
                c cVar = (c) longSparseArray.valueAt(i9);
                RectF rectF2 = cVar.f45847c;
                canvas.drawRect(rectF2, f6.Ml);
                canvas.save();
                canvas.translate(rectF2.left, n.a(n.a(rectF2.centerY() - AndroidUtilities.dp(20.0f), rectF.top - AndroidUtilities.dp(40.0f), rectF.bottom), rectF2.top, rectF2.bottom - AndroidUtilities.dp(40.0f)));
                canvas.drawRect(0.0f, 0.0f, rectF2.width(), AndroidUtilities.dp(40.0f), f6.Kl);
                canvas.translate(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(16.0f));
                canvas.save();
                canvas.drawText("time_in_view_ms: " + cVar.f45850g, 0.0f, 0.0f, this.C);
                canvas.translate(0.0f, (float) AndroidUtilities.dp(16.0f));
                canvas.drawText("active_time_in_view_ms: " + cVar.h, 0.0f, 0.0f, this.C);
                canvas.restore();
                canvas.save();
                canvas.translate(getWidth() / 2.0f, 0.0f);
                StringBuilder sb2 = new StringBuilder("height_to_viewport_ratio_permille: ");
                float f10 = cVar.f45853k;
                if (f10 == 0.0f) {
                    round = 1000;
                } else {
                    round = Math.round((cVar.f45852j / f10) * 1000.0f);
                }
                sb2.append(round);
                canvas.drawText(sb2.toString(), 0.0f, 0.0f, this.C);
                canvas.translate(0.0f, AndroidUtilities.dp(16.0f));
                canvas.drawText("seen_range_ratio_permille: " + cVar.b(), 0.0f, 0.0f, this.C);
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onGlobalLayout() {
        this.B = true;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        RectF rectF = this.f45857b;
        this.f45858c.set(rectF.left, rectF.top, getMeasuredWidth() - rectF.right, getMeasuredHeight() - rectF.bottom);
    }

    @Override
    public final boolean onPreDraw() {
        if (this.B) {
            c();
            this.B = false;
            return true;
        }
        return true;
    }

    @Override
    public final void onScrollChanged() {
        this.B = true;
    }
}
