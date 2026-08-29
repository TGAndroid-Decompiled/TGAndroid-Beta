package zg;

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
import cg.s1;
import i7.f6;
import i7.w;
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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.og0;
public final class b extends FrameLayout implements og0, vd.b {
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
    public e9 Q;
    public final TextView f50859a;
    public final aj0 f50860b;
    public t9 f50861c;
    public c6 d;
    public final Paint f50862e;
    public final n6 f50863f;
    public final vd.a h;
    public final vd.a f50864n;
    public final vd.a f50865r;
    public int f50866s;
    public int v;
    public int f50867w;
    public boolean f50868x;
    public a f50869y;

    public b(Context context) {
        super(context);
        this.f50862e = new Paint(1);
        this.h = new vd.a(0, this, ud.a.f49172a, 320L, false);
        jr jrVar = jr.h;
        this.f50864n = new vd.a(1, this, jrVar, 380L, false);
        this.f50865r = new vd.a(2, this, jrVar, 380L, false);
        this.O = 1.0f;
        ?? imageView = new ImageView(context);
        this.f50860b = imageView;
        addView((View) imageView, f6.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.f50859a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        this.B = new TextPaint(textView.getPaint());
        addView(textView, f6.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        n6 n6Var = new n6(false, false, false, false);
        this.f50863f = n6Var;
        n6Var.u(AndroidUtilities.bold());
        n6Var.setCallback(this);
        n6Var.f30862b = 17;
        n6Var.r(-1);
        n6Var.t(AndroidUtilities.dp(10.0f));
    }

    public static b b(Context context, c6 c6Var, a aVar, int i10) {
        b bVar = new b(context);
        bVar.d = c6Var;
        bVar.f50869y = aVar;
        bVar.f50859a.setText(LocaleController.getString(i10));
        bVar.a(false);
        bVar.f50860b.setLayoutParams(f6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f50867w = g6.v0(g6.cl, c6Var);
        bVar.f50866s = g6.v0(g6.al, c6Var);
        bVar.v = g6.v0(g6.bl, c6Var);
        bVar.f();
        return bVar;
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        if (i10 == 0) {
            f();
        }
        invalidate();
    }

    public final void a(boolean z10) {
        int i10;
        boolean z11;
        TLRPC.Document document;
        boolean z12 = this.h.f49506f;
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
                if (this.L != document.f22398id) {
                    t9 t9Var = this.f50861c;
                    ImageLocation forDocument = ImageLocation.getForDocument(document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(document);
                    if (!z13) {
                        svgDrawable = DocumentObject.getSvgThumb(document, g6.f23009a7, 1.0f);
                    }
                    t9Var.l(forDocument, "24_24_lastframe", forDocument2, "24_24_lastframe", svgDrawable, this.A);
                    this.L = document.f22398id;
                }
            } else {
                this.f50861c.b();
            }
            f();
            return;
        }
        a aVar = this.f50869y;
        if (aVar != null) {
            int i11 = aVar.f50856b;
            int i12 = aVar.f50855a;
            int i13 = aVar.f50857c;
            aj0 aj0Var = this.f50860b;
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
                if (this.J != z12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.K != i10) {
                    this.K = i10;
                    aj0Var.f(i10, 24, 24, null);
                    z11 = true;
                }
                if (z11) {
                    xi0 animatedDrawable = aj0Var.getAnimatedDrawable();
                    if (animatedDrawable != null) {
                        if (z12) {
                            animatedDrawable.N(this.f50869y.d);
                            if (animatedDrawable.X >= this.f50869y.f50858e - 2) {
                                animatedDrawable.L(0, false, false);
                            }
                            int i14 = animatedDrawable.X;
                            int i15 = this.f50869y.d;
                            if (i14 <= i15) {
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.K(i15);
                            }
                        } else {
                            int i16 = animatedDrawable.X;
                            a aVar2 = this.f50869y;
                            if (i16 >= aVar2.d - 1) {
                                animatedDrawable.N(aVar2.f50858e - 1);
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
            } else if (i12 != i11) {
                if (this.K != i10) {
                    this.K = i10;
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
                    aj0Var.f(this.f50869y.f50855a, 24, 24, null);
                }
                xi0 animatedDrawable2 = aj0Var.getAnimatedDrawable();
                if (animatedDrawable2 != null) {
                    int[] iArr = animatedDrawable2.f34737e;
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
                        aj0Var.d();
                    }
                }
            }
        }
    }

    public final float c() {
        float measureText = this.B.measureText(this.f50859a.getText().toString());
        return Math.min(AndroidUtilities.dp(84.0f), (int) ((AndroidUtilities.lerp(AndroidUtilities.dpf2(16.0f), AndroidUtilities.dp(8.0f), w.a((measureText - AndroidUtilities.dp(40.0f)) / AndroidUtilities.dp(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    public final void d(String str, boolean z10, boolean z11) {
        this.f50863f.q(str, z11, true);
        this.f50864n.a(!TextUtils.isEmpty(str), z11);
        this.f50865r.a(z10, z11);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width;
        float f9;
        boolean z10;
        if (this.C) {
            width = this.D;
        } else {
            width = getWidth();
        }
        float f10 = width;
        if (this.E) {
            f9 = this.F;
        } else {
            f9 = this.h.f49505e;
        }
        RectF rectF = R;
        float f11 = 1.0f;
        Paint paint = this.f50862e;
        if (f9 > 0.0f && !this.G) {
            paint.setColor(g6.l1(ud.a.f49172a.getInterpolation(f9) * 0.09f, this.f50866s));
            rectF.set(0.0f, 0.0f, f10, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a2 = w.a(this.O, 0.0f, 1.0f) * AndroidUtilities.lerp(0.6f, 1.0f, f9);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        if (!this.f50868x) {
            f11 = this.f50864n.f49505e;
        }
        float f12 = f11 * this.O;
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
            n6 n6Var = this.f50863f;
            float max = Math.max(dpf24, n6Var.d() + AndroidUtilities.dp(8.0f));
            float dpf25 = AndroidUtilities.dpf2(9.333f);
            float dpf26 = AndroidUtilities.dpf2(8.0f);
            float f13 = max / 2.0f;
            float f14 = dpf24 / 2.0f;
            rectF.set((dpf22 - f13) - dpf2, (dpf23 - f14) - dpf2, f13 + dpf22 + dpf2, f14 + dpf23 + dpf2);
            canvas.scale(f12, f12, dpf22, dpf23);
            canvas.drawRoundRect(rectF, dpf25, dpf25, g6.Il);
            rectF.inset(dpf2, dpf2);
            if (this.f50868x) {
                if (this.H == null) {
                    this.H = getContext().getResources().getDrawable(R.drawable.star).mutate();
                }
                s1.d().f(0.0f, 0.0f, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(16.0f));
                canvas.drawRoundRect(rectF, dpf26, dpf26, s1.d().e());
                int dpf27 = (int) (dpf22 - AndroidUtilities.dpf2(7.0f));
                int dpf28 = (int) (dpf23 - AndroidUtilities.dpf2(7.0f));
                this.H.setBounds(dpf27, dpf28, AndroidUtilities.dp(14.0f) + dpf27, AndroidUtilities.dp(14.0f) + dpf28);
                this.H.draw(canvas);
            } else {
                paint.setColor(i0.a.d(this.f50865r.f49505e, g6.w0(null, g6.hl, false), g6.w0(null, g6.f23311r7, false)));
                canvas.drawRoundRect(rectF, dpf26, dpf26, paint);
                n6Var.m(rectF);
                n6Var.draw(canvas);
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
        this.f50859a.setTypeface(bold);
    }

    public final void f() {
        int i10 = this.f50867w;
        int i11 = this.f50866s;
        vd.a aVar = this.h;
        int d = i0.a.d(aVar.f49505e, i10, i11);
        int d10 = i0.a.d(aVar.f49505e, this.f50867w, this.v);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        t9 t9Var = this.f50861c;
        if (t9Var != null && this.I) {
            t9Var.setColorFilter(porterDuffColorFilter);
            this.f50861c.invalidate();
        }
        this.f50860b.setColorFilter(porterDuffColorFilter);
        this.f50859a.setTextColor(d10);
    }

    public t9 getBackupImageView() {
        return this.f50861c;
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
            this.f50860b.setTranslationX(measuredWidth);
            this.f50859a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i10) {
        this.N = i10;
        this.M = true;
    }

    public void setAttachScale(float f9) {
        TextView textView = this.f50859a;
        textView.setScaleX(f9);
        textView.setScaleY(f9);
        aj0 aj0Var = this.f50860b;
        aj0Var.setScaleX(f9);
        aj0Var.setScaleY(f9);
        t9 t9Var = this.f50861c;
        if (t9Var != null) {
            t9Var.setScaleX(f9);
            this.f50861c.setScaleY(f9);
        }
        this.O = f9;
        invalidate();
    }

    public void setPremiumBadge(boolean z10) {
        this.f50868x = z10;
    }

    public void setSkipDrawSelector(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            invalidate();
        }
    }

    public void setTabAnimation(a aVar) {
        this.f50869y = aVar;
        this.A = null;
        this.K = 0;
        this.L = 0L;
        this.f50860b.a();
        a(false);
    }

    public void setText(CharSequence charSequence) {
        this.f50859a.setText(charSequence);
    }

    public void setTextSizeDp(float f9) {
        float dp = AndroidUtilities.dp(f9);
        TextView textView = this.f50859a;
        if (textView.getTextSize() != dp) {
            textView.setTextSize(1, f9);
            this.B.setTextSize(dp);
        }
    }

    public void setVisualWidth(float f9) {
        this.C = true;
        if (this.D != f9) {
            this.D = f9;
            float measuredWidth = (f9 - getMeasuredWidth()) / 2.0f;
            this.f50860b.setTranslationX(measuredWidth);
            this.f50859a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override
    public final void z(float f9, int i10) {
    }
}
