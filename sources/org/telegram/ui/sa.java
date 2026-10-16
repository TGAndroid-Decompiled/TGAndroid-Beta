package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public abstract class sa extends FrameLayout {
    public float E;
    public ValueAnimator F;
    public boolean G;
    public boolean H;
    public final org.telegram.ui.Components.g6 I;
    public boolean f39736a;
    public final org.telegram.ui.ActionBar.c6 f39737b;
    public final org.telegram.ui.ActionBar.h5 f39738c;
    public final ImageView d;
    public final org.telegram.ui.Components.gq e;
    public final org.telegram.ui.Components.s6 f39739f;
    public final Drawable[] h;
    public float f39740n;
    public boolean f39741r;
    public ValueAnimator f39742s;
    public TLRPC.TL_username v;
    public boolean f39743w;
    public long f39744x;
    public final org.telegram.ui.Components.g6 f39745y;

    public sa(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f39736a = false;
        this.f39745y = new org.telegram.ui.Components.g6(this, 300L, org.telegram.ui.Components.es.f24465f);
        this.I = new org.telegram.ui.Components.g6(this, 400L, org.telegram.ui.Components.es.h);
        this.f39737b = c6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, c6Var));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        this.f39738c = h5Var;
        h5Var.setTextSize(16);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        h5Var.setEllipsizeByGradient(true);
        addView(h5Var, w7.z5.a(-2.0f, 70.0f, 9.0f, 0.0f, 50.0f, -1, 48));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        org.telegram.ui.Components.gq gqVar = new org.telegram.ui.Components.gq(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(1.35f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19784n6, c6Var));
        this.e = gqVar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(gqVar);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        gqVar.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        addView(imageView, w7.z5.a(14.0f, 70.0f, 35.0f, 0.0f, 0.0f, 14, 48));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(getContext(), false, true, true);
        this.f39739f = s6Var;
        s6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20005z6, c6Var));
        s6Var.b(0.4f, 120L, org.telegram.ui.Components.es.f24466g);
        s6Var.setTextSize(AndroidUtilities.dp(13.0f));
        addView(s6Var, w7.z5.a(-2.0f, 70.0f, 23.0f, 0.0f, 0.0f, -1, 48));
        Drawable[] drawableArr = {context.getDrawable(R.drawable.msg_link_1).mutate(), context.getDrawable(R.drawable.msg_link_2).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        va.H.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
        va.I.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.V8, c6Var));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z10, boolean z11, long j10) {
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        this.v = tL_username;
        this.f39743w = z10;
        this.f39744x = j10;
        invalidate();
        if (this.v == null) {
            this.G = false;
            this.H = false;
            return;
        }
        this.G = tL_username.active;
        if (j10 == 0 && tL_username.editable) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.H = z12;
        b(tL_username.username);
        boolean z14 = this.f39736a;
        org.telegram.ui.Components.s6 s6Var = this.f39739f;
        if (z14) {
            if (this.H) {
                i11 = R.string.UsernameProfileLinkEditable;
            } else if (this.G) {
                i11 = R.string.UsernameProfileLinkActive;
            } else {
                i11 = R.string.UsernameProfileLinkInactive;
            }
            s6Var.c(LocaleController.getString(i11), z11, !this.G);
        } else {
            if (this.H) {
                i10 = R.string.UsernameLinkEditable;
            } else if (this.G) {
                i10 = R.string.UsernameLinkActive;
            } else {
                i10 = R.string.UsernameLinkInactive;
            }
            s6Var.c(LocaleController.getString(i10), z11, !this.G);
        }
        if (!this.G && !this.H) {
            z13 = false;
        } else {
            z13 = true;
        }
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        float f7 = 0.0f;
        if (z11) {
            float f10 = this.E;
            if (z13) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new ra(this, 1));
            this.F.setDuration(120L);
            this.F.setInterpolator(org.telegram.ui.Components.es.f24466g);
            this.F.start();
            return;
        }
        if (z13) {
            f7 = 1.0f;
        }
        this.E = f7;
        int i12 = org.telegram.ui.ActionBar.g6.f20005z6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f39737b;
        int d = i0.a.d(this.E, org.telegram.ui.ActionBar.g6.w0(i12, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19784n6, c6Var));
        this.e.b(d);
        s6Var.setTextColor(d);
    }

    public final void b(String str) {
        if (this.H) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        org.telegram.ui.ActionBar.h5 h5Var = this.f39738c;
        if (isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.UsernameLinkPlaceholder));
            spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.H6, this.f39737b)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            h5Var.l(spannableStringBuilder, false);
            return;
        }
        h5Var.l("@" + str, false);
    }

    public String getUsernameEditable() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        super.onDraw(canvas);
        if (this.G) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float d = this.I.d(f7, false);
        int i10 = (d > 1.0f ? 1 : (d == 1.0f ? 0 : -1));
        Drawable[] drawableArr = this.h;
        if (i10 < 0) {
            f11 = 0.0f;
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f), va.I);
            drawableArr[1].setAlpha((int) ((1.0f - d) * 255.0f));
            f10 = 255.0f;
            drawableArr[1].setBounds(org.telegram.ui.Cells.c1.r(2, AndroidUtilities.dp(35.0f), drawableArr[1]), org.telegram.ui.Cells.c1.c(2, AndroidUtilities.dp(29.0f), drawableArr[1]), org.telegram.ui.Cells.c1.v(2, AndroidUtilities.dp(35.0f), drawableArr[1]), org.telegram.ui.Cells.c1.u(2, AndroidUtilities.dp(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (d > f11) {
            Paint paint = va.H;
            int i11 = (int) (d * f10);
            paint.setAlpha(i11);
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f) * d, paint);
            drawableArr[0].setAlpha(i11);
            drawableArr[0].setBounds(org.telegram.ui.Cells.c1.r(2, AndroidUtilities.dp(35.0f), drawableArr[0]), org.telegram.ui.Cells.c1.c(2, AndroidUtilities.dp(29.0f), drawableArr[0]), org.telegram.ui.Cells.c1.v(2, AndroidUtilities.dp(35.0f), drawableArr[0]), org.telegram.ui.Cells.c1.u(2, AndroidUtilities.dp(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        if (this.f39743w) {
            f12 = 1.0f;
        } else {
            f12 = f11;
        }
        float d10 = this.f39745y.d(f12, false);
        if (d10 > f11) {
            int alpha = org.telegram.ui.ActionBar.g6.f19722k0.getAlpha();
            org.telegram.ui.ActionBar.g6.f19722k0.setAlpha((int) (alpha * d10));
            canvas.drawRect(AndroidUtilities.dp(70.0f), getHeight() - 1, getWidth(), getHeight(), org.telegram.ui.ActionBar.g6.f19722k0);
            org.telegram.ui.ActionBar.g6.f19722k0.setAlpha(alpha);
        }
        Paint paint2 = va.J;
        paint2.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Uh, false));
        paint2.setAlpha((int) (paint2.getAlpha() * d));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getWidth() - AndroidUtilities.dp(37.0f), AndroidUtilities.dp(25.0f), getWidth() - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(27.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(0.3f), AndroidUtilities.dp(0.3f), paint2);
        rectF.set(getWidth() - AndroidUtilities.dp(37.0f), AndroidUtilities.dp(31.0f), getWidth() - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(33.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(0.3f), AndroidUtilities.dp(0.3f), paint2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), 1073741824));
    }

    public void setLoading(boolean z10) {
        float f7;
        if (this.f39741r != z10) {
            this.f39741r = z10;
            ValueAnimator valueAnimator = this.f39742s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.d.setVisibility(0);
            float f10 = this.f39740n;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f39742s = ofFloat;
            ofFloat.addUpdateListener(new ra(this, 0));
            this.f39742s.addListener(new ah.p0(27, this, z10));
            this.f39742s.setInterpolator(org.telegram.ui.Components.es.f24466g);
            this.f39742s.setDuration(200L);
            this.f39742s.start();
        }
    }
}
