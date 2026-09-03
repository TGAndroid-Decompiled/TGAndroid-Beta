package vh;

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
import k7.b6;
import k7.d6;
import k7.i8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.zz;
public final class p4 extends z implements org.telegram.ui.ActionBar.a6, k9, j0 {
    public static Paint f46139h0;
    public final ArrayList B;
    public final ArrayList C;
    public final ArrayList D;
    public final boolean E;
    public final sg.d F;
    public final db.a G;
    public final ArrayList H;
    public final HashMap I;
    public ih.j J;
    public l3 K;
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
    public float f46140a0;
    public int f46141b0;
    public int f46142c0;
    public int f46143d0;
    public VelocityTracker f46144e0;
    public ValueAnimator f46145f0;
    public final Path f46146g0;
    public final f6 f46147n;
    public final Paint f46148r;
    public final Paint f46149s;
    public final i0 v;
    public final ImageView f46150w;
    public final ImageView f46151x;
    public final ArrayList f46152y;

    public p4(Context context, f6 f6Var) {
        super(context);
        boolean z4;
        this.f46148r = new Paint(1);
        this.f46149s = new Paint(1);
        this.f46152y = new ArrayList();
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
        this.R = new org.telegram.ui.Components.z5(this, 0L, 320L, mr.h);
        this.f46146g0 = new Path();
        this.f46147n = f6Var;
        setWillNotDraw(false);
        g(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(4.0f));
        i0 i0Var = new i0(context, f6Var, new zz(this, 23));
        this.v = i0Var;
        addView(i0Var.f46006a, b6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        if (z4 && i10 >= 31) {
            sg.d dVar = new sg.d(new sg.c());
            this.F = dVar;
            dVar.g(AndroidUtilities.dp(24.0f));
            this.G = new db.a(24);
        }
        ImageView h = h();
        this.f46150w = h;
        h.setImageResource(R.drawable.iv_media_add);
        addView(h, b6.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        h.setOnClickListener(new m4(this, 1));
        ImageView h9 = h();
        this.f46151x = h9;
        h9.setVisibility(8);
        addView(h9, b6.d(32, 32.0f, 53, 12.0f, 12.0f, 66.0f, 12.0f));
        h9.setOnClickListener(new m4(this, 2));
        e();
    }

    private ih.j getSpoilerEffect() {
        if (!this.L) {
            return null;
        }
        ih.j jVar = this.J;
        if (jVar != null && jVar.f7580i) {
            this.J = null;
        }
        if (this.J == null) {
            this.J = ih.j.e(this);
        }
        return this.J;
    }

    private void settle(float f10) {
        int i10;
        int size = this.f46152y.size();
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
            this.f46145f0 = ofFloat;
            ofFloat.setDuration(220L);
            this.f46145f0.setInterpolator(mr.h);
            this.f46145f0.addUpdateListener(new nh.e5(this, 26));
            this.f46145f0.addListener(new org.telegram.ui.Cells.a4(this, i12, 11));
            this.f46145f0.start();
        }
        i10 = 1;
        int i112 = this.T;
        int i122 = i10 + i112;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.U, i122 - i112);
        this.f46145f0 = ofFloat2;
        ofFloat2.setDuration(220L);
        this.f46145f0.setInterpolator(mr.h);
        this.f46145f0.addUpdateListener(new nh.e5(this, 26));
        this.f46145f0.addListener(new org.telegram.ui.Cells.a4(this, i122, 11));
        this.f46145f0.start();
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
            a aVar = this.f46414a;
            if (aVar == null) {
                size = 0;
            } else {
                size = aVar.f45859k.size();
            }
            if (size > 0) {
                canvas.save();
                Path path = this.f46146g0;
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
        int i10 = j6.Gd;
        f6 f6Var = this.f46147n;
        this.f46148r.setColor(j6.v0(i10, f6Var));
        this.f46149s.setColor(j6.v0(j6.f20191uf, f6Var));
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
        return this.v.f46006a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public a getRow() {
        return this.f46414a;
    }

    public final ImageView h() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (this.E && Build.VERSION.SDK_INT >= 31) {
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            pg.c cVar = (pg.c) this.F.k();
            cVar.n(this.G);
            cVar.p(AndroidUtilities.dp(16.0f));
            this.I.put(imageView, cVar);
        } else {
            int i10 = j6.G6;
            f6 f6Var = this.f46147n;
            imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(i10, f6Var), PorterDuff.Mode.SRC_IN));
            int i11 = j6.f19881d6;
            imageView.setBackground(new x1(j6.Z(j6.v0(i11, f6Var), j6.v(j6.v0(i11, f6Var), j6.v0(j6.f19971i6, f6Var)), 20, 20)));
        }
        d6.a(imageView);
        this.H.add(imageView);
        return imageView;
    }

    public final void i(Canvas canvas, ImageView imageView) {
        pg.c cVar;
        if (imageView.getVisibility() != 0 || (cVar = (pg.c) this.I.get(imageView)) == null) {
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
        p4 p4Var = this;
        Canvas canvas2 = canvas;
        int paddingTop = p4Var.getPaddingTop();
        int paddingLeft = p4Var.getPaddingLeft();
        int i16 = 0;
        int max = Math.max(0, (p4Var.getWidth() - paddingLeft) - p4Var.getPaddingRight());
        canvas2.save();
        canvas2.translate(paddingLeft, 0.0f);
        a aVar = p4Var.f46414a;
        if (aVar == null) {
            size = 0;
        } else {
            size = aVar.f45859k.size();
        }
        if (size > 0) {
            Path path = p4Var.f46146g0;
            path.rewind();
            path.addRoundRect(0.0f, paddingTop, max, p4Var.M + paddingTop, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            canvas2.clipRect(0, paddingTop, max, p4Var.M + paddingTop);
        }
        boolean l10 = p4Var.l();
        int i17 = 1;
        ArrayList arrayList = p4Var.f46152y;
        if (l10 && arrayList.size() >= 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        a aVar2 = p4Var.f46414a;
        if (aVar2 == null) {
            size2 = 0;
        } else {
            size2 = aVar2.f45859k.size();
        }
        if (size2 > 0) {
            i10 = AndroidUtilities.dp(8.0f);
        } else {
            i10 = 0;
        }
        Paint paint = p4Var.f46148r;
        if (z4 && (((i15 = p4Var.T) == 0 && p4Var.U < 0.0f) || (i15 == arrayList.size() - 1 && p4Var.U > 0.0f))) {
            canvas2.drawRect(0.0f, paddingTop, max, p4Var.M + paddingTop, paint);
        }
        int size3 = arrayList.size();
        ArrayList arrayList2 = p4Var.D;
        if (size3 == 1 && arrayList2.size() == 1) {
            RectF rectF = (RectF) arrayList2.get(0);
            if (rectF.left > 0.5f || rectF.right < max - 0.5f) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, paddingTop, max, paddingTop + p4Var.M);
                s4 s4Var = (s4) arrayList.get(0);
                ImageReceiver imageReceiver = s4Var.f46244b;
                if (s4Var.b()) {
                    imageReceiver.setImageCoords(rectF2);
                    imageReceiver.setAlpha(s4Var.f46243a.getCurrentAlpha());
                    imageReceiver.draw(canvas2);
                }
            }
        }
        int i18 = 0;
        while (i18 < arrayList.size() && i18 < arrayList2.size()) {
            s4 s4Var2 = (s4) arrayList.get(i18);
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
                s4Var2.f46243a.setRoundRadius(i11, i12, i13, i14);
                s4Var2.f46244b.setRoundRadius(i11, i12, i13, i14);
            } else {
                s4Var2.f46243a.setRoundRadius(i16, i16, i16, i16);
                s4Var2.f46244b.setRoundRadius(i16, i16, i16, i16);
            }
            boolean c3 = s4Var2.c();
            ImageReceiver imageReceiver2 = s4Var2.f46243a;
            if (!c3) {
                canvas2.drawRect(rectF3, paint);
            }
            imageReceiver2.setImageCoords(Math.round(rectF3.left), Math.round(rectF3.top), Math.round(rectF3.width()), Math.round(rectF3.height()));
            if (s4Var2.c()) {
                imageReceiver2.draw(canvas2);
            }
            RadialProgress2 radialProgress2 = s4Var2.d;
            t tVar = s4Var2.e;
            if (tVar != null && tVar.a()) {
                int dp = AndroidUtilities.dp(48.0f);
                int round = Math.round(rectF3.centerX());
                int round2 = Math.round(rectF3.centerY());
                int i19 = dp / 2;
                radialProgress2.q(round - i19, round2 - i19, round + i19, round2 + i19);
                radialProgress2.o(s4Var2.e.f46250f, true);
                radialProgress2.draw(canvas2);
            }
            t tVar2 = s4Var2.e;
            if (tVar2 != null && tVar2.f46257n && s4Var2.c()) {
                ih.j spoilerEffect = p4Var.getSpoilerEffect();
                ImageReceiver imageReceiver3 = s4Var2.f46244b;
                canvas2.save();
                canvas2.clipRect(rectF3);
                if (s4Var2.b()) {
                    imageReceiver3.setImageCoords(rectF3);
                    imageReceiver3.setAlpha(imageReceiver2.getCurrentAlpha());
                    imageReceiver3.draw(canvas2);
                }
                if (spoilerEffect != null) {
                    canvas2.translate(rectF3.left, rectF3.top);
                    spoilerEffect.c(canvas2, p4Var, Math.round(rectF3.width()), Math.round(rectF3.height()), imageReceiver2.getCurrentAlpha(), false);
                }
                canvas.restore();
            }
            i18++;
            p4Var = this;
            canvas2 = canvas;
            i16 = 0;
            i17 = 1;
        }
        canvas.restore();
    }

    public final void k(int i10) {
        if (this.K != null && this.f46414a != null) {
            List m9 = m();
            if (!m9.isEmpty() && (m9.size() != 1 || ((t) m9.get(0)).f46247a != 0)) {
                if (i10 >= 0 && i10 < m9.size() && ((t) m9.get(i10)).a()) {
                    s3.M1(this.f46414a, (t) m9.get(i10), this.K.f46075a);
                    return;
                }
                return;
            }
            l3 l3Var = this.K;
            a aVar = this.f46414a;
            s3 s3Var = l3Var.f46075a;
            s3Var.Y3 = aVar;
            s3Var.f46209e3.n(0);
        }
    }

    public final boolean l() {
        a aVar = this.f46414a;
        if (aVar != null && (aVar.f45853b instanceof TL_iv.pageBlockSlideshow)) {
            return true;
        }
        return false;
    }

    public final List m() {
        a aVar = this.f46414a;
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f45853b;
            if ((pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                ArrayList arrayList = aVar.h;
                if (arrayList != null) {
                    return arrayList;
                }
                return Collections.EMPTY_LIST;
            }
        }
        t tVar = aVar.f45856g;
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
            arrayList = this.f46152y;
            if (arrayList.size() >= m9.size()) {
                break;
            }
            s4 s4Var = new s4(this, this.f46147n);
            if (this.L) {
                s4Var.f46243a.onAttachedToWindow();
                s4Var.f46244b.onAttachedToWindow();
                s4Var.a();
            }
            arrayList.add(s4Var);
        }
        while (arrayList.size() > m9.size()) {
            s4 s4Var2 = (s4) e2.c.g(1, arrayList);
            s4Var2.f46243a.onDetachedFromWindow();
            s4Var2.f46244b.onDetachedFromWindow();
            s4Var2.f46245c = null;
        }
        for (int i10 = 0; i10 < m9.size(); i10++) {
            s4 s4Var3 = (s4) arrayList.get(i10);
            s4Var3.e = (t) m9.get(i10);
            s4Var3.a();
        }
        while (true) {
            arrayList2 = this.B;
            if (arrayList2.size() >= m9.size()) {
                break;
            }
            ImageView h = h();
            h.setImageResource(R.drawable.iv_media_dots);
            h.setOnClickListener(new m4(this, 0));
            addView(h, b6.e(32, 32, 51));
            arrayList2.add(h);
        }
        this.f46150w.bringToFront();
        this.f46151x.bringToFront();
        while (arrayList2.size() > m9.size()) {
            View view = (ImageView) e2.c.g(1, arrayList2);
            removeView(view);
            this.H.remove(view);
            this.I.remove(view);
        }
        if (this.J != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                t tVar = ((s4) arrayList.get(i11)).e;
                if (tVar != null && tVar.f46257n) {
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
        if (this.f46152y.size() >= 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i11 = 8;
        }
        ImageView imageView = this.f46151x;
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
            ArrayList arrayList = this.f46152y;
            if (i10 < arrayList.size()) {
                s4 s4Var = (s4) arrayList.get(i10);
                s4Var.f46243a.onAttachedToWindow();
                s4Var.f46244b.onAttachedToWindow();
                s4Var.a();
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
        VelocityTracker velocityTracker = this.f46144e0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f46144e0 = null;
        }
        this.V = false;
        while (true) {
            ArrayList arrayList = this.f46152y;
            if (i10 >= arrayList.size()) {
                break;
            }
            s4 s4Var = (s4) arrayList.get(i10);
            s4Var.f46243a.onDetachedFromWindow();
            s4Var.f46244b.onDetachedFromWindow();
            s4Var.f46245c = null;
            i10++;
        }
        ih.j jVar = this.J;
        if (jVar != null) {
            jVar.b(this);
            this.J = null;
        }
        ValueAnimator valueAnimator = this.f46145f0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f46145f0 = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        sg.d dVar;
        ImageView imageView;
        ImageView imageView2;
        l9 textSelectionHelper;
        float f10;
        float f11;
        int dp;
        float f12;
        float dp2;
        int paddingTop = getPaddingTop();
        j(canvas);
        org.telegram.ui.Components.z5 z5Var = this.R;
        float f13 = z5Var.f31253c;
        ArrayList arrayList = this.f46152y;
        if (arrayList.size() >= 2 && f13 > 0.001f) {
            if (f46139h0 == null) {
                Paint paint = new Paint(1);
                f46139h0 = paint;
                paint.setColor(-1);
                f46139h0.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dpf2(1.0f), Integer.MIN_VALUE);
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
                f46139h0.setAlpha((int) e2.c.y(max2, 95.0f, 160.0f, f13));
                canvas.drawCircle(AndroidUtilities.dp(f12) + dp2 + (AndroidUtilities.dp(f10) * i10), dp3, (AndroidUtilities.dp(1.0f) * max2) + AndroidUtilities.dp(2.0f), f46139h0);
            }
            canvas.restore();
        }
        l3 l3Var = this.K;
        if (l3Var != null && (textSelectionHelper = l3Var.f46075a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.f21331u0 && R <= textSelectionHelper.f21334x0) {
                canvas.drawRect(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), paddingTop + this.M, this.f46149s);
            }
        }
        if (this.E && (dVar = this.F) != null && Build.VERSION.SDK_INT >= 31) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                if (canvas.isHardwareAccelerated() && !dVar.f44379n) {
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
                    imageView = this.f46151x;
                    imageView2 = this.f46150w;
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
        if (z5Var.f31256i) {
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
        if (i8.b(this.f46414a) > 0) {
            i14 = AndroidUtilities.dp(16.0f);
        } else {
            i14 = 0;
        }
        this.v.g(paddingLeft - i14, paddingRight - i14, i15, getPaddingTop() + this.M);
        int dp = AndroidUtilities.dp(6.0f);
        int i17 = i16 - dp;
        ImageView imageView = this.f46150w;
        imageView.layout(i17 - imageView.getMeasuredWidth(), getPaddingTop() + dp, i17, imageView.getMeasuredHeight() + getPaddingTop() + dp);
        int i18 = i17 - dp;
        ImageView imageView2 = this.f46151x;
        imageView2.layout((i18 - imageView.getMeasuredWidth()) - imageView2.getMeasuredWidth(), getPaddingTop() + dp, i18 - imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + getPaddingTop() + dp);
        List m9 = m();
        int i19 = 0;
        while (true) {
            ArrayList arrayList = this.B;
            if (i19 < arrayList.size()) {
                ImageView imageView3 = (ImageView) arrayList.get(i19);
                int i20 = 8;
                if (i19 < m9.size() && ((t) m9.get(i19)).f46247a != 0) {
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
        throw new UnsupportedOperationException("Method not decompiled: vh.p4.onMeasure(int, int):void");
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
        if (l() && !this.R.f31256i) {
            ArrayList arrayList = this.f46152y;
            if (arrayList.size() >= 2) {
                if (actionMasked == 0) {
                    if (!z4) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.f46141b0 == 0) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                        this.f46141b0 = viewConfiguration.getScaledTouchSlop();
                        this.f46142c0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.f46143d0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.W = x10;
                    this.f46140a0 = y10;
                    this.V = false;
                    VelocityTracker velocityTracker2 = this.f46144e0;
                    if (velocityTracker2 == null) {
                        this.f46144e0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f46144e0.addMovement(motionEvent);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    ValueAnimator valueAnimator = this.f46145f0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f46145f0 = null;
                    }
                    this.Q = this.T;
                    return true;
                }
                float f10 = 0.0f;
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.f46144e0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float f11 = x10 - this.W;
                    float f12 = y10 - this.f46140a0;
                    if (!this.V && Math.abs(f11) > this.f46141b0 && Math.abs(f11) > Math.abs(f12)) {
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
                    if (actionMasked == 1 && (velocityTracker = this.f46144e0) != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f46144e0.computeCurrentVelocity(1000, this.f46143d0);
                        float xVelocity = this.f46144e0.getXVelocity();
                        float yVelocity = this.f46144e0.getYVelocity();
                        if (Math.abs(xVelocity) >= this.f46142c0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                            f10 = xVelocity;
                        }
                    }
                    VelocityTracker velocityTracker4 = this.f46144e0;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                        this.f46144e0 = null;
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
