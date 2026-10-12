package ph;

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
import ne.d;
import ne.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.z9;
import org.telegram.ui.lh0;
import sg.b1;
import w7.a6;
import w7.s;
public final class b extends FrameLayout implements lh0, d {
    public static final RectF V = new RectF();
    public TLRPC.TL_attachMenuBot E;
    public final TextPaint F;
    public boolean G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public Drawable L;
    public boolean M;
    public boolean N;
    public int O;
    public long P;
    public boolean Q;
    public int R;
    public float S;
    public TextPaint T;
    public k9 U;
    public final TextView f43216a;
    public final bk0 f43217b;
    public z9 f43218c;
    public c6 d;
    public final Paint e;
    public final r6 f43219f;
    public final ne.b h;
    public final ne.b f43220n;
    public final ne.b f43221r;
    public int f43222s;
    public int v;
    public int f43223w;
    public boolean f43224x;
    public a f43225y;

    public b(Context context) {
        super(context);
        this.e = new Paint(1);
        this.h = new ne.b(0, this, me.a.f15760a, 320L, false);
        es esVar = es.h;
        this.f43220n = new ne.b(1, this, esVar, 380L, false);
        this.f43221r = new ne.b(2, this, esVar, 380L, false);
        this.S = 1.0f;
        ?? imageView = new ImageView(context);
        this.f43217b = imageView;
        addView((View) imageView, a6.a(44.0f, 0.0f, -6.0f, 0.0f, 0.0f, 44, 49));
        imageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.f43216a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        this.F = new TextPaint(textView.getPaint());
        addView(textView, a6.a(-2.0f, 0.0f, 28.33f, 0.0f, 0.0f, -1, 49));
        r6 r6Var = new r6(false, false, false);
        this.f43219f = r6Var;
        r6Var.x(AndroidUtilities.bold());
        r6Var.setCallback(this);
        r6Var.f28748b = 17;
        r6Var.u(-1);
        r6Var.w(AndroidUtilities.dp(10.0f));
    }

    public static b b(Context context, c6 c6Var, a aVar, int i10) {
        b bVar = new b(context);
        bVar.d = c6Var;
        bVar.f43225y = aVar;
        bVar.f43216a.setText(LocaleController.getString(i10));
        bVar.a(false);
        bVar.f43217b.setLayoutParams(a6.a(24.0f, 0.0f, 4.0f, 0.0f, 0.0f, 24, 49));
        bVar.f43223w = g6.w0(g6.cl, c6Var);
        bVar.f43222s = g6.w0(g6.al, c6Var);
        bVar.v = g6.w0(g6.bl, c6Var);
        bVar.f();
        return bVar;
    }

    public final void a(boolean z10) {
        int i10;
        boolean z11;
        TLRPC.Document document;
        boolean z12 = this.h.f16293f;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.E;
        SvgHelper.SvgDrawable svgDrawable = null;
        boolean z13 = true;
        if (tL_attachMenuBot != null) {
            TLRPC.TL_attachMenuBotIcon animatedAttachMenuBotIcon = MediaDataController.getAnimatedAttachMenuBotIcon(tL_attachMenuBot, z12);
            if (animatedAttachMenuBotIcon == null) {
                animatedAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(this.E);
                z13 = false;
            }
            if (animatedAttachMenuBotIcon != null && (document = animatedAttachMenuBotIcon.icon) != null) {
                if (this.P != document.f19222id) {
                    z9 z9Var = this.f43218c;
                    ImageLocation forDocument = ImageLocation.getForDocument(document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(document);
                    if (!z13) {
                        svgDrawable = DocumentObject.getSvgThumb(document, g6.f19843a7, 1.0f);
                    }
                    z9Var.l(forDocument, "24_24_lastframe", forDocument2, "24_24_lastframe", svgDrawable, this.E);
                    this.P = document.f19222id;
                }
            } else {
                this.f43218c.b();
            }
            f();
            return;
        }
        a aVar = this.f43225y;
        if (aVar != null) {
            int i11 = aVar.f43214b;
            int i12 = aVar.f43213a;
            int i13 = aVar.f43215c;
            bk0 bk0Var = this.f43217b;
            if (i13 != -1) {
                bk0Var.setImageResource(i13);
                f();
                return;
            }
            if (z12) {
                i10 = i12;
            } else {
                i10 = i11;
            }
            if (aVar.d != -1) {
                if (this.N != z12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.O != i10) {
                    this.O = i10;
                    bk0Var.f(i10, 24, 24, null);
                    z11 = true;
                }
                if (z11) {
                    yj0 animatedDrawable = bk0Var.getAnimatedDrawable();
                    if (animatedDrawable != null) {
                        if (z12) {
                            animatedDrawable.P(this.f43225y.d);
                            if (animatedDrawable.f31602a0 >= this.f43225y.e - 2) {
                                animatedDrawable.N(0, false, false);
                            }
                            int i14 = animatedDrawable.f31602a0;
                            int i15 = this.f43225y.d;
                            if (i14 <= i15) {
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.M(i15);
                            }
                        } else {
                            int i16 = animatedDrawable.f31602a0;
                            a aVar2 = this.f43225y;
                            if (i16 >= aVar2.d - 1) {
                                animatedDrawable.P(aVar2.e - 1);
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.P(0);
                                animatedDrawable.M(0);
                            }
                        }
                    } else {
                        return;
                    }
                }
                this.N = z12;
            } else if (i12 != i11) {
                if (this.O != i10) {
                    this.O = i10;
                    bk0Var.f(i10, 24, 24, null);
                    bk0Var.getAnimatedDrawable().h = false;
                    if (z10) {
                        bk0Var.getAnimatedDrawable().M(0);
                        bk0Var.d();
                        return;
                    }
                    bk0Var.getAnimatedDrawable().T(0.99f, true);
                }
            } else {
                if (bk0Var.getAnimatedDrawable() == null) {
                    bk0Var.f(this.f43225y.f43213a, 24, 24, null);
                }
                yj0 animatedDrawable2 = bk0Var.getAnimatedDrawable();
                if (animatedDrawable2 != null) {
                    int[] iArr = animatedDrawable2.e;
                    if (this.N != z12) {
                        this.N = z12;
                        if (z12) {
                            animatedDrawable2.h = false;
                            animatedDrawable2.M(0);
                            animatedDrawable2.P(iArr[0]);
                        } else {
                            animatedDrawable2.h = true;
                            animatedDrawable2.M(iArr[0]);
                            animatedDrawable2.P(0);
                        }
                        bk0Var.d();
                    }
                }
            }
        }
    }

    public final float c() {
        float measureText = this.F.measureText(this.f43216a.getText().toString());
        return Math.min(AndroidUtilities.dp(84.0f), (int) ((AndroidUtilities.lerp(AndroidUtilities.dpf2(16.0f), AndroidUtilities.dp(8.0f), s.a((measureText - AndroidUtilities.dp(40.0f)) / AndroidUtilities.dp(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    public final void d(String str, boolean z10, boolean z11) {
        this.f43219f.t(str, z11, true);
        this.f43220n.a(!TextUtils.isEmpty(str), z11);
        this.f43221r.a(z10, z11);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width;
        float f7;
        boolean z10;
        if (this.G) {
            width = this.H;
        } else {
            width = getWidth();
        }
        float f10 = width;
        if (this.I) {
            f7 = this.J;
        } else {
            f7 = this.h.e;
        }
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        RectF rectF = V;
        float f11 = 1.0f;
        Paint paint = this.e;
        if (i10 > 0 && !this.K) {
            paint.setColor(g6.m1(me.a.f15760a.getInterpolation(f7) * 0.09f, this.f43222s));
            rectF.set(0.0f, 0.0f, f10, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a2 = s.a(this.S, 0.0f, 1.0f) * AndroidUtilities.lerp(0.6f, 1.0f, f7);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        if (!this.f43224x) {
            f11 = this.f43220n.e;
        }
        float f12 = f11 * this.S;
        int i11 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, f10, getHeight(), null);
        }
        super.dispatchDraw(canvas);
        if (i11 > 0) {
            canvas.save();
            float dpf2 = AndroidUtilities.dpf2(1.33f);
            float dpf22 = AndroidUtilities.dpf2(11.0f) + (f10 / 2.0f);
            float dpf23 = AndroidUtilities.dpf2(10.0f);
            float dpf24 = AndroidUtilities.dpf2(16.0f);
            r6 r6Var = this.f43219f;
            float max = Math.max(dpf24, r6Var.c() + AndroidUtilities.dp(8.0f));
            float dpf25 = AndroidUtilities.dpf2(9.333f);
            float dpf26 = AndroidUtilities.dpf2(8.0f);
            float f13 = max / 2.0f;
            float f14 = dpf24 / 2.0f;
            rectF.set((dpf22 - f13) - dpf2, (dpf23 - f14) - dpf2, f13 + dpf22 + dpf2, f14 + dpf23 + dpf2);
            canvas.scale(f12, f12, dpf22, dpf23);
            canvas.drawRoundRect(rectF, dpf25, dpf25, g6.Ll);
            rectF.inset(dpf2, dpf2);
            if (this.f43224x) {
                if (this.L == null) {
                    this.L = getContext().getResources().getDrawable(R.drawable.star).mutate();
                }
                b1.d().f(0.0f, 0.0f, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(16.0f));
                canvas.drawRoundRect(rectF, dpf26, dpf26, b1.d().e());
                int dpf27 = (int) (dpf22 - AndroidUtilities.dpf2(7.0f));
                int dpf28 = (int) (dpf23 - AndroidUtilities.dpf2(7.0f));
                this.L.setBounds(dpf27, dpf28, AndroidUtilities.dp(14.0f) + dpf27, AndroidUtilities.dp(14.0f) + dpf28);
                this.L.draw(canvas);
            } else {
                paint.setColor(i0.a.d(this.f43221r.e, g6.x0(null, g6.hl, false), g6.x0(null, g6.f20159r7, false)));
                canvas.drawRoundRect(rectF, dpf26, dpf26, paint);
                r6Var.p(rectF);
                r6Var.draw(canvas);
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
        this.f43216a.setTypeface(bold);
    }

    public final void f() {
        int i10 = this.f43223w;
        int i11 = this.f43222s;
        ne.b bVar = this.h;
        int d = i0.a.d(bVar.e, i10, i11);
        int d10 = i0.a.d(bVar.e, this.f43223w, this.v);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        z9 z9Var = this.f43218c;
        if (z9Var != null && this.M) {
            z9Var.setColorFilter(porterDuffColorFilter);
            this.f43218c.invalidate();
        }
        this.f43217b.setColorFilter(porterDuffColorFilter);
        this.f43216a.setTextColor(d10);
    }

    public z9 getBackupImageView() {
        return this.f43218c;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.Q) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) c()) + this.R, 1073741824), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.G) {
            float measuredWidth = (this.H - getMeasuredWidth()) / 2.0f;
            this.f43217b.setTranslationX(measuredWidth);
            this.f43216a.setTranslationX(measuredWidth);
        }
    }

    @Override
    public final void p(int i10, float f7, float f10, e eVar) {
        if (i10 == 0) {
            f();
        }
        invalidate();
    }

    public void setAdditionalWidth(int i10) {
        this.R = i10;
        this.Q = true;
    }

    public void setAttachScale(float f7) {
        TextView textView = this.f43216a;
        textView.setScaleX(f7);
        textView.setScaleY(f7);
        bk0 bk0Var = this.f43217b;
        bk0Var.setScaleX(f7);
        bk0Var.setScaleY(f7);
        z9 z9Var = this.f43218c;
        if (z9Var != null) {
            z9Var.setScaleX(f7);
            this.f43218c.setScaleY(f7);
        }
        this.S = f7;
        invalidate();
    }

    public void setPremiumBadge(boolean z10) {
        this.f43224x = z10;
    }

    public void setSkipDrawSelector(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            invalidate();
        }
    }

    public void setTabAnimation(a aVar) {
        this.f43225y = aVar;
        this.E = null;
        this.O = 0;
        this.P = 0L;
        this.f43217b.a();
        a(false);
    }

    public void setText(CharSequence charSequence) {
        this.f43216a.setText(charSequence);
    }

    public void setTextSizeDp(float f7) {
        float dp = AndroidUtilities.dp(f7);
        TextView textView = this.f43216a;
        if (textView.getTextSize() != dp) {
            textView.setTextSize(1, f7);
            this.F.setTextSize(dp);
        }
    }

    public void setVisualWidth(float f7) {
        this.G = true;
        if (this.H != f7) {
            this.H = f7;
            float measuredWidth = (f7 - getMeasuredWidth()) / 2.0f;
            this.f43217b.setTranslationX(measuredWidth);
            this.f43216a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
