package vf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.k90;
public final class b1 extends LinearLayout {
    public final g6 f48992a;
    public final k90 f48993b;
    public final ImageReceiver f48994c;
    public final TextView d;
    public boolean f48995e;

    public b1(Context context, g6 g6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f48994c = imageReceiver;
        this.f48992a = g6Var;
        setOrientation(1);
        k90 k90Var = new k90();
        this.f48993b = k90Var;
        int i15 = k6.G6;
        int v02 = k6.v0(i15, g6Var);
        k90Var.f(k6.l1(0.05f, v02), k6.l1(0.15f, v02), k6.l1(0.1f, v02), k6.l1(0.3f, v02));
        k90Var.j(4.0f);
        k90Var.f28347w.setStrokeWidth(AndroidUtilities.dp(1.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10);
        textView.setTextColor(k6.v0(i15, g6Var));
        textView.setTextSize(1, 16.0f);
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i11 = 70;
        } else {
            i11 = 18;
        }
        if (z4) {
            i12 = 18;
        } else {
            i12 = 70;
        }
        addView(textView, c6.t(-1, -2, 55, i11, 10, i12, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setTextColor(k6.v0(k6.f22053z6, g6Var));
        textView2.setText(LocaleController.getString(R.string.BusinessProfileLocation));
        textView2.setTextSize(1, 13.0f);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i13 = 70;
        } else {
            i13 = 18;
        }
        if (z10) {
            i14 = 18;
        } else {
            i14 = 70;
        }
        addView(textView2, c6.t(-1, -2, 55, i13, 0, i14, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z4) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            if (tL_businessLocation.geo_point != null) {
                this.f48994c.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(tL_businessLocation.geo_point, AndroidUtilities.dp(44.0f), AndroidUtilities.dp(44.0f), 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), "44_44", this.f48993b, 0L, (String) null, (Object) null, 0);
            } else {
                this.f48994c.setImageBitmap((Drawable) null);
            }
        }
        this.f48995e = z4;
        setPadding(0, 0, 0, z4 ? 1 : 0);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int width;
        float f10;
        if (LocaleController.isRTL) {
            width = AndroidUtilities.dp(16.0f);
        } else {
            width = getWidth() - AndroidUtilities.dp(60.0f);
        }
        float f11 = width;
        ImageReceiver imageReceiver = this.f48994c;
        imageReceiver.setImageCoords(f11, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(44.0f), AndroidUtilities.dp(44.0f));
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        if (this.f48995e) {
            Paint T0 = k6.T0("paintDivider", this.f48992a);
            if (T0 == null) {
                T0 = k6.f21779k0;
            }
            Paint paint = T0;
            float f12 = 21.33f;
            if (LocaleController.isRTL) {
                f10 = 0.0f;
            } else {
                f10 = 21.33f;
            }
            float dp = AndroidUtilities.dp(f10);
            float measuredHeight = getMeasuredHeight() - 1;
            int width2 = getWidth();
            if (!LocaleController.isRTL) {
                f12 = 0.0f;
            }
            canvas.drawRect(dp, measuredHeight, width2 - AndroidUtilities.dp(f12), getMeasuredHeight(), paint);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f48993b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
