package zg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import org.telegram.messenger.i0;
import org.telegram.messenger.tz;
import org.telegram.messenger.v2;
import org.telegram.messenger.vp;
import org.telegram.messenger.z1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.vj;
import w7.u;
public final class d extends View implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public static final RectF H = new RectF();
    public final b D;
    public ViewTreeObserver E;
    public boolean F;
    public TextPaint G;
    public final boolean f55731a;
    public final RectF f55732b;
    public final RectF f55733c;
    public long d;
    public int e;
    public ViewGroup f55734f;
    public ViewGroup h;
    public long f55735n;
    public b f55736r;
    public long f55737s;
    public final ArrayList f55738w;
    public final LongSparseArray f55739x;
    public final LongSparseArray f55740y;

    public d(Context context) {
        super(context);
        this.f55732b = new RectF();
        this.f55733c = new RectF();
        this.f55738w = new ArrayList();
        this.f55739x = new LongSparseArray();
        this.f55740y = new LongSparseArray();
        this.D = new b(this, 1);
        this.f55731a = tz.f18149g1;
    }

    public final void a() {
        b bVar = this.f55736r;
        if (bVar != null) {
            i0.r(bVar);
            this.f55736r = null;
        }
        ArrayList arrayList = this.f55738w;
        if (!arrayList.isEmpty()) {
            TLRPC.TL_messages_reportReadMetrics tL_messages_reportReadMetrics = new TLRPC.TL_messages_reportReadMetrics();
            tL_messages_reportReadMetrics.peer = vp.r1(this.e).i1(this.d);
            tL_messages_reportReadMetrics.metrics = new ArrayList<>(arrayList);
            ConnectionsManager.getInstance(this.e).sendRequestTyped(tL_messages_reportReadMetrics, null, new z1(5));
            arrayList.clear();
        }
    }

    public final void b(int i10, long j10, ViewGroup viewGroup, vj vjVar) {
        this.d = j10;
        this.e = i10;
        this.f55734f = viewGroup;
        this.h = vjVar;
    }

    public final void c() {
        throw new UnsupportedOperationException("Method not decompiled: zg.d.c():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f55737s = 0L;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.E = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
        this.E.addOnGlobalLayoutListener(this);
        this.E.addOnScrollChangedListener(this);
        i0.h3(this.D, 400L);
        if (v2.f18448a) {
            Log.d("ViewMetrics", "attach");
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.E.removeOnPreDrawListener(this);
            this.E.removeOnGlobalLayoutListener(this);
            this.E.removeOnScrollChangedListener(this);
        }
        this.E = null;
        this.f55737s = 0L;
        i0.r(this.D);
        if (v2.f18448a) {
            Log.d("ViewMetrics", "detach");
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int round;
        if (this.f55731a) {
            if (this.G == null) {
                TextPaint textPaint = new TextPaint(1);
                this.G = textPaint;
                textPaint.setColor(-16776961);
                this.G.setTextSize(i0.L(10.0f));
            }
            super.onDraw(canvas);
            Paint paint = t6.Fm;
            RectF rectF = this.f55733c;
            canvas.drawRect(rectF, paint);
            LongSparseArray longSparseArray = this.f55739x;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = (c) longSparseArray.valueAt(i10);
                RectF rectF2 = cVar.f55723c;
                canvas.drawRect(rectF2, t6.Gm);
                canvas.save();
                canvas.translate(rectF2.left, u.a(u.a(rectF2.centerY() - i0.L(20.0f), rectF.top - i0.L(40.0f), rectF.bottom), rectF2.top, rectF2.bottom - i0.L(40.0f)));
                canvas.drawRect(0.0f, 0.0f, rectF2.width(), i0.L(40.0f), t6.Em);
                canvas.translate(i0.L(10.0f), i0.L(16.0f));
                canvas.save();
                canvas.drawText("time_in_view_ms: " + cVar.f55725g, 0.0f, 0.0f, this.G);
                canvas.translate(0.0f, (float) i0.L(16.0f));
                canvas.drawText("active_time_in_view_ms: " + cVar.h, 0.0f, 0.0f, this.G);
                canvas.restore();
                canvas.save();
                canvas.translate(getWidth() / 2.0f, 0.0f);
                StringBuilder sb2 = new StringBuilder("height_to_viewport_ratio_permille: ");
                float f7 = cVar.f55728k;
                if (f7 == 0.0f) {
                    round = 1000;
                } else {
                    round = Math.round((cVar.f55727j / f7) * 1000.0f);
                }
                sb2.append(round);
                canvas.drawText(sb2.toString(), 0.0f, 0.0f, this.G);
                canvas.translate(0.0f, i0.L(16.0f));
                canvas.drawText("seen_range_ratio_permille: " + cVar.b(), 0.0f, 0.0f, this.G);
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onGlobalLayout() {
        this.F = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        RectF rectF = this.f55732b;
        this.f55733c.set(rectF.left, rectF.top, getMeasuredWidth() - rectF.right, getMeasuredHeight() - rectF.bottom);
    }

    @Override
    public final boolean onPreDraw() {
        if (this.F) {
            c();
            this.F = false;
            return true;
        }
        return true;
    }

    @Override
    public final void onScrollChanged() {
        this.F = true;
    }
}
