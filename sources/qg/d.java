package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextPaint;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import h7.n;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.or;
import org.telegram.ui.kj;

public final class d extends View implements ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    public static final RectF D = new RectF();
    public ViewTreeObserver A;
    public boolean B;
    public TextPaint C;

    public final boolean f46524a;

    public final RectF f46525b;

    public final RectF f46526c;
    public long d;

    public int f46527e;

    public ViewGroup f46528f;
    public ViewGroup h;

    public long f46529n;

    public b f46530r;

    public long f46531s;
    public final ArrayList v;

    public final LongSparseArray f46532w;

    public final LongSparseArray f46533x;

    public final b f46534y;

    public d(Context context) {
        super(context);
        this.f46525b = new RectF();
        this.f46526c = new RectF();
        this.v = new ArrayList();
        this.f46532w = new LongSparseArray();
        this.f46533x = new LongSparseArray();
        this.f46534y = new b(this, 1);
        this.f46524a = SharedConfig.debugViewMetrics;
    }

    public final void a() {
        b bVar = this.f46530r;
        if (bVar != null) {
            AndroidUtilities.cancelRunOnUIThread(bVar);
            this.f46530r = null;
        }
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty()) {
            return;
        }
        TLRPC.TL_messages_reportReadMetrics tL_messages_reportReadMetrics = new TLRPC.TL_messages_reportReadMetrics();
        tL_messages_reportReadMetrics.peer = MessagesController.getInstance(this.f46527e).getInputPeer(this.d);
        tL_messages_reportReadMetrics.metrics = new ArrayList<>(arrayList);
        ConnectionsManager.getInstance(this.f46527e).sendRequestTyped(tL_messages_reportReadMetrics, null, new or(2));
        arrayList.clear();
    }

    public final void b(int i10, long j10, ViewGroup viewGroup, kj kjVar) {
        this.d = j10;
        this.f46527e = i10;
        this.f46528f = viewGroup;
        this.h = kjVar;
    }

    public final void c() {
        String str;
        LongSparseArray longSparseArray;
        ArrayList arrayList;
        boolean z10;
        long j10;
        boolean z11;
        String str2;
        boolean z12;
        RectF rectF;
        MessageObject messageObject;
        int i10;
        RectF rectF2;
        long j11;
        if (this.f46528f == null || this.h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j12 = this.f46531s;
        long j13 = 0;
        long j14 = j12 == 0 ? 0L : jUptimeMillis - j12;
        this.f46531s = jUptimeMillis;
        LongSparseArray longSparseArray2 = this.f46533x;
        int size = longSparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((RectF) longSparseArray2.valueAt(i11)).set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        int childCount = this.h.getChildCount();
        int i12 = 0;
        while (true) {
            str = "ViewMetrics";
            longSparseArray = this.f46532w;
            if (i12 >= childCount) {
                break;
            }
            View childAt = this.h.getChildAt(i12);
            long j15 = j13;
            ViewGroup viewGroup = this.f46528f;
            RectF rectF3 = D;
            if (j.c(childAt, viewGroup, rectF3)) {
                if (childAt instanceof s1) {
                    messageObject = ((s1) childAt).getMessageObject();
                } else if (childAt instanceof v0) {
                    messageObject = ((v0) childAt).getMessageObject();
                } else {
                    i10 = i12;
                }
                if (messageObject == null) {
                    i10 = i12;
                } else {
                    long dialogId = messageObject.getDialogId();
                    i10 = i12;
                    if (dialogId == this.d) {
                        int id2 = messageObject.getId();
                        long groupId = messageObject.getGroupId();
                        if (dialogId != j15 && id2 > 0) {
                            long j16 = id2;
                            c cVar = (c) longSparseArray.get(j16);
                            if (cVar == null) {
                                rectF2 = rectF3;
                                j11 = groupId;
                                cVar = new c(id2, j11);
                                longSparseArray.put(j16, cVar);
                                if (BuildVars.LOGS_ENABLED) {
                                    d5.a.n("ViewMetrics", id2 + " " + j11 + " in screen");
                                }
                            } else {
                                rectF2 = rectF3;
                                j11 = groupId;
                            }
                            RectF rectF4 = cVar.f46515c;
                            rectF4.set(rectF2);
                            if (j11 != j15) {
                                RectF rectF5 = (RectF) longSparseArray2.get(j11);
                                if (rectF5 == null) {
                                    rectF5 = new RectF();
                                    longSparseArray2.put(j11, rectF5);
                                }
                                rectF5.union(rectF4);
                            }
                            cVar.f46516e = jUptimeMillis;
                        }
                    }
                }
            } else {
                i10 = i12;
            }
            i12 = i10 + 1;
            j13 = j15;
        }
        long j17 = j13;
        for (int size2 = longSparseArray2.size() - 1; size2 >= 0; size2--) {
            if (((RectF) longSparseArray2.valueAt(size2)).isEmpty()) {
                longSparseArray2.removeAt(size2);
            }
        }
        int size3 = longSparseArray.size();
        for (int i13 = 0; i13 < size3; i13++) {
            c cVar2 = (c) longSparseArray.valueAt(i13);
            long j18 = cVar2.f46514b;
            if (j18 != j17 && (rectF = (RectF) longSparseArray2.get(j18)) != null) {
                cVar2.f46515c.set(rectF);
            }
        }
        int size4 = longSparseArray.size() - 1;
        while (true) {
            arrayList = this.v;
            if (size4 < 0) {
                break;
            }
            c cVar3 = (c) longSparseArray.valueAt(size4);
            int i14 = cVar3.f46513a;
            LongSparseArray longSparseArray3 = longSparseArray2;
            long j19 = cVar3.f46514b;
            RectF rectF6 = cVar3.f46515c;
            long j20 = j14;
            long j21 = i14;
            RectF rectF7 = j19 != j17 ? (RectF) longSparseArray3.get(j19) : null;
            long j22 = cVar3.f46516e;
            RectF rectF8 = this.f46526c;
            if (j22 != jUptimeMillis && rectF7 == null) {
                z10 = false;
            } else if (RectF.intersects(rectF8, rectF7 != null ? rectF7 : rectF6)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                z11 = z10;
                String str3 = str;
                if (cVar3.f46517f != j17) {
                    cVar3.f46518g += j20;
                    if (jUptimeMillis - this.f46529n < 15000) {
                        cVar3.h += j20;
                    }
                }
                cVar3.f46517f = jUptimeMillis;
                float fHeight = rectF6.height();
                j10 = jUptimeMillis;
                float f10 = rectF8.top - rectF6.top;
                float f11 = fHeight - (rectF6.bottom - rectF8.bottom);
                cVar3.f46522l = Math.min(cVar3.f46522l, n.a(f10, 0.0f, fHeight));
                cVar3.f46523m = Math.max(cVar3.f46523m, n.a(f11, 0.0f, fHeight));
                cVar3.f46521k = Math.max(cVar3.f46521k, rectF8.height());
                cVar3.f46520j = Math.max(cVar3.f46520j, fHeight);
                if (cVar3.f46519i || cVar3.f46518g <= 300) {
                    str2 = str3;
                } else {
                    if (BuildVars.LOGS_ENABLED) {
                        str2 = str3;
                        d5.a.n(str2, j21 + " " + j19 + " in viewport");
                    } else {
                        str2 = str3;
                    }
                    cVar3.f46519i = true;
                }
            } else {
                j10 = jUptimeMillis;
                z11 = z10;
                str2 = str;
            }
            if (z11 || cVar3.f46518g <= j17) {
                z12 = cVar3.f46519i;
                if (!z12 && cVar3.f46518g > 300000) {
                    arrayList.add(cVar3.a());
                    longSparseArray.removeAt(size4);
                    if (BuildVars.LOGS_ENABLED) {
                        d5.a.n(str2, j21 + " " + j19 + " out of time");
                    }
                } else if (z12 && cVar3.f46516e != j10 && (j19 == j17 || rectF7 == null)) {
                    longSparseArray.removeAt(size4);
                    if (BuildVars.LOGS_ENABLED) {
                        d5.a.n(str2, j21 + " " + j19 + " out of screen");
                    }
                }
            } else {
                String str4 = str2;
                if (j10 - 300 > cVar3.f46517f) {
                    if (cVar3.f46519i) {
                        arrayList.add(cVar3.a());
                    }
                    longSparseArray.removeAt(size4);
                    if (BuildVars.LOGS_ENABLED) {
                        str2 = str4;
                        d5.a.n(str2, j21 + " " + j19 + " out of viewport: " + cVar3.f46518g);
                    } else {
                        str2 = str4;
                    }
                } else {
                    str2 = str4;
                    z12 = cVar3.f46519i;
                    if (!z12) {
                        if (z12) {
                        }
                    } else if (z12) {
                    }
                }
            }
            size4--;
            str = str2;
            j14 = j20;
            longSparseArray2 = longSparseArray3;
            jUptimeMillis = j10;
        }
        if (!arrayList.isEmpty() && this.f46530r == null) {
            b bVar = new b(this, 0);
            this.f46530r = bVar;
            AndroidUtilities.runOnUIThread(bVar, 5000L);
        }
        if (this.f46524a) {
            invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46531s = 0L;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        this.A = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
        this.A.addOnGlobalLayoutListener(this);
        this.A.addOnScrollChangedListener(this);
        AndroidUtilities.runOnUIThread(this.f46534y, 400L);
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
        this.f46531s = 0L;
        AndroidUtilities.cancelRunOnUIThread(this.f46534y);
        if (BuildVars.LOGS_ENABLED) {
            d5.a.n("ViewMetrics", "detach");
        }
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f46524a) {
            if (this.C == null) {
                TextPaint textPaint = new TextPaint(1);
                this.C = textPaint;
                textPaint.setColor(-16776961);
                this.C.setTextSize(AndroidUtilities.dp(10.0f));
            }
            super.onDraw(canvas);
            Paint paint = g6.Ll;
            RectF rectF = this.f46526c;
            canvas.drawRect(rectF, paint);
            LongSparseArray longSparseArray = this.f46532w;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = (c) longSparseArray.valueAt(i10);
                RectF rectF2 = cVar.f46515c;
                canvas.drawRect(rectF2, g6.Ml);
                canvas.save();
                canvas.translate(rectF2.left, n.a(n.a(rectF2.centerY() - AndroidUtilities.dp(20.0f), rectF.top - AndroidUtilities.dp(40.0f), rectF.bottom), rectF2.top, rectF2.bottom - AndroidUtilities.dp(40.0f)));
                canvas.drawRect(0.0f, 0.0f, rectF2.width(), AndroidUtilities.dp(40.0f), g6.Kl);
                canvas.translate(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(16.0f));
                canvas.save();
                canvas.drawText("time_in_view_ms: " + cVar.f46518g, 0.0f, 0.0f, this.C);
                canvas.translate(0.0f, (float) AndroidUtilities.dp(16.0f));
                canvas.drawText("active_time_in_view_ms: " + cVar.h, 0.0f, 0.0f, this.C);
                canvas.restore();
                canvas.save();
                canvas.translate(getWidth() / 2.0f, 0.0f);
                StringBuilder sb2 = new StringBuilder("height_to_viewport_ratio_permille: ");
                float f10 = cVar.f46521k;
                sb2.append(f10 == 0.0f ? 1000 : Math.round((cVar.f46520j / f10) * 1000.0f));
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
        RectF rectF = this.f46525b;
        this.f46526c.set(rectF.left, rectF.top, getMeasuredWidth() - rectF.right, getMeasuredHeight() - rectF.bottom);
    }

    @Override
    public final boolean onPreDraw() {
        if (!this.B) {
            return true;
        }
        c();
        this.B = false;
        return true;
    }

    @Override
    public final void onScrollChanged() {
        this.B = true;
    }
}
