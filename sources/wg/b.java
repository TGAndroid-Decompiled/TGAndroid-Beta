package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import g7.e6;
import g7.n;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.og0;
import zf.a1;
public final class b extends FrameLayout implements og0, td.b {
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
    public z8 Q;
    public final TextView f48828a;
    public final pi0 f48829b;
    public o9 f48830c;
    public b6 d;
    public final Paint f48831e;
    public final i6 f48832f;
    public final td.a h;
    public final td.a f48833n;
    public final td.a f48834r;
    public int f48835s;
    public int v;
    public int f48836w;
    public boolean f48837x;
    public a f48838y;

    public b(Context context) {
        super(context);
        this.f48831e = new Paint(1);
        this.h = new td.a(0, this, sd.a.f47511a, 320L, false);
        gr grVar = gr.h;
        this.f48833n = new td.a(1, this, grVar, 380L, false);
        this.f48834r = new td.a(2, this, grVar, 380L, false);
        this.O = 1.0f;
        ?? imageView = new ImageView(context);
        this.f48829b = imageView;
        addView((View) imageView, e6.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.f48828a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        this.B = new TextPaint(textView.getPaint());
        addView(textView, e6.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        i6 i6Var = new i6(false, false, false, false);
        this.f48832f = i6Var;
        i6Var.u(AndroidUtilities.bold());
        i6Var.setCallback(this);
        i6Var.f29333b = 17;
        i6Var.r(-1);
        i6Var.t(AndroidUtilities.dp(10.0f));
    }

    public static b b(Context context, b6 b6Var, a aVar, int i9) {
        b bVar = new b(context);
        bVar.d = b6Var;
        bVar.f48838y = aVar;
        bVar.f48828a.setText(LocaleController.getString(i9));
        bVar.a(false);
        bVar.f48829b.setLayoutParams(e6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f48836w = f6.v0(f6.cl, b6Var);
        bVar.f48835s = f6.v0(f6.al, b6Var);
        bVar.v = f6.v0(f6.bl, b6Var);
        bVar.f();
        return bVar;
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 0) {
            f();
        }
        invalidate();
    }

    public final void a(boolean z10) {
        int i9;
        boolean z11;
        TLRPC.Document document;
        boolean z12 = this.h.f47776f;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.A;
        SvgHelper.SvgDrawable svgDrawable = null;
        boolean z13 = true;
        if (tL_attachMenuBot != null) {
            TLRPC.TL_attachMenuBotIcon animatedAttachMenuBotIcon = MediaDataController.getAnimatedAttachMenuBotIcon(tL_attachMenuBot, z12);
            if (animatedAttachMenuBotIcon == null) {
                animatedAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(this.A);
                z13 = false;
            }
            if (animatedAttachMenuBotIcon != null && (document = animatedAttachMenuBotIcon.icon) != null) {
                if (this.L != document.f22386id) {
                    o9 o9Var = this.f48830c;
                    ImageLocation forDocument = ImageLocation.getForDocument(document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(document);
                    if (!z13) {
                        svgDrawable = DocumentObject.getSvgThumb(document, f6.f22947a7, 1.0f);
                    }
                    o9Var.l(forDocument, "24_24_lastframe", forDocument2, "24_24_lastframe", svgDrawable, this.A);
                    this.L = document.f22386id;
                }
            } else {
                this.f48830c.b();
            }
            f();
            return;
        }
        a aVar = this.f48838y;
        if (aVar != null) {
            int i10 = aVar.f48825b;
            int i11 = aVar.f48824a;
            int i12 = aVar.f48826c;
            pi0 pi0Var = this.f48829b;
            if (i12 != -1) {
                pi0Var.setImageResource(i12);
                f();
                return;
            }
            if (z12) {
                i9 = i11;
            } else {
                i9 = i10;
            }
            if (aVar.d != -1) {
                if (this.J != z12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.K != i9) {
                    this.K = i9;
                    pi0Var.f(i9, 24, 24, null);
                    z11 = true;
                }
                if (z11) {
                    mi0 animatedDrawable = pi0Var.getAnimatedDrawable();
                    if (animatedDrawable != null) {
                        if (z12) {
                            animatedDrawable.N(this.f48838y.d);
                            if (animatedDrawable.X >= this.f48838y.f48827e - 2) {
                                animatedDrawable.L(0, false, false);
                            }
                            int i13 = animatedDrawable.X;
                            int i14 = this.f48838y.d;
                            if (i13 <= i14) {
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.K(i14);
                            }
                        } else {
                            int i15 = animatedDrawable.X;
                            a aVar2 = this.f48838y;
                            if (i15 >= aVar2.d - 1) {
                                animatedDrawable.N(aVar2.f48827e - 1);
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.N(0);
                                animatedDrawable.K(0);
                            }
                        }
                    } else {
                        return;
                    }
                }
                this.J = z12;
            } else if (i11 != i10) {
                if (this.K != i9) {
                    this.K = i9;
                    pi0Var.f(i9, 24, 24, null);
                    pi0Var.getAnimatedDrawable().h = false;
                    if (z10) {
                        pi0Var.getAnimatedDrawable().K(0);
                        pi0Var.d();
                        return;
                    }
                    pi0Var.getAnimatedDrawable().Q(0.99f, true);
                }
            } else {
                if (pi0Var.getAnimatedDrawable() == null) {
                    pi0Var.f(this.f48838y.f48824a, 24, 24, null);
                }
                mi0 animatedDrawable2 = pi0Var.getAnimatedDrawable();
                if (animatedDrawable2 != null) {
                    int[] iArr = animatedDrawable2.f30847e;
                    if (this.J != z12) {
                        this.J = z12;
                        if (z12) {
                            animatedDrawable2.h = false;
                            animatedDrawable2.K(0);
                            animatedDrawable2.N(iArr[0]);
                        } else {
                            animatedDrawable2.h = true;
                            animatedDrawable2.K(iArr[0]);
                            animatedDrawable2.N(0);
                        }
                        pi0Var.d();
                    }
                }
            }
        }
    }

    public final float c() {
        float measureText = this.B.measureText(this.f48828a.getText().toString());
        return Math.min(AndroidUtilities.dp(84.0f), (int) ((AndroidUtilities.lerp(AndroidUtilities.dpf2(16.0f), AndroidUtilities.dp(8.0f), n.a((measureText - AndroidUtilities.dp(40.0f)) / AndroidUtilities.dp(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    public final void d(String str, boolean z10, boolean z11) {
        this.f48832f.q(str, z11, true);
        this.f48833n.a(!TextUtils.isEmpty(str), z11);
        this.f48834r.a(z10, z11);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width;
        float f10;
        boolean z10;
        if (this.C) {
            width = this.D;
        } else {
            width = getWidth();
        }
        float f11 = width;
        if (this.E) {
            f10 = this.F;
        } else {
            f10 = this.h.f47775e;
        }
        RectF rectF = R;
        float f12 = 1.0f;
        Paint paint = this.f48831e;
        if (f10 > 0.0f && !this.G) {
            paint.setColor(f6.l1(sd.a.f47511a.getInterpolation(f10) * 0.09f, this.f48835s));
            rectF.set(0.0f, 0.0f, f11, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a2 = n.a(this.O, 0.0f, 1.0f) * AndroidUtilities.lerp(0.6f, 1.0f, f10);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        if (!this.f48837x) {
            f12 = this.f48833n.f47775e;
        }
        float f13 = f12 * this.O;
        int i9 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
        if (i9 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, f11, getHeight(), null);
        }
        super.dispatchDraw(canvas);
        if (i9 > 0) {
            canvas.save();
            float dpf2 = AndroidUtilities.dpf2(1.33f);
            float dpf22 = AndroidUtilities.dpf2(11.0f) + (f11 / 2.0f);
            float dpf23 = AndroidUtilities.dpf2(10.0f);
            float dpf24 = AndroidUtilities.dpf2(16.0f);
            i6 i6Var = this.f48832f;
            float max = Math.max(dpf24, i6Var.d() + AndroidUtilities.dp(8.0f));
            float dpf25 = AndroidUtilities.dpf2(9.333f);
            float dpf26 = AndroidUtilities.dpf2(8.0f);
            float f14 = max / 2.0f;
            float f15 = dpf24 / 2.0f;
            rectF.set((dpf22 - f14) - dpf2, (dpf23 - f15) - dpf2, f14 + dpf22 + dpf2, f15 + dpf23 + dpf2);
            canvas.scale(f13, f13, dpf22, dpf23);
            canvas.drawRoundRect(rectF, dpf25, dpf25, f6.Il);
            rectF.inset(dpf2, dpf2);
            if (this.f48837x) {
                if (this.H == null) {
                    this.H = getContext().getResources().getDrawable(R.drawable.star).mutate();
                }
                a1.d().f(0.0f, 0.0f, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(16.0f));
                canvas.drawRoundRect(rectF, dpf26, dpf26, a1.d().e());
                int dpf27 = (int) (dpf22 - AndroidUtilities.dpf2(7.0f));
                int dpf28 = (int) (dpf23 - AndroidUtilities.dpf2(7.0f));
                this.H.setBounds(dpf27, dpf28, AndroidUtilities.dp(14.0f) + dpf27, AndroidUtilities.dp(14.0f) + dpf28);
                this.H.draw(canvas);
            } else {
                paint.setColor(i0.a.d(this.f48834r.f47775e, f6.w0(null, f6.hl, false), f6.w0(null, f6.f23249r7, false)));
                canvas.drawRoundRect(rectF, dpf26, dpf26, paint);
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
        Typeface bold;
        this.h.a(z10, z11);
        a(z11);
        if (z10) {
            bold = AndroidUtilities.getTypeface("fonts/rextrabold.ttf");
        } else {
            bold = AndroidUtilities.bold();
        }
        this.f48828a.setTypeface(bold);
    }

    public final void f() {
        int i9 = this.f48836w;
        int i10 = this.f48835s;
        td.a aVar = this.h;
        int d = i0.a.d(aVar.f47775e, i9, i10);
        int d9 = i0.a.d(aVar.f47775e, this.f48836w, this.v);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        o9 o9Var = this.f48830c;
        if (o9Var != null && this.I) {
            o9Var.setColorFilter(porterDuffColorFilter);
            this.f48830c.invalidate();
        }
        this.f48829b.setColorFilter(porterDuffColorFilter);
        this.f48828a.setTextColor(d9);
    }

    public o9 getBackupImageView() {
        return this.f48830c;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        if (this.M) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) c()) + this.N, 1073741824), i10);
        } else {
            super.onMeasure(i9, i10);
        }
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (this.C) {
            float measuredWidth = (this.D - getMeasuredWidth()) / 2.0f;
            this.f48829b.setTranslationX(measuredWidth);
            this.f48828a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i9) {
        this.N = i9;
        this.M = true;
    }

    public void setAttachScale(float f10) {
        TextView textView = this.f48828a;
        textView.setScaleX(f10);
        textView.setScaleY(f10);
        pi0 pi0Var = this.f48829b;
        pi0Var.setScaleX(f10);
        pi0Var.setScaleY(f10);
        o9 o9Var = this.f48830c;
        if (o9Var != null) {
            o9Var.setScaleX(f10);
            this.f48830c.setScaleY(f10);
        }
        this.O = f10;
        invalidate();
    }

    public void setPremiumBadge(boolean z10) {
        this.f48837x = z10;
    }

    public void setSkipDrawSelector(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            invalidate();
        }
    }

    public void setTabAnimation(a aVar) {
        this.f48838y = aVar;
        this.A = null;
        this.K = 0;
        this.L = 0L;
        this.f48829b.a();
        a(false);
    }

    public void setText(CharSequence charSequence) {
        this.f48828a.setText(charSequence);
    }

    public void setTextSizeDp(float f10) {
        float dp = AndroidUtilities.dp(f10);
        TextView textView = this.f48828a;
        if (textView.getTextSize() != dp) {
            textView.setTextSize(1, f10);
            this.B.setTextSize(dp);
        }
    }

    public void setVisualWidth(float f10) {
        this.C = true;
        if (this.D != f10) {
            this.D = f10;
            float measuredWidth = (f10 - getMeasuredWidth()) / 2.0f;
            this.f48829b.setTranslationX(measuredWidth);
            this.f48828a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
