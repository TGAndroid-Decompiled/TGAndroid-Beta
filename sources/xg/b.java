package xg;

import ag.j2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import h7.n;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.y8;
import org.telegram.ui.rg0;

public final class b extends FrameLayout implements rg0, ud.b {
    public static final RectF R = new RectF();
    public TLRPC.TL_attachMenuBot A;
    public final TextPaint B;
    public boolean C;
    public float D;
    public boolean E;
    public float F;
    public boolean G;
    public Drawable H;
    public boolean I;
    public boolean J;
    public int K;
    public long L;
    public boolean M;
    public int N;
    public float O;
    public TextPaint P;
    public y8 Q;

    public final TextView f49427a;

    public final ri0 f49428b;

    public n9 f49429c;
    public c6 d;

    public final Paint f49430e;

    public final i6 f49431f;
    public final ud.a h;

    public final ud.a f49432n;

    public final ud.a f49433r;

    public int f49434s;
    public int v;

    public int f49435w;

    public boolean f49436x;

    public a f49437y;

    public b(Context context) {
        super(context);
        this.f49430e = new Paint(1);
        this.h = new ud.a(0, this, td.a.f48160a, 320L, false);
        er erVar = er.h;
        this.f49432n = new ud.a(1, this, erVar, 380L, false);
        this.f49433r = new ud.a(2, this, erVar, 380L, false);
        this.O = 1.0f;
        ri0 ri0Var = new ri0(context);
        this.f49428b = ri0Var;
        addView(ri0Var, z5.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        ri0Var.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.f49427a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        this.B = new TextPaint(textView.getPaint());
        addView(textView, z5.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        i6 i6Var = new i6(false, false, false, false);
        this.f49431f = i6Var;
        i6Var.u(AndroidUtilities.bold());
        i6Var.setCallback(this);
        i6Var.f29239b = 17;
        i6Var.r(-1);
        i6Var.t(AndroidUtilities.dp(10.0f));
    }

    public static b b(Context context, c6 c6Var, a aVar, int i10) {
        b bVar = new b(context);
        bVar.d = c6Var;
        bVar.f49437y = aVar;
        bVar.f49427a.setText(LocaleController.getString(i10));
        bVar.a(false);
        bVar.f49428b.setLayoutParams(z5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f49435w = g6.v0(g6.cl, c6Var);
        bVar.f49434s = g6.v0(g6.al, c6Var);
        bVar.v = g6.v0(g6.bl, c6Var);
        bVar.f();
        return bVar;
    }

    public final void a(boolean z10) {
        TLRPC.Document document;
        boolean z11 = this.h.f48498f;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.A;
        boolean z12 = true;
        if (tL_attachMenuBot != null) {
            TLRPC.TL_attachMenuBotIcon animatedAttachMenuBotIcon = MediaDataController.getAnimatedAttachMenuBotIcon(tL_attachMenuBot, z11);
            if (animatedAttachMenuBotIcon == null) {
                animatedAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(this.A);
                z12 = false;
            }
            if (animatedAttachMenuBotIcon == null || (document = animatedAttachMenuBotIcon.icon) == null) {
                this.f49429c.b();
            } else if (this.L != document.f22386id) {
                this.f49429c.l(ImageLocation.getForDocument(document), "24_24_lastframe", ImageLocation.getForDocument(document), "24_24_lastframe", z12 ? null : DocumentObject.getSvgThumb(document, g6.f22999a7, 1.0f), this.A);
                this.L = document.f22386id;
            }
            f();
            return;
        }
        a aVar = this.f49437y;
        if (aVar == null) {
            return;
        }
        int i10 = aVar.f49424b;
        int i11 = aVar.f49423a;
        int i12 = aVar.f49425c;
        ri0 ri0Var = this.f49428b;
        if (i12 != -1) {
            ri0Var.setImageResource(i12);
            f();
            return;
        }
        int i13 = z11 ? i11 : i10;
        if (aVar.d != -1) {
            boolean z13 = this.J != z11;
            if (this.K != i13) {
                this.K = i13;
                ri0Var.f(i13, 24, 24, null);
                z13 = true;
            }
            if (z13) {
                oi0 animatedDrawable = ri0Var.getAnimatedDrawable();
                if (animatedDrawable == null) {
                    return;
                }
                if (z11) {
                    animatedDrawable.N(this.f49437y.d);
                    if (animatedDrawable.X >= this.f49437y.f49426e - 2) {
                        animatedDrawable.L(0, false, false);
                    }
                    int i14 = animatedDrawable.X;
                    int i15 = this.f49437y.d;
                    if (i14 <= i15) {
                        animatedDrawable.start();
                    } else {
                        animatedDrawable.K(i15);
                    }
                } else {
                    int i16 = animatedDrawable.X;
                    a aVar2 = this.f49437y;
                    if (i16 >= aVar2.d - 1) {
                        animatedDrawable.N(aVar2.f49426e - 1);
                        animatedDrawable.start();
                    } else {
                        animatedDrawable.N(0);
                        animatedDrawable.K(0);
                    }
                }
            }
            this.J = z11;
            return;
        }
        if (i11 != i10) {
            if (this.K != i13) {
                this.K = i13;
                ri0Var.f(i13, 24, 24, null);
                ri0Var.getAnimatedDrawable().h = false;
                if (!z10) {
                    ri0Var.getAnimatedDrawable().Q(0.99f, true);
                    return;
                } else {
                    ri0Var.getAnimatedDrawable().K(0);
                    ri0Var.d();
                    return;
                }
            }
            return;
        }
        if (ri0Var.getAnimatedDrawable() == null) {
            ri0Var.f(this.f49437y.f49423a, 24, 24, null);
        }
        oi0 animatedDrawable2 = ri0Var.getAnimatedDrawable();
        if (animatedDrawable2 == null) {
            return;
        }
        int[] iArr = animatedDrawable2.f31312e;
        if (this.J != z11) {
            this.J = z11;
            if (z11) {
                animatedDrawable2.h = false;
                animatedDrawable2.K(0);
                animatedDrawable2.N(iArr[0]);
            } else {
                animatedDrawable2.h = true;
                animatedDrawable2.K(iArr[0]);
                animatedDrawable2.N(0);
            }
            ri0Var.d();
        }
    }

    public final float c() {
        float fMeasureText = this.B.measureText(this.f49427a.getText().toString());
        return Math.min(AndroidUtilities.dp(84.0f), (int) ((AndroidUtilities.lerp(AndroidUtilities.dpf2(16.0f), AndroidUtilities.dp(8.0f), n.a((fMeasureText - AndroidUtilities.dp(40.0f)) / AndroidUtilities.dp(16.0f), 0.0f, 1.0f)) * 2.0f) + fMeasureText));
    }

    public final void d(String str, boolean z10, boolean z11) {
        this.f49431f.q(str, z11, true);
        this.f49432n.a(!TextUtils.isEmpty(str), z11);
        this.f49433r.a(z10, z11);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = this.C ? this.D : getWidth();
        float f10 = this.E ? this.F : this.h.f48497e;
        RectF rectF = R;
        Paint paint = this.f49430e;
        if (f10 > 0.0f && !this.G) {
            paint.setColor(g6.l1(td.a.f48160a.getInterpolation(f10) * 0.09f, this.f49434s));
            rectF.set(0.0f, 0.0f, width, getHeight());
            float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float fA = n.a(this.O, 0.0f, 1.0f) * AndroidUtilities.lerp(0.6f, 1.0f, f10);
            canvas.save();
            canvas.scale(fA, fA, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
            canvas.restore();
        }
        float f11 = (this.f49436x ? 1.0f : this.f49432n.f48497e) * this.O;
        boolean z10 = f11 > 0.0f;
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, width, getHeight(), null);
        }
        super.dispatchDraw(canvas);
        if (f11 > 0.0f) {
            canvas.save();
            float fDpf2 = AndroidUtilities.dpf2(1.33f);
            float fDpf3 = AndroidUtilities.dpf2(11.0f) + (width / 2.0f);
            float fDpf4 = AndroidUtilities.dpf2(10.0f);
            float fDpf5 = AndroidUtilities.dpf2(16.0f);
            i6 i6Var = this.f49431f;
            float fMax = Math.max(fDpf5, i6Var.d() + AndroidUtilities.dp(8.0f));
            float fDpf6 = AndroidUtilities.dpf2(9.333f);
            float fDpf7 = AndroidUtilities.dpf2(8.0f);
            float f12 = fMax / 2.0f;
            float f13 = fDpf5 / 2.0f;
            rectF.set((fDpf3 - f12) - fDpf2, (fDpf4 - f13) - fDpf2, f12 + fDpf3 + fDpf2, f13 + fDpf4 + fDpf2);
            canvas.scale(f11, f11, fDpf3, fDpf4);
            canvas.drawRoundRect(rectF, fDpf6, fDpf6, g6.Il);
            rectF.inset(fDpf2, fDpf2);
            if (this.f49436x) {
                if (this.H == null) {
                    this.H = getContext().getResources().getDrawable(R.drawable.star).mutate();
                }
                j2.d().f(0.0f, 0.0f, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(16.0f));
                canvas.drawRoundRect(rectF, fDpf7, fDpf7, j2.d().e());
                int iDpf2 = (int) (fDpf3 - AndroidUtilities.dpf2(7.0f));
                int iDpf3 = (int) (fDpf4 - AndroidUtilities.dpf2(7.0f));
                this.H.setBounds(iDpf2, iDpf3, AndroidUtilities.dp(14.0f) + iDpf2, AndroidUtilities.dp(14.0f) + iDpf3);
                this.H.draw(canvas);
            } else {
                paint.setColor(i0.b.d(this.f49433r.f48497e, g6.w0(null, g6.hl, false), g6.w0(null, g6.f23302r7, false)));
                canvas.drawRoundRect(rectF, fDpf7, fDpf7, paint);
                i6Var.m(rectF);
                i6Var.draw(canvas);
            }
            canvas.restore();
        }
        if (z10) {
            canvas.restore();
        }
    }

    public final void e(boolean z10, boolean z11) {
        this.h.a(z10, z11);
        a(z11);
        this.f49427a.setTypeface(z10 ? AndroidUtilities.getTypeface("fonts/rextrabold.ttf") : AndroidUtilities.bold());
    }

    public final void f() {
        int i10 = this.f49435w;
        int i11 = this.f49434s;
        ud.a aVar = this.h;
        int iD = i0.b.d(aVar.f48497e, i10, i11);
        int iD2 = i0.b.d(aVar.f48497e, this.f49435w, this.v);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN);
        n9 n9Var = this.f49429c;
        if (n9Var != null && this.I) {
            n9Var.setColorFilter(porterDuffColorFilter);
            this.f49429c.invalidate();
        }
        this.f49428b.setColorFilter(porterDuffColorFilter);
        this.f49427a.setTextColor(iD2);
    }

    public n9 getBackupImageView() {
        return this.f49429c;
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        if (i10 == 0) {
            f();
        }
        invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.M) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) c()) + this.N, 1073741824), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.C) {
            float measuredWidth = (this.D - getMeasuredWidth()) / 2.0f;
            this.f49428b.setTranslationX(measuredWidth);
            this.f49427a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i10) {
        this.N = i10;
        this.M = true;
    }

    public void setAttachScale(float f10) {
        TextView textView = this.f49427a;
        textView.setScaleX(f10);
        textView.setScaleY(f10);
        ri0 ri0Var = this.f49428b;
        ri0Var.setScaleX(f10);
        ri0Var.setScaleY(f10);
        n9 n9Var = this.f49429c;
        if (n9Var != null) {
            n9Var.setScaleX(f10);
            this.f49429c.setScaleY(f10);
        }
        this.O = f10;
        invalidate();
    }

    public void setPremiumBadge(boolean z10) {
        this.f49436x = z10;
    }

    public void setSkipDrawSelector(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            invalidate();
        }
    }

    public void setTabAnimation(a aVar) {
        this.f49437y = aVar;
        this.A = null;
        this.K = 0;
        this.L = 0L;
        this.f49428b.a();
        a(false);
    }

    public void setText(CharSequence charSequence) {
        this.f49427a.setText(charSequence);
    }

    public void setTextSizeDp(float f10) {
        float fDp = AndroidUtilities.dp(f10);
        TextView textView = this.f49427a;
        if (textView.getTextSize() != fDp) {
            textView.setTextSize(1, f10);
            this.B.setTextSize(fDp);
        }
    }

    public void setVisualWidth(float f10) {
        this.C = true;
        if (this.D != f10) {
            this.D = f10;
            float measuredWidth = (f10 - getMeasuredWidth()) / 2.0f;
            this.f49428b.setTranslationX(measuredWidth);
            this.f49427a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
