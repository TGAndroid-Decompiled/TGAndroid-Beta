package wh;

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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import k7.c6;
import k7.e6;
import k7.l8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.pr;
public final class o4 extends z implements b6, l9, j0 {
    public static Paint f49902h0;
    public final ArrayList B;
    public final ArrayList C;
    public final ArrayList D;
    public final boolean E;
    public final tg.d F;
    public final z9.d G;
    public final ArrayList H;
    public final HashMap I;
    public jh.j J;
    public k3 K;
    public boolean L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final org.telegram.ui.Components.z5 R;
    public int S;
    public int T;
    public float U;
    public boolean V;
    public float W;
    public float f49903a0;
    public int f49904b0;
    public int f49905c0;
    public int f49906d0;
    public VelocityTracker f49907e0;
    public ValueAnimator f49908f0;
    public final Path f49909g0;
    public final g6 f49910n;
    public final Paint f49911r;
    public final Paint f49912s;
    public final i0 v;
    public final ImageView f49913w;
    public final ImageView f49914x;
    public final ArrayList f49915y;

    public o4(Context context, g6 g6Var) {
        super(context);
        boolean z4;
        this.f49911r = new Paint(1);
        this.f49912s = new Paint(1);
        this.f49915y = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        this.D = new ArrayList();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && SharedConfig.chatBlurEnabled()) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.E = z4;
        this.H = new ArrayList();
        this.I = new HashMap();
        this.Q = -1;
        this.R = new org.telegram.ui.Components.z5(this, 0L, 320L, pr.h);
        this.f49909g0 = new Path();
        this.f49910n = g6Var;
        setWillNotDraw(false);
        g(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(4.0f));
        i0 i0Var = new i0(context, g6Var, new org.telegram.ui.Cells.f1(this, 28));
        this.v = i0Var;
        addView(i0Var.f49778a, c6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        if (z4 && i10 >= 31) {
            tg.d dVar = new tg.d(new tg.c());
            this.F = dVar;
            dVar.g(AndroidUtilities.dp(24.0f));
            this.G = new z9.d(24);
        }
        ImageView h = h();
        this.f49913w = h;
        h.setImageResource(R.drawable.iv_media_add);
        addView(h, c6.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        h.setOnClickListener(new l4(this, 1));
        ImageView h9 = h();
        this.f49914x = h9;
        h9.setVisibility(8);
        addView(h9, c6.d(32, 32.0f, 53, 12.0f, 12.0f, 66.0f, 12.0f));
        h9.setOnClickListener(new l4(this, 2));
        e();
    }

    private jh.j getSpoilerEffect() {
        if (!this.L) {
            return null;
        }
        jh.j jVar = this.J;
        if (jVar != null && jVar.f10128i) {
            this.J = null;
        }
        if (this.J == null) {
            this.J = jh.j.e(this);
        }
        return this.J;
    }

    private void settle(float f10) {
        int i10;
        int size = this.f49915y.size();
        if (f10 >= 0.0f || this.T >= size - 1) {
            i10 = -1;
            if (f10 <= 0.0f || this.T <= 0) {
                float f11 = this.U;
                if (f11 <= 0.5f || this.T >= size - 1) {
                    if (f11 >= -0.5f || this.T <= 0) {
                        i10 = 0;
                    }
                }
            }
            int i11 = this.T;
            int i12 = i10 + i11;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, i12 - i11);
            this.f49908f0 = ofFloat;
            ofFloat.setDuration(220L);
            this.f49908f0.setInterpolator(pr.h);
            this.f49908f0.addUpdateListener(new oh.f5(this, 26));
            this.f49908f0.addListener(new org.telegram.ui.Cells.b4(this, i12, 11));
            this.f49908f0.start();
        }
        i10 = 1;
        int i112 = this.T;
        int i122 = i10 + i112;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.U, i122 - i112);
        this.f49908f0 = ofFloat2;
        ofFloat2.setDuration(220L);
        this.f49908f0.setInterpolator(pr.h);
        this.f49908f0.addUpdateListener(new oh.f5(this, 26));
        this.f49908f0.addListener(new org.telegram.ui.Cells.b4(this, i122, 11));
        this.f49908f0.start();
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
        if (this.B.contains(view)) {
            a aVar = this.f50175a;
            if (aVar == null) {
                size = 0;
            } else {
                size = aVar.f49624k.size();
            }
            if (size > 0) {
                canvas.save();
                Path path = this.f49909g0;
                path.rewind();
                path.addRoundRect(getPaddingLeft(), getPaddingTop(), Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight()) + getPaddingLeft(), getPaddingTop() + this.M, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
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
        int i10 = k6.Gd;
        g6 g6Var = this.f49910n;
        this.f49911r.setColor(k6.v0(i10, g6Var));
        this.f49912s.setColor(k6.v0(k6.f21970uf, g6Var));
        i0 i0Var = this.v;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.v.e(arrayList);
    }

    @Override
    public e1 getCaptionEditText() {
        return this.v.f49778a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public a getRow() {
        return this.f50175a;
    }

    public final ImageView h() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (this.E && Build.VERSION.SDK_INT >= 31) {
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            qg.c cVar = (qg.c) this.F.k();
            cVar.n(this.G);
            cVar.p(AndroidUtilities.dp(16.0f));
            this.I.put(imageView, cVar);
        } else {
            int i10 = k6.G6;
            g6 g6Var = this.f49910n;
            imageView.setColorFilter(new PorterDuffColorFilter(k6.v0(i10, g6Var), PorterDuff.Mode.SRC_IN));
            int i11 = k6.f21659d6;
            imageView.setBackground(new y1(k6.Z(k6.v0(i11, g6Var), k6.v(k6.v0(i11, g6Var), k6.v0(k6.f21750i6, g6Var)), 20, 20)));
        }
        e6.a(imageView);
        this.H.add(imageView);
        return imageView;
    }

    public final void i(Canvas canvas, ImageView imageView) {
        qg.c cVar;
        if (imageView.getVisibility() != 0 || (cVar = (qg.c) this.I.get(imageView)) == null) {
            return;
        }
        cVar.setBounds(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
        cVar.setAlpha((int) (imageView.getAlpha() * 255.0f));
        cVar.M = true;
        cVar.draw(canvas);
    }

    public final void j(Canvas canvas) {
        int size;
        boolean z4;
        int size2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        o4 o4Var = this;
        Canvas canvas2 = canvas;
        int paddingTop = o4Var.getPaddingTop();
        int paddingLeft = o4Var.getPaddingLeft();
        int i16 = 0;
        int max = Math.max(0, (o4Var.getWidth() - paddingLeft) - o4Var.getPaddingRight());
        canvas2.save();
        canvas2.translate(paddingLeft, 0.0f);
        a aVar = o4Var.f50175a;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f49624k.size();
        }
        if (size > 0) {
            Path path = o4Var.f49909g0;
            path.rewind();
            path.addRoundRect(0.0f, paddingTop, max, o4Var.M + paddingTop, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            canvas2.clipRect(0, paddingTop, max, o4Var.M + paddingTop);
        }
        boolean l10 = o4Var.l();
        int i17 = 1;
        ArrayList arrayList = o4Var.f49915y;
        if (l10 && arrayList.size() >= 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        a aVar2 = o4Var.f50175a;
        if (aVar2 == null) {
            size2 = 0;
        } else {
            size2 = aVar2.f49624k.size();
        }
        if (size2 > 0) {
            i10 = AndroidUtilities.dp(8.0f);
        } else {
            i10 = 0;
        }
        Paint paint = o4Var.f49911r;
        if (z4 && (((i15 = o4Var.T) == 0 && o4Var.U < 0.0f) || (i15 == arrayList.size() - 1 && o4Var.U > 0.0f))) {
            canvas2.drawRect(0.0f, paddingTop, max, o4Var.M + paddingTop, paint);
        }
        int size3 = arrayList.size();
        ArrayList arrayList2 = o4Var.D;
        if (size3 == 1 && arrayList2.size() == 1) {
            RectF rectF = (RectF) arrayList2.get(0);
            if (rectF.left > 0.5f || rectF.right < max - 0.5f) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, paddingTop, max, paddingTop + o4Var.M);
                r4 r4Var = (r4) arrayList.get(0);
                ImageReceiver imageReceiver = r4Var.f50015b;
                if (r4Var.b()) {
                    imageReceiver.setImageCoords(rectF2);
                    imageReceiver.setAlpha(r4Var.f50014a.getCurrentAlpha());
                    imageReceiver.draw(canvas2);
                }
            }
        }
        int i18 = 0;
        while (i18 < arrayList.size() && i18 < arrayList2.size()) {
            r4 r4Var2 = (r4) arrayList.get(i18);
            RectF rectF3 = (RectF) arrayList2.get(i18);
            if (z4) {
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
                r4Var2.f50014a.setRoundRadius(i11, i12, i13, i14);
                r4Var2.f50015b.setRoundRadius(i11, i12, i13, i14);
            } else {
                r4Var2.f50014a.setRoundRadius(i16, i16, i16, i16);
                r4Var2.f50015b.setRoundRadius(i16, i16, i16, i16);
            }
            boolean c3 = r4Var2.c();
            ImageReceiver imageReceiver2 = r4Var2.f50014a;
            if (!c3) {
                canvas2.drawRect(rectF3, paint);
            }
            imageReceiver2.setImageCoords(Math.round(rectF3.left), Math.round(rectF3.top), Math.round(rectF3.width()), Math.round(rectF3.height()));
            if (r4Var2.c()) {
                imageReceiver2.draw(canvas2);
            }
            RadialProgress2 radialProgress2 = r4Var2.d;
            t tVar = r4Var2.f50017e;
            if (tVar != null && tVar.a()) {
                int dp = AndroidUtilities.dp(48.0f);
                int round = Math.round(rectF3.centerX());
                int round2 = Math.round(rectF3.centerY());
                int i19 = dp / 2;
                radialProgress2.q(round - i19, round2 - i19, round + i19, round2 + i19);
                radialProgress2.o(r4Var2.f50017e.f50034f, true);
                radialProgress2.draw(canvas2);
            }
            t tVar2 = r4Var2.f50017e;
            if (tVar2 != null && tVar2.f50041n && r4Var2.c()) {
                jh.j spoilerEffect = o4Var.getSpoilerEffect();
                ImageReceiver imageReceiver3 = r4Var2.f50015b;
                canvas2.save();
                canvas2.clipRect(rectF3);
                if (r4Var2.b()) {
                    imageReceiver3.setImageCoords(rectF3);
                    imageReceiver3.setAlpha(imageReceiver2.getCurrentAlpha());
                    imageReceiver3.draw(canvas2);
                }
                if (spoilerEffect != null) {
                    canvas2.translate(rectF3.left, rectF3.top);
                    spoilerEffect.c(canvas2, o4Var, Math.round(rectF3.width()), Math.round(rectF3.height()), imageReceiver2.getCurrentAlpha(), false);
                }
                canvas.restore();
            }
            i18++;
            o4Var = this;
            canvas2 = canvas;
            i16 = 0;
            i17 = 1;
        }
        canvas.restore();
    }

    public final void k(int i10) {
        if (this.K != null && this.f50175a != null) {
            List m9 = m();
            if (!m9.isEmpty() && (m9.size() != 1 || ((t) m9.get(0)).f50030a != 0)) {
                if (i10 >= 0 && i10 < m9.size() && ((t) m9.get(i10)).a()) {
                    r3.N1(this.f50175a, (t) m9.get(i10), this.K.f49828a);
                    return;
                }
                return;
            }
            k3 k3Var = this.K;
            a aVar = this.f50175a;
            r3 r3Var = k3Var.f49828a;
            r3Var.Y3 = aVar;
            r3Var.f49980e3.p(0);
        }
    }

    public final boolean l() {
        a aVar = this.f50175a;
        if (aVar != null && (aVar.f49617b instanceof TL_iv.pageBlockSlideshow)) {
            return true;
        }
        return false;
    }

    public final List m() {
        a aVar = this.f50175a;
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f49617b;
            if ((pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                ArrayList arrayList = aVar.h;
                if (arrayList != null) {
                    return arrayList;
                }
                return Collections.EMPTY_LIST;
            }
        }
        t tVar = aVar.f49621g;
        if (tVar != null) {
            return Collections.singletonList(tVar);
        }
        return Collections.EMPTY_LIST;
    }

    public final void n() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List m9 = m();
        while (true) {
            arrayList = this.f49915y;
            if (arrayList.size() >= m9.size()) {
                break;
            }
            r4 r4Var = new r4(this, this.f49910n);
            if (this.L) {
                r4Var.f50014a.onAttachedToWindow();
                r4Var.f50015b.onAttachedToWindow();
                r4Var.a();
            }
            arrayList.add(r4Var);
        }
        while (arrayList.size() > m9.size()) {
            r4 r4Var2 = (r4) e2.c.g(1, arrayList);
            r4Var2.f50014a.onDetachedFromWindow();
            r4Var2.f50015b.onDetachedFromWindow();
            r4Var2.f50016c = null;
        }
        for (int i10 = 0; i10 < m9.size(); i10++) {
            r4 r4Var3 = (r4) arrayList.get(i10);
            r4Var3.f50017e = (t) m9.get(i10);
            r4Var3.a();
        }
        while (true) {
            arrayList2 = this.B;
            if (arrayList2.size() >= m9.size()) {
                break;
            }
            ImageView h = h();
            h.setImageResource(R.drawable.iv_media_dots);
            h.setOnClickListener(new l4(this, 0));
            addView(h, c6.e(32, 32, 51));
            arrayList2.add(h);
        }
        this.f49913w.bringToFront();
        this.f49914x.bringToFront();
        while (arrayList2.size() > m9.size()) {
            View view = (ImageView) e2.c.g(1, arrayList2);
            removeView(view);
            this.H.remove(view);
            this.I.remove(view);
        }
        if (this.J != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                t tVar = ((r4) arrayList.get(i11)).f50017e;
                if (tVar != null && tVar.f50041n) {
                    return;
                }
            }
            this.J.b(this);
            this.J = null;
        }
    }

    public final void o(boolean z4) {
        boolean z10;
        int i10;
        int i11 = 0;
        if (this.f49915y.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i11 = 8;
        }
        ImageView imageView = this.f49914x;
        imageView.setVisibility(i11);
        if (z10) {
            if (l()) {
                i10 = R.drawable.iv_media_slideshow;
            } else {
                i10 = R.drawable.iv_media_collage;
            }
            if (i10 == this.S) {
                return;
            }
            this.S = i10;
            if (z4) {
                AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
            } else {
                imageView.setImageResource(i10);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f49915y;
            if (i10 < arrayList.size()) {
                r4 r4Var = (r4) arrayList.get(i10);
                r4Var.f50014a.onAttachedToWindow();
                r4Var.f50015b.onAttachedToWindow();
                r4Var.a();
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
        this.L = false;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        VelocityTracker velocityTracker = this.f49907e0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f49907e0 = null;
        }
        this.V = false;
        while (true) {
            ArrayList arrayList = this.f49915y;
            if (i10 >= arrayList.size()) {
                break;
            }
            r4 r4Var = (r4) arrayList.get(i10);
            r4Var.f50014a.onDetachedFromWindow();
            r4Var.f50015b.onDetachedFromWindow();
            r4Var.f50016c = null;
            i10++;
        }
        jh.j jVar = this.J;
        if (jVar != null) {
            jVar.b(this);
            this.J = null;
        }
        ValueAnimator valueAnimator = this.f49908f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f49908f0 = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        tg.d dVar;
        ImageView imageView;
        ImageView imageView2;
        m9 textSelectionHelper;
        float f10;
        float f11;
        int dp;
        float f12;
        float dp2;
        int paddingTop = getPaddingTop();
        j(canvas);
        org.telegram.ui.Components.z5 z5Var = this.R;
        float f13 = z5Var.f33725c;
        ArrayList arrayList = this.f49915y;
        if (arrayList.size() >= 2 && f13 > 0.001f) {
            if (f49902h0 == null) {
                Paint paint = new Paint(1);
                f49902h0 = paint;
                paint.setColor(-1);
                f49902h0.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dpf2(1.0f), Integer.MIN_VALUE);
            }
            int size = arrayList.size();
            float dp3 = AndroidUtilities.dp(5.0f) + ((getPaddingTop() + this.M) - AndroidUtilities.dp(23.0f));
            int dp4 = AndroidUtilities.dp(4.0f) + org.telegram.messenger.y3.D(6.0f, size - 1, AndroidUtilities.dp(7.0f) * size);
            int paddingLeft = getPaddingLeft();
            int max = Math.max(0, (getWidth() - paddingLeft) - getPaddingRight());
            float f14 = this.T + this.U;
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
            canvas.clipRect(paddingLeft, (getPaddingTop() + this.M) - AndroidUtilities.dp(f11), max + paddingLeft, getPaddingTop() + this.M);
            for (int i10 = 0; i10 < size; i10++) {
                float max2 = Math.max(0.0f, 1.0f - Math.abs(i10 - f14));
                f49902h0.setAlpha((int) e2.c.y(max2, 95.0f, 160.0f, f13));
                canvas.drawCircle(AndroidUtilities.dp(f12) + dp2 + (AndroidUtilities.dp(f10) * i10), dp3, (AndroidUtilities.dp(1.0f) * max2) + AndroidUtilities.dp(2.0f), f49902h0);
            }
            canvas.restore();
        }
        k3 k3Var = this.K;
        if (k3Var != null && (textSelectionHelper = k3Var.f49828a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f23175u0 && R <= textSelectionHelper.f23178x0) {
                canvas.drawRect(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), paddingTop + this.M, this.f49912s);
            }
        }
        if (this.E && (dVar = this.F) != null && Build.VERSION.SDK_INT >= 31) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                if (canvas.isHardwareAccelerated() && !dVar.f48092n) {
                    try {
                        j(dVar.a(width, height));
                    } finally {
                        dVar.c();
                    }
                }
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.H;
                    int size2 = arrayList2.size();
                    imageView = this.f49914x;
                    imageView2 = this.f49913w;
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
        if (z5Var.f33729i) {
            requestLayout();
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        int left;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i15 = i12 - i10;
        int max = Math.max(0, (i15 - paddingLeft) - paddingRight);
        int i16 = i15 - paddingRight;
        if (l8.b(this.f50175a) > 0) {
            i14 = AndroidUtilities.dp(16.0f);
        } else {
            i14 = 0;
        }
        this.v.g(paddingLeft - i14, paddingRight - i14, i15, getPaddingTop() + this.M);
        int dp = AndroidUtilities.dp(6.0f);
        int i17 = i16 - dp;
        ImageView imageView = this.f49913w;
        imageView.layout(i17 - imageView.getMeasuredWidth(), getPaddingTop() + dp, i17, imageView.getMeasuredHeight() + getPaddingTop() + dp);
        int i18 = i17 - dp;
        ImageView imageView2 = this.f49914x;
        imageView2.layout((i18 - imageView.getMeasuredWidth()) - imageView2.getMeasuredWidth(), getPaddingTop() + dp, i18 - imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + getPaddingTop() + dp);
        List m9 = m();
        int i19 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i19 < arrayList.size()) {
                ImageView imageView3 = (ImageView) arrayList.get(i19);
                int i20 = 8;
                if (i19 < m9.size() && ((t) m9.get(i19)).f50030a != 0) {
                    ArrayList arrayList2 = this.D;
                    if (i19 < arrayList2.size()) {
                        RectF rectF = (RectF) arrayList2.get(i19);
                        if (rectF.right > 0.0f && rectF.left < max && rectF.bottom > getPaddingTop() && rectF.top < getPaddingTop() + this.M) {
                            int i21 = ((int) rectF.left) + dp + paddingLeft;
                            int i22 = ((int) rectF.top) + dp;
                            imageView3.layout(i21, i22, imageView3.getMeasuredWidth() + i21, imageView3.getMeasuredHeight() + i22);
                            float f10 = 1.0f;
                            if (this.E) {
                                if (imageView2.getVisibility() == 0) {
                                    left = imageView2.getLeft();
                                } else {
                                    left = imageView.getLeft();
                                }
                                int dp2 = left - AndroidUtilities.dp(4.0f);
                                int measuredWidth = imageView3.getMeasuredWidth() + i21;
                                if (measuredWidth > dp2) {
                                    f10 = Math.max(0.0f, 1.0f - ((measuredWidth - dp2) / imageView3.getMeasuredWidth()));
                                }
                            }
                            imageView3.setAlpha(f10);
                            if (f10 > 0.01f) {
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
        throw new UnsupportedOperationException("Method not decompiled: wh.o4.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z10;
        VelocityTracker velocityTracker;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 0;
        if (y10 >= getPaddingTop() && y10 < getPaddingTop() + this.M) {
            z4 = true;
        } else {
            z4 = false;
        }
        int i11 = -1;
        if (l() && !this.R.f33729i) {
            ArrayList arrayList = this.f49915y;
            if (arrayList.size() >= 2) {
                if (actionMasked == 0) {
                    if (!z4) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.f49904b0 == 0) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                        this.f49904b0 = viewConfiguration.getScaledTouchSlop();
                        this.f49905c0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.f49906d0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.W = x10;
                    this.f49903a0 = y10;
                    this.V = false;
                    VelocityTracker velocityTracker2 = this.f49907e0;
                    if (velocityTracker2 == null) {
                        this.f49907e0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f49907e0.addMovement(motionEvent);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    ValueAnimator valueAnimator = this.f49908f0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f49908f0 = null;
                    }
                    this.Q = this.T;
                    return true;
                }
                float f10 = 0.0f;
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.f49907e0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float f11 = x10 - this.W;
                    float f12 = y10 - this.f49903a0;
                    if (!this.V && Math.abs(f11) > this.f49904b0 && Math.abs(f11) > Math.abs(f12)) {
                        this.V = true;
                        this.Q = -1;
                    }
                    if (this.V) {
                        float f13 = (-f11) / this.O;
                        int i12 = this.T;
                        if (i12 == 0 && f13 < 0.0f) {
                            f13 *= 0.3f;
                        }
                        if (i12 == arrayList.size() - 1 && f13 > 0.0f) {
                            f13 *= 0.3f;
                        }
                        this.U = f13;
                        requestLayout();
                        invalidate();
                        return true;
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    if (actionMasked == 1 && (velocityTracker = this.f49907e0) != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f49907e0.computeCurrentVelocity(1000, this.f49906d0);
                        float xVelocity = this.f49907e0.getXVelocity();
                        float yVelocity = this.f49907e0.getYVelocity();
                        if (Math.abs(xVelocity) >= this.f49905c0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                            f10 = xVelocity;
                        }
                    }
                    VelocityTracker velocityTracker4 = this.f49907e0;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                        this.f49907e0 = null;
                    }
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (this.V) {
                        this.V = false;
                        settle(f10);
                    } else if (actionMasked == 1) {
                        int i13 = this.Q;
                        int i14 = this.T;
                        if (i13 == i14) {
                            k(i14);
                        }
                    }
                    this.Q = -1;
                    return true;
                }
                return true;
            }
        }
        ArrayList arrayList2 = this.D;
        if (actionMasked == 0) {
            if (!z4) {
                return super.onTouchEvent(motionEvent);
            }
            while (true) {
                if (i10 >= arrayList2.size()) {
                    break;
                } else if (((RectF) arrayList2.get(i10)).contains(x10, y10)) {
                    i11 = i10;
                    break;
                } else {
                    i10++;
                }
            }
            this.Q = i11;
            return true;
        } else if (actionMasked == 1) {
            if (z4) {
                int i15 = 0;
                while (true) {
                    if (i15 < arrayList2.size()) {
                        if (((RectF) arrayList2.get(i15)).contains(x10, y10)) {
                            break;
                        }
                        i15++;
                    } else {
                        i15 = -1;
                        break;
                    }
                }
                int i16 = this.Q;
                if (i15 == i16) {
                    k(i16);
                }
            }
            if (this.Q == -1 && !z4) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.Q = -1;
            if (!z10 && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } else {
            if (actionMasked == 3) {
                this.Q = -1;
            }
            return super.onTouchEvent(motionEvent);
        }
    }
}
