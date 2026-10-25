package qh;

import a8.ee;
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
import java.util.HashSet;
import oe.d;
import oe.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.qg0;
import tg.b1;
public final class b extends FrameLayout implements qg0, d, p6 {
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
    public j9 U;
    public final TextView f47051a;
    public final ak0 f47052b;
    public y9 f47053c;
    public u6 d;
    public final Paint e;
    public final r6 f47054f;
    public final oe.b h;
    public final oe.b f47055n;
    public final oe.b f47056r;
    public int f47057s;
    public int v;
    public int f47058w;
    public boolean f47059x;
    public a f47060y;

    public b(Context context) {
        super(context);
        this.e = new Paint(1);
        this.h = new oe.b(0, this, ne.a.f18779a, 320L, false);
        ds dsVar = ds.h;
        this.f47055n = new oe.b(1, this, dsVar, 380L, false);
        this.f47056r = new oe.b(2, this, dsVar, 380L, false);
        this.S = 1.0f;
        ?? imageView = new ImageView(context);
        this.f47052b = imageView;
        addView((View) imageView, gb1.h(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.f47051a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        this.F = new TextPaint(textView.getPaint());
        addView(textView, gb1.h(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        r6 r6Var = new r6(false, false, false);
        this.f47054f = r6Var;
        r6Var.x(AndroidUtilities.bold());
        r6Var.setCallback(this);
        r6Var.f32119b = 17;
        r6Var.u(-1);
        r6Var.w(AndroidUtilities.dp(10.0f));
    }

    public static b c(Context context, u6 u6Var, a aVar, int i10) {
        b bVar = new b(context);
        bVar.d = u6Var;
        bVar.f47060y = aVar;
        bVar.f47051a.setText(LocaleController.getString(i10));
        bVar.b(false);
        bVar.f47052b.setLayoutParams(gb1.h(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f47058w = y6.w0(y6.cl, u6Var);
        bVar.f47057s = y6.w0(y6.al, u6Var);
        bVar.v = y6.w0(y6.bl, u6Var);
        bVar.a();
        return bVar;
    }

    @Override
    public final void E(int i10, float f7, float f10, e eVar) {
        if (i10 == 0) {
            a();
        }
        invalidate();
    }

    public final void a() {
        int i10 = this.f47058w;
        int i11 = this.f47057s;
        oe.b bVar = this.h;
        int f7 = i0.a.f(bVar.e, i10, i11);
        int f10 = i0.a.f(bVar.e, this.f47058w, this.v);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(f7, PorterDuff.Mode.SRC_IN);
        y9 y9Var = this.f47053c;
        if (y9Var != null && this.M) {
            y9Var.setColorFilter(porterDuffColorFilter);
            this.f47053c.invalidate();
        }
        this.f47052b.setColorFilter(porterDuffColorFilter);
        this.f47051a.setTextColor(f10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(y6.cl));
        hashSet.add(Integer.valueOf(y6.al));
        hashSet.add(Integer.valueOf(y6.bl));
    }

    public final void b(boolean z10) {
        int i10;
        boolean z11;
        TLRPC.Document document;
        boolean z12 = this.h.f19327f;
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
                if (this.P != document.f22033id) {
                    y9 y9Var = this.f47053c;
                    ImageLocation forDocument = ImageLocation.getForDocument(document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(document);
                    if (!z13) {
                        svgDrawable = DocumentObject.getSvgThumb(document, y6.f23297a7, 1.0f);
                    }
                    y9Var.l(forDocument, "24_24_lastframe", forDocument2, "24_24_lastframe", svgDrawable, this.E);
                    this.P = document.f22033id;
                }
            } else {
                this.f47053c.b();
            }
            a();
            return;
        }
        a aVar = this.f47060y;
        if (aVar != null) {
            int i11 = aVar.f47049b;
            int i12 = aVar.f47048a;
            int i13 = aVar.f47050c;
            ak0 ak0Var = this.f47052b;
            if (i13 != -1) {
                ak0Var.setImageResource(i13);
                a();
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
                    ak0Var.f(i10, 24, 24, null);
                    z11 = true;
                }
                if (z11) {
                    xj0 animatedDrawable = ak0Var.getAnimatedDrawable();
                    if (animatedDrawable != null) {
                        if (z12) {
                            animatedDrawable.P(this.f47060y.d);
                            if (animatedDrawable.f34733a0 >= this.f47060y.e - 2) {
                                animatedDrawable.N(0, false, false);
                            }
                            int i14 = animatedDrawable.f34733a0;
                            int i15 = this.f47060y.d;
                            if (i14 <= i15) {
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.M(i15);
                            }
                        } else {
                            int i16 = animatedDrawable.f34733a0;
                            a aVar2 = this.f47060y;
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
                    ak0Var.f(i10, 24, 24, null);
                    ak0Var.getAnimatedDrawable().h = false;
                    if (z10) {
                        ak0Var.getAnimatedDrawable().M(0);
                        ak0Var.d();
                        return;
                    }
                    ak0Var.getAnimatedDrawable().T(0.99f, true);
                }
            } else {
                if (ak0Var.getAnimatedDrawable() == null) {
                    ak0Var.f(this.f47060y.f47048a, 24, 24, null);
                }
                xj0 animatedDrawable2 = ak0Var.getAnimatedDrawable();
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
                        ak0Var.d();
                    }
                }
            }
        }
    }

    public final float d() {
        float measureText = this.F.measureText(this.f47051a.getText().toString());
        return Math.min(AndroidUtilities.dp(84.0f), (int) ((AndroidUtilities.lerp(AndroidUtilities.dpf2(16.0f), AndroidUtilities.dp(8.0f), ee.a((measureText - AndroidUtilities.dp(40.0f)) / AndroidUtilities.dp(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
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
            paint.setColor(y6.o1(ne.a.f18779a.getInterpolation(f7) * 0.09f, this.f47057s));
            rectF.set(0.0f, 0.0f, f10, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a2 = ee.a(this.S, 0.0f, 1.0f) * AndroidUtilities.lerp(0.6f, 1.0f, f7);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        if (!this.f47059x) {
            f11 = this.f47055n.e;
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
            r6 r6Var = this.f47054f;
            float max = Math.max(dpf24, r6Var.c() + AndroidUtilities.dp(8.0f));
            float dpf25 = AndroidUtilities.dpf2(9.333f);
            float dpf26 = AndroidUtilities.dpf2(8.0f);
            float f13 = max / 2.0f;
            float f14 = dpf24 / 2.0f;
            rectF.set((dpf22 - f13) - dpf2, (dpf23 - f14) - dpf2, f13 + dpf22 + dpf2, f14 + dpf23 + dpf2);
            canvas.scale(f12, f12, dpf22, dpf23);
            canvas.drawRoundRect(rectF, dpf25, dpf25, y6.Nl);
            rectF.inset(dpf2, dpf2);
            if (this.f47059x) {
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
                paint.setColor(i0.a.f(this.f47056r.e, y6.x0(null, y6.hl, false), y6.x0(null, y6.f23613r7, false)));
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

    public final void e(String str, boolean z10, boolean z11) {
        this.f47054f.t(str, z11, true);
        this.f47055n.a(!TextUtils.isEmpty(str), z11);
        this.f47056r.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        Typeface bold;
        this.h.a(z10, z11);
        b(z11);
        if (z10) {
            bold = AndroidUtilities.getTypeface("fonts/rextrabold.ttf");
        } else {
            bold = AndroidUtilities.bold();
        }
        this.f47051a.setTypeface(bold);
    }

    public final void g() {
        this.f47058w = y6.w0(y6.cl, this.d);
        this.f47057s = y6.w0(y6.al, this.d);
        this.v = y6.w0(y6.bl, this.d);
        a();
        invalidate();
    }

    public y9 getBackupImageView() {
        return this.f47053c;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.Q) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) d()) + this.R, 1073741824), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.G) {
            float measuredWidth = (this.H - getMeasuredWidth()) / 2.0f;
            this.f47052b.setTranslationX(measuredWidth);
            this.f47051a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i10) {
        this.R = i10;
        this.Q = true;
    }

    public void setAttachScale(float f7) {
        TextView textView = this.f47051a;
        textView.setScaleX(f7);
        textView.setScaleY(f7);
        ak0 ak0Var = this.f47052b;
        ak0Var.setScaleX(f7);
        ak0Var.setScaleY(f7);
        y9 y9Var = this.f47053c;
        if (y9Var != null) {
            y9Var.setScaleX(f7);
            this.f47053c.setScaleY(f7);
        }
        this.S = f7;
        invalidate();
    }

    public void setPremiumBadge(boolean z10) {
        this.f47059x = z10;
    }

    public void setSkipDrawSelector(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            invalidate();
        }
    }

    public void setTabAnimation(a aVar) {
        this.f47060y = aVar;
        this.E = null;
        this.O = 0;
        this.P = 0L;
        this.f47052b.a();
        b(false);
    }

    public void setText(CharSequence charSequence) {
        this.f47051a.setText(charSequence);
    }

    public void setTextSizeDp(float f7) {
        float dp = AndroidUtilities.dp(f7);
        TextView textView = this.f47051a;
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
            this.f47052b.setTranslationX(measuredWidth);
            this.f47051a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override
    public final void updateColors() {
        if (this.f47058w == y6.w0(y6.cl, this.d) && this.f47057s == y6.w0(y6.al, this.d) && this.v == y6.w0(y6.bl, this.d)) {
            return;
        }
        g();
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
