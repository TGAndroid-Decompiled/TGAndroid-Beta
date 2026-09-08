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
import le.d;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.fh0;
import sg.d1;
import w7.p;
import w7.x5;
public final class b extends FrameLayout implements fh0, d {
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
    public i9 U;
    public final TextView f44112a;
    public final aj0 f44113b;
    public x9 f44114c;
    public f6 d;
    public final Paint f44115e;
    public final p6 f44116f;
    public final le.b h;
    public final le.b f44117n;
    public final le.b f44118r;
    public int f44119s;
    public int v;
    public int f44120w;
    public boolean f44121x;
    public a f44122y;

    public b(Context context) {
        super(context);
        this.f44115e = new Paint(1);
        this.h = new le.b(0, this, ke.a.f14926a, 320L, false);
        pr prVar = pr.h;
        this.f44117n = new le.b(1, this, prVar, 380L, false);
        this.f44118r = new le.b(2, this, prVar, 380L, false);
        this.S = 1.0f;
        ?? imageView = new ImageView(context);
        this.f44113b = imageView;
        addView((View) imageView, x5.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.f44112a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        this.F = new TextPaint(textView.getPaint());
        addView(textView, x5.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        p6 p6Var = new p6(false, false, false, false);
        this.f44116f = p6Var;
        p6Var.u(AndroidUtilities.bold());
        p6Var.setCallback(this);
        p6Var.f29312b = 17;
        p6Var.r(-1);
        p6Var.t(AndroidUtilities.dp(10.0f));
    }

    public static b b(Context context, f6 f6Var, a aVar, int i10) {
        b bVar = new b(context);
        bVar.d = f6Var;
        bVar.f44122y = aVar;
        bVar.f44112a.setText(LocaleController.getString(i10));
        bVar.a(false);
        bVar.f44113b.setLayoutParams(x5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f44120w = j6.v0(j6.cl, f6Var);
        bVar.f44119s = j6.v0(j6.al, f6Var);
        bVar.v = j6.v0(j6.bl, f6Var);
        bVar.f();
        return bVar;
    }

    @Override
    public final void E(int i10, float f7, float f10, e eVar) {
        if (i10 == 0) {
            f();
        }
        invalidate();
    }

    public final void a(boolean z10) {
        int i10;
        boolean z11;
        TLRPC.Document document;
        boolean z12 = this.h.f15396f;
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
                if (this.P != document.f19902id) {
                    x9 x9Var = this.f44114c;
                    ImageLocation forDocument = ImageLocation.getForDocument(document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(document);
                    if (!z13) {
                        svgDrawable = DocumentObject.getSvgThumb(document, j6.f20634a7, 1.0f);
                    }
                    x9Var.l(forDocument, "24_24_lastframe", forDocument2, "24_24_lastframe", svgDrawable, this.E);
                    this.P = document.f19902id;
                }
            } else {
                this.f44114c.b();
            }
            f();
            return;
        }
        a aVar = this.f44122y;
        if (aVar != null) {
            int i11 = aVar.f44109b;
            int i12 = aVar.f44108a;
            int i13 = aVar.f44110c;
            aj0 aj0Var = this.f44113b;
            if (i13 != -1) {
                aj0Var.setImageResource(i13);
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
                    aj0Var.f(i10, 24, 24, null);
                    z11 = true;
                }
                if (z11) {
                    xi0 animatedDrawable = aj0Var.getAnimatedDrawable();
                    if (animatedDrawable != null) {
                        if (z12) {
                            animatedDrawable.N(this.f44122y.d);
                            if (animatedDrawable.f32580b0 >= this.f44122y.f44111e - 2) {
                                animatedDrawable.L(0, false, false);
                            }
                            int i14 = animatedDrawable.f32580b0;
                            int i15 = this.f44122y.d;
                            if (i14 <= i15) {
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.K(i15);
                            }
                        } else {
                            int i16 = animatedDrawable.f32580b0;
                            a aVar2 = this.f44122y;
                            if (i16 >= aVar2.d - 1) {
                                animatedDrawable.N(aVar2.f44111e - 1);
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
                this.N = z12;
            } else if (i12 != i11) {
                if (this.O != i10) {
                    this.O = i10;
                    aj0Var.f(i10, 24, 24, null);
                    aj0Var.getAnimatedDrawable().h = false;
                    if (z10) {
                        aj0Var.getAnimatedDrawable().K(0);
                        aj0Var.d();
                        return;
                    }
                    aj0Var.getAnimatedDrawable().Q(0.99f, true);
                }
            } else {
                if (aj0Var.getAnimatedDrawable() == null) {
                    aj0Var.f(this.f44122y.f44108a, 24, 24, null);
                }
                xi0 animatedDrawable2 = aj0Var.getAnimatedDrawable();
                if (animatedDrawable2 != null) {
                    int[] iArr = animatedDrawable2.f32584e;
                    if (this.N != z12) {
                        this.N = z12;
                        if (z12) {
                            animatedDrawable2.h = false;
                            animatedDrawable2.K(0);
                            animatedDrawable2.N(iArr[0]);
                        } else {
                            animatedDrawable2.h = true;
                            animatedDrawable2.K(iArr[0]);
                            animatedDrawable2.N(0);
                        }
                        aj0Var.d();
                    }
                }
            }
        }
    }

    public final float c() {
        float measureText = this.F.measureText(this.f44112a.getText().toString());
        return Math.min(AndroidUtilities.dp(84.0f), (int) ((AndroidUtilities.lerp(AndroidUtilities.dpf2(16.0f), AndroidUtilities.dp(8.0f), p.a((measureText - AndroidUtilities.dp(40.0f)) / AndroidUtilities.dp(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    public final void d(String str, boolean z10, boolean z11) {
        this.f44116f.q(str, z11, true);
        this.f44117n.a(!TextUtils.isEmpty(str), z11);
        this.f44118r.a(z10, z11);
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
            f7 = this.h.f15395e;
        }
        RectF rectF = V;
        float f11 = 1.0f;
        Paint paint = this.f44115e;
        if (f7 > 0.0f && !this.K) {
            paint.setColor(j6.l1(ke.a.f14926a.getInterpolation(f7) * 0.09f, this.f44119s));
            rectF.set(0.0f, 0.0f, f10, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a2 = p.a(this.S, 0.0f, 1.0f) * AndroidUtilities.lerp(0.6f, 1.0f, f7);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        if (!this.f44121x) {
            f11 = this.f44117n.f15395e;
        }
        float f12 = f11 * this.S;
        int i10 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, f10, getHeight(), null);
        }
        super.dispatchDraw(canvas);
        if (i10 > 0) {
            canvas.save();
            float dpf2 = AndroidUtilities.dpf2(1.33f);
            float dpf22 = AndroidUtilities.dpf2(11.0f) + (f10 / 2.0f);
            float dpf23 = AndroidUtilities.dpf2(10.0f);
            float dpf24 = AndroidUtilities.dpf2(16.0f);
            p6 p6Var = this.f44116f;
            float max = Math.max(dpf24, p6Var.d() + AndroidUtilities.dp(8.0f));
            float dpf25 = AndroidUtilities.dpf2(9.333f);
            float dpf26 = AndroidUtilities.dpf2(8.0f);
            float f13 = max / 2.0f;
            float f14 = dpf24 / 2.0f;
            rectF.set((dpf22 - f13) - dpf2, (dpf23 - f14) - dpf2, f13 + dpf22 + dpf2, f14 + dpf23 + dpf2);
            canvas.scale(f12, f12, dpf22, dpf23);
            canvas.drawRoundRect(rectF, dpf25, dpf25, j6.Il);
            rectF.inset(dpf2, dpf2);
            if (this.f44121x) {
                if (this.L == null) {
                    this.L = getContext().getResources().getDrawable(R.drawable.star).mutate();
                }
                d1.d().f(0.0f, 0.0f, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(16.0f));
                canvas.drawRoundRect(rectF, dpf26, dpf26, d1.d().e());
                int dpf27 = (int) (dpf22 - AndroidUtilities.dpf2(7.0f));
                int dpf28 = (int) (dpf23 - AndroidUtilities.dpf2(7.0f));
                this.L.setBounds(dpf27, dpf28, AndroidUtilities.dp(14.0f) + dpf27, AndroidUtilities.dp(14.0f) + dpf28);
                this.L.draw(canvas);
            } else {
                paint.setColor(i0.a.d(this.f44118r.f15395e, j6.w0(null, j6.hl, false), j6.w0(null, j6.f20944r7, false)));
                canvas.drawRoundRect(rectF, dpf26, dpf26, paint);
                p6Var.m(rectF);
                p6Var.draw(canvas);
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
        this.f44112a.setTypeface(bold);
    }

    public final void f() {
        int i10 = this.f44120w;
        int i11 = this.f44119s;
        le.b bVar = this.h;
        int d = i0.a.d(bVar.f15395e, i10, i11);
        int d10 = i0.a.d(bVar.f15395e, this.f44120w, this.v);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        x9 x9Var = this.f44114c;
        if (x9Var != null && this.M) {
            x9Var.setColorFilter(porterDuffColorFilter);
            this.f44114c.invalidate();
        }
        this.f44113b.setColorFilter(porterDuffColorFilter);
        this.f44112a.setTextColor(d10);
    }

    public x9 getBackupImageView() {
        return this.f44114c;
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
            this.f44113b.setTranslationX(measuredWidth);
            this.f44112a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i10) {
        this.R = i10;
        this.Q = true;
    }

    public void setAttachScale(float f7) {
        TextView textView = this.f44112a;
        textView.setScaleX(f7);
        textView.setScaleY(f7);
        aj0 aj0Var = this.f44113b;
        aj0Var.setScaleX(f7);
        aj0Var.setScaleY(f7);
        x9 x9Var = this.f44114c;
        if (x9Var != null) {
            x9Var.setScaleX(f7);
            this.f44114c.setScaleY(f7);
        }
        this.S = f7;
        invalidate();
    }

    public void setPremiumBadge(boolean z10) {
        this.f44121x = z10;
    }

    public void setSkipDrawSelector(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            invalidate();
        }
    }

    public void setTabAnimation(a aVar) {
        this.f44122y = aVar;
        this.E = null;
        this.O = 0;
        this.P = 0L;
        this.f44113b.a();
        a(false);
    }

    public void setText(CharSequence charSequence) {
        this.f44112a.setText(charSequence);
    }

    public void setTextSizeDp(float f7) {
        float dp = AndroidUtilities.dp(f7);
        TextView textView = this.f44112a;
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
            this.f44113b.setTranslationX(measuredWidth);
            this.f44112a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
