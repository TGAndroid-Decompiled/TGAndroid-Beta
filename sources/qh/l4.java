package qh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import g7.e6;
import g7.g6;
import g7.v6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.y5;
public final class l4 extends y implements org.telegram.ui.ActionBar.w5, m9, i0 {
    public static Paint f46502g0;
    public final ArrayList A;
    public final ArrayList B;
    public final ArrayList C;
    public final boolean D;
    public final ng.d E;
    public final za.a F;
    public final ArrayList G;
    public final HashMap H;
    public dh.k I;
    public h3 J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public final y5 Q;
    public int R;
    public int S;
    public float T;
    public boolean U;
    public float V;
    public float W;
    public int f46503a0;
    public int f46504b0;
    public int f46505c0;
    public VelocityTracker f46506d0;
    public ValueAnimator f46507e0;
    public final Path f46508f0;
    public final b6 f46509n;
    public final Paint f46510r;
    public final Paint f46511s;
    public final h0 v;
    public final ImageView f46512w;
    public final ImageView f46513x;
    public final ArrayList f46514y;

    public l4(Context context, b6 b6Var) {
        super(context);
        boolean z10;
        this.f46510r = new Paint(1);
        this.f46511s = new Paint(1);
        this.f46514y = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 31 && SharedConfig.chatBlurEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z10;
        this.G = new ArrayList();
        this.H = new HashMap();
        this.P = -1;
        this.Q = new y5(this, 0L, 320L, gr.h);
        this.f46508f0 = new Path();
        this.f46509n = b6Var;
        setWillNotDraw(false);
        g(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(4.0f));
        h0 h0Var = new h0(context, b6Var, new n5.e0(this, 19));
        this.v = h0Var;
        addView(h0Var.f46409a, e6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        if (z10 && i9 >= 31) {
            ng.d dVar = new ng.d(new ng.c());
            this.E = dVar;
            dVar.f(AndroidUtilities.dp(24.0f));
            this.F = new za.a(21);
        }
        ImageView h = h();
        this.f46512w = h;
        h.setImageResource(R.drawable.iv_media_add);
        addView(h, e6.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        h.setOnClickListener(new i4(this, 1));
        ImageView h10 = h();
        this.f46513x = h10;
        h10.setVisibility(8);
        addView(h10, e6.d(32, 32.0f, 53, 12.0f, 12.0f, 66.0f, 12.0f));
        h10.setOnClickListener(new i4(this, 2));
        d();
    }

    private dh.k getSpoilerEffect() {
        if (!this.K) {
            return null;
        }
        dh.k kVar = this.I;
        if (kVar != null && kVar.f4608i) {
            this.I = null;
        }
        if (this.I == null) {
            this.I = dh.k.e(this);
        }
        return this.I;
    }

    private void settle(float f10) {
        int i9;
        int size = this.f46514y.size();
        if (f10 >= 0.0f || this.S >= size - 1) {
            i9 = -1;
            if (f10 <= 0.0f || this.S <= 0) {
                float f11 = this.T;
                if (f11 <= 0.5f || this.S >= size - 1) {
                    if (f11 >= -0.5f || this.S <= 0) {
                        i9 = 0;
                    }
                }
            }
            int i10 = this.S;
            int i11 = i9 + i10;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T, i11 - i10);
            this.f46507e0 = ofFloat;
            ofFloat.setDuration(220L);
            this.f46507e0.setInterpolator(gr.h);
            this.f46507e0.addUpdateListener(new kh.g4(this, 16));
            this.f46507e0.addListener(new mh.o2(this, i11, 11));
            this.f46507e0.start();
        }
        i9 = 1;
        int i102 = this.S;
        int i112 = i9 + i102;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.T, i112 - i102);
        this.f46507e0 = ofFloat2;
        ofFloat2.setDuration(220L);
        this.f46507e0.setInterpolator(gr.h);
        this.f46507e0.addUpdateListener(new kh.g4(this, 16));
        this.f46507e0.addListener(new mh.o2(this, i112, 11));
        this.f46507e0.start();
    }

    @Override
    public final boolean a(int i9, int i10) {
        return this.v.f(i9, i10);
    }

    @Override
    public final void b() {
        this.v.i();
    }

    @Override
    public final void d() {
        int i9 = f6.Gd;
        b6 b6Var = this.f46509n;
        this.f46510r.setColor(f6.v0(i9, b6Var));
        this.f46511s.setColor(f6.v0(f6.f23312uf, b6Var));
        h0 h0Var = this.v;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.v.c(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        int size;
        if (this.A.contains(view)) {
            a aVar = this.f46834a;
            if (aVar == null) {
                size = 0;
            } else {
                size = aVar.f46276k.size();
            }
            if (size > 0) {
                canvas.save();
                Path path = this.f46508f0;
                path.rewind();
                path.addRoundRect(getPaddingLeft(), getPaddingTop(), Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight()) + getPaddingLeft(), getPaddingTop() + this.L, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final int e() {
        return AndroidUtilities.dp(16.0f);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.v.e(arrayList);
    }

    @Override
    public d1 getCaptionEditText() {
        return this.v.f46409a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public a getRow() {
        return this.f46834a;
    }

    public final ImageView h() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (this.D && Build.VERSION.SDK_INT >= 31) {
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            kg.e eVar = (kg.e) this.E.y();
            eVar.n(this.F);
            eVar.p(AndroidUtilities.dp(16.0f));
            this.H.put(imageView, eVar);
        } else {
            int i9 = f6.G6;
            b6 b6Var = this.f46509n;
            imageView.setColorFilter(new PorterDuffColorFilter(f6.v0(i9, b6Var), PorterDuff.Mode.SRC_IN));
            int i10 = f6.f23001d6;
            imageView.setBackground(new w1(f6.Z(f6.v0(i10, b6Var), f6.v(f6.v0(i10, b6Var), f6.v0(f6.f23092i6, b6Var)), 20, 20)));
        }
        g6.a(imageView);
        this.G.add(imageView);
        return imageView;
    }

    public final void i(Canvas canvas, ImageView imageView) {
        kg.e eVar;
        if (imageView.getVisibility() != 0 || (eVar = (kg.e) this.H.get(imageView)) == null) {
            return;
        }
        eVar.setBounds(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
        eVar.setAlpha((int) (imageView.getAlpha() * 255.0f));
        eVar.M = true;
        eVar.draw(canvas);
    }

    public final void j(Canvas canvas) {
        int size;
        boolean z10;
        int size2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        l4 l4Var = this;
        Canvas canvas2 = canvas;
        int paddingTop = l4Var.getPaddingTop();
        int paddingLeft = l4Var.getPaddingLeft();
        int i15 = 0;
        int max = Math.max(0, (l4Var.getWidth() - paddingLeft) - l4Var.getPaddingRight());
        canvas2.save();
        canvas2.translate(paddingLeft, 0.0f);
        a aVar = l4Var.f46834a;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f46276k.size();
        }
        if (size > 0) {
            Path path = l4Var.f46508f0;
            path.rewind();
            path.addRoundRect(0.0f, paddingTop, max, l4Var.L + paddingTop, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            canvas2.clipRect(0, paddingTop, max, l4Var.L + paddingTop);
        }
        boolean l10 = l4Var.l();
        int i16 = 1;
        ArrayList arrayList = l4Var.f46514y;
        if (l10 && arrayList.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        a aVar2 = l4Var.f46834a;
        if (aVar2 == null) {
            size2 = 0;
        } else {
            size2 = aVar2.f46276k.size();
        }
        if (size2 > 0) {
            i9 = AndroidUtilities.dp(8.0f);
        } else {
            i9 = 0;
        }
        Paint paint = l4Var.f46510r;
        if (z10 && (((i14 = l4Var.S) == 0 && l4Var.T < 0.0f) || (i14 == arrayList.size() - 1 && l4Var.T > 0.0f))) {
            canvas2.drawRect(0.0f, paddingTop, max, l4Var.L + paddingTop, paint);
        }
        int size3 = arrayList.size();
        ArrayList arrayList2 = l4Var.C;
        if (size3 == 1 && arrayList2.size() == 1) {
            RectF rectF = (RectF) arrayList2.get(0);
            if (rectF.left > 0.5f || rectF.right < max - 0.5f) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, paddingTop, max, paddingTop + l4Var.L);
                o4 o4Var = (o4) arrayList.get(0);
                ImageReceiver imageReceiver = o4Var.f46601b;
                if (o4Var.b()) {
                    imageReceiver.setImageCoords(rectF2);
                    imageReceiver.setAlpha(o4Var.f46600a.getCurrentAlpha());
                    imageReceiver.draw(canvas2);
                }
            }
        }
        int i17 = 0;
        while (i17 < arrayList.size() && i17 < arrayList2.size()) {
            o4 o4Var2 = (o4) arrayList.get(i17);
            RectF rectF3 = (RectF) arrayList2.get(i17);
            if (z10) {
                if (i17 == 0) {
                    i10 = i9;
                } else {
                    i10 = 0;
                }
                if (i17 == arrayList.size() - i16) {
                    i11 = i9;
                } else {
                    i11 = 0;
                }
                if (i17 == arrayList.size() - i16) {
                    i12 = i9;
                } else {
                    i12 = 0;
                }
                if (i17 == 0) {
                    i13 = i9;
                } else {
                    i13 = 0;
                }
                o4Var2.f46600a.setRoundRadius(i10, i11, i12, i13);
                o4Var2.f46601b.setRoundRadius(i10, i11, i12, i13);
            } else {
                o4Var2.f46600a.setRoundRadius(i15, i15, i15, i15);
                o4Var2.f46601b.setRoundRadius(i15, i15, i15, i15);
            }
            boolean c10 = o4Var2.c();
            ImageReceiver imageReceiver2 = o4Var2.f46600a;
            if (!c10) {
                canvas2.drawRect(rectF3, paint);
            }
            imageReceiver2.setImageCoords(Math.round(rectF3.left), Math.round(rectF3.top), Math.round(rectF3.width()), Math.round(rectF3.height()));
            if (o4Var2.c()) {
                imageReceiver2.draw(canvas2);
            }
            RadialProgress2 radialProgress2 = o4Var2.d;
            s sVar = o4Var2.f46603e;
            if (sVar != null && sVar.a()) {
                int dp = AndroidUtilities.dp(48.0f);
                int round = Math.round(rectF3.centerX());
                int round2 = Math.round(rectF3.centerY());
                int i18 = dp / 2;
                radialProgress2.q(round - i18, round2 - i18, round + i18, round2 + i18);
                radialProgress2.o(o4Var2.f46603e.f46672f, true);
                radialProgress2.draw(canvas2);
            }
            s sVar2 = o4Var2.f46603e;
            if (sVar2 != null && sVar2.f46679n && o4Var2.c()) {
                dh.k spoilerEffect = l4Var.getSpoilerEffect();
                ImageReceiver imageReceiver3 = o4Var2.f46601b;
                canvas2.save();
                canvas2.clipRect(rectF3);
                if (o4Var2.b()) {
                    imageReceiver3.setImageCoords(rectF3);
                    imageReceiver3.setAlpha(imageReceiver2.getCurrentAlpha());
                    imageReceiver3.draw(canvas2);
                }
                if (spoilerEffect != null) {
                    canvas2.translate(rectF3.left, rectF3.top);
                    spoilerEffect.c(canvas2, l4Var, Math.round(rectF3.width()), Math.round(rectF3.height()), imageReceiver2.getCurrentAlpha(), false);
                }
                canvas.restore();
            }
            i17++;
            l4Var = this;
            canvas2 = canvas;
            i15 = 0;
            i16 = 1;
        }
        canvas.restore();
    }

    public final void k(int i9) {
        if (this.J != null && this.f46834a != null) {
            List m10 = m();
            if (!m10.isEmpty() && (m10.size() != 1 || ((s) m10.get(0)).f46668a != 0)) {
                if (i9 >= 0 && i9 < m10.size() && ((s) m10.get(i9)).a()) {
                    o3.N1(this.f46834a, (s) m10.get(i9), this.J.f46419a);
                    return;
                }
                return;
            }
            h3 h3Var = this.J;
            a aVar = this.f46834a;
            o3 o3Var = h3Var.f46419a;
            o3Var.X3 = aVar;
            o3Var.f46565d3.c0(0);
        }
    }

    public final boolean l() {
        a aVar = this.f46834a;
        if (aVar != null && (aVar.f46269b instanceof TL_iv.pageBlockSlideshow)) {
            return true;
        }
        return false;
    }

    public final List m() {
        a aVar = this.f46834a;
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f46269b;
            if ((pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                ArrayList arrayList = aVar.h;
                if (arrayList != null) {
                    return arrayList;
                }
                return Collections.EMPTY_LIST;
            }
        }
        s sVar = aVar.f46273g;
        if (sVar != null) {
            return Collections.singletonList(sVar);
        }
        return Collections.EMPTY_LIST;
    }

    public final void n() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List m10 = m();
        while (true) {
            arrayList = this.f46514y;
            if (arrayList.size() >= m10.size()) {
                break;
            }
            o4 o4Var = new o4(this, this.f46509n);
            if (this.K) {
                o4Var.f46600a.onAttachedToWindow();
                o4Var.f46601b.onAttachedToWindow();
                o4Var.a();
            }
            arrayList.add(o4Var);
        }
        while (arrayList.size() > m10.size()) {
            o4 o4Var2 = (o4) e2.c.k(1, arrayList);
            o4Var2.f46600a.onDetachedFromWindow();
            o4Var2.f46601b.onDetachedFromWindow();
            o4Var2.f46602c = null;
        }
        for (int i9 = 0; i9 < m10.size(); i9++) {
            o4 o4Var3 = (o4) arrayList.get(i9);
            o4Var3.f46603e = (s) m10.get(i9);
            o4Var3.a();
        }
        while (true) {
            arrayList2 = this.A;
            if (arrayList2.size() >= m10.size()) {
                break;
            }
            ImageView h = h();
            h.setImageResource(R.drawable.iv_media_dots);
            h.setOnClickListener(new i4(this, 0));
            addView(h, e6.e(32, 32, 51));
            arrayList2.add(h);
        }
        this.f46512w.bringToFront();
        this.f46513x.bringToFront();
        while (arrayList2.size() > m10.size()) {
            View view = (ImageView) e2.c.k(1, arrayList2);
            removeView(view);
            this.G.remove(view);
            this.H.remove(view);
        }
        if (this.I != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                s sVar = ((o4) arrayList.get(i10)).f46603e;
                if (sVar != null && sVar.f46679n) {
                    return;
                }
            }
            this.I.b(this);
            this.I = null;
        }
    }

    public final void o(boolean z10) {
        boolean z11;
        int i9;
        int i10 = 0;
        if (this.f46514y.size() >= 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            i10 = 8;
        }
        ImageView imageView = this.f46513x;
        imageView.setVisibility(i10);
        if (z11) {
            if (l()) {
                i9 = R.drawable.iv_media_slideshow;
            } else {
                i9 = R.drawable.iv_media_collage;
            }
            if (i9 == this.R) {
                return;
            }
            this.R = i9;
            if (z10) {
                AndroidUtilities.updateImageViewImageAnimated(imageView, i9);
            } else {
                imageView.setImageResource(i9);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f46514y;
            if (i9 < arrayList.size()) {
                o4 o4Var = (o4) arrayList.get(i9);
                o4Var.f46600a.onAttachedToWindow();
                o4Var.f46601b.onAttachedToWindow();
                o4Var.a();
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = 0;
        this.K = false;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        VelocityTracker velocityTracker = this.f46506d0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f46506d0 = null;
        }
        this.U = false;
        while (true) {
            ArrayList arrayList = this.f46514y;
            if (i9 >= arrayList.size()) {
                break;
            }
            o4 o4Var = (o4) arrayList.get(i9);
            o4Var.f46600a.onDetachedFromWindow();
            o4Var.f46601b.onDetachedFromWindow();
            o4Var.f46602c = null;
            i9++;
        }
        dh.k kVar = this.I;
        if (kVar != null) {
            kVar.b(this);
            this.I = null;
        }
        ValueAnimator valueAnimator = this.f46507e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f46507e0 = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ng.d dVar;
        ImageView imageView;
        ImageView imageView2;
        n9 textSelectionHelper;
        float f10;
        float f11;
        int dp;
        float f12;
        float dp2;
        int paddingTop = getPaddingTop();
        j(canvas);
        y5 y5Var = this.Q;
        float f13 = y5Var.f34854c;
        ArrayList arrayList = this.f46514y;
        if (arrayList.size() >= 2 && f13 > 0.001f) {
            if (f46502g0 == null) {
                Paint paint = new Paint(1);
                f46502g0 = paint;
                paint.setColor(-1);
                f46502g0.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dpf2(1.0f), Integer.MIN_VALUE);
            }
            int size = arrayList.size();
            float dp3 = AndroidUtilities.dp(5.0f) + ((getPaddingTop() + this.L) - AndroidUtilities.dp(23.0f));
            int dp4 = AndroidUtilities.dp(4.0f) + org.telegram.messenger.l0.D(6.0f, size - 1, AndroidUtilities.dp(7.0f) * size);
            int paddingLeft = getPaddingLeft();
            int max = Math.max(0, (getWidth() - paddingLeft) - getPaddingRight());
            float f14 = this.S + this.T;
            if (dp4 < max) {
                f10 = 13.0f;
                dp2 = ((max - dp4) / 2.0f) + paddingLeft;
                f11 = 23.0f;
                f12 = 4.0f;
            } else {
                f10 = 13.0f;
                int dp5 = AndroidUtilities.dp(13.0f);
                f11 = 23.0f;
                f12 = 4.0f;
                dp2 = (AndroidUtilities.dp(4.0f) + paddingLeft) - (Utilities.clamp(f14 - (((max - AndroidUtilities.dp(8.0f)) / 2) / dp5), Math.max(0, (size - (dp * 2)) - 1), 0.0f) * dp5);
            }
            canvas.save();
            canvas.clipRect(paddingLeft, (getPaddingTop() + this.L) - AndroidUtilities.dp(f11), max + paddingLeft, getPaddingTop() + this.L);
            for (int i9 = 0; i9 < size; i9++) {
                float max2 = Math.max(0.0f, 1.0f - Math.abs(i9 - f14));
                f46502g0.setAlpha((int) e2.c.B(max2, 95.0f, 160.0f, f13));
                canvas.drawCircle(AndroidUtilities.dp(f12) + dp2 + (AndroidUtilities.dp(f10) * i9), dp3, (AndroidUtilities.dp(1.0f) * max2) + AndroidUtilities.dp(2.0f), f46502g0);
            }
            canvas.restore();
        }
        h3 h3Var = this.J;
        if (h3Var != null && (textSelectionHelper = h3Var.f46419a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f24774u0 && R <= textSelectionHelper.f24777x0) {
                canvas.drawRect(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), paddingTop + this.L, this.f46511s);
            }
        }
        if (this.D && (dVar = this.E) != null && Build.VERSION.SDK_INT >= 31) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                if (canvas.isHardwareAccelerated() && !dVar.f18606n) {
                    try {
                        j(dVar.a(width, height));
                    } finally {
                        dVar.b();
                    }
                }
                int i10 = 0;
                while (true) {
                    ArrayList arrayList2 = this.G;
                    int size2 = arrayList2.size();
                    imageView = this.f46513x;
                    imageView2 = this.f46512w;
                    if (i10 >= size2) {
                        break;
                    }
                    ImageView imageView3 = (ImageView) arrayList2.get(i10);
                    if (imageView3 != imageView2 && imageView3 != imageView) {
                        i(canvas, imageView3);
                    }
                    i10++;
                }
                i(canvas, imageView);
                i(canvas, imageView2);
            }
        }
        if (y5Var.f34858i) {
            requestLayout();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int left;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i14 = i11 - i9;
        int max = Math.max(0, (i14 - paddingLeft) - paddingRight);
        int i15 = i14 - paddingRight;
        if (v6.b(this.f46834a) > 0) {
            i13 = AndroidUtilities.dp(16.0f);
        } else {
            i13 = 0;
        }
        this.v.g(paddingLeft - i13, paddingRight - i13, i14, getPaddingTop() + this.L);
        int dp = AndroidUtilities.dp(6.0f);
        int i16 = i15 - dp;
        ImageView imageView = this.f46512w;
        imageView.layout(i16 - imageView.getMeasuredWidth(), getPaddingTop() + dp, i16, imageView.getMeasuredHeight() + getPaddingTop() + dp);
        int i17 = i16 - dp;
        ImageView imageView2 = this.f46513x;
        imageView2.layout((i17 - imageView.getMeasuredWidth()) - imageView2.getMeasuredWidth(), getPaddingTop() + dp, i17 - imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + getPaddingTop() + dp);
        List m10 = m();
        int i18 = 0;
        while (true) {
            ArrayList arrayList = this.A;
            if (i18 < arrayList.size()) {
                ImageView imageView3 = (ImageView) arrayList.get(i18);
                int i19 = 8;
                if (i18 < m10.size() && ((s) m10.get(i18)).f46668a != 0) {
                    ArrayList arrayList2 = this.C;
                    if (i18 < arrayList2.size()) {
                        RectF rectF = (RectF) arrayList2.get(i18);
                        if (rectF.right > 0.0f && rectF.left < max && rectF.bottom > getPaddingTop() && rectF.top < getPaddingTop() + this.L) {
                            int i20 = ((int) rectF.left) + dp + paddingLeft;
                            int i21 = ((int) rectF.top) + dp;
                            imageView3.layout(i20, i21, imageView3.getMeasuredWidth() + i20, imageView3.getMeasuredHeight() + i21);
                            float f10 = 1.0f;
                            if (this.D) {
                                if (imageView2.getVisibility() == 0) {
                                    left = imageView2.getLeft();
                                } else {
                                    left = imageView.getLeft();
                                }
                                int dp2 = left - AndroidUtilities.dp(4.0f);
                                int measuredWidth = imageView3.getMeasuredWidth() + i20;
                                if (measuredWidth > dp2) {
                                    f10 = Math.max(0.0f, 1.0f - ((measuredWidth - dp2) / imageView3.getMeasuredWidth()));
                                }
                            }
                            imageView3.setAlpha(f10);
                            if (f10 > 0.01f) {
                                i19 = 0;
                            }
                            imageView3.setVisibility(i19);
                        } else {
                            imageView3.setVisibility(8);
                        }
                        i18++;
                    }
                }
                imageView3.setVisibility(8);
                i18++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: qh.l4.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        VelocityTracker velocityTracker;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        int i9 = 0;
        if (y10 >= getPaddingTop() && y10 < getPaddingTop() + this.L) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = -1;
        if (l() && !this.Q.f34858i) {
            ArrayList arrayList = this.f46514y;
            if (arrayList.size() >= 2) {
                if (actionMasked == 0) {
                    if (!z10) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.f46503a0 == 0) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                        this.f46503a0 = viewConfiguration.getScaledTouchSlop();
                        this.f46504b0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.f46505c0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.V = x10;
                    this.W = y10;
                    this.U = false;
                    VelocityTracker velocityTracker2 = this.f46506d0;
                    if (velocityTracker2 == null) {
                        this.f46506d0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f46506d0.addMovement(motionEvent);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    ValueAnimator valueAnimator = this.f46507e0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f46507e0 = null;
                    }
                    this.P = this.S;
                    return true;
                }
                float f10 = 0.0f;
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.f46506d0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float f11 = x10 - this.V;
                    float f12 = y10 - this.W;
                    if (!this.U && Math.abs(f11) > this.f46503a0 && Math.abs(f11) > Math.abs(f12)) {
                        this.U = true;
                        this.P = -1;
                    }
                    if (this.U) {
                        float f13 = (-f11) / this.N;
                        int i11 = this.S;
                        if (i11 == 0 && f13 < 0.0f) {
                            f13 *= 0.3f;
                        }
                        if (i11 == arrayList.size() - 1 && f13 > 0.0f) {
                            f13 *= 0.3f;
                        }
                        this.T = f13;
                        requestLayout();
                        invalidate();
                        return true;
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    if (actionMasked == 1 && (velocityTracker = this.f46506d0) != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f46506d0.computeCurrentVelocity(1000, this.f46505c0);
                        float xVelocity = this.f46506d0.getXVelocity();
                        float yVelocity = this.f46506d0.getYVelocity();
                        if (Math.abs(xVelocity) >= this.f46504b0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                            f10 = xVelocity;
                        }
                    }
                    VelocityTracker velocityTracker4 = this.f46506d0;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                        this.f46506d0 = null;
                    }
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (this.U) {
                        this.U = false;
                        settle(f10);
                    } else if (actionMasked == 1) {
                        int i12 = this.P;
                        int i13 = this.S;
                        if (i12 == i13) {
                            k(i13);
                        }
                    }
                    this.P = -1;
                    return true;
                }
                return true;
            }
        }
        ArrayList arrayList2 = this.C;
        if (actionMasked == 0) {
            if (!z10) {
                return super.onTouchEvent(motionEvent);
            }
            while (true) {
                if (i9 >= arrayList2.size()) {
                    break;
                } else if (((RectF) arrayList2.get(i9)).contains(x10, y10)) {
                    i10 = i9;
                    break;
                } else {
                    i9++;
                }
            }
            this.P = i10;
            return true;
        } else if (actionMasked == 1) {
            if (z10) {
                int i14 = 0;
                while (true) {
                    if (i14 < arrayList2.size()) {
                        if (((RectF) arrayList2.get(i14)).contains(x10, y10)) {
                            break;
                        }
                        i14++;
                    } else {
                        i14 = -1;
                        break;
                    }
                }
                int i15 = this.P;
                if (i14 == i15) {
                    k(i15);
                }
            }
            if (this.P == -1 && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.P = -1;
            if (!z11 && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } else {
            if (actionMasked == 3) {
                this.P = -1;
            }
            return super.onTouchEvent(motionEvent);
        }
    }
}
