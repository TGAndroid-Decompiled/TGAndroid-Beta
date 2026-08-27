package rh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
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
import h7.b6;
import h7.z5;
import h7.z6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.y5;

public final class m4 extends y implements org.telegram.ui.ActionBar.x5, i9, i0 {

    public static Paint f47272g0;
    public final ArrayList A;
    public final ArrayList B;
    public final ArrayList C;
    public final boolean D;
    public final og.d E;
    public final e7.v F;
    public final ArrayList G;
    public final HashMap H;
    public eh.j I;
    public i3 J;
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

    public int f47273a0;

    public int f47274b0;

    public int f47275c0;

    public VelocityTracker f47276d0;

    public ValueAnimator f47277e0;

    public final Path f47278f0;

    public final c6 f47279n;

    public final Paint f47280r;

    public final Paint f47281s;
    public final h0 v;

    public final ImageView f47282w;

    public final ImageView f47283x;

    public final ArrayList f47284y;

    public m4(Context context, c6 c6Var) {
        super(context);
        this.f47280r = new Paint(1);
        this.f47281s = new Paint(1);
        this.f47284y = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = i10 >= 31 && SharedConfig.chatBlurEnabled();
        this.D = z10;
        this.G = new ArrayList();
        this.H = new HashMap();
        this.P = -1;
        this.Q = new y5(this, 0L, 320L, er.h);
        this.f47278f0 = new Path();
        this.f47279n = c6Var;
        setWillNotDraw(false);
        g(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(4.0f));
        h0 h0Var = new h0(context, c6Var, new m5.o(this, 20));
        this.v = h0Var;
        addView(h0Var.f47171a, z5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        if (z10 && i10 >= 31) {
            og.d dVar = new og.d(new og.c());
            this.E = dVar;
            dVar.f(AndroidUtilities.dp(24.0f));
            this.F = new e7.v(22);
        }
        ImageView imageViewH = h();
        this.f47282w = imageViewH;
        imageViewH.setImageResource(R.drawable.iv_media_add);
        addView(imageViewH, z5.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        imageViewH.setOnClickListener(new j4(this, 1));
        ImageView imageViewH2 = h();
        this.f47283x = imageViewH2;
        imageViewH2.setVisibility(8);
        addView(imageViewH2, z5.d(32, 32.0f, 53, 12.0f, 12.0f, 66.0f, 12.0f));
        imageViewH2.setOnClickListener(new j4(this, 2));
        d();
    }

    private eh.j getSpoilerEffect() {
        if (!this.K) {
            return null;
        }
        eh.j jVar = this.I;
        if (jVar != null && jVar.f5506i) {
            this.I = null;
        }
        if (this.I == null) {
            this.I = eh.j.e(this);
        }
        return this.I;
    }

    private void settle(float f10) {
        int i10;
        int size = this.f47284y.size();
        if (f10 >= 0.0f || this.S >= size - 1) {
            i10 = -1;
            if (f10 <= 0.0f || this.S <= 0) {
                float f11 = this.T;
                if (f11 > 0.5f && this.S < size - 1) {
                    i10 = 1;
                } else if (f11 >= -0.5f || this.S <= 0) {
                    i10 = 0;
                }
            }
        } else {
            i10 = 1;
        }
        int i11 = this.S;
        int i12 = i10 + i11;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.T, i12 - i11);
        this.f47277e0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(220L);
        this.f47277e0.setInterpolator(er.h);
        this.f47277e0.addUpdateListener(new lh.m2(this, 20));
        this.f47277e0.addListener(new nh.n2(this, i12, 11));
        this.f47277e0.start();
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
    public final void d() {
        int i10 = g6.Gd;
        c6 c6Var = this.f47279n;
        this.f47280r.setColor(g6.v0(i10, c6Var));
        this.f47281s.setColor(g6.v0(g6.f23366uf, c6Var));
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
        if (this.A.contains(view)) {
            a aVar = this.f47594a;
            if ((aVar == null ? 0 : aVar.f47035k.size()) > 0) {
                canvas.save();
                Path path = this.f47278f0;
                path.rewind();
                path.addRoundRect(getPaddingLeft(), getPaddingTop(), Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight()) + getPaddingLeft(), getPaddingTop() + this.L, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean zDrawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return zDrawChild;
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
        return this.v.f47171a;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public a getRow() {
        return this.f47594a;
    }

    public final ImageView h() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (!this.D || Build.VERSION.SDK_INT < 31) {
            int i10 = g6.G6;
            c6 c6Var = this.f47279n;
            imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(i10, c6Var), PorterDuff.Mode.SRC_IN));
            int i11 = g6.f23053d6;
            imageView.setBackground(new w1(g6.Z(g6.v0(i11, c6Var), g6.v(g6.v0(i11, c6Var), g6.v0(g6.f23144i6, c6Var)), 20, 20)));
        } else {
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            lg.e eVar = (lg.e) this.E.w();
            eVar.n(this.F);
            eVar.p(AndroidUtilities.dp(16.0f));
            this.H.put(imageView, eVar);
        }
        b6.a(imageView);
        this.G.add(imageView);
        return imageView;
    }

    public final void i(Canvas canvas, ImageView imageView) {
        lg.e eVar;
        if (imageView.getVisibility() == 0 && (eVar = (lg.e) this.H.get(imageView)) != null) {
            eVar.setBounds(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
            eVar.setAlpha((int) (imageView.getAlpha() * 255.0f));
            eVar.M = true;
            eVar.draw(canvas);
        }
    }

    public final void j(Canvas canvas) {
        int i10;
        m4 m4Var = this;
        Canvas canvas2 = canvas;
        int paddingTop = m4Var.getPaddingTop();
        int paddingLeft = m4Var.getPaddingLeft();
        int i11 = 0;
        int iMax = Math.max(0, (m4Var.getWidth() - paddingLeft) - m4Var.getPaddingRight());
        canvas2.save();
        canvas2.translate(paddingLeft, 0.0f);
        a aVar = m4Var.f47594a;
        if ((aVar == null ? 0 : aVar.f47035k.size()) > 0) {
            Path path = m4Var.f47278f0;
            path.rewind();
            path.addRoundRect(0.0f, paddingTop, iMax, m4Var.L + paddingTop, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            canvas2.clipRect(0, paddingTop, iMax, m4Var.L + paddingTop);
        }
        boolean zL = m4Var.l();
        int i12 = 1;
        ArrayList arrayList = m4Var.f47284y;
        boolean z10 = zL && arrayList.size() >= 2;
        a aVar2 = m4Var.f47594a;
        int iDp = (aVar2 == null ? 0 : aVar2.f47035k.size()) > 0 ? AndroidUtilities.dp(8.0f) : 0;
        Paint paint = m4Var.f47280r;
        if (z10 && (((i10 = m4Var.S) == 0 && m4Var.T < 0.0f) || (i10 == arrayList.size() - 1 && m4Var.T > 0.0f))) {
            canvas2.drawRect(0.0f, paddingTop, iMax, m4Var.L + paddingTop, paint);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = m4Var.C;
        if (size == 1 && arrayList2.size() == 1) {
            RectF rectF = (RectF) arrayList2.get(0);
            if (rectF.left > 0.5f || rectF.right < iMax - 0.5f) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, paddingTop, iMax, paddingTop + m4Var.L);
                p4 p4Var = (p4) arrayList.get(0);
                ImageReceiver imageReceiver = p4Var.f47376b;
                if (p4Var.b()) {
                    imageReceiver.setImageCoords(rectF2);
                    imageReceiver.setAlpha(p4Var.f47375a.getCurrentAlpha());
                    imageReceiver.draw(canvas2);
                }
            }
        }
        int i13 = 0;
        while (i13 < arrayList.size() && i13 < arrayList2.size()) {
            p4 p4Var2 = (p4) arrayList.get(i13);
            RectF rectF3 = (RectF) arrayList2.get(i13);
            if (z10) {
                int i14 = i13 == 0 ? iDp : 0;
                int i15 = i13 == arrayList.size() - i12 ? iDp : 0;
                int i16 = i13 == arrayList.size() - i12 ? iDp : 0;
                int i17 = i13 == 0 ? iDp : 0;
                p4Var2.f47375a.setRoundRadius(i14, i15, i16, i17);
                p4Var2.f47376b.setRoundRadius(i14, i15, i16, i17);
            } else {
                p4Var2.f47375a.setRoundRadius(i11, i11, i11, i11);
                p4Var2.f47376b.setRoundRadius(i11, i11, i11, i11);
            }
            boolean zC = p4Var2.c();
            ImageReceiver imageReceiver2 = p4Var2.f47375a;
            if (!zC) {
                canvas2.drawRect(rectF3, paint);
            }
            imageReceiver2.setImageCoords(Math.round(rectF3.left), Math.round(rectF3.top), Math.round(rectF3.width()), Math.round(rectF3.height()));
            if (p4Var2.c()) {
                imageReceiver2.draw(canvas2);
            }
            RadialProgress2 radialProgress2 = p4Var2.d;
            s sVar = p4Var2.f47378e;
            if (sVar != null && sVar.a()) {
                int iDp2 = AndroidUtilities.dp(48.0f);
                int iRound = Math.round(rectF3.centerX());
                int iRound2 = Math.round(rectF3.centerY());
                int i18 = iDp2 / 2;
                radialProgress2.q(iRound - i18, iRound2 - i18, iRound + i18, iRound2 + i18);
                radialProgress2.o(p4Var2.f47378e.f47418f, true);
                radialProgress2.draw(canvas2);
            }
            s sVar2 = p4Var2.f47378e;
            if (sVar2 != null && sVar2.f47425n && p4Var2.c()) {
                eh.j spoilerEffect = m4Var.getSpoilerEffect();
                ImageReceiver imageReceiver3 = p4Var2.f47376b;
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
            i13++;
            m4Var = this;
            canvas2 = canvas;
            i11 = 0;
            i12 = 1;
        }
        canvas.restore();
    }

    public final void k(int i10) {
        if (this.J == null || this.f47594a == null) {
            return;
        }
        List listM = m();
        if (listM.isEmpty() || (listM.size() == 1 && ((s) listM.get(0)).f47414a == 0)) {
            i3 i3Var = this.J;
            a aVar = this.f47594a;
            p3 p3Var = i3Var.f47191a;
            p3Var.X3 = aVar;
            p3Var.f47340d3.c0(0);
            return;
        }
        if (i10 < 0 || i10 >= listM.size() || !((s) listM.get(i10)).a()) {
            return;
        }
        p3.N1(this.f47594a, (s) listM.get(i10), this.J.f47191a);
    }

    public final boolean l() {
        a aVar = this.f47594a;
        return aVar != null && (aVar.f47028b instanceof TL_iv.pageBlockSlideshow);
    }

    public final List m() {
        a aVar = this.f47594a;
        if (aVar == null) {
            return Collections.EMPTY_LIST;
        }
        if (aVar != null) {
            TL_iv.PageBlock pageBlock = aVar.f47028b;
            if ((pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                ArrayList arrayList = aVar.h;
                return arrayList != null ? arrayList : Collections.EMPTY_LIST;
            }
        }
        s sVar = aVar.f47032g;
        return sVar != null ? Collections.singletonList(sVar) : Collections.EMPTY_LIST;
    }

    public final void n() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List listM = m();
        while (true) {
            arrayList = this.f47284y;
            if (arrayList.size() >= listM.size()) {
                break;
            }
            p4 p4Var = new p4(this, this.f47279n);
            if (this.K) {
                p4Var.f47375a.onAttachedToWindow();
                p4Var.f47376b.onAttachedToWindow();
                p4Var.a();
            }
            arrayList.add(p4Var);
        }
        while (arrayList.size() > listM.size()) {
            p4 p4Var2 = (p4) com.google.android.recaptcha.internal.a.k(1, arrayList);
            p4Var2.f47375a.onDetachedFromWindow();
            p4Var2.f47376b.onDetachedFromWindow();
            p4Var2.f47377c = null;
        }
        for (int i10 = 0; i10 < listM.size(); i10++) {
            p4 p4Var3 = (p4) arrayList.get(i10);
            p4Var3.f47378e = (s) listM.get(i10);
            p4Var3.a();
        }
        while (true) {
            arrayList2 = this.A;
            if (arrayList2.size() >= listM.size()) {
                break;
            }
            ImageView imageViewH = h();
            imageViewH.setImageResource(R.drawable.iv_media_dots);
            imageViewH.setOnClickListener(new j4(this, 0));
            addView(imageViewH, z5.e(32, 32, 51));
            arrayList2.add(imageViewH);
        }
        this.f47282w.bringToFront();
        this.f47283x.bringToFront();
        while (arrayList2.size() > listM.size()) {
            ImageView imageView = (ImageView) com.google.android.recaptcha.internal.a.k(1, arrayList2);
            removeView(imageView);
            this.G.remove(imageView);
            this.H.remove(imageView);
        }
        if (this.I != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                s sVar = ((p4) arrayList.get(i11)).f47378e;
                if (sVar != null && sVar.f47425n) {
                    return;
                }
            }
            this.I.b(this);
            this.I = null;
        }
    }

    public final void o(boolean z10) {
        boolean z11 = this.f47284y.size() >= 2;
        int i10 = z11 ? 0 : 8;
        ImageView imageView = this.f47283x;
        imageView.setVisibility(i10);
        if (z11) {
            int i11 = l() ? R.drawable.iv_media_slideshow : R.drawable.iv_media_collage;
            if (i11 == this.R) {
                return;
            }
            this.R = i11;
            if (z10) {
                AndroidUtilities.updateImageViewImageAnimated(imageView, i11);
            } else {
                imageView.setImageResource(i11);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47284y;
            if (i10 >= arrayList.size()) {
                return;
            }
            p4 p4Var = (p4) arrayList.get(i10);
            p4Var.f47375a.onAttachedToWindow();
            p4Var.f47376b.onAttachedToWindow();
            p4Var.a();
            i10++;
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
        VelocityTracker velocityTracker = this.f47276d0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f47276d0 = null;
        }
        this.U = false;
        while (true) {
            ArrayList arrayList = this.f47284y;
            if (i10 >= arrayList.size()) {
                break;
            }
            p4 p4Var = (p4) arrayList.get(i10);
            p4Var.f47375a.onDetachedFromWindow();
            p4Var.f47376b.onDetachedFromWindow();
            p4Var.f47377c = null;
            i10++;
        }
        eh.j jVar = this.I;
        if (jVar != null) {
            jVar.b(this);
            this.I = null;
        }
        ValueAnimator valueAnimator = this.f47277e0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f47277e0 = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        og.d dVar;
        ImageView imageView;
        ImageView imageView2;
        j9 textSelectionHelper;
        float f10;
        float f11;
        float f12;
        float fClamp;
        int paddingTop = getPaddingTop();
        j(canvas);
        y5 y5Var = this.Q;
        float f13 = y5Var.f34812c;
        ArrayList arrayList = this.f47284y;
        if (arrayList.size() >= 2 && f13 > 0.001f) {
            if (f47272g0 == null) {
                Paint paint = new Paint(1);
                f47272g0 = paint;
                paint.setColor(-1);
                f47272g0.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dpf2(1.0f), Integer.MIN_VALUE);
            }
            int size = arrayList.size();
            float fDp = AndroidUtilities.dp(5.0f) + ((getPaddingTop() + this.L) - AndroidUtilities.dp(23.0f));
            int iDp = AndroidUtilities.dp(4.0f) + org.telegram.messenger.y1.D(6.0f, size - 1, AndroidUtilities.dp(7.0f) * size);
            int paddingLeft = getPaddingLeft();
            int iMax = Math.max(0, (getWidth() - paddingLeft) - getPaddingRight());
            float f14 = this.S + this.T;
            if (iDp < iMax) {
                f10 = 13.0f;
                fClamp = ((iMax - iDp) / 2.0f) + paddingLeft;
                f11 = 23.0f;
                f12 = 4.0f;
            } else {
                f10 = 13.0f;
                float fDp2 = AndroidUtilities.dp(4.0f) + paddingLeft;
                int iDp2 = AndroidUtilities.dp(13.0f);
                f11 = 23.0f;
                int iDp3 = ((iMax - AndroidUtilities.dp(8.0f)) / 2) / iDp2;
                f12 = 4.0f;
                fClamp = fDp2 - (Utilities.clamp(f14 - iDp3, Math.max(0, (size - (iDp3 * 2)) - 1), 0.0f) * iDp2);
            }
            canvas.save();
            canvas.clipRect(paddingLeft, (getPaddingTop() + this.L) - AndroidUtilities.dp(f11), iMax + paddingLeft, getPaddingTop() + this.L);
            for (int i10 = 0; i10 < size; i10++) {
                float fMax = Math.max(0.0f, 1.0f - Math.abs(i10 - f14));
                float fDp3 = (AndroidUtilities.dp(1.0f) * fMax) + AndroidUtilities.dp(2.0f);
                f47272g0.setAlpha((int) com.google.android.recaptcha.internal.a.B(fMax, 95.0f, 160.0f, f13));
                canvas.drawCircle(AndroidUtilities.dp(f12) + fClamp + (AndroidUtilities.dp(f10) * i10), fDp, fDp3, f47272g0);
            }
            canvas.restore();
        }
        i3 i3Var = this.J;
        if (i3Var != null && (textSelectionHelper = i3Var.f47191a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int iR = RecyclerView.R(this);
            if (iR >= 0 && iR > textSelectionHelper.f24540u0 && iR <= textSelectionHelper.f24543x0) {
                canvas.drawRect(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), paddingTop + this.L, this.f47281s);
            }
        }
        if (this.D && (dVar = this.E) != null && Build.VERSION.SDK_INT >= 31) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                if (canvas.isHardwareAccelerated() && !dVar.f19455n) {
                    try {
                        j(dVar.a(width, height));
                        dVar.b();
                    } catch (Throwable th) {
                        dVar.b();
                        throw th;
                    }
                }
                int i11 = 0;
                while (true) {
                    ArrayList arrayList2 = this.G;
                    int size2 = arrayList2.size();
                    imageView = this.f47283x;
                    imageView2 = this.f47282w;
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
        if (y5Var.f34816i) {
            requestLayout();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i14 = i12 - i10;
        int iMax = Math.max(0, (i14 - paddingLeft) - paddingRight);
        int i15 = i14 - paddingRight;
        int iDp = z6.b(this.f47594a) > 0 ? AndroidUtilities.dp(16.0f) : 0;
        this.v.g(paddingLeft - iDp, paddingRight - iDp, i14, getPaddingTop() + this.L);
        int iDp2 = AndroidUtilities.dp(6.0f);
        int i16 = i15 - iDp2;
        ImageView imageView = this.f47282w;
        imageView.layout(i16 - imageView.getMeasuredWidth(), getPaddingTop() + iDp2, i16, imageView.getMeasuredHeight() + getPaddingTop() + iDp2);
        int i17 = i16 - iDp2;
        int measuredWidth = i17 - imageView.getMeasuredWidth();
        ImageView imageView2 = this.f47283x;
        imageView2.layout(measuredWidth - imageView2.getMeasuredWidth(), getPaddingTop() + iDp2, i17 - imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + getPaddingTop() + iDp2);
        List listM = m();
        int i18 = 0;
        while (true) {
            ArrayList arrayList = this.A;
            if (i18 >= arrayList.size()) {
                return;
            }
            ImageView imageView3 = (ImageView) arrayList.get(i18);
            if (i18 >= listM.size() || ((s) listM.get(i18)).f47414a == 0) {
                imageView3.setVisibility(8);
            } else {
                ArrayList arrayList2 = this.C;
                if (i18 >= arrayList2.size()) {
                    imageView3.setVisibility(8);
                } else {
                    RectF rectF = (RectF) arrayList2.get(i18);
                    if (rectF.right <= 0.0f || rectF.left >= iMax || rectF.bottom <= getPaddingTop() || rectF.top >= getPaddingTop() + this.L) {
                        imageView3.setVisibility(8);
                    } else {
                        int i19 = ((int) rectF.left) + iDp2 + paddingLeft;
                        int i20 = ((int) rectF.top) + iDp2;
                        imageView3.layout(i19, i20, imageView3.getMeasuredWidth() + i19, imageView3.getMeasuredHeight() + i20);
                        float fMax = 1.0f;
                        if (this.D) {
                            int left = (imageView2.getVisibility() == 0 ? imageView2.getLeft() : imageView.getLeft()) - AndroidUtilities.dp(4.0f);
                            int measuredWidth2 = imageView3.getMeasuredWidth() + i19;
                            if (measuredWidth2 > left) {
                                fMax = Math.max(0.0f, 1.0f - ((measuredWidth2 - left) / imageView3.getMeasuredWidth()));
                            }
                        }
                        imageView3.setAlpha(fMax);
                        imageView3.setVisibility(fMax > 0.01f ? 0 : 8);
                    }
                }
            }
            i18++;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        MessageObject.GroupedMessagePosition[] groupedMessagePositionArr;
        int iRound;
        int i14;
        MessageObject.GroupedMessagePosition[] groupedMessagePositionArr2;
        int i15;
        float[] fArr;
        int i16;
        int i17;
        int iDp;
        int iMax;
        ArrayList arrayList;
        int size;
        int iDp2;
        int i18;
        ArrayList arrayList2;
        int paddingTop;
        float f10;
        int i19;
        int size2 = View.MeasureSpec.getSize(i10);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int iMax2 = Math.max(0, (size2 - paddingLeft) - paddingRight);
        float f11 = l() ? 1.0f : 0.0f;
        y5 y5Var = this.Q;
        float fD = y5Var.d(f11, false);
        ArrayList arrayList3 = this.B;
        arrayList3.clear();
        int paddingTop2 = getPaddingTop();
        ArrayList arrayList4 = this.f47284y;
        int size3 = arrayList4.size();
        if (size3 != 0) {
            if (size3 == 1) {
                p4 p4Var = (p4) arrayList4.get(0);
                int i20 = p4Var.f47378e == null ? 0 : p4Var.d() ? p4Var.f47378e.f47422k : p4Var.f47378e.f47421j;
                if (p4Var.f47378e == null) {
                    i17 = 0;
                } else {
                    boolean zD = p4Var.d();
                    s sVar = p4Var.f47378e;
                    i17 = zD ? sVar.f47421j : sVar.f47422k;
                }
                if (i20 <= 0 || i17 <= 0) {
                    iDp = (AndroidUtilities.dp(200.0f) - getPaddingTop()) - getPaddingBottom();
                } else {
                    iDp = (int) ((iMax2 / Math.max(1, i20)) * i17);
                    Point point = AndroidUtilities.displaySize;
                    int iMax3 = (int) (Math.max(point.x, point.y) * 0.55f);
                    if (iDp > iMax3) {
                        iMax = (int) ((iMax3 / Math.max(1, i17)) * i20);
                        iDp = iMax3;
                    }
                    int i21 = (iMax2 - iMax) / 2;
                    arrayList3.add(new RectF(i21, paddingTop2, i21 + iMax, paddingTop2 + iDp));
                    this.M = iDp;
                    this.N = iMax;
                    this.O = iDp;
                }
                iMax = iMax2;
                int i22 = (iMax2 - iMax) / 2;
                arrayList3.add(new RectF(i22, paddingTop2, i22 + iMax, paddingTop2 + iDp));
                this.M = iDp;
                this.N = iMax;
                this.O = iDp;
            } else {
                float[] fArr2 = new float[size3];
                for (int i23 = 0; i23 < size3; i23++) {
                    p4 p4Var2 = (p4) arrayList4.get(i23);
                    int i24 = p4Var2.f47378e == null ? 0 : p4Var2.d() ? p4Var2.f47378e.f47422k : p4Var2.f47378e.f47421j;
                    if (p4Var2.f47378e == null) {
                        i16 = 0;
                    } else {
                        boolean zD2 = p4Var2.d();
                        s sVar2 = p4Var2.f47378e;
                        i16 = zD2 ? sVar2.f47421j : sVar2.f47422k;
                    }
                    fArr2[i23] = (i24 <= 0 || i16 <= 0) ? 1.0f : i24 / i16;
                }
                MessageObject.GroupedMessagePosition[] groupedMessagePositionArrComputeGrouped = RichMessageLayout.computeGrouped(fArr2);
                int iMax4 = 0;
                for (MessageObject.GroupedMessagePosition groupedMessagePosition : groupedMessagePositionArrComputeGrouped) {
                    iMax4 = Math.max(iMax4, (int) groupedMessagePosition.maxY);
                }
                int i25 = iMax4 + 1;
                float[] fArr3 = new float[i25];
                int length = groupedMessagePositionArrComputeGrouped.length;
                int i26 = 0;
                while (i26 < length) {
                    int i27 = i26;
                    MessageObject.GroupedMessagePosition groupedMessagePosition2 = groupedMessagePositionArrComputeGrouped[i27];
                    int i28 = paddingRight;
                    byte b10 = groupedMessagePosition2.minY;
                    int i29 = i25;
                    if (b10 == groupedMessagePosition2.maxY) {
                        fArr3[b10] = Math.max(fArr3[b10], groupedMessagePosition2.f19619ph);
                    }
                    i26 = i27 + 1;
                    paddingRight = i28;
                    i25 = i29;
                }
                i12 = paddingRight;
                int i30 = i25;
                int length2 = groupedMessagePositionArrComputeGrouped.length;
                int i31 = 0;
                while (i31 < length2) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition3 = groupedMessagePositionArrComputeGrouped[i31];
                    int i32 = groupedMessagePosition3.minY;
                    int i33 = length2;
                    byte b11 = groupedMessagePosition3.maxY;
                    if (i32 != b11) {
                        int i34 = (b11 - i32) + 1;
                        i15 = i31;
                        float[] fArr4 = groupedMessagePosition3.siblingHeights;
                        if (fArr4 == null || fArr4.length != i34) {
                            fArr = fArr3;
                            float f12 = groupedMessagePosition3.f19619ph / i34;
                            while (i32 <= groupedMessagePosition3.maxY) {
                                fArr[i32] = Math.max(fArr[i32], f12);
                                i32++;
                            }
                        } else {
                            int i35 = 0;
                            while (i35 < i34) {
                                int i36 = groupedMessagePosition3.minY + i35;
                                int i37 = i35;
                                float[] fArr5 = fArr3;
                                fArr5[i36] = Math.max(fArr3[i36], groupedMessagePosition3.siblingHeights[i37]);
                                i35 = i37 + 1;
                                fArr3 = fArr5;
                            }
                        }
                        i31 = i15 + 1;
                        length2 = i33;
                        fArr3 = fArr;
                    } else {
                        i15 = i31;
                    }
                    fArr = fArr3;
                    i31 = i15 + 1;
                    length2 = i33;
                    fArr3 = fArr;
                }
                float[] fArr6 = fArr3;
                Point point2 = AndroidUtilities.displaySize;
                float fMax = Math.max(point2.x, point2.y) * 0.5f;
                int[] iArr = new int[iMax4 + 2];
                float f13 = 0.0f;
                for (int i38 = 0; i38 <= iMax4; i38++) {
                    iArr[i38] = Math.round(f13 * fMax);
                    f13 += fArr6[i38];
                }
                iArr[i30] = Math.round(f13 * fMax);
                int iDp3 = AndroidUtilities.dp(2.0f);
                int i39 = 0;
                while (i39 < groupedMessagePositionArrComputeGrouped.length) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition4 = groupedMessagePositionArrComputeGrouped[i39];
                    int i40 = iArr[groupedMessagePosition4.minY];
                    int i41 = iArr[groupedMessagePosition4.maxY + 1] - i40;
                    int i42 = iDp3;
                    int i43 = groupedMessagePosition4.leftSpanOffset;
                    if (i43 > 0) {
                        iRound = Math.round((i43 * iMax2) / 1000.0f);
                        groupedMessagePositionArr = groupedMessagePositionArrComputeGrouped;
                    } else {
                        int i44 = 0;
                        int i45 = 0;
                        while (i44 < groupedMessagePositionArrComputeGrouped.length) {
                            if (i44 == i39) {
                                i14 = i44;
                                groupedMessagePositionArr2 = groupedMessagePositionArrComputeGrouped;
                            } else {
                                MessageObject.GroupedMessagePosition groupedMessagePosition5 = groupedMessagePositionArrComputeGrouped[i44];
                                i14 = i44;
                                byte b12 = groupedMessagePosition5.minY;
                                groupedMessagePositionArr2 = groupedMessagePositionArrComputeGrouped;
                                byte b13 = groupedMessagePosition4.minY;
                                if (b12 <= b13 && groupedMessagePosition5.maxY >= b13 && groupedMessagePosition5.minX < groupedMessagePosition4.minX) {
                                    i45 += groupedMessagePosition5.pw;
                                }
                            }
                            i44 = i14 + 1;
                            groupedMessagePositionArrComputeGrouped = groupedMessagePositionArr2;
                        }
                        groupedMessagePositionArr = groupedMessagePositionArrComputeGrouped;
                        iRound = Math.round((i45 * iMax2) / 1000.0f);
                    }
                    int i46 = i40 + paddingTop2;
                    arrayList3.add(new RectF(iRound, i46, Math.max(0, (groupedMessagePosition4.flags & 2) != 0 ? iMax2 - iRound : Math.round((groupedMessagePosition4.pw * iMax2) / 1000.0f) - i42) + iRound, Math.max(0, (groupedMessagePosition4.flags & 8) == 0 ? i41 - i42 : i41) + i46));
                    i39++;
                    iDp3 = i42;
                    iArr = iArr;
                    groupedMessagePositionArrComputeGrouped = groupedMessagePositionArr;
                }
                this.M = iArr[i30];
                this.N = iMax2;
                float f14 = 0.0f;
                for (int i47 = 0; i47 < size3; i47++) {
                    p4 p4Var3 = (p4) arrayList4.get(i47);
                    int i48 = p4Var3.f47378e == null ? 0 : p4Var3.d() ? p4Var3.f47378e.f47422k : p4Var3.f47378e.f47421j;
                    if (p4Var3.f47378e == null) {
                        i13 = 0;
                    } else {
                        boolean zD3 = p4Var3.d();
                        s sVar3 = p4Var3.f47378e;
                        i13 = zD3 ? sVar3.f47421j : sVar3.f47422k;
                    }
                    f14 = ((i48 <= 0 || i13 <= 0) ? 1.0f : i48 / i13) + f14;
                }
                int iMax5 = (int) (this.N / Math.max(0.5f, f14 / size3));
                Point point3 = AndroidUtilities.displaySize;
                int iMax6 = (int) (Math.max(point3.x, point3.y) * 0.55f);
                if (iMax5 > iMax6) {
                    iMax5 = iMax6;
                }
                this.O = iMax5;
            }
            this.L = Math.round(AndroidUtilities.lerp(this.M, this.O, fD));
            arrayList = this.C;
            arrayList.clear();
            size = arrayList4.size();
            if (size != 0) {
                paddingTop = getPaddingTop();
                if (size == 1) {
                    arrayList.add(new RectF((RectF) arrayList3.get(0)));
                } else {
                    f10 = (-this.T) * this.N;
                    i19 = 0;
                    while (i19 < size && i19 < arrayList3.size()) {
                        RectF rectF = (RectF) arrayList3.get(i19);
                        float f15 = ((i19 - this.S) * this.N) + f10;
                        arrayList.add(new RectF(AndroidUtilities.lerp(rectF.left, f15, fD), AndroidUtilities.lerp(rectF.top, paddingTop, fD), AndroidUtilities.lerp(rectF.right, f15 + this.N, fD), AndroidUtilities.lerp(rectF.bottom, this.O + paddingTop, fD)));
                        i19++;
                        size = size;
                    }
                }
            }
            if (z6.b(this.f47594a) > 0) {
                iDp2 = AndroidUtilities.dp(16.0f);
            } else {
                iDp2 = 0;
            }
            setMeasuredDimension(size2, getPaddingBottom() + getPaddingTop() + this.L + this.v.h(paddingLeft - iDp2, i12 - iDp2, size2));
            this.f47282w.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
            this.f47283x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
            i18 = 0;
            while (true) {
                arrayList2 = this.A;
                if (i18 < arrayList2.size()) {
                    break;
                }
                ((ImageView) arrayList2.get(i18)).measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                i18++;
            }
            if (y5Var.f34816i) {
                requestLayout();
            }
        }
        int iDp4 = (AndroidUtilities.dp(200.0f) - getPaddingTop()) - getPaddingBottom();
        this.O = iDp4;
        this.M = iDp4;
        this.N = iMax2;
        i12 = paddingRight;
        this.L = Math.round(AndroidUtilities.lerp(this.M, this.O, fD));
        arrayList = this.C;
        arrayList.clear();
        size = arrayList4.size();
        if (size != 0) {
            paddingTop = getPaddingTop();
            if (size == 1) {
                arrayList.add(new RectF((RectF) arrayList3.get(0)));
            } else {
                f10 = (-this.T) * this.N;
                i19 = 0;
                while (i19 < size) {
                    RectF rectF2 = (RectF) arrayList3.get(i19);
                    float f16 = ((i19 - this.S) * this.N) + f10;
                    arrayList.add(new RectF(AndroidUtilities.lerp(rectF2.left, f16, fD), AndroidUtilities.lerp(rectF2.top, paddingTop, fD), AndroidUtilities.lerp(rectF2.right, f16 + this.N, fD), AndroidUtilities.lerp(rectF2.bottom, this.O + paddingTop, fD)));
                    i19++;
                    size = size;
                }
            }
        }
        if (z6.b(this.f47594a) > 0) {
            iDp2 = AndroidUtilities.dp(16.0f);
        } else {
            iDp2 = 0;
        }
        setMeasuredDimension(size2, getPaddingBottom() + getPaddingTop() + this.L + this.v.h(paddingLeft - iDp2, i12 - iDp2, size2));
        this.f47282w.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
        this.f47283x.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
        i18 = 0;
        while (true) {
            arrayList2 = this.A;
            if (i18 < arrayList2.size()) {
                break;
                break;
            } else {
                ((ImageView) arrayList2.get(i18)).measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                i18++;
            }
        }
        if (y5Var.f34816i) {
            requestLayout();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList;
        boolean z10;
        int i10;
        int i11;
        VelocityTracker velocityTracker;
        float x8 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = y10 >= ((float) getPaddingTop()) && y10 < ((float) (getPaddingTop() + this.L));
        int i12 = -1;
        if (!l() || this.Q.f34816i) {
            arrayList = this.C;
            if (actionMasked == 0) {
                if (!z11) {
                    return super.onTouchEvent(motionEvent);
                }
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    if (((RectF) arrayList.get(i13)).contains(x8, y10)) {
                        i12 = i13;
                        break;
                    }
                }
                this.P = i12;
                return true;
            }
            if (actionMasked == 1) {
                if (actionMasked == 3) {
                    this.P = -1;
                }
                return super.onTouchEvent(motionEvent);
            }
            if (z11) {
                i10 = 0;
                while (true) {
                    if (i10 < arrayList.size()) {
                        i10 = -1;
                        break;
                    }
                    if (((RectF) arrayList.get(i10)).contains(x8, y10)) {
                        break;
                    }
                    i10++;
                }
                i11 = this.P;
                if (i10 == i11) {
                    k(i11);
                }
            }
            if (this.P == -1 || z11) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.P = -1;
            if (z10 && !super.onTouchEvent(motionEvent)) {
                return false;
            }
        } else {
            ArrayList arrayList2 = this.f47284y;
            if (arrayList2.size() < 2) {
                arrayList = this.C;
                if (actionMasked == 0) {
                    if (!z11) {
                        return super.onTouchEvent(motionEvent);
                    }
                    while (i13 < arrayList.size()) {
                        if (((RectF) arrayList.get(i13)).contains(x8, y10)) {
                            i12 = i13;
                            break;
                        }
                    }
                    this.P = i12;
                    return true;
                }
                if (actionMasked == 1) {
                    if (actionMasked == 3) {
                        this.P = -1;
                    }
                    return super.onTouchEvent(motionEvent);
                }
                if (z11) {
                    i10 = 0;
                    while (true) {
                        if (i10 < arrayList.size()) {
                            i10 = -1;
                            break;
                        }
                        if (((RectF) arrayList.get(i10)).contains(x8, y10)) {
                            break;
                            break;
                        }
                        i10++;
                    }
                    i11 = this.P;
                    if (i10 == i11) {
                        k(i11);
                    }
                }
                if (this.P == -1) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                this.P = -1;
                if (z10) {
                }
            } else {
                if (actionMasked == 0) {
                    if (!z11) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.f47273a0 == 0) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                        this.f47273a0 = viewConfiguration.getScaledTouchSlop();
                        this.f47274b0 = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.f47275c0 = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.V = x8;
                    this.W = y10;
                    this.U = false;
                    VelocityTracker velocityTracker2 = this.f47276d0;
                    if (velocityTracker2 == null) {
                        this.f47276d0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f47276d0.addMovement(motionEvent);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    ValueAnimator valueAnimator = this.f47277e0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f47277e0 = null;
                    }
                    this.P = this.S;
                    return true;
                }
                float f10 = 0.0f;
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.f47276d0;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float f11 = x8 - this.V;
                    float f12 = y10 - this.W;
                    if (!this.U && Math.abs(f11) > this.f47273a0 && Math.abs(f11) > Math.abs(f12)) {
                        this.U = true;
                        this.P = -1;
                    }
                    if (this.U) {
                        float f13 = (-f11) / this.N;
                        int i14 = this.S;
                        if (i14 == 0 && f13 < 0.0f) {
                            f13 *= 0.3f;
                        }
                        if (i14 == arrayList2.size() - 1 && f13 > 0.0f) {
                            f13 *= 0.3f;
                        }
                        this.T = f13;
                        requestLayout();
                        invalidate();
                        return true;
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    if (actionMasked == 1 && (velocityTracker = this.f47276d0) != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.f47276d0.computeCurrentVelocity(1000, this.f47275c0);
                        float xVelocity = this.f47276d0.getXVelocity();
                        float yVelocity = this.f47276d0.getYVelocity();
                        if (Math.abs(xVelocity) >= this.f47274b0 && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                            f10 = xVelocity;
                        }
                    }
                    VelocityTracker velocityTracker4 = this.f47276d0;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                        this.f47276d0 = null;
                    }
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (this.U) {
                        this.U = false;
                        settle(f10);
                    } else if (actionMasked == 1) {
                        int i15 = this.P;
                        int i16 = this.S;
                        if (i15 == i16) {
                            k(i16);
                        }
                    }
                    this.P = -1;
                    return true;
                }
            }
        }
        return true;
    }
}
