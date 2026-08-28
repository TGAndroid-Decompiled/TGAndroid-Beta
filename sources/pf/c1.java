package pf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.p80;
public final class c1 extends LinearLayout {
    public final b6 f45588a;
    public final p80 f45589b;
    public final ImageReceiver f45590c;
    public final TextView d;
    public boolean f45591e;

    public c1(Context context, b6 b6Var) {
        super(context);
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f45590c = imageReceiver;
        this.f45588a = b6Var;
        setOrientation(1);
        p80 p80Var = new p80();
        this.f45589b = p80Var;
        int i14 = f6.G6;
        int v02 = f6.v0(i14, b6Var);
        p80Var.f(f6.l1(0.05f, v02), f6.l1(0.15f, v02), f6.l1(0.1f, v02), f6.l1(0.3f, v02));
        p80Var.j(4.0f);
        p80Var.f31590w.setStrokeWidth(AndroidUtilities.dp(1.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(4.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        textView.setGravity(i9);
        textView.setTextColor(f6.v0(i14, b6Var));
        textView.setTextSize(1, 16.0f);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 70;
        } else {
            i10 = 18;
        }
        if (z10) {
            i11 = 18;
        } else {
            i11 = 70;
        }
        addView(textView, e6.t(-1, -2, 55, i10, 10, i11, 4));
        TextView textView2 = new TextView(context);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setTextColor(f6.v0(f6.f23386z6, b6Var));
        textView2.setText(LocaleController.getString(R.string.BusinessProfileLocation));
        textView2.setTextSize(1, 13.0f);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i12 = 70;
        } else {
            i12 = 18;
        }
        if (z11) {
            i13 = 18;
        } else {
            i13 = 70;
        }
        addView(textView2, e6.t(-1, -2, 55, i12, 0, i13, 8));
        setWillNotDraw(false);
    }

    public final void a(TLRPC.TL_businessLocation tL_businessLocation, boolean z10) {
        if (tL_businessLocation != null) {
            this.d.setText(tL_businessLocation.address);
            if (tL_businessLocation.geo_point != null) {
                this.f45590c.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(tL_businessLocation.geo_point, AndroidUtilities.dp(44.0f), AndroidUtilities.dp(44.0f), 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), "44_44", this.f45589b, 0L, (String) null, (Object) null, 0);
            } else {
                this.f45590c.setImageBitmap((Drawable) null);
            }
        }
        this.f45591e = z10;
        setPadding(0, 0, 0, z10 ? 1 : 0);
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
        ImageReceiver imageReceiver = this.f45590c;
        imageReceiver.setImageCoords(f11, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(44.0f), AndroidUtilities.dp(44.0f));
        imageReceiver.draw(canvas);
        super.onDraw(canvas);
        if (this.f45591e) {
            Paint T0 = f6.T0("paintDivider", this.f45588a);
            if (T0 == null) {
                T0 = f6.f23121k0;
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f45589b && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
