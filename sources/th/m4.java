package th;

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
import i7.f6;
import i7.h6;
import i7.x7;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jr;
public final class m4 extends y implements org.telegram.ui.ActionBar.x5, j9, i0 {
    public static Paint f48572g0;
    public final ArrayList A;
    public final ArrayList B;
    public final ArrayList C;
    public final boolean D;
    public final qg.d E;
    public final bb.a F;
    public final ArrayList G;
    public final HashMap H;
    public gh.j I;
    public i3 J;
    public boolean K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public final d6 Q;
    public int R;
    public int S;
    public float T;
    public boolean U;
    public float V;
    public float W;
    public int f48573a0;
    public int f48574b0;
    public int f48575c0;
    public VelocityTracker f48576d0;
    public ValueAnimator f48577e0;
    public final Path f48578f0;
    public final c6 f48579n;
    public final Paint f48580r;
    public final Paint f48581s;
    public final h0 v;
    public final ImageView f48582w;
    public final ImageView f48583x;
    public final ArrayList f48584y;

    public m4(Context context, c6 c6Var) {
        super(context);
        boolean z10;
        this.f48580r = new Paint(1);
        this.f48581s = new Paint(1);
        this.f48584y = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && SharedConfig.chatBlurEnabled()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D = z10;
        this.G = new ArrayList();
        this.H = new HashMap();
        this.P = -1;
        this.Q = new d6(this, 0L, 320L, jr.h);
        this.f48578f0 = new Path();
        this.f48579n = c6Var;
        setWillNotDraw(false);
        g(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(4.0f));
        h0 h0Var = new h0(context, c6Var, new o1.a(this, 25));
        this.v = h0Var;
        addView(h0Var.f48471a, f6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        if (z10 && i10 >= 31) {
            qg.d dVar = new qg.d(new qg.c());
            this.E = dVar;
            dVar.f(AndroidUtilities.dp(24.0f));
            this.F = new bb.a(23);
        }
        ImageView h = h();
        this.f48582w = h;
        h.setImageResource(R.drawable.iv_media_add);
        addView(h, f6.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        h.setOnClickListener(new j4(this, 1));
        ImageView h10 = h();
        this.f48583x = h10;
        h10.setVisibility(8);
        addView(h10, f6.d(32, 32.0f, 53, 12.0f, 12.0f, 66.0f, 12.0f));
        h10.setOnClickListener(new j4(this, 2));
        e();
    }

    private gh.j getSpoilerEffect() {
        if (!this.K) {
            return null;
        }
        gh.j jVar = this.I;
        if (jVar != null && jVar.f7398i) {
            this.I = null;
        }
        if (this.I == null) {
            this.I = gh.j.e(this);
        }
        return this.I;
    }

    private void settle(float f9) {
        int i10;
        int size = this.f48584y.size();
        if (f9 >= 0.0f || this.S >= size - 1) {
            i10 = -1;
            if (f9 <= 0.0f || this.S <= 0) {
                float f10 = this.T;
                if (f10 <= 0.5f || this.S >= size - 1) {
                    if (f10 >= -0.5f || this.S <= 0) {
                        i10 = 0;
                    }
                }
            }
            int i11 = this.S;
            int i12 = i10 + i11;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T, i12 - i11);
            this.f48577e0 = ofFloat;
            ofFloat.setDuration(220L);
            this.f48577e0.setInterpolator(jr.h);
            this.f48577e0.addUpdateListener(new lh.d5(this, 26));
            this.f48577e0.addListener(new org.telegram.ui.Cells.z3(this, i12, 11));
            this.f48577e0.start();
        }
        i10 = 1;
        int i112 = this.S;
        int i122 = i10 + i112;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.T, i122 - i112);
        this.f48577e0 = ofFloat2;
        ofFloat2.setDuration(220L);
        this.f48577e0.setInterpolator(jr.h);
        this.f48577e0.addUpdateListener(new lh.d5(this, 26));
        this.f48577e0.addListener(new org.telegram.ui.Cells.z3(this, i122, 11));
        this.f48577e0.start();
    }

    @Override
    public final boolean a(int i10, int i11) {
        return this.v.f(i10, i11);
    }

    @Override
    public final void b() {
        this.v.i();
    }

    @Override
    public final int d() {
        return AndroidUtilities.dp(16.0f);
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
            a aVar = this.f48892a;
            if (aVar == null) {
                size = 0;
            } else {
                size = aVar.f48335k.size();
            }
            if (size > 0) {
                canvas.save();
                Path path = this.f48578f0;
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
    public final void e() {
        int i10 = g6.Gd;
        c6 c6Var = this.f48579n;
        this.f48580r.setColor(g6.v0(i10, c6Var));
        this.f48581s.setColor(g6.v0(g6.f23374uf, c6Var));
        h0 h0Var = this.v;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.v.e(arrayList);
    }

    @Override
    public d1 getCaptionEditText() {
        return this.v.f48471a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public a getRow() {
        return this.f48892a;
    }

    public final ImageView h() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (this.D && Build.VERSION.SDK_INT >= 31) {
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            ng.e eVar = (ng.e) this.E.v();
            eVar.n(this.F);
            eVar.p(AndroidUtilities.dp(16.0f));
            this.H.put(imageView, eVar);
        } else {
            int i10 = g6.G6;
            c6 c6Var = this.f48579n;
            imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(i10, c6Var), PorterDuff.Mode.SRC_IN));
            int i11 = g6.f23062d6;
            imageView.setBackground(new w1(g6.Z(g6.v0(i11, c6Var), g6.v(g6.v0(i11, c6Var), g6.v0(g6.f23152i6, c6Var)), 20, 20)));
        }
        h6.a(imageView);
        this.G.add(imageView);
        return imageView;
    }

    public final void i(Canvas canvas, ImageView imageView) {
        ng.e eVar;
        if (imageView.getVisibility() != 0 || (eVar = (ng.e) this.H.get(imageView)) == null) {
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
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        m4 m4Var = this;
        Canvas canvas2 = canvas;
        int paddingTop = m4Var.getPaddingTop();
        int paddingLeft = m4Var.getPaddingLeft();
        int i16 = 0;
        int max = Math.max(0, (m4Var.getWidth() - paddingLeft) - m4Var.getPaddingRight());
        canvas2.save();
        canvas2.translate(paddingLeft, 0.0f);
        a aVar = m4Var.f48892a;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f48335k.size();
        }
        if (size > 0) {
            Path path = m4Var.f48578f0;
            path.rewind();
            path.addRoundRect(0.0f, paddingTop, max, m4Var.L + paddingTop, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            canvas2.clipRect(0, paddingTop, max, m4Var.L + paddingTop);
        }
        boolean l10 = m4Var.l();
        int i17 = 1;
        ArrayList arrayList = m4Var.f48584y;
        if (l10 && arrayList.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        a aVar2 = m4Var.f48892a;
        if (aVar2 == null) {
            size2 = 0;
        } else {
            size2 = aVar2.f48335k.size();
        }
        if (size2 > 0) {
            i10 = AndroidUtilities.dp(8.0f);
        } else {
            i10 = 0;
        }
        Paint paint = m4Var.f48580r;
        if (z10 && (((i15 = m4Var.S) == 0 && m4Var.T < 0.0f) || (i15 == arrayList.size() - 1 && m4Var.T > 0.0f))) {
            canvas2.drawRect(0.0f, paddingTop, max, m4Var.L + paddingTop, paint);
        }
        int size3 = arrayList.size();
        ArrayList arrayList2 = m4Var.C;
        if (size3 == 1 && arrayList2.size() == 1) {
            RectF rectF = (RectF) arrayList2.get(0);
            if (rectF.left > 0.5f || rectF.right < max - 0.5f) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, paddingTop, max, paddingTop + m4Var.L);
                p4 p4Var = (p4) arrayList.get(0);
                ImageReceiver imageReceiver = p4Var.f48674b;
                if (p4Var.b()) {
                    imageReceiver.setImageCoords(rectF2);
                    imageReceiver.setAlpha(p4Var.f48673a.getCurrentAlpha());
                    imageReceiver.draw(canvas2);
                }
            }
        }
        int i18 = 0;
        while (i18 < arrayList.size() && i18 < arrayList2.size()) {
            p4 p4Var2 = (p4) arrayList.get(i18);
            RectF rectF3 = (RectF) arrayList2.get(i18);
            if (z10) {
                if (i18 == 0) {
                    i11 = i10;
                } else {
                    i11 = 0;
                }
                if (i18 == arrayList.size() - i17) {
                    i12 = i10;
                } else {
                    i12 = 0;
                }
                if (i18 == arrayList.size() - i17) {
                    i13 = i10;
                } else {
                    i13 = 0;
                }
                if (i18 == 0) {
                    i14 = i10;
                } else {
                    i14 = 0;
                }
                p4Var2.f48673a.setRoundRadius(i11, i12, i13, i14);
                p4Var2.f48674b.setRoundRadius(i11, i12, i13, i14);
            } else {
                p4Var2.f48673a.setRoundRadius(i16, i16, i16, i16);
                p4Var2.f48674b.setRoundRadius(i16, i16, i16, i16);
            }
            boolean c3 = p4Var2.c();
            ImageReceiver imageReceiver2 = p4Var2.f48673a;
            if (!c3) {
                canvas2.drawRect(rectF3, paint);
            }
            imageReceiver2.setImageCoords(Math.round(rectF3.left), Math.round(rectF3.top), Math.round(rectF3.width()), Math.round(rectF3.height()));
            if (p4Var2.c()) {
                imageReceiver2.draw(canvas2);
            }
            RadialProgress2 radialProgress2 = p4Var2.d;
            s sVar = p4Var2.f48676e;
            if (sVar != null && sVar.a()) {
                int dp = AndroidUtilities.dp(48.0f);
                int round = Math.round(rectF3.centerX());
                int round2 = Math.round(rectF3.centerY());
                int i19 = dp / 2;
                radialProgress2.q(round - i19, round2 - i19, round + i19, round2 + i19);
                radialProgress2.o(p4Var2.f48676e.f48716f, true);
                radialProgress2.draw(canvas2);
            }
            s sVar2 = p4Var2.f48676e;
            if (sVar2 != null && sVar2.f48723n && p4Var2.c()) {
                gh.j spoilerEffect = m4Var.getSpoilerEffect();
                ImageReceiver imageReceiver3 = p4Var2.f48674b;
                canvas2.save();
                canvas2.clipRect(rectF3);
                if (p4Var2.b()) {
                    imageReceiver3.setImageCoords(rectF3);
                    imageReceiver3.setAlpha(imageReceiver2.getCurrentAlpha());
                    imageReceiver3.draw(canvas2);
                }
                if (spoilerEffect != null) {
                    canvas2.translate(rectF3.left, rectF3.top);
                    spoilerEffect.c(canvas2, m4Var, Math.round(rectF3.width()), Math.round(rectF3.height()), imageReceiver2.getCurrentAlpha(), false);
                }
                canvas.restore();
            }
            i18++;
            m4Var = this;
            canvas2 = canvas;
            i16 = 0;
            i17 = 1;
        }
        canvas.restore();
    }

    public final void k(int i10) {
        if (this.J != null && this.f48892a != null) {
            List m10 = m();
            if (!m10.isEmpty() && (m10.size() != 1 || ((s) m10.get(0)).f48712a != 0)) {
                if (i10 >= 0 && i10 < m10.size() && ((s) m10.get(i10)).a()) {
                    p3.N1(this.f48892a, (s) m10.get(i10), this.J.f48491a);
                    return;
                }
                return;
            }
            i3 i3Var = this.J;
            a aVar = this.f48892a;
            p3 p3Var = i3Var.f48491a;
            p3Var.X3 = aVar;
            p3Var.f48638d3.W(0);
        }
    }

    public final boolean l() {
        a aVar = this.f48892a;
        if (aVar != null && (aVar.f48328b instanceof TL_iv.pageBlockSlideshow)) {
            return true;
        }
        return false;
    }

    public final List m() {
        a aVar = this.f48892a;
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f48328b;
            if ((pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                ArrayList arrayList = aVar.h;
                if (arrayList != null) {
                    return arrayList;
                }
                return Collections.EMPTY_LIST;
            }
        }
        s sVar = aVar.f48332g;
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
            arrayList = this.f48584y;
            if (arrayList.size() >= m10.size()) {
                break;
            }
            p4 p4Var = new p4(this, this.f48579n);
            if (this.K) {
                p4Var.f48673a.onAttachedToWindow();
                p4Var.f48674b.onAttachedToWindow();
                p4Var.a();
            }
            arrayList.add(p4Var);
        }
        while (arrayList.size() > m10.size()) {
            p4 p4Var2 = (p4) com.google.android.recaptcha.internal.a.j(1, arrayList);
            p4Var2.f48673a.onDetachedFromWindow();
            p4Var2.f48674b.onDetachedFromWindow();
            p4Var2.f48675c = null;
        }
        for (int i10 = 0; i10 < m10.size(); i10++) {
            p4 p4Var3 = (p4) arrayList.get(i10);
            p4Var3.f48676e = (s) m10.get(i10);
            p4Var3.a();
        }
        while (true) {
            arrayList2 = this.A;
            if (arrayList2.size() >= m10.size()) {
                break;
            }
            ImageView h = h();
            h.setImageResource(R.drawable.iv_media_dots);
            h.setOnClickListener(new j4(this, 0));
            addView(h, f6.e(32, 32, 51));
            arrayList2.add(h);
        }
        this.f48582w.bringToFront();
        this.f48583x.bringToFront();
        while (arrayList2.size() > m10.size()) {
            View view = (ImageView) com.google.android.recaptcha.internal.a.j(1, arrayList2);
            removeView(view);
            this.G.remove(view);
            this.H.remove(view);
        }
        if (this.I != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                s sVar = ((p4) arrayList.get(i11)).f48676e;
                if (sVar != null && sVar.f48723n) {
                    return;
                }
            }
            this.I.b(this);
            this.I = null;
        }
    }

    public final void o(boolean z10) {
        boolean z11;
        int i10;
        int i11 = 0;
        if (this.f48584y.size() >= 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            i11 = 8;
        }
        ImageView imageView = this.f48583x;
        imageView.setVisibility(i11);
        if (z11) {
            if (l()) {
                i10 = R.drawable.iv_media_slideshow;
            } else {
                i10 = R.drawable.iv_media_collage;
            }
            if (i10 == this.R) {
                return;
            }
            this.R = i10;
            if (z10) {
                AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
            } else {
                imageView.setImageResource(i10);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f48584y;
            if (i10 < arrayList.size()) {
                p4 p4Var = (p4) arrayList.get(i10);
                p4Var.f48673a.onAttachedToWindow();
                p4Var.f48674b.onAttachedToWindow();
                p4Var.a();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.K = false;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        VelocityTracker velocityTracker = this.f48576d0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f48576d0 = null;
        }
        this.U = false;
        while (true) {
            ArrayList arrayList = this.f48584y;
            if (i10 >= arrayList.size()) {
                break;
            }
            p4 p4Var = (p4) arrayList.get(i10);
            p4Var.f48673a.onDetachedFromWindow();
            p4Var.f48674b.onDetachedFromWindow();
            p4Var.f48675c = null;
            i10++;
        }
        gh.j jVar = this.I;
        if (jVar != null) {
            jVar.b(this);
            this.I = null;
        }
        ValueAnimator valueAnimator = this.f48577e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f48577e0 = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        qg.d dVar;
        ImageView imageView;
        ImageView imageView2;
        k9 textSelectionHelper;
        float f9;
        float f10;
        int dp;
        float f11;
        float dp2;
        int paddingTop = getPaddingTop();
        j(canvas);
        d6 d6Var = this.Q;
        float f12 = d6Var.f27666c;
        ArrayList arrayList = this.f48584y;
        if (arrayList.size() >= 2 && f12 > 0.001f) {
            if (f48572g0 == null) {
                Paint paint = new Paint(1);
                f48572g0 = paint;
                paint.setColor(-1);
                f48572g0.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dpf2(1.0f), Integer.MIN_VALUE);
            }
            int size = arrayList.size();
            float dp3 = AndroidUtilities.dp(5.0f) + ((getPaddingTop() + this.L) - AndroidUtilities.dp(23.0f));
            int dp4 = AndroidUtilities.dp(4.0f) + org.telegram.messenger.x3.D(6.0f, size - 1, AndroidUtilities.dp(7.0f) * size);
            int paddingLeft = getPaddingLeft();
            int max = Math.max(0, (getWidth() - paddingLeft) - getPaddingRight());
            float f13 = this.S + this.T;
            if (dp4 < max) {
                f9 = 13.0f;
                dp2 = ((max - dp4) / 2.0f) + paddingLeft;
                f10 = 23.0f;
                f11 = 4.0f;
            } else {
                f9 = 13.0f;
                int dp5 = AndroidUtilities.dp(13.0f);
                f10 = 23.0f;
                f11 = 4.0f;
                dp2 = (AndroidUtilities.dp(4.0f) + paddingLeft) - (Utilities.clamp(f13 - (((max - AndroidUtilities.dp(8.0f)) / 2) / dp5), Math.max(0, (size - (dp * 2)) - 1), 0.0f) * dp5);
            }
            canvas.save();
            canvas.clipRect(paddingLeft, (getPaddingTop() + this.L) - AndroidUtilities.dp(f10), max + paddingLeft, getPaddingTop() + this.L);
            for (int i10 = 0; i10 < size; i10++) {
                float max2 = Math.max(0.0f, 1.0f - Math.abs(i10 - f13));
                f48572g0.setAlpha((int) com.google.android.recaptcha.internal.a.B(max2, 95.0f, 160.0f, f12));
                canvas.drawCircle(AndroidUtilities.dp(f11) + dp2 + (AndroidUtilities.dp(f9) * i10), dp3, (AndroidUtilities.dp(1.0f) * max2) + AndroidUtilities.dp(2.0f), f48572g0);
            }
            canvas.restore();
        }
        i3 i3Var = this.J;
        if (i3Var != null && (textSelectionHelper = i3Var.f48491a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f24607u0 && R <= textSelectionHelper.f24610x0) {
                canvas.drawRect(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), paddingTop + this.L, this.f48581s);
            }
        }
        if (this.D && (dVar = this.E) != null && Build.VERSION.SDK_INT >= 31) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                if (canvas.isHardwareAccelerated() && !dVar.f46673n) {
                    try {
                        j(dVar.a(width, height));
                    } finally {
                        dVar.b();
                    }
                }
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.G;
                    int size2 = arrayList2.size();
                    imageView = this.f48583x;
                    imageView2 = this.f48582w;
                    if (i11 >= size2) {
                        break;
                    }
                    ImageView imageView3 = (ImageView) arrayList2.get(i11);
                    if (imageView3 != imageView2 && imageView3 != imageView) {
                        i(canvas, imageView3);
                    }
                    i11++;
                }
                i(canvas, imageView);
                i(canvas, imageView2);
            }
        }
        if (d6Var.f27670i) {
            requestLayout();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int left;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i15 = i12 - i10;
        int max = Math.max(0, (i15 - paddingLeft) - paddingRight);
        int i16 = i15 - paddingRight;
        if (x7.b(this.f48892a) > 0) {
            i14 = AndroidUtilities.dp(16.0f);
        } else {
            i14 = 0;
        }
        this.v.g(paddingLeft - i14, paddingRight - i14, i15, getPaddingTop() + this.L);
        int dp = AndroidUtilities.dp(6.0f);
        int i17 = i16 - dp;
        ImageView imageView = this.f48582w;
        imageView.layout(i17 - imageView.getMeasuredWidth(), getPaddingTop() + dp, i17, imageView.getMeasuredHeight() + getPaddingTop() + dp);
        int i18 = i17 - dp;
        ImageView imageView2 = this.f48583x;
        imageView2.layout((i18 - imageView.getMeasuredWidth()) - imageView2.getMeasuredWidth(), getPaddingTop() + dp, i18 - imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + getPaddingTop() + dp);
        List m10 = m();
        int i19 = 0;
        while (true) {
            ArrayList arrayList = this.A;
            if (i19 < arrayList.size()) {
                ImageView imageView3 = (ImageView) arrayList.get(i19);
                int i20 = 8;
                if (i19 < m10.size() && ((s) m10.get(i19)).f48712a != 0) {
                    ArrayList arrayList2 = this.C;
                    if (i19 < arrayList2.size()) {
                        RectF rectF = (RectF) arrayList2.get(i19);
                        if (rectF.right > 0.0f && rectF.left < max && rectF.bottom > getPaddingTop() && rectF.top < getPaddingTop() + this.L) {
                            int i21 = ((int) rectF.left) + dp + paddingLeft;
                            int i22 = ((int) rectF.top) + dp;
                            imageView3.layout(i21, i22, imageView3.getMeasuredWidth() + i21, imageView3.getMeasuredHeight() + i22);
                            float f9 = 1.0f;
                            if (this.D) {
                                if (imageView2.getVisibility() == 0) {
                                    left = imageView2.getLeft();
                                } else {
                                    left = imageView.getLeft();
                                }
                                int dp2 = left - AndroidUtilities.dp(4.0f);
                                int measuredWidth = imageView3.getMeasuredWidth() + i21;
                                if (measuredWidth > dp2) {
                                    f9 = Math.max(0.0f, 1.0f - ((measuredWidth - dp2) / imageView3.getMeasuredWidth()));
                                }
                            }
                            imageView3.setAlpha(f9);
                            if (f9 > 0.01f) {
                                i20 = 0;
                            }
                            imageView3.setVisibility(i20);
                        } else {
                            imageView3.setVisibility(8);
                        }
                        i19++;
                    }
                }
                imageView3.setVisibility(8);
                i19++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onMeasure(int r30, int r31) {
        throw new UnsupportedOperationException("Method not decompiled: th.m4.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        VelocityTracker velocityTracker;
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 0;
        if (y8 >= getPaddingTop() && y8 < getPaddingTop() + this.L) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = -1;
        if (l() && !this.Q.f27670i) {
            ArrayList arrayList = this.f48584y;
            if (arrayList.size() >= 2) {
                if (actionMasked == 0) {
                    if (!z10) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.f48573a0 == 0) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                        this.f48573a0 = viewConfiguration.getScaledTouchSlop();
                        this.f48574b0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.f48575c0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.V = x4;
                    this.W = y8;
                    this.U = false;
                    VelocityTracker velocityTracker2 = this.f48576d0;
                    if (velocityTracker2 == null) {
                        this.f48576d0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f48576d0.addMovement(motionEvent);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    ValueAnimator valueAnimator = this.f48577e0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f48577e0 = null;
                    }
                    this.P = this.S;
                    return true;
                }
                float f9 = 0.0f;
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.f48576d0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float f10 = x4 - this.V;
                    float f11 = y8 - this.W;
                    if (!this.U && Math.abs(f10) > this.f48573a0 && Math.abs(f10) > Math.abs(f11)) {
                        this.U = true;
                        this.P = -1;
                    }
                    if (this.U) {
                        float f12 = (-f10) / this.N;
                        int i12 = this.S;
                        if (i12 == 0 && f12 < 0.0f) {
                            f12 *= 0.3f;
                        }
                        if (i12 == arrayList.size() - 1 && f12 > 0.0f) {
                            f12 *= 0.3f;
                        }
                        this.T = f12;
                        requestLayout();
                        invalidate();
                        return true;
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    if (actionMasked == 1 && (velocityTracker = this.f48576d0) != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f48576d0.computeCurrentVelocity(1000, this.f48575c0);
                        float xVelocity = this.f48576d0.getXVelocity();
                        float yVelocity = this.f48576d0.getYVelocity();
                        if (Math.abs(xVelocity) >= this.f48574b0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                            f9 = xVelocity;
                        }
                    }
                    VelocityTracker velocityTracker4 = this.f48576d0;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                        this.f48576d0 = null;
                    }
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (this.U) {
                        this.U = false;
                        settle(f9);
                    } else if (actionMasked == 1) {
                        int i13 = this.P;
                        int i14 = this.S;
                        if (i13 == i14) {
                            k(i14);
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
                if (i10 >= arrayList2.size()) {
                    break;
                } else if (((RectF) arrayList2.get(i10)).contains(x4, y8)) {
                    i11 = i10;
                    break;
                } else {
                    i10++;
                }
            }
            this.P = i11;
            return true;
        } else if (actionMasked == 1) {
            if (z10) {
                int i15 = 0;
                while (true) {
                    if (i15 < arrayList2.size()) {
                        if (((RectF) arrayList2.get(i15)).contains(x4, y8)) {
                            break;
                        }
                        i15++;
                    } else {
                        i15 = -1;
                        break;
                    }
                }
                int i16 = this.P;
                if (i15 == i16) {
                    k(i16);
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
