package zh;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import bi.pb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.xc;
public final class z6 extends View {
    public int f49151a;
    public int f49152b;
    public final Matrix f49153c;
    public final Paint[] d;
    public final org.telegram.ui.Components.d6 e;
    public boolean f49154f;
    public int h;
    public final Drawable[] f49155n;
    public final float[] f49156r;
    public boolean f49157s;
    public final Paint v;
    public final Path f49158w;
    public final xc f49159x;

    public z6(Context context) {
        super(context);
        this.f49153c = new Matrix();
        this.d = r0;
        this.e = new org.telegram.ui.Components.d6(this, 0L, 260L, wr.h);
        this.f49155n = new Drawable[2];
        this.f49156r = new float[2];
        Paint paint = new Paint(1);
        this.v = paint;
        this.f49158w = new Path();
        this.f49159x = new xc(this, 0.6f, 5.0f);
        Paint[] paintArr = {new Paint(1), new Paint(1)};
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(-1);
    }

    public final void a(boolean z10, TL_stories.StoryItem storyItem, boolean z11) {
        ArrayList<TLRPC.PrivacyRule> arrayList;
        this.f49157s = z10;
        this.f49154f = true;
        int i10 = 0;
        if (storyItem == null) {
            this.f49154f = false;
        } else {
            boolean z12 = storyItem.close_friends;
            org.telegram.ui.Components.d6 d6Var = this.e;
            if (z12) {
                c(15.0f, R.drawable.msg_stories_closefriends);
                d(-7808710, -13781445);
                d6Var.f(z11, true);
            } else if (storyItem.contacts) {
                c(17.33f, R.drawable.msg_folders_private);
                d(-3905294, -6923014);
                d6Var.f(z11, true);
            } else if (!storyItem.selected_contacts && (!z10 || ((arrayList = storyItem.privacy) != null && !arrayList.isEmpty()))) {
                if (z10) {
                    c(17.33f, R.drawable.msg_folders_channels);
                    d(-15292942, -15630089);
                    d6Var.f(z11, true);
                } else {
                    this.f49154f = false;
                }
            } else {
                c(17.33f, R.drawable.msg_folders_groups);
                d(-18621, -618956);
                d6Var.f(z11, true);
            }
        }
        if (!this.f49154f) {
            i10 = 8;
        }
        setVisibility(i10);
        invalidate();
    }

    public final void b(boolean z10, h5 h5Var, boolean z11) {
        pb pbVar;
        this.f49157s = z10;
        this.f49154f = true;
        int i10 = 0;
        if (h5Var != null && (pbVar = h5Var.f48473c.E0) != null) {
            int i11 = pbVar.f3415a;
            org.telegram.ui.Components.d6 d6Var = this.e;
            if (i11 == 1) {
                c(15.0f, R.drawable.msg_stories_closefriends);
                d(-7808710, -13781445);
                d6Var.f(z11, !z11);
            } else if (i11 == 2) {
                c(17.33f, R.drawable.msg_folders_private);
                d(-3905294, -6923014);
                d6Var.f(z11, !z11);
            } else if (i11 == 3) {
                c(17.33f, R.drawable.msg_folders_groups);
                d(-18621, -618956);
                d6Var.f(z11, !z11);
            } else if (z10) {
                c(17.33f, R.drawable.msg_folders_channels);
                d(-15292942, -15630089);
                d6Var.f(z11, !z11);
            } else {
                this.f49154f = false;
            }
        } else {
            this.f49154f = false;
        }
        if (!this.f49154f) {
            i10 = 8;
        }
        setVisibility(i10);
        invalidate();
    }

    public final void c(float f7, int i10) {
        if (i10 == R.drawable.msg_stories_closefriends) {
            setContentDescription(LocaleController.getString(R.string.StoryPrivacyOptionCloseFriends));
        } else if (i10 == R.drawable.msg_folders_private) {
            setContentDescription(LocaleController.getString(R.string.StoryPrivacyOptionContacts));
        } else if (i10 == R.drawable.msg_folders_groups) {
            setContentDescription(LocaleController.getString(R.string.StoryPrivacyOptionSelectedContacts));
        } else if (i10 == R.drawable.msg_folders_channels) {
            setContentDescription(LocaleController.getString(R.string.StoryPrivacyOptionEveryone));
        }
        Drawable[] drawableArr = this.f49155n;
        Drawable drawable = drawableArr[0];
        drawableArr[1] = drawable;
        float[] fArr = this.f49156r;
        fArr[1] = fArr[0];
        if (drawable != null && i10 == this.h) {
            return;
        }
        Resources resources = getContext().getResources();
        this.h = i10;
        drawableArr[0] = resources.getDrawable(i10).mutate();
        drawableArr[0].setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        fArr[0] = AndroidUtilities.dpf2(f7);
        invalidate();
    }

    public final void d(int i10, int i11) {
        Paint[] paintArr = this.d;
        paintArr[1].setShader(paintArr[0].getShader());
        if (this.f49151a == i10 && this.f49152b == i11) {
            return;
        }
        this.f49151a = i10;
        this.f49152b = i11;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(23.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = this.f49153c;
        matrix.reset();
        matrix.postTranslate(0.0f, AndroidUtilities.dp(8.0f));
        linearGradient.setLocalMatrix(matrix);
        paintArr[0].setShader(linearGradient);
        invalidate();
    }

    public float getCenterX() {
        int dp;
        float width = (getWidth() / 2.0f) + getX();
        if (this.f49157s) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp(14.0f);
        }
        return width + dp;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dpf2;
        float dpf22;
        char c10;
        float f7;
        float f10;
        float centerX;
        float centerX2;
        if (!this.f49154f) {
            return;
        }
        if (this.f49157s) {
            dpf2 = 0.0f;
        } else {
            dpf2 = AndroidUtilities.dpf2(7.0f);
        }
        if (this.f49157s) {
            dpf22 = AndroidUtilities.dpf2(43.0f);
        } else {
            dpf22 = AndroidUtilities.dpf2(23.66f);
        }
        float dpf23 = AndroidUtilities.dpf2(23.66f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(com.google.android.gms.internal.vision.e2.A(getWidth(), dpf22, 2.0f, dpf2), (getHeight() - dpf23) / 2.0f, org.telegram.messenger.a2.a(getWidth(), dpf22, 2.0f, dpf2), (getHeight() + dpf23) / 2.0f);
        float a2 = this.f49159x.a(0.075f);
        canvas.save();
        canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
        float d = this.e.d(0.0f, false);
        Paint[] paintArr = this.d;
        if (d > 0.0f) {
            paintArr[1].setAlpha(255);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paintArr[1]);
        }
        if (d < 1.0f) {
            paintArr[0].setAlpha((int) ((1.0f - d) * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paintArr[0]);
        }
        float abs = Math.abs(d - 0.5f) + 0.5f;
        Drawable[] drawableArr = this.f49155n;
        Drawable drawable = drawableArr[1];
        float[] fArr = this.f49156r;
        if (drawable != null && d > 0.5f) {
            if (this.f49157s) {
                centerX2 = AndroidUtilities.dpf2(14.66f) + rectF.left;
            } else {
                centerX2 = rectF.centerX();
            }
            float centerY = rectF.centerY();
            float f11 = (fArr[1] / 2.0f) * abs;
            f10 = 0.5f;
            c10 = 0;
            f7 = 12.0f;
            drawableArr[1].setBounds((int) em.c(fArr[1], 2.0f, abs, centerX2), (int) (centerY - f11), (int) (f11 + centerX2), (int) a4.a.e(fArr[1], 2.0f, abs, rectF.centerY()));
            drawableArr[1].draw(canvas);
        } else {
            c10 = 0;
            f7 = 12.0f;
            f10 = 0.5f;
        }
        if (drawableArr[c10] != null && d <= f10) {
            if (this.f49157s) {
                centerX = AndroidUtilities.dpf2(14.66f) + rectF.left;
            } else {
                centerX = rectF.centerX();
            }
            float centerY2 = rectF.centerY();
            float f12 = (fArr[c10] / 2.0f) * abs;
            drawableArr[c10].setBounds((int) em.c(fArr[c10], 2.0f, abs, centerX), (int) (centerY2 - f12), (int) (f12 + centerX), (int) a4.a.e(fArr[c10], 2.0f, abs, rectF.centerY()));
            drawableArr[c10].draw(canvas);
        }
        if (this.f49157s) {
            Path path = this.f49158w;
            path.rewind();
            path.moveTo(rectF.right - AndroidUtilities.dpf2(15.66f), rectF.centerY() - AndroidUtilities.dpf2(1.33f));
            path.lineTo(rectF.right - AndroidUtilities.dpf2(f7), AndroidUtilities.dpf2(2.33f) + rectF.centerY());
            path.lineTo(rectF.right - AndroidUtilities.dpf2(8.16f), rectF.centerY() - AndroidUtilities.dpf2(1.33f));
            float dpf24 = AndroidUtilities.dpf2(1.33f);
            Paint paint = this.v;
            paint.setStrokeWidth(dpf24);
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.f49159x.c(z10);
    }
}
