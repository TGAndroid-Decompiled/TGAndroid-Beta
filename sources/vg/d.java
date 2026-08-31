package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import k7.o;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.as;
import org.telegram.ui.qj;
public final class d extends View implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public static final RectF E = new RectF();
    public ViewTreeObserver B;
    public boolean C;
    public TextPaint D;
    public final boolean f49271a;
    public final RectF f49272b;
    public final RectF f49273c;
    public long d;
    public int f49274e;
    public ViewGroup f49275f;
    public ViewGroup h;
    public long f49276n;
    public b f49277r;
    public long f49278s;
    public final ArrayList v;
    public final LongSparseArray f49279w;
    public final LongSparseArray f49280x;
    public final b f49281y;

    public d(Context context) {
        super(context);
        this.f49272b = new RectF();
        this.f49273c = new RectF();
        this.v = new ArrayList();
        this.f49279w = new LongSparseArray();
        this.f49280x = new LongSparseArray();
        this.f49281y = new b(this, 1);
        this.f49271a = SharedConfig.debugViewMetrics;
    }

    public final void a() {
        b bVar = this.f49277r;
        if (bVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar);
            this.f49277r = null;
        }
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_reportReadMetrics tL_messages_reportReadMetrics = new TLRPC.TL_messages_reportReadMetrics();
            tL_messages_reportReadMetrics.peer = MessagesController.getInstance(this.f49274e).getInputPeer(this.d);
            tL_messages_reportReadMetrics.metrics = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(this.f49274e).sendRequestTyped(tL_messages_reportReadMetrics, null, new as(2));
            arrayList.clear();
        }
    }

    public final void b(int i10, long j10, ViewGroup viewGroup, qj qjVar) {
        this.d = j10;
        this.f49274e = i10;
        this.f49275f = viewGroup;
        this.h = qjVar;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: vg.d.c():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49278s = 0L;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.B = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
        this.B.addOnGlobalLayoutListener(this);
        this.B.addOnScrollChangedListener(this);
        AndroidUtilities.runOnUIThread(this.f49281y, 400L);
        if (BuildVars.LOGS_ENABLED) {
            h5.a.n("ViewMetrics", "attach");
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.B;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.B.removeOnPreDrawListener(this);
            this.B.removeOnGlobalLayoutListener(this);
            this.B.removeOnScrollChangedListener(this);
        }
        this.B = null;
        this.f49278s = 0L;
        AndroidUtilities.cancelRunOnUIThread(this.f49281y);
        if (BuildVars.LOGS_ENABLED) {
            h5.a.n("ViewMetrics", "detach");
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int round;
        if (this.f49271a) {
            if (this.D == null) {
                TextPaint textPaint = new TextPaint(1);
                this.D = textPaint;
                textPaint.setColor(-16776961);
                this.D.setTextSize(AndroidUtilities.dp(10.0f));
            }
            super.onDraw(canvas);
            Paint paint = k6.Ll;
            RectF rectF = this.f49273c;
            canvas.drawRect(rectF, paint);
            LongSparseArray longSparseArray = this.f49279w;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = (c) longSparseArray.valueAt(i10);
                RectF rectF2 = cVar.f49262c;
                canvas.drawRect(rectF2, k6.Ml);
                canvas.save();
                canvas.translate(rectF2.left, o.a(o.a(rectF2.centerY() - AndroidUtilities.dp(20.0f), rectF.top - AndroidUtilities.dp(40.0f), rectF.bottom), rectF2.top, rectF2.bottom - AndroidUtilities.dp(40.0f)));
                canvas.drawRect(0.0f, 0.0f, rectF2.width(), AndroidUtilities.dp(40.0f), k6.Kl);
                canvas.translate(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(16.0f));
                canvas.save();
                canvas.drawText("time_in_view_ms: " + cVar.f49265g, 0.0f, 0.0f, this.D);
                canvas.translate(0.0f, (float) AndroidUtilities.dp(16.0f));
                canvas.drawText("active_time_in_view_ms: " + cVar.h, 0.0f, 0.0f, this.D);
                canvas.restore();
                canvas.save();
                canvas.translate(getWidth() / 2.0f, 0.0f);
                StringBuilder sb = new StringBuilder("height_to_viewport_ratio_permille: ");
                float f10 = cVar.f49268k;
                if (f10 == 0.0f) {
                    round = 1000;
                } else {
                    round = Math.round((cVar.f49267j / f10) * 1000.0f);
                }
                sb.append(round);
                canvas.drawText(sb.toString(), 0.0f, 0.0f, this.D);
                canvas.translate(0.0f, AndroidUtilities.dp(16.0f));
                canvas.drawText("seen_range_ratio_permille: " + cVar.b(), 0.0f, 0.0f, this.D);
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onGlobalLayout() {
        this.C = true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        RectF rectF = this.f49272b;
        this.f49273c.set(rectF.left, rectF.top, getMeasuredWidth() - rectF.right, getMeasuredHeight() - rectF.bottom);
    }

    @Override
    public final boolean onPreDraw() {
        if (this.C) {
            c();
            this.C = false;
            return true;
        }
        return true;
    }

    @Override
    public final void onScrollChanged() {
        this.C = true;
    }
}
