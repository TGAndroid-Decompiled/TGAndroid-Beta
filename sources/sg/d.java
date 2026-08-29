package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import i7.w;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ur;
import org.telegram.ui.lj;
public final class d extends View implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public static final RectF D = new RectF();
    public ViewTreeObserver A;
    public boolean B;
    public TextPaint C;
    public final boolean f48036a;
    public final RectF f48037b;
    public final RectF f48038c;
    public long d;
    public int f48039e;
    public ViewGroup f48040f;
    public ViewGroup h;
    public long f48041n;
    public b f48042r;
    public long f48043s;
    public final ArrayList v;
    public final LongSparseArray f48044w;
    public final LongSparseArray f48045x;
    public final b f48046y;

    public d(Context context) {
        super(context);
        this.f48037b = new RectF();
        this.f48038c = new RectF();
        this.v = new ArrayList();
        this.f48044w = new LongSparseArray();
        this.f48045x = new LongSparseArray();
        this.f48046y = new b(this, 1);
        this.f48036a = SharedConfig.debugViewMetrics;
    }

    public final void a() {
        b bVar = this.f48042r;
        if (bVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar);
            this.f48042r = null;
        }
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_reportReadMetrics tL_messages_reportReadMetrics = new TLRPC.TL_messages_reportReadMetrics();
            tL_messages_reportReadMetrics.peer = MessagesController.getInstance(this.f48039e).getInputPeer(this.d);
            tL_messages_reportReadMetrics.metrics = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(this.f48039e).sendRequestTyped(tL_messages_reportReadMetrics, null, new ur(2));
            arrayList.clear();
        }
    }

    public final void b(int i10, long j10, ViewGroup viewGroup, lj ljVar) {
        this.d = j10;
        this.f48039e = i10;
        this.f48040f = viewGroup;
        this.h = ljVar;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: sg.d.c():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48043s = 0L;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.A = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
        this.A.addOnGlobalLayoutListener(this);
        this.A.addOnScrollChangedListener(this);
        AndroidUtilities.runOnUIThread(this.f48046y, 400L);
        if (BuildVars.LOGS_ENABLED) {
            f5.a.n("ViewMetrics", "attach");
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
        this.f48043s = 0L;
        AndroidUtilities.cancelRunOnUIThread(this.f48046y);
        if (BuildVars.LOGS_ENABLED) {
            f5.a.n("ViewMetrics", "detach");
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int round;
        if (this.f48036a) {
            if (this.C == null) {
                TextPaint textPaint = new TextPaint(1);
                this.C = textPaint;
                textPaint.setColor(-16776961);
                this.C.setTextSize(AndroidUtilities.dp(10.0f));
            }
            super.onDraw(canvas);
            Paint paint = g6.Ll;
            RectF rectF = this.f48038c;
            canvas.drawRect(rectF, paint);
            LongSparseArray longSparseArray = this.f48044w;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = (c) longSparseArray.valueAt(i10);
                RectF rectF2 = cVar.f48027c;
                canvas.drawRect(rectF2, g6.Ml);
                canvas.save();
                canvas.translate(rectF2.left, w.a(w.a(rectF2.centerY() - AndroidUtilities.dp(20.0f), rectF.top - AndroidUtilities.dp(40.0f), rectF.bottom), rectF2.top, rectF2.bottom - AndroidUtilities.dp(40.0f)));
                canvas.drawRect(0.0f, 0.0f, rectF2.width(), AndroidUtilities.dp(40.0f), g6.Kl);
                canvas.translate(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(16.0f));
                canvas.save();
                canvas.drawText("time_in_view_ms: " + cVar.f48030g, 0.0f, 0.0f, this.C);
                canvas.translate(0.0f, (float) AndroidUtilities.dp(16.0f));
                canvas.drawText("active_time_in_view_ms: " + cVar.h, 0.0f, 0.0f, this.C);
                canvas.restore();
                canvas.save();
                canvas.translate(getWidth() / 2.0f, 0.0f);
                StringBuilder sb2 = new StringBuilder("height_to_viewport_ratio_permille: ");
                float f9 = cVar.f48033k;
                if (f9 == 0.0f) {
                    round = 1000;
                } else {
                    round = Math.round((cVar.f48032j / f9) * 1000.0f);
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        RectF rectF = this.f48037b;
        this.f48038c.set(rectF.left, rectF.top, getMeasuredWidth() - rectF.right, getMeasuredHeight() - rectF.bottom);
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
